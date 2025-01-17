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
public class Aster_CoreOperationOr_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetSymbol_FVHl0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[0]);
        String symbol = coreOperationOr.getSymbol();
        assertEquals("or", symbol);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void isSymmetric_ReturnsTrue_nnjR0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[]{});
        boolean result = coreOperationOr.isSymmetric();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetPrecedence_rnNN0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[]{});
        assertEquals(CoreOperationOr.OR_PRECEDENCE, coreOperationOr.getPrecedence());
    }
}