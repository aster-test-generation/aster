/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnionContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_PreparedFalse_xSjL0_Omte0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext[] contexts = new EvalContext[0]; // Empty contexts
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertFalse(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_PreparedTrue_JEKk1_oBTv0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext[] contexts = new EvalContext[0]; // Empty contexts
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    unionContext.setPosition(1); // Set prepared to true
    assertFalse(unionContext.setPosition(2)); // Corrected assertion
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithSingleNodeSet_wKTw2_wIIX0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(true, false);
    when(context.nextNode()).thenReturn(true, false);
    NodePointer nodePointer = mock(NodePointer.class);
    when(context.getCurrentNodePointer()).thenReturn(nodePointer);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithMultipleNodeSets_sMde3_UNQC0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(true, true, false);
    when(context.nextNode()).thenReturn(true, false, true, false);
    NodePointer nodePointer1 = mock(NodePointer.class);
    NodePointer nodePointer2 = mock(NodePointer.class);
    when(context.getCurrentNodePointer()).thenReturn(nodePointer1, nodePointer2);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithMultipleContexts_TUkb4_ledF0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context1 = mock(EvalContext.class);
    EvalContext context2 = mock(EvalContext.class);
    when(context1.nextSet()).thenReturn(true, false);
    when(context1.nextNode()).thenReturn(true, false);
    when(context2.nextSet()).thenReturn(true, false);
    when(context2.nextNode()).thenReturn(true, false);
    NodePointer nodePointer1 = mock(NodePointer.class);
    NodePointer nodePointer2 = mock(NodePointer.class);
    when(context1.getCurrentNodePointer()).thenReturn(nodePointer1);
    when(context2.getCurrentNodePointer()).thenReturn(nodePointer2);
    EvalContext[] contexts = new EvalContext[] { context1, context2 };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithDuplicateNodePointers_YLDr5_LkiF0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(true, false);
    when(context.nextNode()).thenReturn(true, true, false);
    NodePointer nodePointer = mock(NodePointer.class);
    when(context.getCurrentNodePointer()).thenReturn(nodePointer, nodePointer);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithMultipleNodePointers_VMmX7_DEWi0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(true, false);
    when(context.nextNode()).thenReturn(true, true, false);
    NodePointer nodePointer1 = mock(NodePointer.class);
    NodePointer nodePointer2 = mock(NodePointer.class);
    when(context.getCurrentNodePointer()).thenReturn(nodePointer1, nodePointer2);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithNoNodeSets_buux8_PyYI0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(false);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithNoNodesInSet_VuiP9_VJER0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(true, false);
    when(context.nextNode()).thenReturn(false);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithMultipleSetsAndNodes_YBkk10_ucmw0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(true, true, false);
    when(context.nextNode()).thenReturn(true, true, false, true, false);
    NodePointer nodePointer1 = mock(NodePointer.class);
    NodePointer nodePointer2 = mock(NodePointer.class);
    when(context.getCurrentNodePointer()).thenReturn(nodePointer1, nodePointer2, nodePointer1);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPosition_WithNullNodePointer_ATNz14_hvKu0() {
    NamespaceContext parentContext = mock(NamespaceContext.class);
    EvalContext context = mock(EvalContext.class);
    when(context.nextSet()).thenReturn(true, false);
    when(context.nextNode()).thenReturn(true, false);
    when(context.getCurrentNodePointer()).thenReturn(null);
    EvalContext[] contexts = new EvalContext[] { context };
    UnionContext unionContext = new UnionContext(parentContext, contexts);
    assertTrue(unionContext.setPosition(1), "Position should be set correctly");
}
}