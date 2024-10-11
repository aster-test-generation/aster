/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AsiExtraField_Test_Passing {
private AsiExtraField asiExtraField;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_LaSJ0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort zipShort = asiExtraField.getLocalFileDataLength();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_FullCoverage_NLUG1_1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort zipShort = asiExtraField.getLocalFileDataLength();
    assertEquals(14, zipShort.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_FullCoverage_NLUG1_2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort zipShort = asiExtraField.getLocalFileDataLength();
    assertEquals(2, zipShort.getBytes().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_empty_RuTk1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String linkedFile = asiExtraField.getLinkedFile();
    assertEquals("", linkedFile);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_valid_uQVM0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertEquals(0, groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_nonNull_ETGN3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int groupId = asiExtraField.getGroupId();
    assertNotNull(groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_ValidInput_SGTg0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = 1234;
    asiExtraField.setUserId(uid);
    assertEquals(uid, asiExtraField.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_emptyString_nQpn1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("");
    assertEquals("", asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_validString_kVlK2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("file.txt");
    assertEquals("file.txt", asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLinkedFile_invalidMode_pdId7() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("file.txt");
    assertNotEquals("file.txt", asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_linkedFileNotEmpty_KclV0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("linkedFile");
    assertTrue(asiExtraField.isLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_linkedFileEmpty_RgTc1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setLinkedFile("");
    assertFalse(asiExtraField.isLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_Invalid_vlhs1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotEquals(uid, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_Empty_hglE3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertEquals(uid, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_InvalidType_jYri8() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotEquals(uid, "1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_InvalidType_Empty_wOWP10() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotEquals(uid, "");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_InvalidType_Negative_hwGN11() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotEquals(uid, -1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_InvalidType_MaxValue_Iioz12() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotEquals(uid, Integer.MAX_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_InvalidType_MinValue_pZwC13() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotEquals(uid, Integer.MIN_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_InvalidType_Random_LfDP14() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotEquals(uid, new Random().nextInt());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_WDzA0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort centralDirectoryLength = asiExtraField.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), asiExtraField.getLocalFileDataLength().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_OxBs0() {
        asiExtraField = new AsiExtraField();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_iwGp0_1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_nonEmpty_JvRU2_1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    String linkedFile = asiExtraField.getLinkedFile();
    assertNotNull(linkedFile);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_File_gabK0_UNzq0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int mode = asiExtraField.getMode();
    assertEquals(0, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_NullInput_zIKF2_TJOM0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = 0;
    asiExtraField.setUserId(uid);
    assertEquals(0, asiExtraField.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_Csbk0_fKIx0_1() {
    AsiExtraField original = new AsiExtraField();
    AsiExtraField cloned = (AsiExtraField) original.clone();
    assertNotNull(cloned);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_Csbk0_fKIx0_2() {
    AsiExtraField original = new AsiExtraField();
    AsiExtraField cloned = (AsiExtraField) original.clone();
    assertNotSame(original, cloned);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_Csbk0_fKIx0_3() {
    AsiExtraField original = new AsiExtraField();
    AsiExtraField cloned = (AsiExtraField) original.clone();
    assertEquals(original.getMode(), cloned.getMode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupIdWithNegativeValue_lZAr1_UQSi0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setGroupId(-100);
    assertEquals(-100, asiExtraField.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupIdWithZeroValue_EAuh2_dwVj0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setGroupId(0);
    assertEquals(0, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_InvalidType_Null_ePNZ9_ewpc0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int uid = asiExtraField.getUserId();
    assertNotNull(uid);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithBytes_FWHd2_SqiP0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort centralDirectoryLength = asiExtraField.getLocalFileDataLength();
    assertEquals(centralDirectoryLength.getValue(), asiExtraField.getLocalFileDataLength().getValue());
}
}