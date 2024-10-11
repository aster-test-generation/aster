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

public class Aster_CoreOperationLessThan_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_XgWX0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(arg1, arg2);
        String symbol = coreOperationLessThan.getSymbol();
        assertEquals("<", symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEvaluateCompare_LessThanZero_ReturnsTrue_hYYH0() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(1), new Constant(2));
        assertTrue(coreOperationLessThan.evaluateCompare(-1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEvaluateCompare_Zero_ReturnsFalse_nWwv1() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(1), new Constant(2));
        assertFalse(coreOperationLessThan.evaluateCompare(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testEvaluateCompare_GreaterThanZero_ReturnsFalse_lifn2() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(1), new Constant(2));
        assertFalse(coreOperationLessThan.evaluateCompare(1));
    }
}