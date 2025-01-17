/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MethodLookupUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_OneParameter_DYTd2() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"parameter"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_MultipleParameters_iMxH3() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{"parameter1", "parameter2"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NullParameter_QtXM4() {
        Class targetClass = MethodLookupUtils.class;
        Object[] parameters = new Object[]{null};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NullTargetClass_ApPA5() {
        Class targetClass = null;
        Object[] parameters = new Object[]{"parameter"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_NullParametersAndTargetClass_NiLt6() {
        Class targetClass = null;
        Object[] parameters = null;
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_TwoParameters_cOpY3_1() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_TwoParameters_cOpY3_2() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(2, constructor.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_TwoParameters_cOpY3_3() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_TwoParameters_cOpY3_4() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ThreeParameters_byeM4_1() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ThreeParameters_byeM4_2() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(3, constructor.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ThreeParameters_byeM4_3() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ThreeParameters_byeM4_4() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ThreeParameters_byeM4_5() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FourParameters_vRRy5_1() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FourParameters_vRRy5_2() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(4, constructor.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FourParameters_vRRy5_3() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FourParameters_vRRy5_4() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FourParameters_vRRy5_5() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FourParameters_vRRy5_6() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6_1() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6_2() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(5, constructor.getParameterTypes().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6_3() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6_4() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6_5() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6_6() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6_7() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NullClass_veCv0() {
        Method method = MethodLookupUtils.lookupStaticMethod(null, "methodName", new Object[0]);
        assertNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NullName_RLHw1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, null, new Object[0]);
        assertNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ExistentMethod_NGtW5_1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "lookupStaticMethod", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ExistentMethod_NGtW5_2() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "lookupStaticMethod", new Object[0]);
        assertEquals("lookupStaticMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_PublicMethod_QssC10_1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "publicMethod", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_PublicMethod_QssC10_2() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "publicMethod", new Object[0]);
        assertEquals("publicMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_StaticMethod_fOIA11_1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "staticMethod", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_StaticMethod_fOIA11_2() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "staticMethod", new Object[0]);
        assertEquals("staticMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_FinalMethod_Tqgs12_1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "finalMethod", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_FinalMethod_Tqgs12_2() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "finalMethod", new Object[0]);
        assertEquals("finalMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_SynchronizedMethod_AiRt13_1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "synchronizedMethod", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_SynchronizedMethod_AiRt13_2() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "synchronizedMethod", new Object[0]);
        assertEquals("synchronizedMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NativeMethod_WrmD14_1() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "nativeMethod", new Object[0]);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NativeMethod_WrmD14_2() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "nativeMethod", new Object[0]);
        assertEquals("nativeMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod1_aMDz0_NbPe0() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, new Object[]{targetClass, name, new Object[0]}};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(method.getName(), name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod2_KGJU1_zNgv0() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, new Object[0]};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(method.getParameterTypes(), parameters);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod3_HFal2_LmUy0() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(method.getReturnType(), Method.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod4_mCYC3_MOnc0() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, new Object[]{targetClass, name, new Object[0]}};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(method.getModifiers(), Modifier.PUBLIC);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod5_HSiB4_kSxu0() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, new Object[]{targetClass, name, new Object[0]}};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(method.getDeclaringClass(), targetClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod7_QAtx6_dMSy0() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, new Object[0]};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(method.getParameterCount(), parameters.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_TwoParameters_cOpY3_2_fid1() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(2, constructor.getParameterCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ThreeParameters_byeM4_3_fid1() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
        assertEquals(String.class, constructor.getParameterTypes()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod3_HFal2_LmUy0_fid1() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, null};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertEquals(method.getReturnType(), Void.TYPE);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod4_mCYC3_MOnc0_fid1() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, new Object[]{targetClass, name, new Object[0]}};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertNotNull(method);
        assertEquals(method.getModifiers(), Modifier.PUBLIC);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupMethod5_HSiB4_kSxu0_fid1() {
        Class targetClass = MethodLookupUtils.class;
        String name = "lookupMethod";
        Object[] parameters = new Object[]{targetClass, name, new Object[]{targetClass, name, new Object[0]}};
        Method method = MethodLookupUtils.lookupMethod(targetClass, name, parameters);
        assertNotNull(method);
        assertEquals(method.getDeclaringClass(), targetClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_TwoParameters_cOpY3() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
        assertEquals(2, constructor.getParameterTypes().length);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_ThreeParameters_byeM4() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
        assertEquals(3, constructor.getParameterTypes().length);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
        assertEquals(String.class, constructor.getParameterTypes()[2]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FourParameters_vRRy5() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
        assertEquals(4, constructor.getParameterTypes().length);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
        assertEquals(String.class, constructor.getParameterTypes()[2]);
        assertEquals(String.class, constructor.getParameterTypes()[3]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupConstructor_FiveParameters_uejv6() throws Exception {
        Class targetClass = String.class;
        Object[] parameters = new Object[]{"hello", "world", "!", "!", "!"};
        Constructor constructor = MethodLookupUtils.lookupConstructor(targetClass, parameters);
        assertNotNull(constructor);
        assertEquals(5, constructor.getParameterTypes().length);
        assertEquals(String.class, constructor.getParameterTypes()[0]);
        assertEquals(String.class, constructor.getParameterTypes()[1]);
        assertEquals(String.class, constructor.getParameterTypes()[2]);
        assertEquals(String.class, constructor.getParameterTypes()[3]);
        assertEquals(String.class, constructor.getParameterTypes()[4]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_ExistentMethod_NGtW5() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "lookupStaticMethod", new Object[0]);
        assertNotNull(method);
        assertEquals("lookupStaticMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_PublicMethod_QssC10() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "publicMethod", new Object[0]);
        assertNotNull(method);
        assertEquals("publicMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_StaticMethod_fOIA11() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "staticMethod", new Object[0]);
        assertNotNull(method);
        assertEquals("staticMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_FinalMethod_Tqgs12() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "finalMethod", new Object[0]);
        assertNotNull(method);
        assertEquals("finalMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_SynchronizedMethod_AiRt13() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "synchronizedMethod", new Object[0]);
        assertNotNull(method);
        assertEquals("synchronizedMethod", method.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLookupStaticMethod_NativeMethod_WrmD14() {
        Method method = MethodLookupUtils.lookupStaticMethod(MethodLookupUtils.class, "nativeMethod", new Object[0]);
        assertNotNull(method);
        assertEquals("nativeMethod", method.getName());
    }
}