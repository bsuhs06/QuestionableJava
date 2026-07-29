package com.questionablejava.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LegacyRecordTest {

    @Test
    public void copiesAndMutatesAsExpected() {
        Date createdAt = new Date(1609459200000L);
        LegacyRecord record = new LegacyRecord(7, "  Sample  ", "  alpha  ", -5, true, createdAt);
        record.addTag("one");
        record.addTag(null);
        record.addTag("");

        Assert.assertEquals(1, record.tagCount());
        Assert.assertTrue(record.hasTag("one"));
        Assert.assertFalse(record.hasTag("two"));

        record.mutateLegacyState();
        Assert.assertEquals("Sample", record.getName());
        Assert.assertEquals("alpha", record.getCategory());
        Assert.assertEquals(0, record.getScore());

        LegacyRecord copy = record.copy();
        Assert.assertNotSame(record, copy);
        Assert.assertEquals(record.describe(), copy.describe());
        Assert.assertNotSame(record.getCreatedAt(), copy.getCreatedAt());
    }
}