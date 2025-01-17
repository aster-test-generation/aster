/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.jdom.Attribute;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JDOMAttributePointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithString_XiVP0() {
        DOMNodePointer parentNode = mock(DOMNodePointer.class);
        Attribute attribute = mock(Attribute.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(parentNode, attribute);
        String testValue = "Test String";
        pointer.setValue(testValue);
        verify(attribute).setValue(testValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithNonString_NXYG1() {
        DOMNodePointer parentNode = mock(DOMNodePointer.class);
        Attribute attribute = mock(Attribute.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(parentNode, attribute);
        Integer testValue = 123;
        pointer.setValue(testValue);
        verify(attribute).setValue("123"); // Assuming TypeUtils.convert correctly converts Integer to String
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_AttributeHasNoParent_RFRw1() {
        Attribute mockAttribute = mock(Attribute.class);
        when(mockAttribute.getParent()).thenReturn(null);
        DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.getDefault());
        JDOMAttributePointer jdomAttributePointer = new JDOMAttributePointer(domNodePointer, mockAttribute);
        jdomAttributePointer.remove();
        verify(mockAttribute, never()).getParent();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ReturnsNonNullNonEmpty_gKip0() {
        Attribute mockAttribute = mock(Attribute.class);
        when(mockAttribute.getNamespaceURI()).thenReturn("http://example.com");
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(mockParent, mockAttribute);
        String result = pointer.getNamespaceURI();
        assertEquals("http://example.com", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ReturnsNull_mQRK1() {
        Attribute mockAttribute = mock(Attribute.class);
        when(mockAttribute.getNamespaceURI()).thenReturn(null);
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(mockParent, mockAttribute);
        String result = pointer.getNamespaceURI();
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ReturnsEmptyAsNull_vTHN2() {
        Attribute mockAttribute = mock(Attribute.class);
        when(mockAttribute.getNamespaceURI()).thenReturn("");
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(mockParent, mockAttribute);
        String result = pointer.getNamespaceURI();
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ReturnsNonNullButEmpty_JWLc3() {
        Attribute mockAttribute = mock(Attribute.class);
        when(mockAttribute.getNamespaceURI()).thenReturn("   ");
        DOMNodePointer mockParent = mock(DOMNodePointer.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(mockParent, mockAttribute);
        String result = pointer.getNamespaceURI();
        assertEquals("   ", result);
    }
}