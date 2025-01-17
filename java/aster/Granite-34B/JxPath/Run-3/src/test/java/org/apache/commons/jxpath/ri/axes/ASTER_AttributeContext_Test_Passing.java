/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeContext_Test_Passing {
    AttributeContext attributecontext;
    NamespaceContext namespacecontext;
    SelfContext selfcontext;
    NodeTypeTest nodetypetest;
    private NodeIterator iterator;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;
    private static QName WILDCARD = new QName(null, "*");
    private NodeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        selfcontext = mock(SelfContext.class);
        namespacecontext = new NamespaceContext(selfcontext, nodetypetest);
        attributecontext = new AttributeContext(namespacecontext, nodetypetest);
        when(selfcontext.getCurrentPosition()).thenReturn(0);
        when(selfcontext.nextNode()).thenReturn(true);
        assertTrue(attributecontext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_rsrR0() throws Exception {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        attributeContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getCurrentNodePointerTest_brvQ0() throws Exception {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        NodePointer expected = attributeContext.getCurrentNodePointer();
        NodePointer actual = attributeContext.getCurrentNodePointer();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsLessThenCurrentPosition_zvph0() throws Exception {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        attributeContext.setPosition(1);
        Assertions.assertTrue(attributeContext.setPosition(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsEqualCurrentPosition_vrDn1() throws Exception {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        attributeContext.setPosition(1);
        Assertions.assertTrue(attributeContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsGreaterThanCurrentPosition_GEIf2() throws Exception {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        attributeContext.setPosition(1);
        Assertions.assertTrue(attributeContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsGreaterThanCurrentPositionAndNextNodeReturnsFalse_ETRF3() throws Exception {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        attributeContext.setPosition(1);
        Assertions.assertFalse(attributeContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionWhenPositionIsGreaterThanCurrentPositionAndResetIsCalled_ridC5() throws Exception {
        AttributeContext attributeContext = new AttributeContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        attributeContext.setPosition(1);
        attributeContext.reset();
        Assertions.assertTrue(attributeContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_zOps0() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        AttributeContext attributeContext = new AttributeContext(namespaceContext, new NodeTypeTest(1));
        assertTrue(attributeContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeWithNoCurrentPosition_DzoD5() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        AttributeContext attributeContext = new AttributeContext(namespaceContext, new NodeTypeTest(1));
        attributeContext.setPosition(0);
        assertFalse(attributeContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeWithNoNodeTest_bGNX6() throws Exception {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        AttributeContext attributeContext = new AttributeContext(namespaceContext, null);
        assertFalse(attributeContext.nextNode());
    }
}