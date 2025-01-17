/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewInitMethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContextReturnsNewClass_XVMY0() throws Exception {
    int[] dummyArray = new int[1];
    OperandManager operandManager = new OperandManager(dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray);
    String expectedClassName = "TestNewClass";
    operandManager.setNewClass(expectedClassName);
    int opcode = 0;
    String name = "init";
    int[] rewrite = new int[0];
    NewInitMethodRefForm newInitMethodRefForm = new NewInitMethodRefForm(opcode, name, rewrite);
    String actualClassName = newInitMethodRefForm.context(operandManager);
    assertEquals(expectedClassName, actualClassName);
}
}