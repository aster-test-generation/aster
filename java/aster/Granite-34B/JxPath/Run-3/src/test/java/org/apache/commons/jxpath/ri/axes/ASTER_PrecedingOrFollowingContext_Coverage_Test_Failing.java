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

public class Aster_PrecedingOrFollowingContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsSmallerThanCurrentPosition_CrSi0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(1);
        context.reset();
        context.setPosition(2);
        boolean actual = context.setPosition(1);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenNextNodeReturnsFalse_Smqq1() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(1);
        context.reset();
        context.setPosition(2);
        boolean actual = context.setPosition(1);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsEqualCurrentPosition_IjyB2() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(1);
        boolean actual = context.setPosition(1);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsLargerThanCurrentPosition_LxeI3() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(1);
        boolean actual = context.setPosition(2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsLargerThanCurrentPositionAndNextNodeReturnsFalse_IpgX4() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(1);
        boolean actual = context.setPosition(2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsLargerThanCurrentPositionAndNextNodeReturnsTrue_REHe5() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.nextNode();
        context.nextNode();
        boolean actual = context.setPosition(2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsLargerThanCurrentPositionAndNextNodeReturnsTrue_REHe5_fid1() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(1);
        context.nextNode();
        boolean actual = context.setPosition(2);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}