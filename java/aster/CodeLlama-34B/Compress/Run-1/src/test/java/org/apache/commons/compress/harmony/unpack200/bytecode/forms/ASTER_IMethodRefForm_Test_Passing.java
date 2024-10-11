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
public class Aster_IMethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_vJRV0() {
    IMethodRefForm iMethodRefForm = new IMethodRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_IMETHOD, iMethodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_QcWh1() {
    IMethodRefForm iMethodRefForm = new IMethodRefForm(2, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_IMETHOD, iMethodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentName_bDFg2() {
    IMethodRefForm iMethodRefForm = new IMethodRefForm(1, "differentName", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_IMETHOD, iMethodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentRewrite_BBdB3() {
    IMethodRefForm iMethodRefForm = new IMethodRefForm(1, "name", new int[] {4, 5, 6});
    assertEquals(SegmentConstantPool.CP_IMETHOD, iMethodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithNullRewrite_yJGZ4() {
    IMethodRefForm iMethodRefForm = new IMethodRefForm(1, "name", new int[0]);
    assertEquals(SegmentConstantPool.CP_IMETHOD, iMethodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithEmptyRewrite_CwWa5() {
    IMethodRefForm iMethodRefForm = new IMethodRefForm(1, "name", new int[] {});
    assertEquals(SegmentConstantPool.CP_IMETHOD, iMethodRefForm.getPoolID());
}
}