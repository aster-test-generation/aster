/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicVariables_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_bAUw0() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.isDeclaredVariable("test");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_hQRd0_1() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.declareVariable("name", "John");
        basicVariables.declareVariable("age", 25);
        basicVariables.declareVariable("isStudent", true);
        assertEquals("John", basicVariables.getVariable("name"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_hQRd0_2() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.declareVariable("name", "John");
        basicVariables.declareVariable("age", 25);
        basicVariables.declareVariable("isStudent", true);
        assertEquals(25, basicVariables.getVariable("age"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_hQRd0_3() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.declareVariable("name", "John");
        basicVariables.declareVariable("age", 25);
        basicVariables.declareVariable("isStudent", true);
        assertEquals(true, basicVariables.getVariable("isStudent"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariable_Xrko0() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.undeclareVariable("varName");
        assertTrue(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDeclareVariable_hQRd0() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.declareVariable("name", "John");
        basicVariables.declareVariable("age", 25);
        basicVariables.declareVariable("isStudent", true);
        assertEquals("John", basicVariables.getVariable("name"));
        assertEquals(25, basicVariables.getVariable("age"));
        assertEquals(true, basicVariables.getVariable("isStudent"));
    }
}