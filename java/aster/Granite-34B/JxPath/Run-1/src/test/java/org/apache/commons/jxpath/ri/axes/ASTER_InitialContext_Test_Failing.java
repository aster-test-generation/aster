/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_InitialContext_Test_Failing {
    private NodePointer nodePointer;
    private boolean collection;
    InitialContext initialcontext;
    NamespaceContext namespacecontext;
    SelfContext selfcontext;
    NodeTypeTest nodetypetest;
    private boolean started = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCurrentNodePointerTest_NullParentContext_Hsps1() {
        InitialContext initialContext = new InitialContext(null);
        NodePointer nodePointer = initialContext.getCurrentNodePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_dKHx0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        InitialContext initialContext = new InitialContext(namespaceContext);
        assertTrue(initialContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeWithCoverage_aUMC1() {
        NamespaceContext namespaceContext = new NamespaceContext(null, new NodeTypeTest(1));
        InitialContext initialContext = new InitialContext(namespaceContext);
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
        initialContext.nextNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnextSet() throws Exception {
        SelfContext selfcontext = new SelfContext(Mockito.mock(NamespaceContext.class), Mockito.mock(NodeTypeTest.class));
        initialcontext = new InitialContext(selfcontext);
        boolean result = initialcontext.nextSet();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetValue_FSWG0() throws Exception {
        nodePointer = mock(NodePointer.class);
        initialcontext = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)));
        Object actualValue;
        when(nodePointer.getValue()).thenReturn("expectedValue");
        actualValue = initialcontext.getValue();
        assertEquals("expectedValue", actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenCollectionAndPositionIsBetweenOneAndNodePointerLength_NYzN0_aVcv0() {
        InitialContext initialContext = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)));
        int position = 5;
        boolean expected = true;
        boolean actual = initialContext.setPosition(position);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenCollectionAndPositionIsBelowOne_MvTN1_CgMb0() {
        InitialContext initialContext = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)));
        int position = 2;
        boolean expected = false;
        boolean actual = initialContext.setPosition(position);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenCollectionAndPositionIsAboveNodePointerLength_haFy2_lPiv0() {
        InitialContext initialContext = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)));
        int position = 10;
        boolean expected = false;
        boolean actual = initialContext.setPosition(position);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenNotCollectionAndPositionIsOne_kVMF3_GMoG0() {
        InitialContext initialContext = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)));
        int position = 1;
        boolean expected = true;
        boolean actual = initialContext.nextSet();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenNotCollectionAndPositionIsNotOne_NLKV4_yTcP0() {
        InitialContext initialContext = new InitialContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)));
        int position = 5;
        boolean expected = false;
        boolean actual = initialContext.setPosition(position);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}