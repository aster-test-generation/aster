/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationLessThanOrEqual_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_UEyC0() {
        CoreOperationLessThanOrEqual c = new CoreOperationLessThanOrEqual(new Constant("1"), new Constant("2"));
        assertEquals("<=", c.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_lessThan_Modd0() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(new Constant(1), new Constant(2));
        boolean result = op.evaluateCompare(-1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_equal_utGo1() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(new Constant(1), new Constant(1));
        boolean result = op.evaluateCompare(0);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_greaterThan_Nbza2() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(new Constant(1), new Constant(2));
        boolean result = op.evaluateCompare(1);
        assertFalse(result);
    }
}