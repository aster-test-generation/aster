/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArchiveUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeNull_xUbS0() {
        assertEquals("", ArchiveUtils.sanitize(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersWithTrailingNulls_WpiG5_fid1() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5, 0, 0};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5, 0};
        assertFalse(ArchiveUtils.isEqual(buffer1, 0, 6, buffer2, 0, 5, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeLongString_IHHv4_fid1() {
        assertEquals("hello...", ArchiveUtils.sanitize("hello world"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeSpecialCharacters_ZgCn5_fid1() {
        assertEquals("abc...", ArchiveUtils.sanitize("abc!@#"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithDifferentLengths_nisp2_fid1() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4};
        byte[] buffer2 = new byte[] {1, 2, 3};
        boolean result = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithDifferentOffsets_nBEN3_fid1() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4};
        byte[] buffer2 = new byte[] {2, 3, 4, 5};
        boolean result = ArchiveUtils.isEqual(buffer1, 1, 3, buffer2, 0, 3);
        assertFalse(result);
    }
}