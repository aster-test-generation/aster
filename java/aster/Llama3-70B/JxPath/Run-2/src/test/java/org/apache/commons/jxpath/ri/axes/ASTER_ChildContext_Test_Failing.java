/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ChildContext_Test_Failing {
    @Mock
    private NodeIterator iterator;
    private ChildContext childContext;
    private NodePointer nodePointer;
    private NamespaceContext parentContext;
    private NodeTypeTest nodeTest;
    @Mock
    private NodePointer pointer;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode() throws Exception {
        namespaceContext = mock(NamespaceContext.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        // given
        when(childContext.getCurrentPosition()).thenReturn(0);
        when(childContext.setPosition(1)).thenReturn(true);
        // when
        boolean result = childContext.nextNode();
        // then
        verify(childContext).getCurrentPosition();
        verify(childContext).setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_Position0_NextSetTrue_IteratorNull_ReturnNull_ApKN1_EcNE0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        childContext.setPosition(0);
        Pointer pointer = childContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_Position0_NextSetFalse_ReturnNull_BfpQ2_yeoq0_2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        childContext.setPosition(0);
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_KBNl0_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        assertTrue(childContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_CNuB0_RKUP0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        childContext.setPosition(1);
        assertTrue(childContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_CCot1_jSCc0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, true);
        childContext.setPosition(0);
        assertTrue(childContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_YfCS2_YCUv0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, true);
        childContext.setPosition(2);
        assertTrue(childContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_Sufg0_zglk0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        childContext.reset();
        assertNull(childContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_Position0_NextSetTrue_IteratorNull_ReturnNull_ApKN1_EcNE0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        childContext.setPosition(0);
        Pointer pointer = childContext.getSingleNodePointer();
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_Position0_NextSetFalse_ReturnNull_BfpQ2_yeoq0_1_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, true, false);
        childContext.setPosition(0);
        Pointer pointer = childContext.getSingleNodePointer();
        assertFalse(childContext.nextNode());
    }
}