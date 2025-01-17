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
import org.mockito.Mockito;
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
public class Aster_CoreOperationDivide_Test_Passing {
    private CoreOperationDivide coreOperationDivide;
    private EvalContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_Csrk0() {
        Constant constant1 = new Constant("10");
        Constant constant2 = new Constant("5");
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(constant1, constant2);
        String actualSymbol = coreOperationDivide.getSymbol();
        String expectedSymbol = "div";
        assertEquals(expectedSymbol, actualSymbol);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue() {
        coreOperationDivide = new CoreOperationDivide(Mockito.mock(Constant.class), Mockito.mock(Constant.class));
        context = Mockito.mock(EvalContext.class);
        // Mock the computeValue method of the Constant class
        Mockito.when(coreOperationDivide.args[0].computeValue(context)).thenReturn(10.0);
        Mockito.when(coreOperationDivide.args[1].computeValue(context)).thenReturn(2.0);
        // Call the computeValue method of the CoreOperationDivide class
        Object result = coreOperationDivide.computeValue(context);
        // Assert that the result is equal to 5.0
        assertEquals(5.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_WhNq0() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("string"), new Constant(1));
        boolean result = coreOperationDivide.isSymmetric();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric2_rFkV1() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant(1), new Constant(1));
        boolean result = coreOperationDivide.isSymmetric();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric3_PoMJ2() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant(1), new Constant("string"));
        boolean result = coreOperationDivide.isSymmetric();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric4_Hyqb3() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("string"), new Constant("string"));
        boolean result = coreOperationDivide.isSymmetric();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric5_zoNA4() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant(1), new Constant(1));
        boolean result = coreOperationDivide.isSymmetric();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric8_ZfUd7() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("string"), new Constant("string"));
        boolean result = coreOperationDivide.isSymmetric();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_zbBB0() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(arg1, arg2);
        assertEquals(CoreOperationDivide.MULTIPLY_PRECEDENCE, coreOperationDivide.getPrecedence());
    }
}