/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void nodeNameTest_roAe0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object qname = new Object(); // Replace with actual parameter value
        Object nodeNameTest = treeCompiler.nodeNameTest(qname);
        assertNotNull(nodeNameTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_ibQB0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object argument = new Object();
        Object result = treeCompiler.minus(argument);
        assertEquals(new CoreOperationNegate((Expression) argument), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiply_jbcp0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Integer(5);
        Object right = new Integer(10);
        Object result = treeCompiler.multiply(left, right);
        assertEquals(50, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_chDz0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object expression = new Object();
        Object[] predicates = new Object[1];
        Object[] steps = new Object[1];
        Object result = treeCompiler.expressionPath(expression, predicates, steps);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_pIlj0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        arguments[0] = new Object();
        arguments[1] = new Object();
        Object result = treeCompiler.union(arguments);
        assertEquals(new CoreOperationUnion(new Expression[]{}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testFunction_YXCx0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] args = new Object[0];
        Object result = treeCompiler.function(0, args);
        assertEquals(new CoreFunction(0, new Expression[0]), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteral_FzmI0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.literal("example");
        assertEquals(new Constant("example"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_QhKT0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Integer(5);
        Object right = new Integer(3);
        Object result = treeCompiler.minus(left, right);
        assertEquals(2, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_mVeQ0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = {new CoreOperationAdd(new Expression[]{})};
        Object result = treeCompiler.sum(arguments);
        assertEquals(new CoreOperationAdd(new Expression[]{}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_DDVw0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object qName = new Object(); // Replace with actual value
        Object expected = new Object(); // Replace with expected value
        Object actual = treeCompiler.variableReference(qName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumber_sZsp0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.number("10");
        assertEquals(new Constant(10.0), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction_KHND0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object name = new Object();
        Object[] args = new Object[2];
        args[0] = new Object();
        args[1] = new Object();
        Object result = treeCompiler.function(name, args);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiply_jbcp0_fid1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Integer(5);
        Object right = new Integer(10);
        Object result = treeCompiler.multiply(left, right);
        assertEquals(50, ((Number) result).intValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumber_sZsp0_fid1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.number("10");
        assertEquals(10.0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction_KHND0_fid1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object name = new Object();
        Object[] args = new Object[2];
        args[0] = new Object();
        args[1] = new Object();
        Object result = treeCompiler.function(name, args);
        // Add assertion here
        // For example:
        // assertEquals(expectedValue, result);
    }
}