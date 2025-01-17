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
public void testParseFromLocalFileData_withData_zaGa0() {
    JarMarker jarMarker = new JarMarker();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 10;
    try {
        jarMarker.parseFromLocalFileData(data, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("JarMarker doesn't expect any data", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_fhDb0() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstance_iCji0() {
    JarMarker jarMarker = JarMarker.getInstance();
    assertNotNull(jarMarker);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_qncM0() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertEquals(ByteUtils.EMPTY_BYTE_ARRAY, centralDirectoryData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_EmptyBuffer_wrub10() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_RVQU0() {
    JarMarker jarMarker = new JarMarker();
    byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
    byte[] actual = jarMarker.getLocalFileDataData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithEmptyByteArray_WIOq3() {
    JarMarker jarMarker = new JarMarker();
    byte[] expected = new byte[0];
    byte[] actual = jarMarker.getLocalFileDataData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_GmJM0_1() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertNotNull(centralDirectoryLength);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_GmJM0_2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstanceWithCentralDirectoryData_odZu1_PSPb0_1() {
    byte[] centralDirectoryData = new byte[10];
    JarMarker jarMarker = new JarMarker();
    assertNotNull(jarMarker);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_InvalidData_qTTP1_amfp0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 10;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NullData_bsye2_bKnF0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = null;
    int offset = 0;
    int length = 10;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_EmptyData_lyVf3_YCaQ0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[0];
    int offset = 0;
    int length = 0;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_LengthOutOfBounds_cpKI5_cIEy0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 11;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_OffsetOutOfBounds_PUAl4_NyQK0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[10];
    int offset = 11;
    int length = 10;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NegativeOffset_nLBm6_dtuy0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[10];
    int offset = -1;
    int length = 10;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NegativeLength_zDFt7_TRZy0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = -1;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ZeroLength_NAiS8_KEbM0() {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[10];
    int offset = 0;
    int length = 0;
    try {
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    } catch (ZipException e) {
    }
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
}