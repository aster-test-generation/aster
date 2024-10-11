/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathIntrospector_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBeanInfo2_gNre1() {
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(Class.class);
        JXPathBeanInfo beanInfo2 = JXPathIntrospector.getBeanInfo(Class.class);
        assertEquals(beanInfo, beanInfo2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBeanInfo3_DHab2() {
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(Class.class);
        JXPathBeanInfo beanInfo2 = JXPathIntrospector.getBeanInfo(Class.class);
        assertTrue(beanInfo == beanInfo2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBeanInfo5_wdbs4() {
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(Class.class);
        JXPathBeanInfo beanInfo2 = JXPathIntrospector.getBeanInfo(Class.class);
        assertEquals(beanInfo.toString(), beanInfo2.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBeanInfo6_AmZg5() {
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(Class.class);
        JXPathBeanInfo beanInfo2 = JXPathIntrospector.getBeanInfo(Class.class);
        assertEquals(beanInfo.hashCode(), beanInfo2.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBeanInfo7_jOyw6() {
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(Class.class);
        JXPathBeanInfo beanInfo2 = JXPathIntrospector.getBeanInfo(Class.class);
        assertEquals(beanInfo.getClass(), beanInfo2.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterDynamicClass_TbVK0() {
        Class beanClass = Class.class;
        Class dynamicPropertyHandlerClass = Class.class;
        JXPathIntrospector.registerDynamicClass(beanClass, dynamicPropertyHandlerClass);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterDynamicClassWithNullDynamicPropertyHandlerClass_jiBI2() {
        Class beanClass = Class.class;
        Class dynamicPropertyHandlerClass = null;
        JXPathIntrospector.registerDynamicClass(beanClass, dynamicPropertyHandlerClass);
    }
}