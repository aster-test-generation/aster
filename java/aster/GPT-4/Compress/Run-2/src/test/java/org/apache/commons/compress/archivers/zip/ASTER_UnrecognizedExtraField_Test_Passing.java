/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnrecognizedExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHeaderId_ynwH0() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    ZipShort zs = new ZipShort(100);
    uef.setHeaderId(zs);
    assertEquals(zs, uef.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryDataWithValidData_vIsB0() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    byte[] data = {0x01, 0x02, 0x03, 0x04};
    int offset = 1;
    int length = 2;
    uef.parseFromCentralDirectoryData(data, offset, length);
    byte[] expected = {0x02, 0x03};
    assertArrayEquals(expected, uef.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_ptZV0() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    int offset = 1;
    int length = 3;
    uef.parseFromLocalFileData(data, offset, length);
    byte[] expected = new byte[] {2, 3, 4};
    assertArrayEquals(expected, uef.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLocalFileDataData_NullInput_Hbda0() {
    UnrecognizedExtraField uef = new UnrecognizedExtraField();
    uef.setLocalFileDataData(null);
    assertNull(uef.getLocalFileDataData());
}
}