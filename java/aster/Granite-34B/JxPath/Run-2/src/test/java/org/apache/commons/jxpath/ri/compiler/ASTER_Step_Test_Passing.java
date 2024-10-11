/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Step_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAxis_fyqI0() {
        Step step = new Step(1, new NodeTypeTest(1), new Expression[0]);
        assertEquals(1, step.getAxis());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAxisWithNegativeAxis_YINN1() {
        Step step = new Step(-1, new NodeTypeTest(1), new Expression[0]);
        assertEquals(-1, step.getAxis());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAxisWithZeroAxis_KLHr2() {
        Step step = new Step(0, new NodeTypeTest(1), new Expression[0]);
        assertEquals(0, step.getAxis());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependentWithNullPredicates_oVHN0() {
        Step step = new Step(1, new NodeTypeTest(1), null);
        Assertions.assertFalse(step.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependentWithEmptyPredicates_VtkG1() {
        Step step = new Step(1, new NodeTypeTest(1), new Expression[0]);
        Assertions.assertFalse(step.isContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AxisChild_NodeTypeTest_NoPredicates_fRJD0() {
        final Step step = new Step(Compiler.AXIS_CHILD, new NodeTypeTest(Compiler.NODE_TYPE_NODE), null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AxisAttribute_NodeTypeTest_NoPredicates_SARX1() {
        final Step step = new Step(Compiler.AXIS_ATTRIBUTE, new NodeTypeTest(Compiler.NODE_TYPE_NODE), null);
        assertEquals("@node()", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AxisSelf_NodeTypeTest_NoPredicates_exbH2() {
        final Step step = new Step(Compiler.AXIS_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), null);
        assertEquals(".", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AxisParent_NodeTypeTest_NoPredicates_qAwS3() {
        final Step step = new Step(Compiler.AXIS_PARENT, new NodeTypeTest(Compiler.NODE_TYPE_NODE), null);
        assertEquals("..", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AxisDescendantOrSelf_NodeTypeTest_NoPredicates_hIZs4() {
        final Step step = new Step(Compiler.AXIS_DESCENDANT_OR_SELF, new NodeTypeTest(Compiler.NODE_TYPE_NODE), null);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_BPpn0() {
        Step step = new Step(1, new NodeTypeTest(1), new Expression[0]);
        Expression[] predicates = step.getPredicates();
        Assertions.assertEquals(0, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicatesWithNull_rBIc1() {
        Step step = new Step(1, new NodeTypeTest(1), null);
        Expression[] predicates = step.getPredicates();
        Assertions.assertNull(predicates);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeTest_aNQY0() {
        Step step = new Step(1, new NodeTypeTest(1), new Expression[0]);
        NodeTest nodeTest = step.getNodeTest();
        assertNotNull(nodeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_1() {
        assertEquals("self", Step.axisToString(Compiler.AXIS_SELF));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_2() {
        assertEquals("child", Step.axisToString(Compiler.AXIS_CHILD));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_3() {
        assertEquals("parent", Step.axisToString(Compiler.AXIS_PARENT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_4() {
        assertEquals("ancestor", Step.axisToString(Compiler.AXIS_ANCESTOR));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_5() {
        assertEquals("attribute", Step.axisToString(Compiler.AXIS_ATTRIBUTE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_6() {
        assertEquals("namespace", Step.axisToString(Compiler.AXIS_NAMESPACE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_7() {
        assertEquals("preceding", Step.axisToString(Compiler.AXIS_PRECEDING));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_8() {
        assertEquals("following", Step.axisToString(Compiler.AXIS_FOLLOWING));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_9() {
        assertEquals("descendant", Step.axisToString(Compiler.AXIS_DESCENDANT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_10() {
        assertEquals("ancestor-or-self", Step.axisToString(Compiler.AXIS_ANCESTOR_OR_SELF));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_11() {
        assertEquals("following-sibling", Step.axisToString(Compiler.AXIS_FOLLOWING_SIBLING));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_12() {
        assertEquals("preceding-sibling", Step.axisToString(Compiler.AXIS_PRECEDING_SIBLING));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_13() {
        assertEquals("descendant-or-self", Step.axisToString(Compiler.AXIS_DESCENDANT_OR_SELF));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0_14() {
        assertEquals("UNKNOWN", Step.axisToString(100));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToString_FaKc0() {
        assertEquals("self", Step.axisToString(Compiler.AXIS_SELF));
        assertEquals("child", Step.axisToString(Compiler.AXIS_CHILD));
        assertEquals("parent", Step.axisToString(Compiler.AXIS_PARENT));
        assertEquals("ancestor", Step.axisToString(Compiler.AXIS_ANCESTOR));
        assertEquals("attribute", Step.axisToString(Compiler.AXIS_ATTRIBUTE));
        assertEquals("namespace", Step.axisToString(Compiler.AXIS_NAMESPACE));
        assertEquals("preceding", Step.axisToString(Compiler.AXIS_PRECEDING));
        assertEquals("following", Step.axisToString(Compiler.AXIS_FOLLOWING));
        assertEquals("descendant", Step.axisToString(Compiler.AXIS_DESCENDANT));
        assertEquals("ancestor-or-self", Step.axisToString(Compiler.AXIS_ANCESTOR_OR_SELF));
        assertEquals("following-sibling", Step.axisToString(Compiler.AXIS_FOLLOWING_SIBLING));
        assertEquals("preceding-sibling", Step.axisToString(Compiler.AXIS_PRECEDING_SIBLING));
        assertEquals("descendant-or-self", Step.axisToString(Compiler.AXIS_DESCENDANT_OR_SELF));
        assertEquals("UNKNOWN", Step.axisToString(100));
    }
}