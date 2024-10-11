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
public class Aster_ClassRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID_GUgS0() {
    ClassRefForm classRefForm = new ClassRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_CLASS, classRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithWidened_zSph1() {
    ClassRefForm classRefForm = new ClassRefForm(1, "name", new int[] {1, 2, 3}, true);
    assertEquals(SegmentConstantPool.CP_CLASS, classRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolIDWithoutWidened_DEcw2() {
    ClassRefForm classRefForm = new ClassRefForm(1, "name", new int[] {1, 2, 3}, false);
    assertEquals(SegmentConstantPool.CP_CLASS, classRefForm.getPoolID());
}
}