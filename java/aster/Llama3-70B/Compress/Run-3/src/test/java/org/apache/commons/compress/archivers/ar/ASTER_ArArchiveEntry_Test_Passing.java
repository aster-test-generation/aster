/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_OVAR0() {
    ArArchiveEntry entry = new ArArchiveEntry("name", 10);
    assertTrue(entry.equals(entry));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_vSyB1() {
    Object obj = new Object();
    ArArchiveEntry entry = new ArArchiveEntry("name", 10);
    assertFalse(entry.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_dSfE2() {
    ArArchiveEntry entry = new ArArchiveEntry("name", 10);
    assertFalse(entry.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameName_CtVE3() {
    ArArchiveEntry entry1 = new ArArchiveEntry("name", 10);
    ArArchiveEntry entry2 = new ArArchiveEntry("name", 10);
    assertTrue(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentName_uLAQ4() {
    ArArchiveEntry entry1 = new ArArchiveEntry("name1", 10);
    ArArchiveEntry entry2 = new ArArchiveEntry("name2", 10);
    assertFalse(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullName_LFsi5() {
    ArArchiveEntry entry1 = new ArArchiveEntry(null, 10);
    ArArchiveEntry entry2 = new ArArchiveEntry(null, 10);
    assertTrue(entry1.equals(entry2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_geFM0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10);
    assertFalse(arArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory3_bGeM2() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10, 1, 2, 3, 4);
    assertFalse(arArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory4_poyo3() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("file"), "entryName");
    assertFalse(arArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate1_PnLg0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 100);
    Date date = arArchiveEntry.getLastModifiedDate();
    assertNotNull(date);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate3_kZsG2() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 100, 1, 1, 1, 1000);
    Date date = arArchiveEntry.getLastModifiedDate();
    assertEquals(new Date(1000), date);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate4_nhHn3() {
    File inputFile = new File("file");
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry(inputFile, "entryName");
    Date date = arArchiveEntry.getLastModifiedDate();
    assertNotNull(date);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId1_Dtts0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10L, 1, 2, 3, 4L);
    assertEquals(2, arArchiveEntry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId2_PcaZ1() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10L);
    assertEquals(0, arArchiveEntry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId3_BPNK2() {
    File inputFile = new File("inputFile");
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry(inputFile, "entryName");
    assertEquals(0, arArchiveEntry.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize1_wWCn0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10);
    assertEquals(10, arArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize3_auPa2() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10, 1, 2, 3, 4);
    assertEquals(10, arArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize4_QHBf3() {
    File inputFile = new File("file");
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry(inputFile, "entryName");
    assertEquals(arArchiveEntry.getLength(), arArchiveEntry.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_kymY0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 100, 1, 2, 3, 4);
    assertEquals(1, arArchiveEntry.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_Bnnq0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10L);
    int result = arArchiveEntry.hashCode();
    assertEquals(Objects.hash("name"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_3_OIQJ2() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10L, 1, 2, 3, 4L);
    int result = arArchiveEntry.hashCode();
    assertEquals(Objects.hash("name"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_4_KBku3() {
    File inputFile = new File("file");
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry(inputFile, "entryName");
    int result = arArchiveEntry.hashCode();
    assertEquals(Objects.hash("entryName"), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName1_PpdH0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("testName", 10);
    assertEquals("testName", arArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName3_gYRc2() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("testName", 10, 1, 1, 1, 10);
    assertEquals("testName", arArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName4_PgAN3() {
    File inputFile = new File("testFile");
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry(inputFile, "testEntryName");
    assertEquals("testEntryName", arArchiveEntry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength1_uLcP0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10);
    assertEquals(10, arArchiveEntry.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength3_ArhV2() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10, 1, 1, 1, 1);
    assertEquals(10, arArchiveEntry.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength4_zEkV3() {
    File inputFile = new File("file");
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry(inputFile, "entryName");
    assertEquals(0, arArchiveEntry.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_Ngmk0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 10L, 1, 1, 0644, 100L);
    assertEquals(0644, arArchiveEntry.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModified_ssRj0() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 100, 1, 1, 1, 1000);
    assertEquals(1000, arArchiveEntry.getLastModified());
}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName2_XuBr1_AhYP0() {
        Path inputPath = java.nio.file.Paths.get("testPath");
        ArArchiveEntry arArchiveEntry;
        try {
            arArchiveEntry = new ArArchiveEntry(inputPath, "testEntryName");
            assertEquals("testEntryName", arArchiveEntry.getName());
        } catch (IOException e) {
            fail();
        }
    }
}