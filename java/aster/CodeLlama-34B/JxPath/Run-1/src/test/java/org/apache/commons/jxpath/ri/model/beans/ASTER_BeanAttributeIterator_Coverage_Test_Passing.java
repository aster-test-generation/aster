/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BeanAttributeIterator_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithIncludeXmlLang_oFgi0() {
        BeanPointer parent = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH);
        BeanAttributeIterator iterator = new BeanAttributeIterator(parent, new QName("name"));
        iterator.setPosition(1);
        assertEquals(1, iterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithoutIncludeXmlLang_BnGF1() {
        BeanPointer parent = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH);
        BeanAttributeIterator iterator = new BeanAttributeIterator(parent, new QName("name"));
        iterator.setPosition(2);
        assertEquals(2, iterator.getPosition());
    }
}