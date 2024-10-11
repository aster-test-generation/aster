/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TreeCompiler_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNodeTypeTest_NAaA0() {
    TreeCompiler compiler = new TreeCompiler();
    int testNodeType = 1;
    Object result = compiler.nodeTypeTest(testNodeType);
    assertTrue(result instanceof NodeTypeTest);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariableReference_FUMf0() {
        TreeCompiler compiler = new TreeCompiler();
        QName qName = new QName("localPart");
        Object result = compiler.variableReference(qName);
        assertTrue(result instanceof VariableReference);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testProcessingInstructionTest_TsPv0() {
    TreeCompiler compiler = new TreeCompiler();
    String instruction = "sampleInstruction";
    Object result = compiler.processingInstructionTest(instruction);
    assertTrue(result instanceof ProcessingInstructionTest);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMultiply_QNQJ0_xGYP0() {
    TreeCompiler compiler = new TreeCompiler();
    Expression left = new CoreOperationAdd(new Expression[]{new Constant(new Double(1)), new Constant(new Double(2))});  // Using CoreOperationAdd to create a non-abstract Expression
    Expression right = new CoreOperationAdd(new Expression[]{new Constant(new Double(3)), new Constant(new Double(4))}); // Using CoreOperationAdd to create a non-abstract Expression
    Object result = compiler.multiply(left, right);
    assertTrue(result instanceof CoreOperationMultiply);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnionWithValidArguments_BLsD0_YXQT0() {
    TreeCompiler compiler = new TreeCompiler();
    Object[] arguments = new Object[]{new Object(), new Object()};
    Object result = compiler.union(arguments);
    assertTrue(result instanceof CoreOperationUnion);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFunctionWithValidArguments_MnEW0_sHDk0() {
    TreeCompiler compiler = new TreeCompiler();
    Object[] args = {new Constant("arg1"), new Constant("arg2")};
    CoreFunction expected = new CoreFunction(1, new Expression[]{new Constant("arg1"), new Constant("arg2")});
    CoreFunction result = (CoreFunction) compiler.function(1, args);
    assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSumWithValidArguments_Ehsy0_ajmH0() {
    TreeCompiler compiler = new TreeCompiler();
    Object[] arguments = {new Constant(5), new Constant(10)};
    Object result = compiler.sum(arguments);
    assertTrue(result instanceof CoreOperationAdd);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLocationPathWithAbsoluteTrue_Cerj0_hNJf0_1() {
    TreeCompiler compiler = new TreeCompiler();
    Object result = compiler.processingInstructionTest("data");
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLocationPathWithAbsoluteTrue_Cerj0_hNJf0_2() {
    TreeCompiler compiler = new TreeCompiler();
    Object result = compiler.processingInstructionTest("data");
    assertTrue(result instanceof ProcessingInstructionTest);}
}