/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithNullBuffers_CePv5() {
        byte[] buffer1 = null;
        byte[] buffer2 = null;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithNullBuffer1_ZnSb6() {
        byte[] buffer1 = null;
        byte[] buffer2 = new byte[]{1, 2, 3};
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);
        assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithNullBuffer2_KXYF7() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        byte[] buffer2 = null;
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);
        assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithNegativeOffset_XZxQ9() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        byte[] buffer2 = new byte[]{1, 2, 3};
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, -1, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSanitizeWithNullString_njqO0() {
    String s = null;
    String expected = "";
    String actual = ArchiveUtils.sanitize(s);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEqualWithIgnoreTrailingNullsTrue_FOUG4_fid1() {
        byte[] buffer1 = new byte[]{1, 2, 3};
        byte[] buffer2 = new byte[]{1, 2, 0};
        boolean ignoreTrailingNulls = true;
        boolean result = ArchiveUtils.isEqual(buffer1, 0, buffer1.length, buffer2, 0, buffer2.length, ignoreTrailingNulls);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testIsEqual_vrIm0_fid1() {
		byte[] buffer1 = new byte[10];
		byte[] buffer2 = new byte[10];
		boolean result = ArchiveUtils.isEqual(buffer1, 0, 10, buffer2, 0, 10);
		assertFalse(result);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBuffer_WTsh0_fid1() {
        String expected = "expected";
        byte[] buffer = new byte[10];
        buffer[0] = 'e';
        buffer[1] = 'x';
        buffer[2] = 'p';
        buffer[3] = 'e';
        buffer[4] = 'c';
        buffer[5] = 't';
        buffer[6] = 'e';
        buffer[7] = 'd';
        buffer[8] = 0;
        buffer[9] = 0;
        boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer);
        assertTrue(result);
    }
}