/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import java.util.Stack;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DescendantContext_Test_Failing {
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private SelfContext selfContext;
@Mock
    private DescendantContext descendantContext;
@Mock
    private Object superObject;
private boolean setStarted = false;
@Mock
    private NodeTypeTest nodeTest;
private NodePointer currentNodePointer = null;
@Mock
    private NodePointer nodePointer;
private DescendantContext descendantcontext;
@Mock
    private NamespaceContext parentContext;
@Mock
    private Stack stack;
@Mock
    private NodeIterator nodeIterator;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_PositionNot0_YDkN1() {
        DescendantContext descendantContext = new DescendantContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), true, new NodeTypeTest(0));
        descendantContext.setPosition(1);
        NodePointer result = descendantContext.getCurrentNodePointer();
        assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisChildOrderingRequired() {
        descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        // Arrange
        when(descendantContext.isChildOrderingRequired()).thenReturn(true);
        // Act
        boolean result = descendantContext.isChildOrderingRequired();
        // Assert
        assertEquals(true, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_SetStartedTrue_PopStack_ReturnsFalse_rCkB0() {
    when(stack.isEmpty()).thenReturn(false);
    when(nodeIterator.setPosition(anyInt())).thenThrow(new Exception()); 
    descendantContext = new DescendantContext(parentContext, true, nodeTest);
    when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
    when(stack.isEmpty()).thenReturn(true);
    NodeIterator nodeIteratorMock = mock(NodeIterator.class);
    when(stack.peek()).thenReturn(nodeIteratorMock);
    when(nodeIteratorMock.setPosition(anyInt())).thenReturn(true);
    when(nodeIteratorMock.getNodePointer()).thenReturn(currentNodePointer);
    boolean result = descendantContext.nextNode();
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisChildOrderingRequired_RGqw0() {
    DescendantContext descendantContext;
    NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
    NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
    boolean result = namespaceContext.isChildOrderingRequired();
    descendantContext = new DescendantContext(namespaceContext,false, nodeTypeTest);
    assertEquals(true, namespaceContext.isChildOrderingRequired());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_SetStartedTrue_ReturnsTrue_fid3() {
        descendantContext = new DescendantContext(parentContext, true, nodeTest);
        when(parentContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        when(stack.isEmpty()).thenReturn(true);
        when(stack.peek()).thenReturn(nodeIterator);
        when(nodeIterator.setPosition(anyInt())).thenReturn(true);
        when(nodeIterator.getNodePointer()).thenReturn(currentNodePointer);
        when(stack.isEmpty()).thenReturn(false);
        when(nodeIterator.setPosition(anyInt())).thenReturn(true);
        boolean result = descendantContext.nextNode();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_bwKt0_fid3() throws Exception{
    DescendantContext descendantcontext = new DescendantContext(namespaceContext, true, nodeTest);
    NodePointer currentNodePointer = nodePointer;
    Mockito.when(nodePointer.getNode()).thenReturn(nodePointer);
    assertEquals(currentNodePointer, descendantcontext.getCurrentNodePointer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_SetStartedTrue_EmptyStack_ReturnsFalse_HDWb1_WmuK0_fid3() {
    DescendantContext descendantContext = new DescendantContext(new NamespaceContext(new SelfContext(null, null), null), false, new NodeTypeTest(0));
    boolean result = descendantContext.isChildOrderingRequired();
    Assertions.assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisChildOrderingRequired_RGqw0_fid3() {
    DescendantContext descendantContext;
    NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
    NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
    boolean result = namespaceContext.isChildOrderingRequired();
    descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
    assertEquals(true, namespaceContext.isChildOrderingRequired());
}
}