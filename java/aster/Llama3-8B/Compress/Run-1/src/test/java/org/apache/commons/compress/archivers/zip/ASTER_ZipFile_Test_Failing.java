/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Enumeration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipFile_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinalize2_prZQ1() throws Throwable {
        ZipFile zipFile = new ZipFile(new File("test.zip"), "UTF-8", true);
        zipFile.finalize();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEntriesInPhysicalOrder_SpUY0() throws IOException {
        ZipFile zipFile = new ZipFile(new File("test.zip"), "UTF-8", true);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntriesInPhysicalOrder();
        while (entries.hasMoreElements()) {
            ZipArchiveEntry entry = entries.nextElement();
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose1_hsta1() throws IOException {
        ZipFile zipFile = new ZipFile("name");
        zipFile.close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCopyRawEntriesPredicateNull_tGdi2() throws IOException {
        ZipFile zipFile = new ZipFile(new File("path"), "encoding", true);
        ZipArchiveOutputStream target = new ZipArchiveOutputStream(new File("target"), 1024);
        zipFile.copyRawEntries(target, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinalize_uCpg0_EZEU0() throws Throwable {
    ZipFile zipFile = new ZipFile(new File("test.zip"));
    zipFile.finalize();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCanReadEntryData_GjIa0_kkxz0() throws IOException {
    ZipFile zipFile = new ZipFile(new File("path_to_your_zip_file"), "UTF-8", true);
    ZipArchiveEntry entry = zipFile.getEntry("entry_name");
    boolean result = zipFile.canReadEntryData(entry);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCanReadEntryData_False_GqVV1_cvdb0() throws IOException {
    ZipFile zipFile = new ZipFile(new File("path_to_your_zip_file"), "UTF-8", true);
    ZipArchiveEntry entry = zipFile.getEntry("entry_name");
    entry.setMethod(ZipArchiveEntry.DEFLATED);
    boolean result = zipFile.canReadEntryData(entry);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_PguV0_gjWI0_1() throws IOException {
    ZipFile zipFile = new ZipFile("test.zip");
    Iterable<ZipArchiveEntry> entries = zipFile.getEntries("test");
    for (ZipArchiveEntry entry : entries) {
        System.out.println(entry.getName());
    }
    int size = 0;
    for (ZipArchiveEntry entry : entries) {
        size++;
    }
    assertNotNull(entries);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_PguV0_gjWI0_2() throws IOException {
    ZipFile zipFile = new ZipFile("test.zip");
    Iterable<ZipArchiveEntry> entries = zipFile.getEntries("test");
    for (ZipArchiveEntry entry : entries) {
        System.out.println(entry.getName());
    }
    int size = 0;
    for (ZipArchiveEntry entry : entries) {
        size++;
    }
    assertEquals(1, size);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntry_qXHV0_UbDJ0() throws IOException {
    ZipFile zipFile = new ZipFile(new File("path"), "encoding", true);
    ZipArchiveEntry entry = zipFile.getEntry("name");
    assert entry != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntryNull_Tkad1_lRMq0() throws IOException {
    ZipFile zipFile = new ZipFile(new File("path"), "encoding", true);
    ZipArchiveEntry entry = zipFile.getEntry("nonExistingName");
    assert entry == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding_QIHO0_obny0() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        assertEquals("UTF-8", zipFile.getEncoding());
    } catch (IOException e) {
        fail("IOException was expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding2_ezzW1_IPmg0() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip"), "UTF-8", true);
        assertEquals("UTF-8", zipFile.getEncoding());
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEncoding5_vWRo4_GJUJ0() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip"), "UTF-8", true, false);
        assertEquals("UTF-8", zipFile.getEncoding());
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFirstLocalFileHeaderOffsetFile_GYWv2_sBkk0() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip"));
        assertEquals(0, zipFile.getFirstLocalFileHeaderOffset());
    } catch (IOException e) {
        fail("IOException should not be thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFirstLocalFileHeaderOffsetFileEncoding_qScy6_slOh0() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip"));
        assertEquals(0, zipFile.getFirstLocalFileHeaderOffset());
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFirstLocalFileHeaderOffsetFileEncodingIgnoreLocalFileHeader_vPSg10_CCBM0() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip"), "encoding", true, true);
        assertEquals(0, zipFile.getFirstLocalFileHeaderOffset());
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetContentBeforeFirstLocalFileHeader_ReturnsNull_aHTI0_hfPw0() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip")); // This line was causing the error
        zipFile = new ZipFile(new File("test.zip")); // This line was causing the error
        InputStream result = zipFile.getContentBeforeFirstLocalFileHeader();
        Assertions.assertNull(result);
    } catch (IOException e) {
        Assertions.fail("IOException was thrown", e);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries_rGMl0_FrZS0() {
    try {
        ZipFile zipFile = new ZipFile(new File("path"), "encoding", true);
    } catch (IOException e) {
        assert false;
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries2_PbWv1_NtuT0() {
    try {
        ZipFile zipFile = new ZipFile(new File("path"), "encoding", true);
        Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
        assert entries.hasMoreElements();
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetEntries4_ytsT3_UgaM0() {
    try {
        ZipFile zipFile = new ZipFile(new File("path"));
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRawInputStreamNullEntry_Xmfm1_AfzW0() {
    try {
        ZipFile zipFile = new ZipFile(new File("path"), "encoding", true);
        ZipArchiveEntry entry = null;
        try {
            InputStream inputStream = zipFile.getRawInputStream(entry);
            fail("IOException was expected");
        } catch (IOException e) {
        }
    } catch (IOException e) {
        fail("IOException was expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFirstLocalFileHeaderOffset_QFOB0_zEEH0() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        assertEquals(0, zipFile.getEntry("entryName").getLocalHeaderOffset());
    } catch (IOException e) {
        fail("IOException was thrown");
    }
}
}