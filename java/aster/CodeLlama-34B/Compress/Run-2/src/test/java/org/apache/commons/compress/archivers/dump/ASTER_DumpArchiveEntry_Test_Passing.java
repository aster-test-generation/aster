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
public class Aster_DumpArchiveEntry_Test_Passing {
public void testSetCreationTime_BTPl0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithNull_rSPu1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = null;
entry.setCreationTime(ctime);
assertNull(entry.getCreationTime());
}
public void testSetCreationTimeWithInvalidType_XdxC2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidName_IQIO3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidSimpleName_cgMh4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidIno_XePo5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidTypeAndName_UTDb6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidTypeAndSimpleName_FnIO7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidTypeAndIno_yZWf8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetCreationTimeWithInvalidNameAndSimpleName_UoYW9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
Date ctime = new Date();
entry.setCreationTime(ctime);
assertNotEquals(ctime.getTime(), entry.getCreationTime().getTime());
}
public void testSetVolume_wbxK0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setVolume(1);
assertEquals(1, entry.getVolume());
}
public void testSetVolumeWithNegativeValue_LINv1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setVolume(-1);
assertEquals(-1, entry.getVolume());
}
public void testSetVolumeWithZeroValue_FLoA2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setVolume(0);
assertEquals(0, entry.getVolume());
}
public void testSetVolumeWithLargeValue_kAPL3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setVolume(Integer.MAX_VALUE);
assertEquals(Integer.MAX_VALUE, entry.getVolume());
}
public void testSetVolumeWithInvalidValue_pqrH4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getVolume());
}
public void testSetVolumeWithNullValue_DmmE5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getVolume());
}
public void testSetVolumeWithEmptyString_XevT6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getVolume());
}
public void testSetVolumeWithWhitespaceString_ACRs7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getVolume());
}
public void testSetVolumeWithNonNumericString_rKfc8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(0, entry.getVolume());
}
public void testSetVolumeWithNumericString_BCEB9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(123, entry.getVolume());
}
public void testSetSimpleName_uZXd0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("newSimpleName");
assertEquals("newSimpleName", entry.getSimpleName());
}
public void testSetSimpleNameWithNull_OvIP1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName(null);
assertEquals(null, entry.getSimpleName());
}
public void testSetSimpleNameWithEmptyString_AvOl2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("");
assertEquals("", entry.getSimpleName());
}
public void testSetSimpleNameWithSameValue_KEsV3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("simpleName");
assertEquals("simpleName", entry.getSimpleName());
}
public void testSetSimpleNameWithDifferentValue_BuDN4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("newSimpleName");
assertEquals("newSimpleName", entry.getSimpleName());
}
public void testSetSimpleNameWithConstructor_Onio5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("newSimpleName");
assertEquals("newSimpleName", entry.getSimpleName());
}
public void testSetSimpleNameWithProtectedConstructor_UhHS6() {
}
public void testSetSimpleNameWithPrivateConstructor_TxMN7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("newSimpleName");
assertEquals("newSimpleName", entry.getSimpleName());
}
public void testSetSimpleNameWithFinalConstructor_ZgYA8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("newSimpleName");
assertEquals("newSimpleName", entry.getSimpleName());
}
public void testSetSimpleNameWithStaticConstructor_Buua9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setSimpleName("newSimpleName");
assertEquals("newSimpleName", entry.getSimpleName());
}
public void testSetTypeWhiteout_RCNi0() {
}
public void testSetTypeSocket_xrpz1() {
}
public void testSetTypeLink_HLLx2() {
}
public void testSetTypeFile_UIxS3() {
}
public void testSetTypeBlkdev_TwZl4() {
}
public void testSetTypeChrdev_lDLJ5() {
}
public void testSetTypeFifo_yqJB6() {
}
public void testSetTypeUnknown_leyg7() {
}
public void testSetTypeNull_TkFZ8() {
}
public void testSetTypeInvalid_tNMw9() {
}
public void testSetGeneration_nffa0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(1);
assertEquals(1, entry.getGeneration());
}
public void testSetGenerationWithNegativeValue_PPtI1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(-1);
assertEquals(-1, entry.getGeneration());
}
public void testSetGenerationWithZeroValue_LYbH2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(0);
assertEquals(0, entry.getGeneration());
}
public void testSetGenerationWithMaxValue_bWaF3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(Integer.MAX_VALUE);
assertEquals(Integer.MAX_VALUE, entry.getGeneration());
}
public void testSetGenerationWithMinValue_ETME4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(Integer.MIN_VALUE);
assertEquals(Integer.MIN_VALUE, entry.getGeneration());
}
public void testSetGenerationWithNullName_HAlv5() {
DumpArchiveEntry entry = new DumpArchiveEntry(null, "simpleName");
entry.setGeneration(1);
assertEquals(1, entry.getGeneration());
}
public void testSetGenerationWithEmptyName_jFIC6() {
DumpArchiveEntry entry = new DumpArchiveEntry("", "simpleName");
entry.setGeneration(1);
assertEquals(1, entry.getGeneration());
}
public void testSetGenerationWithNullSimpleName_BkYR7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", null);
entry.setGeneration(1);
assertEquals(1, entry.getGeneration());
}
public void testSetGenerationWithEmptySimpleName_yePW8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "");
entry.setGeneration(1);
assertEquals(1, entry.getGeneration());
}
public void testSetGenerationWithInvalidType_sOxm9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGeneration(1);
assertEquals(1, entry.getGeneration());
}
public void testGetUserId_jDUN0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
int actual = entry.getUserId();
assertEquals(0, actual);
}
public void testGetUserIdWithIno_JQcj1() {
}
public void testGetUserIdWithType_Immj2() {
}
public void testGetUserIdWithName_OomE3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
int actual = entry.getUserId();
assertEquals(0, actual);
}
public void testGetUserIdWithSimpleName_nbxY4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
int actual = entry.getUserId();
assertEquals(0, actual);
}
public void testGetUserIdWithInoAndType_xGZL5() {
}
public void testGetUserIdWithInoAndName_iqjV6() {
}
public void testGetUserIdWithInoAndSimpleName_RbFh7() {
}
public void testGetUserIdWithTypeAndName_Wbem8() {
}
public void testGetUserIdWithTypeAndSimpleName_tjwQ9() {
}
public void testSetGroupId_SbGF0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(1000);
assertEquals(1000, entry.getGroupId());
}
public void testSetGroupIdNegative_jKRn1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(-1);
assertEquals(-1, entry.getGroupId());
}
public void testSetGroupIdZero_Hgwa2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(0);
assertEquals(0, entry.getGroupId());
}
public void testSetGroupIdMaxValue_CcYS3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(Integer.MAX_VALUE);
assertEquals(Integer.MAX_VALUE, entry.getGroupId());
}
public void testSetGroupIdMinValue_uCzI4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setGroupId(Integer.MIN_VALUE);
assertEquals(Integer.MIN_VALUE, entry.getGroupId());
}
public void testSetGroupIdNull_ERQL5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getGroupId());
}
public void testSetGroupIdInvalid_sEdw6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getGroupId());
}
public void testSetGroupIdEmpty_BXqA7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getGroupId());
}
public void testSetGroupIdBlank_EUpA8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getGroupId());
}
public void testSetGroupIdInvalidType_rxtm9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.getGroupId());
}
public void testSetDeletedTrue_agrJ0() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setDeleted(true);
assertTrue(entry.isDeleted());
}
public void testSetDeletedFalse_fEuH1() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
entry.setDeleted(false);
assertFalse(entry.isDeleted());
}
public void testSetDeletedNull_kvLI2() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertNull(entry.isDeleted());
}
public void testSetDeletedEmptyString_IXAo3() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals("", entry.isDeleted());
}
public void testSetDeletedNonEmptyString_fHKi4() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals("nonEmptyString", entry.isDeleted());
}
public void testSetDeletedInteger_jmfo5() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(123, entry.isDeleted());
}
public void testSetDeletedFloat_fvuo6() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(123.456f, entry.isDeleted());
}
public void testSetDeletedDouble_snqv7() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(123.456d, entry.isDeleted());
}
public void testSetDeletedChar_kxiv8() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals('a', entry.isDeleted());
}
public void testSetDeletedObject_mTPE9() {
DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
assertEquals(new Object(), entry.isDeleted());
}
public void testGetHeaderType_WHITEOUT_rOGa0() {
}
public void testGetHeaderType_SOCKET_ipUq1() {
}
public void testGetHeaderType_LINK_smlP2() {
}
public void testGetHeaderType_FILE_YZBO3() {
}
public void testGetHeaderType_BLKDEV_YcUB4() {
}
public void testGetHeaderType_DIRECTORY_SJey5() {
}
public void testGetHeaderType_CHRDEV_YdGX6() {
}
public void testGetHeaderType_FIFO_sKLu7() {
}
public void testGetHeaderType_UNKNOWN_VbHL8() {
}
public void testGetHeaderType_Null_KPHD9() {
DumpArchiveEntry entry = new DumpArchiveEntry("test", "test", 1, null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffset_swLe0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    assertEquals(0, entry.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOffsetWithSimpleName_XgHC2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "simple");
    assertEquals(0, entry.getOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_jpIi0() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date();
dumpArchiveEntry.setAccessTime(atime);
assertEquals(atime.getTime(), dumpArchiveEntry.getAccessTime().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithNull_prVd1() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = null;
dumpArchiveEntry.setAccessTime(atime);
assertNull(dumpArchiveEntry.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithInvalidDate_YBCU2() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(0);
dumpArchiveEntry.setAccessTime(atime);
assertNotEquals(atime.getTime(), dumpArchiveEntry.getAccessTime().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithValidDate_nXDJ3() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(1000);
dumpArchiveEntry.setAccessTime(atime);
assertEquals(atime.getTime(), dumpArchiveEntry.getAccessTime().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithFutureDate_uUEN4() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() + 1000);
dumpArchiveEntry.setAccessTime(atime);
assertNotEquals(atime.getTime(), dumpArchiveEntry.getAccessTime().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithPastDate_nktR5() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(System.currentTimeMillis() - 1000);
dumpArchiveEntry.setAccessTime(atime);
assertNotEquals(atime.getTime(), dumpArchiveEntry.getAccessTime().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithMaxDate_aCld6() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(Long.MAX_VALUE);
dumpArchiveEntry.setAccessTime(atime);
assertNotEquals(atime.getTime(), dumpArchiveEntry.getAccessTime().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithMinDate_tkox7() {
DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
Date atime = new Date(Long.MIN_VALUE);
dumpArchiveEntry.setAccessTime(atime);
assertNotEquals(atime.getTime(), dumpArchiveEntry.getAccessTime().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMode_fHhd0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setMode(07777);
    assertEquals(07777, entry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModeWithInvalidMode_MBRJ2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    try {
        entry.setMode(0);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDeleted_Null_jDYt9() {
    DumpArchiveEntry entry = new DumpArchiveEntry(null, null, 10, null);
    assertFalse(entry.isDeleted());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_aMbJ0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertTrue(entry.equals(entry));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObjectSameValues_adhz1() {
    DumpArchiveEntry entry1 = new DumpArchiveEntry("name", "simpleName");
    DumpArchiveEntry entry2 = new DumpArchiveEntry("name", "simpleName");
    assertTrue(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObjectDifferentValues_NWKv2() {
    DumpArchiveEntry entry1 = new DumpArchiveEntry("name1", "simpleName1");
    DumpArchiveEntry entry2 = new DumpArchiveEntry("name2", "simpleName2");
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_CnHS3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertFalse(entry.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_DHKx4() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    Object obj = new Object();
    assertFalse(entry.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_NullObject_ACiA2() {
    DumpArchiveEntry entry = null;
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_NullType_AfmV3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("directory", "directory", 1, null);
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString1_zjPi0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals("name", entry.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOffset_idds0() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
        entry.setOffset(100L);
        assertEquals(100L, entry.getOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleName_fDoz0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertEquals("simpleName", entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleNameWithDifferentNames_gyNK1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    assertNotEquals("differentSimpleName", entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleNameWithNullName_JKoN2() {
    DumpArchiveEntry entry = new DumpArchiveEntry(null, "simpleName");
    assertNull(entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleNameWithEmptyName_ECPG3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("", "simpleName");
    assertEquals("", entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleNameWithInvalidName_OLkT5() {
    DumpArchiveEntry entry = new DumpArchiveEntry("invalidName", "simpleName");
    assertNotEquals("invalidName", entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleNameWithNullSimpleName_KOHH6() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", null);
    assertNull(entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleNameWithEmptySimpleName_ssrr7() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "");
    assertEquals("", entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSimpleNameWithInvalidSimpleName_qGRl9() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "invalidSimpleName");
    assertNotEquals("invalidSimpleName", entry.getSimpleName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_wJam0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    assertEquals(0, entry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupIdWithSimpleName_SZPg2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "simple");
    assertEquals(0, entry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithNull_PyDq0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setName(null);
    assertEquals(null, entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithEmptyString_QMnO1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setName("");
    assertEquals("", entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNameWithNonEmptyString_gkqc2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setName("newName");
    assertEquals("newName", entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSize_ARKW0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setSize(100L);
    assertEquals(100L, entry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizeNegative_aprB1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setSize(-100L);
    assertEquals(-100L, entry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizeZero_Eulj2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setSize(0L);
    assertEquals(0L, entry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNlink_nppg0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setNlink(1);
    assertEquals(1, entry.getNlink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNlinkWithInvalidValue_lbDh1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    try {
        entry.setNlink(0);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid nlink value: 0", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNlinkWithNegativeValue_LYfM2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    try {
        entry.setNlink(-1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid nlink value: -1", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNlinkWithMaxValue_SyJm3() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setNlink(Integer.MAX_VALUE);
    assertEquals(Integer.MAX_VALUE, entry.getNlink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNlinkWithMinValue_PjBT4() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    entry.setNlink(Integer.MIN_VALUE);
    assertEquals(Integer.MIN_VALUE, entry.getNlink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNullType_uXTR5() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, null);
    assertEquals(123, entry.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_DnQW0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setUserId(123);
    assertEquals(123, entry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserIdWithNegativeValue_XlnR1() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setUserId(-123);
    assertEquals(-123, entry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserIdWithZeroValue_InaD2() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    entry.setUserId(0);
    assertEquals(0, entry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderCount1_xMMk0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    int count = entry.getHeaderCount();
    assertEquals(1, count);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDate_gvYx0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("test", "test");
    Date mtime = new Date();
    entry.setLastModifiedDate(mtime);
    assertEquals(mtime.getTime(), entry.getLastModifiedDate().getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderHoles_Null_SUhY8() {
    DumpArchiveEntry entry = new DumpArchiveEntry(null, null, 0, null);
    assertEquals(0, entry.getHeaderHoles());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderHoles_Empty_YoZI9() {
    DumpArchiveEntry entry = new DumpArchiveEntry("", "", 0, null);
    assertEquals(0, entry.getHeaderHoles());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTime_nJeZ0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    Date accessTime = entry.getAccessTime();
    assertNotNull(accessTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTimeWithInvalidDateString_KKxG8_qKAA0() {
    DumpArchiveEntry dumpArchiveEntry = new DumpArchiveEntry("name", "simpleName");
    String atime = "invalid date";
    dumpArchiveEntry.setAccessTime(new Date(atime));
    assertNull(dumpArchiveEntry.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNlinkWithNull_aGyw5_Visd0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    try {
        entry.setNlink(0);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("nlink cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderCount10_jJBb9_BuSr0() {
    DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName");
    int count = entry.getHeaderCount();
    assertEquals(2, count);
}
}