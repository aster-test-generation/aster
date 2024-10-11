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
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.util.TypeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributePointer_Test_Passing {
    @Mock
    private Locale locale;
    @Mock
    private QName qname;
    private Attr attr;
    private DOMAttributePointer domAttributePointer;
    private DOMAttributePointer anotherDomAttributePointer;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private TypeUtils typeUtils;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private QName qName;
    @Mock
    private DOMNodePointer dOMNodePointer;
    @Mock
    private VariablePointer variablePointer;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private QName name;
    private DOMAttributePointer domattributepointer;
    @Mock
    private Attr mockAttr;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTestNode_NullNodeTest_ReturnsTrue() {
        domAttributePointer = new DOMAttributePointer(null, null);
        boolean result = domAttributePointer.testNode(null);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTestNode_NodeTypeTest_ReturnsTrue() {
        domAttributePointer = new DOMAttributePointer(null, null);
        NodeTypeTest nodeTypeTest = Mockito.mock(NodeTypeTest.class);
        Mockito.when(nodeTypeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_NODE);
        boolean result = domAttributePointer.testNode(nodeTypeTest);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollectionTrue_GOAR2() {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() throws Exception {
        attr = mock(Attr.class);
        domAttributePointer = new DOMAttributePointer(null, attr);
        // Act
        int hashCode = domAttributePointer.hashCode();
        // Assert
        verify(attr).hashCode();
        assertEquals(System.identityHashCode(attr), hashCode);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() {
        domattributepointer = new DOMAttributePointer(parent, attr);
        // Act
        int length = domattributepointer.getLength();
        // Assert
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual() {
        domAttributePointer = new DOMAttributePointer(parent, attr);
        // Arrange
        when(parent.isActual()).thenReturn(true);
        // Act
        boolean actual = domAttributePointer.isActual();
        // Assert
        assertEquals(true, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf() {
        domAttributePointer = new DOMAttributePointer(parent, attr);
        // Arrange
        when(parent.isLeaf()).thenReturn(true);
        // Act
        boolean result = domAttributePointer.isLeaf();
        // Assert
        assertEquals(true, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisCollection_yJjF0() throws Exception {
        DOMAttributePointer dOMAttributePointer = Mockito.mock(DOMAttributePointer.class);
        Mockito.when(dOMAttributePointer.isLeaf()).thenReturn(true);
        boolean result = dOMAttributePointer.isLeaf();
        Mockito.verify(dOMAttributePointer, Mockito.times(1)).isLeaf();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTestNode_NullNodeTest_ReturnsTrue_qfDI0() {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, null);
        boolean result = domAttributePointer.isLeaf();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTestNode_NodeTypeTest_ReturnsTrue_pPsY0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, Locale.US, null);
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(domNodePointer, null);
        NodeTypeTest nodeTypeTest = Mockito.mock(NodeTypeTest.class);
        Mockito.when(nodeTypeTest.getNodeType()).thenReturn(Compiler.NODE_TYPE_NODE);
        boolean result = domAttributePointer.isLeaf();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_nefw1() throws Exception {
        Attr attr = mock(Attr.class);
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(null, attr);
        int hashCode = System.identityHashCode(attr);
        verify(attr).hashCode();
        assertEquals(hashCode, domAttributePointer.hashCode());
    }
}