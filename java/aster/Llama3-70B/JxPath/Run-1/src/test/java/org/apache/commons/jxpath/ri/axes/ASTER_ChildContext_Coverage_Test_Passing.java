/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChildContext_Coverage_Test_Passing {
    private NodeIterator iterator;
    private ChildContext childContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_PositionZero_NextSetTrue_Prepares_IteratorNull_ReturnsNull_ZmZw1_PJVw0() {
        ChildContext childContext = new ChildContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1), true, true);
        childContext.setPosition(0);
        childContext.nextNode(); // Call nextNode to prepare the iterator
        assertNull(childContext.getSingleNodePointer());
    }
}