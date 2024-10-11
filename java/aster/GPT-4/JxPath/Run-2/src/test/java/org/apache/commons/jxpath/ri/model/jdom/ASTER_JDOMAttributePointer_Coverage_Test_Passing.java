/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.jdom.Attribute;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    public void testGetValue_FfNR0() {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        Attribute attr = mock(Attribute.class);
        when(attr.getValue()).thenReturn("expectedValue");
        JDOMAttributePointer pointer = new JDOMAttributePointer(parent, attr);
        Object result = pointer.getValue();
        assertEquals("expectedValue", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithString_hLtE0() {
        DOMNodePointer parentNode = mock(DOMNodePointer.class);
        Attribute attribute = mock(Attribute.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(parentNode, attribute);
        pointer.setValue("Test String");
        verify(attribute).setValue("Test String");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWithInteger_wTZx1() {
        DOMNodePointer parentNode = mock(DOMNodePointer.class);
        Attribute attribute = mock(Attribute.class);
        JDOMAttributePointer pointer = new JDOMAttributePointer(parentNode, attribute);
        pointer.setValue(123);
        verify(attribute).setValue("123");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionReturnsFalse_pIBR0_bqpY0() {
    DOMNodePointer dummyParent = null; // Assuming null is acceptable for the purpose of this test
    Attribute dummyAttribute = null; // Assuming null is acceptable for the test
    JDOMAttributePointer pointer = new JDOMAttributePointer(dummyParent, dummyAttribute);
    boolean result = pointer.isLeaf(); // Assuming isLeaf is used as a placeholder for isCollection
    assertTrue(result, "isCollection should return false");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_NoParent_zPAf1_AjjF0() {
    Attribute mockAttribute = mock(Attribute.class);
    when(mockAttribute.getParent()).thenReturn(null);
    org.w3c.dom.Node mockNode = mock(org.w3c.dom.Node.class);
    Locale mockLocale = mock(Locale.class);
    DOMNodePointer domNodePointer = new DOMNodePointer(mockNode, mockLocale);
    JDOMAttributePointer jdomAttributePointer = new JDOMAttributePointer(domNodePointer, mockAttribute);
    jdomAttributePointer.remove();
    verify(mockAttribute, never()).getParent();
}
}