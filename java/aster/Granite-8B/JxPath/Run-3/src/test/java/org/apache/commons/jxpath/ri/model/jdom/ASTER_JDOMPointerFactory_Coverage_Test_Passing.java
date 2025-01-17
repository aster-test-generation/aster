/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.jdom.Document;
import org.jdom.Element;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMPointerFactory_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_jtQt0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Object bean = new Document();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(null, bean, locale);
        assertTrue(pointer instanceof JDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElement_LltB1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Object bean = new Element("test");
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(null, bean, locale);
        assertTrue(pointer instanceof JDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonDocumentOrElement_BoKP2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Object bean = new Object();
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(null, bean, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_hFqv3() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        Object bean = null;
        Locale locale = Locale.getDefault();
        NodePointer pointer = factory.createNodePointer(null, bean, locale);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_ZohW0_NCAX0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        Document bean = new Document();
        NodePointer pointer = factory.createNodePointer(parent, null, bean);
        assertTrue(pointer instanceof JDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonDocumentNonElement_qTsm2_kEpv0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(parent, null, bean);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullBean_seJm3_QWcf0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        NodePointer parent = new DOMNodePointer(null, null, null);
        NodePointer pointer = factory.createNodePointer(parent, null, null);
        assertNull(pointer);
    }
}