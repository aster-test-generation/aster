/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PrecedingOrFollowingContext_Test_Failing {
    PrecedingOrFollowingContext precedingorfollowingcontext;
    NamespaceContext namespaceContext;
    NodeTypeTest nodeTypeTest;
    private boolean reverse;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private NodePointer currentRootLocation;
    private Stack stack = null;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeIterator nodeIterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_fYvx0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), new NodeTypeTest(0), true);
        boolean result = context.setPosition(1);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_wUGE2() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), new NodeTypeTest(0), true);
        boolean result = context.setPosition(2);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition4_Yzwr3() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), new NodeTypeTest(0), true);
        boolean result = context.setPosition(3);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset() {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = mock(NodeTypeTest.class);
        precedingorfollowingcontext = new PrecedingOrFollowingContext(parentContext, nodeTest, true);
        precedingorfollowingcontext.reset();
        verify(precedingorfollowingcontext, times(1)).reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCurrentNodePointer() {
        MockitoAnnotations.openMocks(this);
        when(precedingorfollowingcontext.getCurrentNodePointer()).thenReturn(currentNodePointer);
        // Test the behavior of getCurrentNodePointer method
        // Assert the expected behavior of the method
        // For example:
        // Assertions.assertEquals(expectedValue, precedingorfollowingcontext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_bmvu0() {
        SelfContext selfContext = new SelfContext(null, null);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(selfContext, null, false);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_luqY1() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, null, false);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IgOA2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(null, nodeTypeTest, false);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_QPrC3() {
        SelfContext selfContext = new SelfContext(null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(selfContext, nodeTypeTest, false);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_CGzq4() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, false);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_jKcM5() {
        SelfContext selfContext = new SelfContext(null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(selfContext, nodeTypeTest, true);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_jlfx6() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_myqk1_fid2() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), new NodeTypeTest(0), true);
        boolean result = context.setPosition(0);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_wUGE2_fid2() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), new NodeTypeTest(0), true);
        boolean result = context.setPosition(2);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition4_Yzwr3_fid2() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(0)), new NodeTypeTest(0), true);
        boolean result = context.setPosition(3);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_jlfx6_fid2() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(namespaceContext, nodeTypeTest, true);
        boolean result = precedingOrFollowingContext.nextNode();
        Assertions.assertTrue(result);
    }
}