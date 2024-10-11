/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationLessThanOrEqual_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_WsBt0_fid2() {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(new Constant(1), new Constant(2));
        boolean result = coreOperationLessThanOrEqual.evaluateCompare(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare2_jNCF1_fid2() {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(new Constant(1), new Constant(2));
        boolean result = coreOperationLessThanOrEqual.evaluateCompare(-1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare12_HTMd11_fid2() {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(new Constant(2), new Constant(1));
        boolean result = coreOperationLessThanOrEqual.evaluateCompare(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare13_BkoU12_fid2() {
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual = new CoreOperationLessThanOrEqual(new Constant(2), new Constant(0));
        boolean result = coreOperationLessThanOrEqual.evaluateCompare(1);
        assertTrue(result);
    }
}