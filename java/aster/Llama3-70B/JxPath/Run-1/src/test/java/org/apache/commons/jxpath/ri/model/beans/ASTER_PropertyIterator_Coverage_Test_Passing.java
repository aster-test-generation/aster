/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

public class Aster_PropertyIterator_Coverage_Test_Passing {
    private String name;
    private int position = 0;
    PropertyIterator propertyiterator;
    BeanPointer pointer;
    DOMNodePointer startWith;

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_bNbC0_uMRh0() throws Exception {
        QName qName = new QName("qualifiedName");
        Object bean = new Object();
        JXPathBasicBeanInfo beanInfo = new JXPathBasicBeanInfo(Object.class);
        Locale locale = Locale.US;
        pointer = new BeanPointer(qName, bean, beanInfo, locale);
        org.w3c.dom.Node node = org.mockito.Mockito.mock(org.w3c.dom.Node.class);
        startWith = new DOMNodePointer(node, locale);
        propertyiterator = new PropertyIterator(pointer, "name", false, startWith);
    }
}