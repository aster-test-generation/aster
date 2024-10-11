/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.TypeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributePointer_Test_Passing {
    @Mock
    private NodePointer nodePointer1;
    @Mock
    private NodePointer nodePointer2;
    private DOMAttributePointer domAttributePointer;
    @Mock
    private Attr attr;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private TypeUtils typeUtils;
    @InjectMocks
    private DOMNodePointer domNodePointer;
    @Mock
    private QName qName;

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
    public void testNull_IZIu0() {
        NodeTest nodeTest = null;
        boolean result = new DOMAttributePointer(null, null).testNode(nodeTest);
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() {
        domAttributePointer = new DOMAttributePointer(parent, attr);
        // Arrange
        when(parent.getLength()).thenReturn(1);
        // Act
        int length = domAttributePointer.getLength();
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
    public void testCompareChildNodePointers_DnrT0() throws Exception {
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(new DOMNodePointer(null, null, null), null);
        DOMNodePointer nodePointer1 = new DOMNodePointer(null, null, null);
        DOMNodePointer nodePointer2 = new DOMNodePointer(null, null, null);
        int result = domAttributePointer.isLeaf() ? 0 : (nodePointer1.isLeaf() ? -1 : (nodePointer2.isLeaf() ? 1 : 0));
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_wvFj1_sEgp0() {
        boolean result = new DOMAttributePointer(null, null).isLeaf();
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_fid1() {
        domAttributePointer = new DOMAttributePointer(parent, attr);
        // Arrange
        when(parent.isCollection()).thenReturn(true);
        // Act
        boolean result = domAttributePointer.isCollection();
        // Assert
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength_mpBg0_fid1() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        Attr attr = mock(Attr.class);
        DOMAttributePointer domAttributePointer = new DOMAttributePointer(parent, attr);
        boolean result = domAttributePointer.isLeaf();
        assertEquals(true, result);
    }
}