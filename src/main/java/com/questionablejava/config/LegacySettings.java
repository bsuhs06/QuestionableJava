package com.questionablejava.config;

import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class LegacySettings {
    private final Properties properties = new Properties();
    private final Hashtable<String, String> cache = new Hashtable<String, String>();
    private final Vector<String> warnings = new Vector<String>();
    private final Date loadedAt = new Date();

    public static LegacySettings loadDefault() {
        LegacySettings settings = new LegacySettings();
        settings.properties.setProperty("title", "Questionable Java Report");
        settings.properties.setProperty("owner", "legacy-team");
        settings.properties.setProperty("currency", "USD");
        settings.properties.setProperty("separator", "========================================");
        settings.properties.setProperty("minimumScore", "25");
        settings.properties.setProperty("prefix", "LEGACY");
        settings.cache.put("env", "dev");
        settings.cache.put("profile", "broken-but-working");
        settings.warnings.add("This project intentionally uses old Java idioms.");
        settings.warnings.add("The code should be upgraded to modern language features.");
        return settings;
    }

    public String get(String key, String fallback) {
        String value = properties.getProperty(key);
        if (value == null) {
            return fallback;
        }
        return value;
    }

    public int getInt(String key, int fallback) {
        String value = properties.getProperty(key);
        if (value == null) {
            return fallback;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            warnings.add("Invalid number for key " + key + ": " + value);
            return fallback;
        }
    }

    public boolean isEnabled(String key) {
        return "true".equalsIgnoreCase(properties.getProperty(key));
    }

    public Properties asProperties() {
        Properties copy = new Properties();
        copy.putAll(properties);
        return copy;
    }

    public Vector<String> getWarnings() {
        return warnings;
    }

    public Hashtable<String, String> getCache() {
        return cache;
    }

    public Date getLoadedAt() {
        return loadedAt;
    }

    public void set(String key, String value) {
        if (key != null && value != null) {
            properties.setProperty(key, value);
        }
    }

    public String banner() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(get("separator", "---")).append('\n');
        buffer.append(get("title", "Untitled")).append('\n');
        buffer.append("Loaded: ").append(loadedAt).append('\n');
        buffer.append("Owner: ").append(get("owner", "unknown")).append('\n');
        buffer.append(get("separator", "---"));
        return buffer.toString();
    }
}
