/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChildContext_Coverage_Test_Passing {
    private NodeIterator iterator;
    private ChildContext childcontext;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_IteratorIsNull_rfgA2_euvL0() throws Exception {
    ChildContext childcontext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
    boolean result = childcontext.nextNode();
    Assertions.assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_IteratorNull_ilHi1_OoWP0() {
    NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
    NodeTypeTest nodeTest = new NodeTypeTest(1);
    ChildContext childContext = new ChildContext(parentContext, nodeTest, true, true);
    NodePointer nodePointer = childContext.getCurrentNodePointer();
    assert nodePointer == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_IteratorNull_lkkU12_TPqs0() {
    ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
    childContext.nextNode(); // Added this line to set the iterator
    childContext.getSingleNodePointer();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSingleNodePointer_PositionZero_NextSetTrue_PrepareCalled_IteratorNull_cXoL4_myav0_fid1() {
    ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
    childContext.setPosition(0);
    childContext.nextNode();
    assertFalse(childContext.nextNode());
}
}