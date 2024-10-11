/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathIntrospector_Coverage_Test_Failing {
    private Map<Class, JXPathBasicBeanInfo> byInterface;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_interface_null_Kist2() {
        Class beanClass = null;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithNullClass_SiHb1() throws Exception {
        Class beanClass = null;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithNonExistentClass_GJqX2() throws Exception {
        Class beanClass = Class.forName("NonExistentClass");
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }
}