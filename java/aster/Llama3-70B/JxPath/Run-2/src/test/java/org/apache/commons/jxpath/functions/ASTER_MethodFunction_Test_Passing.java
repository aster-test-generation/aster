/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodFunction_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_JhoZ0_DXyj0() {
        java.lang.reflect.Method method;
        try {
            method = getClass().getMethod("toString");
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
        MethodFunction methodFunction = new MethodFunction(method);
    }
}