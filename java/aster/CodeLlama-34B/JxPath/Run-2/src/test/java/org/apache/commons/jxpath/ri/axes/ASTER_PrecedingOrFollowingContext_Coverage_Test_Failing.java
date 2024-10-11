/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PrecedingOrFollowingContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_mTRb0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), false);
        NodePointer currentNodePointer = context.getCurrentNodePointer();
        assertNotNull(currentNodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanCurrentPosition_vjNm0() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(10);
        assertEquals(10, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanCurrentPosition_rzAE1() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(5);
        assertEquals(5, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanMaxPosition_jjai4() {
        PrecedingOrFollowingContext context = new PrecedingOrFollowingContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false);
        context.setPosition(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, context.getPosition());
    }
}