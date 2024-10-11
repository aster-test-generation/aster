/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
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
public class Aster_SelfContext_Test_Passing {
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private SelfContext selfContext;
    private boolean startedSet = false;
    NamespaceContext namespaceContext;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = mock(NamespaceContext.class);
        nodePointer = mock(NodePointer.class);
        selfContext = new SelfContext(parentContext, nodeTypeTest);
        when(parentContext.getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.testNode(nodeTypeTest)).thenReturn(true);
        boolean result = selfContext.setPosition(1);
        assertTrue(result);
        verify(parentContext, times(1)).getCurrentNodePointer();
        verify(nodePointer, times(1)).testNode(nodeTypeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_invalidPosition() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = mock(NamespaceContext.class);
        nodePointer = mock(NodePointer.class);
        selfContext = new SelfContext(parentContext, nodeTypeTest);
        boolean result = selfContext.setPosition(2);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_nodePointerIsNull() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = mock(NamespaceContext.class);
        nodePointer = mock(NodePointer.class);
        selfContext = new SelfContext(parentContext, nodeTypeTest);
        when(parentContext.getCurrentNodePointer()).thenReturn(null);
        boolean result = selfContext.setPosition(1);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_nodeTestIsNull() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = mock(NamespaceContext.class);
        nodePointer = mock(NodePointer.class);
        selfContext = new SelfContext(parentContext, nodeTypeTest);
        selfContext = new SelfContext(parentContext, null);
        when(parentContext.getCurrentNodePointer()).thenReturn(nodePointer);
        boolean result = selfContext.setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        parentContext = new NamespaceContext(null, nodeTypeTest);
        selfContext = new SelfContext(parentContext, nodeTypeTest);
        // Act
        selfContext.reset();
        // Assert
        assertFalse(startedSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer() throws Exception {
        nodeTypeTest = new NodeTypeTest(1);
        namespaceContext = mock(NamespaceContext.class);
        selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        pointer = mock(Pointer.class);
        when(namespaceContext.getSingleNodePointer()).thenReturn(pointer);
        Pointer result = selfContext.getSingleNodePointer();
        assertEquals(pointer, result);
        verify(namespaceContext, times(1)).getSingleNodePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_2_AUuR1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        assertFalse(selfContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Position0_SetPositionReturnsFalse_sfIa0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, nodeTypeTest), nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        selfContext.setPosition(0);
        Assertions.assertNull(selfContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_qPpM0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        NodePointer pointer = selfContext.getCurrentNodePointer();
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_RzpM0_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_3_DVNS2_fid2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, null);
    }
}