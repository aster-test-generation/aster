/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ExpressionContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodFunction_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvoke_staticMethod_qqGU0_SiUr0() throws Exception {
        Method method = MethodFunction.class.getDeclaredMethod("invoke", ExpressionContext.class, Object[].class);
        MethodFunction methodFunction = new MethodFunction(method);
        Object[] parameters = new Object[]{null, new Object[]{"parameter1", "parameter2"}};
        Object result = methodFunction.invoke(null, parameters);
        assertEquals(method.invoke(null, parameters), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvoke_instanceMethod_czMy1_ohcv0() throws Exception {
        Method method = MethodFunction.class.getDeclaredMethod("invoke", ExpressionContext.class, Object[].class);
        MethodFunction methodFunction = new MethodFunction(method);
        Object[] parameters = new Object[]{new Object[]{"parameter1", "parameter2"}};
        Object result = methodFunction.invoke(null, parameters);
        assertEquals(method.invoke(null, parameters), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvoke_methodWithoutExpressionContextParameter_HOvC3_ttEM0() throws Exception {
        Method method = MethodFunction.class.getDeclaredMethod("invoke", Object[].class);
        MethodFunction methodFunction = new MethodFunction(method);
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Object result = methodFunction.invoke(null, parameters);
        assertEquals(method.invoke(null, parameters), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvoke_methodWithPrimitiveParameters_KTuA4_rrdQ0() throws Exception {
        Method method = MethodFunction.class.getDeclaredMethod("invoke", Integer.class, Integer.class);
        MethodFunction methodFunction = new MethodFunction(method);
        Object[] parameters = new Object[]{1, 2};
        Object result = methodFunction.invoke(null, parameters);
        assertEquals(method.invoke(null, parameters), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvoke_methodWithObjectParameters_ccfI5_iPni0() throws Exception {
        Method method = MethodFunction.class.getDeclaredMethod("invoke", Object.class, Object.class);
        MethodFunction methodFunction = new MethodFunction(method);
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Object result = methodFunction.invoke(null, parameters);
        assertEquals(method.invoke(null, parameters), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvoke_methodWithArrayParameters_UGJA6_GjhW0() throws Exception {
        Method method = MethodFunction.class.getDeclaredMethod("invoke", Object[].class);
        MethodFunction methodFunction = new MethodFunction(method);
        Object[] parameters = new Object[]{new Object[]{"parameter1", "parameter2"}};
        Object result = methodFunction.invoke(null, parameters);
        assertEquals(method.invoke(null, parameters), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvoke_methodWithPrimitiveParameters_KTuA4_rrdQ0_fid3() throws Exception {
        Method method = MethodFunction.class.getDeclaredMethod("invoke", int.class, int.class);
        MethodFunction methodFunction = new MethodFunction(method);
        Object[] parameters = new Object[]{1, 2};
        Object result = methodFunction.invoke(null, parameters);
        assertEquals(method.invoke(null, parameters), result);
    }
}