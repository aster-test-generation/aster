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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Step_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependentWithPredicatesLengthOneAndIsContextDependentReturnsFalse_vkhV1() {
        Expression[] predicates = new Expression[1];
        Step step = new Step(0, new NodeTypeTest(0), predicates);
        boolean actual = step.isContextDependent();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_VGVH2() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[1]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_kIFb3() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[2]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString5_gple4() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[3]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString6_BzGz5() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[4]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString7_CEjZ6() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[5]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString8_PftM7() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[6]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString9_nDkm8() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[7]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString10_Egxh9() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[8]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString11_TyQc10() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[9]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString12_QEQt11() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[10]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString13_efeU12() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[11]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString14_BTQs13() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[12]);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_VGVH2_fid1() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[1]);
        assertNull(step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString6_BzGz5_fid1() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[4]);
        assertNull(step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString7_CEjZ6_fid1() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[5]);
        assertNull(step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString12_QEQt11_fid1() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[10]);
        assertNull(step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString13_efeU12_fid1() {
        Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), new Expression[11]);
        assertNull(step.toString());
    }
}