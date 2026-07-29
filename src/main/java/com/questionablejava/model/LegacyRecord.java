package com.questionablejava.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LegacyRecord {
    private int id;
    private String name;
    private String category;
    private int score;
    private boolean active;
    private Date createdAt;
    private final List<String> tags = new ArrayList<String>();

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
        if (tag != null && tag.length() > 0) {
            tags.add(tag);
        }
    }

    public String describe() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("LegacyRecord[");
        buffer.append("id=").append(id).append(',');
        buffer.append("name=").append(name).append(',');
        buffer.append("category=").append(category).append(',');
        buffer.append("score=").append(score).append(',');
        buffer.append("active=").append(active).append(',');
        buffer.append("createdAt=").append(format(createdAt)).append(',');
        buffer.append("tags=").append(tags);
        buffer.append(']');
        return buffer.toString();
    }

    private String format(Date date) {
        if (date == null) {
            return "null";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    public LegacyRecord copy() {
        LegacyRecord copy = new LegacyRecord(id, name, category, score, active, createdAt == null ? null : new Date(createdAt.getTime()));
        copy.tags.addAll(tags);
        return copy;
    }

    public boolean hasTag(String value) {
        if (value == null) {
            return false;
        }
        for (String tag : tags) {
            if (value.equalsIgnoreCase(tag)) {
                return true;
            }
        }
        return false;
    }

    public int tagCount() {
        return tags.size();
    }

    public void mutateLegacyState() {
        if (name != null && name.length() > 0) {
            name = name.trim();
        }
        if (category != null && category.length() > 0) {
            category = category.trim();
        }
        if (score < 0) {
            score = 0;
        }
    }
}
