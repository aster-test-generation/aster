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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationOr_Test_Passing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private Expression expression1;
    @Mock
    private Expression expression2;
    private CoreOperationOr coreOperationOr;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_AllFalse() throws Exception {
        coreOperationOr = new CoreOperationOr(new Expression[]{expression1, expression2});
        // Mocking behavior
        when(expression1.computeValue(evalContext)).thenReturn(Boolean.FALSE);
        when(expression2.computeValue(evalContext)).thenReturn(Boolean.FALSE);
        // Test
        Object result = coreOperationOr.computeValue(evalContext);
        // Assertions
        assertEquals(Boolean.FALSE, result);
        verify(expression1).computeValue(evalContext);
        verify(expression2).computeValue(evalContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_ryZm0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[0]);
        assertEquals("or", coreOperationOr.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_zMUV0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[]{});
        assertTrue(coreOperationOr.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_IVvl0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[]{});
        assertEquals(CoreOperationOr.OR_PRECEDENCE, coreOperationOr.getPrecedence());
    }
}