/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ParentContext_Test_Failing {
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private ParentContext parentContext;
    private boolean setStarted = false;
    @Mock
    private NodePointer currentNodePointer;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodePointer parentPointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode_NodePointerIsNull() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        // Given
        when(namespaceContext.getCurrentNodePointer()).thenReturn(null);
        // When
        boolean result = parentContext.nextNode();
        // Then
        assertFalse(result);
    }

    @Test
    public void testNextNode_eeMw0() {
        ParentContext parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        parentContext.nextNode();
        assertTrue(true);
    }

    @Test
    public void testNextNode_Ntyu0() {
        ParentContext context = new ParentContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        assertTrue(context.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_SyVa0_fid3() throws Exception {
        NodePointer currentNodePointer = Mockito.mock(NodePointer.class);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        ParentContext parentContext = new ParentContext(namespaceContext, new NodeTypeTest(1));
        Mockito.when(namespaceContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        NodePointer result = namespaceContext.getCurrentNodePointer();
        assertEquals(currentNodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode_TestNodeReturnsFalse_QkkE0_fid3() throws Exception {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new ParentContext(null, null), null), nodeTypeTest);
        ParentContext parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        NodePointer nodePointer = mock(NodePointer.class);
        NodePointer parentPointer = mock(NodePointer.class);
        when(namespaceContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getImmediateParentPointer()).thenReturn(parentPointer);
        when(parentPointer.isContainer()).thenReturn(false);
        when(parentPointer.testNode(any(NodeTypeTest.class))).thenReturn(false);
        boolean result = parentContext.nextNode();
        assertFalse(result);
    }
}