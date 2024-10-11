/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreFunction_Test_Failing {
    CoreFunction coreFunction;
    EvalContext evalContext;
    JXPathContext jXPathContext;
    NodePointer nodePointer;
    Expression arg1;
    private int functionCode = Compiler.FUNCTION_LAST;
    Expression arg2;
    CoreFunction corefunction;
    Expression[] args;
    EvalContext ctx;
    EvalContext context;
    Expression arg3;
    @Mock
    private JXPathContext jxpathContext;
    @Mock
    private NodeSet nodeSet;
    @Mock
    private BasicNodeSet basicNodeSet;
    private static Double ZERO = Double.valueOf(0);

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValue() throws Exception {
        coreFunction = new CoreFunction(functionCode, new Expression[0]);
        evalContext = Mockito.mock(EvalContext.class);
        // mock the behavior of evalContext
        Mockito.when(evalContext.getPosition()).thenReturn(1);
        // call the method under test
        Object result = coreFunction.computeValue(evalContext);
        // assert the result
        assertNotNull(result);
        assertEquals(1, result); // assuming functionLast returns the position
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionName_noArguments() throws Exception {
        evalContext = mock(EvalContext.class);
        nodePointer = mock(NodePointer.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1});
        when(coreFunction.getArgumentCount()).thenReturn(0);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getName()).thenReturn(mock(QName.class));
        Object result = coreFunction.functionName(evalContext);
        assertNotNull(result);
        assertTrue(result instanceof String);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionName_oneArgument() throws Exception {
        evalContext = mock(EvalContext.class);
        nodePointer = mock(NodePointer.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1});
        when(coreFunction.getArgumentCount()).thenReturn(1);
        when(coreFunction.getArg1()).thenReturn(arg1);
        when(arg1.compute(evalContext)).thenReturn(evalContext);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(nodePointer.getName()).thenReturn(mock(QName.class));
        Object result = coreFunction.functionName(evalContext);
        assertNotNull(result);
        assertTrue(result instanceof String);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionName_oneArgument_noNext() throws Exception {
        evalContext = mock(EvalContext.class);
        nodePointer = mock(NodePointer.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1});
        when(coreFunction.getArgumentCount()).thenReturn(1);
        when(coreFunction.getArg1()).thenReturn(arg1);
        when(arg1.compute(evalContext)).thenReturn(evalContext);
        when(evalContext.hasNext()).thenReturn(false);
        Object result = coreFunction.functionName(evalContext);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI_noArguments() throws Exception {
        evalContext = mock(EvalContext.class);
        nodePointer = mock(NodePointer.class);
        arg1 = mock(Expression.class);
        corefunction = new CoreFunction(0, new Expression[]{arg1});
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getNamespaceURI()).thenReturn("namespace-uri");
        Object result = corefunction.functionNamespaceURI(evalContext);
        assertEquals("namespace-uri", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionConcat() throws Exception {
        evalContext = mock(EvalContext.class);
        args = new Expression[]{mock(Expression.class), mock(Expression.class)};
        coreFunction = new CoreFunction(1, args);
        when(args[0].compute(evalContext)).thenReturn("Hello");
        when(args[1].compute(evalContext)).thenReturn("World");
        Object result = coreFunction.functionConcat(evalContext);
        assertEquals("HelloWorld", result);
        verify(evalContext, times(1)).setPosition(anyInt());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionTranslate() throws Exception {
        arg1 = mock(Expression.class);
        arg2 = mock(Expression.class);
        arg3 = mock(Expression.class);
        context = mock(EvalContext.class);
        corefunction = new CoreFunction(1, new Expression[]{arg1, arg2, arg3});
        // given
        when(arg1.computeValue(context)).thenReturn("abc");
        when(arg2.computeValue(context)).thenReturn("a,b,c");
        when(arg3.computeValue(context)).thenReturn("x,y,z");
        // when
        Object result = corefunction.functionTranslate(context);
        // then
        assertEquals("x,y,z", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NoArguments_AUcd0() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[0]);
        assertEquals("functionName()", coreFunction.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NullArguments_ERLd3() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        assertEquals("functionName()", coreFunction.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionKey() throws Exception {
        coreFunction = new CoreFunction(1, new Expression[]{arg1, arg2});
        when(evalContext.getJXPathContext()).thenReturn(jxpathContext);
        // given
        when(arg1.computeValue(evalContext)).thenReturn("key");
        when(arg2.compute(evalContext)).thenReturn(nodePointer);
        when(nodePointer.getValue()).thenReturn("value");
        when(jxpathContext.getNodeSetByKey("key", "value")).thenReturn(nodeSet);
        // when
        Object result = coreFunction.functionKey(evalContext);
        // then
        assertNotNull(result);
        assertTrue(result instanceof NodeSetContext);
        verify(evalContext, times(1)).getJXPathContext();
        verify(arg1, times(1)).computeValue(evalContext);
        verify(arg2, times(1)).compute(evalContext);
        verify(nodePointer, times(1)).getValue();
        verify(jxpathContext, times(1)).getNodeSetByKey("key", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionKey_noNext() throws Exception {
        coreFunction = new CoreFunction(1, new Expression[]{arg1, arg2});
        when(evalContext.getJXPathContext()).thenReturn(jxpathContext);
        // given
        when(arg1.computeValue(evalContext)).thenReturn("key");
        when(arg2.compute(evalContext)).thenReturn(evalContext);
        when(evalContext.hasNext()).thenReturn(false);
        // when
        Object result = coreFunction.functionKey(evalContext);
        // then
        assertNotNull(result);
        assertTrue(result instanceof NodeSetContext);
        verify(evalContext, times(1)).getJXPathContext();
        verify(arg1, times(1)).computeValue(evalContext);
        verify(arg2, times(1)).compute(evalContext);
        verify(evalContext, times(1)).hasNext();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionKey_withNext() throws Exception {
        coreFunction = new CoreFunction(1, new Expression[]{arg1, arg2});
        when(evalContext.getJXPathContext()).thenReturn(jxpathContext);
        // given
        when(arg1.computeValue(evalContext)).thenReturn("key");
        when(arg2.compute(evalContext)).thenReturn(evalContext);
        when(evalContext.hasNext()).thenReturn(true, false);
        when(evalContext.next()).thenReturn(nodePointer);
        when(nodePointer.getValue()).thenReturn("value");
        when(jxpathContext.getNodeSetByKey("key", "value")).thenReturn(nodeSet);
        // when
        Object result = coreFunction.functionKey(evalContext);
        // then
        assertNotNull(result);
        assertTrue(result instanceof NodeSetContext);
        verify(evalContext, times(1)).getJXPathContext();
        verify(arg1, times(1)).computeValue(evalContext);
        verify(arg2, times(1)).compute(evalContext);
        verify(evalContext, times(2)).hasNext();
        verify(evalContext, times(1)).next();
        verify(nodePointer, times(1)).getValue();
        verify(jxpathContext, times(2)).getNodeSetByKey("key", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling() throws Exception {
        arg1 = mock(Expression.class);
        evalContext = mock(EvalContext.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // Arrange
        when(arg1.computeValue(evalContext)).thenReturn(10.5);
        when(InfoSetUtil.doubleValue(10.5)).thenReturn(10.5);
        // Act
        Object result = coreFunction.functionCeiling(evalContext);
        // Assert
        assertEquals(Double.valueOf(Math.ceil(10.5)), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling_NaN() throws Exception {
        arg1 = mock(Expression.class);
        evalContext = mock(EvalContext.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // Arrange
        when(arg1.computeValue(evalContext)).thenReturn(Double.NaN);
        when(InfoSetUtil.doubleValue(Double.NaN)).thenReturn(Double.NaN);
        // Act
        Object result = coreFunction.functionCeiling(evalContext);
        // Assert
        assertEquals(Double.valueOf(Double.NaN), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling_Infinity() throws Exception {
        arg1 = mock(Expression.class);
        evalContext = mock(EvalContext.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // Arrange
        when(arg1.computeValue(evalContext)).thenReturn(Double.POSITIVE_INFINITY);
        when(InfoSetUtil.doubleValue(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        // Act
        Object result = coreFunction.functionCeiling(evalContext);
        // Assert
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLocalName_noArguments() throws Exception {
        evalContext = mock(EvalContext.class);
        nodePointer = mock(NodePointer.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1});
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getName()).thenReturn(new QName("localName"));
        Object result = coreFunction.functionLocalName(evalContext);
        assertEquals("localName", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionStringLength_noArguments() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        nodePointer = mock(NodePointer.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1});
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(InfoSetUtil.stringValue(nodePointer)).thenReturn("Hello World");
        Object result = coreFunction.functionStringLength(evalContext);
        assertEquals(11.0, ((Double) result).doubleValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNormalizeSpace() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // given
        when(arg1.computeValue(evalContext)).thenReturn("   hello   world  ");
        String expected = " hello world ";
        // when
        Object result = coreFunction.functionNormalizeSpace(evalContext);
        // then
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionString_noArguments() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        nodePointer = mock(NodePointer.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1});
        when(coreFunction.getArgumentCount()).thenReturn(0);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(InfoSetUtil.stringValue(nodePointer)).thenReturn("nodePointerValue");
        Object result = coreFunction.functionString(evalContext);
        assertEquals("nodePointerValue", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionString_oneArgument() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        nodePointer = mock(NodePointer.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1});
        when(coreFunction.getArgumentCount()).thenReturn(1);
        when(coreFunction.getArg1()).thenReturn(arg1);
        when(arg1.computeValue(evalContext)).thenReturn(nodePointer);
        when(InfoSetUtil.stringValue(nodePointer)).thenReturn("nodePointerValue");
        Object result = coreFunction.functionString(evalContext);
        assertEquals("nodePointerValue", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent3_EJSU2() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[2]);
        assertTrue(coreFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent4_qnET3() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[1]);
        assertFalse(coreFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent5_Fkny4() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[2]);
        assertFalse(coreFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent6_WalD5() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertTrue(coreFunction.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor() throws Exception {
        arg1 = mock(Expression.class);
        evalContext = mock(EvalContext.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // Arrange
        when(arg1.computeValue(evalContext)).thenReturn(10.5);
        when(InfoSetUtil.doubleValue(10.5)).thenReturn(10.5);
        // Act
        Object result = coreFunction.functionFloor(evalContext);
        // Assert
        assertEquals(Double.valueOf(Math.floor(10.5)), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor_NaN() throws Exception {
        arg1 = mock(Expression.class);
        evalContext = mock(EvalContext.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // Arrange
        when(arg1.computeValue(evalContext)).thenReturn(Double.NaN);
        when(InfoSetUtil.doubleValue(Double.NaN)).thenReturn(Double.NaN);
        // Act
        Object result = coreFunction.functionFloor(evalContext);
        // Assert
        assertEquals(Double.valueOf(Double.NaN), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor_Infinite() throws Exception {
        arg1 = mock(Expression.class);
        evalContext = mock(EvalContext.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // Arrange
        when(arg1.computeValue(evalContext)).thenReturn(Double.POSITIVE_INFINITY);
        when(InfoSetUtil.doubleValue(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        // Act
        Object result = coreFunction.functionFloor(evalContext);
        // Assert
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionRound() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // given
        when(arg1.computeValue(evalContext)).thenReturn(10.5);
        when(InfoSetUtil.doubleValue(10.5)).thenReturn(10.5);
        // when
        Object result = coreFunction.functionRound(evalContext);
        // then
        assertEquals(Double.valueOf(11.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionRound_NaN() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // given
        when(arg1.computeValue(evalContext)).thenReturn(Double.NaN);
        when(InfoSetUtil.doubleValue(Double.NaN)).thenReturn(Double.NaN);
        // when
        Object result = coreFunction.functionRound(evalContext);
        // then
        assertEquals(Double.valueOf(Double.NaN), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionRound_Infinite() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        coreFunction = new CoreFunction(1, new Expression[]{arg1});
        // given
        when(arg1.computeValue(evalContext)).thenReturn(Double.POSITIVE_INFINITY);
        when(InfoSetUtil.doubleValue(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        // when
        Object result = coreFunction.functionRound(evalContext);
        // then
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionSubstring() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        arg2 = mock(Expression.class);
        arg3 = mock(Expression.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1, arg2, arg3});
        // Given
        when(arg1.computeValue(evalContext)).thenReturn("Hello World");
        when(arg2.computeValue(evalContext)).thenReturn(2.0);
        when(arg3.computeValue(evalContext)).thenReturn(5.0);
        // When
        Object result = coreFunction.functionSubstring(evalContext);
        // Then
        assertEquals("llo", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionSubstring_withTwoArgs() throws Exception {
        evalContext = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        arg2 = mock(Expression.class);
        arg3 = mock(Expression.class);
        coreFunction = new CoreFunction(0, new Expression[]{arg1, arg2, arg3});
        // Given
        coreFunction = new CoreFunction(0, new Expression[]{arg1, arg2});
        when(arg1.computeValue(evalContext)).thenReturn("Hello World");
        when(arg2.computeValue(evalContext)).thenReturn(2.0);
        // When
        Object result = coreFunction.functionSubstring(evalContext);
        // Then
        assertEquals("llo World", result);
    }
}