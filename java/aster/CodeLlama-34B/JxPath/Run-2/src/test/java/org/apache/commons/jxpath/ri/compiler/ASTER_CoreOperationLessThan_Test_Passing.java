/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationLessThan_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_ConstantString_LHHW0() {
        Constant constant = new Constant("test");
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(constant, constant);
        assertEquals("<", coreOperationLessThan.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_ConstantNumber_hrdL1() {
        Constant constant = new Constant(1);
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(constant, constant);
        assertEquals("<", coreOperationLessThan.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_LessThan_ryWX0_YFby0() {
        Constant arg1 = new Constant(new Integer(5));
        Constant arg2 = new Constant(new Integer(10));
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(arg1, arg2);
        assertFalse(coreOperationLessThan.evaluateCompare(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_GreaterThan_xkds1_woAh0() {
        Constant arg1 = new Constant(new Integer(10));
        Constant arg2 = new Constant(new Integer(5));
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(arg1, arg2);
        assertFalse(coreOperationLessThan.evaluateCompare(10));
    }
}