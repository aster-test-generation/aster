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
    public void testisEqualBuffersEqual_JfhR0() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
        assertTrue(ArchiveUtils.isEqual(buffer1, buffer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisEqualBuffersNotEqual_MTsI1() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 6};
        assertFalse(ArchiveUtils.isEqual(buffer1, buffer2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithSameLength_MsUH0() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
        assertTrue(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithDifferentLength_zsME1() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4};
        assertTrue(ArchiveUtils.isEqual(buffer1, 0, 4, buffer2, 0, 4, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersWithSameLength_EkTs2() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {6, 7, 8, 9, 10};
        assertFalse(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersWithDifferentLength_itIz3() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4};
        assertFalse(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 4, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithTrailingNulls_wHdj4() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5, 0, 0};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
        assertTrue(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersWithTrailingNulls_WpiG5() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5, 0, 0};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5, 0};
        assertTrue(ArchiveUtils.isEqual(buffer1, 0, 6, buffer2, 0, 5, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithoutTrailingNulls_ywSg6() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
        assertTrue(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5, false));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersWithoutTrailingNulls_LtGe7() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {6, 7, 8, 9, 10};
        assertFalse(ArchiveUtils.isEqual(buffer1, 0, 5, buffer2, 0, 5, false));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithSameLengthAndOffset_WRao8() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
        assertTrue(ArchiveUtils.isEqual(buffer1, 1, 4, buffer2, 1, 4, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersWithSameLengthAndOffset_WfVq9() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {6, 7, 8, 9, 10};
        assertFalse(ArchiveUtils.isEqual(buffer1, 1, 4, buffer2, 1, 4, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeEmptyString_hnSy1() {
        assertEquals("", ArchiveUtils.sanitize(""));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeSingleCharacter_PiGE2() {
        assertEquals("a", ArchiveUtils.sanitize("a"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeShortString_cUnn3() {
        assertEquals("hello", ArchiveUtils.sanitize("hello"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeLongString_IHHv4() {
        assertEquals("hello world", ArchiveUtils.sanitize("hello world"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeSpecialCharacters_ZgCn5() {
        assertEquals("abc!@#", ArchiveUtils.sanitize("abc!@#"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSanitizeControlCharacters_tTAr6() {
        assertEquals("abc?", ArchiveUtils.sanitize("abc\u0007"));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBuffer_fwAE1() {
        String expected = "Hello";
        byte[] buffer = "Hello".getBytes();
        boolean result = ArchiveUtils.matchAsciiBuffer(expected, buffer, 0, buffer.length);
        assert result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffers_GUVA0() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5};
        assertTrue(ArchiveUtils.isEqual(buffer1, buffer2, false));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffers_iVcm1() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 6};
        assertFalse(ArchiveUtils.isEqual(buffer1, buffer2, false));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersIgnoreTrailingNulls_QLCx2() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5, 0};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5, 0};
        assertTrue(ArchiveUtils.isEqual(buffer1, buffer2, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersIgnoreTrailingNulls_XnDD3() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5, 0};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 6, 0};
        assertFalse(ArchiveUtils.isEqual(buffer1, buffer2, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffersIgnoreTrailingNullsButTrailingNullsAreDifferent_KgQm4() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4, 5, 0};
        byte[] buffer2 = new byte[] {1, 2, 3, 4, 5, 1};
        assertFalse(ArchiveUtils.isEqual(buffer1, buffer2, true));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArrayZeroWithAllZeroes_OtLd0() {
        byte[] a = new byte[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        assertTrue(ArchiveUtils.isArrayZero(a, a.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArrayZeroWithNonZeroElement_FkBM1() {
        byte[] a = new byte[5];
        a[0] = 1;
        assertFalse(ArchiveUtils.isArrayZero(a, a.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArrayZeroWithSizeLessThanArrayLength_kncn2() {
        byte[] a = new byte[5];
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        a[3] = 0;
        a[4] = 0;
        assertTrue(ArchiveUtils.isArrayZero(a, 3));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_ZESp0() {
        byte[] inputBytes = "Hello World!".getBytes();
        String expected = "Hello World!";
        String actual = ArchiveUtils.toAsciiString(inputBytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBuffer_uVbK0() {
        String expected = "Hello";
        byte[] buffer = "Hello".getBytes();
        assertTrue(ArchiveUtils.matchAsciiBuffer(expected, buffer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchAsciiBufferFail_yMFT1() {
        String expected = "Hello";
        byte[] buffer = "World".getBytes();
        assertFalse(ArchiveUtils.matchAsciiBuffer(expected, buffer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffers_YMKR0() {
        byte[] buffer1 = new byte[] {1, 2, 3};
        byte[] buffer2 = new byte[] {1, 2, 3};
        boolean result = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEqualBuffers_fmOP1() {
        byte[] buffer1 = new byte[] {1, 2, 3};
        byte[] buffer2 = new byte[] {4, 5, 6};
        boolean result = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithDifferentLengths_nisp2() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4};
        byte[] buffer2 = new byte[] {1, 2, 3};
        boolean result = ArchiveUtils.isEqual(buffer1, 0, 3, buffer2, 0, 3);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualBuffersWithDifferentOffsets_nBEN3() {
        byte[] buffer1 = new byte[] {1, 2, 3, 4};
        byte[] buffer2 = new byte[] {2, 3, 4, 5};
        boolean result = ArchiveUtils.isEqual(buffer1, 1, 3, buffer2, 0, 3);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToAsciiString_DYKS0() {
        byte[] inputBytes = "Hello, World!".getBytes();
        String result = ArchiveUtils.toAsciiString(inputBytes, 0, inputBytes.length);
        assertEquals("Hello, World!", result);
    }
}