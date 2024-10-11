/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_DOMNodePointer_Coverage_Test_Failing {
    private VariablePointer variablePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_bXvg0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        QName name = new QName("name");
        NodeIterator iterator = domNodePointer.attributeIterator(name);
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameForNullNode_ydrR3() {
        DOMNodePointer pointer = new DOMNodePointer(null, Locale.ENGLISH, "id");
        QName name = pointer.getName();
        Assertions.assertNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildWithWholeCollection_aJFU0() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        JXPathContext context = new JXPathContextReferenceImpl(null, null, null);
        QName name = new QName("name");
        int index = NodePointer.WHOLE_COLLECTION;
        NodePointer child = nodePointer.createChild(context, name, index);
        assertNotNull(child);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildWithIndex_ZJZN1() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, null);
        JXPathContext context = new JXPathContextReferenceImpl(null, null, null);
        QName name = new QName("name");
        int index = 1;
        NodePointer child = nodePointer.createChild(context, name, index);
        assertNotNull(child);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalName5_xXEg4() {
        String localName = DOMNodePointer.getLocalName(null);
        Assertions.assertNull(localName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute1_LJKL0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        JXPathContext context = null;
        QName name = null;
        NodePointer result = domNodePointer.createAttribute(context, name);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute2_AtTc1() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        JXPathContext context = null;
        QName name = new QName("name");
        NodePointer result = domNodePointer.createAttribute(context, name);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute3_gRIx2() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        JXPathContext context = null;
        QName name = new QName("name", "prefix");
        NodePointer result = domNodePointer.createAttribute(context, name);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_attrValueIsEmpty_aAcW4_fid1() {
        Element element = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("");
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertEquals("", defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_attrValueIsNotEmpty_Qufr5_fid1() {
        Element element = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://www.example.com");
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertEquals("http://www.example.com", defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_parentNodeIsNotNull_UccN7_fid1() {
        Element element = mock(Element.class);
        Element parentElement = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(parentElement.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://www.example.com");
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertEquals("http://www.example.com", defaultNamespaceURI);
    }
}