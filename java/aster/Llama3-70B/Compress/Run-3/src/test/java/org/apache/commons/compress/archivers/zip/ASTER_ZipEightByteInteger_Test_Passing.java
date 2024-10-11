/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipEightByteInteger_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_nUbs0() {
    ZipEightByteInteger zip = new ZipEightByteInteger(1L);
    assertTrue(zip.equals(zip));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_wEbH1() {
    ZipEightByteInteger zip1 = new ZipEightByteInteger(1L);
    ZipEightByteInteger zip2 = new ZipEightByteInteger(2L);
    assertFalse(zip1.equals(zip2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_rrtQ0() {
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
public void testToString_withBigInteger_LHvY1() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(BigInteger.ONE);
    assertEquals("ZipEightByteInteger value: " + BigInteger.ONE.toString(), zipEightByteInteger.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withLong_KxBR2() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(1L);
    assertEquals("ZipEightByteInteger value: " + BigInteger.valueOf(1L).toString(), zipEightByteInteger.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_ByteOffset_WkqT0() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[8], 0);
    assertEquals(BigInteger.ZERO, zip.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_BigInteger_KnMr1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(BigInteger.ZERO);
    assertEquals(BigInteger.ZERO, zip.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Long_xSFb2() {
    ZipEightByteInteger zip = new ZipEightByteInteger(0L);
    assertEquals(BigInteger.ZERO, zip.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_Byte_nnAA3() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[8]);
    assertEquals(BigInteger.ZERO, zip.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_bYhW0() {
    byte[] bytes = new byte[8];
    for (int i = 0; i < 8; i++) {
        bytes[i] = (byte) (i + 1);
    }
    long result = ZipEightByteInteger.getLongValue(bytes);
    assertEquals(506097522914230528L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArrayOffset_sAKg0() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, zip.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_BigInteger_NnuJ1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(BigInteger.valueOf(1234567890123456789L));
    assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, zip.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_long_JKOF2() {
    ZipEightByteInteger zip = new ZipEightByteInteger(1234567890123456789L);
    assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, zip.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArray_ttkn3() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8});
    assertArrayEquals(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, zip.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_qRda0() {
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
    assertEquals(new BigInteger("9223372036854775808"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_YFcF1() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x00;
    bytes[1] = (byte) 0x00;
    bytes[2] = (byte) 0x00;
    bytes[3] = (byte) 0x00;
    bytes[4] = (byte) 0x00;
    bytes[5] = (byte) 0x00;
    bytes[6] = (byte) 0x00;
    bytes[7] = (byte) 0x00;
    BigInteger result = ZipEightByteInteger.getValue(bytes);
    assertEquals(BigInteger.ZERO, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue3_mkpP2() {
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
public void testGetValue4_eekm3() {
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
public void testGetValue5_DSQW4() {
    byte[] bytes = new byte[8];
    bytes[0] = (byte) 0x01;
    bytes[1] = (byte) 0x01;
    bytes[2] = (byte) 0x01;
    bytes[3] = (byte) 0x01;
    bytes[4] = (byte) 0x01;
    bytes[5] = (byte) 0x01;
    bytes[6] = (byte) 0x01;
    bytes[7] = (byte) 0x01;
    BigInteger result = ZipEightByteInteger.getValue(bytes);
    assertEquals(new BigInteger("72340172838076673"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue6_UDrd5() {
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
public void testHashCode_byteArrayOffset_PtIl0() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[8], 0);
    assertEquals(0, zip.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_BigInteger_CkOH1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(BigInteger.ZERO);
    assertEquals(0, zip.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_long_kCPK2() {
    ZipEightByteInteger zip = new ZipEightByteInteger(0L);
    assertEquals(0, zip.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_kgwe3() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[8]);
    assertEquals(0, zip.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_byteArrayOffset_RHkm0() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[8], 0);
    assertEquals(0, zip.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_BigInteger_qsDy1() {
    ZipEightByteInteger zip = new ZipEightByteInteger(BigInteger.ZERO);
    assertEquals(0, zip.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_long_YXlj2() {
    ZipEightByteInteger zip = new ZipEightByteInteger(0L);
    assertEquals(0, zip.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_byteArray_IfyJ3() {
    ZipEightByteInteger zip = new ZipEightByteInteger(new byte[8]);
    assertEquals(0, zip.getLongValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_XTWw0() {
    BigInteger value = new BigInteger("1234567890123456789");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 89, (byte) 210, (byte) 51, (byte) 12, (byte) 34, (byte) 56, (byte) 78, (byte) 90}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_xaIx1() {
    BigInteger value = new BigInteger("0");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_LWlb2() {
    BigInteger value = new BigInteger("18446744073709551615");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_wjRo3() {
    BigInteger value = new BigInteger("9223372036854775807");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 127, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes5_ZLRS4() {
    BigInteger value = new BigInteger("1");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_MwXv5() {
    BigInteger value = new BigInteger("4294967295");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_NarE6() {
    BigInteger value = new BigInteger("8589934591");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 91, (byte) 205, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_GJYk7() {
    BigInteger value = new BigInteger("17179869183");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 131, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_YyAS8() {
    BigInteger value = new BigInteger("34359738367");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 67, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_znES9() {
    BigInteger value = new BigInteger("68719476735");
    byte[] result = ZipEightByteInteger.getBytes(value);
    assertArrayEquals(new byte[]{(byte) 35, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127, (byte) 127}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes1_uqnY0() {
    byte[] result = ZipEightByteInteger.getBytes(0L);
    assertArrayEquals(new byte[8], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_Zmpb1() {
    byte[] result = ZipEightByteInteger.getBytes(1L);
    assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes3_Wsfy2() {
    byte[] result = ZipEightByteInteger.getBytes(Long.MAX_VALUE);
    assertArrayEquals(new byte[]{(byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes4_VUpg3() {
    byte[] result = ZipEightByteInteger.getBytes(Long.MIN_VALUE);
    assertArrayEquals(new byte[]{(byte) 0x80, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes5_OQri4() {
    byte[] result = ZipEightByteInteger.getBytes(1234567890L);
    assertArrayEquals(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0x49, (byte) 0x96, (byte) 0x02, (byte) 0x3a}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes6_moTI5() {
    byte[] result = ZipEightByteInteger.getBytes(-1234567890L);
    assertArrayEquals(new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xb6, (byte) 0x69, (byte) 0xfd, (byte) 0xc6}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes7_FzjH6() {
    byte[] result = ZipEightByteInteger.getBytes(1234567890123456789L);
    assertArrayEquals(new byte[]{(byte) 0x01, (byte) 0x23, (byte) 0x45, (byte) 0x67, (byte) 0x89, (byte) 0x01, (byte) 0x23, (byte) 0x45}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes8_lpDI7() {
    byte[] result = ZipEightByteInteger.getBytes(-1234567890123456789L);
    assertArrayEquals(new byte[]{(byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, (byte) 0x76, (byte) 0xfe, (byte) 0xdc, (byte) 0xba}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes9_gOJy8() {
    byte[] result = ZipEightByteInteger.getBytes(1234567890123456788L);
    assertArrayEquals(new byte[]{(byte) 0x01, (byte) 0x23, (byte) 0x45, (byte) 0x67, (byte) 0x89, (byte) 0x01, (byte) 0x23, (byte) 0x44}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes10_GUHl9() {
    byte[] result = ZipEightByteInteger.getBytes(-1234567890123456788L);
    assertArrayEquals(new byte[]{(byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, (byte) 0x76, (byte) 0xfe, (byte) 0xdc, (byte) 0xbc}, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_DJgA0() {
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
    BigInteger expected = new BigInteger("9223372036854775808");
    assert result.equals(expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_Fxfx1() {
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
    BigInteger expected = BigInteger.ONE;
    assert result.equals(expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArrayOffset_OUji0_lCmT0() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0);
    assertEquals("ZipEightByteInteger value: 8070450532247928832", zipEightByteInteger.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_withByteArray_WlSS3_olzc0() {
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[] {1, 0, 0, 0, 0, 0, 0, 0});
    assertEquals("ZipEightByteInteger value: 1", zipEightByteInteger.toString());
}
}