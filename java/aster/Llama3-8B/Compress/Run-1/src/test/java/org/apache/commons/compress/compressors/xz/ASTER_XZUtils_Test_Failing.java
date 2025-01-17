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
public class Aster_XZUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesNullSignature_KUSu3() {
        byte[] signature = null;
        try {
            XZUtils.matches(signature, 5);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileNameTrue_iPKP0_fid2() {
        String fileName = "test.zip";
        assertTrue(XZUtils.isCompressedFileName(fileName));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesValidSignature_fcgi0_fid2() {
        byte[] signature = new byte[] {1, 2, 3, 4, 5};
        boolean result = XZUtils.matches(signature, signature.length);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFilename_HzZG0() {
        String fileName = "test.gz";
        String expected = "test";
        String actual = XZUtils.getUncompressedFilename(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_QlRZ1_fid2() {
        String fileName = "test.zip";
        boolean result = XZUtils.isCompressedFilename(fileName);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilename_pFPy0_fid2() {
        String fileName = "test.txt";
        String expected = "test.txt.gz";
        String actual = XZUtils.getCompressedFilename(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFileName_UtKm0() {
        String fileName = "test.gz";
        String expected = "test";
        String actual = XZUtils.getUncompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFileName_qocp0_fid2() {
        String fileName = "test.txt";
        String expected = "test.txt.gz";
        String actual = XZUtils.getCompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsXZCompressionAvailable_ClassNotFound_DXJS0_efcM1_fid3() {
    boolean result = XZUtils.isXZCompressionAvailable();
    Assertions.assertFalse(result);
}
}