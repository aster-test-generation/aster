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

public class Aster_CoreOperationMultiply_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrecedenceTest_PyBn0_fid2() {
        CoreOperationMultiply coreOperationMultiply = new CoreOperationMultiply(new Constant("string"), new Constant(1));
        int actual = coreOperationMultiply.getPrecedence();
        int expected = 4;
        assertEquals(expected, actual);
    }
}