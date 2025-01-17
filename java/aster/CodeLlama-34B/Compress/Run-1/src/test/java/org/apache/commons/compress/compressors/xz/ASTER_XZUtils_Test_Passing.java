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
public void testMatches_emptySignature_Fpgd0() {
    byte[] signature = new byte[0];
    int length = 0;
    assertFalse(XZUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_gkIK3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(XZUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilename_wBLm0() {
    String fileName = "test.xz";
    String expected = "test";
    String actual = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilenameWithoutExtension_HquW1() {
    String fileName = "test";
    String expected = "test";
    String actual = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUncompressedFilenameWithEmptyString_sJLv4() {
    String fileName = "";
    String expected = "";
    String actual = XZUtils.getUncompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFilename_ValidString_mdpd2() {
    String fileName = "test.txt";
    String expected = "test.txt.xz";
    String actual = XZUtils.getCompressedFilename(fileName);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_empty_nwtt1() {
    assertFalse(XZUtils.isCompressedFilename(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_invalidExtension_HDjU2() {
    assertFalse(XZUtils.isCompressedFilename("file.txt"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_validExtension_agdm3() {
    assertTrue(XZUtils.isCompressedFilename("file.xz"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_uppercaseExtension_deyB4() {
    assertTrue(XZUtils.isCompressedFilename("file.XZ"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_noExtension_SGsy7() {
    assertFalse(XZUtils.isCompressedFilename("file"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFilename_invalidCharacter_NrzF8() {
    assertFalse(XZUtils.isCompressedFilename("file.xz\0"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFileName_ASAK0() {
        String fileName = "test.xz";
        String expected = "test";
        String actual = XZUtils.getUncompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFileNameWithNoExtension_cACq3() {
        String fileName = "test";
        String expected = "test";
        String actual = XZUtils.getUncompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUncompressedFileNameWithEmptyString_kqTl4() {
        String fileName = "";
        String expected = "";
        String actual = XZUtils.getUncompressedFileName(fileName);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_False_SDuI1() {
    String fileName = "file.txt";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_Empty_HkSX3() {
    String fileName = "";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_InvalidExtension_Hubl4() {
    String fileName = "file.invalid";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_InvalidMultipleExtensions_TDZv9() {
    String fileName = "file.zip.invalid";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithInvalid_fluB11() {
    String fileName = "file.zip.invalid.txt";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithInvalidAndValid_feZh13() {
    String fileName = "file.zip.invalid.txt.zip";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithValidAndInvalid_eWnk14() {
    String fileName = "file.zip.txt.zip.invalid";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithInvalidAndInvalid_NhgR16() {
    String fileName = "file.zip.invalid.txt.invalid";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithValidAndValidAndInvalid_BhmK17() {
    String fileName = "file.zip.txt.zip.txt.invalid";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithInvalidAndValidAndValid_RoEV18() {
    String fileName = "file.zip.invalid.txt.zip.txt";
    assertFalse(XZUtils.isCompressedFileName(fileName));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedFileName_valid_Lbfo2() {
    String fileName = "file.txt";
    String compressedFileName = XZUtils.getCompressedFileName(fileName);
    assertEquals("file.txt.xz", compressedFileName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_uKyQ2_Gajv0() {
    byte[] signature = new byte[] { (byte) 0x1F, (byte) 0x9D, (byte) 0x00 };
    int length = 3;
    assertFalse(XZUtils.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_ValidExtension_vEjV5_fid1() {
    String fileName = "file.zip";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_UppercaseExtension_fgBC6_fid1() {
    String fileName = "file.ZIP";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensions_LTNu8_fid1() {
    String fileName = "file.zip.txt";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithValid_eNvj12_fid1() {
    String fileName = "file.zip.txt.zip";
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCompressedFileName_MultipleExtensionsWithValidAndValid_oGkX15_fid1() {
    String fileName = "file.zip.txt.zip.txt";
}
}