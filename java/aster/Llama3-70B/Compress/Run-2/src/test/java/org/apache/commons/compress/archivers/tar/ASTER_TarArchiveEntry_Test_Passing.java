/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TarArchiveEntry_Test_Passing {
TarArchiveEntry tararchiveentry;
TarArchiveEntry sameTararchiveentry;
TarArchiveEntry differentTararchiveentry;
Object differentObject;
TarArchiveEntry descendentEntry;
TarArchiveEntry tararchiveentry2;
TarArchiveEntry tararchiveentry3;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBlockDevice_true_KBaF0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", TarArchiveEntry.LF_BLK);
    assertTrue(tarArchiveEntry.isBlockDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBlockDevice_false_iMzz1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isBlockDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFIFO_true_zSYo0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", TarArchiveEntry.LF_FIFO);
    assertTrue(tarArchiveEntry.isFIFO());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFIFO_false_CFTd1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isFIFO());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOldGNUSparse_false_SMgi1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isOldGNUSparse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGlobalPaxHeader_false_RKHj1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x01);
    assertFalse(tarArchiveEntry.isGlobalPaxHeader());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkFlag_tzqS0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte result = tarArchiveEntry.getLinkFlag();
    assertEquals((byte) 1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_aGBO0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    assertTrue(tarArchiveEntry.equals(tarArchiveEntry));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_YXIh1() {
    Object obj = new Object();
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    assertFalse(tarArchiveEntry.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentTarArchiveEntry_XxRm2() {
    TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("name1");
    TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry("name2");
    assertFalse(tarArchiveEntry1.equals(tarArchiveEntry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationTime_usId0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    FileTime time = FileTime.fromMillis(1000);
    tarArchiveEntry.setCreationTime(time);
    assertEquals(time, tarArchiveEntry.getCreationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGNULongNameEntry_false_WIIi1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x10);
    assertFalse(tarArchiveEntry.isGNULongNameEntry());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDevMajorValid_QDCz0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setDevMajor(10);
    assertEquals(10, tarArchiveEntry.getDevMajor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_false_iUjf1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetIds_Wvnj0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setIds(1, 1);
    assertEquals(1, tarArchiveEntry.getUserId());
    assertEquals(1, tarArchiveEntry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDataOffsetPositive_HfYR0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setDataOffset(10);
    assertEquals(10, tarArchiveEntry.getDataOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizePositive_Rtlb0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test");
    tarArchiveEntry.setSize(1024);
    assertEquals(1024, tarArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisDescendent() throws Exception{
        tararchiveentry = new TarArchiveEntry("parent");
        descendentEntry = new TarArchiveEntry("parent/child");
        assertTrue(tararchiveentry.isDescendent(descendentEntry));
        TarArchiveEntry nonDescendentEntry = new TarArchiveEntry("unrelated");
        assertFalse(tararchiveentry.isDescendent(nonDescendentEntry));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDescendent_Pcct0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    TarArchiveEntry desc = new TarArchiveEntry("name/desc");
    assertTrue(tarArchiveEntry.isDescendent(desc));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_FunZ0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    int result = tarArchiveEntry.hashCode();
    assertEquals("name".hashCode(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserName_UbDP0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setUserName("username");
    assertEquals("username", tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_EOYZ0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setUserId(123L);
    assertEquals(123L, tarArchiveEntry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGroupName_PAkt0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setGroupName("groupName");
    assertEquals("groupName", tarArchiveEntry.getGroupName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNames_Ftmb0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setNames("userName", "groupName");
    assertEquals("userName", tarArchiveEntry.getUserName());
    assertEquals("groupName", tarArchiveEntry.getGroupName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withLinkFlag_OLDNORM_ZzEZ1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x30);
    assertTrue(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withLinkFlag_NORMAL_yUki2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x00);
    assertTrue(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withNameEndingWithSlash_BXjQ4() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name/");
    assertFalse(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGNULongLinkEntry_false_EAYN1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isGNULongLinkEntry());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddPaxHeader_path_lpiV0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 1);
    tarArchiveEntry.addPaxHeader("path", "newPath");
    assertEquals("newPath", tarArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCharacterDevice_true_VbId0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", TarArchiveEntry.LF_CHR);
    assertTrue(tarArchiveEntry.isCharacterDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCharacterDevice_false_Yfaz1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isCharacterDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedTime_aQmI0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    FileTime time = FileTime.fromMillis(1000);
    tarArchiveEntry.setLastModifiedTime(time);
    assertEquals(time, tarArchiveEntry.getLastModifiedTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastAccessTime_DmmY0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    FileTime time = FileTime.fromMillis(1000);
    tarArchiveEntry.setLastAccessTime(time);
    assertEquals(time, tarArchiveEntry.getLastAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_withLinkFlag_LRce1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 5);
    assertFalse(tarArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_withNameEndingWithSlash_eVQn4() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name/");
    assertTrue(tarArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_withNameNotEndingWithSlash_FXUt5() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    assertFalse(tarArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymbolicLink_false_dzwU1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    assertFalse(tarArchiveEntry.isSymbolicLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPaxHeader2_dZDk1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 2);
    assertFalse(tarArchiveEntry.isPaxHeader());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDirectoryEntriesNullFile_ZyZn0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    TarArchiveEntry[] result = tarArchiveEntry.getDirectoryEntries();
    assertArrayEquals(new TarArchiveEntry[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDirectoryEntriesNotDirectory_tIyE1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    TarArchiveEntry[] result = tarArchiveEntry.getDirectoryEntries();
    assertArrayEquals(new TarArchiveEntry[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDevMinorPositive_StvR0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setDevMinor(10);
    assertEquals(10, tarArchiveEntry.getDevMinor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_SameName_vMMC1() {
    TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("name");
    TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry("name");
    assertTrue(tarArchiveEntry1.equals(tarArchiveEntry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_ZjCd0_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_aAmJ0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("");
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertEquals("", tarArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_oldStyle_sigh1_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test", (byte) 0);
    byte[] header = new byte[512];
    header[0] = 'u'; // set old style flag
    tarArchiveEntry.parseTarHeader(header);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_ulQK0_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGlobalPaxHeader_true_qWXw0_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x75);
    assertFalse(tarArchiveEntry.isGlobalPaxHeader());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGNULongNameEntry_true_SUbk0_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x20);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_true_BFUn0_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetIds_Wvnj0_1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setIds(1, 1);
    assertEquals(1, tarArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetIds_Wvnj0_2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setIds(1, 1);
    assertEquals(1, tarArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisDescendent_1() throws Exception{
        tararchiveentry = new TarArchiveEntry("parent");
        descendentEntry = new TarArchiveEntry("parent/child");
        TarArchiveEntry nonDescendentEntry = new TarArchiveEntry("unrelated");
        assertTrue(tararchiveentry.isDescendent(descendentEntry));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisDescendent_2() throws Exception{
        tararchiveentry = new TarArchiveEntry("parent");
        descendentEntry = new TarArchiveEntry("parent/child");
        TarArchiveEntry nonDescendentEntry = new TarArchiveEntry("unrelated");
        assertFalse(tararchiveentry.isDescendent(nonDescendentEntry));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNames_Ftmb0_1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setNames("userName", "groupName");
    assertEquals("userName", tarArchiveEntry.getUserName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNames_Ftmb0_2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setNames("userName", "groupName");
    assertEquals("groupName", tarArchiveEntry.getGroupName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withLinkFlag_DIR_LnuC3_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x40);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withNullFile_sUsa5_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClearExtraPaxHeaders_UCaH0_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.clearExtraPaxHeaders();
    assertNotNull(tarArchiveEntry.getExtraPaxHeaders());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymbolicLink_true_HpCZ0_fid1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 2);
}
@Test
    public void testSetDevMajorInvalid_ziZD1_xgQi0() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tarArchiveEntry.setDevMajor(-1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setDataOffset(long offset) {
    }
@Test
    public void testSetDataOffsetNegative_nalA1_eFQh1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tarArchiveEntry.setDataOffset(-10));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getMode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_4() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_5() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_6() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getLastModifiedDate());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_8() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getLinkFlag());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_9() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getLinkName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_10() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getUserName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_11() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getGroupName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_12() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getDevMajor());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_DqUj0_mBDO0_13() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getDevMinor());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPath_MLRh0_dhVC0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("path", (byte) 1);
    assertNotNull(tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testequals_b_1_Eclx0_1() throws Exception{
    TarArchiveEntry tararchiveentry = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry2 = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry3 = new TarArchiveEntry("differentName");
    assertTrue(tararchiveentry.equals(tararchiveentry));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testequals_b_1_Eclx0_2() throws Exception{
    TarArchiveEntry tararchiveentry = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry2 = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry3 = new TarArchiveEntry("differentName");
    assertTrue(tararchiveentry.equals(tararchiveentry2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testequals_b_1_Eclx0_3() throws Exception{
    TarArchiveEntry tararchiveentry = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry2 = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry3 = new TarArchiveEntry("differentName");
    assertFalse(tararchiveentry.equals(tararchiveentry3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testequals_b_1_Eclx0_4() throws Exception{
    TarArchiveEntry tararchiveentry = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry2 = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry3 = new TarArchiveEntry("differentName");
    assertFalse(tararchiveentry.equals(null));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testequals_b_1_Eclx0_5() throws Exception{
    TarArchiveEntry tararchiveentry = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry2 = new TarArchiveEntry("name");
    TarArchiveEntry tararchiveentry3 = new TarArchiveEntry("differentName");
    assertFalse(tararchiveentry.equals(new Object()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupName_JRMQ0_KwzO0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test");
    String userName = tarArchiveEntry.getUserName();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddPaxHeader_path_DsDv0_VzuS0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(new File("file"), "fileName");
    tarArchiveEntry.addPaxHeader("path", "newPath");
    assertEquals("newPath", tarArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFillGNUSparse1xData_3_iwNU2_VpFH0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    Map<String, String> headers = new HashMap<>();
    headers.put(TarGnuSparseKeys.REALSIZE, "100");
    try {
        tarArchiveEntry.fillGNUSparse1xData(headers);
        assertTrue(tarArchiveEntry.isPaxGNUSparse());
        assertTrue(tarArchiveEntry.isPaxGNU1XSparse());
        assertEquals("name", tarArchiveEntry.getName());
        assertEquals(100, tarArchiveEntry.getRealSize());
    } catch (IOException e) {
        fail("IOException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateEntryFromPaxHeaders1_Sskc0_tUoK0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    Map<String, String> headers = new HashMap<>();
    try {
        tarArchiveEntry.updateEntryFromPaxHeaders(headers);
    } catch (IOException e) {
        fail("IOException occurred");
    }
}
}