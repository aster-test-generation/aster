/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariableReference_Test_Passing {
    private QName varName;
    private VariableReference variablereference;
    @Mock
    private EvalContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName_XmAD0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        QName result = variableReference.getVariableName();
        assertEquals(varName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsContextDependent_goCz0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertFalse(variableReference.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsContextDependentWithNullVarName_Kpgl1() {
        VariableReference variableReference = new VariableReference(null);
        assertTrue(variableReference.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsContextDependentWithEmptyVarName_plDy2() {
        QName varName = new QName("");
        VariableReference variableReference = new VariableReference(varName);
        assertTrue(variableReference.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsContextDependentWithVarNameWithPrefix_XwHw3() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertTrue(variableReference.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsContextDependentWithVarNameWithoutPrefix_PTFZ4() {
        QName varName = new QName("localName");
        VariableReference variableReference = new VariableReference(varName);
        assertFalse(variableReference.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_zXSb0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertEquals("$prefix:localName", variableReference.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReferenceWithNullName_QpWS1() {
        VariableReference variableReference = new VariableReference(null);
        assertEquals("null", variableReference.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReferenceWithEmptyName_mWqb2() {
        QName varName = new QName("");
        VariableReference variableReference = new VariableReference(varName);
        assertEquals("$", variableReference.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReferenceWithOnlyLocalName_ROvW3() {
        QName varName = new QName(null, "localName");
        VariableReference variableReference = new VariableReference(varName);
        assertEquals("$localName", variableReference.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReferenceWithOnlyPrefix_HcGO4() {
        QName varName = new QName("prefix", null);
        VariableReference variableReference = new VariableReference(varName);
        assertEquals("$prefix:", variableReference.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompute() throws Exception {
        varName = new QName("test");
        variablereference = new VariableReference(varName);
        // Mock the EvalContext
        when(context.getJXPathContext()).thenReturn(Mockito.mock(JXPathContext.class));
        when(context.getPosition()).thenReturn(1);
        when(context.hasNext()).thenReturn(true);
        when(context.nextNode()).thenReturn(true);
        when(context.nextSet()).thenReturn(true);
        when(context.getCurrentNodePointer()).thenReturn(Mockito.mock(NodePointer.class));
        when(context.getRootContext()).thenReturn(Mockito.mock(RootContext.class));
        when(context.getCurrentPosition()).thenReturn(1);
        when(context.isChildOrderingRequired()).thenReturn(true);
        // Call the compute method and assert the result
        Object result = variablereference.compute(context);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_sEvN0() {
        QName varName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(varName);
        boolean result = variableReference.computeContextDependent();
        assertFalse(result);
    }
}