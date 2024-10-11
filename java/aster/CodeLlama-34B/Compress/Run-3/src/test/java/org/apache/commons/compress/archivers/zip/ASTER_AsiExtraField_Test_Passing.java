/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AsiExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_fmGb0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String expectedLink = "https://www.example.com";
    String actualLink = asiExtraField.getLinkedFile();
    assertEquals(expectedLink, actualLink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFileWithNull_jbWB1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String expectedLink = null;
    String actualLink = asiExtraField.getLinkedFile();
    assertEquals(expectedLink, actualLink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFileWithEmptyString_fHwH2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String expectedLink = "";
    String actualLink = asiExtraField.getLinkedFile();
    assertEquals(expectedLink, actualLink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFileWithInvalidUrl_RHvR3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String expectedLink = "invalid_url";
    String actualLink = asiExtraField.getLinkedFile();
    assertEquals(expectedLink, actualLink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFileWithDifferentUrl_xzEU5() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String expectedLink = "https://www.example.com/different";
    String actualLink = asiExtraField.getLinkedFile();
    assertEquals(expectedLink, actualLink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFileWithDifferentProtocol_Lyly7() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String expectedLink = "ftp://www.example.com";
    String actualLink = asiExtraField.getLinkedFile();
    assertEquals(expectedLink, actualLink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFileWithDifferentPort_micS11() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String expectedLink = "https://www.example.com:8080";
    String actualLink = asiExtraField.getLinkedFile();
    assertEquals(expectedLink, actualLink);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_TbKs0_1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_TbKs0_2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(centralDirectoryData.length, 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_SJpR0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort headerId = asiExtraField.getHeaderId();
    assertEquals(0x0000, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_InvalidGroupId_WithInvalidGroupId_WithInvalidGroupId_HzHS13() {
    AsiExtraField asiExtraField = new AsiExtraField();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMode_sCew0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setMode(1);
    assertEquals(1, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithInvalidMode_UOBe1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setMode(0);
    assertEquals(0, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithValidMode_gHvv2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setMode(2);
    assertEquals(2, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_null_FZlL0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile(null);
    assertNull(asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_empty_GLEt1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("");
    assertEquals("", asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_valid_uaEp2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("file.txt");
    assertEquals("file.txt", asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_invalid_MBiH3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("file.txt");
    assertNotEquals("file.doc", asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_gjOF0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort centralDirectoryLength = asiExtraField.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserIdWithIllegalArgumentExceptionAndIllegalStateException_OSvk18() {
        int expected = 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_NzHw0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = 1234;
    asiExtraField.setUserId(uid);
    assertEquals(uid, asiExtraField.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ValidData_eKxb0() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 10;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(10, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_InvalidData_oSat1() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 10;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NullData_Rrat2() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = null;
    int offset = 0;
    int length = 10;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_EmptyData_AWtQ3() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[0];
    int offset = 0;
    int length = 0;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NegativeOffset_uDdb4() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = -1;
    int length = 10;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NegativeLength_HLgv5() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = -1;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_OffsetGreaterThanLength_jMLY6() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 11;
    int length = 10;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_LengthGreaterThanBufferLength_ZCJS7() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 11;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_OffsetAndLengthGreaterThanBufferLength_gbXT8() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 11;
    int length = 11;
    asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, asiExtraField.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(10, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_4() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_5() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_6() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_7() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_8() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_9() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_10() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_11() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[8]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0_12() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[9]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(10, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_4() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_5() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_6() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_7() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_8() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_9() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_10() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_11() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[8]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_12() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(0, result[9]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1_15() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertEquals(1, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGroupId_WDQt0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setGroupId(100);
        assertEquals(100, asiExtraField.getGroupId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_True_UDzy0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("linked_file.txt");
    assertTrue(asiExtraField.isLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_False_sEjx1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("");
    assertFalse(asiExtraField.isLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithNullAsiExtraField_uHZO10() {
        AsiExtraField nullAsiExtraField = null;
        int mode = nullAsiExtraField.getMode();
        assertEquals(0, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithInvalidAsiExtraField_MXCk11() {
        AsiExtraField invalidAsiExtraField = new AsiExtraField();
        int mode = invalidAsiExtraField.getMode();
        assertEquals(0, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_True_ELUi0_apvF0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setDirectory(true);
    assertTrue(asiExtraField.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithInvalidValue_iLnj5_hrEK0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort headerId = asiExtraField.getHeaderId();
    assertEquals(0x1234, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_ValidInput_fhCg0_HqBj0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int expected = 123;
    int actual = asiExtraField.getGroupId();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_InvalidInput_FUnp1_FfEy0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int expected = -1;
    int actual = asiExtraField.getGroupId();
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_NullInput_OERT2_usaR0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int expected = 0;
    int actual = asiExtraField.getGroupId();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithNullMode_dztR3_Laer0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setMode(0);
    assertNull(asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserIdWithNegativeValue_KMJB2_qRXj1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int expected = -1;
    int actual = asiExtraField.getUserId();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserIdWithInvalidValue_cVUo5_sxuA1() {
    int expected = -1000;
    AsiExtraField asiExtraField = new AsiExtraField();
    int actual = asiExtraField.getUserId();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_jIiP1_SDEx1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int mode = asiExtraField.getMode();
    assertEquals(0, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithException_zBQw3_uRMg0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    try {
        asiExtraField.clone();
        fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
        assertTrue(e.getMessage().contains("Clone not supported"));
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_TbKs0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertEquals(centralDirectoryData.length, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_Ckcv0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);
    assertEquals(10, result.length);
    assertEquals(0, result[0]);
    assertEquals(0, result[1]);
    assertEquals(0, result[2]);
    assertEquals(0, result[3]);
    assertEquals(0, result[4]);
    assertEquals(0, result[5]);
    assertEquals(0, result[6]);
    assertEquals(0, result[7]);
    assertEquals(0, result[8]);
    assertEquals(0, result[9]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CdtW1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);
    assertEquals(10, result.length);
    assertEquals(0, result[0]);
    assertEquals(0, result[1]);
    assertEquals(0, result[2]);
    assertEquals(0, result[3]);
    assertEquals(0, result[4]);
    assertEquals(0, result[5]);
    assertEquals(0, result[6]);
    assertEquals(0, result[7]);
    assertEquals(0, result[8]);
    assertEquals(0, result[9]);
    asiExtraField.setMode(1);
    result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);
    assertEquals(10, result.length);
    assertEquals(1, result[0]);
    assertEquals(0, result[1]);
    assertEquals(0, result[2]);
    assertEquals(0, result[3]);
    assertEquals(0, result[4]);
    assertEquals(0, result[5]);
    assertEquals(0, result[6]);
    assertEquals(0, result[7]);
    assertEquals(0, result[8]);
    assertEquals(0, result[9]);
    asiExtraField.setLinkedFile("linkedFile");
    result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);
    assertEquals(10, result.length);
    assertEquals(1, result[0]);
    assertEquals(0, result[1]);
    assertEquals(0, result[2]);
    assertEquals(0, result[3]);
    assertEquals(0, result[4]);
    assertEquals(0, result[5]);
    assertEquals(0, result[6]);
    assertEquals(0, result[7]);
    assertEquals(0, result[8]);
    assertEquals(0, result[9]);
    asiExtraField.setUserId(1);
    result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);
    assertEquals(10, result.length);
    assertEquals(1, result[0]);
    assertEquals(0, result[1]);
    assertEquals(0, result[2]);
    assertEquals(0, result[3]);
    assertEquals(0, result[4]);
    assertEquals(0, result[5]);
    assertEquals(0, result[6]);
    assertEquals(0, result[7]);
    assertEquals(0, result[8]);
    assertEquals(0, result[9]);
    asiExtraField.setGroupId(1);
    result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);
    assertEquals(10, result.length);
    assertEquals(1, result[0]);
    assertEquals(0, result[1]);
    assertEquals(0, result[2]);
    assertEquals(0, result[3]);
    assertEquals(0, result[4]);
    assertEquals(0, result[5]);
    assertEquals(0, result[6]);
    assertEquals(0, result[7]);
    assertEquals(0, result[8]);
}
}