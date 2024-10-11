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

public class Aster_CoreOperationGreaterThan_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithNegativeNumber_btSe1() {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(new Constant(1), new Constant(2));
        boolean actual = coreOperationGreaterThan.evaluateCompare(1);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithZero_cqZC2() {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(new Constant(1), new Constant(1));
        boolean actual = coreOperationGreaterThan.evaluateCompare(1);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}