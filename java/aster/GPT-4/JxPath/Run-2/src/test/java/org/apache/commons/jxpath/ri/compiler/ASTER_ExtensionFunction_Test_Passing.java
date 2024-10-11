/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import java.util.Arrays;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.JXPathFunctionNotFoundException;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExtensionFunction_Test_Passing {
@Mock
    private EvalContext context;
@Mock
    private RootContext rootContext;
@Mock
    private Function function;
@Mock
    private Expression[] args;
@Mock
    private NodeSet nodeSet;
@InjectMocks
    private ExtensionFunction extensionFunction;
private QName functionName = new QName("namespace", "functionName");
@Mock
    private EvalContext evalContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionName_KcbJ0_1() {
    QName qName = new QName("prefix", "localName");
    Expression[] expressions = new Expression[0];
    ExtensionFunction extensionFunction = new ExtensionFunction(qName, expressions);
    QName result = extensionFunction.getFunctionName();
    assertEquals("prefix", result.getPrefix());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionName_KcbJ0_2() {
    QName qName = new QName("prefix", "localName");
    Expression[] expressions = new Expression[0];
    ExtensionFunction extensionFunction = new ExtensionFunction(qName, expressions);
    QName result = extensionFunction.getFunctionName();
    assertEquals("localName", result.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringNoArguments_DZPJ0() {
        QName functionName = new QName("testFunction");
        Expression[] args = new Expression[0];
        ExtensionFunction function = new ExtensionFunction(functionName, args);
        assertEquals("testFunction()", function.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullArguments_srOp3() {
        QName functionName = new QName("testFunction");
        ExtensionFunction function = new ExtensionFunction(functionName, null);
        assertEquals("testFunction()", function.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_WithValidFunction() throws Exception {
        extensionFunction = new ExtensionFunction(functionName, args);
        when(context.getRootContext()).thenReturn(rootContext);
        when(rootContext.getFunction(eq(functionName), any())).thenReturn(function);
        Object expectedValue = "Expected Result";
        when(args.length).thenReturn(2);
        when(args[0].compute(context)).thenReturn("arg1");
        when(args[1].compute(context)).thenReturn("arg2");
        when(function.invoke(context, new Object[]{"arg1", "arg2"})).thenReturn(expectedValue);
        Object result = extensionFunction.computeValue(context);
        assertEquals(expectedValue, result);
        verify(function).invoke(context, new Object[]{"arg1", "arg2"});
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_WithNodeSetResult() throws Exception {
        extensionFunction = new ExtensionFunction(functionName, args);
        when(context.getRootContext()).thenReturn(rootContext);
        when(rootContext.getFunction(eq(functionName), any())).thenReturn(function);
        when(args.length).thenReturn(1);
        when(args[0].compute(context)).thenReturn("arg1");
        when(function.invoke(context, new Object[]{"arg1"})).thenReturn(nodeSet);
        Object result = extensionFunction.computeValue(context);
        assertTrue(result instanceof NodeSetContext);
        verify(function).invoke(context, new Object[]{"arg1"});
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testComputeContextDependent_IDcI0() {
    QName qName = new QName("testFunction");
    Expression[] expressions = new Expression[0];
    ExtensionFunction extensionFunction = new ExtensionFunction(qName, expressions);
    boolean result = extensionFunction.computeContextDependent();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute() throws Exception {
        // functionName and evalContext are already set up by Mockito with @Mock
        // extensionFunction is injected with mocks by Mockito with @InjectMocks
        // Arrange
        Object expectedValue = new Object();
        when(evalContext.getValue()).thenReturn(expectedValue);
        // Act
        Object result = extensionFunction.compute(evalContext);
        // Assert
        assertEquals(expectedValue, result, "The compute method should return the value obtained from evalContext.getValue()");
        verify(evalContext).getValue(); // Verify that getValue was indeed called on evalContext
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFunctionName_KcbJ0() {
    QName qName = new QName("prefix", "localName");
    Expression[] expressions = new Expression[0];
    ExtensionFunction extensionFunction = new ExtensionFunction(qName, expressions);
    QName result = extensionFunction.getFunctionName();
    assertEquals("prefix", result.getPrefix());
    assertEquals("localName", result.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue_FunctionNotFound() throws Exception {
        extensionFunction = new ExtensionFunction(functionName, args);
        when(context.getRootContext()).thenReturn(rootContext);
        when(rootContext.getFunction(eq(functionName), any())).thenReturn(function);
        when(rootContext.getFunction(eq(functionName), any())).thenReturn(null);
        Exception exception = assertThrows(JXPathFunctionNotFoundException.class, () -> {
            extensionFunction.computeValue(context);
        });
        String expectedMessage = "No such function: " + functionName + Arrays.asList(new Object[]{null});
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}