/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicVariables_Test_Passing {
    private BasicVariables basicVariables;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_kmWb0() {
        BasicVariables basicVariables = new BasicVariables();
        String varName = "exampleVar";
        boolean expected = true;
        boolean actual = basicVariables.isDeclaredVariable(varName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_cKmo0() {
        BasicVariables basicVariables = new BasicVariables();
        String expected = "[]";
        String actual = basicVariables.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getVariable_with_non_existing_variable_Amvr1() {
        BasicVariables basicVariables = new BasicVariables();
        Object actual = basicVariables.getVariable("nonExistingVariable");
        Object expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_aHKM0() {
        basicVariables = new BasicVariables();
    }
}