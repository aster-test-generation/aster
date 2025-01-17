/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Document;
import org.jdom.Element;
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
public class Aster_JDOMPointerFactory_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_XYVC0_1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Document document = new Document();
        NodePointer pointer = factory.createNodePointer(name, document, Locale.getDefault());
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_XYVC0_2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Document document = new Document();
        NodePointer pointer = factory.createNodePointer(name, document, Locale.getDefault());
        assertTrue(pointer instanceof JDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_XYVC0_3() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Document document = new Document();
        NodePointer pointer = factory.createNodePointer(name, document, Locale.getDefault());
        assertEquals(document, pointer.getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElement_gwbW1_1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Element element = new Element("root");
        NodePointer pointer = factory.createNodePointer(name, element, Locale.getDefault());
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElement_gwbW1_2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Element element = new Element("root");
        NodePointer pointer = factory.createNodePointer(name, element, Locale.getDefault());
        assertTrue(pointer instanceof JDOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElement_gwbW1_3() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Element element = new Element("root");
        NodePointer pointer = factory.createNodePointer(name, element, Locale.getDefault());
        assertEquals(element, pointer.getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithInvalidBean_ARZw2() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Object bean = new Object();
        NodePointer pointer = factory.createNodePointer(name, bean, Locale.getDefault());
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullParentAndName_LxjY7() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("name");
        NodePointer pointer = factory.createNodePointer(null, name, new Document());
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullParentAndNullName_CsJD9() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        NodePointer pointer = factory.createNodePointer(null, null, new Document());
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithNullPointer_tmoL5_yChy0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        int order = factory.getOrder();
        assertNotNull(order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNullParentAndBean_qRJh8_PADQ0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("name");
        NodePointer pointer = factory.createNodePointer(null, name, (Element) null);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithDocument_XYVC0() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Document document = new Document();
        NodePointer pointer = factory.createNodePointer(name, document, Locale.getDefault());
        assertNotNull(pointer);
        assertTrue(pointer instanceof JDOMNodePointer);
        assertEquals(document, pointer.getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithElement_gwbW1() {
        JDOMPointerFactory factory = new JDOMPointerFactory();
        QName name = new QName("root");
        Element element = new Element("root");
        NodePointer pointer = factory.createNodePointer(name, element, Locale.getDefault());
        assertNotNull(pointer);
        assertTrue(pointer instanceof JDOMNodePointer);
        assertEquals(element, pointer.getNode());
    }
}