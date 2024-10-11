/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
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
    private Expression expression;
    private Expression[] predicates;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_empty_qLmB0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(""), new Expression[0], new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(0, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_singlePredicate_rsGJ1_1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(""), new Expression[]{new Constant(1)}, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(1, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_multiplePredicates_zgfS2_1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(""), new Expression[]{new Constant(1), new Constant(2)}, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(2, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_nullSteps_swul5_1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(""), new Expression[]{new Constant(1)}, null);
        Expression[] predicates = expressionPath.getPredicates();
        assertEquals(1, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_ExpressionAndPredicatesAreNotContextDependent_dlxu3() {
        Constant expression = new Constant("expression");
        Expression predicate1 = new Constant("predicate1");
        Expression predicate2 = new Constant("predicate2");
        Expression[] predicates = new Expression[]{predicate1, predicate2};
        ExpressionPath path = new ExpressionPath(expression, predicates, null);
        assertFalse(path.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath_simplePath_Oira0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[0], new Step[0]);
        assertTrue(expressionPath.isSimpleExpressionPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithConstantAndPredicates_LNjO0_fid1() {
        Constant constant = new Constant("constant");
        Expression[] predicates = new Expression[]{new Constant("predicate1"), new Constant("predicate2")};
        ExpressionPath expressionPath = new ExpressionPath(constant, predicates, null);
        assertEquals("'constant'['predicate1']['predicate2']", expressionPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_nullPredicates_mDML3_fid1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(""), null, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_nullExpression_bSXY7_fid1() {
        ExpressionPath expressionPath = new ExpressionPath(null, new Expression[]{new Constant(1)}, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_nullExpressionAndPredicates_JnEQ9_fid1() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, new Step[0]);
        Expression[] predicates = expressionPath.getPredicates();
        assertNull(predicates);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_ExpressionIsContextDependent_nvaV0_fid1() {
        Constant expression = new Constant("expression");
        ExpressionPath path = new ExpressionPath(expression, null, null);
        assertFalse(path.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpression_Expression_otvC2_fid1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("test"), new Expression[0], new Step[0]);
        Expression expression = expressionPath.getExpression();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNumberAndPredicates_ODmp3_jeZg0_fid1() {
        Constant number = new Constant(123);
        Expression[] predicates = new Expression[]{new Constant("predicate1"), new Constant("predicate2")};
        ExpressionPath expressionPath = new ExpressionPath(number, predicates, null);
    }
}