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

public class Aster_JXPathIntrospector_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithExistingBeanInfo_TVsc0_ASIN0() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        try {
            JXPathBeanInfo beanInfo = introspector.getBeanInfo(Class.forName("com.example.Bean"));
            assertNotNull(beanInfo);
        } catch (ClassNotFoundException e) {
            fail("Class not found exception was not expected");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithoutExistingBean_gxzl1_myld0() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        try {
            JXPathBeanInfo beanInfo = introspector.getBeanInfo(Class.forName("com.example.NonExistingBean"));
            assertNotNull(beanInfo);
            assertEquals(JXPathBasicBeanInfo.class, beanInfo.getClass());
        } catch (ClassNotFoundException e) {
            fail("Expected getBeanInfo to return a bean info, but threw a ClassNotFoundException");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithInstantiationError_rvtd3_LQvv0() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        try {
            Class<?> beanClass = Class.forName("com.example.InstantiationExceptionBean");
            introspector.registerAtomicClass(beanClass);
            JXPathBeanInfo beanInfo = introspector.getBeanInfo(beanClass);
            fail("Expected InstantiationException");
        } catch (ClassNotFoundException e) {
            fail("Expected InstantiationException, but got " + e.getMessage());
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                fail("Expected a different exception, but got " + e.getMessage());
            }
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithExistingBeanInfo_TVsc0_ASIN0_fid3() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        try {
            JXPathBeanInfo beanInfo = introspector.getBeanInfo(Class.forName("com.example.Bean"));
            assertNotNull(beanInfo);
        } catch (ClassNotFoundException e) {
            fail("Class not found exception was expected");
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBeanInfoWithDynamicBeanInfo_bKgs2_ZKQU0() {
        JXPathIntrospector introspector = new JXPathIntrospector();
        try {
            JXPathBeanInfo beanInfo = introspector.getBeanInfo(Class.forName("com.example.DynamicBean"));
            assertNotNull(beanInfo);
        } catch (ClassNotFoundException e) {
            fail("Class not found exception expected", e);
        }
    }
}