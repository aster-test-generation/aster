/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodLookupUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_SingleParameter_ofUi2() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"parameter"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
        assertEquals(MethodLookupUtils.class, constructor.getDeclaringClass());
        assertEquals(1, constructor.getParameterCount());
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_MultipleParameters_xgJc3() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
        // Fix the assertion
        assertEquals(MethodLookupUtils.class, constructor.getDeclaringClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NullTargetClass_hInT0() {
        Method method = MethodLookupUtils.lookupStaticMethod(null, "methodName", new Object[0]);
        assertNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NullMethodName_xEIi1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, null, new Object[0]);
        assertNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_MatchingMethod_YUIG5_1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "methodName", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_MatchingMethod_YUIG5_2() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "methodName", new Object[0]);
        assertEquals("methodName", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ParameterTypes_WCGY11_3() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "methodName", new Object[0]);
        assertEquals(0, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MatchingMethod_ULAX5_1() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "toString", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MatchingMethod_ULAX5_2() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "toString", new Object[0]);
        assertEquals("toString", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithParameters_UrLE7_3() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "substring", new Object[]{1, 1});
        assertEquals(2, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithVarArgs_xYEA8_1() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "format", new Object[]{"%s", "arg1"});
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithVarArgs_xYEA8_2() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "format", new Object[]{"%s", "arg1"});
        assertEquals("format", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithVarArgs_xYEA8_3() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "format", new Object[]{"%s", "arg1"});
        assertEquals(1, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithGenericParameter_rWmh9_1() {
        Method method = MethodLookupUtils.lookupMethod(ArrayList.class, "add", new Object[]{"arg1"});
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithGenericParameter_rWmh9_2() {
        Method method = MethodLookupUtils.lookupMethod(ArrayList.class, "add", new Object[]{"arg1"});
        assertEquals("add", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithGenericParameter_rWmh9_3() {
        Method method = MethodLookupUtils.lookupMethod(ArrayList.class, "add", new Object[]{"arg1"});
        assertEquals(1, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithGenericReturnType_BQlV10_1() {
        Method method = MethodLookupUtils.lookupMethod(ArrayList.class, "get", new Object[]{0});
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithGenericReturnType_BQlV10_2() {
        Method method = MethodLookupUtils.lookupMethod(ArrayList.class, "get", new Object[]{0});
        assertEquals("get", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithGenericReturnType_BQlV10_3() {
        Method method = MethodLookupUtils.lookupMethod(ArrayList.class, "get", new Object[]{0});
        assertEquals(1, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithGenericReturnType_BQlV10_4() {
        Method method = MethodLookupUtils.lookupMethod(ArrayList.class, "get", new Object[]{0});
        assertEquals(Object.class, method.getReturnType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithPrimitiveParameter_Zkhh11_1() {
        Method method = MethodLookupUtils.lookupMethod(Integer.class, "parseInt", new Object[]{"123"});
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithPrimitiveParameter_Zkhh11_2() {
        Method method = MethodLookupUtils.lookupMethod(Integer.class, "parseInt", new Object[]{"123"});
        assertEquals("parseInt", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithPrimitiveParameter_Zkhh11_3() {
        Method method = MethodLookupUtils.lookupMethod(Integer.class, "parseInt", new Object[]{"123"});
        assertEquals(1, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithPrimitiveReturnType_Taqj12_1() {
        Method method = MethodLookupUtils.lookupMethod(Integer.class, "intValue", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithPrimitiveReturnType_Taqj12_2() {
        Method method = MethodLookupUtils.lookupMethod(Integer.class, "intValue", new Object[0]);
        assertEquals("intValue", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithPrimitiveReturnType_Taqj12_3() {
        Method method = MethodLookupUtils.lookupMethod(Integer.class, "intValue", new Object[0]);
        assertEquals(0, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithPrimitiveReturnType_Taqj12_4() {
        Method method = MethodLookupUtils.lookupMethod(Integer.class, "intValue", new Object[0]);
        assertEquals(int.class, method.getReturnType());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithArrayParameter_lfwH13_1() {
        Method method = MethodLookupUtils.lookupMethod(Arrays.class, "asList", new Object[]{new String[]{"arg1", "arg2"}});
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithArrayParameter_lfwH13_2() {
        Method method = MethodLookupUtils.lookupMethod(Arrays.class, "asList", new Object[]{new String[]{"arg1", "arg2"}});
        assertEquals("asList", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithArrayParameter_lfwH13_3() {
        Method method = MethodLookupUtils.lookupMethod(Arrays.class, "asList", new Object[]{new String[]{"arg1", "arg2"}});
        assertEquals(1, method.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_SingleParameter_ofUi2_fid1() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"parameter"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_MultipleParameters_xgJc3_fid1() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NullParameter_cmtr4_fid1() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{null};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_AmbiguousMethod_ekpc6() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "substring", new Object[]{1, 2});
        assertNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod_MethodWithParameters_UrLE7_3_fid1() {
        Method method = MethodLookupUtils.lookupMethod(String.class, "substring", new Object[]{1, 2});
        assertEquals(2, method.getParameterTypes().length);
    }
}