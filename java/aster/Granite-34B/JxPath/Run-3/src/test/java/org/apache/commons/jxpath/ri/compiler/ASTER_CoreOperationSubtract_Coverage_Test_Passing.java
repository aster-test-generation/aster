/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationSubtract_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_sYys0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals(coreOperationSubtract.getSymbol(), "-");
    }

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrecedence_1_rbim0() {
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(new Constant("string"), new Constant(1));
        int actual = coreOperationSubtract.getPrecedence();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_isSymmetric_001_RQPd0_zoIi0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        boolean actual = coreOperationSubtract.isSymmetric();
        boolean expected = false;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}