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

public class Aster_NamespaceContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionLessThanCurrentPosition_XUZc0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        namespaceContext.setPosition(0);
        assertEquals(0, namespaceContext.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_positionGreaterThanCurrentPosition_croc1() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        namespaceContext.setPosition(1);
        assertEquals(1, namespaceContext.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_nextNodeReturnsFalse_WAFj2() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
        namespaceContext.setPosition(1);
        assertFalse(namespaceContext.nextNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_eJrW0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(null, new NodeTypeTest(1)), new NodeTypeTest(1));
        namespaceContext.nextNode();
    }
}