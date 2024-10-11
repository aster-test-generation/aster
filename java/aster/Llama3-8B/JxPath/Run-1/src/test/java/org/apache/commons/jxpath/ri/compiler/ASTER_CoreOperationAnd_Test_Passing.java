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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationAnd_Test_Passing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private Expression[] expressions;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_zZpE0() {
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(new Expression[0]);
        String symbol = coreOperationAnd.getSymbol();
        assert symbol.equals("and");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_BiSJ0() {
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(new Expression[0]);
        assertTrue(coreOperationAnd.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsNotSymmetric_ClUn1() {
        CoreOperationAnd coreOperationAnd = new CoreOperationAnd(new Expression[0]);
        assertFalse(coreOperationAnd.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_pIIy0_Pdrd0() {
        CoreOperationAnd operation = new CoreOperationAnd(new Expression[0]);
        int precedence = operation.getPrecedence();
        assert precedence == CoreOperationAnd.AND_PRECEDENCE;
    }
}