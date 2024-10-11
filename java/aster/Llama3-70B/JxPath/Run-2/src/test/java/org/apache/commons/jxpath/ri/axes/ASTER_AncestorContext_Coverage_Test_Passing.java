/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
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
public class Aster_AncestorContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_PositionGreaterThanCurrentPosition_NextNodeReturnsFalse_ReturnFalse_iQoU3() {
        AncestorContext ancestorContext = new AncestorContext(mock(NamespaceContext.class), true, mock(NodeTypeTest.class));
        when(ancestorContext.getCurrentPosition()).thenReturn(5);
        when(ancestorContext.nextNode()).thenReturn(false);
        boolean result = ancestorContext.setPosition(10);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IncludeSelfFalse_NodeTestTrue_iOaO2() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        AncestorContext ancestorContext = new AncestorContext(parentContext, false, nodeTest);
        NodePointer currentNodePointer = mock(NodePointer.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.testNode(nodeTest)).thenReturn(true);
        boolean result = ancestorContext.nextNode();
        assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_GetImmediateParentPointer_irvb4() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        AncestorContext ancestorContext = new AncestorContext(parentContext, true, nodeTest);
        NodePointer currentNodePointer = mock(NodePointer.class);
        NodePointer parentPointer = mock(NodePointer.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.getImmediateParentPointer()).thenReturn(parentPointer);
        ancestorContext.nextNode();
        boolean result = ancestorContext.nextNode();
        assertTrue(result);
        verify(currentNodePointer).getImmediateParentPointer();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_CurrentNodePointerNull_vLeT5() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        AncestorContext ancestorContext = new AncestorContext(parentContext, true, nodeTest);
        NodePointer currentNodePointer = mock(NodePointer.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(currentNodePointer.getImmediateParentPointer()).thenReturn(null);
        ancestorContext.nextNode();
        boolean result = ancestorContext.nextNode();
        assertFalse(result);
}
}