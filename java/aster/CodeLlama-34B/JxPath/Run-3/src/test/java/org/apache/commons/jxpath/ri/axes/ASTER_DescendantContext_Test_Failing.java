/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DescendantContext_Test_Failing {
    private boolean setStarted = false;
    private NodePointer currentNodePointer = null;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanCurrentPosition_YqxA0_fid1() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(1);
        assertEquals(1, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanCurrentPosition_TBcj1_fid1() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(3);
        assertEquals(3, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionEqualToCurrentPosition_pAJJ2() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(2);
        assertEquals(2, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanMaxPosition_DPkb3() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(4);
        assertEquals(3, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_position1_SOaM1_fid1() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), false, new NodeTypeTest(1));
        context.setPosition(1);
        NodePointer nodePointer = context.getCurrentNodePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequired2_ulDF1_fid1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        SelfContext selfContext = new SelfContext(null, nodeTypeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, false, nodeTypeTest);
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset1_FckX0_fVZz0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext context = new DescendantContext(parentContext, true, new NodeTypeTest(1));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset2_nBNl1_bRLn0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext context = new DescendantContext(parentContext, false, new NodeTypeTest(1));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset3_yPzk2_CMYs0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext context = new DescendantContext(parentContext, true, new NodeTypeTest(2));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset4_Lqhb3_MejD0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext context = new DescendantContext(parentContext, false, new NodeTypeTest(2));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset5_EQWN4_qPWf0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(2));
        DescendantContext context = new DescendantContext(parentContext, true, new NodeTypeTest(1));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset6_pfPj5_zNhT0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(2));
        DescendantContext context = new DescendantContext(parentContext, false, new NodeTypeTest(1));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset7_rFxn6_NGeE0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(2));
        DescendantContext context = new DescendantContext(parentContext, true, new NodeTypeTest(2));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset8_UhVY7_JWwC0_fid3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(2));
        DescendantContext context = new DescendantContext(parentContext, false, new NodeTypeTest(2));
        context.reset();
        assertFalse(context.isChildOrderingRequired());
    }
}