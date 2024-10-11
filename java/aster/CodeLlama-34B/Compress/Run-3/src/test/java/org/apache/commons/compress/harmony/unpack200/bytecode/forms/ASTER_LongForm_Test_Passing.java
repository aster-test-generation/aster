/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode.forms;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LongForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_xFvD0() {
    LongForm longForm = new LongForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_Fyhq1() {
    LongForm longForm = new LongForm(2, "name", new int[] {1, 2, 3});
    assertNotEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentName_klxK2() {
    LongForm longForm = new LongForm(1, "different_name", new int[] {1, 2, 3});
    assertNotEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentRewrite_Fprm3() {
    LongForm longForm = new LongForm(1, "name", new int[] {4, 5, 6});
    assertNotEquals(SegmentConstantPool.CP_LONG, longForm.getPoolID());
}
}