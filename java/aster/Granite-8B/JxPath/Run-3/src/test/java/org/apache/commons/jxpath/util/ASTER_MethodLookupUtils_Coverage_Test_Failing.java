/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodLookupUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorInexactMatch_rCGz11_1() {
        Constructor<Integer> constructor = MethodLookupUtils.lookupConstructor(Integer.class, new Object[]{123});
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorInexactMatch_rCGz11_2() {
        Constructor<Integer> constructor = MethodLookupUtils.lookupConstructor(Integer.class, new Object[]{123});
        assertEquals(Integer.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullParameter_jgoc12_1() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(String.class, new Object[]{null});
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullParameter_jgoc12_2() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(String.class, new Object[]{null});
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullExpectedType_UtyJ13_1() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(null, new Object[]{"test"});
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullExpectedType_UtyJ13_2() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(null, new Object[]{"test"});
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullActualType_XbzJ14_2() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(String.class, null);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLookupStaticMethod_LrXV0() {
        Method method = MethodLookupUtils.lookupStaticMethod(null, null, null);
        assertEquals(null, method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testLookupStaticMethod2_BvJg1() {
        Method method = MethodLookupUtils.lookupStaticMethod(String.class, null, null);
        assertEquals(null, method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorInexactMatch_rCGz11() {
        Constructor<Integer> constructor = MethodLookupUtils.lookupConstructor(Integer.class, new Object[]{123});
        assertNotNull(constructor);
        assertEquals(Integer.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullParameter_jgoc12() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(String.class, new Object[]{null});
        assertNotNull(constructor);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullExpectedType_UtyJ13() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(null, new Object[]{"test"});
        assertNotNull(constructor);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructorNullActualType_XbzJ14() {
        Constructor<String> constructor = MethodLookupUtils.lookupConstructor(String.class, null);
        assertNotNull(constructor);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }
}