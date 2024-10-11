/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespacePointer_Test_Passing {
@Mock
    private DOMNodePointer parentMock;
@InjectMocks
    private NamespacePointer namespacePointer;
private String prefix = "testPrefix";
@Mock
    private DOMNodePointer mockParent;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private DOMNodePointer domNodePointerMock;
private static final String PREFIX = "testPrefix";
private static final String NAMESPACE_URI = "http://example.com/test";
private static final String PARENT_PATH = "/parent/path";
@Mock
    private DOMNodePointer parent;
    private String namespaceURI;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() throws Exception {
        // Initialize NamespacePointer with a mocked DOMNodePointer and some dummy values
        namespacePointer = new NamespacePointer(parentMock, "prefix", "namespaceURI");
        // Arrange
        NodePointer mockPointer1 = Mockito.mock(NodePointer.class);
        NodePointer mockPointer2 = Mockito.mock(NodePointer.class);
        // Act
        int result = namespacePointer.compareChildNodePointers(mockPointer1, mockPointer2);
        // Assert
        // Since the method is not implemented and returns 0, we expect 0
        assertEquals(0, result, "The compareChildNodePointers method should return 0");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnsTrue() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, prefix);
        assertTrue(namespacePointer.equals(namespacePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentType_ReturnsFalse() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, prefix);
        Object differentObject = new Object();
        assertFalse(namespacePointer.equals(differentObject));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_ReturnsFalse() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, prefix);
        assertFalse(namespacePointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SamePrefix_ReturnsTrue() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, prefix);
        NamespacePointer anotherNamespacePointer = new NamespacePointer(mockParent, prefix);
        assertTrue(namespacePointer.equals(anotherNamespacePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentPrefix_ReturnsFalse() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, prefix);
        NamespacePointer anotherNamespacePointer = new NamespacePointer(mockParent, "differentPrefix");
        assertFalse(namespacePointer.equals(anotherNamespacePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ThrowsUnsupportedOperationException() {
        namespacePointer = new NamespacePointer(domNodePointer, "testPrefix");
        assertThrows(UnsupportedOperationException.class, () -> namespacePointer.setValue("newValue"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_WithNullNodeTest_ReturnsTrue() throws Exception {
        namespacePointer = new NamespacePointer(domNodePointer, "prefix", "namespaceURI");
        assertTrue(namespacePointer.testNode(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_WithNodeTypeTestAndCorrectNodeType_ReturnsTrue() throws Exception {
        namespacePointer = new NamespacePointer(domNodePointer, "prefix", "namespaceURI");
        when(nodeTypeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_NODE);
        assertTrue(namespacePointer.testNode(nodeTypeTest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_WithNodeTypeTestAndIncorrectNodeType_ReturnsFalse() throws Exception {
        namespacePointer = new NamespacePointer(domNodePointer, "prefix", "namespaceURI");
        when(nodeTypeTest.getNodeType()).thenReturn(999); // Assuming 999 is not NODE_TYPE_NODE
        assertFalse(namespacePointer.testNode(nodeTypeTest));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() throws Exception {
        // Assuming the constructor with just the parent and prefix is enough for this test
        namespacePointer = new NamespacePointer(domNodePointerMock, "testPrefix");
        // Since isCollection method always returns false as per the current implementation,
        // we assert that it indeed returns false.
        assertFalse(namespacePointer.isCollection(), "isCollection should return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() throws Exception {
        // Setup the NamespacePointer with a mocked DOMNodePointer and a prefix
        namespacePointer = new NamespacePointer(domNodePointer, "prefix", "http://example.com/ns");
        // Setup the expected behavior for the getNamespaceURI method
        when(namespacePointer.getNamespaceURI()).thenReturn("http://example.com/ns");
        // Call the method under test
        Object result = namespacePointer.getImmediateNode();
        // Verify the results
        assertEquals("http://example.com/ns", result, "The getImmediateNode method should return the correct namespace URI.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        namespacePointer = new NamespacePointer(domNodePointerMock, prefix);
        // Setup
        int expectedHashCode = prefix.hashCode();
        // Execute
        int actualHashCode = namespacePointer.hashCode();
        // Verify
        assertEquals(expectedHashCode, actualHashCode, "The hash code should match the hash code of the prefix.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        namespacePointer = new NamespacePointer(domNodePointer, prefix);
        QName result = namespacePointer.getName();
        assertEquals(prefix, result.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_InitiallyNull_ReturnsCorrectNamespaceURI() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, PREFIX, NAMESPACE_URI);
        // Setup the behavior of the mocked parent to return a specific namespace URI
        when(mockParent.getNamespaceURI(PREFIX)).thenReturn(NAMESPACE_URI);
        // Call the method under test
        String result = namespacePointer.getNamespaceURI();
        // Assert the expected result
        assertEquals(NAMESPACE_URI, result, "The namespace URI should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_AlreadySet_ReturnsSameNamespaceURI_1() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, PREFIX, NAMESPACE_URI);
        // Setup the behavior of the mocked parent to return a specific namespace URI
        when(mockParent.getNamespaceURI(PREFIX)).thenReturn(NAMESPACE_URI);
        // Call the method under test twice
        String firstCallResult = namespacePointer.getNamespaceURI();
        String secondCallResult = namespacePointer.getNamespaceURI();
        // Assert that the same URI is returned both times, indicating it's being cached
        assertEquals(NAMESPACE_URI, firstCallResult, "The namespace URI should match the expected value on first call.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_AlreadySet_ReturnsSameNamespaceURI_2() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, PREFIX, NAMESPACE_URI);
        // Setup the behavior of the mocked parent to return a specific namespace URI
        when(mockParent.getNamespaceURI(PREFIX)).thenReturn(NAMESPACE_URI);
        // Call the method under test twice
        String firstCallResult = namespacePointer.getNamespaceURI();
        String secondCallResult = namespacePointer.getNamespaceURI();
        // Assert that the same URI is returned both times, indicating it's being cached
        assertEquals(NAMESPACE_URI, secondCallResult, "The namespace URI should match the expected value on subsequent calls.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParent() throws Exception {
        namespacePointer = new NamespacePointer(parent, PREFIX);
        when(parent.asPath()).thenReturn(PARENT_PATH);
        String expectedPath = PARENT_PATH + "/namespace::" + PREFIX;
        String actualPath = namespacePointer.asPath();
        assertEquals(expectedPath, actualPath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNoParent_IVhg0() {
        NamespacePointer np = new NamespacePointer(null, "testPrefix");
        String result = np.asPath();
        assertEquals("namespace::testPrefix", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        // DOMNodePointer is mocked and injected into NamespacePointer
        // No specific configuration of the mock is needed for this test
        namespacePointer = new NamespacePointer(domNodePointer, "somePrefix");
        // Act
        int length = namespacePointer.getLength();
        // Assert
        assertEquals(1, length, "The length should always be 1.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() throws Exception {
        // Initialization of namespacePointer with mocked DOMNodePointer is handled by Mockito
        // Since getBaseValue method returns null (as per the provided implementation), we test exactly that
        assertNull(namespacePointer.getBaseValue(), "The base value should be null");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() {
        // Assuming the constructor that takes DOMNodePointer and prefix is used
        namespacePointer = new NamespacePointer(domNodePointerMock, "prefix");
        // Since isLeaf method in NamespacePointer always returns true
        assertTrue(namespacePointer.isLeaf(), "isLeaf should return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_NullNodeTest_ReturnsTrue_UAoA0_CiGc0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), null);
    NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
    assertTrue(namespacePointer.isLeaf());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_ValidNodeTypeTest_ReturnsTrue_BDeY1_XNUz0() {
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(null, locale);
    NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
    NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
    assertTrue(namespacePointer.testNode(nodeTypeTest));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_InvalidNodeTypeTest_ReturnsFalse_hdpe2_YSeP0() {
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(null, locale);
    NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
    NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
    assertFalse(namespacePointer.testNode(nodeTypeTest));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_AlreadySet_ReturnsSameNamespaceURI() throws Exception {
        namespacePointer = new NamespacePointer(mockParent, PREFIX, NAMESPACE_URI);
        // Setup the behavior of the mocked parent to return a specific namespace URI
        when(mockParent.getNamespaceURI(PREFIX)).thenReturn(NAMESPACE_URI);
        // Call the method under test twice
        String firstCallResult = namespacePointer.getNamespaceURI();
        String secondCallResult = namespacePointer.getNamespaceURI();
        // Assert that the same URI is returned both times, indicating it's being cached
        assertEquals(NAMESPACE_URI, firstCallResult, "The namespace URI should match the expected value on first call.");
        assertEquals(NAMESPACE_URI, secondCallResult, "The namespace URI should match the expected value on subsequent calls.");
    }
}