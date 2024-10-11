/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
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
public class Aster_SelfContext_Test_Failing {
    private NodeTest nodeTest;
    private boolean startedSet = false;
    private NodePointer nodePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_position1_kgTH0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        assertTrue(selfContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_position3_XUdd2() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        assertTrue(selfContext.setPosition(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_position5_bfpc4() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        assertTrue(selfContext.setPosition(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointerWithNullParentContext_MhOH1() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        Pointer pointer = selfContext.getSingleNodePointer();
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointerWithNullNodeTestAndNullParentContext_Ajwo3() {
        SelfContext selfContext = new SelfContext(null, null);
        Pointer pointer = selfContext.getSingleNodePointer();
        assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ValidPosition_TBpy0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        assertTrue(selfContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NullParentContext_YSRF2() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        assertFalse(selfContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointerWithNullParentContext_MhOH1_fid1() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        Pointer pointer = selfContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointerWithNullNodeTestAndNullParentContext_Ajwo3_fid1() {
        SelfContext selfContext = new SelfContext(null, null);
        Pointer pointer = selfContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_NullParentContext_YSRF2_fid1() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        assertTrue(selfContext.nextNode());
    }
}