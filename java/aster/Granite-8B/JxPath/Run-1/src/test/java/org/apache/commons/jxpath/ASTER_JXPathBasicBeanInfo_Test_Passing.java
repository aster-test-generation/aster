/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.beans.PropertyDescriptor;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathBasicBeanInfo_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithClassAndAtomic_FnLx0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, true);
        String result = beanInfo.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithClass_sAJI1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class);
        String result = beanInfo.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithClassAndDynamicPropertyHandlerClass_GJcd2() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, PropertyDescriptor.class);
        String result = beanInfo.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithoutDynamicPropertyHandlerClass_Bsse3() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, null);
        String result = beanInfo.toString();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAtomicTrue_lytv0_OXYR0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, true);
        assertTrue(beanInfo.isAtomic());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAtomicFalse_hNTQ1_SJPW1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Class.class, false);
        assertFalse(beanInfo.isAtomic());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsAtomicDynamicPropertyHandlerClass_yDhn2_rYXa0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDynamicPropertyHandlerClass1_TtgQ1_QNLj1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, null);
        boolean result = beanInfo.isDynamic();
        assert !result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsForClass_kpgJ0_XLBt1_1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        Assertions.assertNotNull(propertyDescriptors);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsForClass_kpgJ0_XLBt1_2() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsForInterface_GBBt1_OqDU0_1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, true);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        Assertions.assertNotNull(propertyDescriptors);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsForClassWithDynamicPropertyHandler_IxQs2_ZdMF0_1() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, DynamicPropertyHandler.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        Assertions.assertNotNull(propertyDescriptors);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptor2_lmsV1_TFaJ0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, null);
        PropertyDescriptor propertyDescriptor = beanInfo.getPropertyDescriptor("propertyName");
        Assertions.assertNull(propertyDescriptor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDynamicTrue_uhYL0_BWxa0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class, Object.class);
        boolean result = beanInfo.isDynamic();
        assert result == true;
    }
}