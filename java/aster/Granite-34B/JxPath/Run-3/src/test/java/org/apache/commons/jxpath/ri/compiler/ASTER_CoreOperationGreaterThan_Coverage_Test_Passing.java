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

public class Aster_CoreOperationGreaterThan_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_evaluateCompare_0_dpUv0() throws Exception {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(new Constant("arg1"), new Constant("arg2"));
        boolean actual = coreOperationGreaterThan.evaluateCompare(0);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_evaluateCompare_1_TZVk1() throws Exception {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(new Constant("arg1"), new Constant("arg2"));
        boolean actual = coreOperationGreaterThan.evaluateCompare(1);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_evaluateCompare_2_MCaJ2() throws Exception {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(new Constant("arg1"), new Constant("arg2"));
        boolean actual = coreOperationGreaterThan.evaluateCompare(2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSymbolTest1_bfAM0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(123);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(arg1, arg2);
        String actual = coreOperationGreaterThan.getSymbol();
        assertEquals(actual, ">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSymbolTest2_lYmX1() {
        Constant arg1 = new Constant(123);
        Constant arg2 = new Constant(123);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(arg1, arg2);
        String actual = coreOperationGreaterThan.getSymbol();
        assertEquals(actual, ">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSymbolTest3_PSop2() {
        Constant arg1 = new Constant(123);
        Constant arg2 = new Constant(456);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(arg1, arg2);
        String actual = coreOperationGreaterThan.getSymbol();
        assertEquals(actual, ">");
    }
}