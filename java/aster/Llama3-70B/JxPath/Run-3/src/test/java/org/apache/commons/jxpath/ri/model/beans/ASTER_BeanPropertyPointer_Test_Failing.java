/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPropertyPointer_Test_Failing {
    private static final Object UNINITIALIZED = "UNINITIALIZED";
    private Object value = UNINITIALIZED;
    private BeanPropertyPointer beanpropertypointer;
    private DOMNodePointer parent;
    private JXPathBasicBeanInfo beanInfo;
    private PropertyDescriptor pd;
    private Object bean;
    private String propertyName;
    private IndexedPropertyDescriptor indexedPd;
    @Mock
    private ValueUtils valueUtils;
    @Mock
    private PropertyDescriptor propertyDescriptor;
    @Mock
    private Object collection;
    private transient PropertyDescriptor[] propertyDescriptors;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_biwn0() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
        org.apache.commons.jxpath.JXPathContext context = mock(org.apache.commons.jxpath.JXPathContext.class);
        BeanPropertyPointer beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(parent.createPath(context)).thenReturn(null);
        org.apache.commons.jxpath.ri.model.NodePointer result = beanpropertypointer.createPath(context);
        assertNull(result);
        verify(parent, times(1)).createPath(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisActualProperty_opIH0_1_fid3() throws Exception {
        DOMNodePointer domNodePointer = org.mockito.Mockito.mock(DOMNodePointer.class);
        JXPathBasicBeanInfo jXPathBasicBeanInfo = org.mockito.Mockito.mock(JXPathBasicBeanInfo.class);
        PropertyDescriptor propertyDescriptor = org.mockito.Mockito.mock(PropertyDescriptor.class);
        BeanPropertyPointer beanpropertypointer;
        beanpropertypointer = new BeanPropertyPointer(domNodePointer, jXPathBasicBeanInfo);
        Field propertyDescriptorField = BeanPropertyPointer.class.getDeclaredField("propertyDescriptor");
        propertyDescriptorField.setAccessible(true);
        propertyDescriptorField.set(beanpropertypointer, propertyDescriptor);
        propertyDescriptorField.set(beanpropertypointer, null);
        assertTrue(beanpropertypointer.isActualProperty());
    }
}