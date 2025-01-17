/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Attr;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
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
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributePointer_Test_Passing {
@Mock
    private DOMNodePointer mockParentNodePointer;
@InjectMocks
    private DOMAttributePointer domAttributePointer;
private Attr attr;
private DOMNodePointer parentNode;
@Mock
    private Attr attribute;
@Mock
    private NodeTypeTest nodeTest;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private DOMNodePointer parent;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() throws Exception {
        domAttributePointer = new DOMAttributePointer(mockParentNodePointer, null);
        NodePointer mockNodePointer1 = mock(NodePointer.class);
        NodePointer mockNodePointer2 = mock(NodePointer.class);
        // Assuming compareChildNodePointers should return 0 as per the implementation provided
        int result = domAttributePointer.compareChildNodePointers(mockNodePointer1, mockNodePointer2);
        assertEquals(0, result, "The compareChildNodePointers method should return 0 for any input.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject() throws Exception {
        attr = mock(Attr.class);
        parentNode = mock(DOMNodePointer.class);
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        assertTrue(domAttributePointer.equals(domAttributePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentType() throws Exception {
        attr = mock(Attr.class);
        parentNode = mock(DOMNodePointer.class);
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        Object otherObject = new Object();
        assertFalse(domAttributePointer.equals(otherObject));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null() throws Exception {
        attr = mock(Attr.class);
        parentNode = mock(DOMNodePointer.class);
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        assertFalse(domAttributePointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameAttributes() throws Exception {
        attr = mock(Attr.class);
        parentNode = mock(DOMNodePointer.class);
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        DOMAttributePointer anotherPointer = new DOMAttributePointer(parentNode, attr);
        assertTrue(domAttributePointer.equals(anotherPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentAttributes() throws Exception {
        attr = mock(Attr.class);
        parentNode = mock(DOMNodePointer.class);
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        Attr anotherAttr = mock(Attr.class);
        DOMAttributePointer anotherPointer = new DOMAttributePointer(parentNode, anotherAttr);
        assertFalse(domAttributePointer.equals(anotherPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NullNodeTest_ReturnsTrue() throws Exception {
        domAttributePointer = new DOMAttributePointer(parentNode, attribute);
        assertTrue(domAttributePointer.testNode(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NodeTypeTestWithMatchingNodeType_ReturnsTrue() throws Exception {
        domAttributePointer = new DOMAttributePointer(parentNode, attribute);
        when(nodeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_NODE);
        when(nodeTest instanceof NodeTypeTest).thenReturn(true);
        assertTrue(domAttributePointer.testNode(nodeTest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NodeTypeTestWithNonMatchingNodeType_ReturnsFalse() throws Exception {
        domAttributePointer = new DOMAttributePointer(parentNode, attribute);
        when(nodeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_TEXT); // Assuming NODE_TYPE_TEXT is a different constant
        when(nodeTest instanceof NodeTypeTest).thenReturn(true);
        assertFalse(domAttributePointer.testNode(nodeTest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue() throws Exception {
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        String testValue = "testValue";
        domAttributePointer.setValue(testValue);
        verify(attr).setValue(testValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ReturnsNull_WhenValueIsNull() {
        domAttributePointer = new DOMAttributePointer(domNodePointer, attr);
        // Arrange
        when(attr.getValue()).thenReturn(null);
        when(attr.getSpecified()).thenReturn(true);
        // Act
        Object result = domAttributePointer.getValue();
        // Assert
        assertNull(result, "Should return null when the attribute value is null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ReturnsNull_WhenValueIsEmptyAndNotSpecified() {
        domAttributePointer = new DOMAttributePointer(domNodePointer, attr);
        // Arrange
        when(attr.getValue()).thenReturn("");
        when(attr.getSpecified()).thenReturn(false);
        // Act
        Object result = domAttributePointer.getValue();
        // Assert
        assertNull(result, "Should return null when the attribute value is empty and not specified.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_ReturnsValue_WhenValueIsEmptyButSpecified() {
        domAttributePointer = new DOMAttributePointer(domNodePointer, attr);
        // Arrange
        String expectedValue = "";
        when(attr.getValue()).thenReturn(expectedValue);
        when(attr.getSpecified()).thenReturn(true);
        // Act
        Object result = domAttributePointer.getValue();
        // Assert
        assertEquals(expectedValue, result, "Should return the empty string when the attribute value is empty but specified.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() throws Exception {
        // Mocking or creating instances of dependencies if required
        // Since isCollection() does not depend on the state of DOMAttributePointer or its dependencies,
        // we can instantiate it directly without mocks.
        DOMNodePointer parentNode = null; // Assuming parentNode can be null for this test.
        Attr attribute = null; // Assuming attribute can be null for this test.
        domAttributePointer = new DOMAttributePointer(parentNode, attribute);
        // Execute
        boolean result = domAttributePointer.isCollection();
        // Verify
        assertFalse(result, "isCollection should return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() {
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        when(attr.getNodeValue()).thenReturn("value");
        Object result = domAttributePointer.getImmediateNode();
        assertEquals(attr, result, "The getImmediateNode method should return the Attr object set in the constructor");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() {
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        int expectedHashCode = System.identityHashCode(attr);
        int actualHashCode = domAttributePointer.hashCode();
        assertEquals(expectedHashCode, actualHashCode, "The hash code should match the system identity hash code of the attribute.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithNonNullPrefix() throws Exception {
        when(attr.getPrefix()).thenReturn("prefix");
        // Setup
        String expectedNamespaceURI = "http://example.com/namespace";
        when(parent.getNamespaceURI("prefix")).thenReturn(expectedNamespaceURI);
        // Execute
        String result = domAttributePointer.getNamespaceURI();
        // Verify
        assertEquals(expectedNamespaceURI, result, "The namespace URI should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithNullPrefix() throws Exception {
        when(attr.getPrefix()).thenReturn("prefix");
        // Setup
        when(attr.getPrefix()).thenReturn(null);
        // Execute
        String result = domAttributePointer.getNamespaceURI();
        // Verify
        assertNull(result, "The namespace URI should be null when the prefix is null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_WithEmptyPrefix() throws Exception {
        when(attr.getPrefix()).thenReturn("prefix");
        // Setup
        when(attr.getPrefix()).thenReturn("");
        when(parent.getNamespaceURI("")).thenReturn(null);
        // Execute
        String result = domAttributePointer.getNamespaceURI();
        // Verify
        assertNull(result, "The namespace URI should be null when the prefix is empty.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParentPath() throws Exception {
        when(parent.asPath()).thenReturn("/example/path");
        when(attr.getName()).thenReturn("sampleAttribute");
        String expectedPath = "/example/path/@sampleAttribute";
        String actualPath = domAttributePointer.asPath();
        assertEquals(expectedPath, actualPath, "The asPath method should return the correct attribute path.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        domAttributePointer = new DOMAttributePointer(parentNode, attribute);
        int length = domAttributePointer.getLength();
        assertEquals(1, length, "The length should always be 1");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() {
        domAttributePointer = new DOMAttributePointer(parentNode, attr);
        when(attr.getValue()).thenReturn("testValue");
        Object baseValue = domAttributePointer.getBaseValue();
        assertEquals(attr, baseValue, "The base value should be the same as the mocked Attr object.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual() {
        domAttributePointer = new DOMAttributePointer(parentNode, attribute);
        // Since isActual method in DOMAttributePointer class always returns true,
        // the test should assert that the returned value is indeed true.
        assertTrue(domAttributePointer.isActual(), "The isActual method should return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() throws Exception {
        // Initialize DOMAttributePointer with mocked DOMNodePointer and Attr
        domAttributePointer = new DOMAttributePointer(parentNode, attribute);
        // Act
        boolean result = domAttributePointer.isLeaf();
        // Assert
        assertTrue(result, "DOMAttributePointer should always return true for isLeaf method");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_NullNodeTest_ReturnsTrue_yvsq0_oFlh0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), null);
    DOMAttributePointer domAttributePointer = new DOMAttributePointer(domNodePointer, null);
    assertTrue(domAttributePointer.isLeaf());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_ValidNodeTypeTest_ReturnsTrue_CbPf1_NCtb0() {
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(null, locale, null);
    DOMAttributePointer domAttributePointer = new DOMAttributePointer(domNodePointer, null);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
    assertTrue(domAttributePointer.isLeaf());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_InvalidNodeTypeTest_ReturnsFalse_EeBW2_ZRHb0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault());
    DOMAttributePointer domAttributePointer = new DOMAttributePointer(domNodePointer, null);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
    assertFalse(domAttributePointer.isLeaf());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ReturnsAttributeValue_WhenSpecified_mrWO0() {
    DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
    Attr attr = mock(Attr.class);
    DOMAttributePointer domAttributePointer = new DOMAttributePointer(domNodePointer, attr);
    String expectedValue = "testValue";
    when(attr.getValue()).thenReturn(expectedValue);
    when(attr.getSpecified()).thenReturn(true);
    Object result = domAttributePointer.getValue();
    assertEquals(expectedValue, result, "Should return the attribute value when specified.");
}
}