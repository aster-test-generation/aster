/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreFunction_Test_Passing {
    @Mock
    EvalContext context;
    @Mock
    JXPathContext jxpathContext;
    @Mock
    NodePointer pointer;
    CoreFunction corefunction;
    private int functionCode;
    @Mock
    private Expression[] args;
    @Mock
    private Expression arg1;
    @Mock
    private Expression arg2;
    @Mock
    private NodePointer ptr;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private SelfContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private RootContext rootContext;
    @Mock
    private NodeSet nodeSet;
    @Mock
    private Expression arg3;
    @Mock
    private BasicNodeSet basicNodeSet;
    @Mock
    private EvalContext evalContext;
    private static Double ZERO = Double.valueOf(0);
    @Mock
    Expression expression;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSelfContext_ViBK0() {
        SelfContext selfContext = new SelfContext(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArg3_jFfi0() {
        Expression[] args = new Expression[3];
        CoreFunction coreFunction = new CoreFunction(0, args);
        Expression arg3 = coreFunction.getArg3();
        assertEquals(args[2], arg3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionBoolean() throws Exception {
        corefunction = new CoreFunction(1, args);
        // Set up the expected behavior of the mock objects
        when(context.getJXPathContext()).thenReturn(Mockito.mock(JXPathContext.class));
        when(args[0].computeValue(context)).thenReturn(Mockito.mock(Object.class));
        // Call the method under test
        Object result = corefunction.functionBoolean(context);
        // Verify that the expected behavior was executed
        verify(context).getJXPathContext();
        verify(args[0]).computeValue(context);
        // Assert that the result is correct
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetFunctionName_KnVN0() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        assertEquals("last", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNot_1() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(true);
        when(args[0].computeValue(context)).thenReturn(false);
        assertEquals(false, corefunction.functionNot(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNot_2() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(true);
        when(args[0].computeValue(context)).thenReturn(false);
        assertEquals(true, corefunction.functionNot(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgumentCount_1_dtJN0() {
        Expression[] args = null;
        CoreFunction fixture = new CoreFunction(1, args);
        int result = fixture.getArgumentCount();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgumentCount_2_KQwH1() {
        Expression[] args = new Expression[2];
        CoreFunction fixture = new CoreFunction(1, args);
        int result = fixture.getArgumentCount();
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI_1() {
        corefunction = new CoreFunction(0, new Expression[0]);
        when(context.getCurrentNodePointer()).thenReturn(ptr);
        when(ptr.getNamespaceURI()).thenReturn("http://example.com");
        when(ptr.getNamespaceURI()).thenReturn(null);
        assertEquals("http://example.com", corefunction.functionNamespaceURI(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI_2() {
        corefunction = new CoreFunction(0, new Expression[0]);
        when(context.getCurrentNodePointer()).thenReturn(ptr);
        when(ptr.getNamespaceURI()).thenReturn("http://example.com");
        when(ptr.getNamespaceURI()).thenReturn(null);
        assertEquals("", corefunction.functionNamespaceURI(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCount() {
        corefunction = new CoreFunction(1, new Expression[]{arg1});
        when(arg1.compute(context)).thenReturn(Collections.singletonList("value"));
        Object result = corefunction.functionCount(context);
        assertEquals(1.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionTranslate() throws Exception {
        corefunction = new CoreFunction(0, new Expression[]{arg1, arg2, arg3});
        final int argCount = 3;
        when(arg1.computeValue(context)).thenReturn("inputString");
        when(arg2.computeValue(context)).thenReturn("charsToRemove");
        when(arg3.computeValue(context)).thenReturn("replacementChars");
        final String s1 = "inputString";
        final String s2 = "charsToRemove";
        final String s3 = "replacementChars";
        final char[] chars = s1.toCharArray();
        int out = 0;
        for (int in = 0;in < chars.length;in++) {
            final char c = chars[in];
            final int inx = s2.indexOf(c);
            if (inx != -1) {
                if (inx < s3.length()) {
                    chars[out++] = s3.charAt(inx);
                }
            }
            else {
                chars[out++] = c;
            }
        }
        final String expectedResult = new String(chars, 0, out);
        final Object result = corefunction.functionTranslate(context);
        assertEquals(expectedResult, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling_1() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.2);
        when(args[0].computeValue(context)).thenReturn(2.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.2);
        when(args[0].computeValue(context)).thenReturn(-2.0);
        assertEquals(2.0, corefunction.functionCeiling(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling_4() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.2);
        when(args[0].computeValue(context)).thenReturn(2.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.2);
        when(args[0].computeValue(context)).thenReturn(-2.0);
        assertEquals(-1.0, corefunction.functionCeiling(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling_6() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.2);
        when(args[0].computeValue(context)).thenReturn(2.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.2);
        when(args[0].computeValue(context)).thenReturn(-2.0);
        assertEquals(-2.0, corefunction.functionCeiling(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent1_BOxK0() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LAST, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent2_OhHq1() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent3_vygG2() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent4_PyoH3() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent5_AmdC4() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAME, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent6_eHeF5() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetFunctionCode_YrXb0() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[]{});
        assertEquals(1, coreFunction.getFunctionCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionRound() throws Exception {
        corefunction = new CoreFunction(1, args);
        // Mock the behavior of the getArg1().computeValue(context) method
        when(args[0].computeValue(context)).thenReturn(1.5);
        // Call the functionRound method and assert the result
        assertEquals(2.0, corefunction.functionRound(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceContext_FKPF22() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_iODI23() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCoreFunction_cWdA24() {
        CoreFunction coreFunction = new CoreFunction(0, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionConcat_QcPf0() {
        corefunction = new CoreFunction(1, args);
        when(args.length).thenReturn(2);
        when(args[0].compute(context)).thenReturn("Hello");
        when(args[1].compute(context)).thenReturn("World");
        String result = (String) corefunction.functionConcat(context);
        assertEquals("HelloWorld", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNot() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(true);
        assertEquals(false, corefunction.functionNot(context));
        when(args[0].computeValue(context)).thenReturn(false);
        assertEquals(true, corefunction.functionNot(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI() {
        corefunction = new CoreFunction(0, new Expression[0]);
        when(context.getCurrentNodePointer()).thenReturn(ptr);
        when(ptr.getNamespaceURI()).thenReturn("http://example.com");
        assertEquals("http://example.com", corefunction.functionNamespaceURI(context));
        when(ptr.getNamespaceURI()).thenReturn(null);
        assertEquals("", corefunction.functionNamespaceURI(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionCeiling() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        assertEquals(2.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(1.2);
        assertEquals(2.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(2.0);
        assertEquals(2.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(-1.5);
        assertEquals(-1.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(-1.2);
        assertEquals(-1.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(-2.0);
        assertEquals(-2.0, corefunction.functionCeiling(context));
    }
}