/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassLoaderUtil_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithContextCL_DNOO0() throws ClassNotFoundException {
        String className = "java.lang.String";
        boolean initialize = true;
        ClassLoader contextCL = Thread.currentThread().getContextClassLoader();
        ClassLoader currentCL = ClassLoaderUtil.class.getClassLoader();
        ClassLoaderUtil classLoaderUtil = new ClassLoaderUtil();
        Class<?> result = classLoaderUtil.getClass(className, initialize);
        assertEquals(contextCL, result.getClassLoader());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithCurrentCL_XIMe1() throws ClassNotFoundException {
        String className = "java.lang.String";
        boolean initialize = true;
        ClassLoader contextCL = null;
        ClassLoader currentCL = ClassLoaderUtil.class.getClassLoader();
        ClassLoaderUtil classLoaderUtil = new ClassLoaderUtil();
        Class<?> result = classLoaderUtil.getClass(className, initialize);
        assertEquals(currentCL, result.getClassLoader());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithNullClassLoader_wAjH3() throws ClassNotFoundException {
        ClassLoader classLoader = null;
        String className = "java.lang.String";
        boolean initialize = true;
        Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className, initialize);
        assertNull(clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithNullClassLoaderAndClassName_QZtz5() throws ClassNotFoundException {
        ClassLoader classLoader = null;
        String className = null;
        boolean initialize = true;
        Class<?> clazz = ClassLoaderUtil.getClass(classLoader, className, initialize);
        assertNull(clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithContextCL_DNOO0_fid1() throws ClassNotFoundException {
        String className = "java.lang.String";
        boolean initialize = true;
        ClassLoader contextCL = Thread.currentThread().getContextClassLoader();
        ClassLoader currentCL = ClassLoaderUtil.class.getClassLoader();
        ClassLoaderUtil classLoaderUtil = new ClassLoaderUtil();
        Class<?> result = classLoaderUtil.getClass(className, initialize);
        assertNull(contextCL);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithCurrentCL_XIMe1_fid1() throws ClassNotFoundException {
        String className = "java.lang.String";
        boolean initialize = true;
        ClassLoader contextCL = null;
        ClassLoader currentCL = ClassLoaderUtil.class.getClassLoader();
        ClassLoaderUtil classLoaderUtil = new ClassLoaderUtil();
        Class<?> result = classLoaderUtil.getClass(className, initialize);
        assertNull(currentCL);
    }
}