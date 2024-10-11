/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.functions;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ConstructorFunction_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNullParameters_BXUJ0() throws Exception {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = null;
        Object result = constructorFunction.invoke(null, parameters);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithEmptyParameters_POgi1() throws Exception {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[0];
        Object result = constructorFunction.invoke(null, parameters);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInvokeWithNonEmptyParameters_ERes2() throws Exception {
        ConstructorFunction constructorFunction = new ConstructorFunction(null);
        Object[] parameters = new Object[]{1, 2, 3};
        Object result = constructorFunction.invoke(null, parameters);
        assertNotNull(result);
    }
}