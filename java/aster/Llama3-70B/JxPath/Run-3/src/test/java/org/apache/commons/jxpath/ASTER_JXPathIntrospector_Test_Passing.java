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

public class Aster_JXPathIntrospector_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_ByClass_PbTj0() {
        Class<?> beanClass = JXPathIntrospector.class;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_FindDynamicBeanInfo_KFQJ1() {
        Class<?> beanClass = String.class;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_FindInformant_kAqQ2() {
        Class<?> beanClass = JXPathBeanInfo.class;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_NewJXPathBasicBeanInfo_hlxt3() {
        Class<?> beanClass = Object.class;
        JXPathBeanInfo beanInfo = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_NewJXPathBasicBeanInfo_dDng3_1() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        Class<?> beanClass = String.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_NewJXPathBasicBeanInfo_dDng3_2() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        Class<?> beanClass = String.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertTrue(result instanceof JXPathBasicBeanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterDynamicClass_Interface_JscH0_sdiY0() {
        Class<?> beanClass = Object.class;
        Class<?> dynamicPropertyHandlerClass = DynamicPropertyHandler.class;
        JXPathIntrospector.registerDynamicClass(beanClass, dynamicPropertyHandlerClass);
        assertEquals(JXPathBasicBeanInfo.class, JXPathIntrospector.getBeanInfo(beanClass).getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_FindInformant_CLZP2_jxHR0() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        Class<?> beanClass = Object.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_FindDynamicBeanInfo_rXrd1_olGc0() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        Class<?> beanClass = JXPathIntrospector.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfo_NewJXPathBasicBeanInfo_dDng3() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        Class<?> beanClass = String.class;
        JXPathBeanInfo result = JXPathIntrospector.getBeanInfo(beanClass);
        assertNotNull(result);
        assertTrue(result instanceof JXPathBasicBeanInfo);
    }
}