/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XZUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_emptyString_gaNv0() {
    assertFalse(XZUtils.isCompressedFileName(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_null_acUT1() {
    assertFalse(XZUtils.isCompressedFileName(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_invalidFileName_QjXF2() {
    assertFalse(XZUtils.isCompressedFileName("file.txt"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_validFileName_MirJ3() {
    assertTrue(XZUtils.isCompressedFileName("file.txt.xz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_validFileNameWithPath_qTdU4() {
    assertTrue(XZUtils.isCompressedFileName("/path/to/file.txt.xz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_invalidFileNameWithPath_SZvR5() {
    assertFalse(XZUtils.isCompressedFileName("/path/to/file.txt"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_invalidFileNameWithExtension_zoMg8() {
    assertFalse(XZUtils.isCompressedFileName("file.txt.xz.invalid"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_validFileNameWithExtension_Qkvl9() {
    assertTrue(XZUtils.isCompressedFileName("file.txt.xz.valid"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_GmjS1() {
    byte[] signature = new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
    int length = signature.length;
    assertFalse(XZUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_GgUj2() {
    byte[] signature = new byte[] {};
    int length = signature.length;
    assertFalse(XZUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_DSpI3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(XZUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_VjSW0() {
    String fileName = "file.txt.xz";
    String expectedUncompressedFileName = "file.txt";
    String actualUncompressedFileName = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expectedUncompressedFileName, actualUncompressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilenameWithoutExtension_EFop1() {
    String fileName = "file";
    String expectedUncompressedFileName = "file";
    String actualUncompressedFileName = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expectedUncompressedFileName, actualUncompressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilenameWithMultipleExtensions_yqOb2() {
    String fileName = "file.txt.xz.gz";
    String expectedUncompressedFileName = "file.txt";
    String actualUncompressedFileName = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expectedUncompressedFileName, actualUncompressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilenameWithInvalidExtension_BYhC3() {
    String fileName = "file.txt.xz.invalid";
    String expectedUncompressedFileName = "file.txt";
    String actualUncompressedFileName = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expectedUncompressedFileName, actualUncompressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilenameWithEmptyString_ZBed4() {
    String fileName = "";
    String expectedUncompressedFileName = "";
    String actualUncompressedFileName = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expectedUncompressedFileName, actualUncompressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilenameWithNull_rZgP5() {
    String fileName = null;
    String expectedUncompressedFileName = null;
    String actualUncompressedFileName = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expectedUncompressedFileName, actualUncompressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Null_BOzc0() {
    assertFalse(XZUtils.isCompressedFilename(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Empty_haBa1() {
    assertFalse(XZUtils.isCompressedFilename(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Invalid_ejpv2() {
    assertFalse(XZUtils.isCompressedFilename("file.txt"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_BvgA3() {
    assertTrue(XZUtils.isCompressedFilename("file.xz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_Uppercase_LlCl4() {
    assertTrue(XZUtils.isCompressedFilename("FILE.XZ"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_Mixedcase_Hbkm6() {
    assertTrue(XZUtils.isCompressedFilename("FiLe.Xz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_MultipleExtensions_yTfW7() {
    assertTrue(XZUtils.isCompressedFilename("file.xz.txt"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_MultipleDots_hjek8() {
    assertTrue(XZUtils.isCompressedFilename("file.xz.txt.gz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_MultipleExtensions_Mixedcase_nMAx9() {
    assertTrue(XZUtils.isCompressedFilename("file.Xz.Txt.Gz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_MultipleExtensions_Uppercase_mUXX11() {
    assertTrue(XZUtils.isCompressedFilename("FILE.XZ.TXT.GZ"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_Valid_MultipleExtensions_Mixedcase_Uppercase_bhBc15() {
    assertTrue(XZUtils.isCompressedFilename("FiLe.Xz.Txt.Gz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilename_kAss0() {
        String fileName = "test.txt";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.txt.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithoutExtension_LvSF1() {
        String fileName = "test";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithMultipleDots_eIBh2() {
        String fileName = "test.tar.gz";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.tar.gz.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithInvalidFileName_jSKk3() {
        String fileName = "test.txt.xz";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.txt.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithNullFileName_qfvI4() {
        String fileName = null;
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertNull(compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithEmptyFileName_yqhu5() {
        String fileName = "";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithInvalidExtension_fMHV6() {
        String fileName = "test.txt.invalid";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.txt.invalid.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithMultipleExtensions_Afmz7() {
        String fileName = "test.tar.gz.xz";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.tar.gz.xz.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithDotAtTheEnd_rIow8() {
        String fileName = "test.txt.";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.txt.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithDotAtTheBeginning_pdrY9() {
        String fileName = ".test.txt";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals(".test.txt.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithDotInTheMiddle_HfTO10() {
        String fileName = "test.txt.tar.gz";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.txt.tar.gz.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithDotAtTheEndAndInvalidExtension_Gksj11() {
        String fileName = "test.txt.invalid.";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals("test.txt.invalid.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedFilenameWithDotAtTheBeginningAndInvalidExtension_AnXW12() {
        String fileName = ".test.txt.invalid";
        String compressedFileName = XZUtils.getCompressedFilename(fileName);
        assertEquals(".test.txt.invalid.xz", compressedFileName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_null_tONy0() {
    String fileName = null;
    String expected = null;
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_empty_xiqQ1() {
    String fileName = "";
    String expected = "";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_valid_yOME2() {
    String fileName = "file.xz";
    String expected = "file";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_invalid_URSd3() {
    String fileName = "file.txt";
    String expected = null;
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_nullExtension_tVaX4() {
    String fileName = "file";
    String expected = "file";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_emptyExtension_qEFk5() {
    String fileName = "file.";
    String expected = "file";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_multipleExtensions_FOGi7() {
    String fileName = "file.xz.txt";
    String expected = "file.txt";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_multipleDots_sMTV8() {
    String fileName = "file...xz";
    String expected = "file";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_leadingDot_vqDf9() {
    String fileName = ".file.xz";
    String expected = "file";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_trailingDot_oWrF10() {
    String fileName = "file.xz.";
    String expected = "file";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_leadingAndTrailingDots_tPta12() {
    String fileName = "file.xz...";
    String expected = "file";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_leadingAndTrailingDotsWithExtension_CsZQ13() {
    String fileName = "file.xz...txt";
    String expected = "file.txt";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFileName_leadingAndTrailingDotsWithMultipleExtensions_gnOC14() {
    String fileName = "file.xz...txt.gz";
    String expected = "file.txt";
    String actual = XZUtils.getUncompressedFileName(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_VPac0() {
    String fileName = "test.txt";
    String compressedFileName = XZUtils.getCompressedFileName(fileName);
    assertEquals("test.txt.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileNameWithoutExtension_KSXd1() {
    String fileName = "test";
    String compressedFileName = XZUtils.getCompressedFileName(fileName);
    assertEquals("test.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileNameWithMultipleDots_habQ2() {
    String fileName = "test.txt.gz";
    String compressedFileName = XZUtils.getCompressedFileName(fileName);
    assertEquals("test.txt.gz.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileNameWithInvalidFileName_xYwu3() {
    String fileName = "test.txt.invalid";
    String compressedFileName = XZUtils.getCompressedFileName(fileName);
    assertNull(compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileNameWithNullFileName_XdOG4() {
    String fileName = null;
    String compressedFileName = XZUtils.getCompressedFileName(fileName);
    assertNull(compressedFileName);
}
}