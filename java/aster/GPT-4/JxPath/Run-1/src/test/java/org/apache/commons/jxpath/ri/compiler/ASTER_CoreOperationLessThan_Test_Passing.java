/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationLessThan_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_akRG0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant(10);
    CoreOperationLessThan lessThan = new CoreOperationLessThan(arg1, arg2);
    assertEquals("<", lessThan.getSymbol());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareLessThanZero_vHuk0() {
        CoreOperationLessThan operation = new CoreOperationLessThan(new Constant("test"), new Constant(10));
        assertTrue(operation.evaluateCompare(-1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareGreaterThanZero_OANo1() {
        CoreOperationLessThan operation = new CoreOperationLessThan(new Constant("test"), new Constant(10));
        assertFalse(operation.evaluateCompare(1));
    }
}