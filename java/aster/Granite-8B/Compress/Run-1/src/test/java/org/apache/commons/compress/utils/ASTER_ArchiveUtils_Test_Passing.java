/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	void testIsEqual_vsHB0() {
		byte[] buffer1 = {1, 2, 3};
		byte[] buffer2 = {1, 2, 3};
		boolean expected = true;
		boolean actual = ArchiveUtils.isEqual(buffer1, buffer2);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqual_ASNa0() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        int offset1 = 0;
        int length1 = 3;
        byte[] buffer2 = new byte[]{1, 2, 3};
        int offset2 = 0;
        int length2 = 3;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithDifferentBuffers_TDGG1() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        int offset1 = 0;
        int length1 = 3;
        byte[] buffer2 = new byte[]{4, 5, 6};
        int offset2 = 0;
        int length2 = 3;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithDifferentLengths_toeE2() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        int offset1 = 0;
        int length1 = 3;
        byte[] buffer2 = new byte[]{1, 2};
        int offset2 = 0;
        int length2 = 2;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithIgnoreTrailingNullsFalse_ucXq3() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        int offset1 = 0;
        int length1 = 3;
        byte[] buffer2 = new byte[]{1, 2, 0};
        int offset2 = 0;
        int length2 = 3;
        boolean ignoreTrailingNulls = false;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithIgnoreTrailingNullsTrue_hmaH4() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        int offset1 = 0;
        int length1 = 3;
        byte[] buffer2 = new byte[]{1, 2, 0};
        int offset2 = 0;
        int length2 = 3;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithNullBuffers_mcAn5() {
        byte[] buffer1 = null;
        int offset1 = 0;
        int length1 = 0;
        byte[] buffer2 = null;
        int offset2 = 0;
        int length2 = 0;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithNullBuffer1_lmde6() {
        byte[] buffer1 = null;
        int offset1 = 0;
        int length1 = 0;
        byte[] buffer2 = new byte[]{1, 2, 3};
        int offset2 = 0;
        int length2 = 3;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithNullBuffer2_DrbT7() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        int offset1 = 0;
        int length1 = 3;
        byte[] buffer2 = null;
        int offset2 = 0;
        int length2 = 0;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, ignoreTrailingNulls);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitize1_pVMy0() {
        String s = "Hello, World!";
        String expected = "Hello, World!";
        String actual = ArchiveUtils.sanitize(s);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitize2_HFpq1() {
        String s = "Hello, !";
        String expected = "Hello, !";
        String actual = ArchiveUtils.sanitize(s);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitize3_Rjyt2() {
        String s = "Hello, \u0000World!";
        String expected = "Hello, ?World!";
        String actual = ArchiveUtils.sanitize(s);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitize4_aOFO3() {
        String s = "Hello, \u001FWorld!";
        String expected = "Hello, ?World!";
        String actual = ArchiveUtils.sanitize(s);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitize5_Rcrn4() {
        String s = "Hello, \u007FWorld!";
        String expected = "Hello, ?World!";
        String actual = ArchiveUtils.sanitize(s);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitize6_mJKt5() {
        String s = "Hello, \u0080World!";
        String expected = "Hello, ?World!";
        String actual = ArchiveUtils.sanitize(s);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitize7_AOWf6() {
        String s = "Hello, \uFFFFWorld!";
        String expected = "Hello, ?World!";
        String actual = ArchiveUtils.sanitize(s);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqual_Ggfi0_1() {
        byte[] buffer1 = new byte[] { 0, 1, 2 };
        byte[] buffer2 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 3 };
        buffer1 = new byte[] { 0, 1, 2, 0 };
        buffer2 = new byte[] { 0, 1, 2 };
        buffer1 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 2, 0 };
        buffer1 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 3 };
        buffer1 = new byte[] { 0, 1, 2, 0 };
        buffer2 = new byte[] { 0, 1, 2 };
        buffer1 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 2, 0 };
        assertTrue(ArchiveUtils.isEqual(buffer1, buffer2, true));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqual_Ggfi0_5() {
        byte[] buffer1 = new byte[] { 0, 1, 2 };
        byte[] buffer2 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 3 };
        buffer1 = new byte[] { 0, 1, 2, 0 };
        buffer2 = new byte[] { 0, 1, 2 };
        buffer1 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 2, 0 };
        buffer1 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 3 };
        buffer1 = new byte[] { 0, 1, 2, 0 };
        buffer2 = new byte[] { 0, 1, 2 };
        buffer1 = new byte[] { 0, 1, 2 };
        buffer2 = new byte[] { 0, 1, 2, 0 };
        assertFalse(ArchiveUtils.isEqual(buffer1, buffer2, false));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayZero_RwQl0() {
        byte[] a = {0, 0, 0, 0};
        int size = 4;
        boolean expected = true;
        boolean actual = ArchiveUtils.isArrayZero(a, size);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayZero2_zKDU1() {
        byte[] a = {0, 0, 0, 1};
        int size = 4;
        boolean expected = false;
        boolean actual = ArchiveUtils.isArrayZero(a, size);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsArrayZero3_rhad2() {
        byte[] a = {0, 1, 0, 0};
        int size = 4;
        boolean expected = false;
        boolean actual = ArchiveUtils.isArrayZero(a, size);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_kKRz0() {
        byte[] inputBytes = {65, 66, 67};
        String expected = "ABC";
        String actual = ArchiveUtils.toAsciiString(inputBytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsEqual_pVYB0() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[10];
		assertTrue(ArchiveUtils.isEqual(buffer1, 0, 10, buffer2, 0, 10));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_paeV0() {
        byte[] inputBytes = {65, 66, 67};
        int offset = 0;
        int length = 3;
        String expected = "ABC";
        String actual = ArchiveUtils.toAsciiString(inputBytes, offset, length);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsEqualWithNull_Golr0() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[10];
		assertTrue(ArchiveUtils.isEqualWithNull(buffer1, 0, 10, buffer2, 0, 10));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBuffer_JGDu0() {
        String expected = "Hello, World!";
        byte[] buffer = "Hello, World!".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBufferEmpty_iWjD1() {
        String expected = "";
        byte[] buffer = new byte[0];
        boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBufferSpecialChars_krFZ2() {
        String expected = "!@#$%^&*()_+";
        byte[] buffer = "!@#$%^&*()_+".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBufferNonAscii_fkQo3() {
        String expected = "Hola, Mundo!";
        byte[] buffer = "Hola, Mundo!".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBufferDifferentLength_ycMC4() {
        String expected = "Hello";
        byte[] buffer = "Hello, World!".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer, 0, 5);
        assertTrue(result);
    }
}