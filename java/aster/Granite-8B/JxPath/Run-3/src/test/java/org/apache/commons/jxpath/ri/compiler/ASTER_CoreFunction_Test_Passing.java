/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
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
public class Aster_CoreFunction_Test_Passing {
    @Mock
    private EvalContext context;
    @Mock
    private NodePointer pointer;
    @Mock
    private JXPathContext jxpathContext;
    private CoreFunction corefunction;
    private int functionCode;
    @Mock
    private Expression[] args;
    @Mock
    private NodePointer ptr;
    @Mock
    private NodeSet nodeSet;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private RootContext rootContext;
    @Mock
    private Expression arg1;
    @Mock
    private Expression arg2;
    @Mock
    private Expression arg3;
    private static Double ZERO = Double.valueOf(0);

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionID() {
        corefunction = new CoreFunction(0, new Expression[0]);
        when(context.getJXPathContext()).thenReturn(jxpathContext);
        when(jxpathContext.getContextPointer()).thenReturn(pointer);
        // Set up the expected behavior of the mock objects
        when(pointer.getPointerByID(jxpathContext, "id")).thenReturn(pointer);
        // Call the functionID method and make assertions
        Object result = corefunction.functionID(context);
        assertEquals(pointer, result);
        // Verify that the expected method calls were made
        verify(pointer).getPointerByID(jxpathContext, "id");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetArg2_iKNx0() {
        Expression[] args = new Expression[2];
        CoreFunction coreFunction = new CoreFunction(0, args);
        Expression arg2 = coreFunction.getArg2();
        assertNotNull(arg2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception {
        functionCode = 1; // Choose a function code
        corefunction = new CoreFunction(functionCode, null);
        context = mock(EvalContext.class);
        Object result = corefunction.computeValue(context);
        // Add assertions here to test the computeValue method
        // For example, you can check if the result is null or not
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArg1_QStC0() {
        Expression[] args = new Expression[1];
        CoreFunction coreFunction = new CoreFunction(0, args);
        Expression arg1 = coreFunction.getArg1();
        assertNotNull(arg1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSelfContext_bfPK0() {
        SelfContext selfContext = new SelfContext(null, null);
        assertNotNull(selfContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_RLzy1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        assertNotNull(nodeTypeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceContext_Orwc2() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        assertNotNull(namespaceContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArg3_bquS0() {
        Expression[] args = new Expression[3];
        CoreFunction coreFunction = new CoreFunction(0, args);
        Expression arg3 = coreFunction.getArg3();
        assertNotNull(arg3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLang() throws Exception {
        corefunction = new CoreFunction(1, new Expression[1]);
        when(context.getSingleNodePointer()).thenReturn(pointer);
        // Arrange
        final String lang = "en";
        when(pointer.isLanguage(lang)).thenReturn(true);
        // Act
        final Object result = corefunction.functionLang(context);
        // Assert
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionPosition() {
        corefunction = new CoreFunction(0, new Expression[0]);
        when(context.getCurrentPosition()).thenReturn(10);
        Object result = corefunction.functionPosition(context);
        assertEquals(10, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionLast() {
        corefunction = new CoreFunction(0, new Expression[0]);
        when(context.getCurrentPosition()).thenReturn(1);
        when(context.nextNode()).thenReturn(true, true, false);
        when(context.getJXPathContext()).thenReturn(Mockito.mock(JXPathContext.class));
        when(context.hasNext()).thenReturn(true, false);
        when(context.nextSet()).thenReturn(true, false);
        when(context.getContextNodePointer()).thenReturn(nodePointer);
        when(context.getPosition()).thenReturn(1);
        when(context.getDocumentOrder()).thenReturn(1);
        when(context.getContextNodeList()).thenReturn(Collections.singletonList(pointer));
        when(context.getRootContext()).thenReturn(rootContext);
        when(context.getCurrentPosition()).thenReturn(1);
        when(context.isChildOrderingRequired()).thenReturn(true);
        Object result = corefunction.functionLast(context);
        assertEquals(3.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNot_1() {
        corefunction = new CoreFunction(1, new Expression[]{arg1});
        when(arg1.computeValue(context)).thenReturn(true);
        when(arg1.computeValue(context)).thenReturn(false);
        assertEquals(false, corefunction.functionNot(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNot_2() {
        corefunction = new CoreFunction(1, new Expression[]{arg1});
        when(arg1.computeValue(context)).thenReturn(true);
        when(arg1.computeValue(context)).thenReturn(false);
        assertEquals(true, corefunction.functionNot(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgumentCount_withNullArgs_XYCS0() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        int argumentCount = coreFunction.getArgumentCount();
        assertEquals(0, argumentCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getArgumentCount_withNonNullArgs_tDrF1() {
        Expression[] args = new Expression[5];
        CoreFunction coreFunction = new CoreFunction(0, args);
        int argumentCount = coreFunction.getArgumentCount();
        assertEquals(5, argumentCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_0_nUhU0() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        assertEquals("last", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_1_ZSrT1() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        assertEquals("position", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_2_Nhzi2() {
        CoreFunction coreFunction = new CoreFunction(2, null);
        assertEquals("count", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_3_EXWP3() {
        CoreFunction coreFunction = new CoreFunction(3, null);
        assertEquals("id", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_4_zTZf4() {
        CoreFunction coreFunction = new CoreFunction(4, null);
        assertEquals("local-name", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_5_gaxp5() {
        CoreFunction coreFunction = new CoreFunction(5, null);
        assertEquals("namespace-uri", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_6_Mvca6() {
        CoreFunction coreFunction = new CoreFunction(6, null);
        assertEquals("name", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_7_EPEg7() {
        CoreFunction coreFunction = new CoreFunction(7, null);
        assertEquals("string", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_8_zjSz8() {
        CoreFunction coreFunction = new CoreFunction(8, null);
        assertEquals("concat", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_9_QboV9() {
        CoreFunction coreFunction = new CoreFunction(9, null);
        assertEquals("starts-with", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_10_bZqZ10() {
        CoreFunction coreFunction = new CoreFunction(10, null);
        assertEquals("ends-with", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_11_kQNI11() {
        CoreFunction coreFunction = new CoreFunction(11, null);
        assertEquals("contains", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_12_vDDp12() {
        CoreFunction coreFunction = new CoreFunction(12, null);
        assertEquals("substring-before", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_13_LEPh13() {
        CoreFunction coreFunction = new CoreFunction(13, null);
        assertEquals("substring-after", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_14_BVAW14() {
        CoreFunction coreFunction = new CoreFunction(14, null);
        assertEquals("substring", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_15_jUNv15() {
        CoreFunction coreFunction = new CoreFunction(15, null);
        assertEquals("string-length", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_16_BRdf16() {
        CoreFunction coreFunction = new CoreFunction(16, null);
        assertEquals("normalize-space", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_17_oRPB17() {
        CoreFunction coreFunction = new CoreFunction(17, null);
        assertEquals("translate", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_18_Zyla18() {
        CoreFunction coreFunction = new CoreFunction(18, null);
        assertEquals("boolean", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_19_HDOM19() {
        CoreFunction coreFunction = new CoreFunction(19, null);
        assertEquals("not", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionName_20_vUZk20() {
        CoreFunction coreFunction = new CoreFunction(20, null);
        assertEquals("true", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionKey() {
        corefunction = new CoreFunction(0, args);
        when(context.getJXPathContext()).thenReturn(jxpathContext);
        when(jxpathContext.getNodeSetByKey(anyString(), any())).thenReturn(nodeSet);
        when(context.next()).thenReturn(nodePointer);
        when(nodePointer.getValue()).thenReturn("value");
        Object result = corefunction.functionKey(context);
        verify(jxpathContext).getNodeSetByKey(anyString(), any());
        verify(context).next();
        verify(nodePointer).getValue();
        // Add assertions here to verify the behavior of the functionKey method
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionCeiling_1() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(2.0, corefunction.functionCeiling(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionCeiling_2() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(1.0, corefunction.functionCeiling(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionCeiling_3() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(-1.0, corefunction.functionCeiling(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNormalizeSpace() throws Exception {
        corefunction = new CoreFunction(1, args);
        when(context.getCurrentNodePointer()).thenReturn(nodePointer);
        when(args[0].computeValue(context)).thenReturn("   Hello World   ");
        String result = (String) corefunction.functionNormalizeSpace(context);
        assertEquals("Hello World", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionString_1() {
        corefunction = new CoreFunction(0, args);
        when(context.getCurrentNodePointer()).thenReturn(Mockito.mock(NodePointer.class));
        when(args.length).thenReturn(0);
        when(args.length).thenReturn(1);
        when(args[0].computeValue(context)).thenReturn(Mockito.mock(NodePointer.class));
        assertEquals("Expected result", corefunction.functionString(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getFunctionCode_FGQB0() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[0]);
        assertEquals(1, coreFunction.getFunctionCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor_1() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.7);
        when(args[0].computeValue(context)).thenReturn(1.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.7);
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(1.0, corefunction.functionFloor(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor_4() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.7);
        when(args[0].computeValue(context)).thenReturn(1.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.7);
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(-2.0, corefunction.functionFloor(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor_6() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.7);
        when(args[0].computeValue(context)).thenReturn(1.0);
        when(args[0].computeValue(context)).thenReturn(-1.5);
        when(args[0].computeValue(context)).thenReturn(-1.7);
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(-1.0, corefunction.functionFloor(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionContains() {
        corefunction = new CoreFunction(0, new Expression[]{arg1, arg2});
        when(arg1.computeValue(context)).thenReturn("Hello World");
        when(arg2.computeValue(context)).thenReturn("World");
        Object result = corefunction.functionContains(context);
        assertTrue((Boolean) result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent1_zudP0() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LAST, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent2_DFik1() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent3_lndj2() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent4_oHUT3() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent5_ojxl4() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAME, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent6_wMNw5() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent7_EarS6() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STRING, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent8_eVtx7() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LANG, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent9_PxjW8() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NUMBER, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent10_botw9() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent11_TIYH10() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent12_xOGS11() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_ID, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent13_aMFw12() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_CONCAT, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent14_fEVh13() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionRound_1() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.7);
        when(args[0].computeValue(context)).thenReturn(1.2);
        when(args[0].computeValue(context)).thenReturn(1.8);
        assertEquals(2.0, corefunction.functionRound(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionRound_3() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        when(args[0].computeValue(context)).thenReturn(1.7);
        when(args[0].computeValue(context)).thenReturn(1.2);
        when(args[0].computeValue(context)).thenReturn(1.8);
        assertEquals(1.0, corefunction.functionRound(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNumber() throws Exception {
        context = mock(EvalContext.class);
        args = new Expression[1];
        args[0] = mock(Expression.class);
        corefunction = new CoreFunction(1, args);
        when(context.getCurrentNodePointer()).thenReturn(mock(NodePointer.class));
        assertEquals(1, corefunction.functionNumber(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNamespaceURI_yBrU0() {
        corefunction = new CoreFunction(0, new Expression[0]);
        when(context.getCurrentNodePointer()).thenReturn(ptr);
        when(ptr.getNamespaceURI()).thenReturn("namespaceURI");
        String result = (String) corefunction.functionNamespaceURI(context);
        assertEquals("namespaceURI", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionConcat_Yefg0() {
        corefunction = new CoreFunction(0, args);
        when(args.length).thenReturn(2);
        when(args[0].compute(context)).thenReturn("Hello");
        when(args[1].compute(context)).thenReturn("World");
        String result = (String) corefunction.functionConcat(context);
        assertEquals("HelloWorld", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNull_QWJb0() {
        corefunction = new CoreFunction(0, args);
        when(context.getPosition()).thenReturn(1);
        when(context.getJXPathContext()).thenReturn(Mockito.mock(JXPathContext.class));
        when(context.hasNext()).thenReturn(true);
        when(context.nextNode()).thenReturn(true);
        when(context.toString()).thenReturn("toString");
        when(context.getValue()).thenReturn(Mockito.mock(Object.class));
        when(context.next()).thenReturn(Mockito.mock(Object.class));
        when(context.getNodeSet()).thenReturn(Mockito.mock(NodeSet.class));
        when(context.getCurrentNodePointer()).thenReturn(Mockito.mock(NodePointer.class));
        when(context.getRootContext()).thenReturn(Mockito.mock(RootContext.class));
        when(context.getCurrentPosition()).thenReturn(1);
        when(context.isChildOrderingRequired()).thenReturn(true);
        Object result = corefunction.functionNull(context);
        verify(context, times(1)).getPosition();
        verify(context, times(1)).getJXPathContext();
        verify(context, times(1)).hasNext();
        verify(context, times(1)).nextNode();
        verify(context, times(1)).toString();
        verify(context, times(1)).getValue();
        verify(context, times(1)).next();
        verify(context, times(1)).getNodeSet();
        verify(context, times(1)).getCurrentNodePointer();
        verify(context, times(1)).getRootContext();
        verify(context, times(1)).getCurrentPosition();
        verify(context, times(1)).isChildOrderingRequired();
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompute_FaCD0() throws Exception {
        functionCode = 1;
        context = mock(EvalContext.class);
        corefunction = new CoreFunction(functionCode, null);
        when(context.getJXPathContext()).thenReturn(mock(JXPathContext.class));
        when(context.nextNode()).thenReturn(true);
        when(context.nextSet()).thenReturn(true);
        when(context.getContextNodePointer()).thenReturn(mock(NodePointer.class));
        when(context.getPosition()).thenReturn(1);
        when(context.getDocumentOrder()).thenReturn(1);
        when(context.getContextNodeList()).thenReturn(Collections.singletonList(mock(NodePointer.class)));
        when(context.getCurrentNodePointer()).thenReturn(mock(NodePointer.class));
        when(context.getRootContext()).thenReturn(mock(RootContext.class));
        when(context.getCurrentPosition()).thenReturn(1);
        when(context.isChildOrderingRequired()).thenReturn(true);
        Object result = corefunction.compute(context);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionNot() {
        corefunction = new CoreFunction(1, new Expression[]{arg1});
        when(arg1.computeValue(context)).thenReturn(true);
        assertEquals(false, corefunction.functionNot(context));
        when(arg1.computeValue(context)).thenReturn(false);
        assertEquals(true, corefunction.functionNot(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionCeiling() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        assertEquals(2.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(1.0);
        assertEquals(1.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(-1.5);
        assertEquals(-1.0, corefunction.functionCeiling(context));
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(-1.0, corefunction.functionCeiling(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionString() {
        corefunction = new CoreFunction(0, args);
        when(context.getCurrentNodePointer()).thenReturn(Mockito.mock(NodePointer.class));
        when(args.length).thenReturn(0);
        assertEquals("Expected result", corefunction.functionString(context));
        when(args.length).thenReturn(1);
        when(args[0].computeValue(context)).thenReturn(Mockito.mock(NodePointer.class));
        assertEquals("Expected result", corefunction.functionString(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFloor() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        assertEquals(1.0, corefunction.functionFloor(context));
        when(args[0].computeValue(context)).thenReturn(1.7);
        assertEquals(1.0, corefunction.functionFloor(context));
        when(args[0].computeValue(context)).thenReturn(1.0);
        assertEquals(1.0, corefunction.functionFloor(context));
        when(args[0].computeValue(context)).thenReturn(-1.5);
        assertEquals(-2.0, corefunction.functionFloor(context));
        when(args[0].computeValue(context)).thenReturn(-1.7);
        assertEquals(-2.0, corefunction.functionFloor(context));
        when(args[0].computeValue(context)).thenReturn(-1.0);
        assertEquals(-1.0, corefunction.functionFloor(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionRound() {
        corefunction = new CoreFunction(1, args);
        when(args[0].computeValue(context)).thenReturn(1.5);
        assertEquals(2.0, corefunction.functionRound(context));
        when(args[0].computeValue(context)).thenReturn(1.7);
        assertEquals(2.0, corefunction.functionRound(context));
        when(args[0].computeValue(context)).thenReturn(1.2);
        assertEquals(1.0, corefunction.functionRound(context));
        when(args[0].computeValue(context)).thenReturn(1.8);
        assertEquals(2.0, corefunction.functionRound(context));
    }
}