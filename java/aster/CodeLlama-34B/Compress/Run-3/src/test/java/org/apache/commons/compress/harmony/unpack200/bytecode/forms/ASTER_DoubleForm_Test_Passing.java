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
public class Aster_DoubleForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_gIFv0() {
    DoubleForm doubleForm = new DoubleForm(1, "double", new int[] {1, 2});
    assertEquals(SegmentConstantPool.CP_DOUBLE, doubleForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_Xjti1() {
    DoubleForm doubleForm = new DoubleForm(2, "double", new int[] {1, 2});
    assertNotEquals(SegmentConstantPool.CP_DOUBLE, doubleForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentName_IaoL2() {
    DoubleForm doubleForm = new DoubleForm(1, "float", new int[] {1, 2});
    assertNotEquals(SegmentConstantPool.CP_DOUBLE, doubleForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentRewrite_vZMP6() {
    DoubleForm doubleForm = new DoubleForm(1, "double", new int[] {1, 3});
    assertNotEquals(SegmentConstantPool.CP_DOUBLE, doubleForm.getPoolID());
}
}