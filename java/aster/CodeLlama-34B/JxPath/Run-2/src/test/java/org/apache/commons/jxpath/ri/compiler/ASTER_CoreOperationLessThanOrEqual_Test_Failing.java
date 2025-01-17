/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationLessThanOrEqual_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_LessThan_gWdS0_fid1() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(new Constant("5"), new Constant("10"));
        assertTrue(op.evaluateCompare(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_Equal_SLZD1_fid1() {
        CoreOperationLessThanOrEqual op = new CoreOperationLessThanOrEqual(new Constant("5"), new Constant("5"));
        assertTrue(op.evaluateCompare(5));
    }
}