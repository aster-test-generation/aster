/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SelfContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSingleNodePointer_FVwX0() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        SelfContext selfContext = new SelfContext(parentContext, new NodeTypeTest(1));
        Pointer pointer = selfContext.getSingleNodePointer();
        assertNotNull(pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ykPl0() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        assertTrue(selfContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_startedSetIsFalse_Tmqe1() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        assertTrue(selfContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_nodeTestIsNull_IlPL3() {
        SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        selfContext.setPosition(1);
        assertTrue(selfContext.setPosition(1));
    }
}