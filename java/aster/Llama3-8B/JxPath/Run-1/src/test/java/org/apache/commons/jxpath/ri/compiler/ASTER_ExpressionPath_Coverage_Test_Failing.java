/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ExpressionPath_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentExpressionIsContextDependent_YfpK0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[0], new Step[0]);
        boolean result = expressionPath.computeContextDependent();
        assert(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPathNullEvalContext_jEnb0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("expression"), new Expression[0], new Step[0]);
        EvalContext evalContext = null;
        Object result = expressionPath.expressionPath(evalContext, true);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NullExpression_Bcxh0_wVqx0() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        String result = expressionPath.toString();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_NullExpression_Bcxh0_wVqx0_fid2() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
        String result = expressionPath.toString();
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_EmptyExpression_xeDa1_uQpl0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(""), null, null);
        String result = expressionPath.toString();
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_CoreOperationExpression_tJlc2_cbNi1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("coreOperation"), null, null);
        String result = expressionPath.toString();
        assertEquals("coreOperation", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_CoreOperationExpressionWithPredicates_ZNgd3_hsbJ0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("coreOperation"), new Expression[]{new Constant("predicate1"), new Constant("predicate2")}, null);
        String result = expressionPath.toString();
        org.junit.Assert.assertEquals("(coreOperation)[predicate1][predicate2]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_LocationPathExpressionWithPredicates_fPnk7_AFRv0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("locationPath"), new Expression[]{new Constant("predicate1"), new Constant("predicate2")}, null);
        String result = expressionPath.toString();
        org.junit.Assert.assertEquals("(\"locationPath\")[\"predicate1\"][\"predicate2\"]", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_LocationPathExpression_coLH6_kXMc0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("locationPath"), null, null);
        String result = expressionPath.toString();
        assertEquals("locationPath", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ExpressionPathExpression_nunh10_LExC0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("expressionPath"), null, null);
        String result = expressionPath.toString();
        org.junit.Assert.assertEquals("expressionPath", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ExpressionPathExpressionWithPredicates_caWa11_qefF0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("expressionPath"), new Expression[]{new Constant("predicate1"), new Constant("predicate2")}, null);
        String result = expressionPath.toString();
        org.junit.Assert.assertEquals("(expressionPath)[predicate1][predicate2]", result);
    }
}