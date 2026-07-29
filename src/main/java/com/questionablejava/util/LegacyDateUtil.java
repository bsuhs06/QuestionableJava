package com.questionablejava.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LegacyDateUtil {
    public static String formatYmd(Date date) {
        if (date == null) {
            return "n/a";
        }
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public static String formatLegacyTime(Date date) {
        if (date == null) {
            return "n/a";
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append(date.getYear() + 1900);
        buffer.append('-');
        buffer.append(date.getMonth() + 1);
        buffer.append('-');
        buffer.append(date.getDate());
        buffer.append(' ');
        buffer.append(date.getHours());
        buffer.append(':');
        buffer.append(date.getMinutes());
        return buffer.toString();
    }

    public static long addDays(Date date, int days) {
        if (date == null) {
            return 0L;
        }
        return date.getTime() + (days * 86400000L);
    }
}