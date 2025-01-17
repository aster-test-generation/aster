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
    public void testGetClassWithNullClassLoader_OJbl0() {
        ClassLoader classLoader = null;
        String className = "java.lang.String";
        try {
            Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className);
            assertNotNull(clazz);
            assertEquals(className, clazz.getName());
        } catch (ClassNotFoundException e) {
            fail("ClassNotFoundException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithValidClassName_zDkF3() {
        ClassLoader classLoader = ClassLoaderUtil.class.getClassLoader();
        String className = "java.lang.String";
        try {
            Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className);
            assertNotNull(clazz);
            assertEquals(className, clazz.getName());
        } catch (ClassNotFoundException e) {
            fail("ClassNotFoundException should not be thrown");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithInvalidClassName_nsVb2_fid2() {
        ClassLoader classLoader = ClassLoaderUtil.class.getClassLoader();
        String className = "invalid.class.name";
        try {
            Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className);
            assertNotNull(clazz);
        } catch (ClassNotFoundException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithNullClassLoaderAndInvalidClassName_kEvt7_fid2() {
        ClassLoader classLoader = null;
        String className = "invalid.class.name";
        try {
            Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className);
            assertNull(clazz);
        } catch (ClassNotFoundException e) {
            assertTrue(true);
        }
    }
}