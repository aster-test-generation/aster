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
public class Aster_UnparseableExtraFieldData_Test_Passing {
private byte[] centralDirectoryData;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_LocalFileDataIsNull_LzDE0() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] buffer = new byte[10];
    unparseableExtraFieldData.parseFromCentralDirectoryData(buffer, 0, 10);
    assertArrayEquals(buffer, unparseableExtraFieldData.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataNull_RGSc0() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] result = unparseableExtraFieldData.getCentralDirectoryData();
    assertArrayEquals(unparseableExtraFieldData.getLocalFileDataData(), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_CoZI0() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    ZipShort headerId = unparseableExtraFieldData.getHeaderId();
    assertNotNull(headerId);
    assertEquals(headerId.getValue(), headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_dgNF0() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    byte[] result = unparseableExtraFieldData.getLocalFileDataData();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthNull_nkYO0() {
    UnparseableExtraFieldData ued = new UnparseableExtraFieldData();
    ZipShort result = ued.getCentralDirectoryLength();
    assertEquals(new ZipShort(ued.getLocalFileDataLength().getValue()), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_CoZI0_1() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    ZipShort headerId = unparseableExtraFieldData.getHeaderId();
    assertNotNull(headerId);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_CoZI0_2() {
    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
    ZipShort headerId = unparseableExtraFieldData.getHeaderId();
    assertEquals(headerId.getValue(), headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLengthNull_XkpJ0_Zgga0() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    ZipShort result = uefd.getCentralDirectoryLength();
    assertEquals(0, result.getValue());
}
}