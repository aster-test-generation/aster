/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.TypeUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributePointer_Test_Failing {
    DOMAttributePointer domAttributePointer;
    DOMNodePointer parent;
    Attr attr;
    NodePointer pointer1;
    NodePointer pointer2;
    private DOMAttributePointer domattributepointer;
    NodeTest nodeTest;
    NodeTypeTest nodeTypeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue() throws Exception {
        attr = mock(Attr.class);
        parent = mock(DOMNodePointer.class);
        domAttributePointer = new DOMAttributePointer(parent, attr);
        // given
        Object value = "new value";
        String convertedValue = "converted new value";
        when(TypeUtils.convert(value, String.class)).thenReturn(convertedValue);
        // when
        domAttributePointer.setValue(value);
        // then
        verify(attr).setValue(convertedValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        attr = mock(Attr.class);
        parent = mock(DOMNodePointer.class);
        domattributepointer = new DOMAttributePointer(parent, attr);
        // Given
        when(DOMNodePointer.getPrefix(attr)).thenReturn("prefix");
        when(parent.getNamespaceURI("prefix")).thenReturn("namespaceURI");
        // When
        String namespaceURI = domattributepointer.getNamespaceURI();
        // Then
        assertEquals("namespaceURI", namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURINullPrefix() throws Exception {
        attr = mock(Attr.class);
        parent = mock(DOMNodePointer.class);
        domattributepointer = new DOMAttributePointer(parent, attr);
        // Given
        when(DOMNodePointer.getPrefix(attr)).thenReturn(null);
        // When
        String namespaceURI = domattributepointer.getNamespaceURI();
        // Then
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        when(parent.asPath()).thenReturn("parent/path");
        when(attr.getNodeName()).thenReturn("attributeName");
        domattributepointer = new DOMAttributePointer(parent, attr);
        String result = domattributepointer.asPath();
        assertEquals("parent/path/@attributeName", result);
    }
}