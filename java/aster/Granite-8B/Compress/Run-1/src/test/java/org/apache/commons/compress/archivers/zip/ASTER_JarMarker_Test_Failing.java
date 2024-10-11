/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JarMarker_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData_VUZI0() throws ZipException {
        JarMarker jarMarker = new JarMarker();
        byte[] buffer = new byte[100]; // Replace with appropriate buffer size
        int offset = 0; // Replace with appropriate offset value
        int length = buffer.length; // Replace with appropriate length value
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_WithZeroLengthData_ThrowsZipException_zHrS0() {
        JarMarker jarMarker = new JarMarker();
        byte[] data = new byte[0];
        int offset = 0;
        int length = 0;
        try {
            jarMarker.parseFromLocalFileData(data, offset, length);
            fail("Expected ZipException to be thrown");
        } catch (ZipException e) {
            assertEquals("JarMarker doesn't expect any data", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_WithNonZeroLengthData_DoesNotThrowZipException_Felq1() {
        JarMarker jarMarker = new JarMarker();
        byte[] data = new byte[10];
        int offset = 0;
        int length = 10;
        try {
            jarMarker.parseFromLocalFileData(data, offset, length);
        } catch (ZipException e) {
            fail("Did not expect ZipException to be thrown");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_GbgX0_2() {
        JarMarker jarMarker = new JarMarker();
        byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
        assertNotEquals(0, centralDirectoryData.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_KMWX0() {
        JarMarker jarMarker = new JarMarker();
        ZipShort zipShort = jarMarker.getHeaderId();
        assertEquals(0x6d6a, zipShort.getValue());
    }
}