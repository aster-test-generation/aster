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

public class Aster_CoreOperationAnd_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSymbolTest1_aLzO0() {
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(new Expression[0]);
        String result = coreOperationAnd.getSymbol();
        assertEquals("and", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_tgmS0() {
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(new Expression[0]);
        boolean actual = coreOperationAnd.isSymmetric();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_jlDc0_ZzWr0() {
        CoreOperationAnd obj = new CoreOperationAnd(new Expression[0]);
        int result = obj.getPrecedence();
        int expected = 1;
        assertEquals(expected, result);
    }
}