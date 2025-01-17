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
public class Aster_CoreOperationDivide_Test_Failing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private Constant constant1;
    @Mock
    private Constant constant2;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValueZeroDivide_eadv1_IedX0() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("10.0"), new Constant("0.0"));
        try {
            coreOperationDivide.getPrecedence();
            assert false;
        } catch (ArithmeticException e) {
            assert true;
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrecedence_CnLv0() {
        CoreOperationDivide coreOperationDivide = new CoreOperationDivide(new Constant("a"), new Constant("b"));
        assertEquals(0, coreOperationDivide.getPrecedence());
    }
}