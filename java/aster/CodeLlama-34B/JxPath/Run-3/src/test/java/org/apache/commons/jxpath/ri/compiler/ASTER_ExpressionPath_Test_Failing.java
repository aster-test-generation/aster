/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExpressionPath_Test_Failing {
    private Expression expression;
    private Expression[] predicates;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithConstant_yxxu0() {
        Constant constant = new Constant("constant");
        ExpressionPath expressionPath = new ExpressionPath(constant, null, null);
        String expected = "(constant)";
        String actual = expressionPath.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNumber_WqTz1() {
        Constant constant = new Constant(10);
        ExpressionPath expressionPath = new ExpressionPath(constant, null, null);
        String expected = "(10)";
        String actual = expressionPath.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithPredicates_fsCg2() {
        Constant constant = new Constant("constant");
        Expression[] predicates = new Expression[]{new Constant("predicate1"), new Constant("predicate2")};
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, null);
        String expected = "(constant)[predicate1][predicate2]";
        String actual = expressionPath.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullExpression_nJqU5() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        String expected = "";
        String actual = expressionPath.toString();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withConstant_rfxm0_1() {
        Constant constant = new Constant("test");
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(1, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withConstant_rfxm0_2() {
        Constant constant = new Constant("test");
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(constant, predicates[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withNumber_HsUH1_1() {
        Constant constant = new Constant(10);
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(1, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withNumber_HsUH1_2() {
        Constant constant = new Constant(10);
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(constant, predicates[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withMultiplePredicates_GsIV2_1() {
        Constant constant1 = new Constant("test1");
        Constant constant2 = new Constant("test2");
        ExpressionPath expressionPath = new ExpressionPath(constant1, new Expression[]{constant2}, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(2, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withMultiplePredicates_GsIV2_2() {
        Constant constant1 = new Constant("test1");
        Constant constant2 = new Constant("test2");
        ExpressionPath expressionPath = new ExpressionPath(constant1, new Expression[]{constant2}, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(constant1, predicates[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withMultiplePredicates_GsIV2_3() {
        Constant constant1 = new Constant("test1");
        Constant constant2 = new Constant("test2");
        ExpressionPath expressionPath = new ExpressionPath(constant1, new Expression[]{constant2}, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(constant2, predicates[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_expressionIsContextDependent_uRPQ0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), null, null);
        assertTrue(expressionPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_predicateIsContextDependent_seyq1() {
        ExpressionPath expressionPath = new ExpressionPath(null, new Expression[]{new Constant("string")}, null);
        assertTrue(expressionPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_expressionIsNull_RAyz3() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        assertFalse(expressionPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpression_nrWO0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[0], new Step[0]);
        Expression expression = expressionPath.getExpression();
        assertEquals(new Constant("string"), expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpressionWithPredicates_PenL1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[]{new Constant("predicate1"), new Constant("predicate2")}, new Step[0]);
        Expression expression = expressionPath.getExpression();
        assertEquals(new Constant("string"), expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpressionWithNumber_jnqk4() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(123), new Expression[0], new Step[0]);
        Expression expression = expressionPath.getExpression();
        assertEquals(new Constant(123), expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpressionWithNumberAndPredicates_Ttof5() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(123), new Expression[]{new Constant("predicate1"), new Constant("predicate2")}, new Step[0]);
        Expression expression = expressionPath.getExpression();
        assertEquals(new Constant(123), expression);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath_NonSimplePath_gxQx1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[]{new Constant("string")}, new Step[0]);
        assertFalse(expressionPath.isSimpleExpressionPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathWithUnionContext_dYdN3_vRoL0() {
        Constant constant = new Constant(10);
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        EvalContext evalContext = new InitialContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)));
        Object result = new ExpressionPath(constant, predicates, steps).expressionPath(evalContext, true);
        assertTrue(result instanceof UnionContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withConstant_rfxm0() {
        Constant constant = new Constant("test");
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(1, predicates.length);
        assertEquals(constant, predicates[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withNumber_HsUH1() {
        Constant constant = new Constant(10);
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(1, predicates.length);
        assertEquals(constant, predicates[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_withMultiplePredicates_GsIV2() {
        Constant constant1 = new Constant("test1");
        Constant constant2 = new Constant("test2");
        ExpressionPath expressionPath = new ExpressionPath(constant1, new Expression[]{constant2}, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(2, predicates.length);
        assertEquals(constant1, predicates[0]);
        assertEquals(constant2, predicates[1]);
    }
}