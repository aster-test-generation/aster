/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreFunction_Test_Passing {
    @Mock
    private EvalContext evalContext;
    @Mock
    private JXPathContext jxpathContext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private InfoSetUtil infoSetUtil;
    @Mock
    private Expression expression;
    private int functionCode;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @InjectMocks
    private CoreFunction corefunction;
    @Mock
    private Expression expression1;
    @Mock
    private Expression expression2;
    @Mock
    private EvalContext ctx;
    @Mock
    private NodeSet nodeSet;
    private CoreFunction coreFunction;
    @Mock
    private EvalContext evalContext2;
    @Mock
    private NodePointer nodePointer2;
    @Mock
    private Expression[] args;
    @Mock
    private Collection collection;
    private static Double ZERO = Double.valueOf(0);
    @Mock
    private EvalContext arg1;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValueFunctionLast() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        functionCode = Compiler.FUNCTION_LAST;
        when(evalContext.nextNode()).thenReturn(true);
        when(evalContext.next()).thenReturn("test");
        when(evalContext.getValue()).thenReturn("test");
        // Act
        Object result = corefunction.computeValue(evalContext);
        // Assert
        assertEquals("test", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValueFunctionPosition() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        functionCode = Compiler.FUNCTION_POSITION;
        when(evalContext.getPosition()).thenReturn(1);
        // Act
        Object result = corefunction.computeValue(evalContext);
        // Assert
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeValueFunctionCount() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        functionCode = Compiler.FUNCTION_COUNT;
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.nextNode()).thenReturn(true);
        // Act
        Object result = corefunction.computeValue(evalContext);
        // Assert
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionSubstringBefore() throws Exception {
        corefunction = new CoreFunction(1, new Expression[]{expression1, expression2});
        // Arrange
        when(expression1.computeValue(evalContext)).thenReturn("HelloWorld");
        when(expression2.computeValue(evalContext)).thenReturn("World");
        when(infoSetUtil.stringValue(any())).thenReturn("HelloWorld");
        // Act
        Object result = corefunction.functionSubstringBefore(evalContext);
        // Assert
        assertEquals("Hello", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionFalse() {
        corefunction = new CoreFunction(1, new Expression[0]);
        // Arrange
        when(evalContext.getPosition()).thenReturn(0);
        when(evalContext.hasNext()).thenReturn(false);
        // Act
        Object result = corefunction.functionFalse(evalContext);
        // Assert
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLang_1() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(infoSetUtil.stringValue(anyString())).thenReturn("lang");
        when(evalContext.getSingleNodePointer()).thenReturn(nodePointer);
        when(nodePointer.isLanguage("lang")).thenReturn(true);
        Object result = corefunction.functionLang(evalContext);
        when(nodePointer.isLanguage("lang")).thenReturn(false);
        result = corefunction.functionLang(evalContext);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLang_2() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(infoSetUtil.stringValue(anyString())).thenReturn("lang");
        when(evalContext.getSingleNodePointer()).thenReturn(nodePointer);
        when(nodePointer.isLanguage("lang")).thenReturn(true);
        Object result = corefunction.functionLang(evalContext);
        when(nodePointer.isLanguage("lang")).thenReturn(false);
        result = corefunction.functionLang(evalContext);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionPosition() throws Exception {
        coreFunction = new CoreFunction(0, new Expression[0]);
        // Given
        when(evalContext.getCurrentPosition()).thenReturn(1);
        // When
        Object result = coreFunction.functionPosition(evalContext);
        // Then
        assertEquals(Integer.valueOf(1), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionName_GDUb0() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("last");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNamePosition_fwtx1() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("position");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameCount_hPnk2() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("count");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameId_BuGY3() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_ID, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("id");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameLocalName_bFAk4() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("local-name");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameNamespaceUri_sGQT5() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("namespace-uri");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameName_xxDL6() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAME, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("name");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameString_RcFn7() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("string");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameConcat_lgbe8() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_CONCAT, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("concat");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionNameStartsWith_nlPt9() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, new Expression[0]);
        String functionName = coreFunction.getFunctionName();
        assert functionName.equals("starts-with");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLast() throws Exception {
        MockitoAnnotations.initMocks(this);
        CoreFunction corefunction = new CoreFunction(1, new Expression[0]);
        // Set up the mock objects
        when(evalContext.nextNode()).thenReturn(true).thenReturn(false);
        when(evalContext.getPosition()).thenReturn(0).thenReturn(1);
        // Call the method under test
        Object result = corefunction.functionLast(evalContext);
        // Verify the result
        assertEquals(1, ((Double) result).intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArgumentCountWithNullArgs_hxrf0() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        assertEquals(0, coreFunction.getArgumentCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionStartsWith() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.getPosition()).thenReturn(0);
        when(evalContext.getJXPathContext()).thenReturn(null);
        when(expression1.computeValue(evalContext)).thenReturn("Hello");
        when(expression2.computeValue(evalContext)).thenReturn("HelloWorld");
        CoreFunction coreFunction = new CoreFunction(1, new Expression[]{expression1, expression2});
        boolean result = (boolean) coreFunction.functionStartsWith(evalContext);
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI_1() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getNamespaceURI()).thenReturn("namespaceURI");
        Object result = corefunction.functionNamespaceURI(evalContext);
        when(evalContext.hasNext()).thenReturn(false);
        result = corefunction.functionNamespaceURI(evalContext);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(nodePointer2.getNamespaceURI()).thenReturn("namespaceURI2");
        result = corefunction.functionNamespaceURI(evalContext2);
        assertEquals("namespaceURI", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI_2() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getNamespaceURI()).thenReturn("namespaceURI");
        Object result = corefunction.functionNamespaceURI(evalContext);
        when(evalContext.hasNext()).thenReturn(false);
        result = corefunction.functionNamespaceURI(evalContext);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(nodePointer2.getNamespaceURI()).thenReturn("namespaceURI2");
        result = corefunction.functionNamespaceURI(evalContext2);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI_3() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getNamespaceURI()).thenReturn("namespaceURI");
        Object result = corefunction.functionNamespaceURI(evalContext);
        when(evalContext.hasNext()).thenReturn(false);
        result = corefunction.functionNamespaceURI(evalContext);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(nodePointer2.getNamespaceURI()).thenReturn("namespaceURI2");
        result = corefunction.functionNamespaceURI(evalContext2);
        assertEquals("namespaceURI2", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionConcat() throws Exception {
        MockitoAnnotations.initMocks(this);
        corefunction = new CoreFunction(1, args);
        // Arrange
        String arg1 = "Hello";
        String arg2 = "World";
        when(args[0].compute(evalContext)).thenReturn(arg1);
        when(args[1].compute(evalContext)).thenReturn(arg2);
        // Act
        Object result = corefunction.functionConcat(evalContext);
        // Assert
        assertEquals("HelloWorld", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCount() throws Exception {
        corefunction = new CoreFunction(1, new Expression[]{expression});
        // Set up the mock objects
        when(expression.compute(evalContext)).thenReturn(nodePointer);
        when(nodePointer.getValue()).thenReturn(evalContext);
        // Set up the mock behavior for the EvalContext
        when(evalContext.hasNext()).thenReturn(true).thenReturn(false);
        when(evalContext.next()).thenReturn(nodePointer);
        // Call the functionCount method
        Object result = corefunction.functionCount(evalContext);
        // Assert the result
        assertEquals(1, ((Double) result).doubleValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoArguments_mGTE0() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[0]);
        String result = coreFunction.toString();
        assert result.equals("getFunctionName()");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullArguments_zyib3() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        String result = coreFunction.toString();
        assert result.equals("getFunctionName()");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.getPosition()).thenReturn(1);
        // Arrange
        double value = 3.5;
        when(evalContext.getValue()).thenReturn(value);
        // Act
        Object result = corefunction.functionCeiling(evalContext);
        // Assert
        assertEquals(Double.valueOf(4.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLocalName_noNext() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext.hasNext()).thenReturn(false);
        assertEquals("", corefunction.functionLocalName(evalContext));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLocalName_noNodePointer() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext.getCurrentNodePointer()).thenReturn(null);
        assertEquals("", corefunction.functionLocalName(evalContext));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLocalName_argCountNotZero() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext2).thenReturn(evalContext);
        assertEquals("", corefunction.functionLocalName(evalContext));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNull() throws Exception {
        corefunction = new CoreFunction(0, new Expression[0]);
        // Set up the mock EvalContext
        when(evalContext.getPosition()).thenReturn(0);
        when(evalContext.hasNext()).thenReturn(false);
        // Call the functionNull method
        Object result = corefunction.functionNull(evalContext);
        // Verify the result
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent1_mmFM0() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        boolean result = coreFunction.computeContextDependent();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent2_XYmG1() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[0]);
        boolean result = coreFunction.computeContextDependent();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent4_Asjp3() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[0]);
        boolean result = coreFunction.computeContextDependent();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent5_WUOu4() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, new Expression[0]);
        boolean result = coreFunction.computeContextDependent();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent6_GblS5() {
        CoreFunction coreFunction = new CoreFunction(0, new Expression[0]);
        boolean result = coreFunction.computeContextDependent();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunctionCode_EnYx0() {
        final int functionCode = 1;
        final Expression[] args = new Expression[0];
        CoreFunction coreFunction = new CoreFunction(functionCode, args);
        int result = coreFunction.getFunctionCode();
        assert result == functionCode;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor() throws Exception {
        corefunction = new CoreFunction(1, new Expression[0]);
        // Arrange
        when(evalContext.getPosition()).thenReturn(1);
        when(evalContext.getJXPathContext()).thenReturn(null);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.nextNode()).thenReturn(true);
        when(evalContext.getValue()).thenReturn(10.5);
        // Act
        Object result = corefunction.functionFloor(evalContext);
        // Assert
        assertEquals(Double.valueOf(10), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionName_jwRZ0() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(ctx.hasNext()).thenReturn(true);
        when(ctx.next()).thenReturn(nodePointer);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        Object result = corefunction.functionSubstring(evalContext);
        assertEquals(result.toString(), nodePointer.getName().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionKey_vuWX0() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.getJXPathContext()).thenReturn(jxpathContext);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(nodePointer.getValue()).thenReturn("value");
        when(jxpathContext.getNodeSetByKey("key", "value")).thenReturn(Mockito.mock(NodeSet.class));
        CoreFunction coreFunction = new CoreFunction(1, new Expression[2]);
        Object result = coreFunction.functionKey(evalContext);
        Assertions.assertTrue(result instanceof NodeSetContext);
        verify(evalContext, times(1)).getJXPathContext();
        verify(evalContext, times(1)).hasNext();
        verify(evalContext, times(1)).next();
        verify(jxpathContext, times(1)).getNodeSetByKey("key", "value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionStringLength_SGAW0() throws Exception {
        MockitoAnnotations.initMocks(this);
        coreFunction = new CoreFunction(1, new Expression[]{expression});
        NodePointer nodePointer = Mockito.mock(NodePointer.class);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.toString()).thenReturn("Hello");
        Object result = coreFunction.functionStringLength(evalContext);
        assertEquals(5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionTrue_OyYY0() throws Exception {
        corefunction = new CoreFunction(1, new Expression[0]);
        when(evalContext.getPosition()).thenReturn(0);
        when(evalContext.getJXPathContext()).thenReturn(null);
        when(evalContext.hasNext()).thenReturn(false);
        when(evalContext.nextNode()).thenReturn(null);
        when(evalContext.getValue()).thenReturn(null);
        when(evalContext.next()).thenReturn(null);
        when(evalContext.getNodeSet()).thenReturn(null);
        when(evalContext.nextSet()).thenReturn(null);
        when(evalContext.getContextNodePointer()).thenReturn(null);
        when(evalContext.getPosition()).thenReturn(0);
        when(evalContext.getDocumentOrder()).thenReturn(0);
        when(evalContext.getContextNodeList()).thenReturn(null);
        when(evalContext.getSingleNodePointer()).thenReturn(null);
        when(evalContext.getCurrentNodePointer()).thenReturn(null);
        when(evalContext.getRootContext()).thenReturn(null);
        when(evalContext.getCurrentPosition()).thenReturn(0);
        when(evalContext.isChildOrderingRequired()).thenReturn(false);
        Object result = corefunction.functionSubstring(evalContext);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_wpOg0() {
        functionCode = 1;
        corefunction = new CoreFunction(functionCode, new Expression[0]);
        when(evalContext.getPosition()).thenReturn(1);
        when(evalContext.getJXPathContext()).thenReturn(null);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.nextNode()).thenReturn(true);
        when(evalContext.getValue()).thenReturn("value");
        when(evalContext.next()).thenReturn(null);
        when(evalContext.getNodeSet()).thenReturn(null);
        when(evalContext.nextSet()).thenReturn(true);
        when(evalContext.getContextNodePointer()).thenReturn(null);
        when(evalContext.getPosition()).thenReturn(1);
        when(evalContext.getDocumentOrder()).thenReturn(1);
        when(evalContext.getContextNodeList()).thenReturn(null);
        when(evalContext.getSingleNodePointer()).thenReturn(null);
        when(evalContext.getCurrentNodePointer()).thenReturn(null);
        when(evalContext.getRootContext()).thenReturn(null);
        when(evalContext.getCurrentPosition()).thenReturn(1);
        when(evalContext.isChildOrderingRequired()).thenReturn(true);
        Object result = corefunction.functionSubstring(evalContext);
        assertEquals("value", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionContains_QsLI0() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.getPosition()).thenReturn(0);
        when(evalContext.getJXPathContext()).thenReturn(null);
        when(expression1.computeValue(evalContext)).thenReturn("Hello");
        when(expression2.computeValue(evalContext)).thenReturn("World");
        CoreFunction coreFunction = new CoreFunction(1, new Expression[]{expression1, expression2});
        Object result = coreFunction.functionSubstring(evalContext);
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNumber_VXWo0() throws Exception {
        MockitoAnnotations.initMocks(this);
        CoreFunction corefunction = new CoreFunction(1, new Expression[0]);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(infoSetUtil.stringValue(any(NodePointer.class))).thenReturn("number");
        Object result = corefunction.functionSubstring(evalContext);
        assertEquals("number", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionSubstring_EQCe0() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(infoSetUtil.stringValue(expression.computeValue(evalContext))).thenReturn("Hello");
        when(infoSetUtil.doubleValue(expression.computeValue(evalContext))).thenReturn(5.0);
        when(evalContext.getPosition()).thenReturn(1);
        when(evalContext.getJXPathContext()).thenReturn(null);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.nextNode()).thenReturn(true);
        when(evalContext.getValue()).thenReturn("Hello");
        when(evalContext.next()).thenReturn(null);
        when(evalContext.getNodeSet()).thenReturn(null);
        when(evalContext.nextSet()).thenReturn(true);
        when(evalContext.getContextNodePointer()).thenReturn(null);
        when(evalContext.getPosition()).thenReturn(1);
        when(evalContext.getDocumentOrder()).thenReturn(1);
        when(evalContext.getContextNodeList()).thenReturn(null);
        when(evalContext.getSingleNodePointer()).thenReturn(null);
        when(evalContext.getCurrentNodePointer()).thenReturn(null);
        when(evalContext.getRootContext()).thenReturn(null);
        when(evalContext.getCurrentPosition()).thenReturn(1);
        when(evalContext.isChildOrderingRequired()).thenReturn(false);
        Object result = corefunction.functionSubstring(evalContext);
        assertEquals("llo", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLang() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(infoSetUtil.stringValue(anyString())).thenReturn("lang");
        when(evalContext.getSingleNodePointer()).thenReturn(nodePointer);
        when(nodePointer.isLanguage("lang")).thenReturn(true);
        Object result = corefunction.functionLang(evalContext);
        assertEquals(Boolean.TRUE, result);
        when(nodePointer.isLanguage("lang")).thenReturn(false);
        result = corefunction.functionLang(evalContext);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(evalContext.hasNext()).thenReturn(true);
        when(evalContext.next()).thenReturn(nodePointer);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(evalContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getNamespaceURI()).thenReturn("namespaceURI");
        Object result = corefunction.functionNamespaceURI(evalContext);
        assertEquals("namespaceURI", result);
        when(evalContext.hasNext()).thenReturn(false);
        result = corefunction.functionNamespaceURI(evalContext);
        assertEquals("", result);
        when(evalContext2.hasNext()).thenReturn(true);
        when(evalContext2.next()).thenReturn(nodePointer2);
        when(nodePointer2.getNamespaceURI()).thenReturn("namespaceURI2");
        result = corefunction.functionNamespaceURI(evalContext2);
        assertEquals("namespaceURI2", result);
    }
}