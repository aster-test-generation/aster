/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.w3c.dom.Attr;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributePointer_Test_Failing {
@Mock
    private DOMNodePointer parent;
@Mock
    private Attr attr;
private DOMAttributePointer domAttributePointer;
private DOMAttributePointer anotherDomAttributePointer;
@Mock
    private NodeTest nodeTest;
@Mock
    private DOMNodePointer domNodePointer;
private DOMAttributePointer domattributepointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_EmptyValue() {
        domAttributePointer = new DOMAttributePointer(null, attr);
        when(attr.getValue()).thenReturn("");
        assertEquals("", domAttributePointer.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        domAttributePointer = new DOMAttributePointer(parent, attr);
        // Arrange
        when(domAttributePointer.isCollection()).thenReturn(true);
        // Act
        boolean result = domAttributePointer.isCollection();
        // Assert
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() {
        domAttributePointer = new DOMAttributePointer(domNodePointer, attr);
        // Arrange
        String expectedPrefix = "prefix";
        String expectedLocalName = "localName";
        when(domNodePointer.getPrefix(attr)).thenReturn(expectedPrefix);
        when(domNodePointer.getLocalName(attr)).thenReturn(expectedLocalName);
        // Act
        QName actual = domAttributePointer.getName();
        // Assert
        assertEquals(new QName(expectedPrefix, expectedLocalName), actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception{
        attr = mock(Attr.class);
        parent = mock(DOMNodePointer.class);
        domAttributePointer = new DOMAttributePointer(parent, attr);
        // Arrange
        String prefix = "prefix";
        String namespaceURI = "namespaceURI";
        when(parent.getPrefix(attr)).thenReturn(prefix);
        when(parent.getNamespaceURI(prefix)).thenReturn(namespaceURI);
        // Act
        String result = domAttributePointer.getNamespaceURI();
        // Assert
        assertEquals(namespaceURI, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathNullParent_YpiK0() {
    DOMAttributePointer pointer = new DOMAttributePointer(null, null);
    String result = pointer.asPath();
    Assertions.assertEquals("@", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathEmptyParent_JQxx1() {
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    DOMAttributePointer pointer = new DOMAttributePointer(parent, null);
    String result = pointer.asPath();
    Assertions.assertEquals("@", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathNonEmptyParent_eGIf2() {
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    parent.asPath();
    DOMAttributePointer pointer = new DOMAttributePointer(parent, null);
    String result = pointer.asPath();
    Assertions.assertEquals("/@", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_gsER0() {
    DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, attr);
    String value = "testValue";
    String expectedValue = "testValue";
    domAttributePointer.setValue(value);
    assertEquals(expectedValue, attr.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_gsER0_fid1() {
    DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, attr);
    String value = "testValue";
    String expectedValue = "testValue";
    domAttributePointer.setValue(value);
    assertNull(expectedValue);
}
}