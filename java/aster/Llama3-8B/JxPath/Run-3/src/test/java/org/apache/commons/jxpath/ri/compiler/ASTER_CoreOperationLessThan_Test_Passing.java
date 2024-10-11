/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationLessThan_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareLessThanZero_LXFf0() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(-1), new Constant(1));
        boolean result = coreOperationLessThan.evaluateCompare(-1);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareGreaterThanZero_aovh1() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant(1), new Constant(-1));
        boolean result = coreOperationLessThan.evaluateCompare(1);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_bguG0() {
        CoreOperationLessThan coreOperationLessThan = new CoreOperationLessThan(new Constant("a"), new Constant("b"));
        String symbol = coreOperationLessThan.getSymbol();
        assert symbol.equals("<");
    }
}