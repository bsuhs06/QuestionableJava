package com.questionablejava.data;

import com.questionablejava.config.LegacySettings;
import com.questionablejava.model.LegacyRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LegacyRepository {
    private final LegacySettings settings;
    private final List<LegacyRecord> records = new ArrayList<LegacyRecord>();

    public LegacyRepository(LegacySettings settings) {
        this.settings = settings;
        seed();
    }

    private void seed() {
        records.add(make(1, "Alpha Drift", "finance", 71, true, 1, "legacy", "stable"));
        records.add(make(2, "Beta Drift", "finance", 19, false, 2, "legacy"));
        records.add(make(3, "Gamma Bloom", "ops", 43, true, 3, "hot", "urgent"));
        records.add(make(4, "Delta Bloom", "ops", 55, true, 4, "hot", "manual"));
        records.add(make(5, "Epsilon Echo", "sales", 12, false, 5, "cold"));
        records.add(make(6, "Zeta Echo", "sales", 33, true, 6, "cold", "review"));
        records.add(make(7, "Eta Echo", "support", 47, true, 7, "ticket"));
        records.add(make(8, "Theta Echo", "support", 15, false, 8, "ticket", "archive"));
        records.add(make(9, "Iota Line", "marketing", 66, true, 9, "campaign"));
        records.add(make(10, "Kappa Line", "marketing", 28, true, 10, "campaign", "draft"));
        records.add(make(11, "Lambda Line", "engineering", 88, true, 11, "build", "release"));
        records.add(make(12, "Mu Line", "engineering", 49, false, 12, "build"));
        records.add(make(13, "Nu Node", "engineering", 38, true, 13, "node"));
        records.add(make(14, "Xi Node", "hr", 21, true, 14, "policy"));
        records.add(make(15, "Omicron Node", "hr", 14, false, 15, "policy", "archive"));
        records.add(make(16, "Pi Node", "legal", 64, true, 16, "memo"));
        records.add(make(17, "Rho Node", "legal", 51, true, 17, "memo", "draft"));
        records.add(make(18, "Sigma Node", "procurement", 77, true, 18, "vendor"));
        records.add(make(19, "Tau Node", "procurement", 24, false, 19, "vendor"));
        records.add(make(20, "Upsilon Node", "product", 35, true, 20, "roadmap"));
        records.add(make(21, "Phi Node", "product", 59, true, 21, "roadmap", "priority"));
        records.add(make(22, "Chi Node", "data", 63, true, 22, "warehouse"));
        records.add(make(23, "Psi Node", "data", 11, false, 23, "warehouse", "cold"));
        records.add(make(24, "Omega Node", "data", 92, true, 24, "warehouse", "hot"));
        records.add(make(25, "Prime Node", "operations", 48, true, 25, "queue"));
        records.add(make(26, "Second Node", "operations", 27, false, 26, "queue"));
        records.add(make(27, "Third Node", "operations", 40, true, 27, "queue", "legacy"));
        records.add(make(28, "Fourth Node", "platform", 81, true, 28, "infra"));
        records.add(make(29, "Fifth Node", "platform", 31, false, 29, "infra", "draft"));
        records.add(make(30, "Sixth Node", "platform", 73, true, 30, "infra", "approved"));
    }

    private LegacyRecord make(int id, String name, String category, int score, boolean active, int day, String... tags) {
        LegacyRecord record = new LegacyRecord(id, name, category, score, active, new Date(1609459200000L + (day * 86400000L)));
        for (String tag : tags) {
            record.addTag(tag);
        }
        return record;
    }

    public List<LegacyRecord> loadAll() {
        List<LegacyRecord> copy = new ArrayList<LegacyRecord>();
        for (LegacyRecord record : records) {
            copy.add(record.copy());
        }
        return copy;
    }

    public List<LegacyRecord> findByCategory(String category) {
        List<LegacyRecord> matches = new ArrayList<LegacyRecord>();
        for (LegacyRecord record : records) {
            if (category != null && category.equalsIgnoreCase(record.getCategory())) {
                matches.add(record.copy());
            }
        }
        return matches;
    }

    public List<LegacyRecord> findActive() {
        List<LegacyRecord> matches = new ArrayList<LegacyRecord>();
        for (LegacyRecord record : records) {
            if (record.isActive()) {
                matches.add(record.copy());
            }
        }
        return matches;
    }

    public LegacyRecord findById(int id) {
        for (LegacyRecord record : records) {
            if (record.getId() == id) {
                return record.copy();
            }
        }
        return null;
    }

    public void save(LegacyRecord record) {
        if (record == null) {
            return;
        }
        records.add(record.copy());
    }

    public LegacySettings getSettings() {
        return settings;
    }

    public int count() {
        return records.size();
    }

    public String dumpSummary() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Repository[");
        buffer.append("count=").append(count());
        buffer.append(",prefix=").append(settings.get("prefix", "legacy"));
        buffer.append("]");
        return buffer.toString();
    }

    public List<String> legacyNames() {
        List<String> names = new ArrayList<String>();
        for (LegacyRecord record : records) {
            names.add(record.getName());
        }
        return names;
    }
}
