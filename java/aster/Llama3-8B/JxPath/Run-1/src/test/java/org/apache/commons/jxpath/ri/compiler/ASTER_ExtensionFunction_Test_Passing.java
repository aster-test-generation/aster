/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Passing {
    @Mock
    private QName functionName;
    @Mock
    private EvalContext evalContext;
    @Mock
    private Expression[] args;
    @Mock
    private Function function;
    @Mock
    private NodeSet nodeSet;
    private ExtensionFunction extensionFunction;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName_fBls0() {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[]{});
        QName result = extensionFunction.getFunctionName();
        assertEquals(functionName, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithFunctionNameAndNoArguments_OASd0() {
        QName functionName = new QName("prefix", "localName");
        Expression[] args = new Expression[0];
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, args);
        assertEquals("prefix:localName()", extensionFunction.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithQualifiedFunctionName_KGpp3() {
        QName functionName = new QName("qualifiedName");
        Expression[] args = new Expression[0];
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, args);
        assertEquals("qualifiedName()", extensionFunction.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_brsq0() {
        QName functionName = new QName("prefix", "localName");
        Expression[] args = new Expression[0];
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, args);
        boolean result = extensionFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute() throws Exception {
        extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        // Arrange
        when(evalContext.getPosition()).thenReturn(1);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.nextNode()).thenReturn(true);
        // Act
        Object result = extensionFunction.compute(evalContext);
        // Assert
        verify(evalContext, times(1)).getPosition();
        verify(evalContext, times(1)).hasNext();
        verify(evalContext, times(1)).nextNode();
        assertEquals(true, result);
    }
}