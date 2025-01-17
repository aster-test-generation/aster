/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_OperandManager_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextIMethodRef_Wpja0_UKkA0() {
    int[] bcIntRef = new int[1];
    int bcIntRefIndex = 0;
    OperandManager operandManager = new OperandManager(new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], bcIntRef, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], bcIntRef, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0]);
    operandManager.bcIntRefIndex = bcIntRefIndex;
    int result = operandManager.nextIntRef();
    Assertions.assertEquals(bcIntRef[0], result);
}
}