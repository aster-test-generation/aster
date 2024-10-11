/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Failing {
    private Object bean;
    private QName name;
    private DOMNodePointer parent;
    private JXPathBasicBeanInfo beanInfo;
    private Locale locale;
    BeanPointer beanpointer;
    BeanPointer otherBeanPointer;
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
    @Mock
    private JXPathIntrospector jxpathIntrospector;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullParent_wQKW2() {
        BeanPointer beanPointer1 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        BeanPointer beanPointer2 = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertTrue(beanPointer1.equals(beanPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullName_xlSM4() {
        BeanPointer beanPointer1 = new BeanPointer(null, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        BeanPointer beanPointer2 = new BeanPointer(null, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        assertTrue(beanPointer1.equals(beanPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Given
        when(name.getName()).thenReturn("mockedName");
        // When
        String result = beanpointer.getName().getName();
        // Then
        assertEquals("mockedName", result);
        verify(name, times(1)).getName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        MockitoAnnotations.initMocks(this);
        // Mock getNode() to return null
        when(beanpointer.getNode()).thenReturn(null);
        assertTrue(beanpointer.isLeaf());
        // Mock getNode() to return a non-null value
        Object value = new Object();
        when(beanpointer.getNode()).thenReturn(value);
        when(JXPathIntrospector.getBeanInfo(value.getClass())).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(true);
        assertTrue(beanpointer.isLeaf());
        // Mock getNode() to return a non-null value with non-atomic bean info
        when(beanpointer.getNode()).thenReturn(value);
        when(JXPathIntrospector.getBeanInfo(value.getClass())).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        assertFalse(beanpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        name = mock(QName.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        bean = mock(Object.class);
        locale = mock(Locale.class);
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        when(name.hashCode()).thenReturn(123);
        assertEquals(123, beanpointer.hashCode());
        when(name.hashCode()).thenReturn(0);
        assertEquals(0, beanpointer.hashCode());
        name = null;
        assertEquals(0, beanpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_1() throws Exception {
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        MockitoAnnotations.initMocks(this);
        // Mock getNode() to return null
        when(beanpointer.getNode()).thenReturn(null);
        // Mock getNode() to return a non-null value
        Object value = new Object();
        when(beanpointer.getNode()).thenReturn(value);
        when(JXPathIntrospector.getBeanInfo(value.getClass())).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(true);
        // Mock getNode() to return a non-null value with non-atomic bean info
        when(beanpointer.getNode()).thenReturn(value);
        when(JXPathIntrospector.getBeanInfo(value.getClass())).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        assertTrue(beanpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_3() throws Exception {
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        MockitoAnnotations.initMocks(this);
        // Mock getNode() to return null
        when(beanpointer.getNode()).thenReturn(null);
        // Mock getNode() to return a non-null value
        Object value = new Object();
        when(beanpointer.getNode()).thenReturn(value);
        when(JXPathIntrospector.getBeanInfo(value.getClass())).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(true);
        // Mock getNode() to return a non-null value with non-atomic bean info
        when(beanpointer.getNode()).thenReturn(value);
        when(JXPathIntrospector.getBeanInfo(value.getClass())).thenReturn(beanInfo);
        when(beanInfo.isAtomic()).thenReturn(false);
        assertFalse(beanpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode_1() throws Exception {
        name = mock(QName.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        bean = mock(Object.class);
        locale = mock(Locale.class);
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        when(name.hashCode()).thenReturn(123);
        when(name.hashCode()).thenReturn(0);
        name = null;
        assertEquals(123, beanpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode_2() throws Exception {
        name = mock(QName.class);
        beanInfo = mock(JXPathBasicBeanInfo.class);
        bean = mock(Object.class);
        locale = mock(Locale.class);
        beanpointer = new BeanPointer(name, bean, beanInfo, locale);
        when(name.hashCode()).thenReturn(123);
        when(name.hashCode()).thenReturn(0);
        name = null;
        assertEquals(0, beanpointer.hashCode());
    }
}