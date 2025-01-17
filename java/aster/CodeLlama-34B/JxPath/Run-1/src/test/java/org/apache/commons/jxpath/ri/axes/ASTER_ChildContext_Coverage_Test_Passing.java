/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChildContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset1_pyfb0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, false);
        childContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset2_rOhe1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), false, true);
        childContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset3_RGsQ2() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), false, false);
        childContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_JIep1() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointerWhenPositionIsZeroAndSetPositionReturnsFalse_ONaS0_rVov0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, false);
        childContext.setPosition(0);
        childContext.setPosition(1);
        assertNull(childContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointerWhenPositionIsNotZeroAndIteratorIsNull_pxbD2_vNeS0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, false);
        childContext.setPosition(1);
        assertNull(childContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_positionNot0_blvE6_SfHO0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), true, false);
        childContext.setPosition(1);
        childContext.getSingleNodePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ACak0_fid1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, false);
        assertFalse(childContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointerWhenPositionIsZeroAndSetPositionReturnsTrue_GWCv1_JBgq0_fid1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, false);
        childContext.setPosition(1);
    }
}