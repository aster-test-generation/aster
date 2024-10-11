/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CodeAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength2_Droa1() {
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
    Segment segment = new Segment();
    CodeAttribute codeAttribute = new CodeAttribute(1, 1, new byte[2], segment, operandManager, new ArrayList<ExceptionTableEntry>());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries1_gOyI0() {
    int maxStack = 10;
    int maxLocals = 20;
    byte[] codePacked = new byte[10];
    Segment segment = new Segment();
    int[] bcCaseCount = new int[10];
    int[] bcCaseValue = new int[10];
    int[] bcByte = new int[10];
    int[] bcShort = new int[10];
    int[] bcLocal = new int[10];
    int[] bcLabel = new int[10];
    int[] bcIntRef = new int[10];
    int[] bcFloatRef = new int[10];
    int[] bcLongRef = new int[10];
    int[] bcDoubleRef = new int[10];
    int[] bcStringRef = new int[10];
    int[] bcClassRef = new int[10];
    int[] bcFieldRef = new int[10];
    int[] bcMethodRef = new int[10];
    int[] bcIMethodRef = new int[10];
    int[] bcThisField = new int[10];
    int[] bcSuperField = new int[10];
    int[] bcThisMethod = new int[10];
    int[] bcSuperMethod = new int[10];
    int[] bcInitRef = new int[10];
    int[] wideByteCodes = new int[10];
    OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    List<ExceptionTableEntry> exceptionTable = new ArrayList<>();
    CodeAttribute codeAttribute = new CodeAttribute(maxStack, maxLocals, codePacked, segment, operandManager, exceptionTable);
    ClassFileEntry[] result = codeAttribute.getNestedClassFileEntries();
    assert(result != null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody3_Moji2() throws IOException {
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
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_cPNp0_EWwC0() {
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
    Segment segment = new Segment(); // Assuming Segment is in the same package
    CodeAttribute codeAttribute = new CodeAttribute(1, 1, new byte[1], segment, operandManager, new ArrayList<ExceptionTableEntry>());
    assertEquals("Code: 13 bytes", codeAttribute.toString());
}
}