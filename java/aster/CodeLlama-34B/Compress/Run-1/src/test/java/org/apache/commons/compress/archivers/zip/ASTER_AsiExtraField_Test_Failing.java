/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.charset.Charset;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AsiExtraField_Test_Failing {
private AsiExtraField asiExtraField;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_LaSJ0_fid1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort zipShort = asiExtraField.getLocalFileDataLength();
    assertEquals(2, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_FullCoverage_NLUG1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort zipShort = asiExtraField.getLocalFileDataLength();
    assertEquals(2, zipShort.getValue());
    assertEquals(2, zipShort.getBytes().length);
    assertEquals(2, asiExtraField.getLinkedFile().getBytes(Charset.defaultCharset()).length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertEquals(10, centralDirectoryData.length);
    assertEquals(0x01, centralDirectoryData[0]);
    assertEquals(0x02, centralDirectoryData[1]);
    assertEquals(0x03, centralDirectoryData[2]);
    assertEquals(0x04, centralDirectoryData[3]);
    assertEquals(0x05, centralDirectoryData[4]);
    assertEquals(0x06, centralDirectoryData[5]);
    assertEquals(0x07, centralDirectoryData[6]);
    assertEquals(0x08, centralDirectoryData[7]);
    assertEquals(0x09, centralDirectoryData[8]);
    assertEquals(0x0A, centralDirectoryData[9]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWithEmptyData_tvYA1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertEquals(0, centralDirectoryData.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWithNullData_quxT2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertNull(centralDirectoryData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_NQlj0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort headerId = asiExtraField.getHeaderId();
    assertEquals(headerId.getValue(), 0x0000);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDirectory_YHqu0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setDirectory(true);
    assertEquals(true, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDirectoryFalse_bHEy1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setDirectory(false);
    assertEquals(false, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_null_HJWw0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String linkedFile = asiExtraField.getLinkedFile();
    assertNull(linkedFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_nonEmpty_JvRU2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String linkedFile = asiExtraField.getLinkedFile();
    assertNotNull(linkedFile);
    assertNotEquals("", linkedFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_invalid_ines1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertNotEquals(0, groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_null_MBFi2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertNull(groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_negative_PiOM4() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertTrue(groupId < 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_positive_FdOg5() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertTrue(groupId > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_maxValue_nAgx8() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertEquals(Integer.MAX_VALUE, groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_minValue_loZq9() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertEquals(Integer.MIN_VALUE, groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_randomValue_Giul10() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertTrue(groupId > 0 && groupId < Integer.MAX_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_InvalidInput_PSwV1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = -1;
    asiExtraField.setUserId(uid);
    assertEquals(0, asiExtraField.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_null_cOfO0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile(null);
    assertEquals(null, asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_invalidString_ibUy3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("file.txt");
    assertNotEquals("file.txt", asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_emptyMode_zwGJ5() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("");
    assertEquals("", asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_validMode_lfJj6() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("file.txt");
    assertEquals("file.txt", asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMode_iJno0() {
AsiExtraField asiExtraField = new AsiExtraField();
asiExtraField.setMode(1);
assertEquals(1, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithInvalidMode_plxh1() {
AsiExtraField asiExtraField = new AsiExtraField();
asiExtraField.setMode(-1);
assertEquals(0, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithDifferentMode_Lxrv3() {
AsiExtraField asiExtraField = new AsiExtraField();
asiExtraField.setMode(2);
assertEquals(2, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_linkedFileNull_RihQ2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile(null);
    assertFalse(asiExtraField.isLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_Valid_HOyL0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertEquals(uid, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_Null_hqrI2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNull(uid);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_Negative_RxhC4() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertEquals(uid, -1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_MaxValue_nusS5() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertEquals(uid, Integer.MAX_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_MinValue_IumG6() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertEquals(uid, Integer.MIN_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_Random_PBGL7() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertEquals(uid, new Random().nextInt());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NullBuffer_wVZT1() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = null;
    int offset = 0;
    int length = 10;
    try {
        asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("buffer is null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NegativeOffset_qyew2() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = -1;
    int length = 10;
    try {
        asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("offset is negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NegativeLength_MLAU3() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = -1;
    try {
        asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("length is negative", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_OffsetGreaterThanBufferLength_ExzK4() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 11;
    int length = 10;
    try {
        asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("offset is greater than buffer length", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_LengthGreaterThanBufferLength_KCqw5() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 11;
    try {
        asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("length is greater than buffer length", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_CtBq1() {
        int mode = asiExtraField.getMode();
        assertEquals(0, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithNonZeroMode_nzCv2() {
        asiExtraField.setMode(1);
        int mode = asiExtraField.getMode();
        assertEquals(1, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithNegativeMode_xPBd3() {
        asiExtraField.setMode(-1);
        int mode = asiExtraField.getMode();
        assertEquals(-1, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithMaxMode_pIVP4() {
        asiExtraField.setMode(Integer.MAX_VALUE);
        int mode = asiExtraField.getMode();
        assertEquals(Integer.MAX_VALUE, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithMinMode_jRNI5() {
        asiExtraField.setMode(Integer.MIN_VALUE);
        int mode = asiExtraField.getMode();
        assertEquals(Integer.MIN_VALUE, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_FullCoverage_NLUG1_3_fid2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort zipShort = asiExtraField.getLocalFileDataLength();
    assertEquals(2, asiExtraField.getLinkedFile().getBytes(Charset.defaultCharset()).length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(10, centralDirectoryData.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x01, centralDirectoryData[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_4() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x02, centralDirectoryData[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_5() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x03, centralDirectoryData[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_6() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x04, centralDirectoryData[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_7() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x05, centralDirectoryData[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_8() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x06, centralDirectoryData[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_9() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x07, centralDirectoryData[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_10() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x08, centralDirectoryData[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_11() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x09, centralDirectoryData[8]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_12() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0x0A, centralDirectoryData[9]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWithEmptyData_tvYA1_2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertEquals(0, centralDirectoryData.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_nonEmpty_JvRU2_2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String linkedFile = asiExtraField.getLinkedFile();
    assertNotEquals("", linkedFile);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_LengthLessThanZero_BMgw6() throws ZipException {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = -1;
    try {
        asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("length is less than zero", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_Null_ZmxL2_TrvI0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    assertNull(asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_Link_KCly1_ZOHv0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int mode = asiExtraField.getMode();
    assertEquals(AsiExtraField.LINK_FLAG, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_nullMode_pIjp4_yzAY0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile(null);
    assertEquals(0, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_Directory_SEzv2_DWOk1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int mode = asiExtraField.getMode();
    assertEquals(1, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupId_aFZY0_KotS0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setGroupId(100);
    assertEquals(100, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupIdWithMaxValue_gidY3_ioqq0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setGroupId(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupIdWithMinValue_Leju4_iPtY0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setGroupId(Integer.MIN_VALUE);
    assertEquals(Integer.MIN_VALUE, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupIdWithInvalidValue_TNue5_kvhg0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    try {
        asiExtraField.setGroupId(0);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("gid must be a valid integer", e.getMessage());
    }
}
}