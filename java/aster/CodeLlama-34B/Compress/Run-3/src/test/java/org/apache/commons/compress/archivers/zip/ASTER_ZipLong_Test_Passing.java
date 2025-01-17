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
public void testPutLongPositive_OaEi0() {
    long value = 1234567890L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongNegative_BcbC1() {
    long value = -1234567890L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(-1234567890L, ByteUtils.fromLittleEndian(buf, offset, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongMaxValue_PXoi2() {
    long value = 4294967296L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(4294967296L, ByteUtils.fromLittleEndian(buf, offset, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongMinValue_PVKv3() {
    long value = -4294967296L;
    byte[] buf = new byte[4];
    int offset = 0;
    ZipLong.putLong(value, buf, offset);
    assertEquals(-4294967296L, ByteUtils.fromLittleEndian(buf, offset, 4));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_gtqR0() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertTrue(zipLong.equals(zipLong));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_astD1() {
    ZipLong zipLong1 = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    ZipLong zipLong2 = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertTrue(zipLong1.equals(zipLong2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_hmyS3() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertFalse(zipLong.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_enTW4() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertFalse(zipLong.equals(new Object()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_byteArray_wmTn0() {
    byte[] bytes = new byte[] { 1, 2, 3, 4 };
    ZipLong zipLong = new ZipLong(bytes);
    String expected = "ZipLong value: 1073741824";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_int_lSwS1() {
    int value = 1073741824;
    ZipLong zipLong = new ZipLong(value);
    String expected = "ZipLong value: 1073741824";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_long_WnPq2() {
    long value = 1073741824L;
    ZipLong zipLong = new ZipLong(value);
    String expected = "ZipLong value: 1073741824";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_byteArrayOffset_CPpL3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4 };
    int offset = 2;
    ZipLong zipLong = new ZipLong(bytes, offset);
    String expected = "ZipLong value: 536870912";
    String actual = zipLong.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_int_NApK0() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 0);
    assertEquals(1234, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_long_ulqS1() {
    ZipLong zipLong = new ZipLong(1234L);
    assertEquals(1234L, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_KLGr2() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4});
    assertEquals(1234, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_invalid_djLd3() {
    ZipLong zipLong = new ZipLong(new byte[] {1, 2, 3, 4}, 1);
    assertEquals(0, zipLong.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_int_wGoR0() {
    ZipLong zipLong = new ZipLong(123456789);
    byte[] expected = { 123, 45, 67, 89 };
    byte[] actual = zipLong.getBytes();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_long_KHWJ1() {
    ZipLong zipLong = new ZipLong(123456789L);
    byte[] expected = { 123, 45, 67, 89 };
    byte[] actual = zipLong.getBytes();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArray_sSDW2() {
    byte[] bytes = { 123, 45, 67, 89 };
    ZipLong zipLong = new ZipLong(bytes);
    byte[] expected = { 123, 45, 67, 89 };
    byte[] actual = zipLong.getBytes();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_byteArrayOffset_gVGL3() {
    byte[] bytes = { 123, 45, 67, 89 };
    ZipLong zipLong = new ZipLong(bytes, 1);
    byte[] expected = { 45, 67, 89 };
    byte[] actual = zipLong.getBytes();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset0_AGHP0() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 0);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset1_KxvV1() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x020304;
    long actual = ZipLong.getValue(bytes, 1);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset2_SDCw2() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x0304;
    long actual = ZipLong.getValue(bytes, 2);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset3_lNtR3() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x04;
    long actual = ZipLong.getValue(bytes, 3);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset4_bUOo4() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 4);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset5_jtIw5() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x020304;
    long actual = ZipLong.getValue(bytes, 5);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset6_wtvh6() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x0304;
    long actual = ZipLong.getValue(bytes, 6);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset7_IbeZ7() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x04;
    long actual = ZipLong.getValue(bytes, 7);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset8_BDyp8() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x01020304;
    long actual = ZipLong.getValue(bytes, 8);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset9_bkqm9() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x020304;
    long actual = ZipLong.getValue(bytes, 9);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset10_XlcE10() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x0304;
    long actual = ZipLong.getValue(bytes, 10);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_byteArray_offset11_FJkV11() {
    byte[] bytes = new byte[] {1, 2, 3, 4};
    long expected = 0x04;
    long actual = ZipLong.getValue(bytes, 11);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_int_DStL0() {
    ZipLong zipLong = new ZipLong(123456789);
    assertEquals(123456789, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_long_KJzQ1() {
    ZipLong zipLong = new ZipLong(123456789L);
    assertEquals(123456789, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_byteArray_zoRw2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes);
    assertEquals(123456789, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetIntValue_byteArrayOffset_VQgr3() {
    byte[] bytes = new byte[] { 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes, 4);
    assertEquals(123456789, zipLong.getIntValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_int_GYUm0() {
    ZipLong zipLong = new ZipLong(123456789);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_long_ybxq1() {
    ZipLong zipLong = new ZipLong(123456789L);
    assertEquals(123456789L, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArray_eJNf2() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes);
    assertEquals(123456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_byteArrayOffset_eJlP3() {
    byte[] bytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    ZipLong zipLong = new ZipLong(bytes, 3);
    assertEquals(456789, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_nullValue_xTLv4() {
    ZipLong zipLong = new ZipLong(null);
    assertEquals(0, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_invalidValue_LTUa5() {
    ZipLong zipLong = new ZipLong(1234567890);
    assertEquals(0, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_multipleOf4_BhiG7() {
    ZipLong zipLong = new ZipLong(1234567890);
    assertEquals(1234567890, zipLong.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongPositive_Thuk0() {
    ZipLong zipLong = new ZipLong(100);
    byte[] buf = new byte[10];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(100, buf[offset]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongNegative_GBuk1() {
    ZipLong zipLong = new ZipLong(-100);
    byte[] buf = new byte[10];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(-100, buf[offset]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongGreaterThan127_vtNj2() {
    ZipLong zipLong = new ZipLong(128);
    byte[] buf = new byte[10];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(128, buf[offset]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPutLongLessThanNegative128_sZFJ3() {
    ZipLong zipLong = new ZipLong(-129);
    byte[] buf = new byte[10];
    int offset = 0;
    zipLong.putLong(buf, offset);
    assertEquals(-129, buf[offset]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_pcNf0() {
    ZipLong zipLong = new ZipLong(new byte[] { 1, 2, 3, 4 }, 0);
    ZipLong clone = (ZipLong) zipLong.clone();
    assertEquals(zipLong.getValue(), clone.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithIntValue_zPrD1() {
    ZipLong zipLong = new ZipLong(1234);
    ZipLong clone = (ZipLong) zipLong.clone();
    assertEquals(zipLong.getValue(), clone.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithLongValue_SDqL2() {
    ZipLong zipLong = new ZipLong(1234L);
    ZipLong clone = (ZipLong) zipLong.clone();
    assertEquals(zipLong.getValue(), clone.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithByteArray_rQvt3() {
    ZipLong zipLong = new ZipLong(new byte[] { 1, 2, 3, 4 });
    ZipLong clone = (ZipLong) zipLong.clone();
    assertEquals(zipLong.getValue(), clone.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetValueWithValidInput_LGlq0() {
		byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
		int offset = 0;
		long expectedValue = 0x01020304;
		long actualValue = ZipLong.getValue(bytes, offset);
		assertEquals(expectedValue, actualValue);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetValueWithInvalidInput_YKbG1() {
		byte[] bytes = new byte[] { 0x01, 0x02, 0x03, 0x04 };
		int offset = 1;
		long expectedValue = 0x02030405;
		long actualValue = ZipLong.getValue(bytes, offset);
		assertNotEquals(expectedValue, actualValue);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetValueWithNullInput_iKVz2() {
		byte[] bytes = null;
		int offset = 0;
		long expectedValue = 0;
		long actualValue = ZipLong.getValue(bytes, offset);
		assertEquals(expectedValue, actualValue);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetValueWithEmptyInput_LViT3() {
		byte[] bytes = new byte[] {};
		int offset = 0;
		long expectedValue = 0;
		long actualValue = ZipLong.getValue(bytes, offset);
		assertEquals(expectedValue, actualValue);
	}
}