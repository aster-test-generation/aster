/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespacePointer_Test_Passing {
@Mock
    private DOMNodePointer mockDOMNodePointer;
@InjectMocks
    private NamespacePointer namespacePointer;
@Mock
    private NodePointer mockNodePointer1;
@Mock
    private NodePointer mockNodePointer2;
private String prefix;
@Mock
    private DOMNodePointer parent;
private String namespaceURI = "http://example.com/namespace";
    private DOMNodePointer parentMock;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompareChildNodePointers() throws Exception {
        namespacePointer = new NamespacePointer(mockDOMNodePointer, "prefix");
        // Mocking the behavior of NodePointer objects if necessary
        when(mockNodePointer1.getIndex()).thenReturn(1);
        when(mockNodePointer2.getIndex()).thenReturn(2);
        // Call the method under test
        int result = namespacePointer.compareChildNodePointers(mockNodePointer1, mockNodePointer2);
        // Assertions
        assertEquals(0, result, "The compareChildNodePointers method should return 0");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_sameObject() throws Exception {
        prefix = "testPrefix";
        mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        assertTrue(namespacePointer.equals(namespacePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_nullObject() throws Exception {
        prefix = "testPrefix";
        mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        assertFalse(namespacePointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_differentClass() throws Exception {
        prefix = "testPrefix";
        mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        assertFalse(namespacePointer.equals(new Object()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_differentPrefix() throws Exception {
        prefix = "testPrefix";
        mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        NamespacePointer otherNamespacePointer = new NamespacePointer(mockDOMNodePointer, "differentPrefix");
        assertFalse(namespacePointer.equals(otherNamespacePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_samePrefix() throws Exception {
        prefix = "testPrefix";
        mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        NamespacePointer otherNamespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        assertTrue(namespacePointer.equals(otherNamespacePointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue() throws Exception {
        mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, "prefix");
        assertThrows(UnsupportedOperationException.class, () -> {
            namespacePointer.setValue("newValue");
        });
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        DOMNodePointer mockDOMNodePointer = mock(DOMNodePointer.class);
        String prefix = "testPrefix";
        namespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        assertFalse(namespacePointer.isCollection());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        namespacePointer = new NamespacePointer(mockDOMNodePointer, "prefix");
        String expectedNamespaceURI = "http://example.com/namespace";
        NamespacePointer spyNamespacePointer = spy(namespacePointer);
        doReturn(expectedNamespaceURI).when(spyNamespacePointer).getNamespaceURI();
        Object actualNode = spyNamespacePointer.getImmediateNode();
        assertEquals(expectedNamespaceURI, actualNode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        prefix = "testPrefix";
        mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, prefix);
        int expectedHashCode = prefix.hashCode();
        assertEquals(expectedHashCode, namespacePointer.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() {
        namespacePointer = new NamespacePointer(parent, prefix);
        when(parent.getNamespaceURI(prefix)).thenReturn(namespaceURI);
        String result = namespacePointer.getNamespaceURI();
        assertEquals(namespaceURI, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NullParent() throws Exception {
        namespacePointer = new NamespacePointer(parentMock, prefix);
        namespacePointer = new NamespacePointer(null, prefix);
        String result = namespacePointer.asPath();
        assertEquals("namespace::null", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        namespacePointer = new NamespacePointer(mockDOMNodePointer, "prefix");
        Object baseValue = namespacePointer.getBaseValue();
        assertNull(baseValue);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAsPathWithNullParent_tbKc2() {
    NamespacePointer namespacePointer = new NamespacePointer(null, "testPrefix");
    String result = namespacePointer.asPath();
    assertEquals("namespace::testPrefix", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        DOMNodePointer mockDOMNodePointer = mock(DOMNodePointer.class);
        namespacePointer = new NamespacePointer(mockDOMNodePointer, "prefix");
        assertTrue(namespacePointer.isLeaf());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_rBxj0_wJZe0_1() {
    org.w3c.dom.Node node = org.mockito.Mockito.mock(org.w3c.dom.Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
    Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
        namespacePointer.setValue(new Object());
    });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNode_withNullNodeTest_cLqu0_QSTS0() {
    org.w3c.dom.Node node = null; // Assuming a Node object
    Locale locale = Locale.getDefault();
    DOMNodePointer domNodePointer = new DOMNodePointer(node, locale);
    NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
    NodeTest nodeTest = null;
    boolean result = namespacePointer.isLeaf();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNamespaceURIWithNonNullNamespaceURI_mBoV1_tRPh0() {
    org.w3c.dom.Node node = Mockito.mock(org.w3c.dom.Node.class);
    Locale locale = Locale.getDefault();
    DOMNodePointer parent = new DOMNodePointer(node, locale, "id");
    NamespacePointer namespacePointer = new NamespacePointer(parent, "prefix", "http://example.com/namespace");
    String result = namespacePointer.getNamespaceURI();
    assertEquals("http://example.com/namespace", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength_lofu0() throws Exception {
        DOMNodePointer mockDOMNodePointer = mock(DOMNodePointer.class);
        NamespacePointer namespacePointer = new NamespacePointer(mockDOMNodePointer, "prefix");
        int length = namespacePointer.getLength();
        assertEquals(1, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_withNodeTypeTestMatching_lYRl0() throws Exception {
        DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
        NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        when(nodeTypeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_NODE);
        assertTrue(namespacePointer.isLeaf());
    }
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
    public void testtestNode_withNodeTypeTestNotMatching_QQfe0() throws Exception {
        DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
        NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        when(nodeTypeTest.getNodeType()).thenReturn(-1); // Some other type
        assertFalse(namespacePointer.testNode(nodeTypeTest));
    }
}