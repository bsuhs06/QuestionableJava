package com.questionablejava.util;

public final class RuntimeGate {
    private RuntimeGate() {
    }

    public static void requireJava8() {
        String specificationVersion = System.getProperty("java.specification.version", "");
        if (!"1.8".equals(specificationVersion)) {
            throw new IllegalStateException("This project only runs on Java 8, but detected " + specificationVersion);
        }
    }
}