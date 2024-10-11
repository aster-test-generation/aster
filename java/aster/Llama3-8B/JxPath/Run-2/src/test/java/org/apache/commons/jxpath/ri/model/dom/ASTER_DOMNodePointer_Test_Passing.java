/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.AbstractFactory;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodePointer_Test_Passing {
private Node node;
private DOMNodePointer domnodepointer;
private NodePointer nodepointer;
private NamedNodeMap namednodemap;
private NodeTest nodeTest;
private Attr attr;
private NodeList nodelist;
private Document document;
private JXPathContext jxpathcontext;
private QName qname;
private AbstractFactory abstractFactory;
private Locale locale;
@Mock
    private Element element;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private DOMAttributeIterator iterator;
@Mock
    private VariablePointer variablePointer;
@Mock
    private QName qName;
@Mock
    private VariablePointer parent;
private DOMNodePointer anotherDomnodepointer;
private Node parentNode;
private String id;
private Object value;
@Mock
    private NamespaceResolver superNamespaceResolver;
@Mock
    private NamespaceResolver localNamespaceResolver;
@Mock
    private Pointer namespaceContextPointer;
    private String defaultNamespace;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers_1() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnodepointer = new DOMNodePointer(node, Locale.US);
        namednodemap = mock(NamedNodeMap.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodepointer.getBaseValue()).thenReturn(node);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(node);
        int result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getNextSibling()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(node);
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(mock(Node.class));
        when(node.getNextSibling()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        assertEquals(0, result);}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers_3() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnodepointer = new DOMNodePointer(node, Locale.US);
        namednodemap = mock(NamedNodeMap.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodepointer.getBaseValue()).thenReturn(node);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(node);
        int result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getNextSibling()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(node);
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        when(nodepointer.getBaseValue()).thenReturn(mock(Node.class));
        when(node.getFirstChild()).thenReturn(mock(Node.class));
        when(node.getNextSibling()).thenReturn(mock(Node.class));
        result = domnodepointer.compareChildNodePointers(nodepointer, nodepointer);
        assertEquals(1, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ElementNode() throws Exception {
        node = mock(Node.class);
        nodelist = mock(NodeList.class);
        document = mock(Document.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        Node childNode = mock(Node.class);
        when(node.getChildNodes()).thenReturn(nodelist);
        when(nodelist.getLength()).thenReturn(1);
        when(nodelist.item(0)).thenReturn(childNode);
        domnodepointer.setValue(childNode);
        verify(node).appendChild(childNode.cloneNode(true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() {
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Arrange
        // Act
        Object immediateNode = domnodepointer.getImmediateNode();
        // Assert
        assertEquals(node, immediateNode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Act
        int hashCode = domnodepointer.hashCode();
        // Assert
        verify(node).hashCode();
        assertEquals(node.hashCode(), hashCode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetName_ElementNode() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getPrefix()).thenReturn("prefix");
        when(node.getLocalName()).thenReturn("localName");
        QName expected = new QName("prefix", "localName");
        QName actual = domnodepointer.getName();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameObject() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        anotherDomnodepointer = new DOMNodePointer(node, Locale.US, "id");
        assertEquals(domnodepointer, domnodepointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsNull() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        anotherDomnodepointer = new DOMNodePointer(node, Locale.US, "id");
        assertNotEquals(domnodepointer, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentClass() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        anotherDomnodepointer = new DOMNodePointer(node, Locale.US, "id");
        assertNotEquals(domnodepointer, new Object());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameNode() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        anotherDomnodepointer = new DOMNodePointer(node, Locale.US, "id");
        anotherDomnodepointer = new DOMNodePointer(node, Locale.US, "id");
        assertEquals(domnodepointer, anotherDomnodepointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_1() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Test with local name
        when(node.getLocalName()).thenReturn("qualifiedName");
        // Test with qualified name
        when(node.getNodeName()).thenReturn("prefix:qualifiedName");
        // Test with null local name
        when(node.getLocalName()).thenReturn(null);
        when(node.getNodeName()).thenReturn("qualifiedName");
        assertEquals("qualifiedName", DOMNodePointer.getLocalName(node));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName_3() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Test with local name
        when(node.getLocalName()).thenReturn("localName");
        // Test with qualified name
        when(node.getNodeName()).thenReturn("prefix:localName");
        // Test with null local name
        when(node.getLocalName()).thenReturn(null);
        when(node.getNodeName()).thenReturn("qualifiedName");
        assertEquals("qualifiedName", DOMNodePointer.getLocalName(node));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_TextNode() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        nodelist = mock(NodeList.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        when(node.getTextContent()).thenReturn("");
        assertEquals("", domnodepointer.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultNamespaceURI_ElementNode_noParent_afly6() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.US, "id");
    String result = domNodePointer.getDefaultNamespaceURI();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultNamespaceURI_ElementNode_noNamespace_noParent_teaa7() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.US, "id");
    String result = domNodePointer.getDefaultNamespaceURI();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_4() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Test case 1: Node has a prefix
        when(node.getPrefix()).thenReturn("prefix");
        // Test case 2: Node does not have a prefix
        when(node.getPrefix()).thenReturn(null);
        // Test case 3: Node has a colon in its name
        when(node.getNodeName()).thenReturn("namespace:localName");
        // Test case 4: Node does not have a colon in its name
        when(node.getNodeName()).thenReturn("localName");
        assertEquals(null, DOMNodePointer.getPrefix(node));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeNullTest_SYqp0() {
    boolean result =DOMNodePointer.testNode(null, null);
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_EmptyPrefix() {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        String namespace = domnodepointer.getNamespaceURI("");
        assertEquals(domnodepointer.getDefaultNamespaceURI(), namespace);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_UnknownPrefix() {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getParentNode()).thenReturn(node);
        String namespace = domnodepointer.getNamespaceURI("unknown");
        assertEquals(NodePointer.UNKNOWN_NAMESPACE, namespace);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_EmptyPrefix_oMrw1() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
    String result = domNodePointer.getNamespaceURI("");
    Assertions.assertEquals(domNodePointer.getDefaultNamespaceURI(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_CustomPrefix_onbO4() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
    String result = domNodePointer.getNamespaceURI("custom");
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_CustomPrefixWithoutNamespace_tpmG6() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
    String result = domNodePointer.getNamespaceURI("custom");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisActual() {
        domnodepointer = new DOMNodePointer(variablePointer, node);
        // Arrange
        when(variablePointer.isActual()).thenReturn(true);
        // Act
        boolean actual = domnodepointer.isActual();
        // Assert
        assertEquals(true, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChildNullNode_oVbs5_EyfI0() {
    DOMNodePointer nodePointer = null;
    JXPathContext context = JXPathContext.newContext(new Object());
    QName name = new QName("prefix", "localName");
    try {
        nodePointer.createChild(context, name, 1);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    assertNull(e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_aKIP3_cRFm0() {
    DOMNodePointer obj1 = new DOMNodePointer(null, Locale.US, "id");
    Object obj2 = new QName("prefix", "localName");
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTestNode_NodeTypeTest_CommentNode_FiKA0() throws Exception {
    node = mock(Node.class);
    attr = mock(Attr.class);
    domnodepointer = new DOMNodePointer(node, Locale.US, "id");
    NodeTypeTest nodeTypeTest = new NodeTypeTest(Node.COMMENT_NODE);
    boolean result = DOMNodePointer.testNode(node, nodeTypeTest);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTestNode_ProcessingInstructionTest_IedA0() throws Exception {
    node = mock(Node.class);
    attr = mock(Attr.class);
    domnodepointer = new DOMNodePointer(node, Locale.US, "id");
    ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest("target");
    boolean result = DOMNodePointer.testNode(node, processingInstructionTest);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeEqualStringsTest_iViX16_Vqmp0() {
    String s1 = "test";
    String s2 = "test";
    boolean result = s1.equals(s2);
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeNotEqualStringsTest_YYhH17_zRTU0() {
    String s1 = "test";
    String s2 = "wrong";
    boolean result = s1.equals(s2);
    Assertions.assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_NullPrefix_lGpP0() {
    node = mock(Node.class);
    attr = mock(Attr.class);
    domnodepointer = new DOMNodePointer(node, Locale.US, "id");
    String namespace = domnodepointer.getNamespaceResolver().getNamespaceURI("");
    assertEquals(domnodepointer.getNamespaceResolver().getNamespaceURI(""), namespace);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_XMLNSPrefix_HlWv0() {
    node = mock(Node.class);
    attr = mock(Attr.class);
    domnodepointer = new DOMNodePointer(node, Locale.US, "id");
    when(node.getParentNode()).thenReturn(node);
    String namespace = domnodepointer.getNamespaceResolver().getNamespaceURI("xmlns");
    assertEquals("http://www.w3.org/2000/xmlns/", namespace);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_NullPrefix_AIih0_IflO0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
    String result = domNodePointer.getNamespaceResolver().getNamespaceURI("");
    Assertions.assertEquals(domNodePointer.getDefaultNamespaceURI(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_XMLPrefix_PdhT2_RSve0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
    String result = domNodePointer.getNamespaceURI("xml");
    Assertions.assertEquals("http://www.w3.org/XML/1998/namespace", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_XMLNSPrefix_Hlbo3_YrBo0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
    String result = domNodePointer.getNamespaceURI("xmlns");
    Assertions.assertEquals("http://www.w3.org/2000/xmlns/", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalName() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Test with local name
        when(node.getLocalName()).thenReturn("localName");
        assertEquals("localName", DOMNodePointer.getLocalName(node));
        // Test with qualified name
        when(node.getNodeName()).thenReturn("prefix:localName");
        assertEquals("localName", DOMNodePointer.getLocalName(node));
        // Test with null local name
        when(node.getLocalName()).thenReturn(null);
        when(node.getNodeName()).thenReturn("qualifiedName");
        assertEquals("qualifiedName", DOMNodePointer.getLocalName(node));
    }
}