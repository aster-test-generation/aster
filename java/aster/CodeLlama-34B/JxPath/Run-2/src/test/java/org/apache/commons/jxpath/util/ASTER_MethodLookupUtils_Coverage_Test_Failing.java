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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodLookupUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NullParameters_DnEU0() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = null;
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_XxgH2_1() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", "bar"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_XxgH2_2() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", "bar"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(2, constructor.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_XxgH2_3() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", "bar"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_XxgH2_4() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", "bar"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NoExactMatch_kDaP3_1() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", 123};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NoExactMatch_kDaP3_2() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", 123};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(2, constructor.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NoExactMatch_kDaP3_3() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", 123};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NoExactMatch_kDaP3_4() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", 123};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(Integer.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_WithNullParameter_CumT6_1() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", null};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_WithNullParameter_CumT6_2() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", null};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(2, constructor.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_WithNullParameter_CumT6_3() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", null};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ExactMatch_WithNullParameter_CumT6_4() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"foo", null};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatch_SFcj2_1() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatch_SFcj2_2() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(name, method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatch_SFcj2_3() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(2, method.getParameterCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatch_SFcj2_4() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatch_SFcj2_5() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters_wDWr3_1() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters_wDWr3_2() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(name, method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters_wDWr3_3() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(2, method.getParameterCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters_wDWr3_4() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters_wDWr3_5() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters2_UMgL4_1() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters2_UMgL4_2() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(name, method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters2_UMgL4_3() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(2, method.getParameterCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters2_UMgL4_4() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters2_UMgL4_5() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{null, "parameter2"};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters3_VHzq5_1() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters3_VHzq5_2() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(name, method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters3_VHzq5_3() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(2, method.getParameterCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters3_VHzq5_4() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethodWithExactMatchAndNullParameters3_VHzq5_5() throws Exception {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{"parameter1", null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(String.class, method.getParameterTypes()[1]);
    }
}