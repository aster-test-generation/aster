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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariableReference_Test_Failing {
    private QName varName;
    VariableReference variablereference;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getVariableNameTest_Ovwu0() {
        VariableReference variableReference = new VariableReference(new QName(" qualifiedName"));
        assertEquals(new QName("qualifiedName"), variableReference.getVariableName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getVariableNameTest3_LDAg2() {
        VariableReference variableReference = new VariableReference(new QName(" qualifiedName"));
        assertEquals("qualifiedName", variableReference.getVariableName().getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getVariableNameTest5_dpCi4() {
        VariableReference variableReference = new VariableReference(new QName(" qualifiedName"));
        assertEquals(0, variableReference.getVariableName().hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getVariableNameTest6_YxTu5() {
        VariableReference variableReference = new VariableReference(new QName("prefix", "localName"));
        assertEquals(0, variableReference.getVariableName().hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependentWithNullArgument_sPdQ2() {
        VariableReference varRef = new VariableReference(null);
        boolean result = varRef.isContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_MEGI0_1() {
        VariableReference varRef = new VariableReference(new QName(" qualifiedName"));
        varRef = new VariableReference(new QName("prefix", "localName"));
        assertEquals("$ qualifiedName", varRef.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringForEmptyPrefix_LSYo4() {
        VariableReference varRef = new VariableReference(new QName("", "localName"));
        assertEquals("$localName", varRef.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringForNullLocalName_bjON5() {
        VariableReference varRef = new VariableReference(new QName("prefix", null));
        assertEquals("$prefix:", varRef.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompute() throws Exception {
        varName = new QName("qualifiedName");
        variablereference = new VariableReference(varName);
        EvalContext context = mock(EvalContext.class);
        when(context.getValue()).thenReturn("value");
        Object result = variablereference.compute(context);
        assertEquals("value", result);
    }
}