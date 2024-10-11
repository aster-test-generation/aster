/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.lang.reflect.Field;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DescendantContext_Test_Passing {
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    private DescendantContext descendantContext;
    private NodePointer currentNodePointer;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private NamespaceContext parentContext;
    @Mock
    private NodeIterator nodeIterator;
    private boolean includeSelf = true;
    private boolean setStarted = false;
    private Stack stack = new Stack();

    private int getPrivateField(Object obj, String fieldName) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.getInt(obj);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset() throws Exception {
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        descendantContext.reset();
        assertFalse(setStarted);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisChildOrderingRequired() throws Exception {
        NamespaceContext namespaceContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTypeTest = mock(NodeTypeTest.class);
        descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        boolean result = descendantContext.isChildOrderingRequired();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_zCMT2() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, new NodeTypeTest(1));
        assertTrue(descendantContext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition4_yMvn3() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, false, new NodeTypeTest(1));
        assertFalse(descendantContext.setPosition(10));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsChildOrderingRequired_capI0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        assertTrue(descendantContext.isChildOrderingRequired());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Position0_SetPositionReturnsFalse_sCzK0() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, true, new NodeTypeTest(1));
        descendantContext.setPosition(0);
        Assertions.assertNull(descendantContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode2_Giue1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, false, new NodeTypeTest(1));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode3_SSGJ2() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(2));
        DescendantContext descendantContext = new DescendantContext(parentContext, true, new NodeTypeTest(1));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode4_eNHD3() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, true, new NodeTypeTest(2));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode5_bcRV4() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, false, new NodeTypeTest(2));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode6_jzCr5() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(2));
        DescendantContext descendantContext = new DescendantContext(parentContext, false, new NodeTypeTest(1));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode8_Lwus7() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, false, new NodeTypeTest(1));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode9_YFWa8() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(2)), new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, true, new NodeTypeTest(1));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode10_IWCQ9() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2));
        DescendantContext descendantContext = new DescendantContext(parentContext, true, new NodeTypeTest(1));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode11_unUN10() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, false, new NodeTypeTest(2));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode12_RwUO11() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(2)), new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, false, new NodeTypeTest(1));
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_GUVC0_2() throws Exception {
        NamespaceContext parentContext = mock(NamespaceContext.class);
        NodeTypeTest nodeTest = mock(NodeTypeTest.class);
        DescendantContext descendantContext = new DescendantContext(parentContext, true, nodeTest);
        when(parentContext.getCurrentNodePointer()).thenReturn(mock(NodePointer.class));
        when(parentContext.getCurrentNodePointer()).thenReturn(null);
        assertFalse(descendantContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_ATnK0_GVPp0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        SelfContext selfContext = new SelfContext(namespaceContext, nodeTypeTest);
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, nodeTypeTest);
        descendantContext.nextNode(); // Call nextNode to set setStarted to true
        descendantContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_zprR0_fid1() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, new NodeTypeTest(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_loeS1_fid1() {
        SelfContext selfContext = new SelfContext(null, new NodeTypeTest(1));
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(namespaceContext, true, new NodeTypeTest(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_eBQF0_fid1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, true, new NodeTypeTest(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode7_Gvww6_fid1() {
        NamespaceContext parentContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        DescendantContext descendantContext = new DescendantContext(parentContext, true, new NodeTypeTest(1));
    }
}