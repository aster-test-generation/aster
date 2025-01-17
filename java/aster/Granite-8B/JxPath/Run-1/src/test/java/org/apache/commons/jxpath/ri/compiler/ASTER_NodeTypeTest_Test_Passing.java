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
    public void testNodeTypeToString_qqIV0_1() {
        assertEquals("node", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_NODE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_qqIV0_2() {
        assertEquals("text", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_TEXT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_qqIV0_3() {
        assertEquals("comment", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_COMMENT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_qqIV0_4() {
        assertEquals("processing-instruction", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_PI));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_qqIV0_5() {
        assertEquals("UNKNOWN", NodeTypeTest.nodeTypeToString(0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeToString_qqIV0() {
        assertEquals("node", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_NODE));
        assertEquals("text", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_TEXT));
        assertEquals("comment", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_COMMENT));
        assertEquals("processing-instruction", NodeTypeTest.nodeTypeToString(Compiler.NODE_TYPE_PI));
        assertEquals("UNKNOWN", NodeTypeTest.nodeTypeToString(0));
    }
}