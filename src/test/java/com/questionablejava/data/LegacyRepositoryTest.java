package com.questionablejava.data;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.model.LegacyRecord;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LegacyRepositoryTest {

    @Test
    public void loadsSeedDataAndFindsRecords() {
        LegacyRepository repository = new LegacyRepository(LegacySettings.loadDefault());

        Assert.assertEquals(30, repository.count());

        LegacyRecord record = repository.findById(1);
        Assert.assertNotNull(record);
        Assert.assertEquals("Alpha Drift", record.getName());
        Assert.assertTrue(record.isActive());

        List<LegacyRecord> finance = repository.findByCategory("finance");
        Assert.assertEquals(2, finance.size());

        List<LegacyRecord> active = repository.findActive();
        Assert.assertEquals(21, active.size());
    }
}