# QuestionableJava
Java 8 code upgraded to Java 21

## Purpose

This repository started out as intentionally Java 8-style code and has been migrated to Java 21 (`maven.compiler.release=21`) while preserving behavior.

## Baseline workflow

Build and test with a JDK 21 toolchain:

```bash
mvn test
```

The application is gated to Java 21 at runtime, so running it on an older JDK fails fast:

```bash
mvn -q -DskipTests compile exec:java
```

`LegacyDateUtilTest` asserts locale-independent but timezone-dependent formatting; run the suite in `America/Chicago` (for example `TZ=America/Chicago mvn test`) as the seeded expectations assume.

If you want to inspect the upgraded surface area, start with the core classes in `src/main/java/com/questionablejava/` and the regression tests in `src/test/java/com/questionablejava/`.
