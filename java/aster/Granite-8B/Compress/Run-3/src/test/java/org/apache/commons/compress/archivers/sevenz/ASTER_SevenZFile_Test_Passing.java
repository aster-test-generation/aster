/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.utils.InputStreamStatistics;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForFirstEntry_VJdo0() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForSecondEntry_TncA1() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    sevenZFile.getNextEntry();
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForLastEntry_bkoN2() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    while (sevenZFile.getNextEntry() != null) {
    }
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForNonExistentEntry_Xskf3() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForFirstEntry_PLNI0() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForSecondEntry_nIuY1() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    sevenZFile.getNextEntry();
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForLastEntry_KWXU2() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    while (sevenZFile.getNextEntry() != null) {
    }
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForNonExistentEntry_sDuH3() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_PjXX0() throws IOException {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), "password".toCharArray());
        byte[] b = new byte[1024];
        int bytesRead = sevenZFile.read(b);
        assertEquals(1024, bytesRead);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidInput_cKrk0() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[]{'p', 'a', 's', 's'});
    byte[] buffer = new byte[1024];
    int bytesRead = sevenZFile.read(buffer, 0, 1024);
    assertEquals(1024, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithZeroLengthBuffer_NLRe1() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[]{'p', 'a', 's', 's'});
    byte[] buffer = new byte[0];
    int bytesRead = sevenZFile.read(buffer, 0, 0);
    assertEquals(0, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithInvalidInput_LfKm2() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[]{'p', 'a', 's', 's'});
    byte[] buffer = null;
    int bytesRead = sevenZFile.read(buffer, 0, 1024);
    assertEquals(-1, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getNextEntry_whenNoMoreEntries_returnsNull_VKVx0() throws Exception {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    sevenZFile.getNextEntry();
    sevenZFile.getNextEntry();
    Assertions.assertNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getNextEntry_whenHasNextEntry_returnsNextEntry_AUwU1() throws Exception {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    Assertions.assertNotNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getNextEntry_whenHasNextEntry_returnsCorrectEntry_aJBb2() throws Exception {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    Assertions.assertEquals("test.txt", entry.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatisticsForCurrentEntry_LRHS0_1() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("example.7z"), "password".toCharArray());
        InputStreamStatistics statistics = sevenZFile.getStatisticsForCurrentEntry();
        assertNotNull(statistics);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatisticsForCurrentEntry_LRHS0_2() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("example.7z"), "password".toCharArray());
        InputStreamStatistics statistics = sevenZFile.getStatisticsForCurrentEntry();
        assertEquals(0, statistics.getCompressedCount());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatisticsForCurrentEntry_LRHS0_3() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("example.7z"), "password".toCharArray());
        InputStreamStatistics statistics = sevenZFile.getStatisticsForCurrentEntry();
        assertEquals(0, statistics.getUncompressedCount());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_TaaF0() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    sevenZFile.read();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testBuilder_dRbK0_1() throws Exception {
        assertDoesNotThrow(() -> {
            SevenZFileOptions.Builder builder = SevenZFileOptions.builder();
            assertNotNull(builder);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testBuilderGet_Uucg1_1() throws Exception {
        assertDoesNotThrow(() -> {
            SevenZFileOptions.Builder builder = SevenZFileOptions.builder();
            SevenZFileOptions options = builder.build();
            assertNotNull(options);
        });}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetEntries_vwVR0() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), "password".toCharArray());
        Iterable<SevenZArchiveEntry> entries = sevenZFile.getEntries();
        assertNotNull(entries);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose1_miOK0() throws IOException {
        SevenZFile sevenZFile = new SevenZFile(new File("file.7z"), new char[] {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'});
        sevenZFile.close();
    }
}