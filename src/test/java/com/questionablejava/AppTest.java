package com.questionablejava;

import com.questionablejava.util.RuntimeGate;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void appRunsOnJava21() {
        Assert.assertTrue(Runtime.version().feature() >= RuntimeGate.REQUIRED_FEATURE_VERSION);

        RuntimeGate.requireJava21();
        App.main(new String[] {"upgrade", "me"});
    }
}
