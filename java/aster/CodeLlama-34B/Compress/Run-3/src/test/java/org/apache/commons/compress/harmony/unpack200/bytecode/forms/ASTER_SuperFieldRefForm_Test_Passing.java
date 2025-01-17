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
public class Aster_SuperFieldRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_CddY0() {
    SuperFieldRefForm superFieldRefForm = new SuperFieldRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_FIELD, superFieldRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentOpcode_NYLm1() {
    SuperFieldRefForm superFieldRefForm = new SuperFieldRefForm(2, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_FIELD, superFieldRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentName_zaPS2() {
    SuperFieldRefForm superFieldRefForm = new SuperFieldRefForm(1, "different_name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_FIELD, superFieldRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithDifferentRewrite_yoEA3() {
    SuperFieldRefForm superFieldRefForm = new SuperFieldRefForm(1, "name", new int[] {4, 5, 6});
    assertEquals(SegmentConstantPool.CP_FIELD, superFieldRefForm.getPoolID());
}
}