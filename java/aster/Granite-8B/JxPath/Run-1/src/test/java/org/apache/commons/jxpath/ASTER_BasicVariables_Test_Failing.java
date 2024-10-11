/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicVariables_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableExistingVariable_dvBa0_lGyv1() {
        BasicVariables basicVariables = new BasicVariables();
        basicVariables.undeclareVariable("existingVariable");
        assertNull(basicVariables.getVariable("existingVariable"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ktnf0_fid2() {
        BasicVariables vars = new BasicVariables();
        String result = vars.toString();
        assertEquals("expected result", result);
    }
}