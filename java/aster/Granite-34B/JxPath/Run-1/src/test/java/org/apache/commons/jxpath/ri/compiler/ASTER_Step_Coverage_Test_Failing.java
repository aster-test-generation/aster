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
    public void testToString3_cuTV2() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[1]);
        assertEquals("[null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_jmkE3() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[2]);
        assertEquals("[null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString5_WXeJ4() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[3]);
        assertEquals("[null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString6_JeCV5() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[4]);
        assertEquals("[null, null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString7_emYm6() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[5]);
        assertEquals("[null, null, null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString8_MquQ7() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[6]);
        assertEquals("[null, null, null, null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString9_VfiX8() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[7]);
        assertEquals("[null, null, null, null, null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString10_dlsU9() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[8]);
        assertEquals("[null, null, null, null, null, null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString11_FcPf10() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[9]);
        assertEquals("[null, null, null, null, null, null, null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString12_Xfqj11() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[10]);
        assertEquals("[null, null, null, null, null, null, null, null, null, null]", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString13_Cfra12() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[11]);
        assertEquals("[null, null, null, null, null, null, null, null, null, null, null]", step.toString());
    }
}