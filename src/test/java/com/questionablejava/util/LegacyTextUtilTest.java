package com.questionablejava.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LegacyTextUtilTest {

    @Test
    public void handlesBasicStringOperations() {
        Assert.assertEquals("", LegacyTextUtil.nullToEmpty(null));
        Assert.assertEquals("trimmed", LegacyTextUtil.trimToEmpty("  trimmed  "));
        Assert.assertEquals("ABC", LegacyTextUtil.upper(" abc "));
        Assert.assertEquals("abc", LegacyTextUtil.lower(" ABC "));
        Assert.assertEquals("  hi", LegacyTextUtil.leftPad("hi", 4));
        Assert.assertEquals("hi  ", LegacyTextUtil.rightPad("hi", 4));
        Assert.assertTrue(LegacyTextUtil.isBlank("   "));
        Assert.assertFalse(LegacyTextUtil.isBlank("x"));
        Assert.assertEquals("xyxy", LegacyTextUtil.repeat("xy", 2));
    }

    @Test
    public void handlesSplitJoinAndLegacyTokens() {
        List<String> split = LegacyTextUtil.splitByComma(" a, b ,c ");
        Assert.assertEquals(Arrays.asList("a", "b", "c"), split);
        Assert.assertEquals("a|b|c", LegacyTextUtil.join(split, "|"));
        Assert.assertEquals("token001-empty", LegacyTextUtil.legacyToken001(null));
        Assert.assertEquals("abcd-001", LegacyTextUtil.legacyToken001(" abcd "));
        Assert.assertEquals("abcde-002", LegacyTextUtil.legacyToken002(" abcde "));
        Assert.assertTrue(LegacyTextUtil.legacyTokens().size() >= 80);
    }
}