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
public void testGetPoolID_EYTQ0() {
    DoubleForm doubleForm = new DoubleForm(1, "name", new int[] {1, 2, 3});
    int poolID = doubleForm.getPoolID();
    assertEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_DFdv1() {
    DoubleForm doubleForm = new DoubleForm(2, "name", new int[] {1, 2, 3});
    int poolID = doubleForm.getPoolID();
    assertNotEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentName_Phcc2() {
    DoubleForm doubleForm = new DoubleForm(1, "different_name", new int[] {1, 2, 3});
    int poolID = doubleForm.getPoolID();
    assertNotEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentRewrite_OHup3() {
    DoubleForm doubleForm = new DoubleForm(1, "name", new int[] {4, 5, 6});
    int poolID = doubleForm.getPoolID();
    assertNotEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithNullRewrite_MkeW4() {
    DoubleForm doubleForm = new DoubleForm(1, "name", null);
    int poolID = doubleForm.getPoolID();
    assertEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithEmptyRewrite_ybad5() {
    DoubleForm doubleForm = new DoubleForm(1, "name", new int[] {});
    int poolID = doubleForm.getPoolID();
    assertEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithNullName_ITwT6() {
    DoubleForm doubleForm = new DoubleForm(1, null, new int[] {1, 2, 3});
    int poolID = doubleForm.getPoolID();
    assertEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithEmptyName_iwoN7() {
    DoubleForm doubleForm = new DoubleForm(1, "", new int[] {1, 2, 3});
    int poolID = doubleForm.getPoolID();
    assertEquals(SegmentConstantPool.CP_DOUBLE, poolID);
}
}