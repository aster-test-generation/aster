/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
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
    @Mock
    private NodePointer pointer1;
    @Mock
    private NodePointer pointer2;
    @Mock
    private DOMNodePointer parent;
    private NamespacePointer namespacepointer;
    private String prefix = "testPrefix";
    private NamespacePointer namespacePointer;
    private NamespacePointer otherNamespacePointer;
    private NamespacePointer differentNamespacePointer;
    NodeTest nodeTest;
    NodeTypeTest nodeTypeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() throws Exception {
        namespacepointer = new NamespacePointer(parent, "prefix");
        int result = namespacepointer.compareChildNodePointers(pointer1, pointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_NodeTestIsNull_ReturnsTrue() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        namespacepointer = new NamespacePointer(parent, "prefix");
        nodeTest = mock(NodeTest.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        assertTrue(namespacepointer.testNode(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_NodeTestIsNodeTypeTest_ReturnsTrue() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        namespacepointer = new NamespacePointer(parent, "prefix");
        nodeTest = mock(NodeTest.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        when(nodeTypeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_NODE);
        assertTrue(namespacepointer.testNode(nodeTypeTest));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_NodeTestIsNotInstanceOfNodeTypeTest_ReturnsFalse() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        namespacepointer = new NamespacePointer(parent, "prefix");
        nodeTest = mock(NodeTest.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        assertFalse(namespacepointer.testNode(nodeTest));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        namespacepointer = new NamespacePointer(parent, "prefix");
        assertFalse(namespacepointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testhashCode() throws Exception {
        parent = mock(DOMNodePointer.class);
        namespacepointer = new NamespacePointer(parent, prefix);
        assertEquals(prefix.hashCode(), namespacepointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_1() throws Exception {
        namespacePointer = new NamespacePointer(parent, prefix);
        QName qName = namespacePointer.getName();
        assertNotNull(qName);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_2() throws Exception {
        namespacePointer = new NamespacePointer(parent, prefix);
        QName qName = namespacePointer.getName();
        assertEquals(prefix, qName.getName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        parent = mock(DOMNodePointer.class);
        when(parent.asPath()).thenReturn("parent/path");
        namespacePointer = new NamespacePointer(parent, prefix);
        String result = namespacePointer.asPath();
        assertEquals("parent/path/namespace::testPrefix", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        namespacepointer = new NamespacePointer(parent, "prefix");
        int length = namespacepointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisLeaf() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        namespacepointer = new NamespacePointer(parent, "prefix");
        boolean result = namespacepointer.isLeaf();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath4_NBXp3() {
        NamespacePointer namespacePointer = new NamespacePointer(null, "prefix");
        assertEquals("namespace::prefix", namespacePointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testtestNode_NodeTestIsNotNodeTypeTest_ReturnsFalse_WPeV0() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        NamespacePointer namespacepointer = new NamespacePointer(parent, "prefix");
        assertTrue(namespacepointer.isLeaf());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_fiyL0_RPfc0() {
        KeywordVariables keywordVariables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        org.w3c.dom.Node node = null; // Node object needs to be created or mocked
        DOMNodePointer domNodePointer = new DOMNodePointer(node, new Locale("en"));
        NamespacePointer namespacePointer = new NamespacePointer(domNodePointer, "prefix");
        int hashCode = namespacePointer.hashCode();
        assertEquals("prefix".hashCode(), hashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        namespacePointer = new NamespacePointer(parent, prefix);
        QName qName = namespacePointer.getName();
        assertNotNull(qName);
        assertEquals(prefix, qName.getName());
    }
}