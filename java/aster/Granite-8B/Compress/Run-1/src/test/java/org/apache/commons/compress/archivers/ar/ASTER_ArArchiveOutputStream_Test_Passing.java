/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import java.io.File;
import java.io.IOException;
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
public void testEquals_vctx0_1() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file1", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file2", 100);
    ArArchiveEntry entry3 = new ArArchiveEntry("file1", 100);
    assertEquals(entry1, entry3);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_vctx0_2() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file1", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file2", 100);
    ArArchiveEntry entry3 = new ArArchiveEntry("file1", 100);
    assertNotEquals(entry1, entry2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsDirectory_vUNc1() {
    ArArchiveEntry entry = new ArArchiveEntry("file", 100);
    assertFalse(entry.isDirectory());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModifiedDate_yYIh2() {
    ArArchiveEntry entry = new ArArchiveEntry("file", 100);
    Date date = entry.getLastModifiedDate();
    assertNotNull(date);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_jMlJ3() {
    ArArchiveEntry entry = new ArArchiveEntry("file", 100);
    int groupId = entry.getGroupId();
    assertEquals(0, groupId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize_GhvC4() {
    ArArchiveEntry entry = new ArArchiveEntry("file", 100);
    long size = entry.getSize();
    assertEquals(100, size);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_lkgu5() {
    ArArchiveEntry entry = new ArArchiveEntry("file", 100);
    int userId = entry.getUserId();
    assertEquals(0, userId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_zZTd6_1() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file1", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file2", 100);
    ArArchiveEntry entry3 = new ArArchiveEntry("file1", 100);
    assertEquals(entry1.hashCode(), entry3.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_zZTd6_2() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file1", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file2", 100);
    ArArchiveEntry entry3 = new ArArchiveEntry("file1", 100);
    assertNotEquals(entry1.hashCode(), entry2.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_tsHh7() {
    ArArchiveEntry entry = new ArArchiveEntry("file", 100);
    String name = entry.getName();
    assertEquals("file", name);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_TDCf8() {
    ArArchiveEntry entry = new ArArchiveEntry("file", 100);
    long length = entry.getLength();
    assertEquals(100, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntry_KWFN0() {
        ArArchiveOutputStream out = new ArArchiveOutputStream(System.out);
        ArArchiveEntry entry = new ArArchiveEntry("test.txt", 100);
        try {
            out.putArchiveEntry(entry);
            out.closeArchiveEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntry3_KuCJ2() {
        ArArchiveOutputStream out = new ArArchiveOutputStream(System.out);
        ArArchiveEntry entry = new ArArchiveEntry("test.txt", 100, 100, 100, 100, 100);
        try {
            out.putArchiveEntry(entry);
            out.closeArchiveEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutArchiveEntry4_bivi3() {
        ArArchiveOutputStream out = new ArArchiveOutputStream(System.out);
        ArArchiveEntry entry = new ArArchiveEntry(new File("test.txt"), "test.txt");
        try {
            out.putArchiveEntry(entry);
            out.closeArchiveEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void finish_FWRb0() throws IOException {
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_vctx0() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file1", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file2", 100);
    ArArchiveEntry entry3 = new ArArchiveEntry("file1", 100);
    assertEquals(entry1, entry3);
    assertNotEquals(entry1, entry2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_zZTd6() {
    ArArchiveEntry entry1 = new ArArchiveEntry("file1", 100);
    ArArchiveEntry entry2 = new ArArchiveEntry("file2", 100);
    ArArchiveEntry entry3 = new ArArchiveEntry("file1", 100);
    assertEquals(entry1.hashCode(), entry3.hashCode());
    assertNotEquals(entry1.hashCode(), entry2.hashCode());
}
}