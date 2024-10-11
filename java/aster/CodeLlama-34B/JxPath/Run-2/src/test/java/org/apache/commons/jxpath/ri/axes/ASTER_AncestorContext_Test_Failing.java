/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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
public class Aster_AncestorContext_Test_Failing {
    private NodePointer currentNodePointer;
    private boolean setStarted = false;
    private boolean includeSelf;
    private NodeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanCurrentPosition_Rhme0() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), true, new NodeTypeTest(4));
        assertTrue(ancestorContext.setPosition(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanCurrentPosition_YNlD1() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), true, new NodeTypeTest(4));
        assertFalse(ancestorContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionEqualToCurrentPosition_cUyK2() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), true, new NodeTypeTest(4));
        assertTrue(ancestorContext.setPosition(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanZero_LGrD3() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), true, new NodeTypeTest(4));
        assertFalse(ancestorContext.setPosition(-1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfTrue_nodeTestMatches_ZTDH0() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, true, new NodeTypeTest(1));
        assertTrue(ancestorContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfTrue_nodeTestDoesNotMatch_eGhH1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, true, new NodeTypeTest(2));
        assertFalse(ancestorContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfFalse_nodeTestMatches_FxTT2() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, false, new NodeTypeTest(1));
        assertTrue(ancestorContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfFalse_nodeTestDoesNotMatch_KNUk3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, false, new NodeTypeTest(2));
        assertFalse(ancestorContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_parentContextIsNull_hsvs4() {
        AncestorContext ancestorContext = new AncestorContext(null, true, new NodeTypeTest(1));
        assertFalse(ancestorContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanCurrentPosition_YNlD1_fid1() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), true, new NodeTypeTest(4));
        assertTrue(ancestorContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_includeSelfTrue_nodeTestDoesNotMatch_eGhH1_fid1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        AncestorContext ancestorContext = new AncestorContext(selfContext, true, new NodeTypeTest(2));
        assertTrue(ancestorContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_parentContextIsNull_hsvs4_fid1() {
        AncestorContext ancestorContext = new AncestorContext(null, true, new NodeTypeTest(1));
        assertNull(ancestorContext.nextNode());
    }
}