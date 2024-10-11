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
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_DOMNodeIterator_Coverage_Test_Failing {
    private int position = 0;
    DOMNodeIterator domNodeIterator;
    Node node;
    NodePointer nodePointer;
    NodeTypeTest nodeTypeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_PositionZero_BxfS0_NrhB0() {
        DOMNodeIterator iterator = new DOMNodeIterator(new DOMNodePointer(null, null, null), new NodeTypeTest(0), false, null);
        iterator.setPosition(0);
        NodePointer pointer = iterator.getNodePointer();
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_GreaterThanPosition_MultipleCalls_DJmD7_dtud0_1() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        Node node = mock(Node.class);
        when(parent.getNode()).thenReturn(node);
        when(node.getFirstChild()).thenReturn(null);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(parent, new NodeTypeTest(0), false, null);
        domNodeIterator.setPosition(5);
        NodePointer nodePointer = domNodeIterator.getNodePointer();
        assertTrue(domNodeIterator.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_PositionNotZero_Mxxz1_Wgqp0() {
        DOMNodeIterator iterator = new DOMNodeIterator(new DOMNodePointer(null, null, null), new NodeTypeTest(0), false, null);
        iterator.setPosition(1);
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_GreaterThanPosition_MultipleCalls_DJmD7_dtud0_1_fid2() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(parent, new NodeTypeTest(0), false, null);
        domNodeIterator.setPosition(5);
        NodePointer nodePointer = domNodeIterator.getNodePointer();
        assertFalse(domNodeIterator.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_GreaterThanPosition_MultipleCalls_DJmD7_dtud0_2_fid2() throws Exception {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(parent, new NodeTypeTest(0), false, null);
        domNodeIterator.setPosition(5);
        NodePointer nodePointer = domNodeIterator.getNodePointer();
        assertNotNull(nodePointer);
    }
}