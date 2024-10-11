/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveEntry_Test_Passing {
private ArjArchiveEntry archiveEntry;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithSameObject_GQDm0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertTrue(entry.equals(entry));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_YPtO1() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertFalse(entry.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClass_hHOg2() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertFalse(entry.equals(new Object()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_WgIF0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        Date lastModifiedDate = entry.getLastModifiedDate();
        assertNotNull(lastModifiedDate);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_tJDT0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        long size = entry.getSize();
        assertEquals(0, size);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHostOs_GIqZ0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        int hostOs = entry.getHostOs();
        assertEquals(0, hostOs);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsHostOsUnix_RFUU0() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setUp_BXJc0() {
        archiveEntry = new ArjArchiveEntry();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObject_ZUaM3_fid2() {
        ArjArchiveEntry entry1 = new ArjArchiveEntry();
        ArjArchiveEntry entry2 = new ArjArchiveEntry();
        assertTrue(entry1.equals(entry2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsHostOsUnix_qdps0_fid2() {
        ArjArchiveEntry entry = new ArjArchiveEntry();
        assertFalse(entry.isHostOsUnix());
    }
}