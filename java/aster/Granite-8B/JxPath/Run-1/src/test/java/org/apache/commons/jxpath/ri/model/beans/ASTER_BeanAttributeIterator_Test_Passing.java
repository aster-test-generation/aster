/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_BeanAttributeIterator_Test_Passing {
    @Mock
    private BeanPointer beanPointer;
    @Mock
    private QName qName;
    @Mock
    private JXPathBasicBeanInfo jXPathBasicBeanInfo;
    @Mock
    private DOMNodePointer dOMNodePointer;
    private boolean includeXmlLang;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_IncludeXmlLangTrue_Position1_qDnK0_fid1() {
        BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(Object.class, true), Locale.US), new QName("name"));
        NodePointer nodePointer = beanAttributeIterator.getNodePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_gZWh0_udFS0() {
        BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), new JXPathBasicBeanInfo(new Object().getClass()), Locale.US), new QName("name"));
        beanAttributeIterator.setPosition(1);
        assertEquals(1, beanAttributeIterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_bUZY2_pSfu1() {
        BeanAttributeIterator beanAttributeIterator = new BeanAttributeIterator(new BeanPointer(new QName("name"), new Object(), null, Locale.US), new QName("name"));
        beanAttributeIterator.setPosition(0);
        assertEquals(0, beanAttributeIterator.getPosition());
    }
}