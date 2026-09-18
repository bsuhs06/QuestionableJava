package com.questionablejava.process;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.model.LegacyRecord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LegacyProcessor {
    private final LegacySettings settings;

    public LegacyProcessor(LegacySettings settings) {
        this.settings = settings;
    }

    public List<LegacyRecord> process(List<LegacyRecord> input) {
        return input.stream()
                .map(this::processOne)
                .filter(record -> record.getName() != null && !record.getName().isEmpty())
                .map(this::adjustOne)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private LegacyRecord processOne(LegacyRecord record) {
        var copy = record.copy();
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
        var base = record.getScore() + record.tagCount() + (record.isActive() ? 7 : -3);
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
        var trimmed = value.strip();
        if (trimmed.isEmpty()) {
            return trimmed;
        }
        return trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1).toLowerCase();
    }

    private int clamp(int value) {
        return Math.clamp(value, 0, 100);
    }

    private LegacyRecord adjustOne(LegacyRecord record) {
        var copy = record.copy();
        var score = copy.getScore();
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
        return switch (category.toLowerCase()) {
            case "engineering" -> 8;
            case "data" -> 6;
            case "platform" -> 5;
            default -> 2;
        };
    }

    private int legacyPenalty(String name) {
        if (name == null) {
            return 0;
        }
        var lower = name.toLowerCase();
        if (lower.contains("drift")) {
            return -2;
        }
        if (lower.contains("echo")) {
            return -1;
        }
        return 0;
    }

    private int legacyTagContribution(List<String> tags) {
        return tags.stream()
                .filter(Objects::nonNull)
                .mapToInt(tag -> tag.length() > 6 ? 2 : 1)
                .sum();
    }

    public Comparator<LegacyRecord> getComparator() {
        return Comparator.<LegacyRecord>comparingInt(LegacyRecord::getScore).reversed()
                .thenComparing(LegacyRecord::getName,
                        Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
    }

    public List<LegacyRecord> sort(List<LegacyRecord> input) {
        return input.stream().sorted(getComparator()).collect(Collectors.toCollection(ArrayList::new));
    }

    public String summary(List<LegacyRecord> input) {
        var active = input.stream().filter(LegacyRecord::isActive).count();
        var high = input.stream().filter(record -> record.getScore() >= 60).count();
        return "active=%d,inactive=%d,highScore=%d".formatted(active, input.size() - active, high);
    }
}
