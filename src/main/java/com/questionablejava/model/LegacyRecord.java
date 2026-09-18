package com.questionablejava.model;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LegacyRecord {
    private static final DateTimeFormatter TIMESTAMP_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private int id;
    private String name;
    private String category;
    private int score;
    private boolean active;
    private Date createdAt;
    private final List<String> tags = new ArrayList<>();

    public LegacyRecord(int id, String name, String category, int score, boolean active, Date createdAt) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.score = score;
        this.active = active;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getTags() {
        return tags;
    }

    public void addTag(String tag) {
        if (tag != null && !tag.isEmpty()) {
            tags.add(tag);
        }
    }

    public String describe() {
        return "LegacyRecord[id=%d,name=%s,category=%s,score=%d,active=%b,createdAt=%s,tags=%s]"
                .formatted(id, name, category, score, active, format(createdAt), tags);
    }

    private static String format(Date date) {
        if (date == null) {
            return "null";
        }
        return TIMESTAMP_FORMAT.format(date.toInstant().atZone(ZoneId.systemDefault()));
    }

    public LegacyRecord copy() {
        var copy = new LegacyRecord(id, name, category, score, active, createdAt == null ? null : new Date(createdAt.getTime()));
        copy.tags.addAll(tags);
        return copy;
    }

    public boolean hasTag(String value) {
        if (value == null) {
            return false;
        }
        return tags.stream().anyMatch(value::equalsIgnoreCase);
    }

    public int tagCount() {
        return tags.size();
    }

    public void mutateLegacyState() {
        if (name != null) {
            name = name.strip();
        }
        if (category != null) {
            category = category.strip();
        }
        if (score < 0) {
            score = 0;
        }
    }
}
