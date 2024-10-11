/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicVariables_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_NonExistingVariable_zIHQ1() {
        BasicVariables basicVariables = new BasicVariables();
        assertFalse(basicVariables.isDeclaredVariable("varName"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUndeclareVariable_tYPI0_Jppu0() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.declareVariable("varName", "value");
        basicVariables.undeclareVariable("varName");
        try {
            basicVariables.getVariable("varName");
            assertTrue(false);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_XYQV0_fid2() {
        BasicVariables basicVariables = new BasicVariables();
        assertEquals("{}", basicVariables.toString());
    }
}