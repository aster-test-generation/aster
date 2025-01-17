/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFilename_DCUx0() {
        String fileName = "example.txt.gz";
        String expectedFileName = "example.txt";
        String actualFileName = GzipUtils.getUncompressedFilename(fileName);
        assertEquals(expectedFileName, actualFileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName_wSfK0() {
        String fileName = "example.txt.gz";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName2_QZND1() {
        String fileName = "example.txt";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName3_sNgW2() {
        String fileName = "example.tar.gz";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName4_CrxN3() {
        String fileName = "example.tar";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName5_ekvV4() {
        String fileName = "example.zip";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName6_IwIO5() {
        String fileName = "example.jar";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName7_phgo6() {
        String fileName = "example.7z";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName8_JkWv7() {
        String fileName = "example.rar";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName9_GqOl8() {
        String fileName = "example.gz";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName10_hgLI9() {
        String fileName = "example.bz2";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName11_FXkc10() {
        String fileName = "example.xz";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName12_YHsL11() {
        String fileName = "example.zst";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName13_MuOl12() {
        String fileName = "example.lz4";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName14_gteN13() {
        String fileName = "example.lzma";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFileName15_aHuk14() {
        String fileName = "example.snappy";
        boolean result = GzipUtils.isCompressedFileName(fileName);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedFilename_ESEe0() {
        String fileName = "example.txt";
        String compressedFileName = "example.txt.gz";
        assertEquals(compressedFileName, GzipUtils.getCompressedFilename(fileName));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_mINJ0_1() {
        assertTrue(GzipUtils.isCompressedFilename("example.txt.gz"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_mINJ0_2() {
        assertFalse(GzipUtils.isCompressedFilename("example.txt"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_3() {
        assertTrue(GzipUtils.isCompressedFilename("example.tar.gz"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_4() {
        assertFalse(GzipUtils.isCompressedFilename("example.tar"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_5() {
        assertFalse(GzipUtils.isCompressedFilename("example.zip"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_6() {
        assertFalse(GzipUtils.isCompressedFilename("example.jar"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_7() {
        assertFalse(GzipUtils.isCompressedFilename("example.7z"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_8() {
        assertFalse(GzipUtils.isCompressedFilename("example.exe"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_9() {
        assertTrue(GzipUtils.isCompressedFilename("example.gz"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCompressedFilename_JWzC1_10() {
        assertFalse(GzipUtils.isCompressedFilename("example.log"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFileName_DMiE0() {
        String fileName = "example.txt";
        String expected = "example.txt";
        String actual = GzipUtils.getUncompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedFileName_teDQ0() {
        String fileName = "example.txt";
        String expected = "example.txt.gz";
        String actual = GzipUtils.getCompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedFileNameWithPath_zBBB1() {
        String fileName = "path/to/example.txt";
        String expected = "path/to/example.txt.gz";
        String actual = GzipUtils.getCompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedFileNameWithExtension_YDHq2() {
        String fileName = "example.tar.gz";
        String expected = "example.tar.gz.gz";
        String actual = GzipUtils.getCompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedFileNameWithMultipleExtensions_Tdoo3() {
        String fileName = "example.tar.gz.zip";
        String expected = "example.tar.gz.zip.gz";
        String actual = GzipUtils.getCompressedFileName(fileName);
        assertEquals(expected, actual);
    }
}