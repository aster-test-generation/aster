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
public class Aster_DoubleForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_ARSA0() {
    DoubleForm doubleForm = new DoubleForm(1, "DoubleFormTest", new int[]{1, 2, 3});
    int expected = SegmentConstantPool.CP_DOUBLE;
    assertEquals(expected, doubleForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffset_Omaa0() {
    int[] bcCaseCount = new int[0];
    int[] bcCaseValue = new int[0];
    int[] bcByte = new int[0];
    int[] bcShort = new int[0];
    int[] bcLocal = new int[0];
    int[] bcLabel = new int[0];
    int[] bcIntRef = new int[0];
    int[] bcFloatRef = new int[0];
    int[] bcLongRef = new int[0];
    int[] bcDoubleRef = new int[]{10}; // Set expected double ref value
    int[] bcStringRef = new int[0];
    int[] bcClassRef = new int[0];
    int[] bcFieldRef = new int[0];
    int[] bcMethodRef = new int[0];
    int[] bcIMethodRef = new int[0];
    int[] bcThisField = new int[0];
    int[] bcSuperField = new int[0];
    int[] bcThisMethod = new int[0];
    int[] bcSuperMethod = new int[0];
    int[] bcInitRef = new int[0];
    int[] wideByteCodes = new int[0];
    OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    int[] rewrite = new int[0];
    DoubleForm doubleForm = new DoubleForm(0, "testDoubleForm", rewrite);
    int result = doubleForm.getOffset(operandManager);
    assertEquals(10, result);
}
}