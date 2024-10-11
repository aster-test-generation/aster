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

public class Aster_CoreOperationLessThan_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithCompareAs0_XhNo0() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant("string"), new Constant(1));
        boolean actual = coreOperationLessThan.evaluateCompare(0);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithCompareAs1_zGJF1() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant("string"), new Constant(1));
        boolean actual = coreOperationLessThan.evaluateCompare(1);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithCompareAsminus1_TXOj2() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant("string"), new Constant(1));
        boolean actual = coreOperationLessThan.evaluateCompare(-1);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}