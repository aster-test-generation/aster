/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ExpressionContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ConstructorFunction_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullContext_JBcz3() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        ExpressionContext context = null;
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Object result = constructorFunction.invoke(context, parameters);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullParameters_artT0_qDFK0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        ExpressionContext context = null;
        Object[] parameters = null;
        Object result = constructorFunction.invoke(context, parameters);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithEmptyParameters_SkCw1_IHSy0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[0];
        Object result = constructorFunction.invoke(null, parameters);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithConstructorWithFourParameters_vRTo9_Kpfq0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[]{"parameter1", "parameter2", "parameter3", "parameter4"};
        Object result = constructorFunction.invoke(null, parameters);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNonEmptyParameters_jgPG2_VsvK0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Object result = constructorFunction.invoke(null, parameters);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithConstructorWithOneParameter_hiVO6_JKNy0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[]{"parameter1"};
        Object result = constructorFunction.invoke(null, parameters);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithConstructorWithThreeParameters_WQZd8_yNBp0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[]{"parameter1", "parameter2", "parameter3"};
        Object result = constructorFunction.invoke(null, parameters);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithConstructorWithFourParameters_vRTo9_Kpfq0_fid2() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[]{"parameter1", "parameter2", "parameter3", "parameter4"};
        Object result = constructorFunction.invoke(null, parameters);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithConstructorWithFiveParameters_aSjC10_QxbC0() {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[]{"parameter1", "parameter2", "parameter3", "parameter4", "parameter5"};
        Object result = constructorFunction.invoke(null, parameters);
        Assertions.assertNull(result);
    }
}