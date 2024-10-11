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
    public void testIsSimpleExpressionPath1_StmR0() {
        Constant constant = new Constant("string");
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        boolean actual = expressionPath.isSimpleExpressionPath();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath2_SZOL1() {
        Constant constant = new Constant(1);
        ExpressionPath expressionPath = new ExpressionPath(constant, new Expression[0], new Step[0]);
        boolean actual = expressionPath.isSimpleExpressionPath();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithExpressionContextIndependent_eVVZ3() {
        Constant expression = new Constant(new String());
        ExpressionPath expressionPath = new ExpressionPath(expression, null, null);
        assertFalse(expressionPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithPredicatesContextIndependent_oePX4() {
        Constant expression = new Constant(new String());
        ExpressionPath expressionPath = new ExpressionPath(expression, new Expression[]{new Constant(new String())}, null);
        assertFalse(expressionPath.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testExpressionPath10_hAGL9() {
        ExpressionPath expressionPath = new ExpressionPath(null, null, null);
    }
}