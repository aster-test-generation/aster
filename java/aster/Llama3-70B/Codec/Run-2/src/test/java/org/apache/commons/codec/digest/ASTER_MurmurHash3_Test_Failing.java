/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MurmurHash3_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32x86_QKOp0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    int result = MurmurHash3.hash32x86(data);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash64_GUTG0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    long result = MurmurHash3.hash64(data);
    assertEquals(1640531513903545537L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_qvOA0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    int length = data.length;
    int seed = 42;
    int result = MurmurHash3.hash32(data, length, seed);
    assertEquals(2136336479, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash128x64_sXsJ0() {
    byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    int offset = 0;
    int length = 16;
    int seed = 1;
    long[] result = MurmurHash3.hash128x64(data, offset, length, seed);
    assertArrayEquals(new long[] { 134559342449664L, 651762815094664L }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash64_1_iLIs0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    long result = MurmurHash3.hash64(data, 0, 8, 1);
    assertEquals(1229782938247303441L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash64_2_EILr1() {
    byte[] data = new byte[] {9, 10, 11, 12, 13, 14, 15, 16};
    long result = MurmurHash3.hash64(data, 0, 8, 2);
    assertEquals(-844426571634234496L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_BbIj0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    int length = data.length;
    int result = MurmurHash3.hash32(data, length);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_zIqz0() {
    long data = 1234567890L;
    int seed = 42;
    int result = MurmurHash3.hash32(data, seed);
    assertEquals(1342177283, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_gsOB0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    int result = MurmurHash3.hash32(data);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash64_cXiE0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    long result = MurmurHash3.hash64(data, 0, data.length);
    assertEquals(1229782938247305611L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_jzaf0() {
    long data = 1234567890L;
    int seed = 42;
    int result = MurmurHash3.hash32(data, seed);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_1_ztrW0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int offset = 0;
    int length = 10;
    int seed = 1;
    int result = MurmurHash3.hash32(data, offset, length, seed);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_2_HMFw1() {
    byte[] data = new byte[] {1, 2, 3, 4};
    int offset = 0;
    int length = 4;
    int seed = 2;
    int result = MurmurHash3.hash32(data, offset, length, seed);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash64_1_ejsx0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    long result = MurmurHash3.hash64(data, 0, data.length, 1);
    assertEquals(1640531513914599857L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash64_2_TRYQ1() {
    byte[] data = new byte[] {9, 10, 11, 12, 13, 14, 15, 16};
    long result = MurmurHash3.hash64(data, 0, data.length, 2);
    assertEquals(-8444249301314535651L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32x86_EmptyArray_aJyd1() {
    byte[] data = new byte[] {};
    int offset = 0;
    int length = 0;
    int seed = 1;
    int result = MurmurHash3.hash32x86(data, offset, length, seed);
    assertEquals(seed, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_1_GqUy0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    int offset = 0;
    int length = 8;
    int seed = 1;
    int result = MurmurHash3.hash32(data, offset, length, seed);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_2_yZfO1() {
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7};
    int offset = 0;
    int length = 7;
    int seed = 1;
    int result = MurmurHash3.hash32(data, offset, length, seed);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32x86_EFNn0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    int result = MurmurHash3.hash32x86(data, 0, data.length, 1);
    assertEquals(1327444373, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_GrvQ0_fILl0() {
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int offset = 0;
    int length = 16;
    int seed = 1;
    int expected = 123456789;
    int actual = MurmurHash3.hash32x86(data, offset, length, seed);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_pGKf0_MwBP0() {
    int result = MurmurHash3.hash32x86(new byte[0], 0, 0, 123456789);
    assertEquals(123456789, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_hLIY0_CRow0() {
    long data1 = 123456789L;
    long data2 = 987654321L;
    byte[] data = new byte[16];
    for (int i = 0; i < 8; i++) {
        data[i] = (byte) ((data1 >> (56 - i * 8)) & 0xff);
        data[i + 8] = (byte) ((data2 >> (56 - i * 8)) & 0xff);
    }
    int result = MurmurHash3.hash32x86(data, 0, 16, 0);
    assertEquals(2147483647, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32x86_lvsd0_oUcp0() {
    byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    int offset = 0;
    int length = 16;
    int seed = 1;
    int expected = 1345678909;
    int result = MurmurHash3.hash32x86(data, offset, length, seed);
    assertEquals(expected, result);
}
@Test
@Timeout(value =1364076727, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32x86_EmptyArray_aJyd1_fid1() {
    byte[] data = new byte[] {};
    int offset = 0;
    int length = 0;
    int seed =1364076727;
    int result = MurmurHash3.hash32x86(data, offset, length, seed);
    assertEquals(seed, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHash32_pGKf0_MwBP0_fid1() {
    int result = MurmurHash3.hash32x86(new byte[0], 0, 0,-1168058214);
    assertEquals(123456789, result);
}
}