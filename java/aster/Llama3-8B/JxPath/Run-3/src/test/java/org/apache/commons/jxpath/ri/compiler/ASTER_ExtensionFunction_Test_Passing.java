/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.JXPathContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Passing {
private QName functionName;
private EvalContext evalContext;
private Expression[] args;
private ExtensionFunction extensionFunction;
@Mock
    private JXPathContext jXPathContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName_pMxL0() throws Exception {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        QName result = extensionFunction.getFunctionName();
        assertEquals(functionName, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithFunctionNameAndNoArguments_DyEV0() throws Exception {
        QName functionName = new QName("prefix", "localName");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, null);
        assertEquals("prefix:localName()", extensionFunction.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoFunctionNameAndNoArguments_FpFT3() throws Exception {
        QName functionName = new QName("", "");
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, null);
        assertEquals("()", extensionFunction.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute() throws Exception {
        extensionFunction = new ExtensionFunction(functionName, new Expression[0]);
        // Arrange
        when(evalContext.getJXPathContext()).thenReturn(jXPathContext);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.nextNode()).thenReturn(true);
        // Act
        Object result = extensionFunction.compute(evalContext);
        // Assert
        verify(evalContext, times(1)).getJXPathContext();
        verify(evalContext, times(1)).hasNext();
        verify(evalContext, times(1)).nextNode();
        assertEquals(true, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_OXuF0() throws Exception {
        QName functionName = new QName("prefix", "localName");
        Expression[] args = new Expression[0];
        ExtensionFunction extensionFunction = new ExtensionFunction(functionName, args);
        boolean result = extensionFunction.computeContextDependent();
        assertTrue(result);
    }
}