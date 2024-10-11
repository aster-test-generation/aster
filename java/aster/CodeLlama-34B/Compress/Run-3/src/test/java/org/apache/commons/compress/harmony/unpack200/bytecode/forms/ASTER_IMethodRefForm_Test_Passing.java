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
public class Aster_IMethodRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_YEck0() {
    IMethodRefForm methodRefForm = new IMethodRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_IMETHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_MtKb1() {
    IMethodRefForm methodRefForm = new IMethodRefForm(2, "name", new int[] {1, 2, 3});
    assertNotEquals(SegmentConstantPool.CP_IMETHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentName_AHmA2() {
    IMethodRefForm methodRefForm = new IMethodRefForm(1, "differentName", new int[] {1, 2, 3});
    assertNotEquals(SegmentConstantPool.CP_IMETHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentRewrite_HXPl3() {
    IMethodRefForm methodRefForm = new IMethodRefForm(1, "name", new int[] {4, 5, 6});
    assertNotEquals(SegmentConstantPool.CP_IMETHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithNullRewrite_CBpK4() {
    IMethodRefForm methodRefForm = new IMethodRefForm(1, "name", null);
    assertEquals(SegmentConstantPool.CP_IMETHOD, methodRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithEmptyRewrite_xYfM5() {
    IMethodRefForm methodRefForm = new IMethodRefForm(1, "name", new int[] {});
    assertEquals(SegmentConstantPool.CP_IMETHOD, methodRefForm.getPoolID());
}
}