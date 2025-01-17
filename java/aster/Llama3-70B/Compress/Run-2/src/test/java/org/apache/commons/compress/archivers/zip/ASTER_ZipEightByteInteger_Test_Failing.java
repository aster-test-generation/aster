/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipEightByteInteger_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_hyGB0() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    bytes[4] = (byte) 0x90;
    bytes[5] = (byte) 0xAB;
    bytes[6] = (byte) 0xCD;
    bytes[7] = (byte) 0xEF;
    BigInteger expected = BigInteger.valueOf(0x1234567890ABCDEFL);
    BigInteger actual = ZipEightByteInteger.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_NkyM0() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    bytes[4] = (byte) 0x90;
    bytes[5] = (byte) 0xAB;
    bytes[6] = (byte) 0xCD;
    bytes[7] = (byte) 0xEF;
    BigInteger result = ZipEightByteInteger.getValue(bytes, 0);
    assertEquals(new BigInteger("1234567890ABCDEFL"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_mqwc0() {
    BigInteger value = new BigInteger("1234567890123456789");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte)21, (byte) 210, (byte) 51, (byte) 12, (byte) 34, (byte) 56, (byte) 78, (byte) 90}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_ZHhS5() {
    BigInteger value = new BigInteger("4294967295");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_nQJj7() {
    BigInteger value = new BigInteger("9223372036854775806");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte)-2, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte)-2}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_jfCO1() {
    byte[] result = ZipEightByteInteger.getBytes(1L);
    assertArrayEquals(new byte[]{0,1,1,1,1,1,1, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_jtKz2() {
    byte[] result = ZipEightByteInteger.getBytes(Long.MAX_VALUE);
    assertArrayEquals(new byte[]{(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_hyGB0_fid1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    bytes[4] = (byte) 0x90;
    bytes[5] = (byte) 0xAB;
    bytes[6] = (byte) 0xCD;
    bytes[7] = (byte) 0xEF;
    long expected = 0x1234567890ABCDEFL;
    long actual = ZipEightByteInteger.getLongValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_NkyM0_fid1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    bytes[4] = (byte) 0x90;
    bytes[5] = (byte) 0xAB;
    bytes[6] = (byte) 0xCD;
    bytes[7] = (byte) 0xEF;
    long result = ZipEightByteInteger.getLongValue(bytes);
    assertEquals(0x1234567890ABCDEFL, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_xZlE1_fid1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(BigInteger.valueOf(1234567890123456789L));
    assertArrayEquals(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, zip.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_long_PVpe2_fid1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(1234567890123456789L);
    assertArrayEquals(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, zip.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_ZFFH0_fid1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x01;
    bytes[1] = (byte) 0x02;
    bytes[2] = (byte) 0x03;
    bytes[3] = (byte) 0x04;
    bytes[4] = (byte) 0x05;
    bytes[5] = (byte) 0x06;
    bytes[6] = (byte) 0x07;
    bytes[7] = (byte) 0x08;
    BigInteger result = ZipEightByteInteger.getValue(bytes);
    assertEquals(new BigInteger("92307892317205550608"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_sNoY1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x00;
    bytes[1] = (byte) 0x00;
    bytes[2] = (byte) 0x00;
    bytes[3] = (byte) 0x00;
    bytes[4] = (byte) 0x00;
    bytes[5] = (byte) 0x00;
    bytes[6] = (byte) 0x00;
    bytes[7] = (byte) 0x01;
    BigInteger result = ZipEightByteInteger.getValue(bytes);
    assertEquals(BigInteger.ONE, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue3_BXRh2_fid1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x80;
    bytes[1] = (byte) 0x00;
    bytes[2] = (byte) 0x00;
    bytes[3] = (byte) 0x00;
    bytes[4] = (byte) 0x00;
    bytes[5] = (byte) 0x00;
    bytes[6] = (byte) 0x00;
    bytes[7] = (byte) 0x00;
    BigInteger result = ZipEightByteInteger.getValue(bytes);
    assertEquals(new BigInteger("9223372036854775808"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue4_Bkjr3_fid1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x7F;
    bytes[1] = (byte) 0xFF;
    bytes[2] = (byte) 0xFF;
    bytes[3] = (byte) 0xFF;
    bytes[4] = (byte) 0xFF;
    bytes[5] = (byte) 0xFF;
    bytes[6] = (byte) 0xFF;
    bytes[7] = (byte) 0xFF;
    BigInteger result = ZipEightByteInteger.getValue(bytes);
    assertEquals(new BigInteger("9223372036854775807"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue6_AREz5_fid1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x12;
    bytes[1] = (byte) 0x34;
    bytes[2] = (byte) 0x56;
    bytes[3] = (byte) 0x78;
    bytes[4] = (byte) 0x90;
    bytes[5] = (byte) 0xAB;
    bytes[6] = (byte) 0xCD;
    bytes[7] = (byte) 0xEF;
    BigInteger result = ZipEightByteInteger.getValue(bytes);
    assertEquals(new BigInteger("21276792469739929575"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_with_bytes_and_offset_BVLh0_fid1() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals(12345678, zipEightByteInteger.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_with_bytes_grHx3_fid1() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    assertEquals(12345678, zipEightByteInteger.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_withByteOffset_JBke0_fid1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals(506097522914839680L, zip.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_withByteArray_NRSj3_fid1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    assertEquals(506097522914839680L, zip.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_mqwc0_fid1() {
    BigInteger value = new BigInteger("1234567890123456789");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 89, (byte) 210, (byte) 51, (byte) 12, (byte) 34, (byte) 56, (byte) 78, (byte) 90}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_ZnJR3_fid1() {
    BigInteger value = new BigInteger("9223372036854775807");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 127, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_ZHhS5_fid1() {
    BigInteger value = new BigInteger("4294967295");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_nQJj7_fid1() {
    BigInteger value = new BigInteger("9223372036854775806");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 126, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 126}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_yzmF9_fid1() {
    BigInteger value = new BigInteger("4294967294");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) -2, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -2}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_jfCO1_fid1() {
    byte[] result = ZipEightByteInteger.getBytes(1L);
    assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_SkWM3() {
    byte[] result = ZipEightByteInteger.getBytes(Long.MIN_VALUE);
    assertArrayEquals(new byte[]{(byte) 0x80, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes5_isJE4() {
    byte[] result = ZipEightByteInteger.getBytes(123456789L);
    assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0, 0x4e, (byte) 0x93}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_jYSl5() {
    byte[] result = ZipEightByteInteger.getBytes(-123456789L);
    assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xb2, (byte) 0x6d}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_ldqq6() {
    byte[] result = ZipEightByteInteger.getBytes(0x1234567890abcdefL);
    assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0x12, (byte) 0x34, (byte) 0x56}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_ksak7() {
    byte[] result = ZipEightByteInteger.getBytes(-0x1234567890abcdefL);
    assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xed, (byte) 0xcb, (byte) 0xa9}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_RXkW8() {
    byte[] result = ZipEightByteInteger.getBytes(0x7fffffffffffffffL);
    assertArrayEquals(new byte[]{(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_hTNO9() {
    byte[] result = ZipEightByteInteger.getBytes(0x8000000000000000L);
    assertArrayEquals(new byte[]{(byte) 0x80, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_VvQM1() {
    byte[] bytes = new byte[8];
    bytes[0] = 0;
    bytes[1] = 0;
    bytes[2] = 0;
    bytes[3] = 0;
    bytes[4] = 0;
    bytes[5] = 0;
    bytes[6] = 0;
    bytes[7] = 1;
    BigInteger result = ZipEightByteInteger.getValue(bytes, 0);
    assert result.equals(BigInteger.ONE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_tTCL0_wcEY0() {
    byte[] bytes = new byte[8];
    bytes[0] = 1;
    bytes[1] = 2;
    bytes[2] = 3;
    bytes[3] = 4;
    bytes[4] = 5;
    bytes[5] = 6;
    bytes[6] = 7;
    bytes[7] = 8;
    BigInteger result = ZipEightByteInteger.getValue(bytes, 0);
    assert result.equals(new BigInteger("9223372036854775808"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArrayOffset_HUEZ0_VufD0() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals("ZipEightByteInteger value: 50466048065835957377", zipEightByteInteger.toString());
}
}