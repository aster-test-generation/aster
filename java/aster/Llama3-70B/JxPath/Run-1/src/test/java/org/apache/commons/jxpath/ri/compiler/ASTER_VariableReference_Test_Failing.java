/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariableReference_Test_Failing {
    private QName varName;
    private EvalContext context;
    private EvalContext evalContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_ZNdx0() throws Exception {
        QName varName = new QName("test");
        EvalContext evalContext = mock(EvalContext.class);
        VariableReference variableReference = new VariableReference(varName);
        when(evalContext.getValue()).thenReturn("computed value");
        Object result = variableReference.compute(evalContext);
        assertEquals("computed value", result);
        verify(evalContext).getValue();
    }
}