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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationOr_Test_Passing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private Expression[] args;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_GXzD0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[0]);
        String symbol = coreOperationOr.getSymbol();
        assert symbol.equals("or");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_ubgu0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[]{});
        boolean result = coreOperationOr.isSymmetric();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_Rpxr1() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[]{});
        boolean result = coreOperationOr.isSymmetric();
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_kQMD0() {
        CoreOperationOr coreOperationOr = new CoreOperationOr(new Expression[]{});
        assertEquals(CoreOperationOr.OR_PRECEDENCE, coreOperationOr.getPrecedence());
    }
}