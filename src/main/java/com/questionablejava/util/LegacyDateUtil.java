package com.questionablejava.util;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class LegacyDateUtil {
    private static final DateTimeFormatter YMD_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private LegacyDateUtil() {
    }

    public static String formatYmd(Date date) {
        if (date == null) {
            return "n/a";
        }
        return YMD_FORMAT.format(toLocal(date));
    }

    public static String formatLegacyTime(Date date) {
        if (date == null) {
            return "n/a";
        }
        var local = toLocal(date);
        return "%d-%d-%d %d:%d".formatted(
                local.getYear(),
                local.getMonthValue(),
                local.getDayOfMonth(),
                local.getHour(),
                local.getMinute());
    }

    public static long addDays(Date date, int days) {
        if (date == null) {
            return 0L;
        }
        return date.getTime() + Duration.ofDays(days).toMillis();
    }

    private static LocalDateTime toLocal(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }
}
