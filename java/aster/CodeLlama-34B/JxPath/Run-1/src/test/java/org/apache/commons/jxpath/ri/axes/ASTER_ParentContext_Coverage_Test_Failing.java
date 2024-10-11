/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ParentContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_returnPosition_KVnD1() {
        ParentContext parentContext = new ParentContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), new NodeTypeTest(4));
        parentContext.setPosition(1);
        assertEquals(1, parentContext.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_currentNodePointerNull_QLPI1_MAzd0() {
        ParentContext parentContext = new ParentContext(new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0)), new NodeTypeTest(0));
        assertFalse(parentContext.nextNode());
    }
}