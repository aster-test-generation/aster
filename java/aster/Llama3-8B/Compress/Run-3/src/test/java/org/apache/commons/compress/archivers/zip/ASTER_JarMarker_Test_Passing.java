/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import org.apache.commons.compress.utils.ByteUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JarMarker_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithZeroLength_CiGT0() {
    JarMarker jarMarker = new JarMarker();
    byte[] data = new byte[0];
    int offset = 0;
    int length = 0;
    try {
        jarMarker.parseFromLocalFileData(data, offset, length);
    } catch (ZipException e) {
        assertEquals("JarMarker doesn't expect any data", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithNonZeroLength_DfEM1() {
    JarMarker jarMarker = new JarMarker();
    byte[] data = new byte[1];
    int offset = 0;
    int length = 1;
    try {
        jarMarker.parseFromLocalFileData(data, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("JarMarker doesn't expect any data", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_xQWR0() {
        JarMarker jarMarker = new JarMarker();
        byte[] result = jarMarker.getCentralDirectoryData();
        byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataData_VGcP0() {
        JarMarker jarMarker = new JarMarker();
        byte[] result = jarMarker.getLocalFileDataData();
        byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_aqUq0_MeSH0() {
    JarMarker jarMarker = new JarMarker();
    ZipShort result = jarMarker.getCentralDirectoryLength();
    assertEquals(ZipShort.getValue(result.getBytes()), result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_CFBn0_LXpm0() {
    JarMarker jarMarker = new JarMarker();
    ZipShort result = jarMarker.getCentralDirectoryLength();
    assertEquals(null, result);
}
}