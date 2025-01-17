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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_DOMNodeIterator_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPositionNext_zDBO1_jZpI0() throws Exception {
        Node node = mock(Node.class);
        NodePointer nodePointer = mock(NodePointer.class);
        when(nodePointer.getNode()).thenReturn(node);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(nodePointer, new NodeTypeTest(1), false, null);
        domNodeIterator.getNodePointer(); // call the method under test
        verify(nodePointer, times(1)).getNode();
        assertEquals(1, domNodeIterator.getPosition()); // fixed code
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPositionPrevious_pYNe3_oRmj0() throws Exception {
        Node node = mock(Node.class);
        NodePointer nodePointer = mock(NodePointer.class);
        when(nodePointer.getNode()).thenReturn(node);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(nodePointer, new NodeTypeTest(1), false, null);
        when(node.getPreviousSibling()).thenReturn(null);
        domNodeIterator.getNodePointer();
        verify(nodePointer, times(1)).getNode();
        verify(node, times(1)).getPreviousSibling();
    }
}