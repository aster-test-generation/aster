/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DOMNodePointer_Coverage_Test_Passing {
private Object value;
private JXPathContext context;
    private Node node;
    private DOMNodePointer domNodePointer;
    private Element element;
    private NodeList nodeList;
    private Comment comment;
    private QName name;
    private int index;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_jZfW0() {
    Node node = mock(Node.class);
    when(node.getNamespaceURI()).thenReturn("http://example.com");
    Locale locale = Locale.US;
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale, "id");
    String namespaceURI = domNodePointer.getNamespaceURI();
    assertEquals("http://example.com", namespaceURI);
}
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_aXqM0() throws Exception {
        node = mock(Node.class);
        element = mock(Element.class);
        nodeList = mock(NodeList.class);
        comment = mock(Comment.class);
        domNodePointer = new DOMNodePointer(node, Locale.getDefault(), "id");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_RootDOMNode_ThrowsJXPathException_tQKZ0() {
        Node node = mock(Node.class);
        when(node.getParentNode()).thenReturn(null);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, null);
        JXPathException exception = assertThrows(JXPathException.class, domNodePointer::remove);
        assert exception.getMessage().equals("Cannot remove root DOM node");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_NormalNode_RemovesNode_USmT1() {
        Node node = mock(Node.class);
        Node parentNode = mock(Node.class);
        when(node.getParentNode()).thenReturn(parentNode);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, null);
        domNodePointer.remove();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_AttributeNode_Equal_vGqV0() {
        DOMNodePointer pointer = new DOMNodePointer(mock(Node.class), mock(Locale.class));
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        when(pointer1.getBaseValue()).thenReturn(mock(Node.class));
        when(pointer2.getBaseValue()).thenReturn(mock(Node.class));
        assertEquals(0, pointer.compareChildNodePointers(pointer1, pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_AttributeNode_InAttributeList_dHnH2() {
        DOMNodePointer pointer = new DOMNodePointer(mock(Node.class), mock(Locale.class));
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        Node node1 = mock(Node.class);
        Node node2 = mock(Node.class);
        NamedNodeMap map = mock(NamedNodeMap.class);
        when(pointer1.getBaseValue()).thenReturn(node1);
        when(pointer2.getBaseValue()).thenReturn(node2);
        when(node1.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(((Node) pointer.getNode()).getAttributes()).thenReturn(map);
        when(map.getLength()).thenReturn(2);
        when(map.item(0)).thenReturn(node1);
        assertEquals(-1, pointer.compareChildNodePointers(pointer1, pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_AttributeNode_NotInAttributeList_EOSN3() {
        DOMNodePointer pointer = new DOMNodePointer(mock(Node.class), mock(Locale.class));
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        Node node1 = mock(Node.class);
        Node node2 = mock(Node.class);
        NamedNodeMap map = mock(NamedNodeMap.class);
        when(pointer1.getBaseValue()).thenReturn(node1);
        when(pointer2.getBaseValue()).thenReturn(node2);
        when(node1.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(node2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(((Node) pointer.getNode()).getAttributes()).thenReturn(map);
        when(map.getLength()).thenReturn(2);
        when(map.item(0)).thenReturn(mock(Node.class));
        assertEquals(0, pointer.compareChildNodePointers(pointer1, pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_ElementNode_FirstChild_DNcp4() {
        DOMNodePointer pointer = new DOMNodePointer(mock(Node.class), mock(Locale.class));
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        Node node1 = mock(Node.class);
        Node node2 = mock(Node.class);
        when(pointer1.getBaseValue()).thenReturn(node1);
        when(pointer2.getBaseValue()).thenReturn(node2);
        when(node1.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node2.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node1.getFirstChild()).thenReturn(node1);
        assertEquals(-1, pointer.compareChildNodePointers(pointer1, pointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_NullTest_yLKC1() throws Exception {
        assertTrue(DOMNodePointer.testNode(node, null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_MgQM0() {
        NamespaceResolver namespaceResolver = domNodePointer.getNamespaceResolver();
        assertNotNull(namespaceResolver);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_aXqM0_YNRd0() throws Exception {
    Node node = mock(Node.class);
    Element element = mock(Element.class);
    NodeList nodeList = mock(NodeList.class);
    org.w3c.dom.Comment comment = mock(org.w3c.dom.Comment.class);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault(), "id");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setup_wMNY0_zsWM0() throws Exception {
    Node node = mock(Node.class);
    Attr attr = mock(Attr.class);
    Locale locale = Locale.US;
    DOMNodePointer domnodepointer = new DOMNodePointer(node, locale, "id");
    NamespaceResolver namespaceResolver = domnodepointer.getNamespaceResolver();
    assertNotNull(namespaceResolver);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testtestNode_NodeNameTest_NotElementNode_bLbc3_QhJF0() throws Exception {
    NodeNameTest nodeNameTest = mock(NodeNameTest.class);
    Node node = mock(Node.class);
    DOMNodePointer pointer = new DOMNodePointer(node, Locale.getDefault());
    when(nodeNameTest.getNodeName()).thenReturn(new QName("prefix", "localName"));
    when(nodeNameTest.getNamespaceURI()).thenReturn("namespaceURI");
    when(nodeNameTest.isWildcard()).thenReturn(false);
    when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
    assertFalse(pointer.testNode(nodeNameTest));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_LocalName_dNBg6_nKex0() throws Exception {
    Node nodeMock = mock(Node.class);
    when(((org.w3c.dom.Node) nodeMock).getLocalName()).thenReturn("localName");
    DOMNodePointer domNodePointer = new DOMNodePointer(nodeMock, Locale.getDefault());
    assertEquals("", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testtestNode_NodeTypeTest_TextNodeType_UDSm8_axXQ0() throws Exception {
    NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
    Node node = mock(Node.class);
    when(nodeTypeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_TEXT);
    when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
    DOMNodePointer pointer = new DOMNodePointer(node, Locale.getDefault());
    assertTrue(pointer.testNode(node, nodeTypeTest));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_ParentInstanceOfDOMNodePointer_OJnY3_TQrb0() throws Exception {
    Node nodeMock = mock(Node.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(nodeMock.getParentNode()).thenReturn(nodeMock);
    DOMNodePointer domNodePointer = new DOMNodePointer(parent, nodeMock);
    when(parent.asPath()).thenReturn("parentPath");
    assertEquals("parentPath", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_NamespaceURINull_tEYo7_FPZP0() throws Exception {
    Node nodeMock = mock(Node.class);
    when(nodeMock.getNamespaceURI()).thenReturn(null);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(nodeMock, locale);
    NamespaceResolver namespaceResolver = domNodePointer.getNamespaceResolver();
    assertEquals("", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_ElementNode_ParentNull_ExSI15_TzSz0() throws Exception {
    Node nodeMock = mock(Node.class);
    when(nodeMock.getParentNode()).thenReturn((Node)null);
    DOMNodePointer domNodePointer = new DOMNodePointer(nodeMock, Locale.getDefault());
    assertEquals("", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_Default_prXf14_ajZS0() throws Exception {
    Node nodeMock = org.mockito.Mockito.mock(Node.class);
    DOMNodePointer domNodePointer = new DOMNodePointer(nodeMock, Locale.getDefault());
    org.mockito.Mockito.when(nodeMock.getNodeType()).thenReturn(Node.COMMENT_NODE);
    assertEquals("", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_IdNotNull_kmQk1_JxLT0() throws Exception {
    Node nodeMock = mock(Node.class);
    Locale locale = new Locale("en", "US");
    String id = "testId";
    DOMNodePointer domNodePointer = new DOMNodePointer(nodeMock, locale, id);
    when(nodeMock.getNodeType()).thenReturn(Node.ELEMENT_NODE);
    NamespaceResolver namespaceResolver = domNodePointer.getNamespaceResolver();
    assertEquals("id('testId')", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_PrefixNotNull_ZyyT8_lxRe0() throws Exception {
    Node nodeMock = mock(Node.class);
    NamespaceResolver namespaceResolverMock = mock(NamespaceResolver.class);
    DOMNodePointer domNodePointer = new DOMNodePointer(nodeMock, Locale.getDefault());
    domNodePointer.setNamespaceResolver(namespaceResolverMock);
    when(nodeMock.getNamespaceURI()).thenReturn("nsURI");
    when(namespaceResolverMock.getPrefix((String) any())).thenReturn("prefix");
    when(namespaceResolverMock.getPrefix("nsURI")).thenReturn("prefix");
    when(nodeMock.getLocalName()).thenReturn("localName");
    assertEquals("", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_PrefixNull_sGFl9_PSsc0() throws Exception {
    Node nodeMock = mock(Node.class);
    NamespaceResolver namespaceResolverMock = mock(NamespaceResolver.class);
    DOMNodePointer domNodePointer = new DOMNodePointer(nodeMock, Locale.getDefault());
    when(nodeMock.getNamespaceURI()).thenReturn("nsURI");
    when(namespaceResolverMock.getPrefix((String) any())).thenReturn(null);
    domNodePointer.setNamespaceResolver(namespaceResolverMock);
    assertEquals("", domNodePointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute_NamespaceResolverNotNull_cWYK6() {
        NamespaceResolver nsr = new NamespaceResolver();
        domNodePointer.setNamespaceResolver(nsr);
        domNodePointer.createAttribute(context, name);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute_NamespaceResolverNull_ZQrN7() {
        domNodePointer.setNamespaceResolver(null);
        try {
            domNodePointer.createAttribute(context, name);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateAttribute_NamespaceURINull_LDMW9() {
        NamespaceResolver nsr = new NamespaceResolver();
        domNodePointer.setNamespaceResolver(nsr);
        try {
            domNodePointer.createAttribute(context, name);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
        }
}
}