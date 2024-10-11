/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLongFileMode_XweF0() {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        arArchiveOutputStream.setLongFileMode(0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry_BMYZ0_1() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals("name", arArchiveEntry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry_BMYZ0_2() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals(1L, arArchiveEntry.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry_BMYZ0_3() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals(0, arArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry_BMYZ0_4() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals(0, arArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry_BMYZ0_5() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals(0, arArchiveEntry.getMode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry_BMYZ0_6() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals(0L, arArchiveEntry.getLastModified());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry3_uRzm2_1() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L, 2, 3, 4, 5L);
        assertEquals("name", arArchiveEntry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry3_uRzm2_2() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L, 2, 3, 4, 5L);
        assertEquals(1L, arArchiveEntry.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry3_uRzm2_3() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L, 2, 3, 4, 5L);
        assertEquals(2, arArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry3_uRzm2_4() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L, 2, 3, 4, 5L);
        assertEquals(3, arArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry3_uRzm2_5() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L, 2, 3, 4, 5L);
        assertEquals(4, arArchiveEntry.getMode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry3_uRzm2_6() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L, 2, 3, 4, 5L);
        assertEquals(5L, arArchiveEntry.getLastModified());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry4_jPWJ3_1() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("inputFile"), "entryName");
        assertEquals("entryName", arArchiveEntry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry4_jPWJ3_2() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("inputFile"), "entryName");
        assertEquals(0L, arArchiveEntry.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry4_jPWJ3_3() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("inputFile"), "entryName");
        assertEquals(0, arArchiveEntry.getUserId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry4_jPWJ3_4() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("inputFile"), "entryName");
        assertEquals(0, arArchiveEntry.getGroupId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry4_jPWJ3_5() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("inputFile"), "entryName");
        assertEquals(0, arArchiveEntry.getMode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry4_jPWJ3_6() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("inputFile"), "entryName");
        assertEquals(0L, arArchiveEntry.getLastModified());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_mWeH4() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        ArArchiveEntry arArchiveEntry2 = new ArArchiveEntry("name", 1L);
        assertEquals(arArchiveEntry, arArchiveEntry2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsDirectory_zkMi5() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertFalse(arArchiveEntry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_uXoW6() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        Date lastModifiedDate = arArchiveEntry.getLastModifiedDate();
        assertNotNull(lastModifiedDate);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_Hxjk10() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals(0, arArchiveEntry.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_iePk12() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals(1L, arArchiveEntry.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_bRET4() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    boolean result = arArchiveEntry.equals(new Object());
    assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_CpHM5() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    boolean result = arArchiveEntry.isDirectory();
    assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate_bZAL6() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    Date result = arArchiveEntry.getLastModifiedDate();
    assertEquals(null, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_zfUu7() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    int result = arArchiveEntry.getGroupId();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize_hJxh8() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    long result = arArchiveEntry.getSize();
    assertEquals(1L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_iAOu9() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    int result = arArchiveEntry.getUserId();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_JwVZ10() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    int result = arArchiveEntry.hashCode();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_GBuu11() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    String result = arArchiveEntry.getName();
    assertEquals("name", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_mpzL12() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    long result = arArchiveEntry.getLength();
    assertEquals(1L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_AmtT13() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    int result = arArchiveEntry.getMode();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModified_quGC14() {
    ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
    long result = arArchiveEntry.getLastModified();
    assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateArchiveEntry5_kQxh4_Kyxb0() throws IOException {
        ArArchiveOutputStream arArchiveOutputStream = new ArArchiveOutputStream(null);
        Path inputPath = null;
        String entryName = "";
        ArArchiveEntry arArchiveEntry = arArchiveOutputStream.createArchiveEntry(inputPath, entryName);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry_BMYZ0() {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L);
        assertEquals("name", arArchiveEntry.getName());
        assertEquals(1L, arArchiveEntry.getSize());
        assertEquals(0, arArchiveEntry.getUserId());
        assertEquals(0, arArchiveEntry.getGroupId());
        assertEquals(0, arArchiveEntry.getMode());
        assertEquals(0L, arArchiveEntry.getLastModified());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry3_uRzm2() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry("name", 1L, 2, 3, 4, 5L);
        assertEquals("name", arArchiveEntry.getName());
        assertEquals(1L, arArchiveEntry.getSize());
        assertEquals(2, arArchiveEntry.getUserId());
        assertEquals(3, arArchiveEntry.getGroupId());
        assertEquals(4, arArchiveEntry.getMode());
        assertEquals(5L, arArchiveEntry.getLastModified());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArArchiveEntry4_jPWJ3() throws IOException {
        ArArchiveEntry arArchiveEntry = new ArArchiveEntry(new File("inputFile"), "entryName");
        assertEquals("entryName", arArchiveEntry.getName());
        assertEquals(0L, arArchiveEntry.getSize());
        assertEquals(0, arArchiveEntry.getUserId());
        assertEquals(0, arArchiveEntry.getGroupId());
        assertEquals(0, arArchiveEntry.getMode());
        assertEquals(0L, arArchiveEntry.getLastModified());
}
}