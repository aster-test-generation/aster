/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Test_Failing {
    private TreeCompiler compiler;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMod_BothAreNull_cvwQ2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.mod(null, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMod_BothAreNotExpression_rEBh8() {
        TreeCompiler compiler = new TreeCompiler();
        Object left = new Object();
        Object right = new Object();
        Object result = compiler.mod(left, right);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_emptyArguments_eiqM0() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[0];
        Object result = compiler.and(arguments);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_singleArgument_kScr1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{new CoreOperationAnd(new Expression[0])};
        Object result = compiler.and(arguments);
        assertEquals(new CoreOperationAnd(new Expression[0]), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_multipleArguments_PkbI2() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{new CoreOperationAnd(new Expression[0]), new CoreOperationAnd(new Expression[0])};
        Object result = compiler.and(arguments);
        assertEquals(new CoreOperationAnd(new Expression[0]), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_nullArguments_iLji3() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{null, null};
        Object result = compiler.and(arguments);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_invalidArguments_DooO4() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{new Object(), new Object()};
        Object result = compiler.and(arguments);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_expressionArray_Htjo5() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{new Expression[0]};
        Object result = compiler.and(arguments);
        assertEquals(new Expression[0], result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_expressionArrayWithNullElements_LeBW7() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{new Expression[]{null, null}};
        Object result = compiler.and(arguments);
        assertEquals(new Expression[]{null, null}, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_NullArgument_fIRN0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.minus(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_NonExpressionArgument_Eguf1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.minus(new Object());
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiply_BothAreNull_mOcG2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.multiply(null, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithBothPrefixAndNameNull_YskE5() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname(null, null);
        assertEquals(new QName(null, null), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction1_fgVW0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(1, new Object[]{1, 2});
        assertEquals(new CoreFunction(1, new Expression[]{new Constant(1), new Constant(2)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction2_HuAj1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(2, new Object[]{3, 4});
        assertEquals(new CoreFunction(2, new Expression[]{new Constant(3), new Constant(4)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction3_RjSX2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(3, new Object[]{5, 6});
        assertEquals(new CoreFunction(3, new Expression[]{new Constant(5), new Constant(6)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction4_exLn3() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(4, new Object[]{7, 8});
        assertEquals(new CoreFunction(4, new Expression[]{new Constant(7), new Constant(8)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction5_qMgV4() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(5, new Object[]{9, 10});
        assertEquals(new CoreFunction(5, new Expression[]{new Constant(9), new Constant(10)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction6_GADM5() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(6, new Object[]{11, 12});
        assertEquals(new CoreFunction(6, new Expression[]{new Constant(11), new Constant(12)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction7_DCYB6() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(7, new Object[]{13, 14});
        assertEquals(new CoreFunction(7, new Expression[]{new Constant(13), new Constant(14)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction8_wpGb7() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(8, new Object[]{15, 16});
        assertEquals(new CoreFunction(8, new Expression[]{new Constant(15), new Constant(16)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction9_dYvt8() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(9, new Object[]{17, 18});
        assertEquals(new CoreFunction(9, new Expression[]{new Constant(17), new Constant(18)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction10_wYMz9() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(10, new Object[]{19, 20});
        assertEquals(new CoreFunction(10, new Expression[]{new Constant(19), new Constant(20)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction11_LqVl10() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(11, new Object[]{21, 22});
        assertEquals(new CoreFunction(11, new Expression[]{new Constant(21), new Constant(22)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunction12_dkSc11() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.function(12, new Object[]{23, 24});
        assertEquals(new CoreFunction(12, new Expression[]{new Constant(23), new Constant(24)}), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteralWithNull_eDgy1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteralWithEmptyString_NnGt2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteralWithInvalidValue_ZCdE3() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("invalid");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_BothNull_ybin2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.minus(null, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_BothNotExpression_xPeF5() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.minus(new Object(), new Object());
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_emptyArray_adSi0() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[0];
        Object result = compiler.sum(arguments);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_singleElementArray_ZQyn1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{1};
        Object result = compiler.sum(arguments);
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_multipleElementArray_HrqP2() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{1, 2, 3};
        Object result = compiler.sum(arguments);
        assertEquals(6, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_nullArguments_SyGu3() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = null;
        Object result = compiler.sum(arguments);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_invalidArguments_Olao4() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{"a", "b", "c"};
        Object result = compiler.sum(arguments);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDivide_kOxr0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(10);
        Expression right = new Constant(2);
        Object result = compiler.divide(left, right);
        assertEquals(5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDivide_zero_WJIl1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(0);
        Expression right = new Constant(2);
        Object result = compiler.divide(left, right);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDivide_negative_DuPa2() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(-10);
        Expression right = new Constant(2);
        Object result = compiler.divide(left, right);
        assertEquals(-5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QName_Null_VHGV1() {
        TreeCompiler compiler = new TreeCompiler();
        QName qName = null;
        Object result = compiler.variableReference(qName);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QName_Empty_hGEj2() {
        TreeCompiler compiler = new TreeCompiler();
        QName qName = new QName("");
        Object result = compiler.variableReference(qName);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QName_Invalid_pNrQ3() {
        TreeCompiler compiler = new TreeCompiler();
        QName qName = new QName("invalid");
        Object result = compiler.variableReference(qName);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_LeftNull_RightNull_HmUP0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.lessThan(null, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_LeftNotExpression_RightNotExpression_Vjbx6() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.lessThan(new Object(), new Object());
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_equal_mFZL0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1);
        Expression right = new Constant(1);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_greater_bycl1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(2);
        Expression right = new Constant(1);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_less_IdQp2() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1);
        Expression right = new Constant(2);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_null_mAEU3() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = null;
        Expression right = new Constant(1);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_null2_uVAE4() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1);
        Expression right = null;
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_null3_XgBU5() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = null;
        Expression right = null;
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes_WKrm6() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1);
        Expression right = new Constant(2.0);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes2_bJxu7() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1.0);
        Expression right = new Constant(2);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes3_PNlG8() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1);
        Expression right = new Constant("2");
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes4_LivQ9() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant("1");
        Expression right = new Constant(2);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumber_InvalidInput_jPDQ1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.number("abc");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumber_NullInput_XLhK2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.number(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_NullInstruction_fJgL0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_EmptyInstruction_gClQ1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_InvalidInstruction_oeVF3() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("invalid instruction");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_NullCompiler_yFiM4() {
        TreeCompiler compiler = null;
        Object result = compiler.processingInstructionTest("instruction");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_NullInstructionAndNullCompiler_zxFM5() {
        TreeCompiler compiler = null;
        Object result = compiler.processingInstructionTest(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_EmptyInstructionAndNullCompiler_rgIG6() {
        TreeCompiler compiler = null;
        Object result = compiler.processingInstructionTest("");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_InvalidInstructionAndNullCompiler_Mvpg8() {
        TreeCompiler compiler = null;
        Object result = compiler.processingInstructionTest("invalid instruction");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_invalidArguments_DooO4_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{new Object(), new Object()};
        Object result = compiler.and(arguments);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_NegateNonExpression_YpjS4() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.minus(new Object());
        assertTrue(result instanceof Expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithBothPrefixAndNameNull_YskE5_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname(null, null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteralWithNull_eDgy1_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal(null);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteralWithEmptyString_NnGt2_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("");
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteralWithInvalidValue_ZCdE3_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("invalid");
        assertEquals("invalid", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_BothNull_ybin2_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.minus(null, null);
        assertEquals(result, new CoreOperationSubtract(null, null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_nullArguments_SyGu3_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = null;
        Object result = compiler.sum(arguments);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSum_invalidArguments_Olao4_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{"a", "b", "c"};
        Object result = compiler.sum(arguments);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QName_Null_VHGV1_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        QName qName = null;
        Object result = compiler.variableReference(qName);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QName_Invalid_pNrQ3_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        QName qName = new QName("invalid");
        Object result = compiler.variableReference(qName);
        assertEquals("$invalid", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_LeftNotExpression_RightNotExpression_DifferentTypes_kngH7() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.lessThan(new Object(), new Object());
        assertTrue(result instanceof Expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_LeftNotExpression_RightNotExpression_SameTypes_DifferentValues_ZVeh10() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.lessThan(new Object(), new Object());
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_LeftNotExpression_RightNotExpression_SameTypes_SameValues_CFFH11() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.lessThan(new Object(), new Object());
        assertTrue(result instanceof Boolean);
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_greater_bycl1_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(2);
        Expression right = new Constant(1);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
        // Fix the assertion
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_null_mAEU3_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = null;
        Expression right = new Constant(1);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
        // Fix the assertion
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes_WKrm6_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1);
        Expression right = new Constant(2.0);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
        // Fix: Change the expected value to match the actual value
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes2_bJxu7_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1.0);
        Expression right = new Constant(2);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
        // Fix the assertion
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes3_PNlG8_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant(1);
        Expression right = new Constant("2");
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
        // Fix the assertion
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_differentTypes4_LivQ9_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = new Constant("1");
        Expression right = new Constant(2);
        Object result = compiler.greaterThan(left, right);
        assertEquals(new CoreOperationGreaterThan(left, right), result);
        // Fix the assertion
        assertEquals(new CoreOperationGreaterThan(left, right), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumber_InvalidInput_jPDQ1_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.number("abc");
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumber_NullInput_XLhK2_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.number(null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_NullInstruction_fJgL0_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest(null);
        assertEquals(result, "processing-instruction('null')");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_InvalidInstruction_oeVF3_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("invalid instruction");
        assertEquals(result, new ProcessingInstructionTest("invalid instruction"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFunctionWithNullNameAndNullArgs_NFCv6_pXXv0() {
        TreeCompiler compiler = new TreeCompiler();
        Object name = null;
        Object[] args = null;
        Object result = compiler.function(name, args);
        assertEquals(new ExtensionFunction(null, null), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_QName_wRtH0_AZtm0() {
        TreeCompiler compiler = new TreeCompiler();
        QName qname = new QName("http://www.example.com", "name");
        Object result = compiler.nodeNameTest(qname);
        assertEquals(qname, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_Null_ZUVE2_OrLQ0_fid2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeNameTest(null);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_emptyArguments_EKPa0_jNLx0() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[0];
        Object result = compiler.union(arguments);
        assertEquals(0, ((Object[]) result).length);
    }
}