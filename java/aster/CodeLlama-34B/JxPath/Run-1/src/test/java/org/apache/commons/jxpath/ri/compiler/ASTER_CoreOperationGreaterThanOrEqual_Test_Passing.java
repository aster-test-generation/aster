/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationGreaterThanOrEqual_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_GreaterThanOrEqual_Number_MvFy0() {
        Constant arg1 = new Constant(10);
        Constant arg2 = new Constant(5);
        CoreOperationGreaterThanOrEqual op = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        boolean result = op.evaluateCompare(10);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_lQWt0() {
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant("1"), new Constant("2"));
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNumbers_mytD1() {
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant(1), new Constant(2));
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithMixedTypes_eZBm2() {
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant("1"), new Constant(2));
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNullArguments_NPlE3() {
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(null, null);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithEmptyArguments_VONG4() {
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant(""), new Constant(""));
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithInvalidArguments_exJJ5() {
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant("a"), new Constant("b"));
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithDifferentTypes2_VLGf7() {
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant(1), new Constant("2"));
        assertEquals(">=", operation.getSymbol());
    }
}