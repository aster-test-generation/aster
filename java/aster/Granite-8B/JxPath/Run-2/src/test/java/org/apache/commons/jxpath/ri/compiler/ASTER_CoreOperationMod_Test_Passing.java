/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationMod_Test_Passing {
    @Mock
    private EvalContext context;
    @Mock
    private Constant arg1;
    @Mock
    private Constant arg2;
    private CoreOperationMod coreoperationmod;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbol_wdFJ0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(10);
        CoreOperationMod coreOperationMod = new CoreOperationMod(constant1, constant2);
        assertEquals("mod", coreOperationMod.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() {
        coreoperationmod = new CoreOperationMod(arg1, arg2);
        // Mock the computeValue method of arg1 and arg2
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(3.0);
        // Call the computeValue method of CoreOperationMod
        Object result = coreoperationmod.computeValue(context);
        // Assert that the result is correct
        assertEquals(1.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_GWBY0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationMod coreOperationMod = new CoreOperationMod(constant1, constant2);
        boolean result = coreOperationMod.isSymmetric();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_sXab0_fid2() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationMod coreOperationMod = new CoreOperationMod(constant1, constant2);
        int actual = coreOperationMod.getPrecedence();
        int expected = 5;
        assertEquals(expected, actual);
    }
}