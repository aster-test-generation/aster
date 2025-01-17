/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnparseableExtraFieldData_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDirectoryDataIsNull_znru0_1() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] centralDirectoryData = uefd.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDirectoryDataIsNotNull_UUdJ1_2() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] centralDirectoryData = uefd.getCentralDirectoryData();
    assertNotEquals(uefd.getLocalFileDataData(), centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_ffNX0_1() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] localFileData = uefd.getLocalFileDataData();
    assertNotNull(localFileData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_ffNX0_2() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] localFileData = uefd.getLocalFileDataData();
    assertEquals(localFileData.length, 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ValidData_JPIG0() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    int offset = 0;
    int length = 10;
    unparseableExtraFieldData.parseFromCentralDirectoryData(buffer, offset, length);
    assertEquals(buffer, unparseableExtraFieldData.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_InvalidData_lrJQ1() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] buffer = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    int offset = 0;
    int length = 10;
    unparseableExtraFieldData.parseFromCentralDirectoryData(buffer, offset, length);
    assertNull(unparseableExtraFieldData.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_NullBuffer_PuCs2() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] buffer = null;
    int offset = 0;
    int length = 10;
    unparseableExtraFieldData.parseFromCentralDirectoryData(buffer, offset, length);
    assertNull(unparseableExtraFieldData.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_SHaE0() {
    UnparseableExtraFieldData data = new UnparseableExtraFieldData();
    ZipShort headerId = data.getHeaderId();
    assertEquals(0x0000, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDirectoryDataIsNull_znru0() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] centralDirectoryData = uefd.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertEquals(uefd.getLocalFileDataData(), centralDirectoryData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDirectoryDataIsNotNull_UUdJ1() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] centralDirectoryData = uefd.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertNotEquals(uefd.getLocalFileDataData(), centralDirectoryData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_ffNX0() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] localFileData = uefd.getLocalFileDataData();
    assertNotNull(localFileData);
    assertEquals(localFileData.length, 0);
}
}