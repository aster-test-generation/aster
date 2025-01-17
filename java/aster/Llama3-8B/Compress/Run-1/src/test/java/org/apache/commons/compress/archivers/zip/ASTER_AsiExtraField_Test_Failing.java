/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AsiExtraField_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_DUYU0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        byte[] result = asiExtraField.getCentralDirectoryData();
        byte[] expected = asiExtraField.getLocalFileDataData();
        assert result.equals(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData_xqQh0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        try {
            asiExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        } catch (ZipException e) {
            fail("parseFromCentralDirectoryData should not throw ZipException");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataValidData_HTMt0_DMZq0() {
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
    data[19] = 0x14;
    try {
        asiExtraField.parseFromLocalFileData(data, 0, 20);
    } catch (Exception e) {
        fail("No exception was expected");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLinkedFile_wkeB0_fid1() {
        AsiExtraField asiExtraField = new AsiExtraField();
        String result = asiExtraField.getLinkedFile();
        assertEquals("link", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModeForFile_uvlJ0_MQTd0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    int mode = asiExtraField.getMode(0);
    assertEquals(0, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModeForDirectory_qsFW2_WJdw0() {
    AsiExtraField asiExtraField = new AsiExtraField();
    asiExtraField.setDirectory(true);
    int mode = asiExtraField.getMode(0);
    assertEquals(0, mode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataValidData_HTMt0_DMZq0_fid1() {
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
    data[19] = 0x14;
    try {
        asiExtraField.parseFromLocalFileData(data, 0, 20);
    } catch (java.util.zip.ZipException e) {
        fail("java.util.zip.ZipException was expected");
    }
}
}