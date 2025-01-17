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
public class Aster_CoreOperationAdd_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_lrdZ0() {
        CoreOperationAdd coreOperationAdd = new CoreOperationAdd(new Expression[0]);
        String symbol = coreOperationAdd.getSymbol();
        assertEquals("+", symbol);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_qHuF0() {
        CoreOperationAdd coreOperationAdd = new CoreOperationAdd(new Expression[0]);
        boolean result = coreOperationAdd.isSymmetric();
    }
}