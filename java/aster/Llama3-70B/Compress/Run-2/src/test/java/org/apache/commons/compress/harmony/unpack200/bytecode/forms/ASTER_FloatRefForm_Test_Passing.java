/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FloatRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_ytZK0() {
    FloatRefForm floatRefForm = new FloatRefForm(1, "name", new int[]{});
    assertEquals(SegmentConstantPool.CP_FLOAT, floatRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffset_SUjM0_wiuT0() {
    int[] bcCaseCount = new int[1];
    int[] bcCaseValue = new int[1];
    int[] bcByte = new int[1];
    int[] bcShort = new int[1];
    int[] bcLocal = new int[1];
    int[] bcLabel = new int[1];
    int[] bcIntRef = new int[1];
    int[] bcFloatRef = new int[1];
    bcFloatRef[0] = 1; 
    int[] bcLongRef = new int[1];
    int[] bcDoubleRef = new int[1];
    int[] bcStringRef = new int[1];
    int[] bcClassRef = new int[1];
    int[] bcFieldRef = new int[1];
    int[] bcMethodRef = new int[1];
    int[] bcIMethodRef = new int[1];
    int[] bcThisField = new int[1];
    int[] bcSuperField = new int[1];
    int[] bcThisMethod = new int[1];
    int[] bcSuperMethod = new int[1];
    int[] bcInitRef = new int[1];
    int[] wideByteCodes = new int[1];
    OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    FloatRefForm floatRefForm = new FloatRefForm(1, "name", new int[1]);
    int result = floatRefForm.getOffset(operandManager);
    assertEquals(1, result);
}
}