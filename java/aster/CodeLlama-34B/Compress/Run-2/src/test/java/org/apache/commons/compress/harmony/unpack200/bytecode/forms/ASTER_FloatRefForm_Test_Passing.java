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
public class Aster_FloatRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_hMBF0() {
    FloatRefForm floatRefForm = new FloatRefForm(1, "name", new int[] {1, 2, 3}, true);
    assertEquals(SegmentConstantPool.CP_FLOAT, floatRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithoutWidened_zZKy2() {
    FloatRefForm floatRefForm = new FloatRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_FLOAT, floatRefForm.getPoolID());
}
}