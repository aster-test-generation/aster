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

public class Aster_CoreOperationNegate_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrecedenceTest1_jVbY0_Omjs0() {
        Constant constant = new Constant("string");
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(constant);
        int actual = coreOperationNegate.getPrecedence();
        int expected = CoreOperationNegate.NEGATE_PRECEDENCE;
        assertEquals(expected, actual);
    }
}