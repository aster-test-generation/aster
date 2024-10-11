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
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
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
public class Aster_DOMNodePointer_Test_Failing {
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
    public void testfindEnclosingAttribute() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        domnodepointer = new DOMNodePointer(node, Locale.ENGLISH, "id");
        when(node.getParentNode()).thenReturn(node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(((Element) node).getAttribute("attrName")).thenReturn("attrValue");
        String result = DOMNodePointer.findEnclosingAttribute(node, "attrName");
        assertEquals("attrValue", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfindEnclosingAttribute_NotFound() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        domnodepointer = new DOMNodePointer(node, Locale.ENGLISH, "id");
        when(node.getParentNode()).thenReturn(null);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(((Element) node).getAttribute("attrName")).thenReturn(null);
        String result = DOMNodePointer.findEnclosingAttribute(node, "attrName");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testfindEnclosingAttribute_ParentNode() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        domnodepointer = new DOMNodePointer(node, Locale.ENGLISH, "id");
        Node parentNode = mock(Node.class);
        when(node.getParentNode()).thenReturn(parentNode);
        when(parentNode.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(((Element) parentNode).getAttribute("attrName")).thenReturn("attrValue");
        String result = DOMNodePointer.findEnclosingAttribute(node, "attrName");
        assertEquals("attrValue", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domNodePointer = new DOMNodePointer(mock(VariablePointer.class), node);
        when(node.getNamespaceURI()).thenReturn("http://example.com");
        String namespaceURI = domNodePointer.getNamespaceURI();
        assertEquals("http://example.com", namespaceURI);
        verify(node, times(1)).getNamespaceURI();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnamespaceIterator_1() throws Exception {
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NodeIterator iterator = domNodePointer.namespaceIterator();
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnamespaceIterator_2() throws Exception {
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NodeIterator iterator = domNodePointer.namespaceIterator();
        assertTrue(iterator instanceof DOMNamespaceIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute_1() throws Exception {
        element = mock(Element.class);
        node = element;
        domNodePointer = new DOMNodePointer(node, Locale.getDefault(), "id");
        context = mock(JXPathContext.class);
        name = new QName("prefix", "localName");
        namespaceResolver = mock(NamespaceResolver.class);
        when(domNodePointer.getNamespaceResolver()).thenReturn(namespaceResolver);
        // Test with prefix
        when(namespaceResolver.getNamespaceURI("prefix")).thenReturn("namespaceURI");
        NodePointer result = domNodePointer.createAttribute(context, name);
        verify(element).setAttributeNS("namespaceURI", "prefix:localName", "");
        // Test without prefix
        name = new QName("localName");
        when(element.hasAttribute("localName")).thenReturn(false);
        result = domNodePointer.createAttribute(context, name);
        verify(element).setAttribute("localName", "");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_DocumentNode() throws Exception {
        element = mock(Element.class);
        nodeMock = mock(Node.class);
        attr = mock(Attr.class);
        domNodePointer = new DOMNodePointer(nodeMock, Locale.US, "id");
        Document document = mock(Document.class);
        when(nodeMock instanceof Document).thenReturn(true);
        when(((Document) nodeMock).getDocumentElement()).thenReturn(element);
        when(element.getNamespaceURI()).thenReturn("namespace-uri");
        assertEquals("namespace-uri", DOMNodePointer.getNamespaceURI(nodeMock));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ElementNode() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        nodeList = mock(NodeList.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(element.getTextContent()).thenReturn("some text");
        when(node.getFirstChild()).thenReturn(element);
        assertEquals("some text", domNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_NullTextNode() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        nodeList = mock(NodeList.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        when(node.getTextContent()).thenReturn(null);
        assertEquals("", domNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_EmptyTextNode() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        nodeList = mock(NodeList.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        when(node.getTextContent()).thenReturn("   ");
        assertEquals("", domNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_ElementNode() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(((Element) node).getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://default-namespace");
        String defaultNamespace = domNodePointer.getDefaultNamespaceURI();
        assertEquals("http://default-namespace", defaultNamespace);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_NoDefaultNamespace() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(((Element) node).getAttributeNode("xmlns")).thenReturn(null);
        String defaultNamespace = domNodePointer.getDefaultNamespaceURI();
        assertNull(defaultNamespace);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNodeNodeTypeTest() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        test = mock(NodeTest.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        when(test instanceof NodeTypeTest).thenReturn(true);
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        when((NodeTypeTest) test).thenReturn(nodeTypeTest);
        when(nodeTypeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_TEXT);
        boolean result = DOMNodePointer.testNode(node, test);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNodeProcessingInstructionTest() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        test = mock(NodeTest.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(test instanceof ProcessingInstructionTest).thenReturn(true);
        ProcessingInstructionTest processingInstructionTest = mock(ProcessingInstructionTest.class);
        when((ProcessingInstructionTest) test).thenReturn(processingInstructionTest);
        when(processingInstructionTest.getTarget()).thenReturn("target");
        when(((ProcessingInstruction) node).getTarget()).thenReturn("target");
        boolean result = DOMNodePointer.testNode(node, test);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild_1() throws Exception {
        node = mock(Node.class);
        nodelist = mock(NodeList.class);
        document = mock(Document.class);
        attr = mock(Attr.class);
        context = mock(JXPathContext.class);
        name = new QName("prefix", "localName");
        domnodepointer = new DOMNodePointer(node, Locale.getDefault(), "id");
        when(node.getPreviousSibling()).thenReturn(node);
        when(node.cloneNode(any())).thenReturn(node);
        when(node.appendChild(any(Node.class))).thenReturn(node);
        when(node.removeChild(any(Node.class))).thenReturn(node);
        when(node.getParentNode()).thenReturn(node);
        when(node.getChildNodes()).thenReturn(nodelist);
        when(nodelist.item(any())).thenReturn(node);
        when(node.getOwnerDocument()).thenReturn(document);
        ptr = domnodepointer.createChild(context, name, 0, "value");
        assertNotNull(ptr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild_2() throws Exception {
        node = mock(Node.class);
        nodelist = mock(NodeList.class);
        document = mock(Document.class);
        attr = mock(Attr.class);
        context = mock(JXPathContext.class);
        name = new QName("prefix", "localName");
        domnodepointer = new DOMNodePointer(node, Locale.getDefault(), "id");
        when(node.getPreviousSibling()).thenReturn(node);
        when(node.cloneNode(any())).thenReturn(node);
        when(node.appendChild(any(Node.class))).thenReturn(node);
        when(node.removeChild(any(Node.class))).thenReturn(node);
        when(node.getParentNode()).thenReturn(node);
        when(node.getChildNodes()).thenReturn(nodelist);
        when(nodelist.item(any())).thenReturn(node);
        when(node.getOwnerDocument()).thenReturn(document);
        ptr = domnodepointer.createChild(context, name, 0, "value");
        assertEquals(name, ptr.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild_3() throws Exception {
        node = mock(Node.class);
        nodelist = mock(NodeList.class);
        document = mock(Document.class);
        attr = mock(Attr.class);
        context = mock(JXPathContext.class);
        name = new QName("prefix", "localName");
        domnodepointer = new DOMNodePointer(node, Locale.getDefault(), "id");
        when(node.getPreviousSibling()).thenReturn(node);
        when(node.cloneNode(any())).thenReturn(node);
        when(node.appendChild(any(Node.class))).thenReturn(node);
        when(node.removeChild(any(Node.class))).thenReturn(node);
        when(node.getParentNode()).thenReturn(node);
        when(node.getChildNodes()).thenReturn(nodelist);
        when(nodelist.item(any())).thenReturn(node);
        when(node.getOwnerDocument()).thenReturn(document);
        ptr = domnodepointer.createChild(context, name, 0, "value");
        assertEquals("value", ptr.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withProcessingInstructionNode() throws Exception {
        nodeMock = mock(Node.class);
        attrMock = mock(Attr.class);
        parentMock = mock(VariablePointer.class);
        domnodepointer = new DOMNodePointer(parentMock, nodeMock);
        when(nodeMock.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(((ProcessingInstruction) nodeMock).getTarget()).thenReturn("target");
        assertEquals("/processing-instruction('target')[1]", domnodepointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_CustomPrefix() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        element = mock(Element.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getAttributeNode("xmlns:custom")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://custom/namespace");
        String result = domNodePointer.getNamespaceURI("custom");
        assertEquals("http://custom/namespace", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_UnknownPrefix() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        element = mock(Element.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node instanceof Element).thenReturn(true);
        when(((Element) node).getAttributeNode("xmlns:unknown")).thenReturn(null);
        String result = domNodePointer.getNamespaceURI("unknown");
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ProcessingInstructionNode_FcPo0_1() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(node.getNodeName()).thenReturn("target");
        QName result = domNodePointer.getName();
        assertEquals(new QName("target"), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_1_fid1() throws Exception {
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
        assertEquals(0, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2_fid1() throws Exception {
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
        assertTrue(domNodePointer.equals(sameNodePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3_fid1() throws Exception {
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
        assertTrue(sameNodePointer.equals(domNodePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_1() throws Exception {
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
        assertEquals("prefix", DOMNodePointer.getPrefix(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withElementNode_fid1() throws Exception {
        nodeMock = mock(Node.class);
        attrMock = mock(Attr.class);
        parentMock = mock(VariablePointer.class);
        domnodepointer = new DOMNodePointer(parentMock, nodeMock);
        when(nodeMock.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodeMock.getLocalName()).thenReturn("localName");
        when(nodeMock.getNamespaceURI()).thenReturn("namespaceURI");
        when(parentMock.asPath()).thenReturn("parentPath");
        assertEquals("parentPath/localName[1]", domnodepointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withTextNode_fid1() throws Exception {
        nodeMock = mock(Node.class);
        attrMock = mock(Attr.class);
        parentMock = mock(VariablePointer.class);
        domnodepointer = new DOMNodePointer(parentMock, nodeMock);
        when(nodeMock.getNodeType()).thenReturn(Node.TEXT_NODE);
        assertEquals("/text()[1]", domnodepointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_EmptyString_lTZh0_fid1() throws Exception {
        Node node = mock(Node.class);
        NodeList nodeList = mock(NodeList.class);
        Document document = mock(Document.class);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        Field field = DOMNodePointer.class.getDeclaredField("node");
        field.setAccessible(true);
        field.set(domNodePointer, node); // set the node field of domNodePointer
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        domNodePointer.setValue("");
        verify(node.getParentNode()).removeChild(node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NodeValue_eZZe0_fid1() throws Exception {
        node = mock(Node.class);
        nodeList = mock(NodeList.class);
        document = mock(Document.class);
        domNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        Field field = domNodePointer.getClass().getDeclaredField("node");
        field.setAccessible(true);
        field.set(domNodePointer, node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        Node valueNode = mock(Node.class);
        domNodePointer.setValue(valueNode);
        verify(node).appendChild(valueNode.cloneNode(true));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullValue_qGHi0_fid1() throws Exception {
        Node node = mock(Node.class);
        NodeList nodeList = mock(NodeList.class);
        Document document = mock(Document.class);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        domNodePointer.setValue(null);
        verify(node, times(0)).appendChild(any(Node.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ElementNode_hnXb0_fid1() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(DOMNodePointer.getPrefix(node)).thenReturn("prefix");
        when(DOMNodePointer.getLocalName(node)).thenReturn("localName");
        QName result = domNodePointer.getName();
        assertEquals("prefix", result.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ProcessingInstructionNode_FcPo0_1_fid1() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        ProcessingInstruction pi = mock(ProcessingInstruction.class);
        when(((ProcessingInstruction) node).getTarget()).thenReturn("target");
        QName result = domNodePointer.getName();
        assertEquals("target", result.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ProcessingInstructionNode_FcPo0_2() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        ProcessingInstruction pi = mock(ProcessingInstruction.class);
        when(((ProcessingInstruction) node).getTarget()).thenReturn("target");
        QName result = domNodePointer.getName();
        assertNull(result.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_p_DJvW0() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        test = mock(NodeTest.class);
        domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(test instanceof NodeNameTest).thenReturn(true);
        NodeNameTest nodeNameTest = mock(NodeNameTest.class);
        when((NodeNameTest) test).thenReturn(nodeNameTest);
        QName testName = new QName("prefix", "localName");
        when(nodeNameTest.getNodeName()).thenReturn(testName);
        when(nodeNameTest.getNamespaceURI()).thenReturn("namespaceURI");
        when(nodeNameTest.isWildcard()).thenReturn(false);
        when(DOMNodePointer.getLocalName(node)).thenReturn("localName");
        when(DOMNodePointer.getNamespaceURI(node)).thenReturn("namespaceURI");
        when(node.getPrefix()).thenReturn("prefix");
        boolean result = DOMNodePointer.testNode(node, test);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_RazZ0_1_fid1() throws Exception {
        node = mock(Node.class);
        Locale locale = Locale.US; // or any other locale
        domNodePointer = new DOMNodePointer(node, locale, null);
        when(node.hasChildNodes()).thenReturn(false);
        when(node.hasChildNodes()).thenReturn(true);
        assertTrue(domNodePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ElementNode_hRYt0() throws Exception {
        element = mock(Element.class);
        nodeMock = mock(Node.class);
        attr = mock(Attr.class);
        domNodePointer = new DOMNodePointer(nodeMock, Locale.US, "id");
        when(nodeMock.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodeMock instanceof Element).thenReturn(true);
        when(((Element) nodeMock).getNamespaceURI()).thenReturn("namespace-uri");
        assertEquals("namespace-uri", DOMNodePointer.getNamespaceURI(nodeMock));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_AttributeNode_zCWg0() throws Exception {
        element = mock(Element.class);
        nodeMock = mock(Node.class);
        attr = mock(Attr.class);
        domNodePointer = new DOMNodePointer(nodeMock, Locale.US, "id");
        when(nodeMock.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(((Element) nodeMock).getNamespaceURI()).thenReturn(null);
        when(((Element) nodeMock).getPrefix()).thenReturn("prefix");
        when(((Element) nodeMock).getAttributeNode("xmlns:prefix")).thenReturn(attr);
        when(attr.getValue()).thenReturn("namespace-uri");
        assertEquals("namespace-uri", DOMNodePointer.getNamespaceURI(nodeMock));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalName_taci0_1() throws Exception {
        Node node = mock(Node.class);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, null, null);
        when(node.getLocalName()).thenReturn("localName");
        when(node.getLocalName()).thenReturn(null);
        when(node.getNodeName()).thenReturn("prefix:localName");
        when(node.getLocalName()).thenReturn(null);
        when(node.getNodeName()).thenReturn("nodeName");
        assertEquals("localName", DOMNodePointer.getLocalName(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPointerByID_fUTM0_2() throws Exception {
        node = mock(Node.class);
        document = mock(Document.class);
        element = mock(Element.class);
        context = mock(JXPathContext.class);
        domNodePointer = new DOMNodePointer(node, Locale.getDefault(), id);
        when(node.getOwnerDocument()).thenReturn(document);
        when(document.getElementById(any(String.class))).thenReturn(element);
        Pointer pointer = domNodePointer.getPointerByID(context, id);
        assertTrue(pointer instanceof DOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_CommentNode_HGki1_IkTc0() {
        Document document = new org.apache.xerces.dom.DocumentImpl();
        Node node = document.createComment("   Hello World   ");
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.US);
        assertEquals("", domNodePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguage_UZmi0() throws Exception {
        node = mock(Node.class);
        parentNode = mock(Node.class);
        attr = mock(Attr.class);
        domNodePointer = new DOMNodePointer(node, Locale.US);
        when(node.getParentNode()).thenReturn(parentNode);
        when(parentNode.getAttributes()).thenReturn(mock(NamedNodeMap.class));
        when(parentNode.getAttributes().getNamedItem("xml:lang")).thenReturn(attr);
        when(attr.getValue()).thenReturn("en-US");
        String language = domNodePointer.getLanguage();
        assertEquals("en-US", language);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_NullPrefix_NPnD0() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        element = mock(Element.class);
        domNodePointer = new DOMNodePointer(new VariablePointer(new QName("prefix", "localName")), node);
        String result = domNodePointer.getNamespaceURI(node);
        assertEquals(domNodePointer.getDefaultNamespaceURI(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_hXTV0_1() throws Exception {
        Node node = mock(Node.class);
        Locale locale = mock(Locale.class);
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NamespaceResolver namespaceResolver = mock(NamespaceResolver.class);
        doNothing().when(namespaceResolver).setNamespaceContextPointer(domNodePointer);
        domNodePointer.setNamespaceResolver(namespaceResolver);
        NamespaceResolver result = domNodePointer.getNamespaceResolver();
        verify(namespaceResolver).setNamespaceContextPointer(domNodePointer);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_hXTV0_2() throws Exception {
        Node node = mock(Node.class);
        Locale locale = mock(Locale.class);
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NamespaceResolver namespaceResolver = mock(NamespaceResolver.class);
        doNothing().when(namespaceResolver).setNamespaceContextPointer(domNodePointer);
        domNodePointer.setNamespaceResolver(namespaceResolver);
        NamespaceResolver result = domNodePointer.getNamespaceResolver();
        verify(namespaceResolver).setNamespaceContextPointer(domNodePointer);
        assertEquals(namespaceResolver, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnamespaceIterator() throws Exception {
        domNodePointer = new DOMNodePointer(node, locale, "id");
        NodeIterator iterator = domNodePointer.namespaceIterator();
        assertNotNull(iterator);
        assertTrue(iterator instanceof DOMNamespaceIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute() throws Exception {
        element = mock(Element.class);
        node = element;
        domNodePointer = new DOMNodePointer(node, Locale.getDefault(), "id");
        context = mock(JXPathContext.class);
        name = new QName("prefix", "localName");
        namespaceResolver = mock(NamespaceResolver.class);
        when(domNodePointer.getNamespaceResolver()).thenReturn(namespaceResolver);
        // Test with prefix
        when(namespaceResolver.getNamespaceURI("prefix")).thenReturn("namespaceURI");
        NodePointer result = domNodePointer.createAttribute(context, name);
        verify(element).setAttributeNS("namespaceURI", "prefix:localName", "");
        assertNotNull(result);
        // Test without prefix
        name = new QName("localName");
        when(element.hasAttribute("localName")).thenReturn(false);
        result = domNodePointer.createAttribute(context, name);
        verify(element).setAttribute("localName", "");
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() throws Exception {
        node = mock(Node.class);
        domNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        sameNodePointer = new DOMNodePointer(node, mock(Locale.class), "id");
        differentNodePointer = new DOMNodePointer(mock(Node.class), mock(Locale.class), "id");
        // Test reflexive property
        assertTrue(domNodePointer.equals(domNodePointer));
        // Test symmetric property
        assertTrue(domNodePointer.equals(sameNodePointer));
        assertTrue(sameNodePointer.equals(domNodePointer));
        // Test transitive property
        assertTrue(domNodePointer.equals(sameNodePointer));
        assertTrue(sameNodePointer.equals(domNodePointer));
        assertTrue(domNodePointer.equals(domNodePointer));
        // Test null object
        assertFalse(domNodePointer.equals(null));
        // Test different object
        assertFalse(domNodePointer.equals(new Object()));
        // Test different node
        assertFalse(domNodePointer.equals(differentNodePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild() throws Exception {
        node = mock(Node.class);
        nodelist = mock(NodeList.class);
        document = mock(Document.class);
        attr = mock(Attr.class);
        context = mock(JXPathContext.class);
        name = new QName("prefix", "localName");
        domnodepointer = new DOMNodePointer(node, Locale.getDefault(), "id");
        when(node.getPreviousSibling()).thenReturn(node);
        when(node.cloneNode(any())).thenReturn(node);
        when(node.appendChild(any(Node.class))).thenReturn(node);
        when(node.removeChild(any(Node.class))).thenReturn(node);
        when(node.getParentNode()).thenReturn(node);
        when(node.getChildNodes()).thenReturn(nodelist);
        when(nodelist.item(any())).thenReturn(node);
        when(node.getOwnerDocument()).thenReturn(document);
        ptr = domnodepointer.createChild(context, name, 0, "value");
        assertNotNull(ptr);
        assertEquals(name, ptr.getName());
        assertEquals("value", ptr.getValue());
    }
}