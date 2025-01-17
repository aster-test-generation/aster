/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Failing {
    private Object bean;
    private QName name;
    BeanPointer beanpointer;
    private JXPathBeanInfo beanInfo;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_qFNv1() {
        final Object object = null;
        final boolean actual = object.equals(this);
        final boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithParent_OyWt5() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        BeanPointer pointer = new BeanPointer(parent, null, null, null);
        assertEquals("/", pointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        beanpointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), new Locale("en"));
        when(beanpointer.getNode()).thenReturn(new Object());
        assertTrue(beanpointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithThisObject_Hfyt0_fid2() {
        final Object object = new Object();
        final boolean actual = object.equals(this);
        final boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBeanPropertyPointerCoverage_xBki1_5_fid2() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Class.class), new Locale("en"));
        PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
        Object bean = propertyPointer.getBean();
        String propertyName = propertyPointer.getPropertyName();
        NodePointer immediateValuePointer = propertyPointer.getImmediateValuePointer();
        Object immediateNode = propertyPointer.getImmediateNode();
        int hashCode = propertyPointer.hashCode();
        int propertyIndex = propertyPointer.getPropertyIndex();
        QName name = propertyPointer.getName();
        int length = propertyPointer.getLength();
        String[] propertyNames = propertyPointer.getPropertyNames();
        int propertyCount = propertyPointer.getPropertyCount();
        assertEquals(true, immediateNode != null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBeanPropertyPointerCoverage_xBki1() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Class.class), new Locale("en"));
        PropertyPointer propertyPointer = beanPointer.getPropertyPointer();
        assertEquals(true, propertyPointer != null);
        Object bean = propertyPointer.getBean();
        String propertyName = propertyPointer.getPropertyName();
        NodePointer immediateValuePointer = propertyPointer.getImmediateValuePointer();
        Object immediateNode = propertyPointer.getImmediateNode();
        int hashCode = propertyPointer.hashCode();
        int propertyIndex = propertyPointer.getPropertyIndex();
        QName name = propertyPointer.getName();
        int length = propertyPointer.getLength();
        String[] propertyNames = propertyPointer.getPropertyNames();
        int propertyCount = propertyPointer.getPropertyCount();
        assertEquals(true, bean != null);
        assertEquals(true, propertyName != null);
        assertEquals(true, immediateValuePointer != null);
        assertEquals(true, immediateNode != null);
        assertEquals(true, hashCode != 0);
        assertEquals(true, propertyIndex != 0);
        assertEquals(true, name != null);
        assertEquals(true, length != 0);
        assertEquals(true, propertyNames != null);
        assertEquals(true, propertyCount != 0);
    }
}