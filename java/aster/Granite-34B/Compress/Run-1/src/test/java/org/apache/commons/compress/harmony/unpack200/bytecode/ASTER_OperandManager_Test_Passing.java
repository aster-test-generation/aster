/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OperandManager_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextLocal_Mvhv0() {
        final int[] bcCaseCount = new int[10];
        final int[] bcCaseValue = new int[10];
        final int[] bcByte = new int[10];
        final int[] bcShort = new int[10];
        final int[] bcLocal = new int[10];
        final int[] bcLabel = new int[10];
        final int[] bcIntRef = new int[10];
        final int[] bcFloatRef = new int[10];
        final int[] bcLongRef = new int[10];
        final int[] bcDoubleRef = new int[10];
        final int[] bcStringRef = new int[10];
        final int[] bcClassRef = new int[10];
        final int[] bcFieldRef = new int[10];
        final int[] bcMethodRef = new int[10];
        final int[] bcIMethodRef = new int[10];
        final int[] bcThisField = new int[10];
        final int[] bcSuperField = new int[10];
        final int[] bcThisMethod = new int[10];
        final int[] bcSuperMethod = new int[10];
        final int[] bcInitRef = new int[10];
        final int[] wideByteCodes = new int[10];
        OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
        int expected = bcLocal[0];
        int actual = operandManager.nextLocal();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextInitRef_olSy0() {
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
        int expected = bcInitRef[0];
        int actual = operandManager.nextInitRef();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextFieldRef_PaRX0() {
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
        int result = operandManager.nextFieldRef();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextLabel_njJv0() {
    final int[] bcCaseCount = new int[10];
    final int[] bcCaseValue = new int[10];
    final int[] bcByte = new int[10];
    final int[] bcShort = new int[10];
    final int[] bcLocal = new int[10];
    final int[] bcLabel = new int[10];
    final int[] bcIntRef = new int[10];
    final int[] bcFloatRef = new int[10];
    final int[] bcLongRef = new int[10];
    final int[] bcDoubleRef = new int[10];
    final int[] bcStringRef = new int[10];
    final int[] bcClassRef = new int[10];
    final int[] bcFieldRef = new int[10];
    final int[] bcMethodRef = new int[10];
    final int[] bcIMethodRef = new int[10];
    final int[] bcThisField = new int[10];
    final int[] bcSuperField = new int[10];
    final int[] bcThisMethod = new int[10];
    final int[] bcSuperMethod = new int[10];
    final int[] bcInitRef = new int[10];
    final int[] wideByteCodes = new int[10];
    OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    int result = operandManager.nextLabel();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextLabelCoverage_GIOy1() {
    final int[] bcCaseCount = new int[10];
    final int[] bcCaseValue = new int[10];
    final int[] bcByte = new int[10];
    final int[] bcShort = new int[10];
    final int[] bcLocal = new int[10];
    final int[] bcLabel = new int[10];
    final int[] bcIntRef = new int[10];
    final int[] bcFloatRef = new int[10];
    final int[] bcLongRef = new int[10];
    final int[] bcDoubleRef = new int[10];
    final int[] bcStringRef = new int[10];
    final int[] bcClassRef = new int[10];
    final int[] bcFieldRef = new int[10];
    final int[] bcMethodRef = new int[10];
    final int[] bcIMethodRef = new int[10];
    final int[] bcThisField = new int[10];
    final int[] bcSuperField = new int[10];
    final int[] bcThisMethod = new int[10];
    final int[] bcSuperMethod = new int[10];
    final int[] bcInitRef = new int[10];
    final int[] wideByteCodes = new int[10];
    OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
    operandManager.nextLabel();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextMethodRef_JZLe0() {
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
        int result = operandManager.nextMethodRef();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextWideByteCode_csaN0() {
        final int[] bcCaseCount = new int[10];
        final int[] bcCaseValue = new int[10];
        final int[] bcByte = new int[10];
        final int[] bcShort = new int[10];
        final int[] bcLocal = new int[10];
        final int[] bcLabel = new int[10];
        final int[] bcIntRef = new int[10];
        final int[] bcFloatRef = new int[10];
        final int[] bcLongRef = new int[10];
        final int[] bcDoubleRef = new int[10];
        final int[] bcStringRef = new int[10];
        final int[] bcClassRef = new int[10];
        final int[] bcFieldRef = new int[10];
        final int[] bcMethodRef = new int[10];
        final int[] bcIMethodRef = new int[10];
        final int[] bcThisField = new int[10];
        final int[] bcSuperField = new int[10];
        final int[] bcThisMethod = new int[10];
        final int[] bcSuperMethod = new int[10];
        final int[] bcInitRef = new int[10];
        final int[] wideByteCodes = new int[10];
        OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal, bcLabel, bcIntRef, bcFloatRef, bcLongRef, bcDoubleRef, bcStringRef, bcClassRef, bcFieldRef, bcMethodRef, bcIMethodRef, bcThisField, bcSuperField, bcThisMethod, bcSuperMethod, bcInitRef, wideByteCodes);
        int result = operandManager.nextWideByteCode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextClassRef_ZCVS0() {
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
        int result = operandManager.nextClassRef();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextCaseCount_XcBC0_1() {
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
        assertEquals(0, operandManager.nextCaseCount());}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextCaseCount_XcBC0_2() {
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
        assertEquals(1, operandManager.nextCaseCount());}
}