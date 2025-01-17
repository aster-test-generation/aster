/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ExpressionPath_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath1_dRNo0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[0], new Step[0]);
        boolean result = expressionPath.isSimpleExpressionPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSimpleExpressionPath2_HssD1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(10), new Expression[0], new Step[0]);
        boolean result = expressionPath.isSimpleExpressionPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_tgTH1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(10), null, null);
        String result = expressionPath.toString();
        assertEquals("10", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString6_oqAq5_fid1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[0], null);
        String result = expressionPath.toString();
        assertEquals("'string'", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString11_isne10_fid1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), new Expression[0], new Step[0]);
        String result = expressionPath.toString();
        assertEquals("'string'", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_ifog3_PTlA0() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant("string"), null, null);
        String result = expressionPath.toString();
        assertEquals("'string'", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_ifog3_Kjxx1() {
        ExpressionPath expressionPath = new ExpressionPath(new Constant(1), null, null);
        String result = expressionPath.toString();
        assertEquals("1", result);
    }
}