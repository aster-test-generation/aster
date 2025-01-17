/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMAUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_mmzY0() {
    byte[] signature = new byte[0];
    int length = 0;
    assertFalse(LZMAUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nonEmptySignature_YFyQ1() {
    byte[] signature = new byte[] { 0x01, 0x02, 0x03 };
    int length = 3;
    assertFalse(LZMAUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nonEmptySignature_differentLength_RGfG2() {
    byte[] signature = new byte[] { 0x01, 0x02, 0x03 };
    int length = 2;
    assertFalse(LZMAUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFilename_FnMI0() {
    String fileName = "test.txt";
    String expected = "test.txt.lzma";
    String actual = LZMAUtils.getCompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFilenameWithoutExtension_xpRP1() {
    String fileName = "test";
    String expected = "test.lzma";
    String actual = LZMAUtils.getCompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFilenameWithMultipleExtensions_XEKw2() {
    String fileName = "test.txt.gz";
    String expected = "test.txt.gz.lzma";
    String actual = LZMAUtils.getCompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_valid_cSVZ2() {
    String fileName = "file.txt.lzma";
    String expected = "file.txt";
    String actual = LZMAUtils.getUncompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_invalid_tALV3() {
    String fileName = "file.txt";
    String expected = null;
    String actual = LZMAUtils.getUncompressedFilename(fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_emptyExtension_foSD5() {
    String fileName = "file.txt.";
    String expected = "file.txt";
    String actual = LZMAUtils.getUncompressedFilename(fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_invalidExtension_hGcT6() {
    String fileName = "file.txt.zip";
    String expected = null;
    String actual = LZMAUtils.getUncompressedFilename(fileName);
    assertNull(expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_emptyPath_dhcv8() {
    String fileName = "";
    String expected = "";
    String actual = LZMAUtils.getUncompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_validPath_fMlM9() {
    String fileName = "path/to/file.txt.lzma";
    String expected = "path/to/file.txt";
    String actual = LZMAUtils.getUncompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_invalidPath_GCgT10() {
    String fileName = "path/to/file.txt";
    String expected = null;
    String actual = LZMAUtils.getUncompressedFilename(fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_EmptyString_dURh0() {
    String fileName = "";
    assertFalse(LZMAUtils.isCompressedFilename(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidLZMAFile_Fkha2() {
    String fileName = "file.lzma";
    assertTrue(LZMAUtils.isCompressedFilename(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidLZMAFileWithPath_MkEN3() {
    String fileName = "path/to/file.lzma";
    assertTrue(LZMAUtils.isCompressedFilename(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_InvalidLZMAFile_Yavs4() {
    String fileName = "file.txt";
    assertFalse(LZMAUtils.isCompressedFilename(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_InvalidLZMAFileWithPath_zXAY5() {
    String fileName = "path/to/file.txt";
    assertFalse(LZMAUtils.isCompressedFilename(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidGZFile_Zovb6() {
    String fileName = "file.gz";
    assertFalse(LZMAUtils.isCompressedFilename(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidGZFileWithPath_NGBF7() {
    String fileName = "path/to/file.gz";
    assertFalse(LZMAUtils.isCompressedFilename(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidXZFile_HxAQ10() {
    String fileName = "file.xz";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidXZFileWithPath_oqzW11() {
    String fileName = "path/to/file.xz";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidBZ2File_kezf14() {
    String fileName = "file.bz2";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_ValidBZ2FileWithPath_MGNT15() {
    String fileName = "path/to/file.bz2";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_empty_knoX1() {
    String fileName = "";
    String expected = "";
    String actual = LZMAUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_valid_qpLZ2() {
    String fileName = "file.txt.lzma";
    String expected = "file.txt";
    String actual = LZMAUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_invalid_XtTc3() {
    String fileName = "file.txt";
    String expected = "file.txt";
    String actual = LZMAUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_emptyExtension_BpOk5() {
    String fileName = "file.txt.";
    String expected = "file.txt";
    String actual = LZMAUtils.getUncompressedFileName(fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_invalidFileNameAndExtension_KCyZ14() {
    String fileName = "file.txt.invalid.lzma";
    String expected = "file.txt";
    String actual = LZMAUtils.getUncompressedFileName(fileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidFileName_rtmG0() {
    String fileName = "test.txt.lzma";
    assertTrue(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_InvalidFileName_cGYx1() {
    String fileName = "test.txt";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_EmptyFileName_HLJN3() {
    String fileName = "";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_InvalidExtension_xiwi4() {
    String fileName = "test.txt.zip";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionButNotCompressed_eQje5() {
    String fileName = "test.txt.gz";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA3_iNDK9() {
    String fileName = "test.txt.bz2";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA4_gpBd10() {
    String fileName = "test.txt.xz";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA5_Pivk11() {
    String fileName = "test.txt.lz4";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA6_shqF12() {
    String fileName = "test.txt.zstd";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA7_pMqg13() {
    String fileName = "test.txt.br";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA8_idol14() {
    String fileName = "test.txt.zpaq";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA9_aDzQ15() {
    String fileName = "test.txt.lz";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA10_NCkN16() {
    String fileName = "test.txt.lzma2";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtensionAndCompressedButNotLZMA11_Koqq17() {
    String fileName = "test.txt.lzma3";
    assertFalse(LZMAUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileName_AIhi2() {
    String fileName = "file.txt";
    String expected = "file.txt.lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithPath_ZbzN3() {
    String fileName = "path/to/file.txt";
    String expected = "path/to/file.txt.lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithExtension_RVwR4() {
    String fileName = "file.txt.lzma";
    String expected = "file.txt.lzma.lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithMultipleExtensions_rDfJ5() {
    String fileName = "file.txt.lzma.gz";
    String expected = "file.txt.lzma.gz.lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithDotAtEnd_lkeW6() {
    String fileName = "file.txt.";
    String expected = "file.txt..lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithDotAtStart_AxEj7() {
    String fileName = ".file.txt";
    String expected = ".file.txt.lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithDotAtEndAndMiddle_LNDL9() {
    String fileName = "file.txt..lzma";
    String expected = "file.txt..lzma.lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithDotAtStartAndMiddle_uDmA10() {
    String fileName = ".file.txt.lzma";
    String expected = ".file.txt.lzma.lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_validFileNameWithDotAtStartAndEnd_blSF11() {
    String fileName = ".file.txt.";
    String expected = ".file.txt..lzma";
    String actual = LZMAUtils.getCompressedFileName(fileName);
    assertEquals(expected, actual);
}
}