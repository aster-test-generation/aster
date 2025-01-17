/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicVariables_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariableFalse_hHdB1() {
        BasicVariables basicVariables = new BasicVariables();
        assertFalse(basicVariables.isDeclaredVariable("varName"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_zonQ0() {
        BasicVariables basicVariables = new BasicVariables();
        String expected = "{}";
        assertEquals(expected, basicVariables.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableNonExistingVariable_sjDn1() {
        BasicVariables basicVariables = new BasicVariables();
        try {
            basicVariables.getVariable("nonExistingVariable");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("No such variable: 'nonExistingVariable'", e.getMessage());
        }
    }
}