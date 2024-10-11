/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanAttributeIterator_Test_Passing {
    private int position = 0;
    BeanAttributeIterator beanattributeiterator;
    private boolean includeXmlLang;
    private NodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition_evXc0() {
        BeanAttributeIterator iterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(BeanAttributeIterator.class), new Locale("en")), new QName("name"));
        int position = iterator.getPosition();
        assertTrue(position == 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_hIih0() {
        BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Class.class), new Locale("")), new QName("name"));
        beanAttributeIterator.setPosition(1);
        Assertions.assertEquals(1, beanAttributeIterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_lsQm0() {
        BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Class.class), new Locale("")), new QName("name"));
        NodePointer nodePointer = beanAttributeIterator.getNodePointer();
        Assertions.assertNotNull(nodePointer);
    }
}