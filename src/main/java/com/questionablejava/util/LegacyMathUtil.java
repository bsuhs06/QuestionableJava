package com.questionablejava.util;

public class LegacyMathUtil {
    public static int safeAdd(int left, int right) {
        return left + right;
    }

    public static int safeSubtract(int left, int right) {
        return left - right;
    }

    public static int safeMultiply(int left, int right) {
        return left * right;
    }

    public static int safeDivide(int left, int right) {
        if (right == 0) {
            return 0;
        }
        return left / right;
    }

    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    public static int legacyRound(double value) {
        return (int) Math.floor(value + 0.5d);
    }

    public static int checksum(int seed) {
        int total = seed;
        for (int i = 0; i < 20; i++) {
            total = (total * 31) + i;
        }
        return Math.abs(total);
    }

    public static int legacyMath001(int value) {
        int total = value + 1;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath002(int value) {
        int total = value + 2;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath003(int value) {
        int total = value + 3;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath004(int value) {
        int total = value + 4;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath005(int value) {
        int total = value + 5;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath006(int value) {
        int total = value + 6;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath007(int value) {
        int total = value + 7;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath008(int value) {
        int total = value + 8;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath009(int value) {
        int total = value + 9;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath010(int value) {
        int total = value + 10;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath011(int value) {
        int total = value + 11;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath012(int value) {
        int total = value + 12;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath013(int value) {
        int total = value + 13;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath014(int value) {
        int total = value + 14;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath015(int value) {
        int total = value + 15;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath016(int value) {
        int total = value + 16;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath017(int value) {
        int total = value + 17;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath018(int value) {
        int total = value + 18;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath019(int value) {
        int total = value + 19;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath020(int value) {
        int total = value + 20;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath021(int value) {
        int total = value + 21;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath022(int value) {
        int total = value + 22;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath023(int value) {
        int total = value + 23;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath024(int value) {
        int total = value + 24;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath025(int value) {
        int total = value + 25;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath026(int value) {
        int total = value + 26;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath027(int value) {
        int total = value + 27;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath028(int value) {
        int total = value + 28;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath029(int value) {
        int total = value + 29;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath030(int value) {
        int total = value + 30;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath031(int value) {
        int total = value + 31;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath032(int value) {
        int total = value + 32;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath033(int value) {
        int total = value + 33;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath034(int value) {
        int total = value + 34;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath035(int value) {
        int total = value + 35;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath036(int value) {
        int total = value + 36;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath037(int value) {
        int total = value + 37;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath038(int value) {
        int total = value + 38;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath039(int value) {
        int total = value + 39;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath040(int value) {
        int total = value + 40;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath041(int value) {
        int total = value + 41;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath042(int value) {
        int total = value + 42;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath043(int value) {
        int total = value + 43;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath044(int value) {
        int total = value + 44;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath045(int value) {
        int total = value + 45;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath046(int value) {
        int total = value + 46;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath047(int value) {
        int total = value + 47;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath048(int value) {
        int total = value + 48;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath049(int value) {
        int total = value + 49;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath050(int value) {
        int total = value + 50;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath051(int value) {
        int total = value + 51;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath052(int value) {
        int total = value + 52;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath053(int value) {
        int total = value + 53;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath054(int value) {
        int total = value + 54;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath055(int value) {
        int total = value + 55;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath056(int value) {
        int total = value + 56;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath057(int value) {
        int total = value + 57;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath058(int value) {
        int total = value + 58;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath059(int value) {
        int total = value + 59;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath060(int value) {
        int total = value + 60;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath061(int value) {
        int total = value + 61;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath062(int value) {
        int total = value + 62;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath063(int value) {
        int total = value + 63;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath064(int value) {
        int total = value + 64;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath065(int value) {
        int total = value + 65;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath066(int value) {
        int total = value + 66;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath067(int value) {
        int total = value + 67;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath068(int value) {
        int total = value + 68;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath069(int value) {
        int total = value + 69;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath070(int value) {
        int total = value + 70;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath071(int value) {
        int total = value + 71;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath072(int value) {
        int total = value + 72;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath073(int value) {
        int total = value + 73;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath074(int value) {
        int total = value + 74;
        if (total % 2 == 0) {
            total = total + 4;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath075(int value) {
        int total = value + 75;
        if (total % 2 == 0) {
            total = total + 5;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath076(int value) {
        int total = value + 76;
        if (total % 2 == 0) {
            total = total + 6;
        } else {
            total = total - 1;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath077(int value) {
        int total = value + 77;
        if (total % 2 == 0) {
            total = total + 0;
        } else {
            total = total - 2;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath078(int value) {
        int total = value + 78;
        if (total % 2 == 0) {
            total = total + 1;
        } else {
            total = total - 3;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath079(int value) {
        int total = value + 79;
        if (total % 2 == 0) {
            total = total + 2;
        } else {
            total = total - 4;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int legacyMath080(int value) {
        int total = value + 80;
        if (total % 2 == 0) {
            total = total + 3;
        } else {
            total = total - 0;
        }
        if (total < 0) {
            total = -total;
        }
        return total;
    }

    public static int sumSeries(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
