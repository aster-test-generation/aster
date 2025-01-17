/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathIntrospector_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithValidClass_xQOH0() {
        JXPathBeanInfo actual = JXPathIntrospector.getBeanInfo(Class.class);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithNoSuperClass_Vapl2() {
        JXPathBeanInfo actual = JXPathIntrospector.getBeanInfo(JXPathBeanInfo.class);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithNoInterfaces_xXNu3() {
        JXPathBeanInfo actual = JXPathIntrospector.getBeanInfo(JXPathIntrospector.class);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithNoBeanInfoFound_huSo4() {
        JXPathBeanInfo actual = JXPathIntrospector.getBeanInfo(Object.class);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterDynamicClass_cZeF0() {
        JXPathIntrospector.registerDynamicClass(Class.class, Class.class);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterDynamicClassWithNullDynamicPropertyHandlerClass_sTVs2() {
        JXPathIntrospector.registerDynamicClass(Class.class, null);
    }
}