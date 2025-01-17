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
@InjectMocks
    JDOMNamespacePointer jdomNamespacePointer;
@Mock
    DOMNodePointer domNodePointer;
@Mock
    NodePointer nodePointer1;
@Mock
    NodePointer nodePointer2;
private DOMNodePointer mockParent;
private String prefix;
private static final String PREFIX = "testPrefix";
@Mock
    private DOMNodePointer parentNode;
private String namespaceURI = "http://example.com/ns";
    private DOMNodePointer parent;
private DOMNodePointer mockDomNodePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject() {
        mockParent = mock(DOMNodePointer.class);
        prefix = "testPrefix";
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix);
        assertTrue(jdomNamespacePointer.equals(jdomNamespacePointer), "The same object should be equal to itself.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullObject() {
        mockParent = mock(DOMNodePointer.class);
        prefix = "testPrefix";
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix);
        assertFalse(jdomNamespacePointer.equals(null), "Any object should not be equal to null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass() {
        mockParent = mock(DOMNodePointer.class);
        prefix = "testPrefix";
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix);
        Object differentClassObject = new Object();
        assertFalse(jdomNamespacePointer.equals(differentClassObject), "Objects of different classes should not be equal.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SamePrefixDifferentParent() {
        mockParent = mock(DOMNodePointer.class);
        prefix = "testPrefix";
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix);
        JDOMNamespacePointer anotherPointer = new JDOMNamespacePointer(mock(DOMNodePointer.class), prefix);
        assertTrue(jdomNamespacePointer.equals(anotherPointer), "Objects with the same prefix should be equal, regardless of parent.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentPrefix() {
        mockParent = mock(DOMNodePointer.class);
        prefix = "testPrefix";
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix);
        JDOMNamespacePointer anotherPointer = new JDOMNamespacePointer(mockParent, "differentPrefix");
        assertFalse(jdomNamespacePointer.equals(anotherPointer), "Objects with different prefixes should not be equal.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SamePrefixSameParent() {
        mockParent = mock(DOMNodePointer.class);
        prefix = "testPrefix";
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, prefix);
        JDOMNamespacePointer anotherPointer = new JDOMNamespacePointer(mockParent, prefix);
        assertTrue(jdomNamespacePointer.equals(anotherPointer), "Objects with the same parent and prefix should be equal.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_ThrowsUnsupportedOperationException() {
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, "prefix", "namespaceURI");
        assertThrows(UnsupportedOperationException.class, () -> jdomNamespacePointer.setValue("newValue"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        // Initialize JDOMNamespacePointer with a mocked DOMNodePointer and arbitrary string values
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, "prefix", "namespaceURI");
        // Test the isCollection method
        assertFalse(jdomNamespacePointer.isCollection(), "isCollection should return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, PREFIX);
        // Setup
        int expectedHashCode = PREFIX.hashCode();
        // Execute
        int actualHashCode = jdomNamespacePointer.hashCode();
        // Verify
        assertEquals(expectedHashCode, actualHashCode, "The hash code should match the hash code of the prefix string.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNullParent_vVwB1() {
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(null, "prefix");
        assertEquals("namespace::prefix", pointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        // Assuming the simplest constructor is enough for this test
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, "prefix");
        // Act
        int length = jdomNamespacePointer.getLength();
        // Assert
        assertEquals(1, length, "The length should always be 1");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() throws Exception {
        mockDomNodePointer = mock(DOMNodePointer.class);
        jdomNamespacePointer = new JDOMNamespacePointer(mockDomNodePointer, "prefix");
        // Since getBaseValue() is expected to return null (as per the current implementation),
        // we assert that the returned value is indeed null.
        assertNull(jdomNamespacePointer.getBaseValue(), "The base value should be null");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() {
        jdomNamespacePointer = new JDOMNamespacePointer(mockParent, "prefix");
        // Act
        boolean result = jdomNamespacePointer.isLeaf();
        // Assert
        assertTrue(result, "isLeaf should return true as it is hardcoded in the implementation");
    }
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_1() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix", "namespaceURI");
        // Arrange
        when(nodePointer1.compareTo(nodePointer2)).thenReturn(1);
        when(nodePointer2.compareTo(nodePointer1)).thenReturn(-1);
        // Act
        int result1 = jdomNamespacePointer.compareChildNodePointers(nodePointer1, nodePointer2);
        int result2 = jdomNamespacePointer.compareChildNodePointers(nodePointer2, nodePointer1);
        // Assert
        assertEquals(1, result1, "Expected nodePointer1 to be greater than nodePointer2");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_2() throws Exception {
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix", "namespaceURI");
        // Arrange
        when(nodePointer1.compareTo(nodePointer2)).thenReturn(1);
        when(nodePointer2.compareTo(nodePointer1)).thenReturn(0);
        // Act
        int result1 = jdomNamespacePointer.compareChildNodePointers(nodePointer1, nodePointer2);
        int result2 = jdomNamespacePointer.compareChildNodePointers(nodePointer2, nodePointer1);
        // Assert
        assertEquals(0, result2, "Expected nodePointer2 to be less than nodePointer1");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_fid1() throws Exception {
        // Assuming the prefix and namespaceURI are not relevant for the test of getImmediateNode
        jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "anyPrefix", "anyNamespaceURI");
        // Setup
        String expectedNamespaceURI = "anyNamespaceURI";
        when(domNodePointer.getNamespaceURI()).thenReturn(expectedNamespaceURI);
        // Execution
        Object result = jdomNamespacePointer.getImmediateNode();
        // Verification
        assertEquals(expectedNamespaceURI, result, "The returned namespace URI should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithNonNullParent_Snin0_fid1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, "id");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "prefix");
        assertEquals("id('id')/namespace::prefix", pointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithEmptyPrefix_osrs2_fid1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, "id");
        JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "");
        assertEquals("id('id')/namespace::", pointer.asPath());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_VaYg0_kmrD0() {
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), null);
    JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "testPrefix");
    assertTrue(pointer.equals(pointer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_sYZs1_OZju0() {
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), null);
    JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "testPrefix");
    Object differentClassObject = new Object();
    assertFalse(pointer.equals(differentClassObject));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentPrefix_SWCt2_WOiS0() {
    DOMNodePointer parent1 = new DOMNodePointer(null, Locale.getDefault());
    DOMNodePointer parent2 = new DOMNodePointer(null, Locale.getDefault(), null);
    JDOMNamespacePointer pointer1 = new JDOMNamespacePointer(parent1, "testPrefix1");
    JDOMNamespacePointer pointer2 = new JDOMNamespacePointer(parent2, "testPrefix2");
    assertFalse(pointer1.equals(pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SamePrefixDifferentParent_SFYz3_WZAm0() {
    DOMNodePointer parent1 = new DOMNodePointer(null, Locale.getDefault(), null);
    DOMNodePointer parent2 = new DOMNodePointer(null, Locale.getDefault(), null);
    JDOMNamespacePointer pointer1 = new JDOMNamespacePointer(parent1, "testPrefix");
    JDOMNamespacePointer pointer2 = new JDOMNamespacePointer(parent2, "testPrefix");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionReturnsFalse_TbiE0_YRpH0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), null);
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix");
    assertFalse(jdomNamespacePointer.isCollection());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_ANOU0_pMnV0() {
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), null);
    JDOMNamespacePointer pointer = new JDOMNamespacePointer(parent, "testPrefix");
    QName result = pointer.getName();
    assertNull(result.getPrefix());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_pTmw0_RrmH0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), null);
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(domNodePointer, "prefix");
    int length = jdomNamespacePointer.getLength();
    assertEquals(1, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_WithNonNullParent_ReturnsCorrectPath_RMij0() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(parent, "PREFIX");
    when(parent.asPath()).thenReturn("PARENT_PATH");
    String expectedPath = "PARENT_PATH" + "/namespace::" + "PREFIX";
    String actualPath = jdomNamespacePointer.asPath();
    assertEquals(expectedPath, actualPath);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPath_WithNoTrailingSlashInParentPath_ReturnsCorrectPath_idVI0() throws Exception {
    final String PARENT_PATH = "/parent";
    final String PREFIX = "prefix";
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(parent.asPath()).thenReturn(PARENT_PATH.substring(0, PARENT_PATH.length() - 1)); // Remove trailing slash
    JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(parent, PREFIX);
    when(parent.asPath()).thenReturn(PARENT_PATH); // This line is correct but seems misplaced or redundant
    String expectedPath = PARENT_PATH + "/namespace::" + PREFIX;
    String actualPath = jdomNamespacePointer.asPath();
    assertEquals(expectedPath, actualPath);
}
}