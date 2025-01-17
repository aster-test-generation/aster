/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Test_Failing {
    private Step[] toStepArray(final Object[] array) {
        Step[] stepArray = null;
        if (array != null) {
            stepArray = new Step[array.length];
            for (int i = 0;i < stepArray.length;i++) {
                stepArray[i] = (Step) array[i];
            }
        }
        return stepArray;
    }

    private Expression[] toExpressionArray(final Object[] array) {
        Expression[] expressionArray = null;
        if (array != null) {
            expressionArray = new Expression[array.length];
            for (int i = 0;i < expressionArray.length;i++) {
                expressionArray[i] = (Expression) array[i];
            }
        }
        return expressionArray;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_NameAttributeTest_pCHz0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object(); // Initialize left object
        Object right = new Object(); // Initialize right object
        Object result = treeCompiler.equal(left, right);
        assertEquals(new NameAttributeTest((Expression) left, (Expression) right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_CoreOperationEqual_dSBZ1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object(); // Initialize left object
        Object right = new Object(); // Initialize right object
        Object result = treeCompiler.equal(left, right);
        assertEquals(new CoreOperationEqual((Expression) left, (Expression) right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_WmeV0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object qname = new Object(); // Initialize qname with appropriate value
        Object result = treeCompiler.nodeNameTest(qname);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMod_xrLD0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.mod(left, right);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOr_DgWR0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[2];
        Object result = treeCompiler.or(arguments);
        assertEquals(new CoreOperationOr(toExpressionArray(arguments)), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_XTbg0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[0];
        Object result = treeCompiler.and(arguments);
        assertEquals(new CoreOperationAnd(toExpressionArray(arguments)), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_KAmH0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object argument = new Object();
        Object result = treeCompiler.minus(argument);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiply_jzCy0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.multiply(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiplyWithNullLeft_gMlr2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = new Object();
        Object result = treeCompiler.multiply(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiplyWithNullRight_PmLo3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = null;
        Object result = treeCompiler.multiply(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath_TJlt0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object expression = new Object();
        Object[] predicates = new Object[0];
        Object[] steps = new Object[0];
        Object result = treeCompiler.expressionPath(expression, predicates, steps);
        assertEquals(new ExpressionPath((Expression) expression, toExpressionArray(predicates), toStepArray(steps)), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionWithArguments_aLAE1() {
        Object[] arguments = new Object[1]; // Initialize the arguments array with some values
        arguments[0] = new Object(); // Initialize the first element of the array
        TreeCompiler treeCompiler = new TreeCompiler(); // Create an object of TreeCompiler
        Object result = treeCompiler.union(arguments); // Call the union method
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionWithMultipleArguments_slGc2() {
        Object[] arguments = new Object[3]; // Initialize the arguments array with multiple values
        arguments[0] = new Object(); // Initialize the first element of the array
        arguments[1] = new Object(); // Initialize the second element of the array
        arguments[2] = new Object(); // Initialize the third element of the array
        TreeCompiler treeCompiler = new TreeCompiler(); // Create an object of TreeCompiler
        Object result = treeCompiler.union(arguments); // Call the union method
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionWithSingleArgument_mJqN5() {
        Object[] arguments = new Object[1]; // Initialize the arguments array with a single value
        arguments[0] = new Object(); // Initialize the first element of the array
        TreeCompiler treeCompiler = new TreeCompiler(); // Create an object of TreeCompiler
        Object result = treeCompiler.union(arguments); // Call the union method
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionWithTwoArguments_RbGF6() {
        Object[] arguments = new Object[2]; // Initialize the arguments array with two values
        arguments[0] = new Object(); // Initialize the first element of the array
        arguments[1] = new Object(); // Initialize the second element of the array
        TreeCompiler treeCompiler = new TreeCompiler(); // Create an object of TreeCompiler
        Object result = treeCompiler.union(arguments); // Call the union method
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionWithThreeArguments_tFIW7() {
        Object[] arguments = new Object[3]; // Initialize the arguments array with three values
        arguments[0] = new Object(); // Initialize the first element of the array
        arguments[1] = new Object(); // Initialize the second element of the array
        arguments[2] = new Object(); // Initialize the third element of the array
        TreeCompiler treeCompiler = new TreeCompiler(); // Create an object of TreeCompiler
        Object result = treeCompiler.union(arguments); // Call the union method
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction_oCMk0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] args = new Object[0];
        int code = 0;
        Object result = treeCompiler.function(code, args);
        assertEquals(new CoreFunction(code, toExpressionArray(args)), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest_sNJg0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value");
        assertEquals(new Constant("value"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest2_SAuo1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value2");
        assertEquals(new Constant("value2"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest3_Ikwx2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value3");
        assertEquals(new Constant("value3"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest4_aqju3() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value4");
        assertEquals(new Constant("value4"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest5_NaOW4() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value5");
        assertEquals(new Constant("value5"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest6_PUfT5() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value6");
        assertEquals(new Constant("value6"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest7_yXHD6() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value7");
        assertEquals(new Constant("value7"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest8_Uznv7() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value8");
        assertEquals(new Constant("value8"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest9_Cbox8() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value9");
        assertEquals(new Constant("value9"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest10_Trlw9() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value10");
        assertEquals(new Constant("value10"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_sHkz0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.lessThanOrEqual(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_leftNull_qvaQ1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = new Object();
        Object result = treeCompiler.lessThanOrEqual(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_rightNull_DetI2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = null;
        Object result = treeCompiler.lessThanOrEqual(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_integers_Ollr4() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = 10;
        Object right = 5;
        Object result = treeCompiler.lessThanOrEqual(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_strings_SdRh5() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = "abc";
        Object right = "def";
        Object result = treeCompiler.lessThanOrEqual(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanOrEqual_dates_Zmjk6() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Date(2022, 1, 1);
        Object right = new Date(2022, 1, 2);
        Object result = treeCompiler.lessThanOrEqual(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_zaSh0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.minus(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinusWithNullLeft_fPxR2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = new Object();
        Object result = treeCompiler.minus(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinusWithNullRight_svDF3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = null;
        Object result = treeCompiler.minus(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithOneArgument_uqLG1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(1, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithTwoArguments_xxME2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(3, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithThreeArguments_WfUk3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2, 3}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(6, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithFourArguments_WThW4() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2, 3, 4}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(10, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithFiveArguments_jvCH5() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2, 3, 4, 5}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(15, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithSixArguments_ADPA6() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2, 3, 4, 5, 6}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(21, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithSevenArguments_ivRL7() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2, 3, 4, 5, 6, 7}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(28, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumWithEightArguments_qRFZ8() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2, 3, 4, 5, 6, 7, 8}; // Initialize the arguments
        Object result = treeCompiler.sum(arguments);
        assertEquals(36, result); // Add assertions here to check the result
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDivide_RFgI0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.divide(left, right);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_CKNh0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object qName = new Object();
        Object expected = new VariableReference((QName) qName);
        Object actual = treeCompiler.variableReference(qName);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_TiOn0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.lessThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanWithNullLeft_PrBB1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = new Object();
        Object result = treeCompiler.lessThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanWithNullRight_VuYY2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = null;
        Object result = treeCompiler.lessThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_skwX0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithNullLeft_BMqf2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = new Object();
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithNullRight_aTnF3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = null;
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithLeftBeingZero_PXGA6() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = 0;
        Object right = new Object();
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithRightBeingZero_AIht7() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = 0;
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithBothZero_QLMr8() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = 0;
        Object right = 0;
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithLeftBeingNegative_omPv10() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = -1;
        Object right = new Object();
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithRightBeingNegative_kEzA11() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = -1;
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanWithBothNegative_POsm12() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = -1;
        Object right = -1;
        Object result = treeCompiler.greaterThan(left, right);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanOrEqual_Ceul0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = treeCompiler.greaterThanOrEqual(left, right);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanOrEqualWithNullLeft_HTNz1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = new Object();
        Object result = treeCompiler.greaterThanOrEqual(left, right);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanOrEqualWithNullRight_yarT2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = new Object();
        Object right = null;
        Object result = treeCompiler.greaterThanOrEqual(left, right);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanOrEqualWithNullLeftAndRight_ixbh3() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = null;
        Object right = null;
        Object result = treeCompiler.greaterThanOrEqual(left, right);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction_BAlH0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object name = new Object();
        Object[] args = new Object[0];
        Object result = treeCompiler.function(name, args);
        assertEquals(new ExtensionFunction((QName) name, toExpressionArray(args)), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest3_Ikwx2_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value3");
        assertEquals("value3", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest5_NaOW4_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value5");
        assertEquals("value5", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest7_yXHD6_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value7");
        assertEquals("value7", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest9_Cbox8_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value9");
        assertEquals("value9", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void literalTest10_Trlw9_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("value10");
        assertEquals("value10", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_CKNh0_fid1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object qName = new Object();
        Object expected = new VariableReference((QName) qName);
        Object actual = treeCompiler.variableReference(qName);
        assertEquals(expected.getClass(), actual.getClass());
    }
}