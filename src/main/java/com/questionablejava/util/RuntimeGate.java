package com.questionablejava.util;

public final class RuntimeGate {
    public static final int REQUIRED_FEATURE_VERSION = 21;

    private RuntimeGate() {
    }

    public static void requireJava21() {
        int feature = Runtime.version().feature();
        if (feature < REQUIRED_FEATURE_VERSION) {
            throw new IllegalStateException(
                    "This project requires Java " + REQUIRED_FEATURE_VERSION + ", but detected " + feature);
        }
    }
}
