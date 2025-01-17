/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PrecedingOrFollowingContext_Test_Failing {
    @Mock
    private NamespaceContext namespacecontext;
    @Mock
    private NodeTypeTest nodetypetest;
    @Mock
    private SelfContext selfcontext;
    private PrecedingOrFollowingContext precedingorfollowingcontext;
    private boolean reverse;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private NodeTest nodeTest;
    private NodePointer currentRootLocation;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsLessThanCurrentPosition_GISU0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(5);
        assertEquals(5, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsGreaterThanCurrentPosition_ssEk1() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(10);
        assertEquals(10, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsGreaterThanSize_kHhJ5() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(100);
        assertEquals(100, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NSwn0_ccYD0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        PrecedingOrFollowingContext precedingOrFollowingContext = new PrecedingOrFollowingContext(selfContext, new NodeTypeTest(1), true);
        boolean result = precedingOrFollowingContext.nextNode();
        org.junit.jupiter.api.Assertions.assertFalse(result);
    }
}