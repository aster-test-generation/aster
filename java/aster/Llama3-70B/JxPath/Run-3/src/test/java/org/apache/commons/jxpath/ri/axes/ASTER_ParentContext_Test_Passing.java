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
public class Aster_ParentContext_Test_Passing {
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
    public void testsetPosition() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        boolean result = parentContext.setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_False() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        boolean result = parentContext.setPosition(2);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        int result = parentContext.getDocumentOrder();
        assertEquals(-1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        parentContext.reset();
        assertFalse(setStarted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_True_WTBl0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ParentContext parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        assertTrue(parentContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_False_zZwu1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ParentContext parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        assertFalse(parentContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode_ParentPointerIsNull() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        // Given
        when(namespaceContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getImmediateParentPointer()).thenReturn(null);
        // When
        boolean result = parentContext.nextNode();
        // Then
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode_TestNodeReturnsFalse() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        // Given
        when(namespaceContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getImmediateParentPointer()).thenReturn(parentPointer);
        when(parentPointer.isContainer()).thenReturn(false);
        when(parentPointer.testNode(nodeTypeTest)).thenReturn(false);
        // When
        boolean result = parentContext.nextNode();
        // Then
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_zzwb0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ParentContext parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        assertEquals(-1, parentContext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentPosition() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = new NamespaceContext(new SelfContext(namespaceContext, nodeTypeTest), nodeTypeTest);
        parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        int currentPosition = parentContext.getCurrentPosition();
        assertEquals(1, currentPosition);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentPosition_AKtf0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        ParentContext parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        int currentPosition = parentContext.getCurrentPosition();
        assertEquals(1, currentPosition);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_SyVa0() throws Exception {
        NodePointer currentNodePointer = Mockito.mock(NodePointer.class);
        NamespaceContext namespaceContext = Mockito.mock(NamespaceContext.class);
        Mockito.when(namespaceContext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        NodePointer result = namespaceContext.getCurrentNodePointer();
        assertSame(currentNodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextNode_TestNodeReturnsFalse_QkkE0() throws Exception {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        ParentContext parentContext = new ParentContext(namespaceContext, nodeTypeTest);
        NodePointer nodePointer = mock(NodePointer.class);
        NodePointer parentPointer = mock(NodePointer.class);
        when(namespaceContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getImmediateParentPointer()).thenReturn(parentPointer);
        when(parentPointer.isContainer()).thenReturn(false);
        when(parentPointer.testNode(any(NodeTypeTest.class))).thenReturn(false);
        boolean result = parentContext.nextNode();
        assertTrue(!result);
    }
}