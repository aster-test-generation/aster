/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChildContext_Coverage_Test_Failing {
    private NodeIterator iterator;
    private ChildContext childContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_gNue0() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        ChildContext childContext = new ChildContext(parentContext, nodeTest, true, false);
        when(childContext.getCurrentPosition()).thenReturn(5);
        when(childContext.setPosition(6)).thenReturn(true);
        boolean result = childContext.nextNode();
        assertTrue(result);
        verify(childContext).setPosition(6);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_PositionIsZeroAndNextSetPreparesWithNullIterator_gLET1_zPix0() {
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
    when(childContext.nextSet()).thenReturn(true).thenReturn(false);
    when(childContext.getSingleNodePointer()).thenReturn(null);
    assertNull(childContext.getSingleNodePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_PositionIsNotZero_hvSy4_cgQm0() {
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
    NodePointer nodePointer = mock(NodePointer.class);
    childContext.setPosition(1);
    when(childContext.getCurrentNodePointer()).thenReturn(nodePointer);
    assertEquals(nodePointer, childContext.getSingleNodePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_CurrentNodePointerIsNull_lHWJ9_GrBQ0() {
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
    when(childContext.getCurrentPosition()).thenReturn(1);
    when(childContext.getCurrentNodePointer()).thenReturn(null);
    assertNull(childContext.getSingleNodePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_PositionIsNotZero_hvSy4_cgQm0_fid1() {
    NamespaceContext namespaceContext = mock(NamespaceContext.class);
    NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
    ChildContext childContext = new ChildContext(namespaceContext, nodeTypeTest, false, false);
    NodePointer nodePointer = mock(NodePointer.class);
    childContext.setPosition(1);
    when(childContext.getCurrentNodePointer()).thenReturn(nodePointer);
    assertNull(nodePointer);
}
}