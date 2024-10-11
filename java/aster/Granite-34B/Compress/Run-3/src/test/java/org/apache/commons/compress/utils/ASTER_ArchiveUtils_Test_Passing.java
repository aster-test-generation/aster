/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitize_oLYw0() {
		String s = "test";
		String result =ArchiveUtils.sanitize(s);
		assertEquals("test", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitizeWithControlCharacters_LXAs1() {
		String s = "test\u0001";
		String result =ArchiveUtils.sanitize(s);
		assertEquals("test?", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitizeWithSpecialUnicodeCharacters_gpMj2() {
		String s = "test\u00A0";
		String result =ArchiveUtils.sanitize(s);
		assertEquals("test?", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitizeWithLongInput_QuCS3() {
		String s = "ThisIsAVeryLongStringThatNeedsToBeSanitized";
		String result =ArchiveUtils.sanitize(s);
		assertEquals("ThisIsAVeryLongStringThatNeedsToBeSanitized", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitizeWithNullInput_maHm4() {
		String s = null;
		String result =ArchiveUtils.sanitize(s);
		assertEquals("", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitizeWithEmptyInput_UoXZ5() {
		String s = "";
		String result =ArchiveUtils.sanitize(s);
		assertEquals("", result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_0_RGMD0() {
		byte[] buffer1 = new byte[0];
		byte[] buffer2 = new byte[0];
		boolean ignoreTrailingNulls = true;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_1_YVfX1() {
		byte[] buffer1 = new byte[0];
		byte[] buffer2 = new byte[0];
		boolean ignoreTrailingNulls = false;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_2_hcBg2() {
		byte[] buffer1 = new byte[1];
		byte[] buffer2 = new byte[1];
		boolean ignoreTrailingNulls = true;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_3_fdNh3() {
		byte[] buffer1 = new byte[1];
		byte[] buffer2 = new byte[1];
		boolean ignoreTrailingNulls = false;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_4_WmMj4() {
		byte[] buffer1 = new byte[2];
		byte[] buffer2 = new byte[2];
		boolean ignoreTrailingNulls = true;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_5_aWGd5() {
		byte[] buffer1 = new byte[2];
		byte[] buffer2 = new byte[2];
		boolean ignoreTrailingNulls = false;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_6_LWMr6() {
		byte[] buffer1 = new byte[3];
		byte[] buffer2 = new byte[3];
		boolean ignoreTrailingNulls = true;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiString_tPvH0() {
		byte[] inputBytes = new byte[] { 65, 66, 67 };
		String expected = "ABC";
		assertEquals(expected,ArchiveUtils.toAsciiString(inputBytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiStringWithEmptyArray_kqUH1() {
		byte[] inputBytes = new byte[] {};
		String expected = "";
		assertEquals(expected,ArchiveUtils.toAsciiString(inputBytes));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_0_hEUo0() {
		byte[] buffer1 = new byte[0];
		int offset1 = 0;
		int length1 = 0;
		byte[] buffer2 = new byte[0];
		int offset2 = 0;
		int length2 = 0;
		boolean expected = true;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_1_HAiT1() {
		byte[] buffer1 = new byte[1];
		int offset1 = 0;
		int length1 = 1;
		byte[] buffer2 = new byte[1];
		int offset2 = 1;
		int length2 = 1;
		boolean expected = false;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_2_MELx2() {
		byte[] buffer1 = new byte[10];
		int offset1 = 0;
		int length1 = 10;
		byte[] buffer2 = new byte[10];
		int offset2 = 0;
		int length2 = 10;
		boolean expected = true;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_3_HmpA3() {
		byte[] buffer1 = new byte[10];
		int offset1 = 0;
		int length1 = 10;
		byte[] buffer2 = new byte[10];
		int offset2 = 0;
		int length2 = 9;
		boolean expected = false;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_4_Ifoh4() {
		byte[] buffer1 = new byte[10];
		int offset1 = 0;
		int length1 = 10;
		byte[] buffer2 = new byte[10];
		int offset2 = 1;
		int length2 = 10;
		boolean expected = false;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(actual == expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_0_SXNJ0() {
		byte[] buffer = new byte[0];
		String expected = "";
		boolean result =ArchiveUtils.matchAsciiBuffer(expected, buffer);
		assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_1_nlUR1() {
		byte[] buffer = new byte[] { 0x31 };
		String expected = "1";
		boolean result =ArchiveUtils.matchAsciiBuffer(expected, buffer);
		assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_2_MvFw2() {
		byte[] buffer = new byte[] { 0x31, 0x32, 0x33 };
		String expected = "123";
		boolean result =ArchiveUtils.matchAsciiBuffer(expected, buffer);
		assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_3_QlzY3() {
		byte[] buffer = new byte[] { 0x31, 0x32, 0x33 };
		String expected = "12";
		boolean result =ArchiveUtils.matchAsciiBuffer(expected, buffer);
		assertTrue(!result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiString_hUln0() {
		byte[] inputBytes = new byte[] { 65, 66, 67 };
		int offset = 1;
		int length = 2;
		String expected = "BC";
		String actual =ArchiveUtils.toAsciiString(inputBytes, offset, length);
		org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiStringWithNegativeOffset_ynwR1() {
		byte[] inputBytes = new byte[] { 65, 66, 67 };
		int offset = -1;
		int length = 2;
		String expected = "";
		String actual =ArchiveUtils.toAsciiString(inputBytes, offset, length);
		org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiStringWithNegativeLength_Oeuj2() {
		byte[] inputBytes = new byte[] { 65, 66, 67 };
		int offset = 0;
		int length = -1;
		String expected = "";
		String actual =ArchiveUtils.toAsciiString(inputBytes, offset, length);
		org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiStringWithEmptyInput_IuSE3() {
		byte[] inputBytes = new byte[] {};
		int offset = 0;
		int length = 1;
		String expected = "";
		String actual =ArchiveUtils.toAsciiString(inputBytes, offset, length);
		org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithNull_mmyG0() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[10];
		int offset1 = 0;
		int offset2 = 0;
		int length1 = 10;
		int length2 = 10;
		boolean expected = true;
		boolean actual =ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(actual == expected);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_IxKL0_rMde0() {
		byte[] buffer1 = new byte[]{1, 2, 3};
		byte[] buffer2 = new byte[]{1, 2, 3};
		assertTrue(ArchiveUtils.isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithNull_odXU1_zzjj0() {
		byte[] buffer1 = null;
		byte[] buffer2 = null;
		assertTrue(ArchiveUtils.isEqualWithNull(buffer1, 0, 0, buffer2, 0, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void isArrayZeroTest1_HhLB0_PFLC0() {
        byte[] a = new byte[5];
        int size = 5;
        assertTrue(ArchiveUtils.isArrayZero(a, size));
}
}