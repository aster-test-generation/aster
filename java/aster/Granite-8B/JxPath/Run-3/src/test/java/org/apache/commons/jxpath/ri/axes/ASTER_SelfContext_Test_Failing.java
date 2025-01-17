/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SelfContext_Test_Failing {
    private NodeTest nodeTest;
    private boolean startedSet = false;
    private NodePointer nodePointer;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private SelfContext selfcontext;
    NamespaceContext namespaceContext;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset() throws Exception {
        selfcontext = new SelfContext(Mockito.mock(NamespaceContext.class), Mockito.mock(NodeTypeTest.class));
        selfcontext.reset();
        verify(selfcontext, times(1)).reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_qjNb0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        Pointer pointer = selfContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode() {
        selfcontext = new SelfContext(parentContext, nodeTest);
        // Mock the behavior of the nextNode method
        when(selfcontext.nextNode()).thenReturn(true);
        // Call the nextNode method and assert the expected result
        assertTrue(selfcontext.nextNode());
        // Verify that the nextNode method was called once
        verify(selfcontext, times(1)).nextNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer1_hKjp0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        NodePointer nodePointer = selfContext.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer2_IBHm1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        NodePointer nodePointer = selfContext.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer3_vwqz2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        NodePointer nodePointer = selfContext.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }
}