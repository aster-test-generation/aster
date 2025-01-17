/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
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
public class Aster_PrecedingOrFollowingContext_Test_Failing {
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private PrecedingOrFollowingContext precedingorfollowingcontext;
    private boolean reverse;
    private boolean setStarted = false;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private NodePointer currentNodePointer;
    @Mock
    private NodePointer currentRootLocation;
    @Mock
    private NodePointer parent;
    @Mock
    private NodeIterator iterator;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        namespaceContext = mock(NamespaceContext.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        // given
        when(precedingorfollowingcontext.nextNode()).thenReturn(true);
        // when
        boolean result = precedingorfollowingcontext.setPosition(5);
        // then
        verify(precedingorfollowingcontext, times(5)).nextNode();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_reset() throws Exception {
        namespaceContext = mock(NamespaceContext.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        // given
        when(precedingorfollowingcontext.nextNode()).thenReturn(false);
        // when
        boolean result = precedingorfollowingcontext.setPosition(5);
        // then
        verify(precedingorfollowingcontext).reset();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Tsqn0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        precedingOrFollowingContext.nextNode(); // Call nextNode to set currentRootLocation
        NodePointer nodePointer = precedingOrFollowingContext.getCurrentNodePointer();
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode() throws Exception {
        precedingorfollowingcontext = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        // given
        when(parentContext.getCurrentNodePointer()).thenReturn(currentRootLocation);
        when(currentRootLocation.getParent()).thenReturn(parent);
        when(parent.childIterator(null, true, currentRootLocation)).thenReturn(iterator);
        when(iterator.setPosition(anyInt())).thenReturn(true);
        when(iterator.getNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.testNode(nodeTest)).thenReturn(true);
        // when
        boolean result = precedingorfollowingcontext.nextNode();
        // then
        verify(parentContext, times(1)).getCurrentNodePointer();
        verify(currentRootLocation, times(1)).getParent();
        verify(parent, times(1)).childIterator(null, true, currentRootLocation);
        verify(iterator, times(1)).setPosition(anyInt());
        verify(iterator, times(1)).getNodePointer();
        verify(currentNodePointer, times(1)).testNode(nodeTest);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode6_iuwN5() {
        NodeTypeTest nodeTest = new NodeTypeTest(6);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext parentContext = new NamespaceContext(selfContext, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode8_DXza7() {
        NodeTypeTest nodeTest = new NodeTypeTest(8);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext parentContext = new NamespaceContext(selfContext, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode14_tNdR13() {
        NodeTypeTest nodeTest = new NodeTypeTest(14);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext parentContext = new NamespaceContext(selfContext, nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Hfpe0() throws Exception {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = mock(NodeTypeTest.class);
        NodePointer currentNodePointer = mock(NodePointer.class);
        PrecedingOrFollowingContext precedingorfollowingcontext = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        NodePointer result = precedingorfollowingcontext.getCurrentNodePointer();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Tsqn0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        NodePointer nodePointer = precedingOrFollowingContext.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_tqKX0() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode2_XDFp1() {
        NodeTypeTest nodeTest = new NodeTypeTest(2);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertFalse(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode3_BgBm2() {
        NodeTypeTest nodeTest = new NodeTypeTest(3);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode4_jjIc3() {
        NodeTypeTest nodeTest = new NodeTypeTest(4);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertFalse(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode5_FVCr4() {
        NodeTypeTest nodeTest = new NodeTypeTest(5);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode6_iuwN5_fid2() {
        NodeTypeTest nodeTest = new NodeTypeTest(6);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertFalse(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode7_IDvq6() {
        NodeTypeTest nodeTest = new NodeTypeTest(7);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode8_DXza7_fid2() {
        NodeTypeTest nodeTest = new NodeTypeTest(8);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertFalse(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode9_XNkn8() {
        NodeTypeTest nodeTest = new NodeTypeTest(9);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode10_ROdc9() {
        NodeTypeTest nodeTest = new NodeTypeTest(10);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertFalse(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode11_BNMk10() {
        NodeTypeTest nodeTest = new NodeTypeTest(11);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode12_imbM11() {
        NodeTypeTest nodeTest = new NodeTypeTest(12);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertFalse(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode13_RYAx12() {
        NodeTypeTest nodeTest = new NodeTypeTest(13);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode14_tNdR13_fid2() {
        NodeTypeTest nodeTest = new NodeTypeTest(14);
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, nodeTest), nodeTest);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        assertFalse(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Hfpe0_fid2() throws Exception {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = mock(NodeTypeTest.class);
        NodePointer currentNodePointer = mock(NodePointer.class);
        PrecedingOrFollowingContext precedingorfollowingcontext = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        when(precedingorfollowingcontext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        NodePointer result = precedingorfollowingcontext.getCurrentNodePointer();
        assertEquals(currentNodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_UbCM0_xRSX0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        precedingOrFollowingContext.nextNode(); // Call nextNode to set setStarted to true
        precedingOrFollowingContext.reset();
        assertFalse(precedingOrFollowingContext.nextNode()); // Check if nextNode returns false after reset
    }
}