package com.questionablejava;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.data.LegacyRepository;
import com.questionablejava.model.LegacyRecord;
import com.questionablejava.process.LegacyProcessor;
import com.questionablejava.report.LegacyReport;
import com.questionablejava.util.DeadCodeBank;
import com.questionablejava.util.RuntimeGate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        RuntimeGate.requireJava8();

        LegacySettings settings = LegacySettings.loadDefault();
        LegacyRepository repository = new LegacyRepository(settings);
        LegacyProcessor processor = new LegacyProcessor(settings);
        List<LegacyRecord> records = new ArrayList<LegacyRecord>(repository.loadAll());
        List<LegacyRecord> processed = processor.process(records);
        Collections.sort(processed, processor.getComparator());

        LegacyReport report = new LegacyReport(settings);
        report.print(processed, repository, processor);

        if (args != null && args.length > 0) {
            report.printArguments(args);
        }

        int dead = DeadCodeBank.deadChecksum(processed.size());
        if (dead == 42) {
            System.out.println("The legacy universe has aligned.");
        }
    }
}
