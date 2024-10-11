/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationNotEqual_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_Kiuw0() {
        CoreOperationNotEqual coreOperationNotEqual = new CoreOperationNotEqual(new Constant("1"), new Constant("2"));
        String symbol = coreOperationNotEqual.getSymbol();
        assert(symbol.equals("!="));
    }
}