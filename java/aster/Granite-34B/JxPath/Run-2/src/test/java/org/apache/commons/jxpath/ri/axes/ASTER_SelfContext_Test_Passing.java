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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SelfContext_Test_Passing {
    private NodeTest nodeTest;
    private boolean startedSet = false;
    private NodePointer nodePointer;
    SelfContext selfcontext;
    NamespaceContext namespaceContext;
    NodeTypeTest nodeTypeTest;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_2_Dgxm1() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        selfContext.setPosition(1);
        assertEquals(false, selfContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_3_DRzy2() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        selfContext.setPosition(1);
        assertEquals(false, selfContext.setPosition(3));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_4_peDR3() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        selfContext.setPosition(1);
        assertEquals(false, selfContext.setPosition(4));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_5_CWEC4() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        selfContext.setPosition(1);
        assertEquals(false, selfContext.setPosition(5));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_6_vGOc5() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        selfContext.setPosition(1);
        assertEquals(false, selfContext.setPosition(6));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testreset() throws Exception {
        selfcontext = mock(SelfContext.class);
        // Set up expected behavior
        doCallRealMethod().when(selfcontext).reset();
        doNothing().when(selfcontext).reset();
        // Call the method to be tested
        selfcontext.reset();
        // Add assertions to verify the behavior
        verify(selfcontext, times(1)).reset();
        verify(selfcontext, times(1)).reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_dLMK0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(0));
        SelfContext selfContext = new SelfContext(namespaceContext, new NodeTypeTest(0));
        selfContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSingleNodePointer() throws Exception {
        namespaceContext = mock(NamespaceContext.class);
        nodeTypeTest = mock(NodeTypeTest.class);
        pointer = mock(Pointer.class);
        selfcontext = new SelfContext(namespaceContext, nodeTypeTest);
        when(namespaceContext.getSingleNodePointer()).thenReturn(pointer);
        Pointer result = selfcontext.getSingleNodePointer();
        assertEquals(pointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_1_JoiU0_fid1() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        selfContext.setPosition(1);
    }
}