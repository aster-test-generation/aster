/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodePointer_Test_Passing {
    private Node node;
    private DOMNodePointer domNodePointer;
    private NodePointer nodePointer1;
    private NodePointer nodePointer2;
    private NamedNodeMap namedNodeMap;
    private NodeTest nodeTest;
    Attr attr;
    private NodeList nodeList;
    private Document document;
    private JXPathContext context;
    private QName qname;
    private AbstractFactory factory;
    DOMNodePointer domnodepointer;
    Element element;
    Locale locale;
    QName qName;
    DOMAttributeIterator domAttributeIterator;
    @Mock
    private NodePointer startWith;
    private QName name;
    private NamespaceResolver namespaceResolver;
    private DOMNodePointer sameNodePointer;
    private DOMNodePointer differentNodePointer;
    Node nodeMock;
    private Node parentNode;
    private String id;
    VariablePointer parent;
    private NodeTest test;
    private NodePointer ptr;
    NodeList nodelist;
    private Attr attrMock;
    private VariablePointer parentMock;
    private String defaultNamespace;
    private NamespaceResolver localNamespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_1() throws Exception {
        node = mock(Node.class);
        nodePointer1 = mock(NodePointer.class);
        nodePointer2 = mock(NodePointer.class);
        namedNodeMap = mock(NamedNodeMap.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(namedNodeMap.getLength()).thenReturn(2);
        when(namedNodeMap.item(-1)).thenReturn(node);
        when(namedNodeMap.item(1)).thenReturn(node2);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getFirstChild()).thenReturn(node);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_2() throws Exception {
        node = mock(Node.class);
        nodePointer1 = mock(NodePointer.class);
        nodePointer2 = mock(NodePointer.class);
        namedNodeMap = mock(NamedNodeMap.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(namedNodeMap.getLength()).thenReturn(2);
        when(namedNodeMap.item(0)).thenReturn(node);
        when(namedNodeMap.item(1)).thenReturn(node2);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getFirstChild()).thenReturn(node);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
    }

    @Test
    @Timeout(value = -1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_3() throws Exception {
        node = mock(Node.class);
        nodePointer1 = mock(NodePointer.class);
        nodePointer2 = mock(NodePointer.class);
        namedNodeMap = mock(NamedNodeMap.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(namedNodeMap.getLength()).thenReturn(2);
        when(namedNodeMap.item(0)).thenReturn(node);
        when(namedNodeMap.item(1)).thenReturn(node2);
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getFirstChild()).thenReturn(node);
        assertEquals(1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        Node node = mock(Node.class);
        Locale locale = mock(Locale.class);
        domNodePointer = new DOMNodePointer(node, locale, "id");
        assertFalse(domNodePointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        // When
        Object result = domNodePointer.getImmediateNode();
        // Then
        assertEquals(node, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_1() throws Exception {
        node = mock(Node.class);
        locale = mock(Locale.class);
        qName = new QName("prefix", "localName");
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NodeIterator iterator = domNodePointer.attributeIterator(qName);
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_2() throws Exception {
        node = mock(Node.class);
        locale = mock(Locale.class);
        qName = new QName("prefix", "localName");
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NodeIterator iterator = domNodePointer.attributeIterator(qName);
        assertTrue(iterator instanceof DOMAttributeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_ReturnsNull_WhenNodeIsNull_YTag4() {
        String result = DOMNodePointer.findEnclosingAttribute(null, "attrName");
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        Node node = mock(Node.class);
        Locale locale = mock(Locale.class);
        domnodepointer = new DOMNodePointer(node, locale, "id");
        int length = domnodepointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        sameNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        differentNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        // Test reflexive property
        // Test symmetric property
        // Test transitive property
        // Test null object
        // Test different object
        // Test different node
        assertTrue(domNodePointer.equals(domNodePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        sameNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        differentNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        // Test reflexive property
        // Test symmetric property
        // Test transitive property
        // Test null object
        // Test different object
        // Test different node
        assertFalse(domNodePointer.equals(sameNodePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        sameNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        differentNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        // Test reflexive property
        // Test symmetric property
        // Test transitive property
        // Test null object
        // Test different object
        // Test different node
        assertFalse(sameNodePointer.equals(domNodePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_7() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        sameNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        differentNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        // Test reflexive property
        // Test symmetric property
        // Test transitive property
        // Test null object
        // Test different object
        // Test different node
        assertFalse(domNodePointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_8() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        sameNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        differentNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        // Test reflexive property
        // Test symmetric property
        // Test transitive property
        // Test null object
        // Test different object
        // Test different node
        assertFalse(domNodePointer.equals(new Object()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_9() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        sameNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        differentNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        // Test reflexive property
        // Test symmetric property
        // Test transitive property
        // Test null object
        // Test different object
        // Test different node
        assertFalse(domNodePointer.equals(differentNodePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove() throws Exception {
        node = mock(Node.class);
        parentNode = mock(Node.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node.getParentNode()).thenReturn(parentNode);
        domNodePointer.remove();
        verify(parentNode).removeChild(node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguage_1() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        locale = mock(Locale.class);
        domNodePointer = new DOMNodePointer(node, locale, "id");
        when(node.getParentNode()).thenReturn(node);
        when(domNodePointer.getLanguage()).thenReturn("en-US");
        boolean result = domNodePointer.isLanguage("en");
        result = domNodePointer.isLanguage("fr");
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguage_2() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        locale = mock(Locale.class);
        domNodePointer = new DOMNodePointer(node, locale, "id");
        when(node.getParentNode()).thenReturn(node);
        when(domNodePointer.getLanguage()).thenReturn("en-US");
        boolean result = domNodePointer.isLanguage("en");
        result = domNodePointer.isLanguage("fr");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_3() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(null, null, null); // or any other valid constructor
        // Test case 1: node.getPrefix() returns a prefix
        when(node.getPrefix()).thenReturn("prefix");
        // Test case 2: node.getPrefix() returns null, but node name contains a prefix
        when(node.getPrefix()).thenReturn(null);
        when(node.getNodeName()).thenReturn("prefix:localName");
        // Test case 3: node.getPrefix() returns null, and node name does not contain a prefix
        when(node.getPrefix()).thenReturn(null);
        when(node.getNodeName()).thenReturn("localName");
        assertNull(DOMNodePointer.getPrefix(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNodeNullTest() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        test = mock(NodeTest.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        boolean result = DOMNodePointer.testNode(node, null);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withElementNode() throws Exception {
        nodeMock = mock(Node.class);
        attrMock = mock(Attr.class);
        parentMock = mock(VariablePointer.class);
        domnodepointer = new DOMNodePointer(parentMock, nodeMock);
        when(nodeMock.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodeMock.getLocalName()).thenReturn("localName");
        when(nodeMock.getNamespaceURI()).thenReturn("namespaceURI");
        when(parentMock.asPath()).thenReturn("parentPath");
        assertEquals("parentPath", domnodepointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withTextNode() throws Exception {
        nodeMock = mock(Node.class);
        attrMock = mock(Attr.class);
        parentMock = mock(VariablePointer.class);
        domnodepointer = new DOMNodePointer(parentMock, nodeMock);
        when(nodeMock.getNodeType()).thenReturn(Node.TEXT_NODE);
        assertEquals("null/text()[1]", domnodepointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_EmptyPrefix() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        element = mock(Element.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        String result = domNodePointer.getNamespaceURI("");
        assertEquals(domNodePointer.getDefaultNamespaceURI(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_XMLPrefix() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        element = mock(Element.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        String result = domNodePointer.getNamespaceURI("xml");
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_XMLNSPrefix() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        element = mock(Element.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        String result = domNodePointer.getNamespaceURI("xmlns");
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        // When
        Object baseValue = domNodePointer.getBaseValue();
        // Then
        assertEquals(node, baseValue);
        verifyNoMoreInteractions(node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual() throws Exception {
        Node node = mock(Node.class);
        Locale locale = mock(Locale.class);
        domNodePointer = new DOMNodePointer(node, locale, "id");
        boolean result = domNodePointer.isActual();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_TextNode_Rlbc0() throws Exception {
        Node node = mock(Node.class);
        NodeList nodeList = mock(NodeList.class);
        Document document = mock(Document.class);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        domNodePointer.setValue("new value");
        verify(node).setNodeValue("new value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_EmptyString_lTZh0() throws Exception {
        Node node = mock(Node.class);
        NodeList nodeList = mock(NodeList.class);
        Document document = mock(Document.class);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        Field field = DOMNodePointer.class.getDeclaredField("node");
        field.setAccessible(true);
        field.set(domNodePointer, node); // set the node field of domNodePointer
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        Node parentNode = mock(Node.class);
        when(node.getParentNode()).thenReturn(parentNode);
        domNodePointer.setValue("");
        verify(parentNode).removeChild(node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NodeValue_eZZe0() throws Exception {
        node = mock(Node.class);
        nodeList = mock(NodeList.class);
        document = mock(Document.class);
        domNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        Field field = domNodePointer.getClass().getDeclaredField("node");
        field.setAccessible(true);
        field.set(domNodePointer, node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getChildNodes()).thenReturn(nodeList);
        when(nodeList.getLength()).thenReturn(0);
        Node valueNode = mock(Node.class);
        domNodePointer.setValue(valueNode);
        verify(node).appendChild(valueNode.cloneNode(true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullValue_qGHi0() throws Exception {
        Node node = mock(Node.class);
        NodeList nodeList = mock(NodeList.class);
        Document document = mock(Document.class);
        when(node.getChildNodes()).thenReturn(nodeList);
        when(nodeList.getLength()).thenReturn(0);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        domNodePointer.setValue(null);
        verify(node, times(0)).appendChild(any(Node.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ElementNode_hnXb0() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getPrefix()).thenReturn("prefix");
        when(node.getLocalName()).thenReturn("localName");
        QName result = domNodePointer.getName();
        assertEquals(new QName("prefix", "localName"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_ReturnsNull_WhenElementDoesNotHaveAttribute_MEuH1_hWXz0() {
        Document document = new org.apache.xerces.dom.DocumentImpl();
        Node node = document.createElement("div");
        String result = DOMNodePointer.findEnclosingAttribute(node, "attrName");
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_ReturnsAttribute_WhenParentElementHasAttribute_WRKn2_YZRj0() {
        Document document = new org.apache.xerces.dom.DocumentImpl();
        Node node = document.createElement("span");
        Node parentNode = document.createElement("div");
        parentNode.appendChild(node);
        ((Element) parentNode).setAttribute("attrName", "attrValue");
        String result = DOMNodePointer.findEnclosingAttribute(node, "attrName");
        assert "attrValue".equals(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_RazZ0_1() throws Exception {
        node = mock(Node.class);
        Locale locale = Locale.US; // or any other locale
        domNodePointer = new DOMNodePointer(node, locale, null);
        when(node.hasChildNodes()).thenReturn(false);
        when(node.hasChildNodes()).thenReturn(true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_RazZ0_2() throws Exception {
        node = mock(Node.class);
        Locale locale = Locale.US; // or any other locale
        domNodePointer = new DOMNodePointer(node, locale, null);
        when(node.hasChildNodes()).thenReturn(false);
        when(node.hasChildNodes()).thenReturn(true);
        assertFalse(domNodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalName_taci0_3() throws Exception {
        Node node = mock(Node.class);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, null, null);
        when(node.getLocalName()).thenReturn("localName");
        when(node.getLocalName()).thenReturn(null);
        when(node.getNodeName()).thenReturn("prefix:localName");
        when(node.getLocalName()).thenReturn(null);
        when(node.getNodeName()).thenReturn("nodeName");
        assertEquals("nodeName", DOMNodePointer.getLocalName(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPointerByID_fUTM0_1() throws Exception {
        node = mock(Node.class);
        document = mock(Document.class);
        element = mock(Element.class);
        context = mock(JXPathContext.class);
        domNodePointer = new DOMNodePointer(node, Locale.getDefault(), id);
        when(node.getOwnerDocument()).thenReturn(document);
        when(document.getElementById(any(String.class))).thenReturn(element);
        Pointer pointer = domNodePointer.getPointerByID(context, id);
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ElementNode_Ybgi2_YnNz0() {
        Document document = new org.apache.xerces.dom.DocumentImpl();
        Node node = document.createElement("root");
        node.appendChild(document.createTextNode("   Hello   "));
        node.appendChild(document.createComment("   World   "));
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.US);
        assertEquals("Hello", domNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode14_nZRc13_juIR0() {
        String s1 = "  test  ";
        String s2 = "test";
        assertTrue(s1 == s2 || (s1 != null && s2 != null && s1.trim().equals(s2.trim())));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode14_nZRc13_rJhW1() {
        String s1 = "  test  ";
        String s2 = "test";
        String trimmedS1 = s1 == null ? "" : s1.trim();
        String trimmedS2 = s2 == null ? "" : s2.trim();
        assertTrue(trimmedS1.equals(trimmedS2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() throws Exception {
        node = mock(Node.class);
        nodePointer1 = mock(NodePointer.class);
        nodePointer2 = mock(NodePointer.class);
        namedNodeMap = mock(NamedNodeMap.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        assertEquals(0, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
        when(nodePointer1.getBaseValue()).thenReturn(node);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        assertEquals(1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(namedNodeMap.getLength()).thenReturn(2);
        when(namedNodeMap.item(0)).thenReturn(node);
        when(namedNodeMap.item(1)).thenReturn(node2);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getFirstChild()).thenReturn(node);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator() throws Exception {
        node = mock(Node.class);
        locale = mock(Locale.class);
        qName = new QName("prefix", "localName");
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NodeIterator iterator = domNodePointer.attributeIterator(qName);
        assertNotNull(iterator);
        assertTrue(iterator instanceof DOMAttributeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLanguage() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        locale = mock(Locale.class);
        domNodePointer = new DOMNodePointer(node, locale, "id");
        when(node.getParentNode()).thenReturn(node);
        when(domNodePointer.getLanguage()).thenReturn("en-US");
        boolean result = domNodePointer.isLanguage("en");
        assertTrue(result);
        result = domNodePointer.isLanguage("fr");
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(null, null, null); // or any other valid constructor
        // Test case 1: node.getPrefix() returns a prefix
        when(node.getPrefix()).thenReturn("prefix");
        assertEquals("prefix", DOMNodePointer.getPrefix(node));
        // Test case 2: node.getPrefix() returns null, but node name contains a prefix
        when(node.getPrefix()).thenReturn(null);
        when(node.getNodeName()).thenReturn("prefix:localName");
        assertEquals("prefix", DOMNodePointer.getPrefix(node));
        // Test case 3: node.getPrefix() returns null, and node name does not contain a prefix
        when(node.getPrefix()).thenReturn(null);
        when(node.getNodeName()).thenReturn("localName");
        assertNull(DOMNodePointer.getPrefix(node));
    }
}