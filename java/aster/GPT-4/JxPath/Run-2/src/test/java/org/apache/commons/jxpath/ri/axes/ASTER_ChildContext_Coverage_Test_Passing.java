/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChildContext_Coverage_Test_Passing {
    private NodeIterator iterator;
    private ChildContext childContext;
    private NamespaceContext namespaceContext;
    private NodeTypeTest nodeTypeTest;
@BeforeEach
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_SuperResetCalled_Slrh0() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = mock(NodeTypeTest.class);
        ChildContext childContext = new ChildContext(parentContext, nodeTest, true, false);
        childContext.reset();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_ReturnsFalse_WhenIteratorIsNotNullAndCannotSetPosition_gLsY4_gfSN0() throws Exception {
    ChildContext childContext = mock(ChildContext.class);
    when(childContext.getCurrentPosition()).thenReturn(1);
    when(childContext.setPosition(anyInt())).thenReturn(false);
    boolean result = childContext.nextNode();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_PositionIsZeroAndNextSetFalse_kxBE0_LJbI0() {
    ChildContext context = mock(ChildContext.class);
    when(context.getSingleNodePointer()).thenCallRealMethod();
    when(context.getCurrentPosition()).thenReturn(0);
    when(context.nextSet()).thenReturn(false);
    assertNull(context.getSingleNodePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_ReturnsTrue_WhenIteratorIsNotNullAndCanSetPosition_agIG3_OCek0_fid1() throws Exception {
    ChildContext childContext = mock(ChildContext.class);
    when(childContext.setPosition(anyInt())).thenReturn(true);
    boolean result = childContext.nextNode();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WhenOldPositionIsZero_hOXr1_ArBX0_fid1() throws Exception {
    ChildContext childContext = mock(ChildContext.class);
    when(childContext.getCurrentPosition()).thenReturn(0);
    when(childContext.setPosition(anyInt())).thenReturn(true);
    boolean result = childContext.setPosition(1);
    verify(childContext).setPosition(1);
    assertTrue(result);
}
}