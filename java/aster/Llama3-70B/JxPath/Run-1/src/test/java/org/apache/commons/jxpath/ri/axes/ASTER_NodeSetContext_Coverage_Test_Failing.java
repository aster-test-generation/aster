/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeSetContext_Coverage_Test_Failing {
    private List<NodePointer> nodePointers;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition_WithinRange_aAhf0_fid2() {
        BasicNodeSet nodeSet = new BasicNodeSet();
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        NamespaceContext namespaceContext = new NamespaceContext(null, nodeTypeTest);
        NodeSetContext nodeSetContext = new NodeSetContext(namespaceContext, nodeSet);
        assertTrue(nodeSetContext.setPosition(3));
    }
}