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
public class Aster_CoreOperationAdd_Test_Failing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private Expression expression1;
    @Mock
    private Expression expression2;
    private CoreOperationAdd coreoperationadd;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_EnNW0_QQzM0() {
        CoreOperationAdd coreOperationAdd = new CoreOperationAdd(new Expression[0]);
        assertEquals(3, coreOperationAdd.getPrecedence()); // Assuming getPrecedence returns 3 for ADD operation
    }
}