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
public class Aster_CoreOperationGreaterThanOrEqual_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEvaluateCompareWithZero_pwJu0() {
    CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant("test"), new Constant(1));
    assertTrue(operation.evaluateCompare(0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEvaluateCompareWithNegative_SBSs1() {
    CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(new Constant("test"), new Constant(1));
    assertFalse(operation.evaluateCompare(-1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSymbol_BtmV0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant(10);
    CoreOperationGreaterThanOrEqual operation = new CoreOperationGreaterThanOrEqual(arg1, arg2);
    assertEquals(">=", operation.getSymbol());
}
}