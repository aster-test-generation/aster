/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.ArrayList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CodeAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_QyYv0_fid1() {
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
    Segment segment = new Segment();
    OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    CodeAttribute codeAttribute = new CodeAttribute(1, 1, new byte[1], segment, operandManager, new ArrayList<ExceptionTableEntry>());
    String result = codeAttribute.toString();
    assertEquals("Code: 1 bytes", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithMaxStack_cuPg1_fid1() {
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
    Segment segment = new Segment();
    OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    CodeAttribute codeAttribute = new CodeAttribute(2, 1, new byte[1], segment, operandManager, new ArrayList<ExceptionTableEntry>());
    String result = codeAttribute.toString();
    assertEquals("Code: 2 bytes", result);
}
}