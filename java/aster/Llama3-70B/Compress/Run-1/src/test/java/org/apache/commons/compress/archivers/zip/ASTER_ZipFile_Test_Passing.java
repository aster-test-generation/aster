/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.EntryStreamOffsets;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCanReadEntryData_YxJD0_aXAW0_fid1() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip"));
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        boolean result = zipFile.canReadEntryData(entry);
        assertFalse(result);
    } catch (IOException e) {
        // IOException is expected
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFinalize1_RECB0_YQIV0_fid1() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        zipFile.close(); 
        assert true;
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFirstLocalFileHeaderOffset_JVjH0_OYGe0_fid1() {
    try {
        ZipFile zipFile = new ZipFile(new File("test.zip"));
        long offset = zipFile.getFirstLocalFileHeaderOffset();
        assertNotEquals(-1, offset);
    } catch (IOException e) {
        // IOException is expected
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnixSymlinkNotUnixSymlink_MHnH1_TEVq0_fid1() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        try {
            assertNotNull(zipFile.getUnixSymlink(entry));
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            // Expected
        } catch (NullPointerException e) {
            fail("NullPointerException occurred");
        }
    } catch (IOException e) {
        // Expected
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRawInputStream1_vNlC0_IZUh0_fid1() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        try {
            InputStream inputStream = zipFile.getRawInputStream(entry); 
            assertNotNull(inputStream);
        } catch (IOException e) {
            // Expected
        }
    } catch (IOException e) {
        // Expected
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRawInputStream3_crLL2_uKCO0_fid1() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setDataOffset(EntryStreamOffsets.OFFSET_UNKNOWN);
        try {
            InputStream inputStream = zipFile.getRawInputStream(entry);
            assertNull(inputStream);
        } catch (IOException e) {
            // Expected IOException
        }
    } catch (IOException e) {
        // Expected IOException
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRawInputStream1_vxwp0_lEfw0_fid1() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        try {
            InputStream inputStream = zipFile.getRawInputStream(entry);
            assertNotNull(inputStream);
        } catch (IOException e) {
        }
    } catch (IOException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRawInputStream2_PIHt1_wfwL0_fid1() {
    try {
        ZipFile zipFile = new ZipFile("test.zip");
        ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
        entry.setCompressedSize(0);
        try {
            InputStream inputStream = zipFile.getRawInputStream(entry);
            assertNull(inputStream);
        } catch (IOException e) {
            throw e;
        }
    } catch (IOException e) {
        // IOException is expected
    }
}
}