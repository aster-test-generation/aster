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
    public void testEvaluateCompareWithPositiveNumber_wzIU0() {
        Constant arg1 = new Constant(5);
        Constant arg2 = new Constant(3);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        boolean result = operation.evaluateCompare(0);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithZero_hhpb1() {
        Constant arg1 = new Constant(0);
        Constant arg2 = new Constant(0);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(arg1, arg2);
        boolean result = operation.evaluateCompare(0);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_OBUS0() {
        Constant constant1 = new Constant("10");
        Constant constant2 = new Constant(10);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol2_kQCF2() {
        Constant constant1 = new Constant("10");
        Constant constant2 = new Constant(10.5);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol3_Ehuk3() {
        Constant constant1 = new Constant(10);
        Constant constant2 = new Constant("10.5");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol4_pLOy4() {
        Constant constant1 = new Constant(10);
        Constant constant2 = new Constant(10);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol5_NHLo5() {
        Constant constant1 = new Constant(10.5);
        Constant constant2 = new Constant(10);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol6_UiFV6() {
        Constant constant1 = new Constant(10.5);
        Constant constant2 = new Constant(10.5);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol7_UXXy7() {
        Constant constant1 = new Constant("10.5");
        Constant constant2 = new Constant(10.5);
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol8_fnAl8() {
        Constant constant1 = new Constant("10.5");
        Constant constant2 = new Constant("10.5");
        CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(constant1, constant2);
        assertEquals(">=", operation.getSymbol());
    }
}