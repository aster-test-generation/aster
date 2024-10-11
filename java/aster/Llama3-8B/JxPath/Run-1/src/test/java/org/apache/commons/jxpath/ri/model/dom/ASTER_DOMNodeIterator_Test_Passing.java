/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNodeIterator_Test_Passing {
    private int position = 0;
    @Mock
    private Node node;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private DOMNodePointer domNodePointer;
    private Node child = null;
    private NodePointer parent;
    @Mock
    private NodePointer nodepointer;
    @Mock
    private DOMNodePointer domnodepointer;
    @Mock
    private DOMNodeIterator domnodeiterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition() throws Exception {
        node = mock(Node.class);
        nodePointer = mock(NodePointer.class);
        domNodePointer = mock(DOMNodePointer.class);
        domnodeiterator = new DOMNodeIterator(domNodePointer, new NodeTypeTest(1), false, nodePointer);
        when(domNodePointer.getNode()).thenReturn(node);
        when(nodePointer.getNode()).thenReturn(node);
        assertEquals(0, domnodeiterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionZero_otJC1_aNiv0() {
        DOMNodePointer parent = new DOMNodePointer(null, Locale.US, "id");
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        DOMNodeIterator iterator = new DOMNodeIterator(parent, nodeTest, false, null);
        iterator.setPosition(0);
        try {
            Field positionField = DOMNodeIterator.class.getDeclaredField("position");
            positionField.setAccessible(true);
            int position = (int) positionField.get(iterator);
            Assertions.assertEquals(0, position);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_Stel0() throws Exception {
        Node node = mock(Node.class);
        NodePointer nodepointer = mock(NodePointer.class);
        DOMNodePointer domnodepointer = mock(DOMNodePointer.class);
        DOMNodeIterator domnodeiterator = mock(DOMNodeIterator.class);
        NodePointer parent = mock(NodePointer.class);
        when(domnodeiterator.getNodePointer()).thenReturn(nodepointer);
        assertEquals(nodepointer, domnodeiterator.getNodePointer());
    }
}