/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMNamespaceIterator_Test_Passing {
    private int position = 0;
    private DOMNamespaceIterator domnamespaceiterator;
    private Node node;
    private NodePointer nodepointer;
    private List attributes;
    private NodePointer parent;
    private DOMNamespaceIterator domNamespaceIterator;
    private NodePointer nodePointer;
    private Attr attr;
    private List list;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPosition() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnamespaceiterator = new DOMNamespaceIterator(nodepointer);
        when(nodepointer.getNode()).thenReturn(node);
        when(node.getLocalName()).thenReturn("localName");
        when(node.getPrefix()).thenReturn("prefix");
        assertEquals(0, domnamespaceiterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPosition_ZyQv0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(domNodePointer);
        int position = domNamespaceIterator.getPosition();
        assertEquals(0, position);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_yGFW0() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(domNodePointer);
        boolean result = domNamespaceIterator.setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_sPlq1() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(domNodePointer);
        boolean result = domNamespaceIterator.setPosition(0);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_SDEs2() {
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(domNodePointer);
        boolean result = domNamespaceIterator.setPosition(2);
        assertFalse(result);
    }
}