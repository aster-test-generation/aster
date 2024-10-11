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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodeIterator_Test_Passing {
    private int position = 0;
    DOMNodeIterator domNodeIterator;
    Node node;
    DOMNodePointer nodePointer;
    NodeTypeTest nodeTypeTest;
    private Node child = null;
    private NodePointer parent;
    DOMNodePointer startWith;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition() throws Exception {
        node = mock(Node.class);
        nodePointer = mock(DOMNodePointer.class);
        nodeTypeTest = new NodeTypeTest(1);
        domNodeIterator = new DOMNodeIterator(nodePointer, nodeTypeTest, false, null);
        assertEquals(0, domNodeIterator.getPosition());
    }
}