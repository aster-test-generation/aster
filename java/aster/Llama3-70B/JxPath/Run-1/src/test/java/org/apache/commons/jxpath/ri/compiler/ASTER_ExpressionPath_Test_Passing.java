/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
public class Aster_ExpressionPath_Test_Passing {
    ExpressionPath expressionPath;
    EvalContext evalContext;
    Constant constant;
    Expression[] predicates;
    Step[] steps;
    Constant expression;
    EvalContext context;
    private InitialContext initialContext;
    private NodePointer nodePointer;
    private UnionContext unionContext;
    private PredicateContext predicateContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_withNumberConstant_FyXh6() {
        Constant expression = new Constant(123);
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath ep = new ExpressionPath(expression, predicates, steps);
        assertEquals("123", ep.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_vQym0() {
        Constant constant = new Constant("string");
        Expression expression = new ExpressionPath(constant, new Expression[0], new Step[0]);
        Expression[] predicates = new Expression[0];
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, new Step[0]);
        assertArrayEquals(predicates, expressionPath.getPredicates());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_NullPredicates_HbPH3() {
        Constant expression = new Constant(1);
        ExpressionPath ep = new ExpressionPath(expression, null, null);
        assertFalse(ep.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath1_tQeu0() {
        Constant constant = new Constant("string");
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, steps);
        boolean result = expressionPath.isSimpleExpressionPath();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath2_YtlQ1() {
        Constant constant = new Constant(1);
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, steps);
        boolean result = expressionPath.isSimpleExpressionPath();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpression_iJpq0_KKuR0() {
        Constant constant = new Constant("string");
        Constant expression = new Constant("expression");
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath expressionPath = new ExpressionPath(expression, predicates, steps);
        assertEquals(expression, expressionPath.getExpression());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void remove_qTnh1() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_CoreOperation_mukb0_fid1() {
        Constant expression = new Constant("string");
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath ep = new ExpressionPath(expression, predicates, steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ExpressionPath_EXPh1_fid1() {
        Constant expression = new Constant("string");
        Expression[] predicates = new Expression[0];
        Step[] steps = new Step[0];
        ExpressionPath ep = new ExpressionPath(expression, predicates, steps);
        assertEquals("'string'", ep.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_withPredicates_NZoK3_fid1() {
        Constant expression = new Constant("string");
        Expression predicate1 = new Constant("predicate1");
        Expression predicate2 = new Constant("predicate2");
        Expression[] predicates = new Expression[]{predicate1, predicate2};
        Step[] steps = new Step[0];
        ExpressionPath ep = new ExpressionPath(expression, predicates, steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_withNullPredicates_zJvY7_fid1() {
        Constant expression = new Constant("string");
        Expression[] predicates = null;
        Step[] steps = new Step[0];
        ExpressionPath ep = new ExpressionPath(expression, predicates, steps);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_ExpressionIsContextDependent_rHrC0_fid1() {
        Constant expression = new Constant("string");
        ExpressionPath ep = new ExpressionPath(expression, null, null);
        assertFalse(ep.computeContextDependent());
    }
}