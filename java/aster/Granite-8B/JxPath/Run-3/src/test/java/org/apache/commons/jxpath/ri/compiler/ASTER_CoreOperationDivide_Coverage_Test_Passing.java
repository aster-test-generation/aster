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

public class Aster_CoreOperationDivide_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_MJzv0() {
        CoreOperationDivide divide = new CoreOperationDivide(new Constant(1), new Constant(2));
        int precedence = divide.getPrecedence();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_KIuE0() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("string"), new Constant(1));
        boolean result = coreOperationDivide.isSymmetric();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_GSSG1() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant(1), new Constant("string"));
        boolean result = coreOperationDivide.isSymmetric();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_yYuy2() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant(1), new Constant(1));
        boolean result = coreOperationDivide.isSymmetric();
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_ClRx3() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("string"), new Constant("string"));
        boolean result = coreOperationDivide.isSymmetric();
        assertEquals(false, result);
    }
}