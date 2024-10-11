/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TreeCompiler_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_wnLr0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qname = new QName("test");
        Object result = treeCompiler.nodeNameTest(qname);
        assertNotNull(result);
        assertEquals(NodeNameTest.class, result.getClass());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOrEmptyArray_NSBM2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object[] arguments = new Object[0];
        Object result = treeCompiler.or(arguments);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeTypeTest_Oyij0() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.nodeTypeTest(1);
        assertEquals(NodeTypeTest.class, result.getClass());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLiteral_sCRo0() {
        TreeCompiler compiler = new TreeCompiler();
        Object result = compiler.literal("test");
        assertEquals(Constant.class, result.getClass());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_wnLr0_1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qname = new QName("test");
        Object result = treeCompiler.nodeNameTest(qname);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNodeNameTest_wnLr0_2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        QName qname = new QName("test");
        Object result = treeCompiler.nodeNameTest(qname);
        assertEquals(NodeNameTest.class, result.getClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_cPgn0_1() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.processingInstructionTest("test");
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testProcessingInstructionTest_cPgn0_2() {
        TreeCompiler treeCompiler = new TreeCompiler();
        Object result = treeCompiler.processingInstructionTest("test");
        assertEquals("processing-instruction('test')", result.toString());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOr_iBSl0_mnfc1() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Object result = treeCompiler.processingInstructionTest("or");
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOrNull_OeHn1_EcJD1() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Object[] arguments = new Object[] {"instruction", null};
    Object result = treeCompiler.processingInstructionTest("instruction");
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMinus_VEgl0_NLYB0() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Object argument = new ProcessingInstructionTest("expression");
    Object result = treeCompiler.processingInstructionTest("minus");
    assertEquals(ProcessingInstructionTest.class, result.getClass());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLessThanOrEqual_FhcT0_ifGQ1() {
    TreeCompiler treeCompiler = new TreeCompiler();
    ProcessingInstructionTest result = (ProcessingInstructionTest) treeCompiler.processingInstructionTest("lessThanOrEqual(1, 2)");
    assertEquals(ProcessingInstructionTest.class, result.getClass());
}
}