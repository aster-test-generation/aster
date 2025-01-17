/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
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
public class Aster_JDOMAttributePointer_Test_Passing {
@Mock
    private DOMNodePointer domNodePointer;
@InjectMocks
    private JDOMAttributePointer jdomAttributePointer;
@Mock
    private NodePointer nodePointer1;
@Mock
    private NodePointer nodePointer2;
private Attribute attr;
@Mock
    private Attribute attribute;
@Mock
    private DOMNodePointer parent;
@Mock
    private DOMNodePointer domNodePointerMock;
@Mock
    private Attribute attributeMock;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        assertTrue(jdomAttributePointer.equals(jdomAttributePointer), "Object should be equal to itself.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        assertFalse(jdomAttributePointer.equals(null), "Object should not be equal to null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        Object differentClassObject = new Object();
        assertFalse(jdomAttributePointer.equals(differentClassObject), "Object should not be equal to an object of a different class.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameAttributes() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        JDOMAttributePointer anotherPointerWithSameAttribute = new JDOMAttributePointer(null, attr);
        assertTrue(jdomAttributePointer.equals(anotherPointerWithSameAttribute), "Objects with the same attribute should be equal.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentAttributes() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        Attribute anotherAttr = mock(Attribute.class);
        JDOMAttributePointer anotherPointerWithDifferentAttribute = new JDOMAttributePointer(null, anotherAttr);
        assertFalse(jdomAttributePointer.equals(anotherPointerWithDifferentAttribute), "Objects with different attributes should not be equal.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() throws Exception {
        // Initialize JDOMAttributePointer with mocked DOMNodePointer and Attribute
        jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attribute);
        // Act
        boolean result = jdomAttributePointer.isCollection();
        // Assert
        assertFalse(result, "isCollection should return false");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() {
        attr = mock(Attribute.class);
        domNodePointer = mock(DOMNodePointer.class);
        jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attr);
        assertEquals(attr, jdomAttributePointer.getImmediateNode(), "The getImmediateNode method should return the correct attribute object.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParent() throws Exception {
        when(parent.asPath()).thenReturn("/parent/path");
        when(attribute.getName()).thenReturn("attributeName");
        jdomAttributePointer = new JDOMAttributePointer(parent, attribute);
        String expectedPath = "/parent/path/@attributeName";
        String actualPath = jdomAttributePointer.asPath();
        assertEquals(expectedPath, actualPath, "The asPath method should return the correct attribute path when a parent is present.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithoutParent() throws Exception {
        when(parent.asPath()).thenReturn("/parent/path");
        when(attribute.getName()).thenReturn("attributeName");
        jdomAttributePointer = new JDOMAttributePointer(parent, attribute);
        when(parent.asPath()).thenReturn(""); // Simulate no parent path
        String expectedPath = "/@attributeName";
        String actualPath = jdomAttributePointer.asPath();
        assertEquals(expectedPath, actualPath, "The asPath method should handle cases where the parent path is empty.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ParentPathWithoutTrailingSlash() throws Exception {
        when(parent.asPath()).thenReturn("/parent/path");
        when(attribute.getName()).thenReturn("attributeName");
        jdomAttributePointer = new JDOMAttributePointer(parent, attribute);
        when(parent.asPath()).thenReturn("/parent/path"); // Ensure there's no trailing slash
        String expectedPath = "/parent/path/@attributeName";
        String actualPath = jdomAttributePointer.asPath();
        assertEquals(expectedPath, actualPath, "The asPath method should correctly append a slash if the parent path does not end with one.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ParentPathWithTrailingSlash() throws Exception {
        when(parent.asPath()).thenReturn("/parent/path");
        when(attribute.getName()).thenReturn("attributeName");
        jdomAttributePointer = new JDOMAttributePointer(parent, attribute);
        when(parent.asPath()).thenReturn("/parent/path/"); // Ensure there's a trailing slash
        String expectedPath = "/parent/path/@attributeName";
        String actualPath = jdomAttributePointer.asPath();
        assertEquals(expectedPath, actualPath, "The asPath method should not append an extra slash if the parent path already ends with one.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        // Initialization of mocks is handled by Mockito
        // Since getLength() is hardcoded to return 1, we expect 1
        int length = jdomAttributePointer.getLength();
        assertEquals(1, length, "The length should always be 1.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual() {
        // Mock the dependencies needed for JDOMAttributePointer
        DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
        Attribute attribute = mock(Attribute.class);
        // Initialize JDOMAttributePointer with mocked dependencies
        jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attribute);
        // Since isActual method always returns true, assert that it returns true
        assertTrue(jdomAttributePointer.isActual(), "isActual should return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithNullParent_ReturnsOnlyAttribute_UHeI1() {
        JDOMAttributePointer pointer = new JDOMAttributePointer(null, new Attribute("type", "button"));
        String result = pointer.asPath();
        assertEquals("@type", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() throws Exception {
        // Initialization of JDOMAttributePointer with mocks is handled by Mockito's @InjectMocks
        // Act
        boolean result = jdomAttributePointer.isLeaf();
        // Assert
        assertTrue(result, "isLeaf should return true for JDOMAttributePointer");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_xkYK0_VunR0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), null);
    Attribute attribute = new Attribute("name", "value");
    JDOMAttributePointer pointer = new JDOMAttributePointer(domNodePointer, attribute);
    assertTrue(pointer.equals(pointer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_rtuS1_uMqI0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), (String) null);
    Attribute attribute = new Attribute("name", "value");
    JDOMAttributePointer pointer = new JDOMAttributePointer(domNodePointer, attribute);
    Object differentClassObject = new Object();
    assertFalse(pointer.equals(differentClassObject));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_aMKq2_iXJo0() {
    DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault(), null);
    Attribute attribute = new Attribute("name", "value");
    JDOMAttributePointer pointer = new JDOMAttributePointer(domNodePointer, attribute);
    assertFalse(pointer.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentAttribute_TpbQ3_uwrH0() {
    DOMNodePointer domNodePointer1 = new DOMNodePointer(null, Locale.getDefault());
    Attribute attribute1 = new Attribute("name", "value1");
    JDOMAttributePointer pointer1 = new JDOMAttributePointer(domNodePointer1, attribute1);
    DOMNodePointer domNodePointer2 = new DOMNodePointer(null, Locale.getDefault());
    Attribute attribute2 = new Attribute("name", "value2");
    JDOMAttributePointer pointer2 = new JDOMAttributePointer(domNodePointer2, attribute2);
    assertFalse(pointer1.equals(pointer2));
}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_fid2() throws Exception {
        // Initialization of JDOMAttributePointer with a mocked DOMNodePointer
        jdomAttributePointer = new JDOMAttributePointer(domNodePointer, null);
        // Arrange
        when(nodePointer1.compareTo(nodePointer2)).thenReturn(1);
        // Act
        int result = jdomAttributePointer.compareChildNodePointers(nodePointer1, nodePointer2);
        // Assert
        assertEquals(1, result, "The compareChildNodePointers method should return0 when nodePointer1 is greater than nodePointer2");
        // Verify that compareTo method was called on nodePointer1 with nodePointer2 as the argument
        verify(nodePointer1).compareTo(nodePointer2);
    }
}