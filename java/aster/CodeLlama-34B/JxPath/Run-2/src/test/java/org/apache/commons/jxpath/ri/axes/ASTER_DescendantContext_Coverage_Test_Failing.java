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

public class Aster_DescendantContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanCurrentPosition_WNlC1_fid2() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(2);
        assertEquals(2, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionEqualToCurrentPosition_FpKv2_fid2() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(3);
        assertEquals(3, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanMaxPosition_IWhF3() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(4);
        assertEquals(3, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanMaxPosition_includeSelf_gfeF6_fid2() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), false, new NodeTypeTest(3));
        context.setPosition(4);
        assertEquals(3, context.getPosition());
    }
}