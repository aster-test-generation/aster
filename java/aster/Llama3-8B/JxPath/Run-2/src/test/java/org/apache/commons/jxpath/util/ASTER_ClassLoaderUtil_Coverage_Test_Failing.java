/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassLoaderUtil_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClass_ContextClassLoaderNotNull_SXbx0() throws ClassNotFoundException {
        String className = "test.Class";
        boolean initialize = true;
        ClassLoaderUtil classLoaderUtil = new ClassLoaderUtil();
        Class<?> result = classLoaderUtil.getClass(className, initialize);
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetClass_AbbreviationNull_IXKa1_GLyu1() throws ClassNotFoundException {
    Class clazz = ClassLoaderUtil.getClass("MyClass");
    assertEquals(Class.class, clazz);
}
}