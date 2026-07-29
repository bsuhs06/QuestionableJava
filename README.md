# QuestionableJava
Bad Java 8 code to test code upgrading

## Purpose

This repository is intentionally written in Java 8 style and is meant to be a migration target for tools that upgrade code to Java 17 and Java 21.

## Baseline workflow

Run the tests before and after your upgrade pass to confirm behavior stays the same:

```bash
mvn test
```

The application is also gated to Java 8 at runtime, so running it on newer JDKs should fail fast:

```bash
mvn -q -DskipTests compile exec:java
```

If you want to inspect the legacy surface area, start with the core classes in `src/main/java/com/questionablejava/` and the regression tests in `src/test/java/com/questionablejava/`.
