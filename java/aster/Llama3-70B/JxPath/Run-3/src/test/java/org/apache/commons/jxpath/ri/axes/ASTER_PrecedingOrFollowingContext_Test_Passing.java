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
public class Aster_PrecedingOrFollowingContext_Test_Passing {
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private PrecedingOrFollowingContext precedingorfollowingcontext;
    private boolean reverse;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodePointer currentRootLocation;
    @Mock
    private NodePointer parent;
    @Mock
    private NodeIterator iterator;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_ReverseTrue_AAlI0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        assertEquals(-1, precedingOrFollowingContext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDocumentOrder_ReverseFalse_fHMA1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        assertEquals(1, precedingOrFollowingContext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode13_HKJE12() {
        NodeTypeTest nodeTest = new NodeTypeTest(13);
        SelfContext selfContext = new SelfContext(null, nodeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder_ReverseFalse_JjTY0() throws Exception {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        PrecedingOrFollowingContext precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        assertEquals(1, precedingorfollowingcontext.getDocumentOrder());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset_fid1() throws Exception {
        namespaceContext = Mockito.mock(NamespaceContext.class);
        nodeTypeTest = Mockito.mock(NodeTypeTest.class);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        setStarted = true;
        precedingorfollowingcontext.reset();
        assertTrue(setStarted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPosition_test2_MTuX1_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        assertTrue(precedingOrFollowingContext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_OnEE0_1_fid1() throws Exception {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        NodePointer currentNodePointer = Mockito.mock(NodePointer.class);
        PrecedingOrFollowingContext precedingorfollowingcontext = Mockito.mock(PrecedingOrFollowingContext.class);
        Mockito.when(precedingorfollowingcontext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        NodePointer result = precedingorfollowingcontext.getCurrentNodePointer();
        Assertions.assertEquals(currentNodePointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_OnEE0_2_fid1() throws Exception {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        NodePointer currentNodePointer = Mockito.mock(NodePointer.class);
        PrecedingOrFollowingContext precedingorfollowingcontext = Mockito.mock(PrecedingOrFollowingContext.class);
        Mockito.when(precedingorfollowingcontext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        NodePointer result = precedingorfollowingcontext.getCurrentNodePointer();
        Assertions.assertNotNull(result);
    }
}