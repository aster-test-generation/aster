/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreFunction_Coverage_Test_Failing {
    CoreFunction coreFunction;
    EvalContext context;
    private InfoSetUtil infoSetUtil;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_functionCode_formatNumber_SfzF10() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_functionCode_count_VESW11() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_functionCode_id_lZDC12() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_ID, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_functionCode_concat_BAae13() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_CONCAT, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_functionCode_startsWith_vvWF14() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, null);
        boolean result = coreFunction.computeContextDependent();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionNamespaceURI_withArguments_hasNext_nextNode_sidZ3_xtRx1() {
        CoreFunction function = new CoreFunction(1, new Expression[1]);
        NamespaceContext context = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        context.setPosition(1);
        context.nextNode();
        Object result = function.functionNamespaceURI(context);
        Assertions.assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionKey6_VDfj5_OmRr0() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        EvalContext context = new NodeSetContext(null, new BasicNodeSet());
        context.setPosition(1);
        context.nextNode();
        context.nextSet();
        context.remove();
        context.reset();
        Object result = coreFunction.functionKey(context);
        Assertions.assertEquals(new NodeSetContext(context, new BasicNodeSet()), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionKey6_VDfj5_OmRr0_fid1() {
        CoreFunction coreFunction = new CoreFunction(0, null);
        EvalContext context = new NodeSetContext(null, new BasicNodeSet());
        context.setPosition(1);
        context.nextNode();
        context.nextSet();
        context.reset();
        Object result = coreFunction.functionKey(context);
        Assertions.assertEquals(new NodeSetContext(context, new BasicNodeSet()), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionEndsWith_DVAs1() {
        assertEquals(Boolean.TRUE, coreFunction.functionEndsWith(context));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_RsON1() {
        String expected = "functionName(arg1, arg2)";
        String actual = coreFunction.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullArguments_meUU2() {
        coreFunction = new CoreFunction(1, null);
        String expected = "functionName()";
        String actual = coreFunction.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyArguments_ROvR3() {
        coreFunction = new CoreFunction(1, new Expression[0]);
        String expected = "functionName()";
        String actual = coreFunction.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithFunctionName_KqMH6() {
        coreFunction = new CoreFunction(1, new Expression[0]);
        String expected = "functionName";
        String actual = coreFunction.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionStringWithNoArguments_pAhV1() {
        String result = (String) coreFunction.functionString(context);
        assertEquals("", result);
    }
}