/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.dump;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DumpArchiveEntry_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModeWithExcessiveValue_yptt2() {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        entry.setMode(10000);
        assertEquals(4095, entry.getMode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNlink_Ebvs0() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.FILE);
        assertEquals(123, entry.getNlink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNlinkWithNegativeInodeNumber_cUTa2() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", -1, DumpArchiveEntry.TYPE.FILE);
        assertEquals(-1, entry.getNlink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGroupId_PZZX0() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.FILE);
        assertEquals(123, entry.getGroupId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithFileEntry_jJKt1() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.FILE);
        int mode = entry.getMode();
        assertEquals(33188, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithDirectoryEntry_IbDT2() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.DIRECTORY);
        int mode = entry.getMode();
        assertEquals(16877, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithLinkEntry_KDOf3() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.LINK);
        int mode = entry.getMode();
        assertEquals(41453, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithFifoEntry_aeqv4() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.FIFO);
        int mode = entry.getMode();
        assertEquals(4096, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithblkDevEntry_FmJG5() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.BLKDEV);
        int mode = entry.getMode();
        assertEquals(24576, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithChrDevEntry_sQeF6() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.CHRDEV);
        int mode = entry.getMode();
        assertEquals(8192, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModeWithSocketEntry_NBbE7() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.SOCKET);
        int mode = entry.getMode();
        assertEquals(49152, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderCount_dfEi0() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.FILE);
        assertEquals(1, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderCountWithLinkType_GMvj4() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.LINK);
        assertEquals(1, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderCountWithBlkDevType_tsfP6() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.BLKDEV);
        assertEquals(1, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderCountWithDirectoryType_mGtH7() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.DIRECTORY);
        assertEquals(1, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderCountWithChrDevType_GNtn8() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.CHRDEV);
        assertEquals(1, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderCountWithFifoType_zJxx9() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.FIFO);
        assertEquals(1, entry.getHeaderCount());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_qtuc0() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 123, DumpArchiveEntry.TYPE.FILE);
        int volume = entry.getVolume();
        assertEquals(123, volume);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolumeWithUnknownType_HyUz1() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName", 456, DumpArchiveEntry.TYPE.UNKNOWN);
        int volume = entry.getVolume();
        assertEquals(456, volume);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNlink_Ebvs0_fid2() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName",0, DumpArchiveEntry.TYPE.FILE);
        assertEquals(123, entry.getNlink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNlinkWithNegativeInodeNumber_cUTa2_fid2() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName",0, DumpArchiveEntry.TYPE.FILE);
        assertEquals(-1, entry.getNlink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGroupId_PZZX0_fid2() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName",0, DumpArchiveEntry.TYPE.FILE);
        assertEquals(123, entry.getGroupId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolume_qtuc0_fid2() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName",0, DumpArchiveEntry.TYPE.FILE);
        int volume = entry.getVolume();
        assertEquals(123, volume);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVolumeWithUnknownType_HyUz1_fid2() {
        DumpArchiveEntry entry = new DumpArchiveEntry("name", "simpleName",0, DumpArchiveEntry.TYPE.UNKNOWN);
        int volume = entry.getVolume();
        assertEquals(456, volume);
    }
}