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
public class Aster_CoreOperationSubtract_Test_Failing {
    @Mock
    private Constant arg1;
    @Mock
    private Constant arg2;
    @Mock
    private EvalContext context;
    private CoreOperationSubtract coreOperationSubtract;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_Pztm0_izJx0_fid2() {
        Constant arg1 = new Constant("string");
        Constant arg2 = new Constant(1);
        CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(arg1, arg2);
        assertEquals(0, coreOperationSubtract.getPrecedence()); // Assuming ADD_PRECEDENCE is 0
    }
}