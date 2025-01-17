/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X0017_StrongEncryptionHeader_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryDataWithInvalidOffset_LWOC5() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[10];
    int offset = 15;
    int length = 10;
    try {
        header.parseFromCentralDirectoryData(data, offset, length);
        fail("Exception should be thrown");
    } catch (ZipException e) {
        assertEquals("Invalid offset", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseCentralDirectoryFormat_InvalidData_CiUG1() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10 };
    int offset = 0;
    int length = data.length;
    try {
        header.parseCentralDirectoryFormat(data, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("Invalid central directory format", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordCount_ttQS0_fid1() {
        X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
        long expected = 10;
        long actual = header.getRecordCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordCountWithNegativeRecords_YHZh2_fid1() {
        X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
        long expected = -1;
        long actual = header.getRecordCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordCountWithLargeRecords_XSba3_fid1() {
        X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
        long expected = 1000000;
        long actual = header.getRecordCount();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryDataWithInvalidData_cuLb4_fid1() {
    X0017_StrongEncryptionHeader header = new X0017_StrongEncryptionHeader();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 10;
    try {
        header.parseFromCentralDirectoryData(data, offset, length);
        fail("Exception should be thrown");
    } catch (ZipException e) {
        assertEquals("Invalid data", e.getMessage());
    }
}
}