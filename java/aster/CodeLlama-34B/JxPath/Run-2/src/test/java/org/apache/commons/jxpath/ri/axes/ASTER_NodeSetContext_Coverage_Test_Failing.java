/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeSetContext_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_ArPF0_fid2() {
        NamespaceContext parentContext = new NamespaceContext(null, new NodeTypeTest(1));
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeSetContext context = new NodeSetContext(parentContext, nodeSet);
        context.setPosition(1);
        assertTrue(context.setPosition(1));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_ZDAC0_RPgZ0_fid2() {
        NodeSetContext context = new NodeSetContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(2)), new NodeTypeTest(3)), new BasicNodeSet());
        assertTrue(context.nextNode());
    }
}