/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassLoaderUtil_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithValidClassNameAndInitializeTrue_Jhtv0() throws Exception {
        final String className = "java.lang.String";
        final boolean initialize = true;
        final Class expectedClass = String.class;
        final Class actualClass = ClassLoaderUtil.getClass(className, initialize);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithValidClassNameAndInitializeFalse_ZsBG1() throws Exception {
        final String className = "java.lang.Integer";
        final boolean initialize = false;
        final Class expectedClass = Integer.class;
        final Class actualClass = ClassLoaderUtil.getClass(className, initialize);
        assertEquals(expectedClass, actualClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithValidClassName_eSbc0() throws ClassNotFoundException {
        String className = "java.lang.String";
        Class<?> clazz = ClassLoaderUtil.getClass(className);
        assertEquals(String.class, clazz);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClassWithInvalidClassName_hLvd1() {
        String className = "invalid.class.Name";
        try {
            ClassLoaderUtil.getClass(className);
            fail("Expected ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            assertEquals("java.lang.ClassNotFoundException: invalid.class.Name", e.toString());
        }
    }
}