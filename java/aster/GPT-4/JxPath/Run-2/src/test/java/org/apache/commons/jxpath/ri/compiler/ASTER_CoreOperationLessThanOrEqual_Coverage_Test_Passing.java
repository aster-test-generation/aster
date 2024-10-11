/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationLessThanOrEqual_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompare_VIgX0() {
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(new Constant("test"), new Constant(1));
        boolean result = operation.evaluateCompare(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_ziYo0() {
        Constant arg1 = new Constant(1);
        Constant arg2 = new Constant(2);
        CoreOperationLessThanOrEqual operation = new CoreOperationLessThanOrEqual(arg1, arg2);
        String expected = "<=";
        String actual = operation.getSymbol();
        assertEquals(expected, actual);
    }
}