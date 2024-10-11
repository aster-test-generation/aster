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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationMod_Test_Passing {
    CoreOperationMod coreoperationmod;
    EvalContext evalContext;
    Constant arg1;
    Constant arg2;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_RXWg0() {
        CoreOperationMod coreOperationMod = new CoreOperationMod(new Constant("string"), new Constant(1));
        assertEquals("mod", coreOperationMod.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception {
        arg1 = mock(Constant.class);
        arg2 = mock(Constant.class);
        evalContext = mock(EvalContext.class);
        coreoperationmod = new CoreOperationMod(arg1, arg2);
        when(arg1.computeValue(evalContext)).thenReturn(10.0);
        when(arg2.computeValue(evalContext)).thenReturn(2.0);
        Object result = coreoperationmod.computeValue(evalContext);
        assertEquals(0.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_wNAb0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationMod coreOperationMod = new CoreOperationMod(arg1, arg2);
        assertFalse(coreOperationMod.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_dRRi0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationMod coreOperationMod = new CoreOperationMod(arg1, arg2);
        int precedence = coreOperationMod.getPrecedence();
        assert precedence == CoreOperationMod.MULTIPLY_PRECEDENCE;
    }
}