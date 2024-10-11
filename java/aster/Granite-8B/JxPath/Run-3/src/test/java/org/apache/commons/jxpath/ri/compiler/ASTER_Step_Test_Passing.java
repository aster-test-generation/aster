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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Step_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_oRNN0_1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        Step step = new Step(2, nodeTypeTest, new Expression[0]);
        Expression[] predicates = step.getPredicates();
        assertNotNull(predicates);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_oRNN0_2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        Step step = new Step(2, nodeTypeTest, new Expression[0]);
        Expression[] predicates = step.getPredicates();
        assertEquals(0, predicates.length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodeTest_Qtgz0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        Step step = new Step(1, nodeTypeTest, new Expression[0]);
        NodeTest nodeTest = step.getNodeTest();
        Assertions.assertNotNull(nodeTest);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringSelf_OHAr0() {
        assertEquals("self", Step.axisToString(Compiler.AXIS_SELF));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringChild_sVTz1() {
        assertEquals("child", Step.axisToString(Compiler.AXIS_CHILD));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringParent_JgrF2() {
        assertEquals("parent", Step.axisToString(Compiler.AXIS_PARENT));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringAncestor_qYeJ3() {
        assertEquals("ancestor", Step.axisToString(Compiler.AXIS_ANCESTOR));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringAttribute_USLY4() {
        assertEquals("attribute", Step.axisToString(Compiler.AXIS_ATTRIBUTE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringNamespace_wspO5() {
        assertEquals("namespace", Step.axisToString(Compiler.AXIS_NAMESPACE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringPreceding_uTmY6() {
        assertEquals("preceding", Step.axisToString(Compiler.AXIS_PRECEDING));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAxisToStringFollowing_wNNS7() {
        assertEquals("following", Step.axisToString(Compiler.AXIS_FOLLOWING));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_BJwd0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        Step step = new Step(1, nodeTypeTest, null);
        assertEquals("1::1", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString2_asIp1() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        Step step = new Step(2, nodeTypeTest, null);
        assertEquals("@2", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString3_srAp2() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        Step step = new Step(3, nodeTypeTest, null);
        assertEquals(".", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString4_cCPk3() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(4);
        Step step = new Step(4, nodeTypeTest, null);
        assertEquals("..", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString5_OyeB4() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(5);
        Step step = new Step(5, nodeTypeTest, null);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString6_LMch5() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(6);
        Step step = new Step(6, nodeTypeTest, null);
        assertEquals("6", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString7_Mwsx6() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(7);
        Step step = new Step(7, nodeTypeTest, null);
        assertEquals("7::7", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString8_XvBi7() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(8);
        Step step = new Step(8, nodeTypeTest, null);
        assertEquals("@8", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString9_kLlH8() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(9);
        Step step = new Step(9, nodeTypeTest, null);
        assertEquals(".", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString10_ZJEc9() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(10);
        Step step = new Step(10, nodeTypeTest, null);
        assertEquals("..", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString11_YTth10() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(11);
        Step step = new Step(11, nodeTypeTest, null);
        assertEquals("", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString12_CbZY11() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(12);
        Step step = new Step(12, nodeTypeTest, null);
        assertEquals("12", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString13_SzlD12() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(13);
        Step step = new Step(13, nodeTypeTest, null);
        assertEquals("13::13", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString14_zzAt13() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(14);
        Step step = new Step(14, nodeTypeTest, null);
        assertEquals("@14", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString15_ppSs14() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(15);
        Step step = new Step(15, nodeTypeTest, null);
        assertEquals(".", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString16_nvTB15() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(16);
        Step step = new Step(16, nodeTypeTest, null);
        assertEquals("..", step.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPredicates_oRNN0() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        Step step = new Step(2, nodeTypeTest, new Expression[0]);
        Expression[] predicates = step.getPredicates();
        assertNotNull(predicates);
        assertEquals(0, predicates.length);
    }
}