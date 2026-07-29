package com.questionablejava.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DeadCodeBankTest {

    @Test
    public void exercisesDeadHelpers() {
        Assert.assertTrue(DeadCodeBank.deadChecksum(5) >= 0);
        Assert.assertTrue(DeadCodeBank.deadBanner().contains("dead"));
        Assert.assertEquals(3, DeadCodeBank.deadList().size());
        Assert.assertEquals(2, DeadCodeBank.legacyVector().size());
        Assert.assertTrue(DeadCodeBank.deadMethod001(1) >= 0);
        Assert.assertTrue(DeadCodeBank.deadMethod050(50) >= 0);
        Assert.assertTrue(DeadCodeBank.deadMethod100(100) >= 0);
        Assert.assertTrue(DeadCodeBank.deadMethod150(150) >= 0);
        Assert.assertTrue(DeadCodeBank.deadMethod200(200) >= 0);
        Assert.assertNotNull(DeadCodeBank.deadMatrix());
        Assert.assertEquals("null", DeadCodeBank.deadNullPattern(null));
    }

    @Test
    public void returnsStringLikeValuesForSelectedDeadMethods() {
        List<String> values = DeadCodeBank.deadList();
        Assert.assertTrue(values.contains("alpha"));
        Assert.assertTrue(values.contains("beta"));
        Assert.assertTrue(values.contains("gamma"));
    }
}