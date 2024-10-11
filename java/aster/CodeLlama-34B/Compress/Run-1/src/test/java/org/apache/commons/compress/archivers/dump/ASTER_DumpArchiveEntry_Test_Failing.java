/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveEntry_Test_Failing {
public void testSetAccessTime_Htac0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date();
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithNull_eRsz1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setAccessTime(null);
assertNull(entry.getAccessTime());
}
public void testSetAccessTimeWithInvalidDate_nexb2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(0);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithFutureDate_axLg3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() + 10000);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithPastDate_kDrG4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() - 10000);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithDifferentTimeZone_rouz5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() - 10000);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithDifferentLocale_KKAC6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() - 10000);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithDifferentTimeZoneAndLocale_zMRt7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() - 10000);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithDifferentTimeZoneAndLocaleAndDifferentDate_bUpX8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() - 10000);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetAccessTimeWithDifferentTimeZoneAndLocaleAndDifferentDateAndDifferentTime_faEG9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() - 10000);
entry.setAccessTime(atime);
assertEquals(atime.getTime(), entry.getAccessTime().getTime());
}
public void testSetVolume_validVolume_mEEV0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setVolume(1);
    assertEquals(1, entry.getVolume());
}
public void testSetVolume_invalidVolume_iJXZ1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setVolume(-1);
    assertEquals(0, entry.getVolume());
}
public void testSetVolume_nullVolume_Yqmf2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals(0, entry.getVolume());
}
public void testSetVolume_emptyVolume_AVRS3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals(0, entry.getVolume());
}
public void testSetVolume_blankVolume_lQRI4() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals(0, entry.getVolume());
}
public void testSetVolume_invalidVolumeType_VDmd5() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals(0, entry.getVolume());
}
public void testSetVolume_nullName_qwOp6() {
    DumpArchiveEntry entry = new DumpArchiveEntry(null, "simpleName");
    entry.setVolume(1);
    assertEquals(1, entry.getVolume());
}
public void testSetVolume_emptyName_EmpC7() {
    DumpArchiveEntry entry = new DumpArchiveEntry("", "simpleName");
    entry.setVolume(1);
    assertEquals(1, entry.getVolume());
}
public void testSetVolume_blankName_AxBj8() {
    DumpArchiveEntry entry = new DumpArchiveEntry(" ", "simpleName");
    entry.setVolume(1);
    assertEquals(1, entry.getVolume());
}
public void testSetVolume_invalidNameType_zvnx9() {
}
public void testSetCreationTime_Auue0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithNull_cDIx1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setCreationTime(null);
assertNull(entry.getCreationTime());
}
public void testSetCreationTimeWithInvalidDate_yCQF2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(0);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithValidDate_PAMm3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(1000000000000L);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithFutureDate_dvRW4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(System.currentTimeMillis() + 1000000000000L);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithPastDate_QBOr5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(System.currentTimeMillis() - 1000000000000L);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithDifferentTimeZone_KVSL6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(System.currentTimeMillis() + 1000000000000L);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithDifferentLocale_FJbg7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(System.currentTimeMillis() + 1000000000000L);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithDifferentTimeZoneAndLocale_YvIy8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(System.currentTimeMillis() + 1000000000000L);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidTimeZone_AksS9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date(System.currentTimeMillis() + 1000000000000L);
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testGetIno_WHITEOUT_wvwe0() {
}
public void testGetIno_SOCKET_Liry1() {
}
public void testGetIno_LINK_PpTN2() {
}
public void testGetIno_FILE_SviN3() {
}
public void testGetIno_BLKDEV_bBWh4() {
}
public void testGetIno_DIRECTORY_lOdC5() {
}
public void testGetIno_CHRDEV_Bgkp6() {
}
public void testGetIno_FIFO_DfDF7() {
}
public void testGetIno_UNKNOWN_hqaA8() {
}
public void testGetIno_NULL_mNer9() {
}
public void testSetTypeWhiteout_sHKf0() {
}
public void testSetTypeSocket_hKlo1() {
}
public void testSetTypeLink_UNDf2() {
}
public void testSetTypeFile_NxQo3() {
}
public void testSetTypeBlkdev_IgAG4() {
}
public void testSetTypeChrdev_kNFu5() {
}
public void testSetTypeFifo_ThLI6() {
}
public void testSetTypeUnknown_jdlZ7() {
}
public void testSetTypeNull_RQpE8() {
}
public void testSetTypeInvalid_uEgF9() {
}
public void testSetGeneration_eStQ0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(1);
assertEquals(1, entry.getGeneration());
}
public void testSetGenerationWithNegativeValue_Kidl1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(-1);
assertEquals(-1, entry.getGeneration());
}
public void testSetGenerationWithZeroValue_bvEQ2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(0);
assertEquals(0, entry.getGeneration());
}
public void testSetGenerationWithMaxValue_SjXG3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(Integer.MAX_VALUE);
assertEquals(Integer.MAX_VALUE, entry.getGeneration());
}
public void testSetGenerationWithMinValue_pCeC4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(Integer.MIN_VALUE);
assertEquals(Integer.MIN_VALUE, entry.getGeneration());
}
public void testSetGenerationWithInvalidValue_Svni5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getGeneration());
}
public void testSetGenerationWithNullValue_MEBa6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getGeneration());
}
public void testSetGenerationWithEmptyString_TkkT7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getGeneration());
}
public void testSetGenerationWithValidValue_Ywtb8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(100);
assertEquals(100, entry.getGeneration());
}
public void testSetGenerationWithInvalidValueAndInvalidName_imdt9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getGeneration());
}
public void testSetSize_DyfE0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSize(100L);
assertEquals(100L, entry.getSize());
}
public void testSetSizeNegative_KRIO1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSize(-100L);
assertEquals(-100L, entry.getSize());
}
public void testSetSizeZero_GmJp2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSize(0L);
assertEquals(0L, entry.getSize());
}
public void testSetSizeMaxValue_CtUD3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSize(Long.MAX_VALUE);
assertEquals(Long.MAX_VALUE, entry.getSize());
}
public void testSetSizeMinValue_Jthy4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSize(Long.MIN_VALUE);
assertEquals(Long.MIN_VALUE, entry.getSize());
}
public void testSetSizeNull_HfQz5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getSize());
}
public void testSetSizeInvalid_OGFS6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getSize());
}
public void testSetSizeBlank_EzAg7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getSize());
}
public void testSetSizeWhitespace_UtRj8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getSize());
}
public void testSetSizeNonNumeric_SRYo9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getSize());
}
public void testGetUserId_hjVj0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
int uid = entry.getUserId();
assertEquals(0, uid);
}
public void testGetUserIdWithIno_FsHD1() {
}
public void testGetUserIdWithType_TJLm2() {
}
public void testGetUserIdWithInoAndType_uFCJ3() {
}
public void testGetUserIdWithNullName_HrMv4() {
DumpArchiveEntry entry = new DumpArchiveEntry(null, "simpleName");
int uid = entry.getUserId();
assertEquals(0, uid);
}
public void testGetUserIdWithNullSimpleName_pFPO5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", null);
int uid = entry.getUserId();
assertEquals(0, uid);
}
public void testGetUserIdWithNullNameAndSimpleName_aaAa6() {
DumpArchiveEntry entry = new DumpArchiveEntry(null, null);
int uid = entry.getUserId();
assertEquals(0, uid);
}
public void testGetUserIdWithEmptyName_QuFC7() {
DumpArchiveEntry entry = new DumpArchiveEntry("", "simpleName");
int uid = entry.getUserId();
assertEquals(0, uid);
}
public void testGetUserIdWithEmptySimpleName_XYdC8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "");
int uid = entry.getUserId();
assertEquals(0, uid);
}
public void testGetUserIdWithEmptyNameAndSimpleName_YpZF9() {
DumpArchiveEntry entry = new DumpArchiveEntry("", "");
int uid = entry.getUserId();
assertEquals(0, uid);
}
public void testSetGroupId_pdYL0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(1);
assertEquals(1, entry.getGroupId());
}
public void testSetGroupIdWithNegativeValue_ettb1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(-1);
assertEquals(-1, entry.getGroupId());
}
public void testSetGroupIdWithZeroValue_TgGC2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(0);
assertEquals(0, entry.getGroupId());
}
public void testSetGroupIdWithMaxValue_FTCp3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(Integer.MAX_VALUE);
assertEquals(Integer.MAX_VALUE, entry.getGroupId());
}
public void testSetGroupIdWithMinValue_yhuu4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(Integer.MIN_VALUE);
assertEquals(Integer.MIN_VALUE, entry.getGroupId());
}
public void testSetGroupIdWithInvalidValue_xdoM5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(Integer.MAX_VALUE + 1);
assertEquals(Integer.MAX_VALUE + 1, entry.getGroupId());
}
public void testSetGroupIdWithNullValue_SSVu6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getGroupId());
}
public void testSetGroupIdWithEmptyString_jCEf7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals("", entry.getGroupId());
}
public void testSetGroupIdWithInvalidString_VqsT8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals("invalid", entry.getGroupId());
}
public void testSetGroupIdWithValidString_wFyp9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals("123", entry.getGroupId());
}
public void testGetHeaderType_WHITEOUT_eHIW0() {
}
public void testGetHeaderType_SOCKET_qYiR1() {
}
public void testGetHeaderType_LINK_BNXZ2() {
}
public void testGetHeaderType_FILE_fhCR3() {
}
public void testGetHeaderType_BLKDEV_vbun4() {
}
public void testGetHeaderType_DIRECTORY_rCbO5() {
}
public void testGetHeaderType_CHRDEV_bZqn6() {
}
public void testGetHeaderType_FIFO_GwEa7() {
}
public void testGetHeaderType_UNKNOWN_chED8() {
}
public void testGetHeaderType_Null_TyPc9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 1, null);
}
public void testGetHeaderHoles_WHITEOUT_GShL0() {
}
public void testGetHeaderHoles_SOCKET_AYfK1() {
}
public void testGetHeaderHoles_LINK_Vfam2() {
}
public void testGetHeaderHoles_FILE_mXkG3() {
}
public void testGetHeaderHoles_BLKDEV_GqvL4() {
}
public void testGetHeaderHoles_DIRECTORY_UMqe5() {
}
public void testGetHeaderHoles_CHRDEV_XYof6() {
}
public void testGetHeaderHoles_FIFO_okVJ7() {
}
public void testGetHeaderHoles_UNKNOWN_QvUe8() {
}
public void testGetHeaderHoles_Null_BauU9() {
DumpArchiveEntry entry = new DumpArchiveEntry("null", "null", 10, null);
int holes = entry.getHeaderHoles();
assertEquals(10, holes);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObjectDifferentValues_cnSG2() {
    DumpArchiveEntry entry1 = new DumpArchiveEntry("name1", "simpleName1");
    DumpArchiveEntry entry2 = new DumpArchiveEntry("name2", "simpleName2");
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGeneration_Invalid_bVCb9() {
    DumpArchiveEntry entry = new DumpArchiveEntry("invalid", "invalid", -1, null);
    assertEquals(-1, entry.getGeneration());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupIdWithNullType_KmuQ7() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, null);
    assertEquals(123, entry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserIdWithNullEntry_OXKU11() {
    DumpArchiveEntry entry = null;
    entry.setUserId(1000);
    assertEquals(1000, entry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withSimpleName_kgDs1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals("simpleName".hashCode(), entry.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withName_aCKJ2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals("name".hashCode(), entry.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTimeWithNullType_dmMv5() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, null);
    Date accessTime = entry.getAccessTime();
    assertNull(accessTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithNullDate_Dgbh1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    Date mtime = null;
    entry.setLastModifiedDate(mtime);
    assertNull(entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithInvalidDate_CQwM2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    Date mtime = new Date(0);
    entry.setLastModifiedDate(mtime);
    assertNotEquals(mtime.getTime(), entry.getLastModifiedDate().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithPastDate_YGaV4() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    Date mtime = new Date(System.currentTimeMillis() - 1000000);
    entry.setLastModifiedDate(mtime);
    assertNotEquals(mtime.getTime(), entry.getLastModifiedDate().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithDateInTheFutureAndPast_dOAr7() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    Date mtime = new Date(System.currentTimeMillis() + 1000000);
    entry.setLastModifiedDate(mtime);
    assertEquals(mtime.getTime(), entry.getLastModifiedDate().getTime());
    mtime = new Date(System.currentTimeMillis() - 1000000);
    entry.setLastModifiedDate(mtime);
    assertNotEquals(mtime.getTime(), entry.getLastModifiedDate().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGeneration_Invalid_bVCb9_fid1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("invalid", "invalid",0, null);
    assertEquals(-1, entry.getGeneration());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupIdWithNullType_KmuQ7_fid1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName",0, null);
    assertEquals(123, entry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withSimpleName_kgDs1_fid1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals("simpleName".hashCode(), entry.getOriginalName().hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDateWithDateInTheFutureAndPast_dOAr7_2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    Date mtime = new Date(System.currentTimeMillis() + 1000000);
    entry.setLastModifiedDate(mtime);
    mtime = new Date(System.currentTimeMillis() - 1000000);
    entry.setLastModifiedDate(mtime);
    assertNotEquals(mtime.getTime(), entry.getLastModifiedDate().getTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithValidMode_TnuT2_UGXQ0_2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setMode(07777);
    assertEquals(07777, entry.getPermissions());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGeneration_Socket_IMev1_pciP1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("socket", "socket",0, DumpArchiveEntry.TYPE.SOCKET);
    assertEquals(2, entry.getGeneration());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithInvalidMode_ShTj1_iMLg0_2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setMode(0);
    assertEquals(0, entry.getPermissions());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGeneration_Socket_IMev1_pciP1_fid3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("socket", "socket", 2, DumpArchiveEntry.TYPE.SOCKET);
    assertEquals(2, entry.getGeneration());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOffsetWithNullValue_MnOy5_KhST0_fid3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setOffset(0L);
    assertNull(entry.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOffsetWithInvalidValue_hnZU6_xjQt0_fid3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setOffset(0);
    assertNull(entry.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOffsetWithNumericStringAndWhitespaceAndNonNumericStringAndNull_YhRo14_UmYL0_fid3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setOffset(100);
    assertNull(entry.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOffsetWithNumericStringAndNonNumericString_lAgk12_jIaj1_fid3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setOffset(100L);
    assertNull(entry.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntrySize_File_wOSf3_bWtR0_fid3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("file", "file");
    assertEquals(4, entry.getEntrySize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeletedEmptyString_DGet3_lVxN0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setDeleted(true);
    assertEquals("", entry.isDeleted());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeletedInteger_buBD5_gBXp0_fid3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setDeleted(true);
    assertEquals(123, entry.isDeleted());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDeletedFloat_aQKA6_dVSo0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setDeleted(true);
    assertEquals(123.456f, entry.isDeleted());
}
}