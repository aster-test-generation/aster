/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NamespaceContext_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPositionLessThanGetCurrentPosition_qMBb0() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, null), new NodeTypeTest(1)), new NodeTypeTest(1));
        namespaceContext.setPosition(0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPositionEqualGetCurrentPosition_Ihom1() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, null), new NodeTypeTest(1)), new NodeTypeTest(1));
        namespaceContext.setPosition(1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPositionGreaterThanGetCurrentPosition_zrPm2() {
        NamespaceContext namespaceContext = new NamespaceContext(new SelfContext(new NamespaceContext(null, null), new NodeTypeTest(1)), new NodeTypeTest(1));
        namespaceContext.setPosition(2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ReturnFalse_WhenSetStartedIsFalse_xCZB0() {
        NamespaceContext namespaceContext = new NamespaceContext(null, null);
        boolean result = namespaceContext.nextNode();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ReturnFalse_WhenNodeTestIsNotInstanceOfNodeNameTest_PnfD1() {
        NodeTypeTest nodeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTest);
        boolean result = namespaceContext.nextNode();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ReturnTrue_WhenNodePointerIsNull_EtZk7_gaHY0() {
        NodeTypeTest nodeTest = new NodeTypeTest(0);
        SelfContext selfContext = new SelfContext(null, nodeTest);
        NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTest);
        boolean result = namespaceContext.nextNode();
        assertFalse(result);
    }
}