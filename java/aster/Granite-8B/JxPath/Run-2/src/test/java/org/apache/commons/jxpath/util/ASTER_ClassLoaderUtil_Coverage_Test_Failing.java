/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassLoaderUtil_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getClass_with_contextCL_not_null_ymyj0() throws java.lang.ClassNotFoundException {
        ClassLoader contextCL = new ClassLoader() {};
        String className = "test";
        boolean initialize = true;
        try {
            Class clazz =ClassLoaderUtil.getClass(contextCL, className, initialize);
            assertNotNull(clazz);
        } catch (ClassNotFoundException e) {
            fail("ClassNotFoundException should not be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getClass_with_contextCL_null_YcNa1() throws java.lang.ClassNotFoundException {
        ClassLoader contextCL = null;
        String className = "test";
        boolean initialize = true;
        try {
            Class clazz =ClassLoaderUtil.getClass(contextCL, className, initialize);
            assertNotNull(clazz);
        } catch (ClassNotFoundException e) {
            fail("ClassNotFoundException should not be thrown");
        }
    }
}