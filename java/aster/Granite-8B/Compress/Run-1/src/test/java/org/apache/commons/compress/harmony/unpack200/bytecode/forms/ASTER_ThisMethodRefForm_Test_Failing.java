/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ThisMethodRefForm_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContext_EUGu0_NntE0() {
    OperandManager operandManager = new OperandManager(new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0]);
    String result = operandManager.getCurrentClass();
    assertEquals("OperandManager.getCurrentClass()", result);
}
}