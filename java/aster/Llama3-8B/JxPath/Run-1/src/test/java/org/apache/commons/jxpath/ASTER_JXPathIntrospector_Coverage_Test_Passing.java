/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathIntrospector_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_ReturnsInstantiatedBeanInfo_sfhK0_1() {
        Class beanClass = JXPathIntrospector.class;
        JXPathIntrospector jxpathIntrospector = new JXPathIntrospector();
        JXPathBeanInfo beanInfo = jxpathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_ReturnsJXPathBeanInfo_iSNq0() {
        Class beanClass = JXPathIntrospector.class;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoDynamicBeanInfo_erHf0_igYD1_2() {
        Class beanClass = JXPathIntrospector.class;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertFalse(beanInfo.isDynamic());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoSuperclass_XRwm2_mJRU1_1() {
        Class beanClass = JXPathIntrospector.class.getSuperclass();
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoSuperclass_XRwm2_mJRU1_2() {
        Class beanClass = JXPathIntrospector.class.getSuperclass();
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertFalse(beanInfo.isDynamic());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithClassLoader_odvY0_BrEu1() throws Exception {
        Class beanClass = JXPathIntrospector.class;
        JXPathIntrospector.registerAtomicClass(beanClass);
        JXPathIntrospector.getBeanInfo(beanClass);
    }
}