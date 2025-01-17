/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.apache.commons.io.file.attribute.FileTimes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SevenZArchiveEntry_Test_Failing {
private SevenZArchiveEntry sevenZArchiveEntry;
    private Iterable<? extends SevenZMethodConfiguration> contentMethods;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDate_XkFF0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsTime = 132165798510000000L; // Example NTFS time
    entry.setLastModifiedDate(ntfsTime);
    assertTrue(entry.getHasWindowsAttributes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_EFQH0() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = 13234123123L; // Example NTFS timestamp
    entry.setCreationDate(ntfsCreationDate);
    assertTrue(entry.getHasWindowsAttributes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedTimeWithNull_EhUU1_wJAP0_1() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    entry.setLastModifiedTime(null);
    assertNull(entry.getLastModifiedTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetContentMethods_InhF0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Iterable<? extends SevenZMethodConfiguration> methods = entry.getContentMethods();
    assertNotNull(methods);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLastModifiedDate_XkFF0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsTime = 132165798510000000L; // Example NTFS time
    entry.setLastModifiedDate(ntfsTime);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsTime), entry.getLastModifiedDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_hNFY0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    assertEquals("testFile.7z", entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreationDate_TZek0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    assertNull(entry.getCreationDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_KjOs0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date creationDate = new Date();
    entry.setCreationDate(creationDate);
    assertEquals(creationDate, entry.getCreationTime().toInstant());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessDate_jByc0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    Date accessDate = new Date();
    entry.setAccessDate(accessDate);
    assertEquals(accessDate, entry.getAccessTime().toMillis());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessDate_lmAS0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    assertNull(entry.getAccessDate());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreationDate_EFQH0_fid2() {
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    long ntfsCreationDate = 13234123123L; // Example NTFS timestamp
    entry.setCreationDate(ntfsCreationDate);
    assertEquals(FileTimes.ntfsTimeToFileTime(ntfsCreationDate), entry.getCreationDate());
}
}