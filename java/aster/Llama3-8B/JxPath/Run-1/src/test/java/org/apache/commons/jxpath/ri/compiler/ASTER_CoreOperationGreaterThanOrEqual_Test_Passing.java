/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationGreaterThanOrEqual_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateComparePositive_rgbR0() {
        CoreOperationGreaterThanOrEqual coreOperation = new CoreOperationGreaterThanOrEqual(new Constant("0"), new Constant(0));
        boolean result = coreOperation.evaluateCompare(1);
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareNegative_fjVl1() {
        CoreOperationGreaterThanOrEqual coreOperation = new CoreOperationGreaterThanOrEqual(new Constant("0"), new Constant(0));
        boolean result = coreOperation.evaluateCompare(-1);
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_xAuG0() {
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(new Constant("a"), new Constant("b"));
        String symbol = coreOperationGreaterThanOrEqual.getSymbol();
        assert symbol.equals(">=");
    }
}