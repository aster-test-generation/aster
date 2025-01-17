/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.beans.PropertyDescriptor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPropertyPointer_Test_Failing {
    private transient PropertyDescriptor[] propertyDescriptors;
    private transient String[] names;
    private transient PropertyDescriptor propertyDescriptor;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors_oJti0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(null);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        PropertyDescriptor[] propertyDescriptors = beanPropertyPointer.getPropertyDescriptors();
        assertNotNull(propertyDescriptors);
        assertTrue(propertyDescriptors.length > 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptorsWithCoverage_Ruux1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(null);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        beanPropertyPointer.getPropertyDescriptors();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors_oJti0_1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(null);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        PropertyDescriptor[] propertyDescriptors = beanPropertyPointer.getPropertyDescriptors();
        assertNotNull(propertyDescriptors);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyDescriptors_oJti0_2() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(null);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        PropertyDescriptor[] propertyDescriptors = beanPropertyPointer.getPropertyDescriptors();
        assertTrue(propertyDescriptors.length > 0);
    }
}