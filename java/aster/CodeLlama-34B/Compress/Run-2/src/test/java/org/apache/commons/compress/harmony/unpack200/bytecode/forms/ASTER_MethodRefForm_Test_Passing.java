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
public class Aster_MethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_uHNb0() {
    MethodRefForm methodRefForm = new MethodRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_METHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_OCwQ1() {
    MethodRefForm methodRefForm = new MethodRefForm(2, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_METHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentName_fQTD2() {
    MethodRefForm methodRefForm = new MethodRefForm(1, "differentName", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_METHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentRewrite_uGtF3() {
    MethodRefForm methodRefForm = new MethodRefForm(1, "name", new int[] {4, 5, 6});
    assertEquals(SegmentConstantPool.CP_METHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithNullRewrite_lLkz4() {
    MethodRefForm methodRefForm = new MethodRefForm(1, "name", null);
    assertEquals(SegmentConstantPool.CP_METHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithEmptyRewrite_UBMq5() {
    MethodRefForm methodRefForm = new MethodRefForm(1, "name", new int[] {});
    assertEquals(SegmentConstantPool.CP_METHOD, methodRefForm.getPoolID());
}
}