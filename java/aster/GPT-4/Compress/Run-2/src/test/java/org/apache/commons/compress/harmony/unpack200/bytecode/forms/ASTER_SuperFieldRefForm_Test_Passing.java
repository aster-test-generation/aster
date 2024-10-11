/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SuperFieldRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_AeZU0() {
    SuperFieldRefForm superFieldRefForm = new SuperFieldRefForm(1, "fieldName", new int[]{1, 2, 3});
    int expected = SegmentConstantPool.CP_FIELD;
    int actual = superFieldRefForm.getPoolID();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffset_zfgo0() {
    int[] dummyArray = new int[10];
    OperandManager operandManager = new OperandManager(dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray);
    int[] rewrite = new int[]{1, 2, 3};
    SuperFieldRefForm superFieldRefForm = new SuperFieldRefForm(100, "TestField", rewrite);
    int expectedValue = 0; // Assuming nextSuperFieldRef() would return 0 for simplicity
    int result = superFieldRefForm.getOffset(operandManager);
    assertEquals(expectedValue, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContextReturnsSuperClass_Bgsp0() {
        int[] dummyArray = new int[0];
        OperandManager operandManager = new OperandManager(dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray, dummyArray);
        operandManager.setSuperClass("ExpectedSuperClass");
        SuperFieldRefForm superFieldRefForm = new SuperFieldRefForm(0, "TestName", new int[]{1, 2, 3});
        String result = superFieldRefForm.context(operandManager);
        assertEquals("ExpectedSuperClass", result);
    }
}