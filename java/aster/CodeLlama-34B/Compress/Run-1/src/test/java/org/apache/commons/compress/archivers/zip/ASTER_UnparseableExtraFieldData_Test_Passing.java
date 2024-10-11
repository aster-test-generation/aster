/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnparseableExtraFieldData_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDirectoryDataIsNull_znru0_2() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    byte[] centralDirectoryData = uefd.getCentralDirectoryData();
    assertEquals(uefd.getLocalFileDataData(), centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_LocalFileDataLength_PFKT0() {
    UnparseableExtraFieldData data = new UnparseableExtraFieldData();
    ZipShort centralDirectoryLength = data.getCentralDirectoryLength();
    assertEquals(data.getLocalFileDataLength().getValue(), centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_null_DvaY1_GGuB0() {
    UnparseableExtraFieldData uefd = new UnparseableExtraFieldData();
    ZipShort zs = uefd.getLocalFileDataLength();
    assertEquals(0, zs.getValue());
}
}