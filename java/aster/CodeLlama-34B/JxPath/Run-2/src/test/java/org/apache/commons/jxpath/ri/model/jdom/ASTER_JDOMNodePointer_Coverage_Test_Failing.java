/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JDOMNodePointer_Coverage_Test_Failing {
    private Namespace namespace;
    private JDOMNodePointer jdomNodePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_LXvx0() {
        JDOMNodePointer jdomNodePointer = new JDOMNodePointer(new Object(), new Locale("en"));
        Object baseValue = jdomNodePointer.getBaseValue();
        assertEquals(new Object(), baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalName_Element_haxN0_YwwW0() {
        Element element = new Element("name", "value");
        JDOMNodePointer nodePointer = new JDOMNodePointer(element, Locale.ENGLISH, "id");
        String localName = JDOMNodePointer.getLocalName(nodePointer);
        assertEquals("name", localName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildWithNullValue_HFnj2_uYKv0_1() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        QName name = new QName("name");
        int index = 0;
        NodePointer ptr = nodePointer.createChild(null, name, index, null);
        assertNotNull(ptr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildWithNullValue_HFnj2_uYKv0_2() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        QName name = new QName("name");
        int index = 0;
        NodePointer ptr = nodePointer.createChild(null, name, index, null);
        assertEquals(name, ptr.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildWithNullValue_HFnj2_uYKv0_3() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        QName name = new QName("name");
        int index = 0;
        NodePointer ptr = nodePointer.createChild(null, name, index, null);
        assertEquals(index, ptr.getIndex());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildWithNullValue_HFnj2_uYKv0_4() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        QName name = new QName("name");
        int index = 0;
        NodePointer ptr = nodePointer.createChild(null, name, index, null);
        assertNull(ptr.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildWithNullValue_HFnj2_uYKv0_4_fid2() {
        JDOMNodePointer nodePointer = new JDOMNodePointer(new Object(), Locale.ENGLISH);
        QName name = new QName("name");
        int index = 0;
        NodePointer ptr = nodePointer.createChild(null, name, index, null);
        assertNotNull(ptr.getValue());
    }
}