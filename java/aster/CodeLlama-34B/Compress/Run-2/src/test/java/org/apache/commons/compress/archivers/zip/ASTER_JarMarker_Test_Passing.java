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
public void testParseFromCentralDirectoryData_validData_HVIJ0() throws ZipException {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[100];
    int offset = 0;
    int length = 100;
    jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(100, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_invalidData_hmZO1() throws ZipException {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[100];
    int offset = 0;
    int length = 100;
    jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_nullData_vTOy2() throws ZipException {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = null;
    int offset = 0;
    int length = 100;
    jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_invalidOffset_YsoA3() throws ZipException {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[100];
    int offset = -1;
    int length = 100;
    jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_invalidLength_QwjQ4() throws ZipException {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[100];
    int offset = 0;
    int length = -1;
    jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_invalidOffsetAndLength_Phhx9() throws ZipException {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[100];
    int offset = -1;
    int length = -1;
    jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_withData_yOHJ0() {
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
public void testParseFromLocalFileData_withoutData_iZqI1() {
    JarMarker jarMarker = new JarMarker();
    byte[] data = new byte[0];
    int offset = 0;
    int length = 0;
    try {
        jarMarker.parseFromLocalFileData(data, offset, length);
    } catch (ZipException e) {
        fail("Did not expect ZipException");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_nAyv0() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertEquals(0, centralDirectoryData.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWithNonEmptyByteArray_qOPf1() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertEquals(1, centralDirectoryData.length);
    assertEquals(0, centralDirectoryData[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWithNullByteArray_TswC2() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertNull(centralDirectoryData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_Valid_NTYX0() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
    assertEquals(headerId.getValue(), 0x0403);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_Invalid_PyTx1() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
    assertNotEquals(headerId.getValue(), 0x0403);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_Null_aBLq2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
    assertNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_Empty_daBX3() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
    assertEquals(headerId.getValue(), 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_Negative_tXdL4() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
    assertEquals(headerId.getValue(), -1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_MaxValue_bBsJ5() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
    assertEquals(headerId.getValue(), 65535);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_Random_KMsU7() {
    JarMarker jarMarker = new JarMarker();
    ZipShort headerId = jarMarker.getHeaderId();
    assertEquals(headerId.getValue(), 12345);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_gZAe0() {
    JarMarker jarMarker = new JarMarker();
    byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
    byte[] actual = jarMarker.getLocalFileDataData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithNonEmptyArray_lVSg1() {
    JarMarker jarMarker = new JarMarker();
    byte[] expected = new byte[] { 1, 2, 3, 4, 5 };
    byte[] actual = jarMarker.getLocalFileDataData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithNull_ctoO2() {
    JarMarker jarMarker = new JarMarker();
    byte[] expected = null;
    byte[] actual = jarMarker.getLocalFileDataData();
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstance_LuAX0() {
    JarMarker jarMarker = JarMarker.getInstance();
    assertNotNull(jarMarker);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_Null_uaXX0() {
    JarMarker jarMarker = new JarMarker();
    ZipShort zipShort = jarMarker.getLocalFileDataLength();
    assertNull(zipShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_Hoif0() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertNotNull(centralDirectoryLength);
    assertEquals(0, centralDirectoryLength.getValue());
    assertEquals(0, centralDirectoryLength.getBytes().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithNonZeroValue_fnhg1() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertNotNull(centralDirectoryLength);
    assertEquals(10, centralDirectoryLength.getValue());
    assertEquals(10, centralDirectoryLength.getBytes().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithNegativeValue_vdGy2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertNotNull(centralDirectoryLength);
    assertEquals(-10, centralDirectoryLength.getValue());
    assertEquals(10, centralDirectoryLength.getBytes().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithMaxValue_WobE3() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertNotNull(centralDirectoryLength);
    assertEquals(Integer.MAX_VALUE, centralDirectoryLength.getValue());
    assertEquals(Integer.MAX_VALUE, centralDirectoryLength.getBytes().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithMinValue_RWht4() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertNotNull(centralDirectoryLength);
    assertEquals(Integer.MIN_VALUE, centralDirectoryLength.getValue());
    assertEquals(Integer.MIN_VALUE, centralDirectoryLength.getBytes().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_nAyv0_1() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_nAyv0_2() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertEquals(0, centralDirectoryData.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWithNonEmptyByteArray_qOPf1_2() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertEquals(1, centralDirectoryData.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWithNonEmptyByteArray_qOPf1_3() {
    JarMarker jarMarker = new JarMarker();
    byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
    assertEquals(0, centralDirectoryData[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_Hoif0_1() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertNotNull(centralDirectoryLength);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_Hoif0_2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_Hoif0_3() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getBytes().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithNonZeroValue_fnhg1_2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(10, centralDirectoryLength.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithNonZeroValue_fnhg1_3() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(10, centralDirectoryLength.getBytes().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithNegativeValue_vdGy2_2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(-10, centralDirectoryLength.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithMaxValue_WobE3_2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(Integer.MAX_VALUE, centralDirectoryLength.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithMaxValue_WobE3_3() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(Integer.MAX_VALUE, centralDirectoryLength.getBytes().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithMinValue_RWht4_2() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(Integer.MIN_VALUE, centralDirectoryLength.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthWithMinValue_RWht4_3() {
    JarMarker jarMarker = new JarMarker();
    ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
    assertEquals(Integer.MIN_VALUE, centralDirectoryLength.getBytes().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_nullLength_fuzI8_erZl0() throws ZipException {
    JarMarker jarMarker = new JarMarker();
    byte[] buffer = new byte[100];
    int offset = 0;
    int length = 0;
    jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(0, jarMarker.getCentralDirectoryData().length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstanceWithLocalFileDataLength_AnDi4_ojUL0_1() {
    ZipShort localFileDataLength = new ZipShort(10);
    JarMarker jarMarker = new JarMarker();
    assertNotNull(jarMarker);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstanceWithLocalFileDataLength_AnDi4_ojUL0_2() {
    ZipShort localFileDataLength = new ZipShort(10);
    JarMarker jarMarker = new JarMarker();
    assertEquals(localFileDataLength, jarMarker.getLocalFileDataLength());}
}