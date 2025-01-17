/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationUnion_Test_Passing {
    @Mock
    private Expression[] args;
    @Mock
    private EvalContext context;
    @Mock
    private EvalContext[] argCtxs;
    @Mock
    private RootContext rootContext;
    private CoreOperationUnion coreOperationUnion;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSymbol_zikU0()
    {
        CoreOperationUnion coreOperationUnion = new CoreOperationUnion(new Expression[]{});
        String result = coreOperationUnion.getSymbol();
        assertEquals("|", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_IbRJ0() {
        CoreOperationUnion coreOperationUnion = new CoreOperationUnion(new Expression[]{});
        boolean result = coreOperationUnion.isSymmetric();
        assertTrue(result);
    }
}