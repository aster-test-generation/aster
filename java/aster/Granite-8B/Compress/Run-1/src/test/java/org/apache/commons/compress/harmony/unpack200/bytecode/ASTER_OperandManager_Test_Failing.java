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
public class Aster_OperandManager_Test_Failing {
    OperandManager operandManager;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testNextMethodRef_meKJ0() {
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
		int result = operandManager.nextMethodRef();
		assertEquals(1, result);
	}
}