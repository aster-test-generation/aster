/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Failing {
    private Object bean;
    private QName name;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private JXPathBasicBeanInfo beanInfo;
    @Mock
    private Locale locale;
    @Mock
    private QName qName;
    @Mock
    private Object object;
    @Mock
    private BeanPointer other;
    @InjectMocks
    private BeanPointer beanPointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithEmptyQName_mrCU8() {
        BeanPointer beanPointer = new BeanPointer(new QName(""), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH);
        int length = beanPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNullBean_JKyL9() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), null, new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH);
        int length = beanPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNullBeanInfo_CZgG10() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), null, Locale.ENGLISH);
        int length = beanPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue10_YsWD9() {
        BeanPointer beanPointer = new BeanPointer(new QName("bean"), new Object(), new JXPathBasicBeanInfo(Object.class), Locale.ENGLISH);
        Object baseValue = beanPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_AtomicValue_OjzS1() {
        BeanPointer beanPointer = new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class, true), null);
        assertTrue(beanPointer.isLeaf());
    }
}