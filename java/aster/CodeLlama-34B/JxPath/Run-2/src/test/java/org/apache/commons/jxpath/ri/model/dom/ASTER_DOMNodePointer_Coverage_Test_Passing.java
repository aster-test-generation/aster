/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_DOMNodePointer_Coverage_Test_Passing {
    private VariablePointer variablePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_nullNode_mHUs0() {
        Node n = null;
        String attrName = "attr";
        String result = DOMNodePointer.findEnclosingAttribute(n, attrName);
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_defaultNamespaceIsNull_jZZl0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsDocument_MZBb1() {
        Document document = mock(Document.class);
        Element documentElement = mock(Element.class);
        when(document.getDocumentElement()).thenReturn(documentElement);
        DOMNodePointer domNodePointer = new DOMNodePointer(document, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_SkvV2() {
        Element element = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_attrIsNull_EMjq3() {
        Element element = mock(Element.class);
        when(element.getAttributeNode("xmlns")).thenReturn(null);
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_attrValueIsEmpty_aAcW4() {
        Element element = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("");
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_attrValueIsNotEmpty_Qufr5() {
        Element element = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://www.example.com");
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_parentNodeIsNull_koIp6() {
        Element element = mock(Element.class);
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_parentNodeIsNotNull_UccN7() {
        Element element = mock(Element.class);
        Element parentElement = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(parentElement.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://www.example.com");
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolverWithNullNode_ArRm5() {
        DOMNodePointer pointer = new DOMNodePointer(null, new Locale("en"));
        NamespaceResolver resolver = pointer.getNamespaceResolver();
        assertNotNull(resolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithId_tgJV0() {
        DOMNodePointer nodePointer = new DOMNodePointer(null, null, "id");
        String path = nodePointer.asPath();
        Assertions.assertEquals("id('id')", path);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_nodeIsElement_SkvV2_fid1() {
        Element element = mock(Element.class);
        Attr attr = mock(Attr.class);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        DOMNodePointer domNodePointer = new DOMNodePointer(element, null, null);
        String defaultNamespaceURI = domNodePointer.getDefaultNamespaceURI();
        assertEquals("", defaultNamespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_xMRR1() throws Exception {
    }
}