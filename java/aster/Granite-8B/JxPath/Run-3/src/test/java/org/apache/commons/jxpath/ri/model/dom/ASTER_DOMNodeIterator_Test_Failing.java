/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodeIterator_Test_Failing {
    private int position = 0;
    DOMNodeIterator domnodeiterator;
    Node node;
    NodePointer nodepointer;
    private Node child = null;
    private NodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_2() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnodeiterator = new DOMNodeIterator(nodepointer, null, false, null);
        when(node.getNextSibling()).thenReturn(node);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getLastChild()).thenReturn(node);
        when(nodepointer.getNode()).thenReturn(node);
        when(node.getPreviousSibling()).thenReturn(node);
        // Test setPosition with a positive value
        // Test setPosition with a negative value
        // Test setPosition with a value greater than the total number of nodes
        when(node.getNextSibling()).thenReturn(null);
        assertFalse(domnodeiterator.setPosition(-5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_3() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnodeiterator = new DOMNodeIterator(nodepointer, null, false, null);
        when(node.getNextSibling()).thenReturn(node);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getLastChild()).thenReturn(node);
        when(nodepointer.getNode()).thenReturn(node);
        when(node.getPreviousSibling()).thenReturn(node);
        // Test setPosition with a positive value
        // Test setPosition with a negative value
        // Test setPosition with a value greater than the total number of nodes
        when(node.getNextSibling()).thenReturn(null);
        assertFalse(domnodeiterator.setPosition(10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnodeiterator = new DOMNodeIterator(parent, new NodeTypeTest(1), false, new DOMNodePointer(parent, node));
        when(node.getNextSibling()).thenReturn(node);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getLastChild()).thenReturn(node);
        when(nodepointer.getNode()).thenReturn(node);
        when(node.getPreviousSibling()).thenReturn(node);
        NodePointer result = domnodeiterator.getNodePointer();
        assertEquals(nodepointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnodeiterator = new DOMNodeIterator(nodepointer, null, false, null);
        when(node.getNextSibling()).thenReturn(node);
        when(node.getFirstChild()).thenReturn(node);
        when(node.getLastChild()).thenReturn(node);
        when(nodepointer.getNode()).thenReturn(node);
        when(node.getPreviousSibling()).thenReturn(node);
        // Test setPosition with a positive value
        assertTrue(domnodeiterator.setPosition(5));
        // Test setPosition with a negative value
        assertFalse(domnodeiterator.setPosition(-5));
        // Test setPosition with a value greater than the total number of nodes
        when(node.getNextSibling()).thenReturn(null);
        assertFalse(domnodeiterator.setPosition(10));
    }
}