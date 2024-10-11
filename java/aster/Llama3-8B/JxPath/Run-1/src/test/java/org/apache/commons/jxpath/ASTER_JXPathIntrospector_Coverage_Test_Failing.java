/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathIntrospector_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_ReturnsInstantiatedBeanInfo_sfhK0_2() {
        Class beanClass = JXPathIntrospector.class;
        JXPathIntrospector jxpathIntrospector = new JXPathIntrospector();
        JXPathBeanInfo beanInfo = jxpathIntrospector.getBeanInfo(beanClass);
        assertEquals(JXPathBeanInfo.class, beanInfo.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoDynamicBeanInfo_erHf0_igYD1_2_fid1() {
        Class beanClass = JXPathIntrospector.class;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertTrue(beanInfo.isDynamic());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_ReturnsInstantiatedBeanInfo_sfhK0() {
        Class beanClass = JXPathIntrospector.class;
        JXPathIntrospector jxpathIntrospector = new JXPathIntrospector();
        JXPathBeanInfo beanInfo = jxpathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
        assertEquals(JXPathBeanInfo.class, beanInfo.getClass());
    }
}