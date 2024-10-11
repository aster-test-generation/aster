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

public class Aster_CoreOperationSubtract_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSymbolTest1_xMXo0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        String symbol = coreOperationSubtract.getSymbol();
        assertEquals("-", symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isSymmetric_0_MpFT0() {
        Constant constant_arg1 = new Constant("string");
        Constant constant_arg2 = new Constant(1);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant_arg1, constant_arg2);
        boolean result = coreOperationSubtract.isSymmetric();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrecedenceTest1_EOxM0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        int expected = 4;
        int actual = coreOperationSubtract.getPrecedence();
        assertEquals(expected, actual);
    }
}