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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_NamespaceContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_with_less_position_lRkI0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        namespaceContext.setPosition(1);
        assertEquals(1, namespaceContext.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_with_equal_position_KUQR1() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(3));
        namespaceContext.setPosition(1);
        assertEquals(1, namespaceContext.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_with_greater_position_lQuq2() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(1));
        namespaceContext.setPosition(1);
        assertEquals(1, namespaceContext.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_with_reset_ROGM3() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        namespaceContext.setPosition(1);
        namespaceContext.reset();
        assertEquals(0, namespaceContext.getCurrentPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_with_nextNode_false_IGwp4() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3));
        namespaceContext.setPosition(1);
        when(namespaceContext.nextNode()).thenReturn(false);
        assertEquals(false, namespaceContext.setPosition(2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode1_GBNO0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1));
        boolean actual = namespaceContext.nextNode();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}