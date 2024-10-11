/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMNamespacePointer_Test_Passing {
@Mock
    private NodePointer nodePointer1;
@Mock
    private NodePointer nodePointer2;
private JDOMNamespacePointer jdomnamespacepointer;
private String prefix;
@Mock
    private DOMNodePointer parent;
@Mock
    private QName name;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private VariablePointer variablePointer;
@Mock
    private KeywordVariables keywordVariables;
@Mock
    private Locale locale;
@Mock
    private QName qName;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() throws Exception {
        jdomnamespacepointer = new JDOMNamespacePointer(null, "prefix");
        // Arrange
        when(nodePointer1.getName()).thenReturn(new QName("name1"));
        when(nodePointer2.getName()).thenReturn(new QName("name2"));
        // Act
        int result = jdomnamespacepointer.compareChildNodePointers(nodePointer1, nodePointer2);
        // Assert
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameObject() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        assertEquals(jdomnamespacepointer, jdomnamespacepointer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentObjectSamePrefix() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        JDOMNamespacePointer other = new JDOMNamespacePointer(parent, prefix);
        assertEquals(jdomnamespacepointer, other);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentObjectDifferentPrefix() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        JDOMNamespacePointer other = new JDOMNamespacePointer(parent, "otherPrefix");
        assertNotEquals(jdomnamespacepointer, other);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsNull() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        assertNotEquals(jdomnamespacepointer, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentClass() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        Object object = new Object();
        assertNotEquals(jdomnamespacepointer, object);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetValue() throws Exception {
        MockitoAnnotations.initMocks(this);
        jdomnamespacepointer = new JDOMNamespacePointer(parent, "prefix");
        Object value = "someValue";
        Mockito.doNothing().when(parent).setValue(value);
        jdomnamespacepointer.setValue(value);
        Mockito.verify(parent, Mockito.times(1)).setValue(value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        jdomnamespacepointer = new JDOMNamespacePointer(domNodePointer, "prefix");
        // Arrange
        boolean expected = false;
        // Act
        boolean actual = jdomnamespacepointer.isCollection();
        // Assert
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception{
        prefix = "prefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        // Act
        int result = jdomnamespacepointer.hashCode();
        // Assert
        assertEquals(prefix.hashCode(), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        QName expectedName = new QName(prefix);
        QName actualName = jdomnamespacepointer.getName();
        assertEquals(expectedName, actualName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_1() throws Exception {
        prefix = "namespacePrefix";
        parent = Mockito.mock(DOMNodePointer.class);
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        // Test when parent is null
        Mockito.when(parent.asPath()).thenReturn("");
        // Test when parent is not null
        Mockito.when(parent.asPath()).thenReturn("parentPath");
        assertEquals("namespace::namespacePrefix", jdomnamespacepointer.asPath());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_2() throws Exception {
        prefix = "namespacePrefix";
        parent = Mockito.mock(DOMNodePointer.class);
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        // Test when parent is null
        Mockito.when(parent.asPath()).thenReturn("");
        // Test when parent is not null
        Mockito.when(parent.asPath()).thenReturn("parentPath");
        assertEquals("parentPath/namespace::namespacePrefix", jdomnamespacepointer.asPath());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        jdomnamespacepointer = new JDOMNamespacePointer(parent, "prefix");
        // Act
        int length = jdomnamespacepointer.getLength();
        // Assert
        assertEquals(1, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNullParent_zmjw0() throws Exception {
        JDOMNamespacePointer jdom = new JDOMNamespacePointer(null, "prefix");
        assertEquals("namespace::prefix", jdom.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        jdomnamespacepointer = new JDOMNamespacePointer(domNodePointer, "prefix");
        // Arrange
        when(domNodePointer.getBaseValue()).thenReturn("baseValue");
        // Act
        Object baseValue = jdomnamespacepointer.getBaseValue();
        // Assert
        assertEquals("baseValue", baseValue);
    }
}