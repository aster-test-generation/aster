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
public class Aster_ZipEightByteInteger_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_ValidInput_fVVs0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int offset = 0;
    long expected = 123456789;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_InvalidInput_PGuQ1() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int offset = 1;
    long expected = 123456789;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_NullInput_KpsJ2() {
    byte[] bytes = null;
    int offset = 0;
    long expected = 0;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_EmptyInput_cxjA3() {
    byte[] bytes = new byte[] {};
    int offset = 0;
    long expected = 0;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Long_qHoe1() {
    long value = 1234567890L;
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(value);
    assertEquals(value, zipEightByteInteger.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Hjtm2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes);
    assertEquals(new BigInteger(bytes), zipEightByteInteger.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArrayOffset_yoZg3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int offset = 2;
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes, offset);
    assertEquals(new BigInteger(Arrays.copyOfRange(bytes, offset, bytes.length)), zipEightByteInteger.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_sVYf1() {
    ZipEightByteInteger obj1 = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    ZipEightByteInteger obj2 = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 1);
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithByteArrayAndOffset_hZum0() {
    byte[] bytes = new byte[8];
    int offset = 2;
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes, offset);
    byte[] actualBytes = zipEightByteInteger.getBytes();
    assertArrayEquals(bytes, actualBytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytesWithBigInteger_ipZn1() {
    BigInteger value = new BigInteger("1234567890");
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(value);
    byte[] actualBytes = zipEightByteInteger.getBytes();
    assertArrayEquals(value.toByteArray(), actualBytes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_ByteArray_TSZs2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes);
    assertEquals(1234567890L, zipEightByteInteger.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_ByteArrayOffset_FnsT3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int offset = 2;
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes, offset);
    assertEquals(1234567890L, zipEightByteInteger.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_ByteArray_tkxE2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes);
    int expected = Arrays.hashCode(bytes);
    int actual = zipEightByteInteger.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_Empty_pEYb5() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[0]);
    String expected = "ZipEightByteInteger value: ";
    String actual = zipEightByteInteger.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset0_ewmY0() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset1_ZMXK1() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("23456789", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 1);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset2_HQUV2() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("34567890", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset3_QqNh3() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("45678901", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 3);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset4_pOsc4() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("56789012", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 4);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset5_lner5() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("67890123", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 5);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset6_OFIs6() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("78901234", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 6);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_1_ajqB0() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    int offset = 0;
    BigInteger expected = BigInteger.valueOf(0x0102030405060708L);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_InvalidInput_PGuQ1_fid1() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    int offset = 1;
    long expected = 123456789;
    long actual = ZipEightByteInteger.getLongValue(bytes, offset);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteArray_Hjtm2_fid1() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes);
    assertEquals(new BigInteger("4759477275222530853130"), zipEightByteInteger.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset3_QqNh3_fid1() {
    byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 };
    BigInteger expected = new BigInteger("12345678", 10);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 3);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_WithBigInteger_BbkT0_xsHN0() {
    BigInteger bigInteger = new BigInteger("1234567890");
    long expected = 1234567890L;
    long actual = ZipEightByteInteger.getLongValue(bigInteger.toByteArray());
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_WithByteArray_fLHf2_hlKy0() {
    byte[] bytes = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    long expected = 1234567890L;
    long actual = ZipEightByteInteger.getLongValue(bytes);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_DiFP0_BHLz0() {
    BigInteger value = new BigInteger("1234567890");
    byte[] expected = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_Long_dljf1_BkHM0() {
    long value = 1234567890L;
    byte[] expected = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_ByteArray_YcDm2_fMsE0() {
    byte[] bytes = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bytes);
    String expected = "ZipEightByteInteger value: 1234567890";
    String actual = zipEightByteInteger.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_Negative_cbCa6_vLmX0() {
    BigInteger value = new BigInteger("-1234567890");
    byte[] expected = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_Long_Negative_kZjQ7_DaLb0() {
    long value = -1234567890L;
    byte[] expected = new byte[] { (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x90 };
    byte[] actual = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_Null_gafd4_mAyp0_fid2() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[0]);
    String expected = "ZipEightByteInteger value: null";
    String actual = zipEightByteInteger.toString();
    assertEquals(expected, actual);
}
}