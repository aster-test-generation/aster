/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TreeCompiler_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTestWithValidQName_DCKg0() {
        TreeCompiler compiler = new TreeCompiler();
        QName qname = new QName("http://example.com", "testNode");
        Object result = compiler.nodeNameTest(qname);
        assertTrue(result instanceof NodeNameTest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAndMethod_UtZi0() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[] {"arg1", "arg2", "arg3"};
        Object result = compiler.and(arguments);
        assertTrue(result instanceof CoreOperationAnd);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUnionCreatesCoreOperationUnion_FUPW0() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[] { /* populate with suitable test data if needed */ };
        Object result = compiler.union(arguments);
        assertTrue(result instanceof CoreOperationUnion);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_QmYn0() {
        TreeCompiler compiler = new TreeCompiler();
        int nodeType = 5;
        Object result = compiler.nodeTypeTest(nodeType);
        assertTrue(result instanceof NodeTypeTest);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrWithNullElementInArray_Tfey4() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[] {null};
        try {
            compiler.or(arguments);
            fail("Expected ClassCastException when array contains null");
        } catch (ClassCastException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrWithNonExpressionObject_JsDu5() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[] {new Object()};
        try {
            compiler.or(arguments);
            fail("Expected ClassCastException when array contains non-Expression object");
        } catch (ClassCastException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_CoverCoreOperationSubtractCreation_EfOY0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = mock(Expression.class);
        Expression right = mock(Expression.class);
        Object result = compiler.minus(left, right);
        assertTrue(result instanceof CoreOperationSubtract);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSumMethod_ULDZ0() {
        TreeCompiler compiler = new TreeCompiler();
        Object[] arguments = new Object[] {1, 2, 3};
        Object result = compiler.sum(arguments);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDivide_fuQu0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = mock(Expression.class);
        Expression right = mock(Expression.class);
        Object result = compiler.divide(left, right);
        assertTrue(result instanceof CoreOperationDivide);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLocationPath_WeRA0() {
        TreeCompiler compiler = new TreeCompiler();
        boolean absolute = true;
        Object[] steps = new Object[]{"step1", "step2"};
        Object result = compiler.locationPath(absolute, steps);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_NotInstanceOfLocationPath_OpEZ0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = mock(Expression.class); // Not an instance of LocationPath
        Expression right = mock(Expression.class);
        Object result = compiler.equal(left, right);
        assertTrue(result instanceof CoreOperationEqual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_LocationPathWithMultipleSteps_BREJ1() {
        TreeCompiler compiler = new TreeCompiler();
        LocationPath left = mock(LocationPath.class);
        Step[] steps = {mock(Step.class), mock(Step.class)};
        when(left.getSteps()).thenReturn(steps);
        Expression right = mock(Expression.class);
        Object result = compiler.equal(left, right);
        assertTrue(result instanceof CoreOperationEqual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_LocationPathWithNonAttributeAxis_wxNP2() {
        TreeCompiler compiler = new TreeCompiler();
        LocationPath left = mock(LocationPath.class);
        Step[] steps = {mock(Step.class)};
        when(left.getSteps()).thenReturn(steps);
        when(steps[0].getAxis()).thenReturn(Compiler.AXIS_CHILD); // Not AXIS_ATTRIBUTE
        Expression right = mock(Expression.class);
        Object result = compiler.equal(left, right);
        assertTrue(result instanceof CoreOperationEqual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_StepNotNodeNameTest_UvTB3() {
        TreeCompiler compiler = new TreeCompiler();
        LocationPath left = mock(LocationPath.class);
        Step[] steps = {mock(Step.class)};
        when(left.getSteps()).thenReturn(steps);
        when(steps[0].getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
        NodeTest nodeTest = mock(NodeTest.class); // Not an instance of NodeNameTest
        when(steps[0].getNodeTest()).thenReturn(nodeTest);
        Expression right = mock(Expression.class);
        Object result = compiler.equal(left, right);
        assertTrue(result instanceof CoreOperationEqual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqual_LocationPathWithNoSteps_HpDT6() {
        TreeCompiler compiler = new TreeCompiler();
        LocationPath left = mock(LocationPath.class);
        Step[] steps = new Step[0];
        when(left.getSteps()).thenReturn(steps);
        Expression right = mock(Expression.class);
        Object result = compiler.equal(left, right);
        assertTrue(result instanceof CoreOperationEqual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLessThanReturnsCoreOperationLessThan_cUez0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = mock(Expression.class);
        Expression right = mock(Expression.class);
        Object result = compiler.lessThan(left, right);
        assertTrue(result instanceof CoreOperationLessThan);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThanOrEqual_UjzE0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = mock(Expression.class);
        Expression right = mock(Expression.class);
        Object result = compiler.greaterThanOrEqual(left, right);
        assertTrue(result instanceof CoreOperationGreaterThanOrEqual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGreaterThan_Coverage_kiHi0() {
        TreeCompiler compiler = new TreeCompiler();
        Expression left = mock(Expression.class);
        Expression right = mock(Expression.class);
        Object result = compiler.greaterThan(left, right);
        assertTrue(result instanceof CoreOperationGreaterThan);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberMethod_BmOf0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.number("3.14");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOrWithNullArguments_TeJa0_fPdx0() {
    TreeCompiler compiler = new TreeCompiler();
    Object result = compiler.or(null);
    assertNull(result, "Expected null when input is null");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNotEqual_kndo0_llXv0() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new CoreOperationAdd(new Expression[]{new Constant(new Double(1)), new Constant(new Double(2))}); // Correct instantiation of Expression
    Expression right = new CoreOperationAdd(new Expression[]{new Constant(new Double(3)), new Constant(new Double(4))}); // Correct instantiation of Expression
    Object result = compiler.notEqual(left, right);
    assertTrue(result instanceof CoreOperationNotEqual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testVariableReferenceWithValidQName_mcxP0_TuLV0() {
    TreeCompiler compiler = new TreeCompiler();
    QName testQName = new QName("http://example.com", "localPart");
    Object result = compiler.variableReference(testQName);
    assertTrue(result instanceof VariableReference, "Result should be instance of VariableReference");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testStepWithEmptyPredicates_dxKq1_CjhU0_1() {
    TreeCompiler compiler = new TreeCompiler();
    NodeTest nodeTest = new NodeNameTest(new QName("nodeName")); // Assuming NodeNameTest is a concrete implementation of NodeTest
    Object[] predicates = new Object[0];
    Object result = compiler.step(1, nodeTest, predicates);
    assertNotNull(result, "Step object should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testStepWithEmptyPredicates_dxKq1_CjhU0_2() {
    TreeCompiler compiler = new TreeCompiler();
    NodeTest nodeTest = new NodeNameTest(new QName("nodeName")); // Assuming NodeNameTest is a concrete implementation of NodeTest
    Object[] predicates = new Object[0];
    Object result = compiler.step(1, nodeTest, predicates);
    assertTrue(result instanceof Step, "Result should be an instance of Step");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testStepWithNullPredicates_Jdgl0_Zjos0_1() {
    TreeCompiler compiler = new TreeCompiler();
    NodeTest nodeTest = new NodeNameTest(new QName("someNode")); // Assuming NodeNameTest is a concrete implementation of NodeTest
    Object result = compiler.step(1, nodeTest, null);
    assertNotNull(result, "Step object should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testStepWithNullPredicates_Jdgl0_Zjos0_2() {
    TreeCompiler compiler = new TreeCompiler();
    NodeTest nodeTest = new NodeNameTest(new QName("someNode")); // Assuming NodeNameTest is a concrete implementation of NodeTest
    Object result = compiler.step(1, nodeTest, null);
    assertTrue(result instanceof Step, "Result should be an instance of Step");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqual_NodeNameTestWithDifferentName_mcPD4_XNwD0() {
    TreeCompiler compiler = new TreeCompiler();
    LocationPath left = mock(LocationPath.class);
    Step[] steps = {mock(Step.class)};
    when(left.getSteps()).thenReturn(steps);
    when(steps[0].getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
    NodeNameTest nodeNameTest = mock(NodeNameTest.class);
    when(steps[0].getNodeTest()).thenReturn(nodeNameTest);
    QName differentName = new QName("DifferentName");
    when(nodeNameTest.getNodeName()).thenReturn(differentName);
    Expression right = mock(Expression.class);
    Object result = compiler.equal(left, right);
    assertTrue(result instanceof CoreOperationEqual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqual_NodeNameTestWithSameName_Svvc5_PfPq0() {
    TreeCompiler compiler = new TreeCompiler();
    LocationPath left = mock(LocationPath.class);
    Step[] steps = {mock(Step.class)};
    when(left.getSteps()).thenReturn(steps);
    when(steps[0].getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
    NodeNameTest nodeNameTest = mock(NodeNameTest.class);
    when(steps[0].getNodeTest()).thenReturn(nodeNameTest);
    QName qnameName = new QName("name"); // Corrected to use a new QName instance directly
    when(nodeNameTest.getNodeName()).thenReturn(qnameName);
    Expression right = mock(Expression.class);
    Object result = compiler.equal(left, right);
    assertTrue(result instanceof NameAttributeTest);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqual_StepIsNodeNameTestButDifferentName_tlzk7_zMXi0() {
    TreeCompiler compiler = new TreeCompiler();
    LocationPath left = mock(LocationPath.class);
    Step[] steps = {mock(Step.class)};
    when(left.getSteps()).thenReturn(steps);
    when(steps[0].getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
    NodeNameTest nodeNameTest = mock(NodeNameTest.class);
    when(steps[0].getNodeTest()).thenReturn(nodeNameTest);
    QName anotherName = new QName("AnotherName");
    when(nodeNameTest.getNodeName()).thenReturn(anotherName); // Corrected to return QName
    Expression right = mock(Expression.class);
    Object result = compiler.equal(left, right);
    assertTrue(result instanceof CoreOperationEqual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqual_StepIsNodeNameTestSameName_Jhan8_wpoU0() {
    TreeCompiler compiler = new TreeCompiler();
    LocationPath left = mock(LocationPath.class);
    Step[] steps = {mock(Step.class)};
    when(left.getSteps()).thenReturn(steps);
    when(steps[0].getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
    NodeNameTest nodeNameTest = mock(NodeNameTest.class);
    when(steps[0].getNodeTest()).thenReturn(nodeNameTest);
    QName qname = new QName("testName");
    when(nodeNameTest.getNodeName()).thenReturn(qname);
    Expression right = mock(Expression.class);
    Object result = compiler.equal(left, right);
    assertTrue(result instanceof NameAttributeTest);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpressionPathWithNonNullPredicates_NcuN5_mrkQ0_1() {
    TreeCompiler compiler = new TreeCompiler();
    Expression mockExpression = mock(Expression.class);
    Expression predicate1 = mock(Expression.class);
    Expression predicate2 = mock(Expression.class);
    Object[] predicates = new Object[] { predicate1, predicate2 };
    Step step1 = mock(Step.class);
    Object[] steps = new Object[] { step1 };
    ExpressionPath result = (ExpressionPath) compiler.expressionPath(mockExpression, predicates, steps);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpressionPathWithNonNullPredicates_NcuN5_mrkQ0_2() {
    TreeCompiler compiler = new TreeCompiler();
    Expression mockExpression = mock(Expression.class);
    Expression predicate1 = mock(Expression.class);
    Expression predicate2 = mock(Expression.class);
    Object[] predicates = new Object[] { predicate1, predicate2 };
    Step step1 = mock(Step.class);
    Object[] steps = new Object[] { step1 };
    ExpressionPath result = (ExpressionPath) compiler.expressionPath(mockExpression, predicates, steps);
    assertEquals(2, result.getPredicates().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpressionPathWithNonNullPredicates_NcuN5_mrkQ0_3() {
    TreeCompiler compiler = new TreeCompiler();
    Expression mockExpression = mock(Expression.class);
    Expression predicate1 = mock(Expression.class);
    Expression predicate2 = mock(Expression.class);
    Object[] predicates = new Object[] { predicate1, predicate2 };
    Step step1 = mock(Step.class);
    Object[] steps = new Object[] { step1 };
    ExpressionPath result = (ExpressionPath) compiler.expressionPath(mockExpression, predicates, steps);
    assertSame(predicate1, result.getPredicates()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testExpressionPathWithNonNullPredicates_NcuN5_mrkQ0_4() {
    TreeCompiler compiler = new TreeCompiler();
    Expression mockExpression = mock(Expression.class);
    Expression predicate1 = mock(Expression.class);
    Expression predicate2 = mock(Expression.class);
    Object[] predicates = new Object[] { predicate1, predicate2 };
    Step step1 = mock(Step.class);
    Object[] steps = new Object[] { step1 };
    ExpressionPath result = (ExpressionPath) compiler.expressionPath(mockExpression, predicates, steps);
    assertSame(predicate2, result.getPredicates()[1]);}
}