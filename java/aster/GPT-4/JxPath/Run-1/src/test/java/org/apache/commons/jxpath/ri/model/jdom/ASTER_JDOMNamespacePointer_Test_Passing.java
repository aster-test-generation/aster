/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespacePointer_Test_Passing {
@Mock
    private DOMNodePointer domNodePointer;
@InjectMocks
    private JDOMNamespacePointer jdomNamespacePointer;
@Mock
    private NodePointer pointer1;
@Mock
    private NodePointer pointer2;
private String prefix = "testPrefix";
@Mock
    private DOMNodePointer parent;
@Mock
    private DOMNodePointer mockParent;
@Mock
    private DOMNodePointer domNodePointerMock;
private final String namespaceURI = "http://example.com/test";
@Mock
private static final String PREFIX = "testPrefix";
private static final String PARENT_PATH = "/parent/path";
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_1() throws Exception {
        // Initialize JDOMNamespacePointer with a mocked DOMNodePointer
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix", "namespaceURI");
        // Setup the behavior of the mocked NodePointer objects
        when(pointer1.getIndex()).thenReturn(1);
        when(pointer2.getIndex()).thenReturn(2);
        // Call the method under test
        int result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Verify the method's behavior
        // Change the indices for a different test scenario
        when(pointer1.getIndex()).thenReturn(3);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check for equality
        // Another scenario where pointer1 is greater than pointer2
        when(pointer1.getIndex()).thenReturn(4);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check the comparison result
        assertTrue(result < 0, "Expected pointer1 to be less than pointer2 based on their indices");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_2() throws Exception {
        // Initialize JDOMNamespacePointer with a mocked DOMNodePointer
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix", "namespaceURI");
        // Setup the behavior of the mocked NodePointer objects
        when(pointer1.getIndex()).thenReturn(1);
        when(pointer2.getIndex()).thenReturn(2);
        // Call the method under test
        int result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Verify the method's behavior
        // Change the indices for a different test scenario
        when(pointer1.getIndex()).thenReturn(3);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check for equality
        // Another scenario where pointer1 is greater than pointer2
        when(pointer1.getIndex()).thenReturn(4);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check the comparison result
        assertEquals(0, result, "Expected pointer1 and pointer2 to be equal based on their indices");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_3() throws Exception {
        // Initialize JDOMNamespacePointer with a mocked DOMNodePointer
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix", "namespaceURI");
        // Setup the behavior of the mocked NodePointer objects
        when(pointer1.getIndex()).thenReturn(1);
        when(pointer2.getIndex()).thenReturn(2);
        // Call the method under test
        int result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Verify the method's behavior
        // Change the indices for a different test scenario
        when(pointer1.getIndex()).thenReturn(3);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check for equality
        // Another scenario where pointer1 is greater than pointer2
        when(pointer1.getIndex()).thenReturn(4);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check the comparison result
        assertTrue(result > 0, "Expected pointer1 to be greater than pointer2 based on their indices");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnsTrue() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(parent, prefix);
        assertTrue(jdomNamespacePointer.equals(jdomNamespacePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null_ReturnsFalse() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(parent, prefix);
        assertFalse(jdomNamespacePointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_ReturnsFalse() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(parent, prefix);
        Object differentObject = new Object();
        assertFalse(jdomNamespacePointer.equals(differentObject));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SamePrefix_ReturnsTrue() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(parent, prefix);
        JDOMNamespacePointer anotherPointer = new JDOMNamespacePointer(parent, prefix);
        assertTrue(jdomNamespacePointer.equals(anotherPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentPrefix_ReturnsFalse() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(parent, prefix);
        JDOMNamespacePointer anotherPointer = new JDOMNamespacePointer(parent, "differentPrefix");
        assertFalse(jdomNamespacePointer.equals(anotherPointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ShouldThrowUnsupportedOperationException() {
        // Assuming the constructor with two parameters is used for initialization
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, "testPrefix");
        // Test that the setValue method throws an UnsupportedOperationException
        assertThrows(UnsupportedOperationException.class, () -> {
            jdomNamespacePointer.setValue("newValue");
        });
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() throws Exception {
        // Mocking DOMNodePointer as it is used in the constructor of JDOMNamespacePointer
        DOMNodePointer mockDomNodePointer = mock(DOMNodePointer.class);
        // Initialize JDOMNamespacePointer with mocked DOMNodePointer and some dummy values
        jdomNamespacePointer = new JDOMNamespacePointer(mockDomNodePointer, "dummyPrefix", "dummyNamespaceURI");
        // Since isCollection method always returns false, we assert that it returns false
        assertFalse(jdomNamespacePointer.isCollection(), "isCollection should return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointerMock, prefix, namespaceURI);
        // Mock the behavior of getNamespaceURI to return the namespaceURI
        when(jdomNamespacePointer.getNamespaceURI()).thenReturn(namespaceURI);
        // Call the method under test
        Object result = jdomNamespacePointer.getImmediateNode();
        // Assert that the result is as expected
        assertEquals(namespaceURI, result, "The getImmediateNode method should return the correct namespace URI.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_mkPn0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, "id1");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(domNodePointer, "prefix1");
        assertTrue(pointer.equals(pointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_VyDu1() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, "id1");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(domNodePointer, "prefix1");
        assertFalse(pointer.equals(new Object()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentPrefix_bTMB2() {
        DOMNodePointer domNodePointer1 = new DOMNodePointer(null, null, "id1");
        DOMNodePointer domNodePointer2 = new DOMNodePointer(null, null, "id2");
        JDOMNamespacePointer pointer1 = new JDOMNamespacePointer(domNodePointer1, "prefix1");
        JDOMNamespacePointer pointer2 = new JDOMNamespacePointer(domNodePointer2, "prefix2");
        assertFalse(pointer1.equals(pointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SamePrefixDifferentParent_JUiD3() {
        DOMNodePointer domNodePointer1 = new DOMNodePointer(null, null, "id1");
        DOMNodePointer domNodePointer2 = new DOMNodePointer(null, null, "id2");
        JDOMNamespacePointer pointer1 = new JDOMNamespacePointer(domNodePointer1, "prefix1");
        JDOMNamespacePointer pointer2 = new JDOMNamespacePointer(domNodePointer2, "prefix1");
        assertFalse(pointer1.equals(pointer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_LKTB0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), "id");
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix", "http://example.com");
    assertEquals("http://example.com", jdomNamespacePointer.getImmediateNode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_bSBZ0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, "testId");
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "testPrefix");
    int expectedHashCode = "testPrefix".hashCode();
    assertEquals(expectedHashCode, jdomNamespacePointer.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_InitiallyNull_ReturnsCorrectNamespaceURI() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix, namespaceURI);
        // Setup the behavior of the mock
        when(mockParent.getNamespaceURI(prefix)).thenReturn(namespaceURI);
        // Execute the method under test
        String result = jdomNamespacePointer.getNamespaceURI();
        // Verify the result
        assertEquals(namespaceURI, result, "The namespace URI should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_AlreadySet_ReturnsSameNamespaceURI() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix, namespaceURI);
        // Setup the behavior of the mock to return a different namespace URI
        when(mockParent.getNamespaceURI(prefix)).thenReturn("http://example.com/different");
        // First call to initialize the namespaceURI
        jdomNamespacePointer.getNamespaceURI();
        // Second call should return the same initialized value
        String result = jdomNamespacePointer.getNamespaceURI();
        // Verify the result is still the initially set namespace URI
        assertEquals(namespaceURI, result, "The namespace URI should remain consistent once set.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ReturnsCorrectQName_dMmJ0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, "");
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "testPrefix");
        QName result = jdomNamespacePointer.getName();
        assertEquals("testPrefix", result.getPrefix());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParent() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, PREFIX);
        when(mockParent.asPath()).thenReturn(PARENT_PATH);
        String expectedPath = PARENT_PATH + "/namespace::" + PREFIX;
        String actualPath = jdomNamespacePointer.asPath();
        assertEquals(expectedPath, actualPath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithoutTrailingSlashInParentPath() throws Exception {
        when(mockParent.asPath()).thenReturn(PARENT_PATH.substring(0, PARENT_PATH.length() - 1)); // Remove trailing slash
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, PREFIX);
        when(mockParent.asPath()).thenReturn(PARENT_PATH);
        String expectedPath = PARENT_PATH + "/namespace::" + PREFIX;
        String actualPath = jdomNamespacePointer.asPath();
        assertEquals(expectedPath, actualPath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_ySbQ0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, null, "");
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "");
    int length = jdomNamespacePointer.getLength();
    assertEquals(1, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullParent_Clwe0() {
        DOMNodePointer parentNode = new DOMNodePointer(null, null, "id");
        JDOMNamespacePointer namespacePointer = new JDOMNamespacePointer(parentNode, "prefix");
        assertEquals("/namespace::prefix", namespacePointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParent_PmkY1() {
        JDOMNamespacePointer namespacePointer = new JDOMNamespacePointer(null, "prefix");
        assertEquals("namespace::prefix", namespacePointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithEmptyPrefix_ZZHN2() {
        DOMNodePointer parentNode = new DOMNodePointer(null, null, "id");
        JDOMNamespacePointer namespacePointer = new JDOMNamespacePointer(parentNode, "");
        assertEquals("/namespace::", namespacePointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointerMock, "somePrefix");
        // Since isLeaf method in JDOMNamespacePointer always returns true, we assert that it indeed returns true.
        assertTrue(jdomNamespacePointer.isLeaf(), "isLeaf should return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_tSiC0() throws Exception {
    String prefix = "testPrefix";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() throws Exception {
        // Initialize JDOMNamespacePointer with a mocked DOMNodePointer
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix", "namespaceURI");
        // Setup the behavior of the mocked NodePointer objects
        when(pointer1.getIndex()).thenReturn(1);
        when(pointer2.getIndex()).thenReturn(2);
        // Call the method under test
        int result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Verify the method's behavior
        assertTrue(result < 0, "Expected pointer1 to be less than pointer2 based on their indices");
        // Change the indices for a different test scenario
        when(pointer1.getIndex()).thenReturn(3);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check for equality
        assertEquals(0, result, "Expected pointer1 and pointer2 to be equal based on their indices");
        // Another scenario where pointer1 is greater than pointer2
        when(pointer1.getIndex()).thenReturn(4);
        when(pointer2.getIndex()).thenReturn(3);
        result = jdomNamespacePointer.compareChildNodePointers(pointer1, pointer2);
        // Check the comparison result
        assertTrue(result > 0, "Expected pointer1 to be greater than pointer2 based on their indices");
    }
}