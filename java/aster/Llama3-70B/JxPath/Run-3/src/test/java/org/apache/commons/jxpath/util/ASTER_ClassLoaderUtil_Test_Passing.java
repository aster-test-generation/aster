/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassLoaderUtil_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClass_MDQk0() {
        try {
            Class<?> clazz = ClassLoaderUtil.getClass("java.lang.String");
            assertNotNull(clazz);
            assertEquals("java.lang.String", clazz.getName());
        } catch (ClassNotFoundException e) {
            fail("ClassNotFoundException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithContextClassLoader_PKXY0() throws ClassNotFoundException {
        ClassLoader contextCL = Thread.currentThread().getContextClassLoader();
        Class clazz = ClassLoaderUtil.getClass("java.lang.String", true);
        assertNotNull(clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithCurrentClassLoader_wcgN1() throws ClassNotFoundException {
        ClassLoader currentCL = ClassLoaderUtil.class.getClassLoader();
        Class clazz = ClassLoaderUtil.getClass("java.lang.Integer", false);
        assertNotNull(clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClass_abbreviationMapContainsKey_yRTT0_kEao0() throws ClassNotFoundException {
        String className = "java.lang.String";
        boolean initialize = true;
        Class clazz = ClassLoaderUtil.getClass(className, initialize);
        assertEquals(String.class, clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClass_abbreviationMapDoesNotContainKey_TEZx1_Ooad0() throws ClassNotFoundException {
        String className = "java.lang.Integer[]";
        boolean initialize = false;
        Class clazz = ClassLoaderUtil.getClass(className, initialize);
        assertEquals(Integer[].class, clazz);
    }
}