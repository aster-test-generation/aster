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
public void testGetLongValue_XLxL0() {
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
public void testGetLongValue_oHwA0() {
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
public void testGetBytes_withBigInteger_gFeN1() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(BigInteger.valueOf(1234567890123456789L));
    byte[] result = zipEightByteInteger.getBytes();
    assertArrayEquals(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_withLong_mTpY2() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(1234567890123456789L);
    byte[] result = zipEightByteInteger.getBytes();
    assertArrayEquals(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_with_bytes_offset_rBFv0() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals(12345678, zipEightByteInteger.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_with_bytes_nvso3() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    assertEquals(12345678, zipEightByteInteger.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_nQAj1() {
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
    assertEquals(BigInteger.ONE, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_KKsm0() {
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
    assertEquals(new BigInteger("923078923172553792"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_wJVt1() {
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
public void testGetValue3_iWXJ2() {
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
public void testGetValue4_ihNv3() {
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
public void testGetValue6_Fypw5() {
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
    assertEquals(new BigInteger("2127679207669029264520534961279"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_GYzv1() {
    byte[] result = ZipEightByteInteger.getBytes(1L);
    assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_INnj2() {
    byte[] result = ZipEightByteInteger.getBytes(Long.MAX_VALUE);
    assertArrayEquals(new byte[]{(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_XSxQ3() {
    byte[] result = ZipEightByteInteger.getBytes(Long.MIN_VALUE);
    assertArrayEquals(new byte[]{(byte) 0x80, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes5_Lhbd4() {
    byte[] result = ZipEightByteInteger.getBytes(1234567890L);
    assertArrayEquals(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0x49, (byte) 0x96, (byte) 0x02}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_xNhn5() {
    byte[] result = ZipEightByteInteger.getBytes(-1234567890L);
    assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xb6, (byte) 0x69, (byte) 0xfe}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_DuOq6() {
    byte[] result = ZipEightByteInteger.getBytes(2147483647L);
    assertArrayEquals(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_HORa7() {
    byte[] result = ZipEightByteInteger.getBytes(-2147483648L);
    assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x80, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_rTNU8() {
    byte[] result = ZipEightByteInteger.getBytes(4294967295L);
    assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_wSIL9() {
    byte[] result = ZipEightByteInteger.getBytes(-4294967296L);
    assertArrayEquals(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_HiPg0() {
    BigInteger value = BigInteger.valueOf(1234567890123456789L);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 89, (byte) 210, (byte) 51, (byte) 204, (byte) 123, (byte) 45, (byte) 67, (byte) 191}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_oMSY2() {
    BigInteger value = BigInteger.valueOf(Long.MAX_VALUE);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 127, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_LdWz3() {
    BigInteger value = BigInteger.valueOf(Long.MIN_VALUE);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 128, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 128}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes5_IsUs4() {
    BigInteger value = BigInteger.valueOf(1234567890123456788L);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 88, (byte) 210, (byte) 51, (byte) 204, (byte) 123, (byte) 45, (byte) 67, (byte) 190}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_fhXW5() {
    BigInteger value = BigInteger.valueOf(1234567890123456790L);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 90, (byte) 210, (byte) 51, (byte) 204, (byte) 123, (byte) 45, (byte) 67, (byte) 192}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_bPrL6() {
    BigInteger value = BigInteger.valueOf(1234567890123456791L);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 91, (byte) 210, (byte) 51, (byte) 204, (byte) 123, (byte) 45, (byte) 67, (byte) 193}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_glVk7() {
    BigInteger value = BigInteger.valueOf(1234567890123456792L);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 92, (byte) 210, (byte) 51, (byte) 204, (byte) 123, (byte) 45, (byte) 67, (byte) 194}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_Bbcz8() {
    BigInteger value = BigInteger.valueOf(1234567890123456793L);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 93, (byte) 210, (byte) 51, (byte) 204, (byte) 123, (byte) 45, (byte) 67, (byte) 195}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_YtwF9() {
    BigInteger value = BigInteger.valueOf(1234567890123456794L);
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 94, (byte) 210, (byte) 51, (byte) 204, (byte) 123, (byte) 45, (byte) 67, (byte) 196}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_XLxL0_fid1() {
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
    BigInteger actual = new BigInteger(ZipEightByteInteger.getBytes(expected));
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_INnj2_fid1() {
    byte[] result = ZipEightByteInteger.getBytes(BigInteger.valueOf(Long.MAX_VALUE));
    assertArrayEquals(new byte[]{(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_withByteArrayOffset_WyuP0_QpeF0() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals(BigInteger.valueOf(71777215103809L), zipEightByteInteger.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_FNvN0_WyQf0() {
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
    assertEquals(new BigInteger("72340172838076673"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArrayOffset_SOEV0_mVmK0() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals("ZipEightByteInteger value: 4724464026818819209", zipEightByteInteger.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArray_KwPL3_kLet0() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    assertEquals("ZipEightByteInteger value: 4724464022059817216", zipEightByteInteger.toString());
}
}