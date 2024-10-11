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
public class Aster_DescendantContext_Test_Passing {
    private boolean setStarted = false;
    private NodePointer currentNodePointer = null;
    private Stack stack = null;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanCurrentPosition_OVCz0() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(5);
        assertEquals(5, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanCurrentPosition_Uwrw1() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(2);
        assertEquals(2, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionEqualToCurrentPosition_CZsN2() {
        DescendantContext context = new DescendantContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), true, new NodeTypeTest(3));
        context.setPosition(3);
        assertEquals(3, context.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequired_UTlY0() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, new NodeTypeTest(1));
        assertTrue(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequiredWithoutParentContext_SayR1() {
        DescendantContext descendantContext = new DescendantContext(null, true, new NodeTypeTest(1));
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequiredWithoutNodeTest_MgsR2() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, null);
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequiredWithoutIncludeSelf_IiAd3() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, false, new NodeTypeTest(1));
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequiredWithoutParentContextAndNodeTest_mDMx5() {
        DescendantContext descendantContext = new DescendantContext(null, true, null);
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequiredWithoutParentContextAndIncludeSelf_okAG6() {
        DescendantContext descendantContext = new DescendantContext(null, false, new NodeTypeTest(1));
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequiredWithoutParentContextAndIncludeSelfAndNodeTypeTest_hTDD8() {
        DescendantContext descendantContext = new DescendantContext(null, false, null);
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset1_CTKF0_rNts0() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(2));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, new NodeTypeTest(3));
        descendantContext.reset();
        assertFalse(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset2_LaqQ1_ipSB0() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(2));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, false, new NodeTypeTest(3));
        descendantContext.reset();
        assertFalse(descendantContext.isChildOrderingRequired());
    }
}