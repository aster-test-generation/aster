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

public class Aster_CoreOperationGreaterThanOrEqual_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSymbolTest1_NmLD0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        String symbol = coreOperationGreaterThanOrEqual.getSymbol();
        assertEquals(">=", symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare1_eTrD0() {
        Constant constant1 = new Constant("10");
        Constant constant2 = new Constant("20");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        boolean actual = operation.evaluateCompare(10);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare2_KhLO1() {
        Constant constant1 = new Constant("10");
        Constant constant2 = new Constant("20");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        boolean actual = operation.evaluateCompare(30);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}