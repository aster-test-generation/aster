/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipEightByteInteger_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_nviM0() {
    ZipEightByteInteger obj = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    assertTrue(obj.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentValue_UWyB2() {
    ZipEightByteInteger obj1 = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipEightByteInteger obj2 = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 9});
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_1_PipT0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int offset = 0;
    long expected = 0x0102030405060708L;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_2_moeL1() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int offset = 1;
    long expected = 0x0203040506070809L;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_3_QYzS2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int offset = 2;
    long expected = 0x030405060708090AL;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_4_YnLv3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int offset = 3;
    long expected = 0x0405060708090A0BL;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_BigInteger_ZyKl0() {
    BigInteger value = new BigInteger("1234567890");
    ZipEightByteInteger zip = new ZipEightByteInteger(value);
    assertEquals("ZipEightByteInteger value: 1234567890", zip.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_Long_ZTZH1() {
    long value = 1234567890L;
    ZipEightByteInteger zip = new ZipEightByteInteger(value);
    assertEquals("ZipEightByteInteger value: 1234567890", zip.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_ByteArray_uAqF2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    ZipEightByteInteger zip = new ZipEightByteInteger(bytes);
    assertEquals("ZipEightByteInteger value: 1234567890", zip.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_ByteArrayAndOffset_pMRI3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    int offset = 2;
    ZipEightByteInteger zip = new ZipEightByteInteger(bytes, offset);
    assertEquals("ZipEightByteInteger value: 34567890", zip.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_BigInteger_QTYA0() {
    BigInteger value = new BigInteger("1234567890");
    ZipEightByteInteger zip = new ZipEightByteInteger(value);
    assertEquals(value, zip.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Long_CdLR1() {
    long value = 1234567890L;
    ZipEightByteInteger zip = new ZipEightByteInteger(value);
    assertEquals(value, zip.getValue().longValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_XAVu2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ZipEightByteInteger zip = new ZipEightByteInteger(bytes);
    assertEquals(new BigInteger(bytes), zip.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArrayOffset_SaTw3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int offset = 2;
    ZipEightByteInteger zip = new ZipEightByteInteger(bytes, offset);
    assertEquals(new BigInteger(Arrays.copyOfRange(bytes, offset, bytes.length)), zip.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_ValidBytes_ReturnsLongValue_ydYL0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    long expected = 1234567890L;
    long actual = ZipEightByteInteger.getLongValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_InvalidBytes_ReturnsZero_qANc1() {
    byte[] bytes = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 };
    long expected = 0L;
    long actual = ZipEightByteInteger.getLongValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_NullBytes_ThrowsNullPointerException_kQRO2() {
    byte[] bytes = null;
    try {
        ZipEightByteInteger.getLongValue(bytes);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertTrue(true);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_EmptyBytes_ThrowsIllegalArgumentException_fdai3() {
    byte[] bytes = new byte[0];
    try {
        ZipEightByteInteger.getLongValue(bytes);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertTrue(true);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_1_qMRO0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_2_zoUx1() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_3_lLyi2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 1);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_4_SCXj3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_5_eBzL4() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 3);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_6_jGVc5() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 4);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_7_neTN6() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 5);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_8_JOtU7() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 6);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_9_oLTc8() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 7);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_BigInteger_UjsU0() {
    BigInteger value = new BigInteger("1234567890");
    ZipEightByteInteger zip = new ZipEightByteInteger(value);
    int expected = value.hashCode();
    int actual = zip.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_Long_uhPJ1() {
    long value = 1234567890L;
    ZipEightByteInteger zip = new ZipEightByteInteger(value);
    int expected = (int) value;
    int actual = zip.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_ByteArray_vfWa2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ZipEightByteInteger zip = new ZipEightByteInteger(bytes);
    int expected = Arrays.hashCode(bytes);
    int actual = zip.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_zero_utue8() {
    BigInteger value = BigInteger.ZERO;
    byte[] expected = { 0x00 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_1_ovrL0() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    int offset = 0;
    BigInteger expected = BigInteger.valueOf(0x0102030405060708L);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_BigInteger_PxCR0_PEgK1() {
    BigInteger bigInteger = new BigInteger("12345678901234567890");
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
    assertEquals(bigInteger, zipEightByteInteger.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_Long_RPIn1_xQQd0() {
    long value = 1234567890123456789L;
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(value);
    assertEquals(1234567890123456789L, zipEightByteInteger.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_ByteArrayAndOffset_GVdF3_giKH0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int offset = 2;
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes, offset);
    assertEquals(1234567890123456789L, zipEightByteInteger.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_cxIW0_fgVU0() {
    BigInteger value = new BigInteger("1234567890");
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(value);
    byte[] expected = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = zipEightByteInteger.getBytes();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_ByteArray_cPDw2_yaMc0() {
    byte[] bytes = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes);
    byte[] expected = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = zipEightByteInteger.getBytes();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_ByteArrayAndOffset_Ghzg3_KeAk0() {
    byte[] bytes = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    int offset = 2;
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes, offset);
    byte[] expected = new byte[] { (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = zipEightByteInteger.getBytes();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_Long_JVjN1_EuWO0() {
    long value = 1234567890L;
    byte[] expected = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_long_HDDw0_gvlo0() {
    long value = 1234567890L;
    byte[] expected = { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_cNkE1_tsvT0() {
    BigInteger value = BigInteger.valueOf(1234567890L);
    byte[] expected = { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_negative_ySVr4_WdlI0() {
    BigInteger value = BigInteger.valueOf(-1234567890L);
    byte[] expected = { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_long_negative_NoWi5_EIzO0() {
    long value = -1234567890L;
    byte[] expected = { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
}