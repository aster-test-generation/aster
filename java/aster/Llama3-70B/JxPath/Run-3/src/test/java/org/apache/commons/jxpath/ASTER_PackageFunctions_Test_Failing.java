/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.util.ClassLoaderUtil;
import org.apache.commons.jxpath.util.MethodLookupUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PackageFunctions_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction3_bDId2() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[]{new Object()};
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction7_oHZA6() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[]{new Object()};
        Method method = MethodLookupUtils.lookupMethod(Object.class, "name", parameters);
        assertNotNull(method);
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction7_oHZA6_1() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[]{new Object()};
        Method method = MethodLookupUtils.lookupMethod(Object.class, "name", parameters);
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction7_oHZA6_2() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[]{new Object()};
        Method method = MethodLookupUtils.lookupMethod(Object.class, "name", parameters);
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction9_ymyw8_oyaI0_1() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[]{new ArrayList()};
        Method method = MethodLookupUtils.lookupMethod(Collection.class, "name", parameters);
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
        assertNotNull(method);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction9_ymyw8_oyaI0_2() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[]{new ArrayList()};
        Method method = MethodLookupUtils.lookupMethod(Collection.class, "name", parameters);
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction11_OiyA10_OfZM0() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        String fullName = "classPrefix" + "name";
        int inx = fullName.lastIndexOf('.');
        String className;
        String methodName;
        if (inx != -1) {
            className = fullName.substring(0, inx);
            methodName = fullName.substring(inx + 1);
        }
        else {
            className = fullName;
            methodName = "";
        }
        Class functionClass = null;
        try {
            functionClass = ClassLoaderUtil.getClass(className, true);
            assertNotNull(functionClass);
        } catch (ClassNotFoundException ex) {
            fail("ClassNotFoundException was thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction5_wEhH4_EsmO0_fid3() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        Object[] parameters = new Object[]{new ArrayList<>()};
        Function function = packageFunctions.getFunction("namespace", "name", parameters);
        assertNotNull(function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction11_OiyA10_OfZM0_fid3() {
        PackageFunctions packageFunctions = new PackageFunctions("classPrefix", "namespace");
        String fullName = "classPrefix" + "name";
        int inx = fullName.lastIndexOf('.');
        String className = fullName.substring(0, inx);
        String methodName = fullName.substring(inx + 1);
        Class functionClass = null;
        try {
            functionClass = ClassLoaderUtil.getClass(className, true);
            assertNotNull(functionClass);
        } catch (ClassNotFoundException ex) {
            fail("ClassNotFoundException was thrown");
        }
    }
}