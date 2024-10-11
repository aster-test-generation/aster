/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.TypeUtils;
import org.jdom.Attribute;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMAttributePointer_Test_Failing {
    @Mock
    private QName qname;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private NodePointer nodePointer;
    private Attribute attr;
    private JDOMAttributePointer jdomattributepointer;
    private JDOMAttributePointer jdomattributepointer2;
    @Mock
    private TypeUtils typeUtils;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private Attribute attribute;
    @Mock
    private DOMNodePointer jdomNodePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetValue() throws Exception {
        jdomattributepointer = new JDOMAttributePointer(null, attr);
        // Arrange
        String value = "testValue";
        String expectedValue = "testValue";
        // Act
        jdomattributepointer.setValue(value);
        // Assert
        verify(typeUtils).convert(value, String.class);
        verify(attr).setValue(expectedValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue() throws Exception {
        MockitoAnnotations.initMocks(this);
        jdomattributepointer = new JDOMAttributePointer(parent, attr);
        // Arrange
        String expectedValue = "expectedValue";
        Mockito.when(attr.getValue()).thenReturn(expectedValue);
        // Act
        Object actualValue = jdomattributepointer.getValue();
        // Assert
        Mockito.verify(attr, Mockito.times(1)).getValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() {
        jdomattributepointer = new JDOMAttributePointer(null, attr);
        // Arrange
        when(attr.hashCode()).thenReturn(123);
        // Act
        int result = jdomattributepointer.hashCode();
        // Assert
        assertEquals(123, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI_1() {
        jdomattributepointer = new JDOMAttributePointer(null, attr);
        // Test case 1: attr.getNamespaceURI() returns null
        when(attr.getNamespaceURI()).thenReturn(null);
        // Test case 2: attr.getNamespaceURI() returns empty string
        when(attr.getNamespaceURI()).thenReturn("");
        // Test case 3: attr.getNamespaceURI() returns non-empty string
        when(attr.getNamespaceURI()).thenReturn("http://example.com");
        assertEquals(null, jdomattributepointer.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI_3() {
        jdomattributepointer = new JDOMAttributePointer(null, attr);
        // Test case 1: attr.getNamespaceURI() returns null
        when(attr.getNamespaceURI()).thenReturn(null);
        // Test case 2: attr.getNamespaceURI() returns empty string
        when(attr.getNamespaceURI()).thenReturn("");
        // Test case 3: attr.getNamespaceURI() returns non-empty string
        when(attr.getNamespaceURI()).thenReturn("http://example.com");
        assertEquals("http://example.com", jdomattributepointer.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_EmptyParent_MRlN1() {
        JDOMAttributePointer pointer = new JDOMAttributePointer(new DOMNodePointer(null, null, null), null);
        String result = pointer.asPath();
        Assertions.assertEquals("@", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_FoTt0_2() throws Exception {
        Attribute attr = Mockito.mock(Attribute.class);
        JDOMAttributePointer jdomattributepointer = new JDOMAttributePointer(Mockito.mock(DOMNodePointer.class), attr);
        JDOMAttributePointer jdomattributepointer2 = new JDOMAttributePointer(Mockito.mock(DOMNodePointer.class), Mockito.mock(Attribute.class));
        Attribute jattr = Mockito.mock(Attribute.class);
        assertEquals(jdomattributepointer, jdomattributepointer2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() {
        jdomattributepointer = new JDOMAttributePointer(null, attr);
        // Test case 1: attr.getNamespaceURI() returns null
        when(attr.getNamespaceURI()).thenReturn(null);
        assertEquals(null, jdomattributepointer.getNamespaceURI());
        // Test case 2: attr.getNamespaceURI() returns empty string
        when(attr.getNamespaceURI()).thenReturn("");
        assertEquals(null, jdomattributepointer.getNamespaceURI());
        // Test case 3: attr.getNamespaceURI() returns non-empty string
        when(attr.getNamespaceURI()).thenReturn("http://example.com");
        assertEquals("http://example.com", jdomattributepointer.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NullParent_QFtn0_fid1() {
        JDOMAttributePointer pointer = new JDOMAttributePointer(null, null);
        String result = pointer.asPath();
        Assertions.assertEquals("@", result);
    }
}