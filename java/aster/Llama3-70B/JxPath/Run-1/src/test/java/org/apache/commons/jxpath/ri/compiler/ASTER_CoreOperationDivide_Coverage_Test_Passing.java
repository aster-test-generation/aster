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

public class Aster_CoreOperationDivide_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetSymbol_CKSn0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(arg1, arg2);
        String symbol = coreOperationDivide.getSymbol();
        assertEquals("div", symbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetPrecedence_wtTb0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(10);
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(arg1, arg2);
        assertEquals(CoreOperationDivide.MULTIPLY_PRECEDENCE, coreOperationDivide.getPrecedence());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_kjpt0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(arg1, arg2);
        assertFalse(coreOperationDivide.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_EJTy1() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(arg1, arg2);
        boolean result = coreOperationDivide.isSymmetric();
        assertFalse(result);
    }
}