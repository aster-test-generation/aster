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
public class Aster_ResourceAlignmentExtraField_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData1_JMvX0() {
    ResourceAlignmentExtraField extraField = new ResourceAlignmentExtraField(10, true);
    byte[] data = extraField.getCentralDirectoryData();
    assertArrayEquals(new byte[] {10, 1}, data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_GVSU0() {
    ResourceAlignmentExtraField raef = new ResourceAlignmentExtraField(1, true);
    ZipShort headerId = raef.getHeaderId();
    assertEquals(1, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_jUWo0() {
    ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(10, true, 5);
    ZipShort zipShort = resourceAlignmentExtraField.getLocalFileDataLength();
    assertArrayEquals(ZipShort.getBytes(15), zipShort.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData1_FhiU0_obwW0() {
    ResourceAlignmentExtraField extraField = new ResourceAlignmentExtraField(10, true);
    byte[] data = extraField.getLocalFileDataData();
    assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0}, data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_ofSD0_nxUJ0() {
    ResourceAlignmentExtraField extraField = new ResourceAlignmentExtraField(4, true);
    byte[] buffer = new byte[10];
    try {
        extraField.parseFromLocalFileData(buffer, 0, 10);
    } catch (ZipException e) {
        fail("ZipException should not be thrown");
    }
    assertEquals(4, extraField.getAlignment());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData2_aRTZ1_SrUO0() {
    ResourceAlignmentExtraField extraField = new ResourceAlignmentExtraField(20, false, 5);
    byte[] data = extraField.getLocalFileDataData();
    int BASE_SIZE = 3; // Initialize BASE_SIZE
    assertArrayEquals(new byte[BASE_SIZE + 5], data);
}
}