/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreFunction_Test_Passing {
    CoreFunction corefunction;
    private int functionCode;
    private EvalContext context;
    Expression expression;
    NamespaceContext namespaceContext;
    SelfContext selfContext;
    NodeTypeTest nodeTypeTest;
    Expression[] args;
    NamespaceContext parentContext;
    NodeTypeTest nodeTest;
    JXPathContext jxpathContext;
    NodePointer nodePointer;
    Pointer contextNodePointer;
    RootContext rootContext;
    List contextNodeList;
    Object value;
    String lang;
    boolean isLanguage;
    @Mock
    private CoreFunction coreFunction;
    @Mock
    Expression arg1;
    @Mock
    Expression arg2;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArg2_PpZr0() {
        Expression[] expressions = new Expression[2];
        CoreFunction coreFunction = new CoreFunction(1, expressions);
        Expression result = coreFunction.getArg2();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArg3_rLBe0() {
        CoreFunction coreFunction = new CoreFunction(0, new Expression[]{null, null, null, null});
        Expression arg3 = coreFunction.getArg3();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionBoolean() throws Exception {
        context = mock(EvalContext.class);
        expression = mock(Expression.class);
        namespaceContext = mock(NamespaceContext.class);
        selfContext = mock(SelfContext.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        corefunction = new CoreFunction(1, new Expression[]{expression});
        when(expression.computeValue(context)).thenReturn(true);
        Object result = corefunction.functionBoolean(context);
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionFalse() throws Exception {
        corefunction = new CoreFunction(0, new Expression[0]);
        EvalContext context = mock(EvalContext.class);
        when(context.getValue()).thenReturn(Boolean.FALSE);
        Object result = corefunction.functionFalse(context);
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionPosition() throws Exception {
        corefunction = new CoreFunction(0, new Expression[0]);
        EvalContext context = mock(EvalContext.class);
        when(context.getCurrentPosition()).thenReturn(1);
        Object result = corefunction.functionPosition(context);
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFunctionName_last_YAFY0() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        assertEquals("last", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFunctionName_position_IaUD1() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[0]);
        assertEquals("position", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getFunctionName_unknownFunction_wQND2() {
        CoreFunction coreFunction = new CoreFunction(12345, new Expression[0]);
        assertEquals("unknownFunction12345()", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfunctionStartsWith() throws Exception {
        args = new Expression[2];
        args[0] = mock(Expression.class);
        args[1] = mock(Expression.class);
        corefunction = new CoreFunction(0, args);
        context = mock(EvalContext.class);
        parentContext = mock(NamespaceContext.class);
        nodeTest = mock(NodeTypeTest.class);
        selfContext = new SelfContext(parentContext, nodeTest);
        when(args[0].computeValue(context)).thenReturn("test1");
        when(args[1].computeValue(context)).thenReturn("test");
        Object result = corefunction.functionStartsWith(context);
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue_fid1() throws Exception {
        functionCode = 1; // set the function code
        context = mock(EvalContext.class); // create a mock context
        corefunction = new CoreFunction(functionCode, new Expression[0]); // create a CoreFunction object with the mock context
        when(context.getValue()).thenReturn("test value"); // set the return value of the context's getValue() method
        Object result = corefunction.computeValue(context); // call the computeValue method
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNoArguments_XfoS0_fid1() {
        CoreFunction function = new CoreFunction(1, new Expression[0]);
        assertEquals("last()", function.toString());
    }
}