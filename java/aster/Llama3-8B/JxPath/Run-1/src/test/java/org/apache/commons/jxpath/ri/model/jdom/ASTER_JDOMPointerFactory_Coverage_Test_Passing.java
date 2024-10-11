/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.jdom.Document;
import org.jdom.Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerDocument_hDbA0_1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("test");
        Document document = new Document();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, document, locale);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerDocument_hDbA0_2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("test");
        Document document = new Document();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, document, locale);
        assertEquals(JDOMNodePointer.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerNullBean_RhCb2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("test");
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, null, locale);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerUnknownBean_ZJrl3() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("test");
        Object bean = new Object();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, bean, locale);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_Element_DJTh0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        NodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        QName name = new QName("prefix", "localName");
        Element bean = new Element("element");
        NodePointer result = factory.createNodePointer(parent, name, bean);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_Element_Fail_omtk1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        NodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        QName name = new QName("prefix", "localName");
        Object bean = new Object(); // not an Element
        NodePointer result = factory.createNodePointer(parent, name, bean);
        Assertions.assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerDocument_hDbA0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("test");
        Document document = new Document();
        Locale locale = Locale.US;
        NodePointer result = factory.createNodePointer(name, document, locale);
        assertNotNull(result);
        assertEquals(JDOMNodePointer.class, result.getClass());
    }
}