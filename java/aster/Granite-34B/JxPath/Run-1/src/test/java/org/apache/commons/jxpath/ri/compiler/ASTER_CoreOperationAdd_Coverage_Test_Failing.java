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

public class Aster_CoreOperationAdd_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrecedenceTest1_MUBl0_PeUY0_fid2() {
        CoreOperationAdd coreOperationAdd = new CoreOperationAdd(new Expression[0]);
        int actual = coreOperationAdd.getPrecedence();
        int expected = 1;
        assertEquals(expected, actual);
    }
}