/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqual_BuffersEqual_ReturnsTrue_pwiN0() {
        byte[] buffer1 = {1, 2, 3};
        byte[] buffer2 = {1, 2, 3};
        boolean actual = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3, false);
        assertTrue(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqual_BuffersEqualIgnoreTrailingNulls_ReturnsTrue_MnCZ1() {
        byte[] buffer1 = {1, 2, 3, 0, 0};
        byte[] buffer2 = {1, 2, 3};
        boolean actual = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3, true);
        assertTrue(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqual_BuffersNotEqual_ReturnsFalse_VZKI2() {
        byte[] buffer1 = {1, 2, 3};
        byte[] buffer2 = {1, 2, 4};
        boolean actual = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3, false);
        assertFalse(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqual_BuffersNotEqualIgnoreTrailingNulls_ReturnsFalse_IqKE3() {
        byte[] buffer1 = {1, 2, 3, 0, 0};
        byte[] buffer2 = {1, 2, 4};
        boolean actual = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3, true);
        assertFalse(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqual_BuffersEqualDifferentLength_ReturnsFalse_YOIL4() {
        byte[] buffer1 = {1, 2, 3};
        byte[] buffer2 = {1, 2, 3, 4};
        boolean actual = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 4, false);
        assertFalse(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqual_BuffersEqualDifferentLengthIgnoreTrailingNulls_ReturnsFalse_vvfc5() {
        byte[] buffer1 = {1, 2, 3, 0, 0};
        byte[] buffer2 = {1, 2, 3, 4};
        boolean actual = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 4, true);
        assertFalse(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitize_WithControlCharacters_ewFX0() {
	    final String s = "abc\u0000def";
	    final String expected = "abc?def";
	    final String actual =ArchiveUtils.sanitize(s);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitize_WithNonControlCharacters_YPHR1() {
	    final String s = "abc def";
	    final String expected = "abc def";
	    final String actual =ArchiveUtils.sanitize(s);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitize_WithLongString_sqRZ2() {
	    final String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
	    final String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiu...";
	    final String actual =ArchiveUtils.sanitize(s);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsArrayZero_ReturnsTrue_WhenArrayIsCompletelyZero_kIqO0() {
		byte[] array = {0, 0, 0};
		boolean result =ArchiveUtils.isArrayZero(array, array.length);
		assertTrue(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsArrayZero_ReturnsFalse_WhenArrayContainsNonZeroValues_UeJm1() {
		byte[] array = {0, 1, 0};
		boolean result =ArchiveUtils.isArrayZero(array, array.length);
		assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_1_VzMX0() {
		byte[] buffer1 = new byte[]{1, 2, 3};
		byte[] buffer2 = new byte[]{1, 2, 3};
		boolean ignoreTrailingNulls = true;
		boolean expected = true;
		boolean actual =ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_2_dFzF1() {
		byte[] buffer1 = new byte[]{1, 2, 3};
		byte[] buffer2 = new byte[]{1, 2, 4};
		boolean ignoreTrailingNulls = true;
		boolean expected = false;
		boolean actual =ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_3_Rqvo2() {
		byte[] buffer1 = new byte[]{1, 2, 3};
		byte[] buffer2 = new byte[]{1, 2, 3};
		boolean ignoreTrailingNulls = false;
		boolean expected = true;
		boolean actual =ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertTrue(actual == expected);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiString_bbdl0() {
		byte[] inputBytes = new byte[] { 65, 66, 67 };
		String expected = "ABC";
		String actual =ArchiveUtils.toAsciiString(inputBytes);
		org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiStringWithEmptyArray_QIIJ1() {
		byte[] inputBytes = new byte[0];
		String expected = "";
		String actual =ArchiveUtils.toAsciiString(inputBytes);
		org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testToAsciiString_LaAJ0() {
        byte[] inputBytes = new byte[] { 0x41, 0x42, 0x43 };
        int offset = 0;
        int length = 3;
        String expected = "ABC";
        String actual = ArchiveUtils.toAsciiString(inputBytes, offset, length);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_wbGm0() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[10];
		int offset1 = 0;
		int offset2 = 0;
		int length1 = 10;
		int length2 = 10;
		boolean expected = true;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(expected == actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithOffset_snFN1() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[10];
		int offset1 = 1;
		int offset2 = 1;
		int length1 = 9;
		int length2 = 9;
		boolean expected = true;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(expected == actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithDifferentLength_XFmG2() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[11];
		int offset1 = 0;
		int offset2 = 0;
		int length1 = 10;
		int length2 = 11;
		boolean expected = false;
		boolean actual =ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(expected == actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithNull1_urPg0() {
		byte[] buffer1 = new byte[0];
		int offset1 = 0;
		int length1 = 0;
		byte[] buffer2 = new byte[0];
		int offset2 = 0;
		int length2 = 0;
		boolean expected = false;
		boolean actual =ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_Hnep0_npRV0() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 0;
		int length = 10;
		assertFalse(ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBufferWithOffset_NbYI1_Mezh0() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 1;
		int length = 9;
		assertFalse(ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBufferWithLength_Sgba2_YpAI0() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 0;
		int length = 5;
		assertFalse(ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBufferWithAllParameters_sGVB3_yJle0() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 1;
		int length = 5;
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqual_BuffersEqualIgnoreTrailingNulls_ReturnsTrue_MnCZ1_LmCO0() {
        byte[] buffer1 = {1, 2, 3, 0, 0};
        byte[] buffer2 = {1, 2, 3, 0};
        boolean actual = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3, true);
        assertTrue(actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitize_WithControlCharacters_ewFX0_KBJf0() {
	    final String s = "abc\u0000def";
	    final String expected = "abc\\u0000def";
	    final String actual = ArchiveUtils.sanitize(s);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testToAsciiString_bbdl0_NZqt0() {
		byte[] inputBytes = new byte[] { 65, 66, 67 };
		String expected = "ABC";
		String actual = ArchiveUtils.toAsciiString(inputBytes);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_1_VzMX0_BNpk0() {
		byte[] buffer1 = new byte[]{1, 2, 3};
		byte[] buffer2 = {1, 2, 3};
		boolean ignoreTrailingNulls = true;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_2_dFzF1_bfYF0() {
		byte[] buffer1 = new byte[]{1, 2, 3};
		byte[] buffer2 = new byte[]{1, 2, 4};
		boolean ignoreTrailingNulls = true;
		boolean expected = false;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2, ignoreTrailingNulls);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqual_3_Rqvo2_USlH0() {
		byte[] buffer1 = new byte[]{1, 2, 3};
		byte[] buffer2 = {1, 2, 3};
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, true);
		assertTrue(actual == expected);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithOffset_snFN1_cIPJ0() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[10];
		int offset1 = 1;
		int offset2 = 1;
		int length1 = 9;
		int length2 = 9;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
		Assertions.assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithDifferentLength_XFmG2_siTY0() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[11];
		int offset1 = 0;
		int offset2 = 0;
		int length1 = 10;
		int length2 = 11;
		boolean expected =true;
		boolean actual = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithNull1_urPg0_MALI0() {
		byte[] buffer1 = new byte[0];
		int offset1 = 0;
		int length1 = 0;
		byte[] buffer2 = new byte[0];
		int offset2 = 0;
		int length2 = 0;
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_aSIa0_DeYf0_1() {
		String expected = "test";
		byte[] buffer = "test123".getBytes();
		boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
		expected = "123";
		buffer = "test123".getBytes();
		result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
		expected = "123";
		buffer = "test123".getBytes();
		result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
		expected = "xyz";
		buffer = "test123".getBytes();
		result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
		assertFalse(result);}
}