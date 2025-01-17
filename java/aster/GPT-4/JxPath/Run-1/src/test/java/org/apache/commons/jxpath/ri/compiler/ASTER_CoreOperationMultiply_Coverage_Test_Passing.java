/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationMultiply_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_zMdz0() {
        Constant constant1 = new Constant(5);
        Constant constant2 = new Constant(10);
        CoreOperationMultiply multiplyOperation = new CoreOperationMultiply(constant1, constant2);
        String symbol = multiplyOperation.getSymbol();
        assertEquals("*", symbol);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_TLYS0() {
        final int expectedPrecedence = CoreOperationMultiply.MULTIPLY_PRECEDENCE;
        Constant arg1 = new Constant(5);
        Constant arg2 = new Constant(10);
        CoreOperationMultiply multiplyOperation = new CoreOperationMultiply(arg1, arg2);
        int actualPrecedence = multiplyOperation.getPrecedence();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymmetricReturnsTrue_COzb0_BsNY0() {
    Constant arg1 = new Constant("TestString");
    Constant arg2 = new Constant(123);
    CoreOperationMultiply operation = new CoreOperationMultiply(arg1, arg2);
    assertTrue(operation.isSymmetric(), "isSymmetric should return true");
}
}