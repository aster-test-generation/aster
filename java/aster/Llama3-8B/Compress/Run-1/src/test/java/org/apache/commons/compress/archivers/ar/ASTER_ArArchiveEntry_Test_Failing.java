/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveEntry_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate_AfJq0() {
        ArArchiveEntry entry = new ArArchiveEntry("test", 1000);
        Date result = entry.getLastModifiedDate();
        assertEquals(new Date(1000 * 1000), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLastModifiedDate2_olXt1() {
        ArArchiveEntry entry = new ArArchiveEntry(new File("test"), "test");
        Date result = entry.getLastModifiedDate();
        assertEquals(new Date(1000 * 1000), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_zBQM0() {
        ArArchiveEntry entry = new ArArchiveEntry("test", 10);
        assertEquals(101, entry.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode2_cbeN1() {
        ArArchiveEntry entry = new ArArchiveEntry("test", 10, 1, 2, 3, 4);
        assertEquals(101, entry.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode3_SWRj2() {
        ArArchiveEntry entry = new ArArchiveEntry(new File("test"), "test");
        assertEquals(101, entry.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLastModified_NDOr0() {
    ArArchiveEntry entry = new ArArchiveEntry("test", 100);
    assertEquals(0, entry.getLastModified());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode2_lnXl1() {
        ArArchiveEntry entry = new ArArchiveEntry("name", 10);
        assertEquals(0, entry.getMode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize2_BPCK1_OXwk1_fid2() throws IOException {
    ArArchiveEntry entry = new ArArchiveEntry(new File("path"), "entryName");
    assertEquals(0, entry.getMode());
}
}