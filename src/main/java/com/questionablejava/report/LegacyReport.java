package com.questionablejava.report;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.data.LegacyRepository;
import com.questionablejava.model.LegacyRecord;
import com.questionablejava.process.LegacyProcessor;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class LegacyReport {
    private static final DateTimeFormatter TIMESTAMP_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private final LegacySettings settings;

    public LegacyReport(LegacySettings settings) {
        this.settings = settings;
    }

    public void print(List<LegacyRecord> records, LegacyRepository repository, LegacyProcessor processor) {
        System.out.println(settings.banner());
        System.out.println(repository.dumpSummary());
        System.out.println("Processor summary: " + processor.summary(records));
        System.out.println();
        printHeader();
        records.forEach(this::printRecord);
        printFooter(records.size());
        System.out.println();
        printWarnings();
    }

    private void printHeader() {
        System.out.println(settings.get("separator", "---"));
        System.out.println("ID | NAME | CATEGORY | SCORE | ACTIVE | CREATED | TAGS");
        System.out.println(settings.get("separator", "---"));
    }

    private void printRecord(LegacyRecord record) {
        System.out.println(String.join(" | ",
                pad(record.getId(), 2),
                pad(record.getName(), 16),
                pad(record.getCategory(), 12),
                pad(record.getScore(), 5),
                pad(Boolean.toString(record.isActive()), 6),
                pad(format(record.getCreatedAt()), 19),
                record.getTags().toString()));
    }

    private void printFooter(int count) {
        System.out.println(settings.get("separator", "---"));
        System.out.println("Total records: " + count);
        System.out.println("Printed at: " + new Date());
    }

    public void printWarnings() {
        if (settings.getWarnings().isEmpty()) {
            System.out.println("No warnings.");
            return;
        }
        System.out.println("Warnings:");
        settings.getWarnings().forEach(warning -> System.out.println(" - " + warning));
    }

    public void printArguments(String[] args) {
        System.out.println("Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(" - [" + i + "] " + args[i]);
        }
    }

    private static String pad(String value, int width) {
        var actual = value == null ? "" : value;
        if (actual.length() > width) {
            return actual.substring(0, width);
        }
        return actual + " ".repeat(width - actual.length());
    }

    private static String pad(int value, int width) {
        return pad(Integer.toString(value), width);
    }

    private static String format(Date date) {
        if (date == null) {
            return "n/a";
        }
        return TIMESTAMP_FORMAT.format(date.toInstant().atZone(ZoneId.systemDefault()));
    }
}
