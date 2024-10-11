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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationSubtract_Test_Passing {
    CoreOperationSubtract coreoperationsubtract;
    EvalContext context;
    Constant arg1;
    Constant arg2;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_apsQ0() {
        Constant constant1 = new Constant("1");
        Constant constant2 = new Constant("2");
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNumberConstants_Jtui1() {
        Constant constant1 = new Constant(1);
        Constant constant2 = new Constant(2);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithZeroConstants_lwZM2() {
        Constant constant1 = new Constant(0);
        Constant constant2 = new Constant(0);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNegativeConstants_oBcJ3() {
        Constant constant1 = new Constant(-1);
        Constant constant2 = new Constant(-2);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithZeroAndNegativeConstants_mBUa5() {
        Constant constant1 = new Constant(0);
        Constant constant2 = new Constant(-2);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithZeroAndPositiveConstants_qrQc6() {
        Constant constant1 = new Constant(0);
        Constant constant2 = new Constant(2);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNegativeAndPositiveConstants_jGBd7() {
        Constant constant1 = new Constant(-1);
        Constant constant2 = new Constant(2);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNegativeAndZeroConstants_sFku8() {
        Constant constant1 = new Constant(-1);
        Constant constant2 = new Constant(0);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithPositiveAndZeroConstants_wjhk9() {
        Constant constant1 = new Constant(1);
        Constant constant2 = new Constant(0);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        assertEquals("-", coreOperationSubtract.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception {
        arg1 = mock(Constant.class);
        arg2 = mock(Constant.class);
        context = mock(EvalContext.class);
        coreoperationsubtract = new CoreOperationSubtract(arg1, arg2);
        when(arg1.computeValue(context)).thenReturn(10.0);
        when(arg2.computeValue(context)).thenReturn(5.0);
        Object result = coreoperationsubtract.computeValue(context);
        assertEquals(5.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsSymmetric_gJsl0() {
        Constant constant1 = new Constant("string");
        Constant constant2 = new Constant(1);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(constant1, constant2);
        boolean result = coreOperationSubtract.isSymmetric();
    }
}