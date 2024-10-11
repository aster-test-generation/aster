/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ChildContext_Test_Failing {
    private NodeIterator iterator;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private SelfContext selfContext;
    private ChildContext childcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_eQau0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), true, false);
        assertTrue(childContext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_fCaK1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, false);
        assertTrue(childContext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_sspj2() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), true, true);
        assertTrue(childContext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_DxGr3() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, true);
        assertTrue(childContext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode() {
        childcontext = new ChildContext(parentContext, nodeTest, true, false);
        when(parentContext.nextNode()).thenReturn(true);
        when(nodeTest.getNodeType()).thenReturn(1);
        boolean result = childcontext.nextNode();
        verify(parentContext, times(1)).nextNode();
        verify(nodeTest, times(1)).getNodeType();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_Kcvi0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, false);
        boolean result = childContext.nextNode();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer_cDlv0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), true, false);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer2_cNUB1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, false);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer3_jzDe2() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), true, true);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer4_eQkj3() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, true);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer_cDlv0_fid1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), true, false);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer2_cNUB1_fid1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, false);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer3_jzDe2_fid1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), true, true);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer4_eQkj3_fid1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, true);
        Pointer pointer = childContext.getSingleNodePointer();
        Assertions.assertNotNull(pointer);
    }
}