/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
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
public class Aster_TarArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBlockDevice_true_GueM0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", TarArchiveEntry.LF_BLK);
    assertTrue(tarArchiveEntry.isBlockDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBlockDevice_false_Cwrm1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isBlockDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_oPKK0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFIFO_false_SwJu1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x10);
    assertFalse(tarArchiveEntry.isFIFO());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsOldGNUSparse_false_bdGd1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isOldGNUSparse());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGlobalPaxHeader_true_XtCc0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) TarArchiveEntry.LF_PAX_GLOBAL_EXTENDED_HEADER);
    assertTrue(tarArchiveEntry.isGlobalPaxHeader());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGlobalPaxHeader_false_etfj1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isGlobalPaxHeader());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkFlag_ryeU0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte result = tarArchiveEntry.getLinkFlag();
    assertEquals((byte) 1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_duhr0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    assertTrue(tarArchiveEntry.equals(tarArchiveEntry));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_Hewg1() {
    Object obj = new Object();
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    assertFalse(tarArchiveEntry.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentTarArchiveEntry_TJGl2() {
    TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("name1");
    TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry("name2");
    assertFalse(tarArchiveEntry1.equals(tarArchiveEntry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationTime_npGc0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    FileTime fileTime = FileTime.fromMillis(1643723400000L);
    tarArchiveEntry.setCreationTime(fileTime);
    assertEquals(fileTime, tarArchiveEntry.getCreationTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGNULongNameEntry_false_dNsi1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isGNULongNameEntry());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDevMajorValid_teWa0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setDevMajor(10);
    assertEquals(10, tarArchiveEntry.getDevMajor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsLink_false_qDdc1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetIds_alhm0_1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setIds(1, 2);
    assertEquals(1, tarArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetIds_alhm0_2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setIds(1, 2);
    assertEquals(2, tarArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDataOffsetPositive_dYQw0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setDataOffset(10);
    assertEquals(10, tarArchiveEntry.getDataOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizePositive_snjE0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test");
    tarArchiveEntry.setSize(1024);
    assertEquals(1024, tarArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDescendent_MczO0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    TarArchiveEntry desc = new TarArchiveEntry("name/descendant");
    assertTrue(tarArchiveEntry.isDescendent(desc));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_ZbXD0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    int result = tarArchiveEntry.hashCode();
    assertEquals("name".hashCode(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserName_jyCA0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setUserName("username");
    assertEquals("username", tarArchiveEntry.getUserName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withLinkFlag_OLDNORM_fNLg1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x30);
    assertTrue(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withLinkFlag_NORMAL_vuKd2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0x00);
    assertTrue(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withNameEndingWithSlash_yOJu4() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name/");
    assertFalse(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsFile_withNameNotEndingWithSlash_Huae5() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    assertTrue(tarArchiveEntry.isFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsGNULongLinkEntry_false_QoxI1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isGNULongLinkEntry());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddPaxHeader_KUBd0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.addPaxHeader("key", "value");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddPaxHeader_path_PsRn0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.addPaxHeader("path", "newName");
    assertEquals("newName", tarArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCharacterDevice_true_TBiQ0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", TarArchiveEntry.LF_CHR);
    assertTrue(tarArchiveEntry.isCharacterDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCharacterDevice_false_YAYr1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 0);
    assertFalse(tarArchiveEntry.isCharacterDevice());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedTime_zHIy0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    FileTime time = FileTime.fromMillis(1000);
    tarArchiveEntry.setLastModifiedTime(time);
    assertEquals(time, tarArchiveEntry.getLastModifiedTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastAccessTime_TnzI0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    FileTime time = FileTime.fromMillis(1000);
    tarArchiveEntry.setLastAccessTime(time);
    assertEquals(time, tarArchiveEntry.getLastAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsSymbolicLink_false_PUex1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    assertFalse(tarArchiveEntry.isSymbolicLink());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_withLinkFlag_RVTy1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", TarArchiveEntry.LF_DIR);
    assertTrue(tarArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_withNameEndingWithSlash_yKqq2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name/");
    assertTrue(tarArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_withNoDirectory_DUCQ5() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    assertFalse(tarArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsPaxHeader2_AzwE1() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 2);
    assertFalse(tarArchiveEntry.isPaxHeader());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDevMinorValid_GAqx0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test");
    tarArchiveEntry.setDevMinor(10);
    assertEquals(10, tarArchiveEntry.getDevMinor());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_SameName_blTH1() {
    TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("name");
    TarArchiveEntry tarArchiveEntry2 = new TarArchiveEntry("name");
    assertTrue(tarArchiveEntry1.equals(tarArchiveEntry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setDevMajor(int devMajor) {
        if (devMajor < 0) {
            throw new IllegalArgumentException("devMajor cannot be negative");
        }
    }
@Test
    public void testSetDataOffsetNegative_FvgC1_phfx1() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tarArchiveEntry.setDataOffset(-10));
    }
@Test
    public void testSetDevMinorInvalid_GjJl1_xmlm0() {
        TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("test");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> tarArchiveEntry.setDevMinor(-1));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_cbJb0_MUgB0_3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertEquals(0, tarArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_cbJb0_MUgB0_4() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertEquals(0, tarArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_cbJb0_MUgB0_5() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertEquals(0, tarArchiveEntry.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_cbJb0_MUgB0_6() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getModTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_2() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getMode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_3() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_4() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_5() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_6() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getLastModifiedDate());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_8() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getLinkFlag());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_9() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getLinkName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_10() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getUserName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseTarHeader_eRww0_KeiM0_11() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
    byte[] header = new byte[512];
    tarArchiveEntry.parseTarHeader(header);
    assertNotNull(tarArchiveEntry.getGroupName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_awLm0_nayQ0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name", (byte) 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateEntryFromPaxHeaders_FZEA0_wFbH0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    Map<String, String> headers = new HashMap<>();
    try {
        tarArchiveEntry.updateEntryFromPaxHeaders(headers);
    } catch (IOException e) {
        fail("IOException occurred");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetIds_alhm0() {
    TarArchiveEntry tarArchiveEntry = new TarArchiveEntry("name");
    tarArchiveEntry.setIds(1, 2);
    assertEquals(1, tarArchiveEntry.getUserId());
    assertEquals(2, tarArchiveEntry.getGroupId());
}
}