/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AsiExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLinkedFile_DHdU0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    assertNull("Link should be null by default", asiExtraField.getLinkedFile());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithShortLength_xEff0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = new byte[1];
    int offset = 0;
    int length = 1;
    assertThrows(ZipException.class, () -> asiExtraField.parseFromLocalFileData(data, offset, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithInvalidChecksum_XKmr1() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int offset = 0;
    int length = 16;
    assertThrows(ZipException.class, () -> asiExtraField.parseFromLocalFileData(data, offset, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithInvalidLinkLength_onAS2() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int offset = 0;
    int length = 20;
    assertThrows(ZipException.class, () -> asiExtraField.parseFromLocalFileData(data, offset, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithValidData_cIap3() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int offset = 0;
    int length = 20;
    try {
        asiExtraField.parseFromLocalFileData(data, offset, length);
    } catch (ZipException e) {
        fail("Should not have thrown any exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithBoundaryLinkLength_NgBe4() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = {0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int offset = 0;
    int length = 30;
    try {
        asiExtraField.parseFromLocalFileData(data, offset, length);
    } catch (ZipException e) {
        fail("Should not have thrown any exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithNegativeLinkLength_Eaib6() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = {0, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int offset = 0;
    int length = 20;
    assertThrows(ZipException.class, () -> asiExtraField.parseFromLocalFileData(data, offset, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_jmdQ0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getCentralDirectoryData();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_UBMU0_1() throws Exception {
        AsiExtraField asiExtraField = new AsiExtraField();
        ZipShort result = asiExtraField.getHeaderId();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_UBMU0_2() throws Exception {
        AsiExtraField asiExtraField = new AsiExtraField();
        ZipShort result = asiExtraField.getHeaderId();
        assertEquals(AsiExtraField.HEADER_ID, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGroupId_vwWL0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    int expected = 0; // Assuming default gid is 0 since not shown how it's set
    assertEquals(expected, asiExtraField.getGroupId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetMode_wmRa0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    int expectedMode = 5;
    asiExtraField.setMode(expectedMode);
    assertEquals(expectedMode, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_UnNb0_1() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort result = asiExtraField.getLocalFileDataLength();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_UnNb0_2() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort result = asiExtraField.getLocalFileDataLength();
    assertTrue(result.getValue() > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_qYiI0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    ZipShort expected = asiExtraField.getLocalFileDataLength();
    ZipShort actual = asiExtraField.getCentralDirectoryLength();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUserId_geiY0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    int expected = 0; // Assuming default uid is 0 since not shown in the class
    assertEquals(expected, asiExtraField.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ValidInput_qqON0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] buffer = new byte[] {0x01, 0x02, 0x03, 0x04};
    int offset = 0;
    int length = buffer.length;
    try {
        asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        assertTrue(true); // Assuming parseFromLocalFileData does not throw an exception
    } catch (ZipException e) {
        fail("Should not have thrown ZipException");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_EWJq0_1() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_EWJq0_2() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] result = asiExtraField.getLocalFileDataData();
    assertTrue(result.length > 0);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMode_GYve0() throws Exception {
    AsiExtraField asiExtraField = new AsiExtraField();
    assertEquals(0, asiExtraField.getMode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneMethod_PEyK0_1() throws Exception {
    AsiExtraField original = new AsiExtraField();
    AsiExtraField cloned = (AsiExtraField) original.clone();
    assertNotNull(cloned);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneMethod_PEyK0_2() throws Exception {
    AsiExtraField original = new AsiExtraField();
    AsiExtraField cloned = (AsiExtraField) original.clone();
    assertNotSame(original, cloned);}
}