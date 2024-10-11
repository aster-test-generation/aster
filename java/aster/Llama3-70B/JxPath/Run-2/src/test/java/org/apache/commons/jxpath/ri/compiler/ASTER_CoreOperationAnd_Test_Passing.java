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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationAnd_Test_Passing {
    CoreOperationAnd coreoperationand;
    EvalContext evalContext;
    Expression[] args;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_rDib0() {
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(new Expression[0]);
        assertEquals("and", coreOperationAnd.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception {
        args = new Expression[]{mock(Expression.class), mock(Expression.class)};
        coreoperationand = new CoreOperationAnd(args);
        evalContext = mock(EvalContext.class);
        when(args[0].computeValue(evalContext)).thenReturn(Boolean.TRUE);
        when(args[1].computeValue(evalContext)).thenReturn(Boolean.TRUE);
        Object result = coreoperationand.computeValue(evalContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue_withFalse() throws Exception {
        args = new Expression[]{mock(Expression.class), mock(Expression.class)};
        coreoperationand = new CoreOperationAnd(args);
        evalContext = mock(EvalContext.class);
        when(args[0].computeValue(evalContext)).thenReturn(Boolean.TRUE);
        when(args[1].computeValue(evalContext)).thenReturn(Boolean.FALSE);
        Object result = coreoperationand.computeValue(evalContext);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_wnAE0() {
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(new Expression[]{});
        assertTrue(coreOperationAnd.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_DsiX0() {
        Expression[] args = new Expression[0];
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(args);
        assertEquals(CoreOperationAnd.AND_PRECEDENCE, coreOperationAnd.getPrecedence());
    }
}