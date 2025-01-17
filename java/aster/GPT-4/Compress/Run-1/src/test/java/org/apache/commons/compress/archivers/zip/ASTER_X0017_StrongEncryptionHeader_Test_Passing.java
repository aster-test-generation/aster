/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRecordCount_QhEd0() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    assertEquals(0, header.getRecordCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ValidData_kJRH0_fid1() {
    X0017_StrongEncryptionHeader encryptionHeader = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int offset = 0;
    int length = 10;
    try {
        encryptionHeader.parseFromCentralDirectoryData(data, offset, length);
        assertTrue(true); // Assuming no exception means success
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFileFormatWithMinimalLength_NfiX0_fid1() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[4]; // minimal length to pass the first minimal length check
    try {
        header.parseFileFormat(data, 0, 4);
        fail("Expected a ZipException due to insufficient data length after initial checks");
    } catch (ZipException e) {
        assertEquals("org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 4", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFileFormatWithInvalidIVSize_AcAl1_fid1() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = {0, 0, 0, 5}; // IV size set to 5, which is invalid given the total length
    try {
        header.parseFileFormat(data, 0, 4);
        fail("Expected a ZipException due to invalid IV size");
    } catch (ZipException e) {
        assertEquals("org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 4", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFileFormatWithValidIVSizeButInvalidErdSize_LGLb2_fid1() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[20];
    data[3] = 1; // Setting IV size to 1
    data[19] = 10; // Setting ERD size to 10, which is invalid given the total length
    try {
        header.parseFileFormat(data, 0, 20);
        fail("Expected a ZipException due to invalid ERD size");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFileFormatWithInvalidVSize_jrUy4_fid1() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[30];
    data[3] = 1; // IV size
    data[19] = 1; // ERD size
    data[29] = 2; // V size set to 2, which is invalid as it must be at least 4
    try {
        header.parseFileFormat(data, 0, 30);
        fail("Expected a ZipException due to invalid V size");
    } catch (ZipException e) {
        assertEquals("org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 4", e.getMessage());
    }
}
}