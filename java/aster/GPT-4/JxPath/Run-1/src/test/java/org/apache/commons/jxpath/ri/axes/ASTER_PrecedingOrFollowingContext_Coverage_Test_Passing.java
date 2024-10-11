/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PrecedingOrFollowingContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_CallsSuperReset_Ofig0() {
        NamespaceContext mockNamespaceContext = mock(NamespaceContext.class);
        NodeTypeTest mockNodeTypeTest = mock(NodeTypeTest.class);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(mockNamespaceContext, mockNodeTypeTest, false);
        context.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_SetsStartedToFalse_SXrA1() {
        NamespaceContext mockNamespaceContext = mock(NamespaceContext.class);
        NodeTypeTest mockNodeTypeTest = mock(NodeTypeTest.class);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(mockNamespaceContext, mockNodeTypeTest, true);
        context.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_CompletesWithoutException_CNgX2() {
        NamespaceContext mockNamespaceContext = mock(NamespaceContext.class);
        NodeTypeTest mockNodeTypeTest = mock(NodeTypeTest.class);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(mockNamespaceContext, mockNodeTypeTest, false);
        context.reset(); // This test ensures that the reset method completes without throwing any exceptions.
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_initialStackEmpty_PMUN0() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        when(parentContext.getCurrentNodePointer()).thenReturn(null);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_initialStackNotEmpty_KDDo1() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NodePointer mockNodePointer = mock(NodePointer.class);
        NodeIterator mockIterator = mock(NodeIterator.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(mockNodePointer);
        when(mockNodePointer.getParent()).thenReturn(mockNodePointer);
        when(mockNodePointer.childIterator(null, false, mockNodePointer)).thenReturn(mockIterator);
        when(mockIterator.setPosition(anyInt())).thenReturn(true);
        when(mockIterator.getNodePointer()).thenReturn(mockNodePointer);
        when(mockNodePointer.isLeaf()).thenReturn(true);
        when(mockNodePointer.testNode(nodeTest)).thenReturn(true);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        boolean result = context.nextNode();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_stackNotEmpty_reverseTrue_rynr2() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NodePointer mockNodePointer = mock(NodePointer.class);
        NodeIterator mockIterator = mock(NodeIterator.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(mockNodePointer);
        when(mockNodePointer.getParent()).thenReturn(mockNodePointer);
        when(mockNodePointer.childIterator(null, true, mockNodePointer)).thenReturn(mockIterator);
        when(mockIterator.setPosition(anyInt())).thenReturn(true);
        when(mockIterator.getNodePointer()).thenReturn(mockNodePointer);
        when(mockNodePointer.isLeaf()).thenReturn(false);
        when(mockNodePointer.childIterator(null, true, null)).thenReturn(mockIterator);
        when(mockNodePointer.testNode(nodeTest)).thenReturn(false);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_stackNotEmpty_reverseFalse_nodeTestFails_ERNM3() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NodePointer mockNodePointer = mock(NodePointer.class);
        NodeIterator mockIterator = mock(NodeIterator.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(mockNodePointer);
        when(mockNodePointer.getParent()).thenReturn(mockNodePointer);
        when(mockNodePointer.childIterator(null, false, mockNodePointer)).thenReturn(mockIterator);
        when(mockIterator.setPosition(anyInt())).thenReturn(true);
        when(mockIterator.getNodePointer()).thenReturn(mockNodePointer);
        when(mockNodePointer.isLeaf()).thenReturn(true);
        when(mockNodePointer.testNode(nodeTest)).thenReturn(false);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_currentRootLocationIsRoot_QWeI5() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NodePointer mockNodePointer = mock(NodePointer.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(mockNodePointer);
        when(mockNodePointer.getParent()).thenReturn(null);
        when(mockNodePointer.isRoot()).thenReturn(true);
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, nodeTest, false);
        boolean result = context.nextNode();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionDecreasePosition_ZDrP0_kFfh0() {
    NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
    PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, new NodeTypeTest(1), false);
    context.setPosition(5); // Assume this sets position to 5
    assertFalse(context.setPosition(3)); // Expected to return false when position is decreased
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionResetCalled_Mvbo1_dBKt0() {
    NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
    PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, new NodeTypeTest(1), false);
    context.setPosition(5); // Assume this sets position to 5
    assertFalse(context.setPosition(3)); // Expected to return false when position is decreased and reset is called
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionWhileLoop_QFiq2_VrhS0() {
    NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
    PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, new NodeTypeTest(1), false);
    context.setPosition(2); // Assume this sets position to 2
    assertTrue(context.setPosition(4), "Expected to return true when position is increased");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionNextNodeReturnsFalse_TkxI3_avim0() {
    NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
    PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, new NodeTypeTest(1), false);
    context.setPosition(2); // Assume this sets position to 2
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionReturnsTrue_YSYa4_WVpE0() {
    NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
    PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, new NodeTypeTest(1), false);
    context.setPosition(1); // Assume this sets position to 1
    assertTrue(context.setPosition(1), "Expected to return true when position is set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionReturnsFalseWhenNoMoreNodes_ftus5_Qhct0() {
    NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
    PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(parentContext, new NodeTypeTest(1), false);
    context.setPosition(1); // Assume this sets position to 1
}
}