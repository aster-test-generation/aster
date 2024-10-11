/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.ArrayList;
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
    NodeSetContext nodesetcontext;
    @Mock
    NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private boolean startedSet = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        nodeSet = mock(NodeSet.class);
        nodesetcontext = new NodeSetContext(null, nodeSet);
        when(nodeSet.getPointers().size()).thenReturn(5);
        assertTrue(nodesetcontext.setPosition(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCurrentNodePointer() throws Exception {
        nodeSet = mock(NodeSet.class);
        when(nodeSet.getPointers()).thenReturn(new ArrayList<>());
        nodesetcontext = new NodeSetContext(null, nodeSet);
        when(nodeSet.getPointers().size()).thenReturn(1);
        when(nodeSet.getPointers().get(0)).thenReturn(mock(NodePointer.class));
        NodePointer nodePointer = nodesetcontext.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodeSet() throws Exception {
        nodeSet = new BasicNodeSet();
        nodesetcontext = new NodeSetContext(parentContext, nodeSet);
        assertEquals(nodeSet, nodesetcontext.getNodeSet());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_RWIP0() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        assertTrue(nodeSetContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithValidPosition_lTuK0() throws Exception {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(parentContext, nodeSet);
        int position = 5;
        boolean result = nodeSetContext.setPosition(position);
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithInvalidPosition_uXch1() throws Exception {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(parentContext, nodeSet);
        int position = 0;
        boolean result = nodeSetContext.setPosition(position);
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWithMaximumPosition_sPQp2() throws Exception {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(parentContext, nodeSet);
        int position = nodeSet.getPointers().size();
        boolean result = nodeSetContext.setPosition(position);
        assert result == true;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeSet_bkFe0() throws Exception {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(parentContext, nodeSet);
        NodeSet result = nodeSetContext.getNodeSet();
        assertEquals(nodeSet, result);
    }
}