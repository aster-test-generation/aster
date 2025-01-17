/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ChildContext_Test_Passing {
    private NodeIterator iterator;
    ChildContext childcontext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private Pointer pointer;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private NodeIterator nodeIterator;
    @Mock
    NamespaceContext parentContext;
    @Mock
    NodeTypeTest nodeTest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_whenPositionIsOne_thenReturnsTrue_YVyc0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
        int position = 1;
        boolean result = childContext.setPosition(position);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_whenPositionIsTwo_thenReturnsFalse_WTsb1() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
        int position = 2;
        boolean result = childContext.setPosition(position);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_whenPositionIsThree_thenReturnsTrue_NSgp2() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
        int position = 3;
        boolean result = childContext.setPosition(position);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_whenPositionIsFour_thenReturnsFalse_czCO3() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
        int position = 4;
        boolean result = childContext.setPosition(position);
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_ABQg0() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        NodeTypeTest nodeTest = new NodeTypeTest(2);
        boolean startFromParentLocation = true;
        boolean reverse = false;
        ChildContext childContext = new ChildContext(parentContext, nodeTest, startFromParentLocation, reverse);
        childContext.reset();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCurrentNodePointerTest4_DxIQ3() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0), false, false);
        childContext.getCurrentNodePointer();
        Assertions.assertEquals(null, childContext.getCurrentNodePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_OeeP0_GZAC0() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        ChildContext childContext = new ChildContext(parentContext, nodeTest, true, false);
        boolean result = childContext.nextNode();
        org.junit.jupiter.api.Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNodeWithCoverage_UUIT1_wnBZ0_1() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        ChildContext childContext = new ChildContext(parentContext, nodeTest, true, false);
        boolean result = childContext.nextNode();
        result = childContext.nextNode();
        org.junit.jupiter.api.Assertions.assertFalse(result);
    }
}