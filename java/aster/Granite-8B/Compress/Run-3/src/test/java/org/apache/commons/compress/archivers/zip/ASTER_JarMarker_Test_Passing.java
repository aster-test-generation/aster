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
    public void testParseFromCentralDirectoryData_bHYa0() throws ZipException {
        JarMarker jarMarker = new JarMarker();
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        jarMarker.parseFromCentralDirectoryData(buffer, offset, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_WithZeroLengthData_gGlo0() throws ZipException {
        JarMarker jarMarker = new JarMarker();
        byte[] data = new byte[0];
        jarMarker.parseFromLocalFileData(data, 0, 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_WithNonZeroLengthData_xgic1() throws Exception {
        JarMarker jarMarker = new JarMarker();
        byte[] data = new byte[10];
        jarMarker.parseFromLocalFileData(data, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_tBVi0() throws Exception {
        JarMarker jarMarker = new JarMarker();
        byte[] actualCentralDirectoryData = jarMarker.getCentralDirectoryData();
        byte[] expectedCentralDirectoryData = ByteUtils.EMPTY_BYTE_ARRAY;
        assertEquals(expectedCentralDirectoryData, actualCentralDirectoryData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_VQtU0() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort zipShort = jarMarker.getHeaderId();
        assertEquals(0x6b63, zipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalFileDataData_oEwM0() throws Exception {
        JarMarker jarMarker = new JarMarker();
        byte[] result = jarMarker.getLocalFileDataData();
        byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_jMJi0() throws Exception {
        JarMarker jarMarker = new JarMarker();
        byte[] centralDirectoryData = jarMarker.getCentralDirectoryData();
        assertNotNull(centralDirectoryData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataData_gYCs2() throws Exception {
        JarMarker jarMarker = new JarMarker();
        byte[] localFileDataData = jarMarker.getLocalFileDataData();
        assertNotNull(localFileDataData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength_zfWK0() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort localFileDataLength = jarMarker.getLocalFileDataLength();
        assertNotNull(localFileDataLength);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength2_XkfS2() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort localFileDataLength = jarMarker.getLocalFileDataLength();
        assertEquals(0, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength3_jsoV3() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort localFileDataLength = jarMarker.getLocalFileDataLength();
        assertNotEquals(1, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength4_pqLQ4() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort localFileDataLength = jarMarker.getLocalFileDataLength();
        assertTrue(localFileDataLength.getValue() > 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength5_aArJ5() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort localFileDataLength = jarMarker.getLocalFileDataLength();
        assertFalse(localFileDataLength.getValue() < 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength6_cHon6() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort localFileDataLength = jarMarker.getLocalFileDataLength();
        assertNotEquals(0, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLength_ajhb0() throws Exception {
        JarMarker jarMarker = new JarMarker();
        ZipShort centralDirectoryLength = jarMarker.getCentralDirectoryLength();
        assertNotNull(centralDirectoryLength);
    }
}