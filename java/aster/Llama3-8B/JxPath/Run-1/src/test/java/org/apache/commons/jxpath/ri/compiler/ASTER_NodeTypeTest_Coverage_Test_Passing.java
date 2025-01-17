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

public class Aster_NodeTypeTest_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_NODE_duux0() {
        assertEquals("node", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_NODE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_TEXT_kANl1() {
        assertEquals("text", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_TEXT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_COMMENT_DfjR2() {
        assertEquals("comment", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_COMMENT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_NODE_TYPE_PI_OzjW3() {
        assertEquals("processing-instruction", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_PI));
    }
}