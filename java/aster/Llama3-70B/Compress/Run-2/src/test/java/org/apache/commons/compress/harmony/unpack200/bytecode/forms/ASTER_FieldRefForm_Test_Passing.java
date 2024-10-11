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
public class Aster_FieldRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_UuRa0() {
    FieldRefForm fieldRefForm = new FieldRefForm(1, "name", new int[]{1, 2, 3});
    assertEquals(SegmentConstantPool.CP_FIELD, fieldRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffset_MFpP0() {
    int[] bcCaseCount = new int[1];
    int[] bcCaseValue = new int[1];
    int[] bcByte = new int[1];
    int[] bcShort = new int[1];
    int[] bcLocal = new int[1];
    int[] bcLabel = new int[1];
    int[] bcIntRef = new int[1];
    int[] bcFloatRef = new int[1];
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
    int opcode = 1;
    String name = "test";
    int[] rewrite = new int[1];
    FieldRefForm fieldRefForm = new FieldRefForm(opcode, name, rewrite);
    int result = fieldRefForm.getOffset(operandManager);
    assertEquals(bcFieldRef[0], result);
}
}