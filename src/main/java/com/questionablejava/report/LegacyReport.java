package com.questionablejava.report;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.data.LegacyRepository;
import com.questionablejava.model.LegacyRecord;
import com.questionablejava.process.LegacyProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LegacyReport {
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
        for (LegacyRecord record : records) {
            printRecord(record);
        }
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
        StringBuffer line = new StringBuffer();
        line.append(pad(record.getId(), 2)).append(" | ");
        line.append(pad(record.getName(), 16)).append(" | ");
        line.append(pad(record.getCategory(), 12)).append(" | ");
        line.append(pad(record.getScore(), 5)).append(" | ");
        line.append(pad(Boolean.toString(record.isActive()), 6)).append(" | ");
        line.append(pad(format(record.getCreatedAt()), 19)).append(" | ");
        line.append(record.getTags());
        System.out.println(line.toString());
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
        for (String warning : settings.getWarnings()) {
            System.out.println(" - " + warning);
        }
    }

    public void printArguments(String[] args) {
        System.out.println("Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(" - [" + i + "] " + args[i]);
        }
    }

    private String pad(String value, int width) {
        String actual = value == null ? "" : value;
        StringBuffer buffer = new StringBuffer(actual);
        while (buffer.length() < width) {
            buffer.append(' ');
        }
        if (buffer.length() > width) {
            return buffer.substring(0, width);
        }
        return buffer.toString();
    }

    private String pad(int value, int width) {
        return pad(Integer.toString(value), width);
    }

    private String format(Date date) {
        if (date == null) {
            return "n/a";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
    }
}
