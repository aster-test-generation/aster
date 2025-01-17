/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
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
    private DOMNodePointer domnodepointer;
    private NodePointer nodepointer;
    private NamedNodeMap namednodemap;
    private NodeTest nodeTest;
    private Attr attr;
    private NodeList nodelist;
    private Document document;
    private DOMNodePointer domNodePointer;
    private JXPathContext jXPathContext;
    private QName qName;
    private AbstractFactory abstractFactory;
    @Mock
    private Element element;
    @Mock
    private Locale locale;
    @Mock
    private QName name;
    @Mock
    private DOMAttributeIterator iterator;
    @Mock
    private QName qname;
    @Mock
    private VariablePointer variablePointer;
    private String defaultNamespace;
    private Node parent;
    private String id;
    private NodeTest test;
    private Object value;
    @Mock
    private NamespaceResolver superNamespaceResolver;
    @Mock
    private NamespaceResolver localNamespaceResolver;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildNullContext_NthY4() {
        QName name = new QName("name", "namespace");
        DOMNodePointer nodePointer = new DOMNodePointer(null, Locale.US, null);
        try {
            nodePointer.createChild(null, name, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNull(e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        domNodePointer = Mockito.mock(DOMNodePointer.class);
        // Arrange
        Mockito.when(domNodePointer.isCollection()).thenReturn(true);
        // Act
        boolean result = domNodePointer.isCollection();
        // Assert
        Mockito.verify(domNodePointer, Mockito.times(1)).isCollection();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() {
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Arrange
        // No need to arrange anything as we are testing the getImmediateNode method
        // Act
        Object immediateNode = domnodepointer.getImmediateNode();
        // Assert
        assertEquals(node, immediateNode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_NullNode_upDt2() {
        String result = DOMNodePointer.findEnclosingAttribute(null, "attrName");
        assertNull(result);
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
    public void testGetName_ElementNode() throws Exception {
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
    public void testGetNamespaceURI_VariablePointer_gBfh1() {
        QName name = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(name);
        String result = variablePointer.getNamespaceURI();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        MockitoAnnotations.initMocks(this);
        DOMNodePointer domnodepointer = new DOMNodePointer(node, locale);
        // Arrange
        int expectedLength = 1;
        // Act
        int actualLength = domnodepointer.getLength();
        // Assert
        assertEquals(expectedLength, actualLength);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf_1() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Test when node has no child nodes
        when(node.hasChildNodes()).thenReturn(false);
        // Test when node has child nodes
        when(node.hasChildNodes()).thenReturn(true);
        assertFalse(domnodepointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() throws Exception {
        domnodepointer = new DOMNodePointer(node, locale, "id");
        // Arrange
        DOMNodePointer anotherDomNodePointer = new DOMNodePointer(node, locale, "id");
        // Act
        boolean result = domnodepointer.equals(anotherDomNodePointer);
        // Assert
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_TextNode() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        when(node.getTextContent()).thenReturn("");
        assertEquals("", domnodepointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDefaultNamespaceURI_DocumentNode() throws Exception {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        String result = domnodepointer.getDefaultNamespaceURI();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDefaultNamespaceURI_NullNode_yNII7() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.US, "id");
        String result = domNodePointer.getDefaultNamespaceURI();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove() throws Exception {
        node = mock(Node.class);
        parent = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.getDefault(), "id");
        when(node.getParentNode()).thenReturn(parent);
        domnodepointer.remove();
        verify(parent, times(1)).removeChild(node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_4() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Test with prefix
        when(node.getPrefix()).thenReturn("prefix");
        // Test without prefix
        when(node.getPrefix()).thenReturn(null);
        // Test with colon in node name
        when(node.getNodeName()).thenReturn("namespace:element");
        // Test without colon in node name
        when(node.getNodeName()).thenReturn("element");
        assertEquals(null, DOMNodePointer.getPrefix(node));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNull_KynF0() {
        boolean result = DOMNodePointer.testNode(null, null);
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_TextNode_YqDJ2() {
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.US, "id");
        String result = domNodePointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ElementNode_sKeN0() {
        QName name = new QName("prefix", "localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ElementNode_NoPrefix_WxqG1() {
        QName name = new QName("localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_TextNode_qJdG2() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(null, node);
        assertEquals("/text()[1]", domNodePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_DocumentNode_ceql4() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(null, node);
        assertEquals("", domNodePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ElementNode_NoNamespace_Qfsk7() {
        QName name = new QName(null, "localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
        assertEquals("$localName", domNodePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ElementNode_zhEp0() {
        QName name = new QName("prefix", "localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
        assertEquals("$prefix:localName", domNodePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_TextNode_TxTT1() {
        QName name = new QName("prefix", "localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_TextNode_NoParent_oWGu5() {
        QName name = new QName("prefix", "localName");
        VariablePointer parent = null;
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
        assertEquals("/text()[1]", domNodePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ElementNode_PVEl0() {
        QName name = new QName("prefix", "localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getPreviousSibling()).thenReturn(null);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ElementNode_PreviousSibling_DxoE1() {
        QName name = new QName("prefix", "localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        Node previousSibling = mock(Node.class);
        when(previousSibling.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getPreviousSibling()).thenReturn(previousSibling);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
        assertEquals("$prefix:localName", domNodePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_TextNode_BuaF2() {
        QName name = new QName("prefix", "localName");
        VariablePointer parent = new VariablePointer(name);
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        DOMNodePointer domNodePointer = new DOMNodePointer(parent, node);
        assertEquals("$prefix:localName/text()[1]", domNodePointer.asPath());
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
    public void testGetNamespaceURI_CustomPrefixNotFound() {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getParentNode()).thenReturn(node);
        String namespace = domnodepointer.getNamespaceURI("custom");
        assertEquals(NodePointer.UNKNOWN_NAMESPACE, namespace);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_EmptyPrefix_GmpR1() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        String result = domNodePointer.getNamespaceURI("");
        Assertions.assertEquals(domNodePointer.getDefaultNamespaceURI(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_CustomPrefixWithNamespaceAndEmpty_SFwO8() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        domNodePointer.getNamespaceURI("custom");
        String result = domNodePointer.getNamespaceURI("custom");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() {
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Arrange
        // No need to arrange anything as we are testing a getter method
        // Act
        Object baseValue = domnodepointer.getBaseValue();
        // Assert
        assertEquals(node, baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual() throws Exception {
        domNodePointer = Mockito.mock(DOMNodePointer.class);
        // Arrange
        Mockito.when(domNodePointer.isActual()).thenReturn(true);
        // Act
        boolean actual = domNodePointer.isActual();
        // Assert
        Mockito.verify(domNodePointer, Mockito.times(1)).isActual();
        Assertions.assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_PkpK0() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, null);
        boolean result = domNodePointer.isActual();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual2_tIem1() {
        QName qName = new QName("qualifiedName");
        VariablePointer variablePointer = new VariablePointer(qName);
        DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, null);
        boolean result = domNodePointer.isActual();
        assert result;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateChildNullName_jrPx5_UJLO0() {
        JXPathContext context = JXPathContext.newContext(new Object());
        DOMNodePointer nodePointer = new DOMNodePointer(null, Locale.US, null);
        try {
            nodePointer.createChild(context, null, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalNameWithNode_pENn2_wPbm0() {
        Node node = mock(Node.class);
        when(node.getLocalName()).thenReturn("localName");
        String localName = node.getLocalName();
        assertEquals("localName", localName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_ElementNode_kPRT0() throws Exception {
        Node node = mock(Node.class);
        String id = "someId";
        Locale locale = Locale.US;
        QName qname = new QName("somePrefix", "someLocalName");
        VariablePointer variablePointer = new VariablePointer(qname);
        DOMNodePointer domnodepointer = new DOMNodePointer(variablePointer, node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getLocalName()).thenReturn("someLocalName");
        when(node.getNamespaceURI()).thenReturn("someNamespaceURI");
        when(node.getPrefix()).thenReturn("somePrefix");
        String expectedPath = "/somePrefix:someLocalName[1]";
        String actualPath = domnodepointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_TextNode_BPym0() throws Exception {
        Node node = mock(Node.class);
        String id = "someId";
        DOMNodePointer domnodepointer = new DOMNodePointer(node, null, id);
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        String expectedPath = "/text()[1]";
        String actualPath = domnodepointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_NullPrefix_iYdl0() {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        String namespace = domnodepointer.getNamespaceResolver().getNamespaceURI("");
        assertEquals(domnodepointer.getNamespaceResolver().getNamespaceURI(""), namespace);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_XMLPrefix_jssS0() {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getParentNode()).thenReturn(node);
        String namespace = domnodepointer.getNamespaceResolver().getNamespaceURI("xml");
        assertEquals("http://www.w3.org/XML/1998/namespace", namespace);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_XMLNSPrefix_SAzV0() {
        node = mock(Node.class);
        attr = mock(Attr.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        when(node.getParentNode()).thenReturn(node);
        String namespace = domnodepointer.getNamespaceResolver().getNamespaceURI("xmlns");
        assertEquals("http://www.w3.org/2000/xmlns/", namespace);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_NullPrefix_pSxM0_VrXc0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        String result = domNodePointer.getNamespaceResolver().getNamespaceURI("");
        Assertions.assertEquals(domNodePointer.getDefaultNamespaceURI(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_XMLPrefix_WJuc2_jQWm0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        String result = domNodePointer.getNamespaceURI("xml");
        Assertions.assertEquals("http://www.w3.org/XML/1998/namespace", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_XMLNSPrefix_duVw3_mhCN0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        String result = domNodePointer.getNamespaceURI("xmlns");
        Assertions.assertEquals("http://www.w3.org/2000/xmlns/", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        node = mock(Node.class);
        domnodepointer = new DOMNodePointer(node, Locale.US, "id");
        // Test when node has no child nodes
        when(node.hasChildNodes()).thenReturn(false);
        assertTrue(domnodepointer.isLeaf());
        // Test when node has child nodes
        when(node.hasChildNodes()).thenReturn(true);
        assertFalse(domnodepointer.isLeaf());
    }
}