/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationDivide_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_qkpF0() {
        Constant arg1 = new Constant(1);
        Constant arg2 = new Constant(2);
        CoreOperationDivide divideOperation = new CoreOperationDivide(arg1, arg2);
        String expectedSymbol = "div";
        assertEquals(expectedSymbol, divideOperation.getSymbol());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_puHI0() {
        Constant arg1 = new Constant(1);
        Constant arg2 = new Constant(2);
        CoreOperationDivide operation = new CoreOperationDivide(arg1, arg2);
        int expectedPrecedence = CoreOperationDivide.MULTIPLY_PRECEDENCE;
        assertEquals(expectedPrecedence, operation.getPrecedence());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValueWithZeroDenominator_Aonn2() {
        Constant arg1 = mock(Constant.class);
        Constant arg2 = mock(Constant.class);
        EvalContext context = mock(EvalContext.class);
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(0.0);
        CoreOperationDivide operation = new CoreOperationDivide(arg1, arg2);
        try {
            operation.computeValue(context);
            fail("Should have thrown ArithmeticException due to division by zero");
        } catch (ArithmeticException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymmetricReturnsFalse_bnrf0_EOpm0() {
    Constant arg1 = new Constant(10);
    Constant arg2 = new Constant(5);
    CoreOperationDivide operation = new CoreOperationDivide(arg1, arg2);
    assertFalse(operation.isSymmetric());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeValueWithNegativeNumbers_Rskz1_QfgI0() {
    Constant arg1 = mock(Constant.class);
    Constant arg2 = mock(Constant.class);
    EvalContext context = mock(EvalContext.class);
    when(arg1.computeValue(context)).thenReturn(-10.0);
    when(arg2.computeValue(context)).thenReturn(-2.0);
    CoreOperationDivide operation = new CoreOperationDivide(arg1, arg2);
    Object result = operation.computeValue(context);
    assertEquals(5.0, (double) result, 0.0);
}
}