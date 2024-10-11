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
public class Aster_JDOMAttributePointer_Test_Passing {
private JDOMAttributePointer jdomAttributePointer;
private DOMNodePointer mockParent;
private Attribute attr;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private DOMNodePointer parent;
@Mock
    private Attribute attribute;
@Mock
    private Attribute mockAttribute;
@Mock
    private DOMNodePointer parentNode;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() {
        mockParent = mock(DOMNodePointer.class);
        jdomAttributePointer = new JDOMAttributePointer(mockParent, null);
        // Arrange
        NodePointer mockPointer1 = mock(NodePointer.class);
        NodePointer mockPointer2 = mock(NodePointer.class);
        // Act
        int result = jdomAttributePointer.compareChildNodePointers(mockPointer1, mockPointer2);
        // Assert
        assertEquals(0, result, "The compareChildNodePointers method should always return 0.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        assertTrue(jdomAttributePointer.equals(jdomAttributePointer), "The object should be equal to itself.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_Null() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        assertFalse(jdomAttributePointer.equals(null), "The object should not be equal to null.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        Object other = new Object();
        assertFalse(jdomAttributePointer.equals(other), "The object should not be equal to an object of a different class.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameAttribute() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        JDOMAttributePointer other = new JDOMAttributePointer(null, attr);
        assertTrue(jdomAttributePointer.equals(other), "The object should be equal to another object with the same attribute.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentAttribute() {
        attr = mock(Attribute.class);
        jdomAttributePointer = new JDOMAttributePointer(null, attr);
        Attribute otherAttr = mock(Attribute.class);
        JDOMAttributePointer other = new JDOMAttributePointer(null, otherAttr);
        assertFalse(jdomAttributePointer.equals(other), "The object should not be equal to another object with a different attribute.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode() {
        attr = mock(Attribute.class);
        domNodePointer = mock(DOMNodePointer.class);
        jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attr);
        assertEquals(attr, jdomAttributePointer.getImmediateNode(), "The getImmediateNode method should return the attribute object.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithParent() throws Exception {
        when(parent.asPath()).thenReturn("/parent/path");
        when(attribute.getName()).thenReturn("attributeName");
        jdomAttributePointer = new JDOMAttributePointer(parent, attribute);
        String expectedPath = "/parent/path/@attributeName";
        String actualPath = jdomAttributePointer.asPath();
        assertEquals(expectedPath, actualPath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithoutParent() throws Exception {
        when(parent.asPath()).thenReturn("/parent/path");
        when(attribute.getName()).thenReturn("attributeName");
        jdomAttributePointer = new JDOMAttributePointer(parent, attribute);
        when(parent.asPath()).thenReturn("");
        String expectedPath = "/@attributeName";
        String actualPath = jdomAttributePointer.asPath();
        assertEquals(expectedPath, actualPath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WithNullParent_ReturnsOnlyAttributePath_Ljpa1() {
        Attribute attr = new Attribute("name", "value"); // Assuming Attribute is defined elsewhere
        JDOMAttributePointer pointer = new JDOMAttributePointer(null, attr);
        String result = pointer.asPath();
        assertEquals("@name", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength() throws Exception {
        jdomAttributePointer = new JDOMAttributePointer(mockParent, mockAttribute);
        int length = jdomAttributePointer.getLength();
        assertEquals(1, length, "The length should always be 1.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue() {
        attr = mock(Attribute.class);
        domNodePointer = mock(DOMNodePointer.class);
        jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attr);
        assertEquals(attr, jdomAttributePointer.getBaseValue(), "The getBaseValue method should return the attribute instance set in constructor");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_Iyud0_zYYy0() {
    Locale locale = Locale.getDefault();
    DOMNodePointer parent = new DOMNodePointer(null, locale, null);
    Attribute attr = new Attribute("id", "123");
    JDOMAttributePointer pointer = new JDOMAttributePointer(parent, attr);
    assertTrue(pointer.equals(pointer));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObjectSameAttribute_PGhk1_ekAR0() {
    DOMNodePointer parent1 = new DOMNodePointer(null, Locale.getDefault());
    DOMNodePointer parent2 = new DOMNodePointer(null, Locale.getDefault(), null);
    Attribute attr = new Attribute("id", "123");
    JDOMAttributePointer pointer1 = new JDOMAttributePointer(parent1, attr);
    JDOMAttributePointer pointer2 = new JDOMAttributePointer(parent2, attr);
    assertTrue(pointer1.equals(pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentAttribute_kORm2_cFHD0() {
    Locale locale = Locale.getDefault();
    DOMNodePointer parent = new DOMNodePointer(null, locale, null);
    Attribute attr1 = new Attribute("id", "123");
    Attribute attr2 = new Attribute("id", "456");
    JDOMAttributePointer pointer1 = new JDOMAttributePointer(parent, attr1);
    JDOMAttributePointer pointer2 = new JDOMAttributePointer(parent, attr2);
    assertFalse(pointer1.equals(pointer2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_lUFN3_dUaL0() {
    DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), (String) null);
    Attribute attr = new Attribute("id", "123");
    JDOMAttributePointer pointer = new JDOMAttributePointer(parent, attr);
    assertFalse(pointer.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_ReturnsNullWhenEmpty_Wzoe0_GPbs0() {
    Attribute attribute = mock(Attribute.class);
    when(attribute.getNamespaceURI()).thenReturn("");
    org.w3c.dom.Node node = mock(org.w3c.dom.Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    JDOMAttributePointer jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attribute);
    String result = jdomAttributePointer.getNamespaceURI();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_ReturnsValidURI_esfl1_QAyr0() {
    Attribute attribute = mock(Attribute.class);
    when(attribute.getNamespaceURI()).thenReturn("http://example.com/ns");
    org.w3c.dom.Node node = mock(org.w3c.dom.Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    JDOMAttributePointer jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attribute);
    String result = jdomAttributePointer.getNamespaceURI();
    assertEquals("http://example.com/ns", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURI_ReturnsNullForNullURI_iTAd2_oMJA0() {
    Attribute attribute = mock(Attribute.class);
    when(attribute.getNamespaceURI()).thenReturn(null);
    org.w3c.dom.Node node = mock(org.w3c.dom.Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    JDOMAttributePointer jdomAttributePointer = new JDOMAttributePointer(domNodePointer, attribute);
    String result = jdomAttributePointer.getNamespaceURI();
    assertNull(result);
}
}