package com.questionablejava.process;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.model.LegacyRecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LegacyProcessor {
    private final LegacySettings settings;

    public LegacyProcessor(LegacySettings settings) {
        this.settings = settings;
    }

    public List<LegacyRecord> process(List<LegacyRecord> input) {
        List<LegacyRecord> processed = new ArrayList<LegacyRecord>();
        for (LegacyRecord record : input) {
            processed.add(processOne(record));
        }
        processed = tidy(processed);
        processed = adjustScores(processed);
        return processed;
    }

    private LegacyRecord processOne(LegacyRecord record) {
        LegacyRecord copy = record.copy();
        copy.mutateLegacyState();
        copy.setName(pretty(copy.getName()));
        copy.setCategory(pretty(copy.getCategory()));
        copy.setScore(applyLegacyMath(copy));
        if (copy.isActive()) {
            copy.addTag("active");
        } else {
            copy.addTag("inactive");
        }
        if (copy.getScore() > settings.getInt("minimumScore", 25)) {
            copy.addTag("qualified");
        } else {
            copy.addTag("needs-review");
        }
        return copy;
    }

    private int applyLegacyMath(LegacyRecord record) {
        int base = record.getScore();
        base = base + record.tagCount();
        if (record.isActive()) {
            base = base + 7;
        } else {
            base = base - 3;
        }
        if (record.getName() != null && record.getName().length() > 8) {
            base = base + 2;
        }
        if (record.getCategory() != null && record.getCategory().indexOf('o') >= 0) {
            base = base + 1;
        }
        return clamp(base);
    }

    private String pretty(String value) {
        if (value == null) {
            return "";
        }
        String trimmed = value.trim();
        if (trimmed.length() == 0) {
            return trimmed;
        }
        return trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1).toLowerCase();
    }

    private int clamp(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 100) {
            return 100;
        }
        return value;
    }

    private List<LegacyRecord> tidy(List<LegacyRecord> input) {
        List<LegacyRecord> output = new ArrayList<LegacyRecord>();
        for (LegacyRecord record : input) {
            if (record.getName() != null && record.getName().length() > 0) {
                output.add(record);
            }
        }
        return output;
    }

    private List<LegacyRecord> adjustScores(List<LegacyRecord> input) {
        List<LegacyRecord> output = new ArrayList<LegacyRecord>();
        for (LegacyRecord record : input) {
            output.add(adjustOne(record));
        }
        return output;
    }

    private LegacyRecord adjustOne(LegacyRecord record) {
        LegacyRecord copy = record.copy();
        int score = copy.getScore();
        score = score + legacyBonus(copy.getCategory());
        score = score + legacyPenalty(copy.getName());
        score = score + legacyTagContribution(copy.getTags());
        copy.setScore(clamp(score));
        return copy;
    }

    private int legacyBonus(String category) {
        if (category == null) {
            return 0;
        }
        if (category.equalsIgnoreCase("engineering")) {
            return 8;
        }
        if (category.equalsIgnoreCase("data")) {
            return 6;
        }
        if (category.equalsIgnoreCase("platform")) {
            return 5;
        }
        return 2;
    }

    private int legacyPenalty(String name) {
        if (name == null) {
            return 0;
        }
        if (name.toLowerCase().indexOf("drift") >= 0) {
            return -2;
        }
        if (name.toLowerCase().indexOf("echo") >= 0) {
            return -1;
        }
        return 0;
    }

    private int legacyTagContribution(List<String> tags) {
        int total = 0;
        for (String tag : tags) {
            if (tag == null) {
                continue;
            }
            if (tag.length() > 6) {
                total = total + 2;
            } else {
                total = total + 1;
            }
        }
        return total;
    }

    public Comparator<LegacyRecord> getComparator() {
        return new Comparator<LegacyRecord>() {
            public int compare(LegacyRecord left, LegacyRecord right) {
                int scoreCompare = right.getScore() - left.getScore();
                if (scoreCompare != 0) {
                    return scoreCompare;
                }
                if (left.getName() == null && right.getName() == null) {
                    return 0;
                }
                if (left.getName() == null) {
                    return 1;
                }
                if (right.getName() == null) {
                    return -1;
                }
                return left.getName().compareToIgnoreCase(right.getName());
            }
        };
    }

    public List<LegacyRecord> sort(List<LegacyRecord> input) {
        List<LegacyRecord> copy = new ArrayList<LegacyRecord>(input);
        Collections.sort(copy, getComparator());
        return copy;
    }

    public String summary(List<LegacyRecord> input) {
        int active = 0;
        int inactive = 0;
        int high = 0;
        for (LegacyRecord record : input) {
            if (record.isActive()) {
                active++;
            } else {
                inactive++;
            }
            if (record.getScore() >= 60) {
                high++;
            }
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append("active=").append(active).append(',');
        buffer.append("inactive=").append(inactive).append(',');
        buffer.append("highScore=").append(high);
        return buffer.toString();
    }
}
