/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationEqual_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_ZDuq0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationEqual coreOperationEqual = new CoreOperationEqual(arg1, arg2);
        String symbol = coreOperationEqual.getSymbol();
        assertEquals("=", symbol);
    }
}