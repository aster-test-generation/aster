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

public class Aster_CoreOperationLessThan_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithIntArgument_sYJr0() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(10), new Constant(20));
        boolean result = coreOperationLessThan.evaluateCompare(1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithNegativeIntArgument_JTAC1() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(10), new Constant(20));
        boolean result = coreOperationLessThan.evaluateCompare(-1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithZeroIntArgument_Dnmn2() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(10), new Constant(20));
        boolean result = coreOperationLessThan.evaluateCompare(0);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_rbPw0() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant("string"), new Constant(1));
        String symbol = coreOperationLessThan.getSymbol();
        assertEquals("<", symbol);
    }
}