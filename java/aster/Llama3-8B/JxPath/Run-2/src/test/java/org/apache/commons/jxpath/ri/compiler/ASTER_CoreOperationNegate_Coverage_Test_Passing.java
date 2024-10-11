/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.JXPathContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationNegate_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_WTAG0() {
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant("test"));
        String symbol = coreOperationNegate.getSymbol();
        assertEquals("-", symbol);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_GGNE0() {
        CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant("Hello"));
        boolean result = coreOperationNegate.isSymmetric();
        assert(result == false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeValueNegative_fvTG1_iPeI1() {
    CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant("-1"));
    JXPathContext context = JXPathContext.newContext(new Object());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrecedence_Cjtf6_cyhH6() {
    CoreOperationNegate coreOperationNegate = new CoreOperationNegate(new Constant(1));
    int result = coreOperationNegate.getPrecedence();
    assertEquals(6, result);
}
}