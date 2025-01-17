/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodFunction_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithStaticMethodAndNoParameters_pifu0() {
        MethodFunction methodFunction = new MethodFunction(null);
        Object[] parameters = new Object[0];
        Object result = methodFunction.invoke(null, parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithStaticMethodAndOneParameter_NkbT1() {
        MethodFunction methodFunction = new MethodFunction(null);
        Object[] parameters = new Object[1];
        Object result = methodFunction.invoke(null, parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithStaticMethodAndTwoParameters_cuCf2() {
        MethodFunction methodFunction = new MethodFunction(null);
        Object[] parameters = new Object[2];
        Object result = methodFunction.invoke(null, parameters);
    }
}