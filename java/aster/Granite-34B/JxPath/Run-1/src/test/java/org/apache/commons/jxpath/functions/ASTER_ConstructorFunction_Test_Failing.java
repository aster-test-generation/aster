/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ExpressionContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ConstructorFunction_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNoExpressionContextAndParameters_slak2() {
        Object[] parameters = new Object[0];
        ExpressionContext context = null;
        Object result = new ConstructorFunction(null).invoke(context, parameters);
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNoExpressionContextAndNoParameters_rdbE3() {
        Object[] parameters = null;
        ExpressionContext context = null;
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object result = constructorFunction.invoke(context, parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNoExpressionContextAndParameters_slak2_fid2() {
        Object[] parameters = new Object[0];
        ExpressionContext context = null;
        Object result = new ConstructorFunction(null).invoke(context, parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNoExpressionContextAndNoParameters_rdbE3_fid2() {
        Object[] parameters = null;
        ExpressionContext context = null;
        Object result = new ConstructorFunction(null).invoke(context, parameters);
    }
}