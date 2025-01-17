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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanPointer_Test_Failing {
    @Mock
    private DOMNodePointer parent;
    @Mock
    private JXPathBasicBeanInfo beanInfo;
    @Mock
    private QName name;
    private Object bean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafTrue_KABs0() {
        QName name = new QName("test");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(bean.getClass(), true);
        Locale locale = Locale.US;
        BeanPointer beanPointer = new BeanPointer(name, bean, beanInfo, locale);
        boolean result = beanPointer.isLeaf();
        assert(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathParent_rXNU7_CrJD0() {
        DOMNodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        QName qName = new QName("name");
        BeanPointer beanPointer = new BeanPointer(parent, qName, new Object(), new JXPathBasicBeanInfo(Object.class));
        assertEquals(parent.asPath(), beanPointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_AtomicBean_ReturnsTrue_KqBc0() {
        QName name = new QName("name");
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(null, true);
        Locale locale = Locale.US;
        Object bean = new Object();
        DOMNodePointer parent = new DOMNodePointer(null, locale, null);
        BeanPointer beanpointer = new BeanPointer(parent, name, bean, beanInfo);
        assertEquals(0, beanpointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_xHjO0() {
        QName name = new QName("test");
        BeanPointer beanpointer = new BeanPointer(name, null, null, null);
        when(name.hashCode()).thenReturn(1);
        int result = beanpointer.hashCode();
        assertEquals(1, result);
    }
}