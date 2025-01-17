/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SuperMethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_UMEq0() {
    SuperMethodRefForm superMethodRefForm = new SuperMethodRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_METHOD, superMethodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_zTHj1() {
    SuperMethodRefForm superMethodRefForm = new SuperMethodRefForm(2, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_METHOD, superMethodRefForm.getPoolID());
}
}