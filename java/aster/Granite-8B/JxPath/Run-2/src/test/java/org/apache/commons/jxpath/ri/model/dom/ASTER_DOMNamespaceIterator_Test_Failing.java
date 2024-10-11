/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
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
public class Aster_DOMNamespaceIterator_Test_Failing {
    private int position = 0;
    DOMNamespaceIterator domnamespaceiterator;
    Node node;
    NodePointer nodepointer;
    private List attributes;
    private NodePointer parent;
    private Attr attr;
    private List list;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPosition() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnamespaceiterator = new DOMNamespaceIterator(nodepointer);
        when(nodepointer.getNode()).thenReturn(node);
        assertEquals(0, domnamespaceiterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPosition3_cvTk2() {
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(new VariablePointer(new QName("qualifiedName")));
        assertEquals(0, domNamespaceIterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPosition4_uzFN3() {
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(new VariablePointer(new QName("prefix", "localName")));
        assertEquals(0, domNamespaceIterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_1() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnamespaceiterator = new DOMNamespaceIterator(nodepointer);
        when(nodepointer.getNode()).thenReturn(node);
        // Test when position is valid
        // Test when position is out of range
        assertTrue(domnamespaceiterator.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_2() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnamespaceiterator = new DOMNamespaceIterator(nodepointer);
        when(nodepointer.getNode()).thenReturn(node);
        // Test when position is valid
        // Test when position is out of range
        assertFalse(domnamespaceiterator.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_3() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnamespaceiterator = new DOMNamespaceIterator(nodepointer);
        when(nodepointer.getNode()).thenReturn(node);
        // Test when position is valid
        // Test when position is out of range
        assertFalse(domnamespaceiterator.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_FUBi0() {
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(null);
        boolean result = domNamespaceIterator.setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_qQot2() {
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(null);
        boolean result = domNamespaceIterator.setPosition(0);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_qQot2_fid2() {
        DOMNamespaceIterator domNamespaceIterator = new DOMNamespaceIterator(null);
        boolean result = domNamespaceIterator.setPosition(-1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        node = mock(Node.class);
        nodepointer = mock(NodePointer.class);
        domnamespaceiterator = new DOMNamespaceIterator(nodepointer);
        when(nodepointer.getNode()).thenReturn(node);
        // Test when position is valid
        assertTrue(domnamespaceiterator.setPosition(1));
        // Test when position is out of range
        assertFalse(domnamespaceiterator.setPosition(0));
        assertFalse(domnamespaceiterator.setPosition(2));
    }
}