/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodeIterator_Test_Passing {
    private int position = 0;
    DOMNodeIterator domnodeiterator;
    Node node;
    NodePointer nodepointer;
    private Node child = null;
    private NodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPosition() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnodeiterator = new DOMNodeIterator(nodepointer, null, false, null);
        when(nodepointer.getNode()).thenReturn(node);
        when(node.getNodeType()).thenReturn(Node.ELEMENT_NODE);
        assertEquals(0, domnodeiterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_1() throws Exception {
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
        assertTrue(domnodeiterator.setPosition(5));
    }
}