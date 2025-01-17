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
public class Aster_ThisMethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_yyXQ0_XqdV0() {
    OperandManager operandManager = new OperandManager(
        new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{},
        new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{},
        new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{},
        new int[]{}, new int[]{}, new int[]{}
    );
    operandManager.setCurrentClass("TestClass");
    String actualClass = operandManager.getCurrentClass();
    assertEquals("TestClass", actualClass);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffset_jBQq0_JJXt0() {
    int[] bcCaseCount = new int[0];
    int[] bcCaseValue = new int[0];
    int[] bcByte = new int[0];
    int[] bcShort = new int[0];
    int[] bcLocal = new int[0];
    int[] bcLabel = new int[0];
    int[] bcIntRef = new int[0];
    int[] bcFloatRef = new int[0];
    int[] bcLongRef = new int[0];
    int[] bcDoubleRef = new int[0];
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
    String expected = "TestClass";
    operandManager.setCurrentClass("TestClass");
    String actual = operandManager.getCurrentClass();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContextReturnsCurrentClass_QIuR0_WgUx0() {
    int[] bcCaseCount = new int[0];
    int[] bcCaseValue = new int[0];
    int[] bcByte = new int[0];
    int[] bcShort = new int[0];
    int[] bcLocal = new int[0];
    int[] bcLabel = new int[0];
    int[] bcIntRef = new int[0];
    int[] bcFloatRef = new int[0];
    int[] bcLongRef = new int[0];
    int[] bcDoubleRef = new int[0];
    int[] bcStringRef = new int[0];
    int[] bcClassRef = new int[0];
    int[] bcFieldRef = new int[0];
    int[] bcMethodRef = new int[0];
    int[] bcIMethodRef = new int[0];
    int[] bcThisField = new int[0];
    int[] bcSuperField = new int[0];
    int[] bcThisMethod = new int[0];
    int[] bcSuperMethod = new  int[0];
    int[] bcInitRef = new int[0];
    int[] wideByteCodes = new int[0];
    OperandManager operandManager = new OperandManager(
        bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef,
        bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef,
        bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod,
        bcSuperMethod, bcInitRef, wideByteCodes
    );
    String expectedClass = "TestClass";
    operandManager.setCurrentClass(expectedClass);
    String result = operandManager.getCurrentClass();
    assertEquals(expectedClass, result);
}
}