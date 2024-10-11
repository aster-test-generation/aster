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

public class Aster_Step_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AxisChild_WlCj0_fid2() {
        Step step = new Step(Compiler.AXIS_CHILD, new NodeTypeTest(1), null);
        assertEquals("nodeTest", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AxisAttribute_ewMo1_fid2() {
        Step step = new Step(Compiler.AXIS_ATTRIBUTE, new NodeTypeTest(1), null);
        assertEquals("@nodeTest", step.toString());
    }
}