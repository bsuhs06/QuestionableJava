package com.questionablejava.config;

import org.junit.Assert;
import org.junit.Test;

public class LegacySettingsTest {

    @Test
    public void loadsDefaultsAndBuildsBanner() {
        LegacySettings settings = LegacySettings.loadDefault();

        Assert.assertEquals("Questionable Java Report", settings.get("title", "missing"));
        Assert.assertEquals(25, settings.getInt("minimumScore", 0));
        Assert.assertEquals("fallback", settings.get("missing", "fallback"));
        Assert.assertTrue(settings.banner().contains("Questionable Java Report"));
        Assert.assertFalse(settings.getWarnings().isEmpty());
    }

    @Test
    public void returnsFallbackForBadIntegers() {
        LegacySettings settings = LegacySettings.loadDefault();
        settings.set("minimumScore", "not-a-number");

        Assert.assertEquals(99, settings.getInt("minimumScore", 99));
        Assert.assertTrue(settings.getWarnings().size() >= 3);
    }
}