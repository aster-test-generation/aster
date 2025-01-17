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
    public void testToString_nfHn0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        assertEquals("node()", nodeTypeTest.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_NODE_YCLX0() {
        String result = NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_NODE);
        assert "node".equals(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_TEXT_hpwo1() {
        String result = NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_TEXT);
        assert "text".equals(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_COMMENT_wmLn2() {
        String result = NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_COMMENT);
        assert "comment".equals(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_PI_hgge3() {
        String result = NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_PI);
        assert "processing-instruction".equals(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_DEFAULT_LlvE4() {
        String result = NodeTypeTest.nodeTypeToString(-1);
        assert "UNKNOWN".equals(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeType_ubyy0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(5);
        assertEquals(5, nodeTypeTest.getNodeType());
    }
}