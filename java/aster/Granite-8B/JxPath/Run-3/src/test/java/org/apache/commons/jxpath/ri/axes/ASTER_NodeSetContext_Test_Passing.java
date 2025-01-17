/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NodeSetContext_Test_Passing {
    private NodeSet nodeSet;
    private NodeSetContext nodesetcontext;
    @Mock
    private NodeSet nodeSetMock;
    @Mock
    NamespaceContext namespaceContext;
    @Mock
    NodeTypeTest nodeTypeTest;
    @Mock
    BasicNodeSet basicNodeSet;
    private boolean startedSet = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        nodeSet = mock(NodeSet.class);
        nodesetcontext = new NodeSetContext(null, nodeSet);
        when(nodeSet.getPointers().size()).thenReturn(10);
        assertTrue(nodesetcontext.setPosition(5));
        assertFalse(nodesetcontext.setPosition(0));
        assertFalse(nodesetcontext.setPosition(11));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCurrentNodePointer() throws Exception {
        nodeSet = mock(BasicNodeSet.class);
        nodesetcontext = new NodeSetContext(null, nodeSet);
        when(nodeSet.getPointers()).thenReturn(Collections.singletonList(mock(NodePointer.class)));
        NodePointer currentNodePointer = nodesetcontext.getCurrentNodePointer();
        assertNotNull(currentNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_inje0() {
        NodeSetContext nodeSetContext = new NodeSetContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new BasicNodeSet());
        boolean result = nodeSetContext.setPosition(1);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithInvalidPosition_RzFp1() {
        NodeSetContext nodeSetContext = new NodeSetContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new BasicNodeSet());
        boolean result = nodeSetContext.setPosition(0);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_Cerg0() {
        NodeSetContext nodeSetContext = new NodeSetContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new BasicNodeSet());
        boolean result = nodeSetContext.nextNode();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_CtMH0() {
        NodeSetContext nodeSetContext = new NodeSetContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), null), new BasicNodeSet());
        NodePointer nodePointer = nodeSetContext.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeSet_UjPW0() {
        NodeSetContext nodeSetContext = new NodeSetContext(new SelfContext(null, new NodeTypeTest(1)), new BasicNodeSet());
        NodeSet nodeSet = nodeSetContext.getNodeSet();
        assertNotNull(nodeSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_1() throws Exception {
        nodeSet = mock(NodeSet.class);
        nodesetcontext = new NodeSetContext(null, nodeSet);
        when(nodeSet.getPointers().size()).thenReturn(10);
        assertTrue(nodesetcontext.setPosition(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_2() throws Exception {
        nodeSet = mock(NodeSet.class);
        nodesetcontext = new NodeSetContext(null, nodeSet);
        when(nodeSet.getPointers().size()).thenReturn(10);
        assertFalse(nodesetcontext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_3() throws Exception {
        nodeSet = mock(NodeSet.class);
        nodesetcontext = new NodeSetContext(null, nodeSet);
        when(nodeSet.getPointers().size()).thenReturn(10);
        assertFalse(nodesetcontext.setPosition(11));
    }
}