/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.ArrayList;
import java.util.List;
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
import org.mockito.Mockito;
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
    @Mock
    private NodeSet nodeSet;
    private NodeSetContext nodeSetContext;
    private NamespaceContext namespaceContext;
    private BasicNodeSet basicNodeSet;
    private NodePointer nodePointer;
    @Mock
    private NamespaceContext parentContext;
    private NodeSetContext nodesetcontext;
    private boolean startedSet = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer1_mpOc0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        nodeSetContext.nextSet(); // Call nextSet to set startedSet to true
        nodeSetContext.setPosition(1);
        boolean result = nodeSetContext.nextSet(); // Check if nextSet returns false
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer2_NYLk1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        nodeSetContext.setPosition(0);
        NodePointer nodePointer = nodeSetContext.getCurrentNodePointer();
        assertNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_gQWn0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        assertFalse(nodeSetContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeSet_zbhh0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, nodeTypeTest), nodeTypeTest), nodeTypeTest);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        NodeSet nodeSet = nodeSetContext.getNodeSet();
        assertNotNull(nodeSet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet_1() throws Exception {
        basicNodeSet = mock(BasicNodeSet.class);
        namespaceContext = mock(NamespaceContext.class);
        nodesetcontext = new NodeSetContext(namespaceContext, basicNodeSet);
        assertTrue(nodesetcontext.nextSet());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_StartedSetFalse_dUGO0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        assertTrue(nodeSetContext.nextSet());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextSet_StartedSetTrue_CLwH1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, basicNodeSet);
        nodeSetContext.nextSet(); // set startedSet to true
        assertFalse(nodeSetContext.nextSet());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_UqXa0_1() throws Exception {
        NodeSet nodeSet = Mockito.mock(NodeSet.class);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, new BasicNodeSet());
        List pointers = new ArrayList();
        for (int i = 0;i < 10;i++) {
            pointers.add(new Object());
        }
        when(nodeSet.getPointers()).thenReturn(pointers);
        assertTrue(nodeSetContext.nextSet());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_UqXa0_4() throws Exception {
        NodeSet nodeSet = Mockito.mock(NodeSet.class);
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, new BasicNodeSet());
        List pointers = new ArrayList();
        for (int i = 0;i < 10;i++) {
            pointers.add(new Object());
        }
        when(nodeSet.getPointers()).thenReturn(pointers);
        assertFalse(nodeSetContext.setPosition(11));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet() throws Exception {
        basicNodeSet = mock(BasicNodeSet.class);
        namespaceContext = mock(NamespaceContext.class);
        nodesetcontext = new NodeSetContext(namespaceContext, basicNodeSet);
        assertTrue(nodesetcontext.nextSet());
        assertFalse(nodesetcontext.nextSet());
    }
}