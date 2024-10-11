/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import org.apache.commons.compress.utils.ByteUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipLong_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLong_QDqE0_1() {
    long value = 1234567890L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = -1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = 5;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLong_QDqE0_2() {
    long value = 1234567890L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = -1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = 5;
    ZipLong.putLong(value, buf, offset);
    assertEquals(-1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLong_QDqE0_3() {
    long value = 1234567890L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = -1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = 5;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890123456789L, ByteUtils.fromLittleEndian(buf, offset, 4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLong_QDqE0_4() {
    long value = 1234567890L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = -1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = null;
    offset = 1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = -1;
    ZipLong.putLong(value, buf, offset);
    value = 1234567890L;
    buf = new byte[4];
    offset = 5;
    ZipLong.putLong(value, buf, offset);
    assertEquals(-1234567890123456789L, ByteUtils.fromLittleEndian(buf, offset, 4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_hyoS0() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertTrue(zipLong.equals(zipLong));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_ascF1() {
    ZipLong zipLong1 = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    ZipLong zipLong2 = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertTrue(zipLong1.equals(zipLong2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_EWXG3() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertFalse(zipLong.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithByteArrayAndOffset_uJPK0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4 };
    int offset = 0;
    ZipLong zipLong = new ZipLong(bytes, offset);
    String expected = "ZipLong value: 1073741824";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithIntValue_YEDC1() {
    int value = 1073741824;
    ZipLong zipLong = new ZipLong(value);
    String expected = "ZipLong value: 1073741824";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithLongValue_NIGI2() {
    long value = 1073741824L;
    ZipLong zipLong = new ZipLong(value);
    String expected = "ZipLong value: 1073741824";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithByteArray_Prsa3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4 };
    ZipLong zipLong = new ZipLong(bytes);
    String expected = "ZipLong value: 1073741824";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Offset_aPlO0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4 };
    int offset = 1;
    ZipLong zipLong = new ZipLong(bytes, offset);
    assertEquals(2, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Int_IQcB1() {
    int value = 123456789;
    ZipLong zipLong = new ZipLong(value);
    assertEquals(value, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Long_sKlu2() {
    long value = 1234567890123456789L;
    ZipLong zipLong = new ZipLong(value);
    assertEquals(value, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_zeNt3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ZipLong zipLong = new ZipLong(bytes);
    assertEquals(1234567890123456789L, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithByteArrayAndOffset_tMDh0() {
    byte[] bytes = new byte[4];
    int offset = 0;
    ZipLong zipLong = new ZipLong(bytes, offset);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithIntValue_CPwb1() {
    int value = 123456789;
    ZipLong zipLong = new ZipLong(value);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(new byte[] { 7, 5, 4, 3 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithLongValue_UEmk2() {
    long value = 1234567890123456789L;
    ZipLong zipLong = new ZipLong(value);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithByteArray_onze3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes);
    byte[] result = zipLong.getBytes();
    assertArrayEquals(bytes, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_1_DNKk0() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_2_sMPa1() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 1);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_3_hKQj2() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_4_Zsrg3() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 3);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_5_qxIk4() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 4);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_6_BtJw5() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 5);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_7_GRyv6() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 6);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_8_AtpA7() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 7);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_9_heYp8() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 8);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_10_zStu9() {
    byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 9);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_int_SFjo0() {
    ZipLong zipLong = new ZipLong(123456789);
    assertEquals(123456789, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_long_Vton1() {
    ZipLong zipLong = new ZipLong(123456789L);
    assertEquals(123456789, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_intValue_SbGV0() {
    ZipLong zipLong = new ZipLong(123456789);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_longValue_hAlx1() {
    ZipLong zipLong = new ZipLong(123456789L);
    assertEquals(123456789L, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_LMpQ2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayAndOffset_kxsR3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes, 0);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_int_zHvi0() {
    long value = 1234567890L;
    byte[] expected = new byte[] { 0x78, 0x56, 0x34, 0x12 };
    byte[] actual = ZipLong.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithValidValue_wMiI0() {
    ZipLong zipLong = new ZipLong(100L);
    byte[] buf = new byte[8];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(100L, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithNegativeValue_ahjG1() {
    ZipLong zipLong = new ZipLong(-100L);
    byte[] buf = new byte[8];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(-100L, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithLargeValue_pwrt2() {
    ZipLong zipLong = new ZipLong(Long.MAX_VALUE);
    byte[] buf = new byte[8];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(Long.MAX_VALUE, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongWithSmallValue_qxHR3() {
    ZipLong zipLong = new ZipLong(Long.MIN_VALUE);
    byte[] buf = new byte[8];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(Long.MIN_VALUE, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_byteArray_offset_RvnK0() {
    byte[] bytes = new byte[4];
    int offset = 0;
    ZipLong zipLong = new ZipLong(bytes, offset);
    Object clone = zipLong.clone();
    assertEquals(zipLong, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_int_eLKL1() {
    int value = 123456789;
    ZipLong zipLong = new ZipLong(value);
    Object clone = zipLong.clone();
    assertEquals(zipLong, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_long_rNoD2() {
    long value = 1234567890123456789L;
    ZipLong zipLong = new ZipLong(value);
    Object clone = zipLong.clone();
    assertEquals(zipLong, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_byteArray_Eqsy3() {
    byte[] bytes = new byte[4];
    ZipLong zipLong = new ZipLong(bytes);
    Object clone = zipLong.clone();
    assertEquals(zipLong, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_NKLp0() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 0;
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_EnRw1() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 1;
    long expected = 0x020304;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue3_YvHl2() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 2;
    long expected = 0x0304;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue4_oFWz3() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
    int offset = 3;
    long expected = 0x04;
    long actual = ZipLong.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLong_QDqE0() {
    long value = 1234567890L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
    value = -1234567890L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(-1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
    value = 1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890123456789L, ByteUtils.fromLittleEndian(buf, offset, 4));
    value = -1234567890123456789L;
    buf = new byte[4];
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(-1234567890123456789L, ByteUtils.fromLittleEndian(buf, offset, 4));
    value = 1234567890L;
    buf = null;
    offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
    value = 1234567890L;
    buf = null;
    offset = 1;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
    value = 1234567890L;
    buf = new byte[4];
    offset = -1;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
    value = 1234567890L;
    buf = new byte[4];
    offset = 5;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
}
}