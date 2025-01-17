/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMod_sxUF0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object expected = new CoreOperationMod((Expression) left, (Expression) right);
        Object actual = treeCompiler.mod(left, right);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_minus_0_piDE0() throws Exception {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object argument = new Object();
        Object result = treeCompiler.minus(argument);
        Assertions.assertEquals(new CoreOperationNegate((Expression) argument), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiplyWithNullLeft_FXBJ1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = new Object();
        try {
            treeCompiler.multiply(left, right);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("left", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiplyWithNullRight_wQJF2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = null;
        try {
            treeCompiler.multiply(left, right);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("right", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiplyWithNullLeftAndRight_XnUv3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = null;
        try {
            treeCompiler.multiply(left, right);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("left", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_owPM0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object actual = treeCompiler.lessThanOrEqual(left, right);
        Object expected = new CoreOperationLessThanOrEqual((Expression) left, (Expression) right);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqual_RnYm0() {
        TreeCompiler compiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = compiler.notEqual(left, right);
        assertEquals(new CoreOperationNotEqual((Expression) left, (Expression) right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDivide_qdwE0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object expected = new CoreOperationDivide((Expression) left, (Expression) right);
        Object actual = treeCompiler.divide(left, right);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_Pyuc0() {
        Object qName = new Object();
        TreeCompiler treeCompiler = new TreeCompiler();
        Object variableReference = treeCompiler.variableReference(qName);
        VariableReference expected = new VariableReference((QName) qName);
        assertEquals(expected, variableReference);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_minus_3_XDyA2() {
        Object left = new Object();
        Object right = new Object();
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.minus(left, right);
        Object expected = new CoreOperationSubtract((Expression) left, (Expression) right);
        assertEquals(expected, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_ckRL0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object actual = treeCompiler.lessThan(left, right);
        Object expected = new CoreOperationLessThan((Expression) left, (Expression) right);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_eDog0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        arguments[0] = 1;
        arguments[1] = 2;
        Object result = treeCompiler.sum(arguments);
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum2_bIpS1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        arguments[0] = 3;
        arguments[1] = 4;
        Object result = treeCompiler.sum(arguments);
        assertEquals(7, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum3_jBXl2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        arguments[0] = 5;
        arguments[1] = 6;
        Object result = treeCompiler.sum(arguments);
        assertEquals(11, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_equal_1_cIwj0() {
        TreeCompiler object = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object actual = object.equal(left, right);
        Object expected = new CoreOperationEqual((Expression) left, (Expression) right);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_minus_3_XDyA2_fid1() {
        Object left = new Object();
        Object right = new Object();
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.minus(left, right);
        Expression expected = new CoreOperationSubtract((Expression) left, (Expression) right);
        assertEquals(expected, result);
    }
}