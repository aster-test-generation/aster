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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariableReference_Test_Passing {
    private QName varName;
    private EvalContext context;
    private EvalContext evalContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName_djZA0_1() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName.getName(), result.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName_djZA0_2() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName.getPrefix(), result.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependent_GiPF0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertFalse(variableReference.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_qDCC0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertEquals("$prefix:localName", variableReference.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_aQFH0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        boolean result = variableReference.computeContextDependent();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName_djZA0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName.getName(), result.getName());
        assertEquals(varName.getPrefix(), result.getPrefix());
    }
}