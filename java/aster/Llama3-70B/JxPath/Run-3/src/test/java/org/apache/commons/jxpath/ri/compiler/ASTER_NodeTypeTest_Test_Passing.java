/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NodeTypeTest_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AggH0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        assertEquals("node()", nodeTypeTest.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeType_Mqzv0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        int result = nodeTypeTest.getNodeType();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_NODE_hAqF0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertEquals("node", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_NODE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_TEXT_xjTx1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertEquals("text", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_TEXT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_COMMENT_bUlk2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertEquals("comment", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_COMMENT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_PI_flNf3() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertEquals("processing-instruction", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_PI));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_DEFAULT_owCa4() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(10);
        assertEquals("UNKNOWN", NodeTypeTest.nodeTypeToString(10));
    }
}