package com.questionablejava;

import com.questionablejava.util.RuntimeGate;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void appOnlyRunsOnJava8() {
        String specificationVersion = System.getProperty("java.specification.version", "");

        if ("1.8".equals(specificationVersion)) {
            App.main(new String[] {"upgrade", "me"});
        } else {
            try {
                RuntimeGate.requireJava8();
                Assert.fail("Expected Java 8 gate to reject runtime " + specificationVersion);
            } catch (IllegalStateException expected) {
                Assert.assertTrue(expected.getMessage().contains(specificationVersion));
            }
        }
    }
}