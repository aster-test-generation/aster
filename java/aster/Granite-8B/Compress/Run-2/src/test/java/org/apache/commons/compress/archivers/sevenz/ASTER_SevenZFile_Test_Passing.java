/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.apache.commons.compress.utils.InputStreamStatistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesWithEmptySignature_djgO0() throws Exception {
        byte[] signature = new byte[0];
        boolean result = SevenZFile.matches(signature, 0);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesWithSignatureLengthShorterThanSignature_lnSP1() throws Exception {
        byte[] signature = {0x37, 0x7A, 0x2E};
        boolean result = SevenZFile.matches(signature, 2);
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForFirstEntry_flDv0() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForSecondEntry_nLks1() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    sevenZFile.getNextEntry();
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForLastEntry_BlCY2() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    while (sevenZFile.getNextEntry() != null) {
    }
    SevenZArchiveEntry entry = sevenZFile.getNextEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInputStreamForNonExistingEntry_TyzK3() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
    SevenZArchiveEntry entry = new SevenZArchiveEntry();
    InputStream inputStream = sevenZFile.getInputStream(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRead_alUQ0() throws IOException {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
        byte[] b = new byte[10];
        int result = sevenZFile.read(b);
        assertEquals(10, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithValidParameters_BSPK0() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    byte[] buffer = new byte[10];
    int bytesRead = sevenZFile.read(buffer, 0, 10);
    assertEquals(10, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithZeroLengthBuffer_JQto1() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    byte[] buffer = new byte[0];
    int bytesRead = sevenZFile.read(buffer, 0, 0);
    assertEquals(0, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReadWithInvalidParameters_KJSp2() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[0]);
    byte[] buffer = null;
    int bytesRead = sevenZFile.read(buffer, 0, 10);
    assertEquals(-1, bytesRead);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntry_withNoEntries_returnsNull_tgpq0() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntry_withOneEntry_returnsEntry_xZQu1() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntry_withMultipleEntries_returnsNextEntry_UtEG2() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
        sevenZFile.getNextEntry();
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntry_withMultipleEntries_returnsCorrectEntry_ZdyL3() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
        sevenZFile.getNextEntry();
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertEquals("entryName", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntry_withMultipleEntries_returnsNextEntryAfterMultipleCalls_rbzU4() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
        sevenZFile.getNextEntry();
        sevenZFile.getNextEntry();
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntry_withMultipleEntries_returnsCorrectEntryAfterMultipleCalls_pggO5() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
        sevenZFile.getNextEntry();
        sevenZFile.getNextEntry();
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertEquals("entryName", entry.getName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNextEntry_withMultipleEntries_returnsNullAfterLastEntry_Fvyi6() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"));
        sevenZFile.getNextEntry();
        sevenZFile.getNextEntry();
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNull(entry);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatisticsForCurrentEntry_oYGZ0_1() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("example.7z"), "password".toCharArray());
        InputStreamStatistics statistics = sevenZFile.getStatisticsForCurrentEntry();
        assertNotNull(statistics);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatisticsForCurrentEntry_oYGZ0_2() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("example.7z"), "password".toCharArray());
        InputStreamStatistics statistics = sevenZFile.getStatisticsForCurrentEntry();
        assertEquals(0, statistics.getCompressedCount());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetStatisticsForCurrentEntry_oYGZ0_3() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("example.7z"), "password".toCharArray());
        InputStreamStatistics statistics = sevenZFile.getStatisticsForCurrentEntry();
        assertEquals(0, statistics.getUncompressedCount());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead1_nFbb0() throws IOException {
    SevenZFile sevenZFile = new SevenZFile(new File("file.7z"), "password".toCharArray());
    int result = sevenZFile.read();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntries_EYOO0() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("test.7z"), new char[]{'p', 'a', 's', 's'});
        Iterable<SevenZArchiveEntry> entries = sevenZFile.getEntries();
        assertEquals(1, entries.iterator().next().getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose1_XXCD0() throws IOException {
        SevenZFile sevenZFile = new SevenZFile(new File("file.7z"), new char[] {'p', 'a', 's', 's'});
        sevenZFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose13_zfxE12() throws IOException {
        SevenZFile sevenZFile = new SevenZFile(new File("file.7z"), new byte[] {'p', 'a', 's', 's'});
        sevenZFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose14_hcnd13() throws IOException {
        SevenZFile sevenZFile = new SevenZFile(new File("file.7z"));
        sevenZFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDefaultName_withDefaultFileName_returnsNull_kfFx0() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("defaultFileName"), new char[0]);
        String actualDefaultName = sevenZFile.getDefaultName();
        String expectedDefaultName = null;
        assertEquals(expectedDefaultName, actualDefaultName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDefaultName_withFileNameWithoutExtension_returnsFileNameWithTilde_XbnB1() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("fileNameWithoutExtension"), new char[0]);
        String actualDefaultName = sevenZFile.getDefaultName();
        String expectedDefaultName = "fileNameWithoutExtension~";
        assertEquals(expectedDefaultName, actualDefaultName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDefaultName_withFileNameWithExtension_returnsFileNameWithoutExtension_IjYY2() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("fileNameWithExtension.txt"), new char[0]);
        String actualDefaultName = sevenZFile.getDefaultName();
        String expectedDefaultName = "fileNameWithExtension";
        assertEquals(expectedDefaultName, actualDefaultName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDefaultName_withFileNameWithMultipleExtensions_returnsFileNameWithoutLastExtension_reip3() throws Exception {
        SevenZFile sevenZFile = new SevenZFile(new File("fileNameWithMultipleExtensions.tar.gz"), new char[0]);
        String actualDefaultName = sevenZFile.getDefaultName();
        String expectedDefaultName = "fileNameWithMultipleExtensions.tar";
        assertEquals(expectedDefaultName, actualDefaultName);
    }
}