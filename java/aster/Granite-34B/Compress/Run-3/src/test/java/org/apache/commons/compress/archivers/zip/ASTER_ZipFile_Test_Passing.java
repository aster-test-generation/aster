/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Enumeration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ZipFile_Test_Passing {
private static byte[] ONE_ZERO_BYTE = new byte[1];
ZipFile zipfile;
private ZipEncoding zipEncoding;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinalize_WikR0() throws Throwable {
        ZipFile zipFile = new ZipFile("example.zip");
        zipFile.finalize();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetInputStream() throws Exception{
        zipfile = mock(ZipFile.class);
        when(zipfile.getInputStream(any(ZipArchiveEntry.class))).thenReturn(new ByteArrayInputStream(ONE_ZERO_BYTE));
        InputStream result = zipfile.getInputStream(new ZipArchiveEntry());
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcanReadEntryData() throws Exception{
        zipfile = mock(ZipFile.class);
        ZipArchiveEntry entry = mock(ZipArchiveEntry.class);
        when(zipfile.canReadEntryData(entry)).thenReturn(true);
        assertTrue(zipfile.canReadEntryData(entry));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_cmmN1() throws IOException {
        ZipFile zipFile = new ZipFile("name");
        Iterable<ZipArchiveEntry> entries = zipFile.getEntries("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetUnixSymlink() throws Exception{
        zipfile = mock(ZipFile.class);
        zipEncoding = mock(ZipEncoding.class);
        when(zipfile.getUnixSymlink(any(ZipArchiveEntry.class))).thenReturn("test");
        assertEquals("test", zipfile.getUnixSymlink(any(ZipArchiveEntry.class)));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_vTJD0() throws IOException {
        ZipFile zipFile = new ZipFile(new File("test.zip"));
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        while (entries.hasMoreElements()) {
            ZipArchiveEntry entry = entries.nextElement();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseQuietly_yXUO0() {
        ZipFile zipFile = null;
        try {
            zipFile = new ZipFile("test.zip");
        } catch (IOException e) {
            fail("Failed to create ZipFile: " + e.getMessage());
        } finally {
            ZipFile.closeQuietly(zipFile);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCloseQuietlyWithNullArgument_LRNk1() {
        ZipFile.closeQuietly(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getEntriesInPhysicalOrder_test1_xXZm0() throws IOException {
    ZipFile zipFile = new ZipFile(new File("test.zip"));
    Enumeration<ZipArchiveEntry> entries = zipFile.getEntriesInPhysicalOrder();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcopyRawEntries() throws Exception{
        zipfile = mock(ZipFile.class);
        ZipArchiveOutputStream target = mock(ZipArchiveOutputStream.class);
        ZipArchiveEntryPredicate predicate = mock(ZipArchiveEntryPredicate.class);
        zipfile.copyRawEntries(target, predicate);
        verify(zipfile, times(1)).copyRawEntries(target, predicate);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getRawInputStreamTest3_pzFt2_IKKp0() throws IOException {
    ZipArchiveEntry entry = new ZipArchiveEntry("testfile");
    entry.setLocalHeaderOffset(100);
    entry.setCompressedSize(1000);
    ZipFile zipFile = new ZipFile(new File("testfile"));
    InputStream inputStream = zipFile.getRawInputStream(entry);
    assertEquals(1000, inputStream.skip(1000));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
        public void close_sxJk1() throws IOException {
        }
}