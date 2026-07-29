package com.questionablejava.process;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.data.LegacyRepository;
import com.questionablejava.model.LegacyRecord;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LegacyProcessorTest {

    @Test
    public void processesAndSortsLegacyRecords() {
        LegacySettings settings = LegacySettings.loadDefault();
        LegacyRepository repository = new LegacyRepository(settings);
        LegacyProcessor processor = new LegacyProcessor(settings);

        List<LegacyRecord> input = new ArrayList<LegacyRecord>();
        input.add(repository.findById(1));
        input.add(repository.findById(2));

        List<LegacyRecord> processed = processor.process(input);
        Collections.sort(processed, processor.getComparator());

        Assert.assertEquals(2, processed.size());

        LegacyRecord first = processed.get(0);
        Assert.assertEquals(87, first.getScore());
        Assert.assertEquals("Alpha drift", first.getName());
        Assert.assertEquals("Finance", first.getCategory());
        Assert.assertTrue(first.hasTag("qualified"));

        LegacyRecord second = processed.get(1);
        Assert.assertTrue(second.getScore() > 0);
        Assert.assertTrue(second.hasTag("needs-review") || second.hasTag("qualified"));
    }
}