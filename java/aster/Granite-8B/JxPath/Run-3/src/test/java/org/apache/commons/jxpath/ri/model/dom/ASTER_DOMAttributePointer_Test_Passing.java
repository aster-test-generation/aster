/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributePointer_Test_Passing {
    private DOMAttributePointer domattributepointer;
    private DOMNodePointer parent;
    private Attr attr;
    private NodeTest nodeTest;
    private KeywordVariables variables;
    private QName name;
    @Mock
    private Attr attrMock;
    @Mock
    private String qualifiedName;
    private String prefix;
    private String localName;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() {
        parent = mock(DOMNodePointer.class);
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(parent, attr);
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        // Perform the test
        int result = domattributepointer.compareChildNodePointers(pointer1, pointer2);
        // Assert the result
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_ZFXy0() {
        DOMAttributePointer pointer1 = new DOMAttributePointer(null, null);
        DOMAttributePointer pointer2 = new DOMAttributePointer(null, null);
        int result = pointer1.compareChildNodePointers(pointer1, pointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        // Test self-equality
        assertTrue(domattributepointer.equals(domattributepointer));
        // Test null equality
        assertFalse(domattributepointer.equals(null));
        // Test object equality
        DOMAttributePointer other = new DOMAttributePointer(null, attr);
        assertTrue(domattributepointer.equals(other));
        // Test object inequality
        Attr otherAttr = mock(Attr.class);
        DOMAttributePointer otherPointer = new DOMAttributePointer(null, otherAttr);
        assertFalse(domattributepointer.equals(otherPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetValue() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        String value = "new value";
        domattributepointer.setValue(value);
        verify(attr).setValue(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_FpyP0() {
        DOMAttributePointer pointer1 = new DOMAttributePointer(parent, attr);
        assertTrue(pointer1.equals(pointer1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameAttr_tjXx1() {
        DOMAttributePointer pointer1 = new DOMAttributePointer(parent, attr);
        DOMAttributePointer pointer2 = new DOMAttributePointer(parent, attr);
        assertTrue(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentAttr_uwwB3() {
        Attr attr2 = mock(Attr.class);
        when(attr2.getNodeName()).thenReturn("differentAttr");
        DOMAttributePointer pointer1 = new DOMAttributePointer(parent, attr);
        DOMAttributePointer pointer2 = new DOMAttributePointer(parent, attr2);
        assertFalse(pointer1.equals(pointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        when(attr.getValue()).thenReturn("testValue");
        assertEquals("testValue", domattributepointer.getValue());
        when(attr.getValue()).thenReturn("");
        when(attr.getSpecified()).thenReturn(true);
        assertEquals("", domattributepointer.getValue());
        when(attr.getValue()).thenReturn(null);
        when(attr.getSpecified()).thenReturn(false);
        assertNull(domattributepointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullAttrValueAndFalseAttrSpecified_Lfyq0() {
        DOMAttributePointer pointer = new DOMAttributePointer(null, null);
        Object value = pointer.getValue();
        Assertions.assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNonNullAttrValueAndTrueAttrSpecified_Uuoj1() {
        Attr attr = mock(Attr.class);
        when(attr.getValue()).thenReturn("testValue");
        when(attr.getSpecified()).thenReturn(true);
        DOMAttributePointer pointer = new DOMAttributePointer(null, attr);
        Object value = pointer.getValue();
        Assertions.assertEquals("testValue", value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNonNullAttrValueAndFalseAttrSpecified_xXAK2() {
        Attr attr = mock(Attr.class);
        when(attr.getValue()).thenReturn("testValue");
        when(attr.getSpecified()).thenReturn(false);
        DOMAttributePointer pointer = new DOMAttributePointer(null, attr);
        Object value = pointer.getValue();
        Assertions.assertNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_ISRa0() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, null);
        boolean result = domAttributePointer.isCollection();
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        when(attr.hashCode()).thenReturn(123);
        assertEquals(123, domattributepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        attr = mock(Attr.class);
        parent = mock(DOMNodePointer.class);
        domattributepointer = new DOMAttributePointer(parent, attr);
        when(attr.getName()).thenReturn("prefix:localName");
        when(parent.getNamespaceURI("prefix")).thenReturn("namespaceURI");
        assertEquals("namespaceURI", domattributepointer.getNamespaceURI());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        parent = mock(DOMNodePointer.class);
        attr = mock(Attr.class);
        when(attr.getName()).thenReturn("test");
        domattributepointer = new DOMAttributePointer(parent, attr);
        String expectedPath = "/@test";
        String actualPath = domattributepointer.asPath();
        assertEquals(expectedPath, actualPath);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_qvzn0() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, null);
        String actual = domAttributePointer.getNamespaceURI();
        assertEquals(null, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        // Act
        Object baseValue = domattributepointer.getBaseValue();
        // Assert
        assertEquals(attr, baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLength_tuuG0() {
        DOMAttributePointer pointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        assertEquals(1, pointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_YuoN0() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        QName name = domAttributePointer.getName();
        assertNotNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName2_wJSM1() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        QName name = domAttributePointer.getName();
        assertEquals("", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName4_gVwJ3() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        QName name = domAttributePointer.getName();
        assertEquals(0, name.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName5_UFPY4() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        QName name = domAttributePointer.getName();
        assertNotEquals(null, name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName6_feJm5() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        QName name = domAttributePointer.getName();
        assertNotEquals("", name.getPrefix());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName8_qhqh7() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        QName name = domAttributePointer.getName();
        assertNotEquals(0, name.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName9_yJej8() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        QName name = domAttributePointer.getName();
        assertEquals("", name.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() {
        parent = mock(DOMNodePointer.class);
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(parent, attr);
        when(attr.isId()).thenReturn(true);
        assertTrue(domattributepointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_TNfT0() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        boolean isLeaf = domAttributePointer.isLeaf();
        assertTrue(isLeaf);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_rizq0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(domNodePointer, null);
        assertEquals(null, domAttributePointer.getBaseValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_ufas0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        VariablePointer variablePointer = new VariablePointer(null, null);
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(domNodePointer, null);
        boolean actual = domAttributePointer.isActual();
        assertTrue(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        // Test self-equality
        // Test null equality
        // Test object equality
        DOMAttributePointer other = new DOMAttributePointer(null, attr);
        // Test object inequality
        Attr otherAttr = mock(Attr.class);
        DOMAttributePointer otherPointer = new DOMAttributePointer(null, otherAttr);
        assertTrue(domattributepointer.equals(domattributepointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        // Test self-equality
        // Test null equality
        // Test object equality
        DOMAttributePointer other = new DOMAttributePointer(null, attr);
        // Test object inequality
        Attr otherAttr = mock(Attr.class);
        DOMAttributePointer otherPointer = new DOMAttributePointer(null, otherAttr);
        assertFalse(domattributepointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        // Test self-equality
        // Test null equality
        // Test object equality
        DOMAttributePointer other = new DOMAttributePointer(null, attr);
        // Test object inequality
        Attr otherAttr = mock(Attr.class);
        DOMAttributePointer otherPointer = new DOMAttributePointer(null, otherAttr);
        assertTrue(domattributepointer.equals(other));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_4() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        // Test self-equality
        // Test null equality
        // Test object equality
        DOMAttributePointer other = new DOMAttributePointer(null, attr);
        // Test object inequality
        Attr otherAttr = mock(Attr.class);
        DOMAttributePointer otherPointer = new DOMAttributePointer(null, otherAttr);
        assertFalse(domattributepointer.equals(otherPointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_1() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        when(attr.getValue()).thenReturn("testValue");
        when(attr.getValue()).thenReturn("");
        when(attr.getSpecified()).thenReturn(true);
        when(attr.getValue()).thenReturn(null);
        when(attr.getSpecified()).thenReturn(false);
        assertEquals("testValue", domattributepointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_2() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        when(attr.getValue()).thenReturn("testValue");
        when(attr.getValue()).thenReturn("");
        when(attr.getSpecified()).thenReturn(true);
        when(attr.getValue()).thenReturn(null);
        when(attr.getSpecified()).thenReturn(false);
        assertEquals("", domattributepointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_3() throws Exception {
        attr = mock(Attr.class);
        domattributepointer = new DOMAttributePointer(null, attr);
        when(attr.getValue()).thenReturn("testValue");
        when(attr.getValue()).thenReturn("");
        when(attr.getSpecified()).thenReturn(true);
        when(attr.getValue()).thenReturn(null);
        when(attr.getSpecified()).thenReturn(false);
        assertNull(domattributepointer.getValue());
    }
}