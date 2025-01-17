/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.util.Enumeration;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Enumeration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipFile_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_GEhy0() throws IOException {
        ZipFile zipFile = new ZipFile(new File("test.zip"), "UTF-8", true, true);
        String encoding = zipFile.getEncoding();
        assert encoding.equals("UTF-8");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getContentBeforeFirstLocalFileHeaderTest1_tQtQ0() throws IOException {
    ZipFile zipFile = new ZipFile(new File("test.zip"));
    InputStream inputStream = zipFile.getContentBeforeFirstLocalFileHeader();
    assertNotNull(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getContentBeforeFirstLocalFileHeaderTest2_aHis1() throws IOException {
    ZipFile zipFile = new ZipFile(new File("test.zip"));
    InputStream inputStream = zipFile.getContentBeforeFirstLocalFileHeader();
    assertEquals(0, inputStream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFirstLocalFileHeaderOffsetWithFile_siEQ1() {
        try {
            File file = new File("test.zip");
            ZipFile zipFile = new ZipFile(file);
            long offset = zipFile.getFirstLocalFileHeaderOffset();
            assertEquals(0, offset);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFirstLocalFileHeaderOffsetWithChannel_OyiE3() {
        try {
            SeekableByteChannel channel = null;
            ZipFile zipFile = new ZipFile(channel, null);
            long offset = zipFile.getFirstLocalFileHeaderOffset();
            assertEquals(0, offset);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getEntriesTest5_BSbf4() throws IOException {
        ZipFile zipFile = new ZipFile("name", "encoding");
        Iterable<ZipArchiveEntry> entries = zipFile.getEntries("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getEntriesTest6_KUWE5() throws IOException {
        ZipFile zipFile = new ZipFile("name");
        Iterable<ZipArchiveEntry> entries = zipFile.getEntries("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getEntriesTest8_wfJe7() throws IOException {
        ZipFile zipFile = new ZipFile(File.createTempFile("temp", ".tmp"), "encoding", true, true);
        Iterable<ZipArchiveEntry> entries = zipFile.getEntries("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getEntriesTest9_TlPQ8() throws IOException {
        ZipFile zipFile = new ZipFile(File.createTempFile("temp", ".tmp"), "encoding", true);
        Iterable<ZipArchiveEntry> entries = zipFile.getEntries("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getEntriesTest10_KRoQ9() throws IOException {
        ZipFile zipFile = new ZipFile(File.createTempFile("temp", ".tmp"), "encoding");
        Iterable<ZipArchiveEntry> entries = zipFile.getEntries("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getEntriesTest11_aObi10() throws IOException {
        ZipFile zipFile = new ZipFile(File.createTempFile("temp", ".tmp"));
        Iterable<ZipArchiveEntry> entries = zipFile.getEntries("name");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testZipFileWithPathEncodingAndUseUnicodeExtraFields_lIoe1() throws IOException {
        Path path = null; // Initialize with actual value
        String encoding = null; // Initialize with actual value
        boolean useUnicodeExtraFields = false; // Initialize with actual value
        ZipFile zipFile = new ZipFile(path, encoding, useUnicodeExtraFields);
        assertNotNull(zipFile);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getRawInputStreamTest1_guQB0() throws IOException {
    ZipArchiveEntry entry = new ZipArchiveEntry("testfile");
    entry.setDataOffset(0L);
    entry.setCompressedSize(100L);
    ZipFile zipFile = new ZipFile(new File("test.zip"));
    InputStream inputStream = zipFile.getRawInputStream(entry);
    assertNotNull(inputStream);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getRawInputStreamTest2_xVMZ1() throws IOException {
    ZipArchiveEntry entry = new ZipArchiveEntry("testfile");
    entry.setDataOffset(0L);
    entry.setCompressedSize(100L);
    ZipFile zipFile = new ZipFile(new File("test.zip"));
    InputStream inputStream = zipFile.getRawInputStream(entry);
    assertEquals(100, inputStream.available());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getRawInputStreamTest3_CJyw2() throws IOException {
    ZipArchiveEntry entry = new ZipArchiveEntry("testfile");
    entry.setDataOffset(0L);
    entry.setCompressedSize(100L);
    ZipFile zipFile = new ZipFile(new File("test.zip"));
    InputStream inputStream = zipFile.getRawInputStream(entry);
    byte[] buffer = new byte[10];
    int bytesRead = inputStream.read(buffer);
    assertEquals(10, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_aZii1() throws IOException {
        ZipFile zipFile = new ZipFile("test.zip");
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_ritl3() throws IOException {
        File file = new File("test.zip");
        ZipFile zipFile = new ZipFile(file, "UTF-8", true);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_sFAZ6() throws IOException {
        File file = new File("test.zip");
        ZipFile zipFile = new ZipFile(file, "UTF-8", true, true);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test11_AOCe10() throws IOException {
        ZipFile zipFile = new ZipFile("test.zip", "UTF-8");
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test12_hwtF11() throws IOException {
        File file = new File("test.zip");
        ZipFile zipFile = new ZipFile(file, "UTF-8");
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test13_kjCw12() throws IOException {
        File file = new File("test.zip");
        ZipFile zipFile = new ZipFile(file);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
    }
}