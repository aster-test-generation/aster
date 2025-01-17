/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
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
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DescendantContext_Test_Passing {
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private DescendantContext descendantContext;
    private NodePointer currentNodePointer;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeIterator nodeIterator;
    private boolean setStarted = false;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset() throws Exception {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        descendantContext = new DescendantContext(namespaceContext, true, new NodeTypeTest(1));
        descendantContext.reset();
        assertFalse(setStarted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Position0_SetPositionFalse_Jzmi0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext parentContext = new NamespaceContext(null, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(parentContext, true, nodeTypeTest);
        descendantContext.setPosition(0);
        Assertions.assertNull(descendantContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_iFju0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode2_vfTJ1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, false, nodeTypeTest);
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisChildOrderingRequired() throws Exception {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = mock(NodeTypeTest.class);
        descendantContext = new DescendantContext(parentContext, true, nodeTest);
        boolean result = descendantContext.isChildOrderingRequired();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequired_PRQs0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        assertTrue(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_dIZN0_tFHI0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        descendantContext.reset();
        assertTrue(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode3_karp2_lLSg0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        assertTrue(descendantContext.isChildOrderingRequired());
    }
}