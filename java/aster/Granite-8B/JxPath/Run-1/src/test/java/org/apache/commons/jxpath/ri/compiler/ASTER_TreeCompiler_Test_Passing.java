/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TreeCompiler_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_Wjqp0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qname = new QName("test");
        Object result = treeCompiler.nodeNameTest(qname);
        assertEquals(NodeNameTest.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_pTcF0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.nodeTypeTest(1);
        assertEquals(NodeTypeTest.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQname_NucH0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName result = (QName) treeCompiler.qname("prefix", "name");
        assertEquals("prefix:name", result.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteral_TPCM0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.literal("test");
        assertEquals(Constant.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_pCHb0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qName = new QName("test");
        Object result = treeCompiler.variableReference(qName);
        assertNotNull(result);
        assertEquals(VariableReference.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumber_qnYr0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.number("10.5");
        assert result instanceof Constant;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_pCHb0_1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qName = new QName("test");
        Object result = treeCompiler.variableReference(qName);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_pCHb0_2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qName = new QName("test");
        Object result = treeCompiler.variableReference(qName);
        assertEquals(VariableReference.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMod_gPrx0_bymN0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object left = "left"; // Replace abstract Expression with a concrete object
        Object right = "right"; // Replace abstract Expression with a concrete object
        Object result = treeCompiler.processingInstructionTest("left mod right");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMinus_BGNF0_cUbS1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object argument = new ProcessingInstructionTest("expression");
        Object result = treeCompiler.processingInstructionTest("minus");
        assertEquals(ProcessingInstructionTest.class, result.getClass());
    }
}