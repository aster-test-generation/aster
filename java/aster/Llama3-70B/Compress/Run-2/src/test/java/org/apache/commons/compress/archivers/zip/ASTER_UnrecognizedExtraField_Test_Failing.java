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
public class Aster_UnrecognizedExtraField_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_oceP0() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    ZipShort headerId = uef.getHeaderId();
    assertNotNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_dfJS0() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    byte[] localData = uef.getLocalFileDataData();
    assertNotNull(localData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_withoutCentralData_ZnTH1() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    ZipShort result = uef.getCentralDirectoryLength();
    assertEquals(20, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCentralDirectoryData_AsCp0_bYAn0() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    uef.setCentralDirectoryData(data);
    ZipShort centralDirectoryLength = uef.getCentralDirectoryLength();
    byte[] centralDataBytes = centralDirectoryLength.getBytes();
    assertArrayEquals(data, centralDataBytes);
}
}