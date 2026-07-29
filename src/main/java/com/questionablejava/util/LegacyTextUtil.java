package com.questionablejava.util;

import java.util.ArrayList;
import java.util.List;

public class LegacyTextUtil {
    public static String nullToEmpty(String value) {
        if (value == null) {
            return "";
        }
        return value;
    }

    public static String trimToEmpty(String value) {
        return nullToEmpty(value).trim();
    }

    public static String upper(String value) {
        return trimToEmpty(value).toUpperCase();
    }

    public static String lower(String value) {
        return trimToEmpty(value).toLowerCase();
    }

    public static String leftPad(String value, int width) {
        StringBuffer buffer = new StringBuffer(nullToEmpty(value));
        while (buffer.length() < width) {
            buffer.insert(0, " ");
        }
        return buffer.toString();
    }

    public static String rightPad(String value, int width) {
        StringBuffer buffer = new StringBuffer(nullToEmpty(value));
        while (buffer.length() < width) {
            buffer.append(" ");
        }
        return buffer.toString();
    }

    public static List<String> splitByComma(String value) {
        List<String> parts = new ArrayList<String>();
        if (value == null || value.length() == 0) {
            return parts;
        }
        String[] pieces = value.split(",");
        for (int i = 0; i < pieces.length; i++) {
            parts.add(trimToEmpty(pieces[i]));
        }
        return parts;
    }

    public static String join(List<String> values, String separator) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                buffer.append(separator);
            }
            buffer.append(values.get(i));
        }
        return buffer.toString();
    }

    public static boolean isBlank(String value) {
        return value == null || value.trim().length() == 0;
    }

    public static String repeat(String value, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(value);
        }
        return buffer.toString();
    }

    public static String legacyToken001(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token001-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-001";
        }
        return lower(local) + "-001";
    }

    public static String legacyToken002(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token002-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-002";
        }
        return lower(local) + "-002";
    }

    public static String legacyToken003(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token003-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-003";
        }
        return lower(local) + "-003";
    }

    public static String legacyToken004(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token004-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-004";
        }
        return lower(local) + "-004";
    }

    public static String legacyToken005(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token005-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-005";
        }
        return lower(local) + "-005";
    }

    public static String legacyToken006(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token006-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-006";
        }
        return lower(local) + "-006";
    }

    public static String legacyToken007(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token007-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-007";
        }
        return lower(local) + "-007";
    }

    public static String legacyToken008(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token008-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-008";
        }
        return lower(local) + "-008";
    }

    public static String legacyToken009(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token009-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-009";
        }
        return lower(local) + "-009";
    }

    public static String legacyToken010(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token010-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-010";
        }
        return lower(local) + "-010";
    }

    public static String legacyToken011(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token011-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-011";
        }
        return lower(local) + "-011";
    }

    public static String legacyToken012(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token012-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-012";
        }
        return lower(local) + "-012";
    }

    public static String legacyToken013(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token013-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-013";
        }
        return lower(local) + "-013";
    }

    public static String legacyToken014(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token014-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-014";
        }
        return lower(local) + "-014";
    }

    public static String legacyToken015(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token015-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-015";
        }
        return lower(local) + "-015";
    }

    public static String legacyToken016(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token016-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-016";
        }
        return lower(local) + "-016";
    }

    public static String legacyToken017(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token017-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-017";
        }
        return lower(local) + "-017";
    }

    public static String legacyToken018(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token018-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-018";
        }
        return lower(local) + "-018";
    }

    public static String legacyToken019(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token019-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-019";
        }
        return lower(local) + "-019";
    }

    public static String legacyToken020(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token020-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-020";
        }
        return lower(local) + "-020";
    }

    public static String legacyToken021(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token021-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-021";
        }
        return lower(local) + "-021";
    }

    public static String legacyToken022(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token022-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-022";
        }
        return lower(local) + "-022";
    }

    public static String legacyToken023(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token023-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-023";
        }
        return lower(local) + "-023";
    }

    public static String legacyToken024(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token024-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-024";
        }
        return lower(local) + "-024";
    }

    public static String legacyToken025(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token025-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-025";
        }
        return lower(local) + "-025";
    }

    public static String legacyToken026(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token026-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-026";
        }
        return lower(local) + "-026";
    }

    public static String legacyToken027(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token027-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-027";
        }
        return lower(local) + "-027";
    }

    public static String legacyToken028(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token028-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-028";
        }
        return lower(local) + "-028";
    }

    public static String legacyToken029(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token029-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-029";
        }
        return lower(local) + "-029";
    }

    public static String legacyToken030(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token030-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-030";
        }
        return lower(local) + "-030";
    }

    public static String legacyToken031(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token031-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-031";
        }
        return lower(local) + "-031";
    }

    public static String legacyToken032(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token032-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-032";
        }
        return lower(local) + "-032";
    }

    public static String legacyToken033(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token033-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-033";
        }
        return lower(local) + "-033";
    }

    public static String legacyToken034(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token034-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-034";
        }
        return lower(local) + "-034";
    }

    public static String legacyToken035(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token035-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-035";
        }
        return lower(local) + "-035";
    }

    public static String legacyToken036(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token036-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-036";
        }
        return lower(local) + "-036";
    }

    public static String legacyToken037(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token037-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-037";
        }
        return lower(local) + "-037";
    }

    public static String legacyToken038(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token038-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-038";
        }
        return lower(local) + "-038";
    }

    public static String legacyToken039(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token039-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-039";
        }
        return lower(local) + "-039";
    }

    public static String legacyToken040(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token040-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-040";
        }
        return lower(local) + "-040";
    }

    public static String legacyToken041(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token041-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-041";
        }
        return lower(local) + "-041";
    }

    public static String legacyToken042(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token042-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-042";
        }
        return lower(local) + "-042";
    }

    public static String legacyToken043(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token043-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-043";
        }
        return lower(local) + "-043";
    }

    public static String legacyToken044(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token044-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-044";
        }
        return lower(local) + "-044";
    }

    public static String legacyToken045(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token045-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-045";
        }
        return lower(local) + "-045";
    }

    public static String legacyToken046(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token046-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-046";
        }
        return lower(local) + "-046";
    }

    public static String legacyToken047(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token047-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-047";
        }
        return lower(local) + "-047";
    }

    public static String legacyToken048(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token048-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-048";
        }
        return lower(local) + "-048";
    }

    public static String legacyToken049(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token049-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-049";
        }
        return lower(local) + "-049";
    }

    public static String legacyToken050(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token050-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-050";
        }
        return lower(local) + "-050";
    }

    public static String legacyToken051(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token051-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-051";
        }
        return lower(local) + "-051";
    }

    public static String legacyToken052(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token052-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-052";
        }
        return lower(local) + "-052";
    }

    public static String legacyToken053(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token053-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-053";
        }
        return lower(local) + "-053";
    }

    public static String legacyToken054(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token054-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-054";
        }
        return lower(local) + "-054";
    }

    public static String legacyToken055(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token055-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-055";
        }
        return lower(local) + "-055";
    }

    public static String legacyToken056(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token056-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-056";
        }
        return lower(local) + "-056";
    }

    public static String legacyToken057(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token057-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-057";
        }
        return lower(local) + "-057";
    }

    public static String legacyToken058(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token058-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-058";
        }
        return lower(local) + "-058";
    }

    public static String legacyToken059(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token059-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-059";
        }
        return lower(local) + "-059";
    }

    public static String legacyToken060(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token060-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-060";
        }
        return lower(local) + "-060";
    }

    public static String legacyToken061(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token061-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-061";
        }
        return lower(local) + "-061";
    }

    public static String legacyToken062(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token062-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-062";
        }
        return lower(local) + "-062";
    }

    public static String legacyToken063(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token063-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-063";
        }
        return lower(local) + "-063";
    }

    public static String legacyToken064(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token064-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-064";
        }
        return lower(local) + "-064";
    }

    public static String legacyToken065(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token065-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-065";
        }
        return lower(local) + "-065";
    }

    public static String legacyToken066(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token066-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-066";
        }
        return lower(local) + "-066";
    }

    public static String legacyToken067(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token067-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-067";
        }
        return lower(local) + "-067";
    }

    public static String legacyToken068(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token068-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-068";
        }
        return lower(local) + "-068";
    }

    public static String legacyToken069(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token069-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-069";
        }
        return lower(local) + "-069";
    }

    public static String legacyToken070(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token070-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-070";
        }
        return lower(local) + "-070";
    }

    public static String legacyToken071(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token071-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-071";
        }
        return lower(local) + "-071";
    }

    public static String legacyToken072(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token072-empty";
        }
        if (local.length() > 3) {
            return upper(local) + "-072";
        }
        return lower(local) + "-072";
    }

    public static String legacyToken073(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token073-empty";
        }
        if (local.length() > 4) {
            return upper(local) + "-073";
        }
        return lower(local) + "-073";
    }

    public static String legacyToken074(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token074-empty";
        }
        if (local.length() > 5) {
            return upper(local) + "-074";
        }
        return lower(local) + "-074";
    }

    public static String legacyToken075(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token075-empty";
        }
        if (local.length() > 6) {
            return upper(local) + "-075";
        }
        return lower(local) + "-075";
    }

    public static String legacyToken076(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token076-empty";
        }
        if (local.length() > 7) {
            return upper(local) + "-076";
        }
        return lower(local) + "-076";
    }

    public static String legacyToken077(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token077-empty";
        }
        if (local.length() > 8) {
            return upper(local) + "-077";
        }
        return lower(local) + "-077";
    }

    public static String legacyToken078(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token078-empty";
        }
        if (local.length() > 9) {
            return upper(local) + "-078";
        }
        return lower(local) + "-078";
    }

    public static String legacyToken079(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token079-empty";
        }
        if (local.length() > 10) {
            return upper(local) + "-079";
        }
        return lower(local) + "-079";
    }

    public static String legacyToken080(String value) {
        String local = trimToEmpty(value);
        if (local.length() == 0) {
            return "token080-empty";
        }
        if (local.length() > 11) {
            return upper(local) + "-080";
        }
        return lower(local) + "-080";
    }

    public static List<String> legacyTokens() {
        List<String> tokens = new ArrayList<String>();
        tokens.add("legacy-001");
        tokens.add("legacy-002");
        tokens.add("legacy-003");
        tokens.add("legacy-004");
        tokens.add("legacy-005");
        tokens.add("legacy-006");
        tokens.add("legacy-007");
        tokens.add("legacy-008");
        tokens.add("legacy-009");
        tokens.add("legacy-010");
        tokens.add("legacy-011");
        tokens.add("legacy-012");
        tokens.add("legacy-013");
        tokens.add("legacy-014");
        tokens.add("legacy-015");
        tokens.add("legacy-016");
        tokens.add("legacy-017");
        tokens.add("legacy-018");
        tokens.add("legacy-019");
        tokens.add("legacy-020");
        tokens.add("legacy-021");
        tokens.add("legacy-022");
        tokens.add("legacy-023");
        tokens.add("legacy-024");
        tokens.add("legacy-025");
        tokens.add("legacy-026");
        tokens.add("legacy-027");
        tokens.add("legacy-028");
        tokens.add("legacy-029");
        tokens.add("legacy-030");
        tokens.add("legacy-031");
        tokens.add("legacy-032");
        tokens.add("legacy-033");
        tokens.add("legacy-034");
        tokens.add("legacy-035");
        tokens.add("legacy-036");
        tokens.add("legacy-037");
        tokens.add("legacy-038");
        tokens.add("legacy-039");
        tokens.add("legacy-040");
        tokens.add("legacy-041");
        tokens.add("legacy-042");
        tokens.add("legacy-043");
        tokens.add("legacy-044");
        tokens.add("legacy-045");
        tokens.add("legacy-046");
        tokens.add("legacy-047");
        tokens.add("legacy-048");
        tokens.add("legacy-049");
        tokens.add("legacy-050");
        tokens.add("legacy-051");
        tokens.add("legacy-052");
        tokens.add("legacy-053");
        tokens.add("legacy-054");
        tokens.add("legacy-055");
        tokens.add("legacy-056");
        tokens.add("legacy-057");
        tokens.add("legacy-058");
        tokens.add("legacy-059");
        tokens.add("legacy-060");
        tokens.add("legacy-061");
        tokens.add("legacy-062");
        tokens.add("legacy-063");
        tokens.add("legacy-064");
        tokens.add("legacy-065");
        tokens.add("legacy-066");
        tokens.add("legacy-067");
        tokens.add("legacy-068");
        tokens.add("legacy-069");
        tokens.add("legacy-070");
        tokens.add("legacy-071");
        tokens.add("legacy-072");
        tokens.add("legacy-073");
        tokens.add("legacy-074");
        tokens.add("legacy-075");
        tokens.add("legacy-076");
        tokens.add("legacy-077");
        tokens.add("legacy-078");
        tokens.add("legacy-079");
        tokens.add("legacy-080");
        return tokens;
    }
}
