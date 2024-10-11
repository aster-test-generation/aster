/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

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
    private String namespaceURI;
    @Mock
    private Locale locale;
    @Mock
    private VariablePointer variablePointer;

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
    public void testEquals() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test with same object
        assertEquals(jdomnamespacepointer, jdomnamespacepointer);
        // Test with different object of same class
        JDOMNamespacePointer other = new JDOMNamespacePointer(null, prefix);
        assertEquals(jdomnamespacepointer, other);
        // Test with null
        assertNotEquals(jdomnamespacepointer, null);
        // Test with object of different class
        Object obj = new Object();
        assertNotEquals(jdomnamespacepointer, obj);
        // Test with object of same class but different prefix
        JDOMNamespacePointer otherWithDifferentPrefix = new JDOMNamespacePointer(null, "differentPrefix");
        assertNotEquals(jdomnamespacepointer, otherWithDifferentPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        MockitoAnnotations.initMocks(this);
        jdomnamespacepointer = Mockito.mock(JDOMNamespacePointer.class);
        Mockito.when(jdomnamespacepointer.getParent()).thenReturn(parent);
        // Arrange
        Mockito.when(jdomnamespacepointer.isCollection()).thenReturn(true);
        // Act
        boolean result = jdomnamespacepointer.isCollection();
        // Assert
        Mockito.verify(jdomnamespacepointer, Mockito.times(1)).isCollection();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        prefix = "prefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        QName expected = new QName(prefix);
        QName actual = jdomnamespacepointer.getName();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        namespaceURI = "http://example.com";
        prefix = "prefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        // Arrange
        when(parent.getNamespaceURI(prefix)).thenReturn(namespaceURI);
        // Act
        String result = jdomnamespacepointer.getNamespaceURI();
        // Assert
        assertEquals(namespaceURI, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() {
        prefix = "prefix";
        jdomnamespacepointer = new JDOMNamespacePointer(parent, prefix);
        // Arrange
        when(parent.asPath()).thenReturn("path");
        // Act
        String result = jdomnamespacepointer.asPath();
        // Assert
        assertEquals("path/namespace::prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNullParent_wvyt0() {
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(null, "prefix");
        String result = jdomNamespacePointer.asPath();
        Assertions.assertEquals("namespace::prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test with same object
        // Test with different object of same class
        JDOMNamespacePointer other = new JDOMNamespacePointer(null, prefix);
        // Test with null
        // Test with object of different class
        Object obj = new Object();
        // Test with object of same class but different prefix
        JDOMNamespacePointer otherWithDifferentPrefix = new JDOMNamespacePointer(null, "differentPrefix");
        assertEquals(jdomnamespacepointer, jdomnamespacepointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_2() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test with same object
        // Test with different object of same class
        JDOMNamespacePointer other = new JDOMNamespacePointer(null, prefix);
        // Test with null
        // Test with object of different class
        Object obj = new Object();
        // Test with object of same class but different prefix
        JDOMNamespacePointer otherWithDifferentPrefix = new JDOMNamespacePointer(null, "differentPrefix");
        assertEquals(jdomnamespacepointer, other);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test with same object
        // Test with different object of same class
        JDOMNamespacePointer other = new JDOMNamespacePointer(null, prefix);
        // Test with null
        // Test with object of different class
        Object obj = new Object();
        // Test with object of same class but different prefix
        JDOMNamespacePointer otherWithDifferentPrefix = new JDOMNamespacePointer(null, "differentPrefix");
        assertNotEquals(jdomnamespacepointer, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_4() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test with same object
        // Test with different object of same class
        JDOMNamespacePointer other = new JDOMNamespacePointer(null, prefix);
        // Test with null
        // Test with object of different class
        Object obj = new Object();
        // Test with object of same class but different prefix
        JDOMNamespacePointer otherWithDifferentPrefix = new JDOMNamespacePointer(null, "differentPrefix");
        assertNotEquals(jdomnamespacepointer, obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_5() throws Exception {
        prefix = "testPrefix";
        jdomnamespacepointer = new JDOMNamespacePointer(null, prefix);
        // Test with same object
        // Test with different object of same class
        JDOMNamespacePointer other = new JDOMNamespacePointer(null, prefix);
        // Test with null
        // Test with object of different class
        Object obj = new Object();
        // Test with object of same class but different prefix
        JDOMNamespacePointer otherWithDifferentPrefix = new JDOMNamespacePointer(null, "differentPrefix");
        assertNotEquals(jdomnamespacepointer, otherWithDifferentPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNonNullParent_apkL1_fid1() {
        JDOMNamespacePointer parent = new JDOMNamespacePointer(null, "parentPrefix");
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(parent, "prefix");
        String result = jdomNamespacePointer.asPath();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathNonNullParentAndEmptyPath_nyNI3() {
        JDOMNamespacePointer parent = new JDOMNamespacePointer(null, "parentPrefix");
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(parent, "prefix");
        String result = jdomNamespacePointer.asPath();
        Assertions.assertEquals("namespace::parentPrefix/namespace::prefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_tOpc0_YKKM0() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        JDOMNamespacePointer jdomNamespacePointer = new JDOMNamespacePointer(new DOMNodePointer(variablePointer, null), "prefix");
        Object result = jdomNamespacePointer.getBaseValue();
        assert result == null;
    }
}