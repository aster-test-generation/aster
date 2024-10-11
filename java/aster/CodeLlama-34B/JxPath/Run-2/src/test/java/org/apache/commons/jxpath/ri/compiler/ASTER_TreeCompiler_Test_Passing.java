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

public class Aster_TreeCompiler_Test_Passing {
    private TreeCompiler compiler;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithValidPrefixAndName_ohdf0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname("prefix", "name");
        assertEquals(new QName("prefix", "name"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithEmptyPrefix_uCtD1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname("", "name");
        assertEquals(new QName("", "name"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithEmptyName_VpFO2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname("prefix", "");
        assertEquals(new QName("prefix", ""), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithNullPrefix_akAU3() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname(null, "name");
        assertEquals(new QName(null, "name"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithNullName_ajSt4() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname("prefix", null);
        assertEquals(new QName("prefix", null), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithBothPrefixAndNameEmpty_bxmx6() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname("", "");
        assertEquals(new QName("", ""), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithPrefixAndNameSame_WJUm7() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname("prefix", "prefix");
        assertEquals(new QName("prefix", "prefix"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQnameWithPrefixAndNameDifferent_Gsen8() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.qname("prefix1", "name1");
        assertEquals(new QName("prefix1", "name1"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_VJlU0() {
        compiler = new TreeCompiler();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanOrEqualWithBothNull_jcmx3() {
        TreeCompiler compiler = new TreeCompiler();
        Object left = null;
        Object right = null;
        Object result = compiler.greaterThanOrEqual(left, right);
        assertTrue(result instanceof CoreOperationGreaterThanOrEqual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_ValidInstruction_uTIa2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("instruction");
        assertNotNull(result);
        assertTrue(result instanceof ProcessingInstructionTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMod_BothAreNull_cvwQ2_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.mod(null, null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_emptyArguments_eiqM0_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[0];
        Object result = compiler.and(arguments);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAnd_nullArguments_iLji3_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{null, null};
        Object result = compiler.and(arguments);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_NullArgument_fIRN0_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.minus(null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMultiply_BothAreNull_mOcG2_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.multiply(null, null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_QName_Empty_hGEj2_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        QName qName = new QName("");
        Object result = compiler.variableReference(qName);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThan_LeftNull_RightNull_HmUP0_fid1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.lessThan(null, null);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_ValidInstruction_uTIa2_1() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("instruction");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_ValidInstruction_uTIa2_2() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("instruction");
        assertTrue(result instanceof ProcessingInstructionTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_Null_ZUVE2_OrLQ0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeNameTest(null);
        assertNotNull(result);
        assertTrue(result instanceof NodeNameTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_1_Vkph0_NbBj0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(1);
        assertEquals(1, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_2_HLte1_FQmf0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(2);
        assertEquals(2, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_3_PZpp2_WEZu0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(3);
        assertEquals(3, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_4_kubf3_Xwan0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(4);
        assertEquals(4, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_5_woMb4_DEie0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(5);
        assertEquals(5, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_6_Fasz5_IiNz0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(6);
        assertEquals(6, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_7_leIr6_yiRT0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(7);
        assertEquals(7, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_8_gJMQ7_gJFx0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(8);
        assertEquals(8, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_9_BsiZ8_RZsI0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(9);
        assertEquals(9, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_10_BYaa9_piNh0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(10);
        assertEquals(10, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_11_bpdW10_rzyz0() {
        TreeCompiler compiler = new TreeCompiler();
        NodeTypeTest result = (NodeTypeTest) compiler.nodeTypeTest(11);
        assertEquals(11, result.getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_12_Jnxq11_NtMi0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(12);
        assertEquals(12, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_13_EIiV12_mbCs0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(13);
        assertEquals(13, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_14_TVth13_RSlA0() {
        TreeCompiler compiler = new TreeCompiler();
        NodeTypeTest result = (NodeTypeTest) compiler.nodeTypeTest(14);
        assertEquals(14, result.getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_15_MhiM14_GMQC0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(15);
        assertEquals(15, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_16_BkoZ15_tHeS0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.nodeTypeTest(16);
        assertEquals(16, ((NodeTypeTest) result).getNodeType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_rHFS0() {
        TreeCompiler compiler = new TreeCompiler();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathWithNullExpression_bCej4_NWFn0_1() {
        TreeCompiler compiler = new TreeCompiler();
        Expression expression = null;
        Object[] predicates = new Object[0];
        Object[] steps = new Object[0];
        ExpressionPath path = (ExpressionPath) compiler.expressionPath(expression, predicates, steps);
        assertNull(path.getExpression());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathWithNullExpression_bCej4_NWFn0_2() {
        TreeCompiler compiler = new TreeCompiler();
        Expression expression = null;
        Object[] predicates = new Object[0];
        Object[] steps = new Object[0];
        ExpressionPath path = (ExpressionPath) compiler.expressionPath(expression, predicates, steps);
        assertEquals(predicates.length, path.getPredicates().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathWithNullExpression_bCej4_NWFn0_3() {
        TreeCompiler compiler = new TreeCompiler();
        Expression expression = null;
        Object[] predicates = new Object[0];
        Object[] steps = new Object[0];
        ExpressionPath path = (ExpressionPath) compiler.expressionPath(expression, predicates, steps);
        assertEquals(steps.length, path.getSteps().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_nullArguments_CSbk4_xnze0_1() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{null, null, null};
        Object result = compiler.union(arguments);
        assertEquals(3, arguments.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_nullArguments_CSbk4_xnze0_2() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{null, null, null};
        Object result = compiler.union(arguments);
        assertNull(arguments[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_nullArguments_CSbk4_xnze0_3() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{null, null, null};
        Object result = compiler.union(arguments);
        assertNull(arguments[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnion_nullArguments_CSbk4_xnze0_4() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[]{null, null, null};
        Object result = compiler.union(arguments);
        assertNull(arguments[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_emptySteps_Sbbd3_LzIf0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.processingInstructionTest("");
        assertTrue(result instanceof ProcessingInstructionTest);
    }
}