/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipLong_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithByteArrayAndOffset_ghwq0() {
    byte[] bytes = new byte[8];
    int offset = 4;
    long value = 1234567890L;
    ZipLong.putLong(value, bytes, offset);
    assertArrayEquals(new byte[] {-46,-46,-46,-46,-46,-46,-46,-46 }, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_2_DzIq1() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 1;
    long expected = 0x020304;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_3_JhQB2() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 2;
    long expected = 0x0304;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_4_hoZt3() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 3;
    long expected = 0x04;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_byteArray_offset_zypJ0() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    int offset = 1;
    ZipLong zipLong = new ZipLong(bytes, offset);
    String expected = "ZipLong value: 3";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_negative_OUEh4() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes, 0);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_null_pZmy6() {
    ZipLong zipLong = new ZipLong(new byte[0], 0);
    assertEquals(0, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_empty_VHOz7() {
    byte[] bytes = new byte[] {};
    ZipLong zipLong = new ZipLong(bytes, 0);
    assertEquals(0, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset1_XcMa1() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0203040506L;
    long actual = ZipLong.getValue(bytes, 1);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset2_GJLK2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0405060708L;
    long actual = ZipLong.getValue(bytes, 3);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset4_ipFk4() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0506070809L;
    long actual = ZipLong.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset5_fRfz5() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x060708090aL;
    long actual = ZipLong.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset6_LqRr6() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0708090a0bL;
    long actual = ZipLong.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset7_HNXb7() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x08090a0b0cL;
    long actual = ZipLong.getValue(bytes, 4);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset8_Hkaj8() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0102030405L;
    long actual = ZipLong.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset9_VqNw9() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0a0b0c0d0eL;
    long actual = ZipLong.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithByteArray_EcYV1_QgJJ0() {
    byte[] bytes = new byte[8];
    long value = 1234567890L;
    ZipLong.putLong(value, bytes,-46);
    assertArrayEquals(new byte[] {-46,-46,-46,-46,-46,-46,-46,-46 }, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithIntValue_Mzfl2_rCAD0() {
    byte[] bytes = new byte[8];
    int value = 1234567890;
    ZipLong.putLong((long) value, bytes,-46);
    assertArrayEquals(new byte[] {-46,-46,-46,-46,-46,-46,-46,-46 }, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_long_PkoV1_ppjz0() {
    long value = 1234567890123456789L;
    byte[] expected = {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90, (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
    byte[] actual = ZipLong.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArray_ujIR2_ucYB0() {
    byte[] bytes = {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
    long value = 1234567890;
    byte[] expected = {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
    byte[] actual = ZipLong.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArray_offset_kHgI3_vYdJ0() {
    byte[] bytes = {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
    int offset = 2;
    long value = 1234567890;
    byte[] expected = {(byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90};
    byte[] actual = ZipLong.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_Yxex0_fid2() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    ZipLong zipLong = new ZipLong(bytes, 0);
    assertEquals(1234, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue4_JmZe3_fid2() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    ZipLong zipLong = new ZipLong(bytes);
    assertEquals(1234, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithByteArrayAndOffset_ghwq0_fid2() {
    byte[] bytes = new byte[8];
    int offset = 4;
    long value = 1234567890L;
    ZipLong.putLong(value, bytes, offset);
    assertArrayEquals(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 }, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_1_AOVQ0_fid2() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertEquals(16909060, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_3_FydP2_fid2() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    assertEquals(16909060, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_1_ozLr0_fid2() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 0;
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_byteArray_offset_zypJ0_fid2() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    int offset = 1;
    ZipLong zipLong = new ZipLong(bytes, offset);
    String expected = "ZipLong value: 2";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_byteArray_IELI3_fid2() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    ZipLong zipLong = new ZipLong(bytes);
    String expected = "ZipLong value: 1";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_null_rWAO4() {
    ZipLong zipLong = new ZipLong(null);
    String expected = "ZipLong value: null";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_empty_LXNl5() {
    ZipLong zipLong = new ZipLong(new byte[0]);
    String expected = "ZipLong value: ";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_invalid_GHbP6_fid2() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4});
    String expected = "ZipLong value: 1";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_llWS2_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_negative_OUEh4_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes, -1);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_outOfBounds_aIyD5_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes, 10);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_null_pZmy6_fid2() {
    ZipLong zipLong = new ZipLong(null, 0);
    assertEquals(0, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset2_GJLK2_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0304050607L;
    long actual = ZipLong.getValue(bytes, 2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset4_ipFk4_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0506070809L;
    long actual = ZipLong.getValue(bytes, 4);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset5_fRfz5_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x060708090aL;
    long actual = ZipLong.getValue(bytes, 5);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset6_LqRr6_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0708090a0bL;
    long actual = ZipLong.getValue(bytes, 6);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset7_HNXb7_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x08090a0b0cL;
    long actual = ZipLong.getValue(bytes, 7);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset8_Hkaj8_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x090a0b0c0dL;
    long actual = ZipLong.getValue(bytes, 8);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset9_VqNw9_fid2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5 };
    long expected = 0x0a0b0c0d0eL;
    long actual = ZipLong.getValue(bytes, 9);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithByteArray_EcYV1_QgJJ0_fid3() {
    byte[] bytes = new byte[8];
    long value = 1234567890L;
    ZipLong.putLong(value, bytes, 0);
    assertArrayEquals(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 }, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithIntValue_Mzfl2_rCAD0_fid3() {
    byte[] bytes = new byte[8];
    int value = 1234567890;
    ZipLong.putLong((long) value, bytes, 0);
    assertArrayEquals(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 }, bytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_4_ciAx3_taIm0_fid3() {
    ZipLong zipLong = new ZipLong(1234567890123456789L);
    assertEquals(1234567890123456789L, zipLong.getIntValue());
}
}