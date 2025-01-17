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
public class Aster_StringRefForm_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID1_iClH0() {
    StringRefForm stringRefForm = new StringRefForm(1, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID2_BWgm1() {
    StringRefForm stringRefForm = new StringRefForm(1, "name", new int[] {1, 2, 3}, true);
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID3_xGNs2() {
    StringRefForm stringRefForm = new StringRefForm(2, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID4_mtaF3() {
    StringRefForm stringRefForm = new StringRefForm(2, "name", new int[] {1, 2, 3}, true);
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID5_ZkTu4() {
    StringRefForm stringRefForm = new StringRefForm(3, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID6_PYyA5() {
    StringRefForm stringRefForm = new StringRefForm(3, "name", new int[] {1, 2, 3}, true);
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID7_oYsz6() {
    StringRefForm stringRefForm = new StringRefForm(4, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID8_bUHd7() {
    StringRefForm stringRefForm = new StringRefForm(4, "name", new int[] {1, 2, 3}, true);
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID9_TlkR8() {
    StringRefForm stringRefForm = new StringRefForm(5, "name", new int[] {1, 2, 3});
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPoolID10_zPxu9() {
    StringRefForm stringRefForm = new StringRefForm(5, "name", new int[] {1, 2, 3}, true);
    assertEquals(SegmentConstantPool.CP_STRING, stringRefForm.getPoolID());
}
}