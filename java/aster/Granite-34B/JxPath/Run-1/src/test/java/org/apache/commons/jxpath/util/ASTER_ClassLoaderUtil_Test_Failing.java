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

public class Aster_ClassLoaderUtil_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithClassLoader_BRUX0() throws Exception {
        ClassLoader classLoader = new ClassLoader() {
        };
        String className = "example.ClassName";
        boolean initialize = true;
        Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className, initialize);
        assertNotNull(clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithoutClassLoader_WNVc1() throws Exception {
        ClassLoader classLoader = null;
        String className = "example.ClassName";
        boolean initialize = true;
        Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className, initialize);
        assertNotNull(clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithNullClassName_hRiP2() {
        String className = null;
        try {
            ClassLoaderUtil.getClass(className);
            fail("Expected ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            assertEquals("java.lang.ClassNotFoundException: null", e.toString());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithClassLoaderAndClassName_YVdY0_aSuN0() throws Exception {
        ClassLoader classLoader = new ClassLoader() {
        };
        String className = "class";
        Class expected = Object.class;
        assertEquals(expected, ClassLoaderUtil.getClass(classLoader, className));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithClassLoaderAndClassNameAndInitialize_pJmg1_pcCS0() throws Exception {
        ClassLoader classLoader = new ClassLoader() {
        };
        String className = "class";
        boolean initialize = true;
        Class expected = Object.class;
        assertEquals(expected, ClassLoaderUtil.getClass(classLoader, className, initialize));
    }
}