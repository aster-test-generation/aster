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

public class Aster_BasicVariables_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDeclaredVariable_XuXq0_fid2() {
        BasicVariables basicVariables = new BasicVariables();
        String varName = "exampleVar";
        boolean expected = true;
        boolean actual = basicVariables.isDeclaredVariable(varName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_PThq0_fid2() {
        BasicVariables basicVariables = new BasicVariables();
        String expected = "[]";
        String actual = basicVariables.toString();
        assertEquals(expected, actual);
    }
}