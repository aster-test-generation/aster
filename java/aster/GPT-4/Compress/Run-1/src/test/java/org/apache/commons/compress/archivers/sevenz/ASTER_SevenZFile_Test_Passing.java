/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchesInvalidSignature_yiMp1() throws Exception {
        byte[] signature = new byte[] {0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        assertFalse(SevenZFile.matches(signature, signature.length));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringReturnsCorrectArchiveString_DyYj0() throws IOException {
    File file = new File("test.7z");
    SevenZFile sevenZFile = new SevenZFile(file);
    assertEquals("ExpectedArchiveString", sevenZFile.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStreamValidEntry_DAZL0() throws IOException {
        File file = new File("valid.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("test.txt");
        InputStream result = sevenZFile.getInputStream(entry);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStreamValidEntry_HMMY0() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("testEntry");
        InputStream result = sevenZFile.getInputStream(entry);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStreamEntryNotFound_IKDF1() throws Exception {
        File file = new File("test.7z");
        try {
            SevenZFile sevenZFile = new SevenZFile(file);
            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("nonExistingEntry");
            sevenZFile.getInputStream(entry);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Can not find nonExistingEntry in test.7z", e.getMessage());
        } catch (IOException e) {
            fail("IOException should not have occurred");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStreamWithCrcCheck_vXJt3() throws IOException {
        File file = new File("testWithCrc.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("entryWithCrc");
        entry.setHasCrc(true);
        entry.setCrcValue(123456789L);
        InputStream result = sevenZFile.getInputStream(entry);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInputStream_EntryNotFound_jJrD0() throws Exception {
    try {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("nonexistentfile.7z");
        InputStream result = sevenZFile.getInputStream(entry);
        fail("Expected an IllegalArgumentException to be thrown");
    } catch (IllegalArgumentException e) {
        assertEquals("Can not find nonexistentfile.7z in test.7z", e.getMessage());
    } catch (IOException e) {
        fail("IOException should not occur in this test");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStreamValidEntry_pCzf0() throws Exception {
        File file = new File("valid.7z");
        char[] password = {'p', 'a', 's', 's'};
        SevenZFile sevenZFile = new SevenZFile(file, password);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("test.txt");
        InputStream result = sevenZFile.getInputStream(entry);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStreamEmptyFile_nWqU2() throws Exception {
        File file = new File("empty.7z");
        char[] password = {'p', 'a', 's', 's'};
        SevenZFile sevenZFile = new SevenZFile(file, password);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("empty.txt");
        entry.setSize(0);
        InputStream result = sevenZFile.getInputStream(entry);
        assertEquals(0, result.available());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInputStreamSolidCompression_tlfu3() throws Exception {
        File file = new File("solid.7z");
        char[] password = {'p', 'a', 's', 's'};
        SevenZFile sevenZFile = new SevenZFile(file, password);
        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("solid.txt");
        InputStream result = sevenZFile.getInputStream(entry);
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntryReturnsNullWhenNoMoreEntries_uREC0() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = null;
        while ((entry = sevenZFile.getNextEntry()) != null) {
        }
        assertNull(sevenZFile.getNextEntry());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntryReturnsNextEntry_kXuI1_1() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry firstEntry = sevenZFile.getNextEntry();
        SevenZArchiveEntry secondEntry = sevenZFile.getNextEntry();
        assertNotNull(firstEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntryReturnsNextEntry_kXuI1_2() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry firstEntry = sevenZFile.getNextEntry();
        SevenZArchiveEntry secondEntry = sevenZFile.getNextEntry();
        assertNotNull(secondEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntryReturnsNextEntry_kXuI1_3() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry firstEntry = sevenZFile.getNextEntry();
        SevenZArchiveEntry secondEntry = sevenZFile.getNextEntry();
        assertNotEquals(firstEntry, secondEntry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntrySetsDefaultNameForUnnamedEntries_Onwa2_1() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntrySetsDefaultNameForUnnamedEntries_Onwa2_2() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertNotNull(entry.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNextEntryReadsEntryDataCorrectly_WRMD3_2() throws IOException {
        File file = new File("test.7z");
        SevenZFile sevenZFile = new SevenZFile(file);
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        assertTrue(entry.hasStream());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDefaultNameWithNullFileName_jOca0() throws Exception {
    SevenZFile sevenZFile = new SevenZFile(new File("dummy"));
    assertNull(sevenZFile.getDefaultName());
}
}