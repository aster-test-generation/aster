/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
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

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodeIterator_Test_Failing {
    private int position = 0;
    DOMNodeIterator domNodeIterator;
    Node node;
    DOMNodePointer domNodePointer;
    NodeTypeTest nodeTypeTest;
    DOMNodePointer nodePointer;
    private Node child = null;
    private NodePointer parent;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_HIhI0_1() throws Exception {
        Node node = mock(Node.class);
        VariablePointer parent = mock(VariablePointer.class);
        DOMNodePointer nodePointer = new DOMNodePointer(parent, node);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(nodePointer, new NodeTypeTest(1), false, nodePointer);
        NodePointer result = domNodeIterator.getNodePointer();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_HIhI0_3() throws Exception {
        Node node = mock(Node.class);
        VariablePointer parent = mock(VariablePointer.class);
        DOMNodePointer nodePointer = new DOMNodePointer(parent, node);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(nodePointer, new NodeTypeTest(1), false, nodePointer);
        NodePointer result = domNodeIterator.getNodePointer();
        assertEquals(node, ((DOMNodePointer) result).getNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_HIhI0_2_fid1() throws Exception {
        Node node = mock(Node.class);
        VariablePointer parent = mock(VariablePointer.class);
        DOMNodePointer nodePointer = new DOMNodePointer(parent, node);
        DOMNodeIterator domNodeIterator = new DOMNodeIterator(nodePointer, new NodeTypeTest(1), false, nodePointer);
        NodePointer result = domNodeIterator.getNodePointer();
        assertTrue(result instanceof DOMNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_Wjmo1_NNcl0_fid1() {
        org.w3c.dom.Document document = new org.apache.xerces.dom.DocumentImpl();
        Node node = document.createElement("root");
        DOMNodePointer parent = new DOMNodePointer(node, new Locale("en"));
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, true, parent);
        assertTrue(iterator.setPosition(1));
    }
}