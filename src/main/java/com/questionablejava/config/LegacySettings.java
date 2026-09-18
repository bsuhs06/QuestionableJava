package com.questionablejava.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class LegacySettings {
    private final Properties properties = new Properties();
    private final Map<String, String> cache = new LinkedHashMap<>();
    private final List<String> warnings = new ArrayList<>();
    private final Date loadedAt = new Date();

    public static LegacySettings loadDefault() {
        var settings = new LegacySettings();
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
        return properties.getProperty(key, fallback);
    }

    public int getInt(String key, int fallback) {
        var value = properties.getProperty(key);
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
        var copy = new Properties();
        copy.putAll(properties);
        return copy;
    }

    public List<String> getWarnings() {
        return warnings;
    }

    public Map<String, String> getCache() {
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
        var separator = get("separator", "---");
        return String.join("\n",
                separator,
                get("title", "Untitled"),
                "Loaded: " + loadedAt,
                "Owner: " + get("owner", "unknown"),
                separator);
    }
}
