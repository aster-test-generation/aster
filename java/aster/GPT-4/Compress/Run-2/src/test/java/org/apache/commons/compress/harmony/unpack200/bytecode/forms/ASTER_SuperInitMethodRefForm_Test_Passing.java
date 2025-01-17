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
public class Aster_SuperInitMethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testContextReturnsSuperClass_ktoR0() {
    OperandManager operandManager = new OperandManager(
        new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}, new int[]{}
    );
    operandManager.setSuperClass("SuperClassName");
    SuperInitMethodRefForm form = new SuperInitMethodRefForm(0, "methodName", new int[]{});
    String result = form.context(operandManager);
    assertEquals("SuperClassName", result);
}
}