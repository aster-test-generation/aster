/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespacePointer_Test_Passing {
    private NamespacePointer namespacePointer;
    private DOMNodePointer parent;
    private String prefix;
    private String namespaceURI;
    @Mock
    private NamespacePointer namespacePointerMock;
    private NamespacePointer namespacepointer;
    @Mock
    Locale locale;
    @Mock
    KeywordVariables variables;
    @Mock
    QName name;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() {
        parent = mock(DOMNodePointer.class);
        prefix = "example";
        namespaceURI = "http://example.com";
        namespacePointer = new NamespacePointer(parent, prefix, namespaceURI);
        NodePointer pointer1 = mock(NodePointer.class);
        NodePointer pointer2 = mock(NodePointer.class);
        when(pointer1.getNamespaceURI()).thenReturn("http://example.com");
        when(pointer2.getNamespaceURI()).thenReturn("http://other.com");
        int result = namespacePointer.compareChildNodePointers(pointer1, pointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_sameObject_returnsTrue() {
        prefix = "testPrefix";
        namespacePointer = new NamespacePointer(null, prefix);
        // Arrange
        NamespacePointer sameObject = namespacePointer;
        // Act
        boolean result = namespacePointer.equals(sameObject);
        // Assert
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_differentObjectSameType_returnsTrue() {
        prefix = "testPrefix";
        namespacePointer = new NamespacePointer(null, prefix);
        // Arrange
        NamespacePointer differentObject = new NamespacePointer(null, prefix);
        // Act
        boolean result = namespacePointer.equals(differentObject);
        // Assert
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_differentObjectDifferentType_returnsFalse() {
        prefix = "testPrefix";
        namespacePointer = new NamespacePointer(null, prefix);
        // Arrange
        KeywordVariables differentObject = new KeywordVariables("testKeyword", new Object());
        // Act
        boolean result = namespacePointer.equals(differentObject);
        // Assert
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_differentPrefix_returnsFalse() {
        prefix = "testPrefix";
        namespacePointer = new NamespacePointer(null, prefix);
        // Arrange
        NamespacePointer differentPrefix = new NamespacePointer(null, "differentPrefix");
        // Act
        boolean result = namespacePointer.equals(differentPrefix);
        // Assert
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSamePrefix_SPhY0() {
        NamespacePointer namespacePointer1 = new NamespacePointer(null, "prefix");
        NamespacePointer namespacePointer2 = new NamespacePointer(null, "prefix");
        assertTrue(namespacePointer1.equals(namespacePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentPrefix_nbWJ1() {
        NamespacePointer namespacePointer1 = new NamespacePointer(null, "prefix1");
        NamespacePointer namespacePointer2 = new NamespacePointer(null, "prefix2");
        assertFalse(namespacePointer1.equals(namespacePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_UuiK2() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        assertFalse(namespacePointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTestNode_NullNodeTest() {
        MockitoAnnotations.openMocks(this);
        namespacePointer = new NamespacePointer(parent, "prefix");
        boolean result = namespacePointer.testNode(null);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection() {
        namespacePointer = new NamespacePointer(parent, "prefix");
        // Assert that isCollection returns false
        assertFalse(namespacePointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() {
        parent = mock(DOMNodePointer.class);
        prefix = "examplePrefix";
        namespaceURI = "http://example.com";
        namespacePointer = new NamespacePointer(parent, prefix, namespaceURI);
        when(parent.getNamespaceURI()).thenReturn(namespaceURI);
        assertEquals(namespaceURI, namespacePointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_eaJl0_1() {
        NamespacePointer namespacePointer = new NamespacePointer(new DOMNodePointer(null, null, null), "prefix");
        QName name = namespacePointer.getName();
        assertNotNull(name);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        parent = mock(DOMNodePointer.class);
        prefix = "examplePrefix";
        namespacepointer = new NamespacePointer(parent, prefix);
        when(parent.asPath()).thenReturn("/parent/path");
        String asPath = namespacepointer.asPath();
        assertEquals("/parent/path/namespace::examplePrefix", asPath);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_aubc0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        String actual = namespacePointer.asPath();
        String expected = "namespace::prefix";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_BkSg1() {
        DOMNodePointer parent = new DOMNodePointer(null, Locale.getDefault(), "id");
        NamespacePointer namespacePointer = new NamespacePointer(parent, "prefix");
        String actual = namespacePointer.asPath();
        String expected = "id('id')/namespace::prefix";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_hqNj0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        int length = namespacePointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_wTta0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        Object baseValue = namespacePointer.getBaseValue();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() {
        parent = mock(DOMNodePointer.class);
        prefix = "examplePrefix";
        namespacePointer = new NamespacePointer(parent, prefix);
        when(parent.isLeaf()).thenReturn(true);
        assertTrue(namespacePointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_tnSE0() {
        NamespacePointer namespacePointer = new NamespacePointer(null, null);
        boolean isLeaf = namespacePointer.isLeaf();
        assertTrue(isLeaf);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_hNtF0_OqRp0_1() {
        NamespacePointer namespacePointer1 = new NamespacePointer(new DOMNodePointer(null, null, "id1"), "prefix1", "namespaceURI1");
        NamespacePointer namespacePointer2 = new NamespacePointer(new DOMNodePointer(null, null, "id2"), "prefix2", "namespaceURI2");
        assertEquals(0, namespacePointer1.compareChildNodePointers(namespacePointer1, namespacePointer1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers_hNtF0_OqRp0_2() {
        NamespacePointer namespacePointer1 = new NamespacePointer(new DOMNodePointer(null, null, "id1"), "prefix1", "namespaceURI1");
        NamespacePointer namespacePointer2 = new NamespacePointer(new DOMNodePointer(null, null, "id2"), "prefix2", "namespaceURI2");
    }
}