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
public class Aster_AsiExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLinkedFile_wkeB0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        String result = asiExtraField.getLinkedFile();
        assertEquals("", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataInvalidLength_PNeP1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = new byte[10];
    try {
        asiExtraField.parseFromLocalFileData(data, 0, 10);
        fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataInvalidChecksum_eAjf2() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = new byte[20];
    data[0] = 0x01;
    data[1] = 0x02;
    data[2] = 0x03;
    data[3] = 0x04;
    data[4] = 0x05;
    data[5] = 0x06;
    data[6] = 0x07;
    data[7] = 0x08;
    data[8] = 0x09;
    data[9] = 0x0a;
    data[10] = 0x0b;
    data[11] = 0x0c;
    data[12] = 0x0d;
    data[13] = 0x0e;
    data[14] = 0x0f;
    data[15] = 0x10;
    data[16] = 0x11;
    data[17] = 0x12;
    data[18] = 0x13;
    data[19] = 0x15;
    try {
        asiExtraField.parseFromLocalFileData(data, 0, 20);
        fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataInvalidLinkArrayLength_WvVw3() {
    AsiExtraField asiExtraField = new AsiExtraField();
    byte[] data = new byte[20];
    data[0] = 0x01;
    data[1] = 0x02;
    data[2] = 0x03;
    data[3] = 0x04;
    data[4] = 0x05;
    data[5] = 0x06;
    data[6] = 0x07;
    data[7] = 0x08;
    data[8] = 0x09;
    data[9] = 0x0a;
    data[10] = 0x0b;
    data[11] = 0x0c;
    data[12] = 0x0d;
    data[13] = 0x0e;
    data[14] = 0x0f;
    data[15] = 0x10;
    data[16] = 0x11;
    data[17] = 0x12;
    data[18] = 0x13;
    data[19] = 0x20;
    try {
        asiExtraField.parseFromLocalFileData(data, 0, 20);
        fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGroupId_Dqua0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int expected = 0; // replace with your expected value
        int actual = asiExtraField.getGroupId();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLinkedFile_gQfM0_1() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setLinkedFile("test");
        assertEquals("test", asiExtraField.getLinkedFile());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLinkedFile_gQfM0_2() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setLinkedFile("test");
        assertNotNull(asiExtraField.getMode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLength_qANO0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        ZipShort result = asiExtraField.getCentralDirectoryLength();
        ZipShort expected = asiExtraField.getLocalFileDataLength();
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserId_NdDA0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int expected = 0; // replace with your expected value
        int actual = asiExtraField.getUserId();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGroupId_zuJj1() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setGroupId(10);
        assertEquals(10, asiExtraField.getGroupId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLinkTrue_aUie0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setLinkedFile("test");
        assertTrue(asiExtraField.isLink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLinkFalse_qFxu1() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setLinkedFile("");
        assertFalse(asiExtraField.isLink());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMode_NUPa0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int mode = asiExtraField.getMode();
        assertEquals(0, mode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModeForFile_uvlJ32768_MQTd32768() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int mode = asiExtraField.getMode(32768);
    assertEquals(32768, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModeForDirectory_qsFW2_WJdw16384() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setDirectory(true);
    int mode = asiExtraField.getMode(16384);
    assertEquals(16384, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDirectory_LmyW0_vNUs1() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setDirectory(true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUserId_Wlhd0_yKnN0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setUserId(10);
    assertEquals(10, asiExtraField.getUserId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_Cfxk0_zqJA0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    AsiExtraField cloned = (AsiExtraField) asiExtraField.clone();
    assert cloned != asiExtraField;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLinkedFile_gQfM0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setLinkedFile("test");
        assertEquals("test", asiExtraField.getLinkedFile());
        assertNotNull(asiExtraField.getMode());
    }
}