/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TreeCompiler_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeTypeTest_gKXx0_1() {
    TreeCompiler treeCompiler = new TreeCompiler();
    int nodeType = 1; // example node type
    Object result = treeCompiler.nodeTypeTest(nodeType);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeTypeTest_gKXx0_2() {
    TreeCompiler treeCompiler = new TreeCompiler();
    int nodeType = 1; // example node type
    Object result = treeCompiler.nodeTypeTest(nodeType);
    assertTrue(result instanceof NodeTypeTest);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeTypeTest_gKXx0_3() {
    TreeCompiler treeCompiler = new TreeCompiler();
    int nodeType = 1; // example node type
    Object result = treeCompiler.nodeTypeTest(nodeType);
    assertEquals(nodeType, ((NodeTypeTest) result).getNodeType());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNotEqual_VhuA0_qtQD0() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new CoreOperationEqual(new Constant(1), new Constant(2)); // Using concrete subclass
    Expression right = new CoreOperationEqual(new Constant(3), new Constant(4)); // Using concrete subclass
    Object result = compiler.notEqual(left, right);
    assertTrue(result instanceof CoreOperationNotEqual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMultiply_zbEq0_sYny0_1() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = treeCompiler.multiply(left, right);
    CoreOperationMultiply multiplyResult = (CoreOperationMultiply) result;
    assertTrue(result instanceof CoreOperationMultiply);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMultiply_zbEq0_sYny0_2() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = treeCompiler.multiply(left, right);
    CoreOperationMultiply multiplyResult = (CoreOperationMultiply) result;
    assertSame(left, multiplyResult.getArguments()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMultiply_zbEq0_sYny0_3() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = treeCompiler.multiply(left, right);
    CoreOperationMultiply multiplyResult = (CoreOperationMultiply) result;
    assertSame(right, multiplyResult.getArguments()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMinus_Cplh0_yWhM0_1() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.minus(left, right);
    CoreOperationSubtract operation = (CoreOperationSubtract) result;
    assertTrue(result instanceof CoreOperationSubtract);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMinus_Cplh0_yWhM0_2() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.minus(left, right);
    CoreOperationSubtract operation = (CoreOperationSubtract) result;
    assertSame(left, operation.getArguments()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMinus_Cplh0_yWhM0_3() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.minus(left, right);
    CoreOperationSubtract operation = (CoreOperationSubtract) result;
    assertSame(right, operation.getArguments()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLessThan_rsst0_IGBl0_1() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(10);
    Object result = treeCompiler.lessThan(left, right);
    CoreOperationLessThan operation = (CoreOperationLessThan) result;
    assertTrue(result instanceof CoreOperationLessThan);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLessThan_rsst0_IGBl0_2() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(10);
    Object result = treeCompiler.lessThan(left, right);
    CoreOperationLessThan operation = (CoreOperationLessThan) result;
    assertSame(left, operation.getArguments()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLessThan_rsst0_IGBl0_3() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(10);
    Object result = treeCompiler.lessThan(left, right);
    CoreOperationLessThan operation = (CoreOperationLessThan) result;
    assertSame(right, operation.getArguments()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGreaterThan_sqIL0_WOSp0_1() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.greaterThan(left, right);
    CoreOperationGreaterThan operation = (CoreOperationGreaterThan) result;
    assertTrue(result instanceof CoreOperationGreaterThan);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGreaterThan_sqIL0_WOSp0_2() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.greaterThan(left, right);
    CoreOperationGreaterThan operation = (CoreOperationGreaterThan) result;
    assertSame(left, operation.getArguments()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGreaterThan_sqIL0_WOSp0_3() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.greaterThan(left, right);
    CoreOperationGreaterThan operation = (CoreOperationGreaterThan) result;
    assertSame(right, operation.getArguments()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGreaterThanOrEqual_psaM0_glXQ0_1() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.greaterThanOrEqual(left, right);
    CoreOperationGreaterThanOrEqual operation = (CoreOperationGreaterThanOrEqual) result;
    assertTrue(result instanceof CoreOperationGreaterThanOrEqual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGreaterThanOrEqual_psaM0_glXQ0_2() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.greaterThanOrEqual(left, right);
    CoreOperationGreaterThanOrEqual operation = (CoreOperationGreaterThanOrEqual) result;
    assertSame(left, operation.getArguments()[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGreaterThanOrEqual_psaM0_glXQ0_3() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new Constant(5);
    Expression right = new Constant(3);
    Object result = compiler.greaterThanOrEqual(left, right);
    CoreOperationGreaterThanOrEqual operation = (CoreOperationGreaterThanOrEqual) result;
    assertSame(right, operation.getArguments()[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSum_LflC0_fid1() {
    TreeCompiler treeCompiler = new TreeCompiler();
    Object[] arguments = {1, 2, 3};
    Object result = treeCompiler.processingInstructionTest("sum");
    assertTrue(result instanceof ProcessingInstructionTest);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeTypeTest_gKXx0() {
    TreeCompiler treeCompiler = new TreeCompiler();
    int nodeType = 1; // example node type
    Object result = treeCompiler.nodeTypeTest(nodeType);
    assertNotNull(result);
    assertTrue(result instanceof NodeTypeTest);
    assertEquals(nodeType, ((NodeTypeTest) result).getNodeType());
}
}