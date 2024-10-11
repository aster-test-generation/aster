/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XZUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName_EEwC1() {
        String fileName = "test.gz";
        boolean result = XZUtils.isCompressedFileName(fileName);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesNullSignature_bPYF3() {
        byte[] signature = null;
        try {
            XZUtils.matches(signature, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFilename_uxAU0() {
        String fileName = "test.gz";
        String expected = "test";
        String result = XZUtils.getUncompressedFilename(fileName);
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_uvms1() {
        String fileName = "test.zip";
        boolean result = XZUtils.isCompressedFilename(fileName);
        assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilenameFalse_XbnQ2() {
        String fileName = "test.txt";
        boolean result = XZUtils.isCompressedFilename(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilename_ijDi0() {
        String fileName = "test.txt";
        String expected = "test.txt.gz";
        String actual = XZUtils.getCompressedFilename(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFileName_tzFu1() {
        String fileName = "test.gz";
        String result = XZUtils.getUncompressedFileName(fileName);
        assertEquals("test", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesValidSignature_lYiF0_GjiP0() {
    byte[] signature = new byte[] {0x78, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
    boolean result = XZUtils.matches(signature, signature.length);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsXZCompressionAvailableAvailable_cJCW0_oLck0() {
    boolean result = XZUtils.isXZCompressionAvailable();
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCacheXZAvailablityDoCacheTrueCachedAvailable_sPhn2_Whrh0() {
    XZUtils.setCacheXZAvailablity(true);
    assertEquals(true, XZUtils.getCachedXZAvailability());
}
}