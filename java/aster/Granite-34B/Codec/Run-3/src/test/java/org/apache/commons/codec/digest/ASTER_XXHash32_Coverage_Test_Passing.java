/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XXHash32_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate1_XLwy0() {
	XXHash32 xxhash32 = new XXHash32(0);
	xxhash32.update(new byte[0], 0, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate6_AbAj5() {
	XXHash32 xxhash32 = new XXHash32(0);
	byte[] array = new byte[5];
	xxhash32.update(array, 0, 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate12_stmv11() {
	XXHash32 xxhash32 = new XXHash32(0);
	xxhash32.update(new byte[11], 0, 11);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate14_DLzh13() {
	XXHash32 xxhash32 = new XXHash32(0);
	byte[] data = new byte[13];
	Arrays.fill(data, (byte) 1);
	xxhash32.update(data, 0, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate1_AuCt0() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 0, 4);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate2_QlIj1() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 0, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate3_WtON2() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 0, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate4_qOYg3() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 0, 2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate5_wolB4() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 0, 3);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate9_MIvP8() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 1, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate11_REaf10() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 1, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate12_ITAj11() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 1, 2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate13_bwia12() {
    XXHash32 xxHash32 = new XXHash32(10);
    xxHash32.update(new byte[]{1, 2, 3, 4}, 1, 3);
}
}