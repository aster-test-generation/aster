/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitize_WithLongString_sqRZ2_fid3() {
	    final String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
	    final String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiu...";
	    final String actual =ArchiveUtils.sanitize(s);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithNull1_urPg0_fid3() {
		byte[] buffer1 = new byte[0];
		int offset1 = 0;
		int length1 = 0;
		byte[] buffer2 = new byte[0];
		int offset2 = 0;
		int length2 = 0;
		boolean expected = false;
		boolean actual =ArchiveUtils.isEqualWithNull(buffer1, offset1, length1, buffer2, offset2, length2);
		assertTrue(expected == actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_Hnep0_npRV0_fid3() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 0;
		int length = 10;
		assertTrue(ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBufferWithOffset_NbYI1_Mezh0_fid3() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 1;
		int length = 9;
		assertTrue(ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBufferWithLength_Sgba2_YpAI0_fid3() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 0;
		int length = 5;
		assertTrue(ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBufferWithAllParameters_sGVB3_yJle0_fid3() {
		byte[] buffer = new byte[10];
		String expected = "expected";
		int offset = 1;
		int length = 5;
		assertTrue(ArchiveUtils.matchAsciiBuffer(expected, buffer, offset, length));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSanitize_WithControlCharacters_ewFX0_KBJf0_fid3() {
	    final String s = "abc\u0000def";
	    final String expected = "abc\\u0000def";
	    final String actual = ArchiveUtils.sanitize(s);
	    assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testisEqualWithDifferentLength_XFmG2_siTY0_fid3() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[11];
		int offset1 = 0;
		int offset2 = 0;
		int length1 = 10;
		int length2 = 11;
		boolean expected = false;
		boolean actual = ArchiveUtils.isEqual(buffer1, offset1, length1, buffer2, offset2, length2, true);
		assertEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testMatchAsciiBuffer_aSIa0_DeYf0_1_fid3() {
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
		assertTrue(result);}
}