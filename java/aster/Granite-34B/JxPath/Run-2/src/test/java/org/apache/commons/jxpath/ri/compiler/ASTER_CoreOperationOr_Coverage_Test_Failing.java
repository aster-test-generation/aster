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

public class Aster_CoreOperationOr_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrecedenceTest1_lLcH0_lMyk0_fid2() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[0]);
        int actual = coreOperationOr.getPrecedence();
        int expected = 1;
        assertEquals(expected, actual);
    }
}