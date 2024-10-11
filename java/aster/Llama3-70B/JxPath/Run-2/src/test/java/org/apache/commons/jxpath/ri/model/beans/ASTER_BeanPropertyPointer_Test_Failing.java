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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPropertyPointer_Test_Failing {
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
    public void testcreatePath_1() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        context = mock(JXPathContext.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        // given
        when(parent.getImmediateNode()).thenReturn(null);
        // when
        NodePointer result = beanpropertypointer.createPath(context);
        // then
        verify(parent).createPath(context);
        assertEquals(beanpropertypointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_2() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        context = mock(JXPathContext.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        // given
        when(parent.getImmediateNode()).thenReturn(null);
        // when
        NodePointer result = beanpropertypointer.createPath(context);
        // then
        verify(parent).createPath(context);
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_3() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        context = mock(JXPathContext.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        // given
        when(parent.getImmediateNode()).thenReturn(null);
        // when
        NodePointer result = beanpropertypointer.createPath(context);
        // then
        verify(parent).createPath(context);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPropertyIndex_SkmZ0_3() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        int newIndex = 5;
        beanpropertypointer.setPropertyIndex(newIndex);
        assertNull(propertyDescriptor);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        context = mock(JXPathContext.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        // given
        when(parent.getImmediateNode()).thenReturn(null);
        // when
        NodePointer result = beanpropertypointer.createPath(context);
        // then
        assertEquals(beanpropertypointer, result);
        verify(parent).createPath(context);
        assertNull(baseValue);
        assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection7_dLYJ6_RwjU0_fid3() {
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(String.class);
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(new VariablePointer(new QName("")), null), beanInfo);
        assertEquals(0, beanPropertyPointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_WHOLE_COLLECTION_FsqM0() throws Exception {
        parent = mock(DOMNodePointer.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        propertyDescriptor = mock(PropertyDescriptor.class);
        bean = mock(Object.class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanpropertypointer.getBaseValue()).thenReturn("baseValue");
        when(ValueUtils.getValue("baseValue")).thenReturn("immediateNode");
        Field indexField = BeanPropertyPointer.class.getDeclaredField("index");
        indexField.setAccessible(true);
        indexField.setInt(beanpropertypointer, BeanPropertyPointer.WHOLE_COLLECTION);
        Object result = beanpropertypointer.getImmediateNode();
        assertEquals("immediateNode", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremove_index_0_PFEh0() throws Exception {
        beanInfo = mock(JXPathBasicBeanInfo.class);
        parent = mock(DOMNodePointer.class);
        bean = mock(Object.class);
        propertyDescriptors = mock(PropertyDescriptor[].class);
        beanpropertypointer = new BeanPropertyPointer(parent, beanInfo);
        when(beanInfo.getPropertyDescriptors()).thenReturn(propertyDescriptors);
        when(propertyDescriptors.length).thenReturn(1);
        Field indexField = BeanPropertyPointer.class.getDeclaredField("index");
        indexField.setAccessible(true);
        indexField.setInt(beanpropertypointer, 0);
        beanpropertypointer.remove();
        assertEquals(BeanPropertyPointer.WHOLE_COLLECTION, indexField.getInt(beanpropertypointer));
        verify(beanpropertypointer).setValue(null);
    }
}