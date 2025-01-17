/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PrecedingOrFollowingContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_NukC0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), new NodeTypeTest(4), true);
        context.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithNullParentContext_VaJn1() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(null, new NodeTypeTest(1), true);
        context.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResetWithNullNodeTest_tmGf2() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), null, true);
        context.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionEqualToCurrentPosition_cSBJ2() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(0);
        assertEquals(0, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanZero_wscE3() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(-1);
        assertEquals(0, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionNegativeInfinity_mpEz7_LRGO0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition((int) Double.NEGATIVE_INFINITY);
        assertEquals(0, context.getPosition());
    }
}