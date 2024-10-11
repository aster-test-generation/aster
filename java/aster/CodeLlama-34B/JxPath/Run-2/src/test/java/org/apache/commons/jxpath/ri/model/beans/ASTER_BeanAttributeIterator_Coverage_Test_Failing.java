/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeanAttributeIterator_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithIncludeXmlLang_LygE0() {
        BeanAttributeIterator iterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH), new QName("name"));
        iterator.setPosition(1);
        assertTrue(iterator.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithoutIncludeXmlLang_yuyu1() {
        BeanAttributeIterator iterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH), new QName("name"));
        iterator.setPosition(2);
        assertTrue(iterator.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_xcji0_1() {
        BeanPointer parent = new BeanPointer(new QName("parent"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH);
        BeanAttributeIterator iterator = new BeanAttributeIterator(parent, new QName("name"));
        NodePointer nodePointer = iterator.getNodePointer();
        assertTrue(nodePointer instanceof LangAttributePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_xcji0_2() {
        BeanPointer parent = new BeanPointer(new QName("parent"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH);
        BeanAttributeIterator iterator = new BeanAttributeIterator(parent, new QName("name"));
        NodePointer nodePointer = iterator.getNodePointer();
        assertEquals(parent, nodePointer.getParent());
    }
}