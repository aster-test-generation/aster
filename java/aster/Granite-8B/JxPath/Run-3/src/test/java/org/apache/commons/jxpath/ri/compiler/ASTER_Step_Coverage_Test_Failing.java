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

public class Aster_Step_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringAxisIsAxisChildAndNodeTypeIsNodeTypeTest_SAKw0() {
        Step step = new Step(Compiler.AXIS_CHILD, new NodeTypeTest(Compiler.NODE_TYPE_NODE), null);
        assertEquals("::node()", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringAxisIsAxisAttributeAndNodeTypeIsNodeTypeTest_sYSE1() {
        Step step = new Step(Compiler.AXIS_ATTRIBUTE, new NodeTypeTest(Compiler.NODE_TYPE_NODE), null);
        assertEquals("@::node()", step.toString());
    }
}