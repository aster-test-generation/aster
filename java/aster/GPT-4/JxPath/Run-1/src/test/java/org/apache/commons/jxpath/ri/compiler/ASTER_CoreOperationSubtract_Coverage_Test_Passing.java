/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationSubtract_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_eFfm0() {
        Constant arg1 = new Constant(5);
        Constant arg2 = new Constant(10);
        CoreOperationSubtract subtractOperation = new CoreOperationSubtract(arg1, arg2);
        String result = subtractOperation.getSymbol();
        assertEquals("-", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_wYpj0() {
        Constant arg1 = new Constant(5); // Using Number constructor
        Constant arg2 = new Constant(3); // Using Number constructor
        CoreOperationSubtract subtractOperation = new CoreOperationSubtract(arg1, arg2);
        final int expectedPrecedence = CoreOperationSubtract.ADD_PRECEDENCE;
        int actualPrecedence = subtractOperation.getPrecedence();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymmetricReturnsFalse_rXnV0_wpdD0() {
    Constant arg1 = new Constant(5);
    Constant arg2 = new Constant(10);
    CoreOperationSubtract operation = new CoreOperationSubtract(arg1, arg2);
    assertFalse(operation.isSymmetric());
}
}