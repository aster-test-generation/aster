/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodePointer_Test_Failing {
    Node node;
    DOMNodePointer domnodepointer;
    NodePointer nodepointer;
    NamedNodeMap namednodemap;
    Attr attr;
    NodeList nodelist;
    Document document;
    VariablePointer variablePointer;
    KeywordVariables keywordVariables;
    Locale locale;
    QName qName;
    Element element;
    NodeIterator nodeiterator;
    QName qname;
    String id;
    VariablePointer parent;
    KeywordVariables variables;
    QName name;
    NodeIterator nodeIterator;
    private DOMNodePointer other;
    private Object object;
    private String defaultNamespace;
    String prefix;
    private NamespaceResolver localNamespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, null, null);
        when(node.hashCode()).thenReturn(123);
        assertEquals(123, domnodepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Document_bNbC0() {
        Document document = mock(Document.class);
        when(document.getDocumentElement()).thenReturn(mock(Element.class));
        String namespaceURI = DOMNodePointer.getNamespaceURI(document);
        assertEquals("", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_Ccea2() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null);
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals("", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_xmlns_prefix_HUvN3() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(node.getAttributes().getNamedItem("xmlns")).thenReturn(mock(Attr.class));
        when(node.getAttributes().getNamedItem("xmlns").getNodeValue()).thenReturn("namespaceURI");
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_xmlns_prefix_and_namespaceURI_ajPf4() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(node.getAttributes().getNamedItem("xmlns:prefix")).thenReturn(mock(Attr.class));
        when(node.getAttributes().getNamedItem("xmlns:prefix").getNodeValue()).thenReturn("namespaceURI");
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_namespaceURI_ZyEz5() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(node.getAttributes().getNamedItem("xmlns")).thenReturn(null);
        when(node.getAttributes().getNamedItem("xmlns:prefix")).thenReturn(null);
        when(node.getNamespaceURI()).thenReturn("namespaceURI");
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_empty_namespaceURI_lKUR6() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(node.getAttributes().getNamedItem("xmlns")).thenReturn(null);
        when(node.getAttributes().getNamedItem("xmlns:prefix")).thenReturn(null);
        when(node.getNamespaceURI()).thenReturn("");
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals("", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPointerByID() throws Exception {
        id = "id";
        node = mock(Node.class);
        document = mock(Document.class);
        element = mock(Element.class);
        domnodepointer = new DOMNodePointer(node, Locale.getDefault(), id);
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        when(node.getOwnerDocument()).thenReturn(document);
        when(document.getElementById(id)).thenReturn(element);
        Pointer pointer = domnodepointer.getPointerByID(JXPathContext.newContext(domnodepointer), id);
        assertEquals(element, ((DOMNodePointer) pointer).getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        domnodepointer = new DOMNodePointer(node, null, null);
        when(node.getParentNode()).thenReturn(node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeName()).thenReturn("test");
        when(element.getAttribute("lang")).thenReturn("en");
        when(node.getParentNode()).thenReturn(element);
        assertTrue(domnodepointer.isLanguage("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnamespacePointer() throws Exception {
        domnodepointer = new DOMNodePointer(Mockito.mock(Node.class), Mockito.mock(Locale.class), "id");
        nodepointer = Mockito.mock(NodePointer.class);
        prefix = "prefix";
        when(domnodepointer.namespacePointer(prefix)).thenReturn(nodepointer);
        assertEquals(nodepointer, domnodepointer.namespacePointer(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI_qOuR0() throws Exception {
        element = mock(Element.class);
        node = mock(Node.class);
        attr = mock(Attr.class);
        DOMNodePointer domnodepointer = new DOMNodePointer(node, new Locale("en"), "id");
        when(node.getParentNode()).thenReturn(element);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(element.getNamespaceURI()).thenReturn("uri");
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("uri");
        String uri = DOMNodePointer.getNamespaceURI(node);
        assertEquals("uri", uri);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Document_bNbC0_RjwI0() {
        Document document = mock(Document.class);
        Element element = mock(Element.class);
        when(document.getDocumentElement()).thenReturn(element);
        String namespaceURI = DOMNodePointer.getNamespaceURI(document);
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_Ccea2_qJgk0() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null);
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_xmlns_prefix_HUvN3_SmWQ0() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        Attr xmlns = mock(Attr.class);
        when(xmlns.getName()).thenReturn("xmlns");
        when(xmlns.getNodeValue()).thenReturn("namespaceURI");
        when(node.getAttributes().getNamedItem("xmlns")).thenReturn(xmlns);
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_namespaceURI_ZyEz5_VRVy0() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(node.getAttributes().getNamedItem("xmlns:prefix")).thenReturn(null);
        when(node.getNamespaceURI()).thenReturn("namespaceURI");
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_empty_namespaceURI_lKUR6_euTv0() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(node.getAttributes().getNamedItem("xmlns")).thenReturn(null);
        when(node.getNamespaceURI()).thenReturn("");
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLanguage_IONy0() throws Exception {
        Node node = mock(Node.class);
        Element element = mock(Element.class);
        Locale locale = mock(Locale.class);
        DOMNodePointer domnodepointer = new DOMNodePointer(node, locale, null);
        when(node.getParentNode()).thenReturn(element);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeName()).thenReturn("test");
        when(element.getAttribute("lang")).thenReturn("en");
        assertTrue(domnodepointer.isLanguage("en"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceResolver_HitX0() throws Exception {
        localNamespaceResolver = mock(NamespaceResolver.class);
        domnodepointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        domnodepointer.getNamespaceResolver();
        verify(localNamespaceResolver, times(1)).setNamespaceContextPointer(domnodepointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection_fid2() throws Exception {
        qName = new QName("qualifiedName");
        variablePointer = new VariablePointer(qName);
        keywordVariables = new KeywordVariables("keyword", new Object());
        node = mock(Node.class);
        locale = Locale.getDefault();
        domnodepointer = new DOMNodePointer(node, locale, "id");
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        assertTrue(domnodepointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Document_bNbC0_fid2() {
        Document document = mock(Document.class);
        when(document.getDocumentElement()).thenReturn(mock(Element.class));
        String namespaceURI = DOMNodePointer.getNamespaceURI(document);
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getNamespaceURI_Node_with_empty_namespaceURI_lKUR6_fid2() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(mock(Node.class));
        when(node.hasAttributes()).thenReturn(true);
        when(node.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(node.getAttributes().getNamedItem("xmlns")).thenReturn(null);
        when(node.getAttributes().getNamedItem("xmlns:prefix")).thenReturn(null);
        when(node.getNamespaceURI()).thenReturn("");
        String namespaceURI = DOMNodePointer.getNamespaceURI(node);
        assertEquals(null, namespaceURI);
    }
}