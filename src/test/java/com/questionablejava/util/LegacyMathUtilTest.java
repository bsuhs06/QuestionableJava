package com.questionablejava.util;

import org.junit.Assert;
import org.junit.Test;

public class LegacyMathUtilTest {

    @Test
    public void handlesBasicMathOperations() {
        Assert.assertEquals(7, LegacyMathUtil.safeAdd(3, 4));
        Assert.assertEquals(-1, LegacyMathUtil.safeSubtract(3, 4));
        Assert.assertEquals(12, LegacyMathUtil.safeMultiply(3, 4));
        Assert.assertEquals(0, LegacyMathUtil.safeDivide(9, 0));
        Assert.assertEquals(3, LegacyMathUtil.safeDivide(9, 3));
        Assert.assertEquals(5, LegacyMathUtil.clamp(5, 1, 10));
        Assert.assertEquals(1, LegacyMathUtil.clamp(-5, 1, 10));
        Assert.assertEquals(10, LegacyMathUtil.clamp(50, 1, 10));
        Assert.assertEquals(4, LegacyMathUtil.legacyRound(3.6d));
        Assert.assertTrue(LegacyMathUtil.checksum(2) > 0);
        Assert.assertEquals(2, LegacyMathUtil.sumSeries(new int[] {1, 1}));
    }

    @Test
    public void producesLegacyMathTokens() {
        Assert.assertEquals(3, LegacyMathUtil.legacyMath001(1));
        Assert.assertEquals(6, LegacyMathUtil.legacyMath002(2));
        Assert.assertTrue(LegacyMathUtil.legacyMath010(10) >= 0);
        Assert.assertTrue(LegacyMathUtil.legacyMath020(20) >= 0);
        Assert.assertTrue(LegacyMathUtil.legacyMath030(30) >= 0);
        Assert.assertTrue(LegacyMathUtil.legacyMath040(40) >= 0);
        Assert.assertTrue(LegacyMathUtil.legacyMath050(50) >= 0);
        Assert.assertTrue(LegacyMathUtil.legacyMath060(60) >= 0);
        Assert.assertTrue(LegacyMathUtil.legacyMath070(70) >= 0);
        Assert.assertTrue(LegacyMathUtil.legacyMath080(80) >= 0);
    }
}