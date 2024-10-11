/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassLoaderUtil_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithContextCL_Faqy0() throws ClassNotFoundException {
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
    public void testGetClassWithCurrentCL_dpnF1() throws ClassNotFoundException {
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
    public void testGetClassWithNullClassLoader_OhLT5() throws java.lang.ClassNotFoundException {
        ClassLoader classLoader = null;
        String className = "java.lang.String";
        try {
            ClassLoaderUtil.getClass(classLoader, className, true);
            Assertions.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            Assertions.assertEquals("classLoader", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithContextCL_Faqy0_fid1() throws ClassNotFoundException {
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
    public void testGetClassWithCurrentCL_dpnF1_fid1() throws ClassNotFoundException {
        String className = "java.lang.String";
        boolean initialize = true;
        ClassLoader contextCL = null;
        ClassLoader currentCL = ClassLoaderUtil.class.getClassLoader();
        ClassLoaderUtil classLoaderUtil = new ClassLoaderUtil();
        Class<?> result = classLoaderUtil.getClass(className, initialize);
        assertNull(currentCL);
    }
}