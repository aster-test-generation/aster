/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPropertyPointer_Test_Passing {
    private static final Object UNINITIALIZED = null;
    private Object value = UNINITIALIZED;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private JXPathBasicBeanInfo beanInfo;
    @Mock
    private PropertyDescriptor pd;
    @Mock
    private Object bean;
    @Mock
    private ValueUtils valueUtils;
    private BeanPropertyPointer beanpropertypointer;
    private String propertyName;
    @Mock
    private PropertyDescriptor propertyDescriptor;
    private BeanPropertyPointer beanPropertyPointer;
    private IndexedPropertyDescriptor indexedPd;
    @Mock
    private Object baseValue;
    private JXPathContext context;
    private Object collection;
    private transient PropertyDescriptor[] propertyDescriptors;
    private transient String[] names;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_1() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        propertyDescriptors = new PropertyDescriptor[]{mock(PropertyDescriptor.class), mock(PropertyDescriptor.class)};
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(propertyDescriptors[0].getName()).thenReturn("property1");
        when(propertyDescriptors[1].getName()).thenReturn("property2");
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        String[] result = beanpropertypointer.getPropertyNames();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_2() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        propertyDescriptors = new PropertyDescriptor[]{mock(PropertyDescriptor.class), mock(PropertyDescriptor.class)};
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(propertyDescriptors[0].getName()).thenReturn("property1");
        when(propertyDescriptors[1].getName()).thenReturn("property2");
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        String[] result = beanpropertypointer.getPropertyNames();
        assertEquals(2, result.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_3() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        propertyDescriptors = new PropertyDescriptor[]{mock(PropertyDescriptor.class), mock(PropertyDescriptor.class)};
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(propertyDescriptors[0].getName()).thenReturn("property1");
        when(propertyDescriptors[1].getName()).thenReturn("property2");
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        String[] result = beanpropertypointer.getPropertyNames();
        assertEquals("property1", result[0]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames_4() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        propertyDescriptors = new PropertyDescriptor[]{mock(PropertyDescriptor.class), mock(PropertyDescriptor.class)};
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(propertyDescriptors[0].getName()).thenReturn("property1");
        when(propertyDescriptors[1].getName()).thenReturn("property2");
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        String[] result = beanpropertypointer.getPropertyNames();
        assertEquals("property2", result[1]);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_bNal0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        when(beanInfo.isAtomic()).thenReturn(false);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[1];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        int result = beanpropertypointer.getPropertyCount();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_zPxe0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[5];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        int result = beanPropertyPointer.getPropertyCount();
        assertEquals(5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_WhenIsAtomic_nNTr0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanInfo.isAtomic()).thenReturn(true);
        int result = beanPropertyPointer.getPropertyCount();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_bCDa0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        when(beanInfo.isAtomic()).thenReturn(false);
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[0]);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        assertEquals(0, beanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_EZeQ0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        when(beanInfo.isAtomic()).thenReturn(false);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[5];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        assertEquals(5, beanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_uUdc0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        when(beanInfo.isAtomic()).thenReturn(false);
        PropertyDescriptor[] pd = new PropertyDescriptor[5];
        when(beanInfo.getPropertyDescriptors()).thenReturn(pd);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        assertEquals(5, beanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection7_dLYJ6_RwjU0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(new VariablePointer(new QName("")), null), beanInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_PropertyDescriptorNotNull_gLvA0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        propertyDescriptor = mock(PropertyDescriptor.class);
        bean = mock(Object.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanpropertypointer.getBean()).thenReturn(bean);
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[]{propertyDescriptor});
        when(beanInfo.isAtomic()).thenReturn(false);
        when(propertyDescriptor.getName()).thenReturn("immediateNode");
        int result = beanpropertypointer.getPropertyCount();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_kunT0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        when(beanInfo.isAtomic()).thenReturn(false);
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[0]);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        int result = beanpropertypointer.getPropertyCount();
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_rBxp0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        when(beanInfo.isAtomic()).thenReturn(false);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[5];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        int result = beanpropertypointer.getPropertyCount();
        assertEquals(5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_vzwx0() throws Exception {
        beanInfo = mock(JXPathBasicBeanInfo.class);
        parent = mock(DOMNodePointer.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        when(beanInfo.getPropertyDescriptors()).thenReturn(new PropertyDescriptor[0]);
        assertEquals(0, beanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_XnKk0() throws Exception {
        beanInfo = mock(JXPathBasicBeanInfo.class);
        parent = mock(DOMNodePointer.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[5];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        assertEquals(5, beanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_XWUY0() throws Exception {
        JXPathBasicBeanInfo beanInfo = mock(JXPathBasicBeanInfo.class);
        when(beanInfo.isAtomic()).thenReturn(false);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[5];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        DOMNodePointer parent = mock(DOMNodePointer.class);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(parent, beanInfo);
        int result = beanPropertyPointer.getPropertyCount();
        assertEquals(5, result);
        verify(beanInfo, times(1)).isAtomic();
        verify(beanInfo, times(1)).getPropertyDescriptors();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue2_KSCG1_Stpy0() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class, true);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(new VariablePointer(new QName("")), null), beanInfo);
        assertEquals(0, beanPropertyPointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_SkmZ0_1() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        int newIndex = 5;
        beanpropertypointer.setPropertyIndex(newIndex);
        assertEquals(newIndex, beanpropertypointer.propertyIndex);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_SkmZ0_2() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        int newIndex = 5;
        beanpropertypointer.setPropertyIndex(newIndex);
        assertNull(propertyName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_zLJQ0_1() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[0];
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        propertyDescriptors = new PropertyDescriptor[1];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(beanInfo.isAtomic()).thenReturn(true);
        assertEquals(0, beanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyCount_zLJQ0_2() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        PropertyDescriptor[] propertyDescriptors = new PropertyDescriptor[0];
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        propertyDescriptors = new PropertyDescriptor[1];
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(beanInfo.isAtomic()).thenReturn(true);
        assertEquals(1, beanpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNames() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        propertyDescriptors = new PropertyDescriptor[]{mock(PropertyDescriptor.class), mock(PropertyDescriptor.class)};
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(propertyDescriptors[0].getName()).thenReturn("property1");
        when(propertyDescriptors[1].getName()).thenReturn("property2");
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        String[] result = beanpropertypointer.getPropertyNames();
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("property1", result[0]);
        assertEquals("property2", result[1]);
    }
}