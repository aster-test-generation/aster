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
public class Aster_AsiExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLinkedFile_xvih0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        String expected = "";
        String actual = asiExtraField.getLinkedFile();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_MNOt0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        byte[] centralDirectoryData = asiExtraField.getCentralDirectoryData();
        assertNotNull(centralDirectoryData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_eHFz0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        ZipShort headerId = asiExtraField.getHeaderId();
        assertNotNull(headerId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGroupId_vCPI0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int groupId = asiExtraField.getGroupId();
        assertEquals(0, groupId);
    }
@Test
@Timeout(value =32768, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMode_1_EJrN0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int mode = 0;
        int expected =32768;
        int actual = asiExtraField.getMode(mode);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value =32769, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMode_2_ZlDG1() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int mode =32769;
        int expected =32769;
        int actual = asiExtraField.getMode(mode);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getMode_3_JBTF2() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int mode =32770;
        int expected =32770;
        int actual = asiExtraField.getMode(mode);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength_SeGk0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        ZipShort localFileDataLength = asiExtraField.getLocalFileDataLength();
        assertEquals(14, localFileDataLength.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLength_QTlN0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        ZipShort zipShort = asiExtraField.getCentralDirectoryLength();
        assertNotNull(zipShort);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserId_cZwj0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        int userId = asiExtraField.getUserId();
        assertEquals(0, userId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLink_xfHN0() {
        AsiExtraField asiExtraField = new AsiExtraField();
        boolean result = asiExtraField.isLink();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLinkWithLinkedFile_SjqO1() {
        AsiExtraField asiExtraField = new AsiExtraField();
        asiExtraField.setLinkedFile("example.txt");
        boolean result = asiExtraField.isLink();
        assertTrue(result);
    }
}