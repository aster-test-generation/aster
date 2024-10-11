/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveEntry_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsSameObject_JYLX0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertEquals(true, entry.equals(entry));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsNull_wRNl1() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertEquals(false, entry.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentClass_ymNJ2() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        Object obj = new Object();
        assertEquals(false, entry.equals(obj));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDateUnix_QkTr0() {
        ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
        Date lastModifiedDate = arjArchiveEntry.getLastModifiedDate();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHostOs_vAfy0() {
        ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
        int expected = 0;
        int actual = arjArchiveEntry.getHostOs();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeNullName_xiUZ0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertEquals(0, entry.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUnixModeUnixOs_jHiB0() {
        ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
        boolean isHostOsUnix = true;
        int mode = arjArchiveEntry.getMode();
        int result = arjArchiveEntry.getUnixMode();
        assertEquals(mode, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUnixModeNonUnixOs_RhLB1() {
        ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
        boolean isHostOsUnix = false;
        int result = arjArchiveEntry.getUnixMode();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_lqsP0() {
        ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
        int expected = 0; // replace with your expected value
        int actual = arjArchiveEntry.getMethod();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_Yugs0() {
        ArjArchiveEntry arjArchiveEntry = new ArjArchiveEntry();
        int mode = arjArchiveEntry.getMode();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize_yVtQ0_DOXu0() {
    ArjArchiveEntry entry = new ArjArchiveEntry();
    int mode = entry.getMode();
    org.junit.Assert.assertEquals(0, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsDifferentObject_poWl3_fid2() {
        ArjArchiveEntry entry1 = new ArjArchiveEntry();
        ArjArchiveEntry entry2 = new ArjArchiveEntry();
        assertEquals(true, entry1.equals(entry2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithPathSym_JZwA0_fid2() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        String name = entry.getName();
    assertNull(name);
    }
}