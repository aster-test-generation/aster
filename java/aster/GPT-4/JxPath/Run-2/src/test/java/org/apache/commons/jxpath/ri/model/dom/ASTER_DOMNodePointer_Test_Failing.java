/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.apache.commons.jxpath.AbstractFactory;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodePointer_Test_Failing {
private NamespaceResolver localNamespaceResolver;
private String defaultNamespace;
@Mock
    private Node node;
@Mock
    private NodePointer nodePointer1;
@Mock
    private NodePointer nodePointer2;
@Mock
    private NamedNodeMap namedNodeMap;
@InjectMocks
    private DOMNodePointer domNodePointer;
@Mock
    private NodeTest nodeTest;
@Mock
    private NodeList nodeList;
@Mock
    private Document document;
@Mock
    private JXPathContext context;
@Mock
    private AbstractFactory abstractFactory;
@Mock
    private NodeIterator nodeIterator;
@Mock
    private NodePointer nodePointer;
private QName qName;
@Mock
    Element element;
@Mock
    private Locale locale;
@Mock
    private NodePointer startWith;
@Mock
    private DOMNodeIterator expectedIterator;
@Mock
    private NamespaceResolver namespaceResolver;
private QName qNameWithPrefix;
private QName qNameWithoutPrefix;
@Mock
    private Node anotherNode;
@Mock
    private Attr attr;
@Mock
    private Comment commentNode;
private final String id = "testId";
private Locale mockLocale;
@Mock
    private DOMNodePointer parent;
@Mock
    private NamespaceResolver parentNamespaceResolver;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_DifferentNodes_1() throws Exception {
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(null);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node.getFirstChild()).thenReturn(node).thenReturn(node2);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2),
                "Should return0 when first node is before the second node in document order");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_DifferentNodes_2() throws Exception {
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(null);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node.getFirstChild()).thenReturn(node).thenReturn(node2);
        assertEquals(1, domNodePointer.compareChildNodePointers(nodePointer2, nodePointer1),
                "Should return 1 when first node is after the second node in document order");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_AttributeNodes_1() throws Exception {
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(null);
        Node attributeNode1 = mock(Node.class);
        Node attributeNode2 = mock(Node.class);
        when(nodePointer1.getBaseValue()).thenReturn(attributeNode1);
        when(nodePointer2.getBaseValue()).thenReturn(attributeNode2);
        when(attributeNode1.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(attributeNode2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(namedNodeMap.getLength()).thenReturn(2);
        when(namedNodeMap.item(0)).thenReturn(attributeNode1);
        when(namedNodeMap.item(1)).thenReturn(attributeNode2);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2),
                "Should return -1 when first attribute node is before the second in the map");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithElementNode_pUNt3() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        NodeList nodeList = mock(NodeList.class);
        when(node.getChildNodes()).thenReturn(nodeList);
        when(nodeList.getLength()).thenReturn(1);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        domNodePointer.setValue(null);
        verify(node).removeChild(any(Node.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNodeValue_mePx4() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        Node valueNode = mock(Node.class);
        when(valueNode.cloneNode(true)).thenReturn(valueNode);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        domNodePointer.setValue(valueNode);
        verify(node).appendChild(valueNode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithDocumentNode_Wrcz5() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        Document valueNode = mock(Document.class);
        NodeList nodeList = mock(NodeList.class);
        when(valueNode.getChildNodes()).thenReturn(nodeList);
        when(nodeList.getLength()).thenReturn(0);
        when(valueNode.cloneNode(true)).thenReturn(valueNode);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        domNodePointer.setValue(valueNode);
        verify(node, never()).appendChild(any(Node.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithElementToElement_FkXJ8() {
        Node node = mock(Node.class);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        Element valueElement = mock(Element.class);
        NodeList nodeList = mock(NodeList.class);
        when(valueElement.getChildNodes()).thenReturn(nodeList);
        when(nodeList.getLength()).thenReturn(0);
        when(valueElement.cloneNode(true)).thenReturn(valueElement);
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        domNodePointer.setValue(valueElement);
        verify(node, never()).appendChild(any(Node.class));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_DifferentNodes_1_fid1() throws Exception {
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(null);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node.getFirstChild()).thenReturn(node).thenReturn(node2);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2),
                "Should return -1 when first node is before the second node in document order");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithTextNodeAndNonEmptyString() {
        when(node.getOwnerDocument()).thenReturn(document);
        when(node.getChildNodes()).thenReturn(nodeList);
        when(node.appendChild(any(Node.class))).thenAnswer(invocation -> invocation.getArgument(0));
        when(node.removeChild(any(Node.class))).thenReturn(null);
        when(node.getParentNode()).thenReturn(node);
        when(node.getNodeType()).thenReturn(Node.TEXT_NODE);
        String testValue = "Test String";
        domNodePointer.setValue(testValue);
        verify(node, times(1)).setNodeValue(testValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_AttributePresent() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null); // Assume no parent for simplicity
        when(element.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        // Setup
        String attrName = "testAttr";
        String attrValue = "value";
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null);
        when(node).thenReturn(element);
        when(element.getAttribute(attrName)).thenReturn(attrValue);
        // Execute
        String result = DOMNodePointer.findEnclosingAttribute(node, attrName);
        // Verify
        assertEquals(attrValue, result, "The attribute value should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindEnclosingAttribute_AttributeAbsent() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null); // Assume no parent for simplicity
        when(element.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        // Setup
        String attrName = "testAttr";
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null);
        when(node).thenReturn(element);
        when(element.getAttribute(attrName)).thenReturn("");
        // Execute
        String result = DOMNodePointer.findEnclosingAttribute(node, attrName);
        // Verify
        assertNull(result, "The result should be null when the attribute is not present.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() {
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        int expectedHashCode = 12345;
        when(node.hashCode()).thenReturn(expectedHashCode);
        int actualHashCode = domNodePointer.hashCode();
        assertEquals(expectedHashCode, actualHashCode, "The hash code should match the mocked node's hash code.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ProcessingInstructionNode_1() {
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        ProcessingInstruction pi = mock(ProcessingInstruction.class);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(pi.getTarget()).thenReturn("target");
        when(node).thenReturn(pi);
        QName result = domNodePointer.getName();
        assertEquals(null, result.getPrefix());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ProcessingInstructionNode_2() {
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        ProcessingInstruction pi = mock(ProcessingInstruction.class);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(pi.getTarget()).thenReturn("target");
        when(node).thenReturn(pi);
        QName result = domNodePointer.getName();
        assertEquals("target", result.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI() throws Exception {
        // Setup is handled by Mockito annotations
        // Arrange
        String expectedNamespaceURI = "http://example.com/namespace";
        when(node.getNamespaceURI()).thenReturn(expectedNamespaceURI);
        // Act
        String result = domNodePointer.getNamespaceURI();
        // Assert
        assertEquals(expectedNamespaceURI, result, "The namespace URI should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_NullNode_PcDx0() {
        Node node = null;
        DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        assertNull("Expected null namespace URI for null Node", domNodePointer.getNamespaceURI());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithNamespace() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node instanceof Document).thenReturn(true);
        when((Document) node).thenReturn(document);
        when(document.getDocumentElement()).thenReturn(element);
        when(element.getNamespaceURI()).thenReturn("http://example.com/ns");
        String result = DOMNodePointer.getNamespaceURI(node);
        assertEquals("http://example.com/ns", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithNullNamespaceAndAttribute() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node instanceof Document).thenReturn(true);
        when((Document) node).thenReturn(document);
        when(document.getDocumentElement()).thenReturn(element);
        when(element.getNamespaceURI()).thenReturn(null);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://example.com/default");
        String result = DOMNodePointer.getNamespaceURI(node);
        assertEquals("http://example.com/default", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithNullNamespaceAndNoAttribute() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node instanceof Document).thenReturn(true);
        when((Document) node).thenReturn(document);
        when(document.getDocumentElement()).thenReturn(element);
        when(element.getNamespaceURI()).thenReturn(null);
        when(element.getAttributeNode("xmlns")).thenReturn(null);
        when(node.getParentNode()).thenReturn(null); // No parent node to traverse
        String result = DOMNodePointer.getNamespaceURI(node);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithEmptyNamespace() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node instanceof Document).thenReturn(true);
        when((Document) node).thenReturn(document);
        when(document.getDocumentElement()).thenReturn(element);
        when(element.getNamespaceURI()).thenReturn("");
        String result = DOMNodePointer.getNamespaceURI(node);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_WithCommentNode_ReturnsTrimmedText() {
        // Setup is handled by Mockito annotations
        // Setup
        String commentText = " This is a comment ";
        when(node.getNodeType()).thenReturn(Node.COMMENT_NODE);
        when(commentNode.getData()).thenReturn(commentText);
        when(node).thenReturn(commentNode);
        // Execute
        Object result = domNodePointer.getValue();
        // Verify
        assertEquals("This is a comment", result, "Should return trimmed comment text.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_WithNonCommentNode_ReturnsStringValue() {
        // Setup is handled by Mockito annotations
        // Setup
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        // Assuming stringValue method returns node name for simplicity
        when(node.getNodeName()).thenReturn("ElementName");
        // Execute
        Object result = domNodePointer.getValue();
        // Verify
        assertEquals("ElementName", result, "Should return the node name as string value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_WithNamespace() {
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        when(document.getDocumentElement()).thenReturn(element);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://example.com/default");
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getDocumentElement()).thenReturn(element);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://example.com/default");
        String result = domNodePointer.getDefaultNamespaceURI();
        assertEquals("http://example.com/default", result);
        verify(element).getAttributeNode("xmlns");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_NoNamespace() {
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        when(document.getDocumentElement()).thenReturn(element);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://example.com/default");
        when(node instanceof Document).thenReturn(true);
        when(((Document) node).getDocumentElement()).thenReturn(element);
        when(element.getAttributeNode("xmlns")).thenReturn(null);
        String result = domNodePointer.getDefaultNamespaceURI();
        assertEquals(null, result);
        verify(element).getAttributeNode("xmlns");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDefaultNamespaceURI_CachedNamespace() {
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        when(document.getDocumentElement()).thenReturn(element);
        when(element.getAttributeNode("xmlns")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://example.com/default");
        domNodePointer.getDefaultNamespaceURI(); // First call to cache the namespace
        when(element.getAttributeNode("xmlns")).thenReturn(null); // Change behavior for second call
        String result = domNodePointer.getDefaultNamespaceURI(); // Second call should use cached value
        assertEquals("http://example.com/default", result);
        verify(element, never()).getAttributeNode(any(String.class)); // Verify no further interaction after caching
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_NullNodeName() {
        domNodePointer = new DOMNodePointer(node, null);
        // Setup the mock to return null for both prefix and node name
        when(node.getPrefix()).thenReturn(null);
        when(node.getNodeName()).thenReturn(null);
        // Call the method under test
        String result = DOMNodePointer.getPrefix(node);
        // Assert the result
        assertNull(result, "No prefix should be returned when node name is null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_Reuo0_3() {
        Locale locale = new Locale("en", "US");
        DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
        String prefix = "testPrefix";
        NodePointer result = domNodePointer.namespacePointer(prefix);
        assertEquals(prefix, result.getName().getPrefix());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguage_WhenLangAttributePresent() {
        when(node.getAttributes()).thenReturn(null);
        when(node.getParentNode()).thenReturn(element);
        when(element.getAttributes()).thenReturn(null);
        when(element.getParentNode()).thenReturn(null);
        // Setup
        Attr langAttr = mock(Attr.class);
        NamedNodeMap attributes = mock(NamedNodeMap.class);
        when(node.getAttributes()).thenReturn(attributes);
        when(attributes.getNamedItem("xml:lang")).thenReturn(langAttr);
        when(langAttr.getNodeValue()).thenReturn("en");
        // Execute
        String language = domNodePointer.getLanguage();
        // Verify
        assertEquals("en", language);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguage_WhenLangAttributeInParent() {
        when(node.getAttributes()).thenReturn(null);
        when(node.getParentNode()).thenReturn(element);
        when(element.getAttributes()).thenReturn(null);
        when(element.getParentNode()).thenReturn(null);
        // Setup
        Attr langAttr = mock(Attr.class);
        NamedNodeMap attributes = mock(NamedNodeMap.class);
        when(element.getAttributes()).thenReturn(attributes);
        when(attributes.getNamedItem("xml:lang")).thenReturn(langAttr);
        when(langAttr.getNodeValue()).thenReturn("fr");
        // Execute
        String language = domNodePointer.getLanguage();
        // Verify
        assertEquals("fr", language);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLanguage_vxTE0() {
        Node node = null; // Assuming node is properly initialized elsewhere
        Locale locale = new Locale("en");
        DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
        String result = domNodePointer.getLanguage();
        assertEquals("Expected language attribute value", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_WithNodeNameTestAndElementNode_ShouldMatchCorrectly() {
        node = mock(Node.class);
        nodeTest = mock(NodeTest.class); // Generic mock, will be cast in specific tests
        NodeNameTest nodeNameTest = mock(NodeNameTest.class);
        QName qName = new QName("testNamespace", "testName");
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(nodeNameTest.isWildcard()).thenReturn(false);
        when(nodeNameTest.getNamespaceURI()).thenReturn("testNamespace");
        assertTrue(DOMNodePointer.testNode(node, nodeNameTest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_WithProcessingInstructionTest_ShouldMatchTarget() {
        node = mock(Node.class);
        nodeTest = mock(NodeTest.class); // Generic mock, will be cast in specific tests
        ProcessingInstructionTest piTest = mock(ProcessingInstructionTest.class);
        ProcessingInstruction piNode = mock(ProcessingInstruction.class);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(piTest.getTarget()).thenReturn("testTarget");
        when(piNode.getTarget()).thenReturn("testTarget");
        when(node).thenReturn(piNode);
        assertTrue(DOMNodePointer.testNode(node, piTest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullIdAndNonNullParent() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getLocalName()).thenReturn("elementName");
        when(parent.asPath()).thenReturn("/parent/path");
        domNodePointer = new DOMNodePointer(parent, node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getLocalName()).thenReturn("child");
        String expectedPath = "/parent/path/child[1]";
        assertEquals(expectedPath, domNodePointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithProcessingInstructionNode() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getLocalName()).thenReturn("elementName");
        ProcessingInstruction pi = mock(ProcessingInstruction.class);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(pi.getTarget()).thenReturn("target");
        when(node).thenReturn(pi);
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        String expectedPath = "/processing-instruction('target')[1]";
        assertEquals(expectedPath, domNodePointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithPrefix_FindsAttributeInElement() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null);
        when(document.getDocumentElement()).thenReturn(element);
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        when(((Document) node).getDocumentElement()).thenReturn(element);
        when(element.getAttributeNode("xmlns:testPrefix")).thenReturn(attr);
        when(attr.getValue()).thenReturn("http://found.namespace.uri");
        String result = domNodePointer.getNamespaceURI("testPrefix");
        assertEquals("http://found.namespace.uri", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithPrefix_NotFound_ReturnsNull() {
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        when(node.getParentNode()).thenReturn(null);
        when(document.getDocumentElement()).thenReturn(element);
        when(node.getNodeType()).thenReturn(Node.DOCUMENT_NODE);
        when(((Document) node).getDocumentElement()).thenReturn(element);
        when(element.getAttributeNode("xmlns:testPrefix")).thenReturn(null);
        String result = domNodePointer.getNamespaceURI("testPrefix");
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_InitialCreation_1() throws Exception {
        // Setup DOMNodePointer with a mocked Node and default Locale
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        when(domNodePointer.getNamespaceResolver()).thenReturn(parentNamespaceResolver);
        // Call the method under test
        NamespaceResolver result = domNodePointer.getNamespaceResolver();
        // Verify the result is not null
        // Verify the method setNamespaceContextPointer was called with the correct argument
        verify(result).setNamespaceContextPointer(domNodePointer);
        // Verify that the returned NamespaceResolver is the same as the one created in the method
        assertNotNull(result, "NamespaceResolver should not be null");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_InitialCreation_2() throws Exception {
        // Setup DOMNodePointer with a mocked Node and default Locale
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        when(domNodePointer.getNamespaceResolver()).thenReturn(parentNamespaceResolver);
        // Call the method under test
        NamespaceResolver result = domNodePointer.getNamespaceResolver();
        // Verify the result is not null
        // Verify the method setNamespaceContextPointer was called with the correct argument
        verify(result).setNamespaceContextPointer(domNodePointer);
        // Verify that the returned NamespaceResolver is the same as the one created in the method
        assertSame(result, domNodePointer.getNamespaceResolver(), "Should return the same NamespaceResolver instance on subsequent calls");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_CachedInstance() throws Exception {
        // Setup DOMNodePointer with a mocked Node and default Locale
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        when(domNodePointer.getNamespaceResolver()).thenReturn(parentNamespaceResolver);
        // First call to initialize the resolver
        NamespaceResolver firstCallResolver = domNodePointer.getNamespaceResolver();
        // Second call should return the same instance
        NamespaceResolver secondCallResolver = domNodePointer.getNamespaceResolver();
        // Verify that both calls return the same object
        assertSame(firstCallResolver, secondCallResolver, "Should return the same instance on multiple calls");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeWithValidNodeTest_ZGhI0_vYct0() {
    Node node = Mockito.mock(Node.class);
    Locale locale = Locale.getDefault();
    NodeTest nodeTest = Mockito.mock(NodeTest.class);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    boolean result = domNodePointer.testNode(nodeTest);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateAttributeWithUnknownPrefix_NsJU0_1() {
    when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
    domNodePointer = new DOMNodePointer(node, null);
    qNameWithPrefix = new QName("ns:tag");
    qNameWithoutPrefix = new QName("tag");
    NamespaceResolver namespaceResolver = mock(NamespaceResolver.class);
    when(domNodePointer.getNamespaceResolver()).thenReturn(namespaceResolver);
    when(namespaceResolver.getNamespaceURI("ns")).thenReturn("http://example.com/ns");
    Element element = (Element) node;
    when(node instanceof Element).thenReturn(true);
    when(namespaceResolver.getNamespaceURI("ns")).thenReturn(null);
    Exception exception = assertThrows(JXPathException.class, () -> {
        domNodePointer.createAttribute(context, qNameWithPrefix);
    });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateAttributeOnNonElementNode_JtMJ3_MjsZ0() {
    Node node = Mockito.mock(Node.class); // Using Mockito to mock the Node interface
    when(node.getNodeType()).thenReturn(Node.TEXT_NODE); // Simulating a non-Element (TextNode)
    QName qName = new QName("test");
    JXPathContext context = JXPathContext.newContext(null);
    DOMNodePointer domNodePointer = new DOMNodePointer(node, Locale.getDefault());
    NodePointer result = domNodePointer.createAttribute(context, qName);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_EqualStrings_FirstEmptySecondNull_ReturnsTrue_surU16_pFsz0() {
    assertTrue(Objects.equals("", null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithCDATANode_trjx3_UhuQ0() {
    DOMNodePointer pointer = new DOMNodePointer(node, Locale.getDefault());
    assertEquals("/text()[1]", pointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithProcessingInstructionNode_aazS4_SiEr0() {
    ProcessingInstruction node = Mockito.mock(ProcessingInstruction.class);
    Mockito.when(node.getTarget()).thenReturn("target");
    DOMNodePointer pointer = new DOMNodePointer(node, Locale.getDefault());
    assertEquals("/processing-instruction('target')[1]", pointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_WithNullPrefix_ReturnsDefaultNamespace_jrKw0() {
    when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
    when(node.getParentNode()).thenReturn(null);
    when(document.getDocumentElement()).thenReturn(element);
    String defaultNamespaceURI = "http://default.namespace.uri";
    domNodePointer = new DOMNodePointer(node, Locale.getDefault());
    when(node.getNamespaceURI()).thenReturn(defaultNamespaceURI);
    NamespaceResolver namespaceResolver = domNodePointer.getNamespaceResolver();
    String result = namespaceResolver.getNamespaceURI(null);
    assertEquals(defaultNamespaceURI, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_DifferentNodes() throws Exception {
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(null);
        Node node2 = mock(Node.class);
        when(nodePointer2.getBaseValue()).thenReturn(node2);
        when(node.getFirstChild()).thenReturn(node).thenReturn(node2);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2),
                "Should return -1 when first node is before the second node in document order");
        assertEquals(1, domNodePointer.compareChildNodePointers(nodePointer2, nodePointer1),
                "Should return 1 when first node is after the second node in document order");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_AttributeNodes() throws Exception {
        when(nodePointer1.getBaseValue()).thenReturn(node);
        when(nodePointer2.getBaseValue()).thenReturn(node);
        when(node.getAttributes()).thenReturn(namedNodeMap);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getNextSibling()).thenReturn(null);
        Node attributeNode1 = mock(Node.class);
        Node attributeNode2 = mock(Node.class);
        when(nodePointer1.getBaseValue()).thenReturn(attributeNode1);
        when(nodePointer2.getBaseValue()).thenReturn(attributeNode2);
        when(attributeNode1.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(attributeNode2.getNodeType()).thenReturn(Node.ATTRIBUTE_NODE);
        when(namedNodeMap.getLength()).thenReturn(2);
        when(namedNodeMap.item(0)).thenReturn(attributeNode1);
        when(namedNodeMap.item(1)).thenReturn(attributeNode2);
        assertEquals(-1, domNodePointer.compareChildNodePointers(nodePointer1, nodePointer2),
                "Should return -1 when first attribute node is before the second in the map");
        assertEquals(1, domNodePointer.compareChildNodePointers(nodePointer2, nodePointer1),
                "Should return 1 when first attribute node is after the second in the map");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ProcessingInstructionNode() {
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        ProcessingInstruction pi = mock(ProcessingInstruction.class);
        when(node.getNodeType()).thenReturn(Node.PROCESSING_INSTRUCTION_NODE);
        when(pi.getTarget()).thenReturn("target");
        when(node).thenReturn(pi);
        QName result = domNodePointer.getName();
        assertEquals(null, result.getPrefix());
        assertEquals("target", result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespacePointer_Reuo0() {
        Locale locale = new Locale("en", "US");
        DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
        String prefix = "testPrefix";
        NodePointer result = domNodePointer.namespacePointer(prefix);
        assertNotNull(result);
        assertEquals(NamespacePointer.class, result.getClass());
        assertEquals(prefix, result.getName().getPrefix());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceResolver_InitialCreation() throws Exception {
        // Setup DOMNodePointer with a mocked Node and default Locale
        domNodePointer = new DOMNodePointer(node, Locale.getDefault());
        when(domNodePointer.getNamespaceResolver()).thenReturn(parentNamespaceResolver);
        // Call the method under test
        NamespaceResolver result = domNodePointer.getNamespaceResolver();
        // Verify the result is not null
        assertNotNull(result, "NamespaceResolver should not be null");
        // Verify the method setNamespaceContextPointer was called with the correct argument
        verify(result).setNamespaceContextPointer(domNodePointer);
        // Verify that the returned NamespaceResolver is the same as the one created in the method
        assertSame(result, domNodePointer.getNamespaceResolver(), "Should return the same NamespaceResolver instance on subsequent calls");
    }
}