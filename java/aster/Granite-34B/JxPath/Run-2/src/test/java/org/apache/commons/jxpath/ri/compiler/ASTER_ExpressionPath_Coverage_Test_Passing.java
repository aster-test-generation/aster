/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ExpressionPath_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_TRlO0() {
        Constant constant = new Constant("string");
        ExpressionPath expressionPath = new ExpressionPath(constant, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_WJZp1() {
        Constant constant = new Constant(1);
        ExpressionPath expressionPath = new ExpressionPath(constant, null, null);
        assertEquals("1", expressionPath.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithExpressionContextDependent_IBUf0() {
        Constant constant = new Constant("string");
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithoutExpressionContextDependent_dEFk1() {
        Constant constant = new Constant(1);
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        assertFalse(expressionPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath1_nCdo0() {
        Constant constant = new Constant("string");
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        boolean actual = expressionPath.isSimpleExpressionPath();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath2_AZIu1() {
        Constant constant = new Constant(1);
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        boolean actual = expressionPath.isSimpleExpressionPath();
        boolean expected = true;
        assertEquals(expected, actual);
    }
}