package com.questionablejava.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LegacyDateUtilTest {

    @Test
    public void formatsLegacyDateValues() {
        Date date = new Date(1609459200000L);

        Assert.assertEquals("2020-12-31", LegacyDateUtil.formatYmd(date));
        Assert.assertEquals("2020-12-31 18:0", LegacyDateUtil.formatLegacyTime(date));
        Assert.assertEquals(1609545600000L, LegacyDateUtil.addDays(date, 1));
        Assert.assertEquals("n/a", LegacyDateUtil.formatYmd(null));
        Assert.assertEquals("n/a", LegacyDateUtil.formatLegacyTime(null));
    }
}