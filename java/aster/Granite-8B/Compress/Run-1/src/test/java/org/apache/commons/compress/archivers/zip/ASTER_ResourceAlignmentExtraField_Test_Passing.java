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
public class Aster_ResourceAlignmentExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllowMethodChange_eQev0() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true);
        boolean result = resourceAlignmentExtraField.allowMethodChange();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllowMethodChangeWithPadding_QAQn1() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true, 2);
        boolean result = resourceAlignmentExtraField.allowMethodChange();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllowMethodChangeWithAlignmentOnly_PDnh3() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1);
        boolean result = resourceAlignmentExtraField.allowMethodChange();
        assertFalse(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryDataWithoutParameters_CKFf3() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField();
        byte[] expected = {0, 0};
        assertArrayEquals(expected, resourceAlignmentExtraField.getCentralDirectoryData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_RkoF0() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true);
        ZipShort headerId = resourceAlignmentExtraField.getHeaderId();
        assertNotNull(headerId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId2_hlyX1() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, false);
        ZipShort headerId = resourceAlignmentExtraField.getHeaderId();
        assertNotNull(headerId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId3_aPux2() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1);
        ZipShort headerId = resourceAlignmentExtraField.getHeaderId();
        assertNotNull(headerId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId4_qWAc3() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true, 1);
        ZipShort headerId = resourceAlignmentExtraField.getHeaderId();
        assertNotNull(headerId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId5_tGnw4() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField();
        ZipShort headerId = resourceAlignmentExtraField.getHeaderId();
        assertNotNull(headerId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength_VTtP0() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true, 2);
        ZipShort localFileDataLength = resourceAlignmentExtraField.getLocalFileDataLength();
        assertEquals(4, localFileDataLength.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength2_uKxo1() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true);
        ZipShort localFileDataLength = resourceAlignmentExtraField.getLocalFileDataLength();
        assertEquals(2, localFileDataLength.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength3_urQE2() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1);
        ZipShort localFileDataLength = resourceAlignmentExtraField.getLocalFileDataLength();
        assertEquals(2, localFileDataLength.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCentralDirectoryLength_SGJC0() {
		ResourceAlignmentExtraField extraField = new ResourceAlignmentExtraField(1, false);
		ZipShort centralDirectoryLength = extraField.getCentralDirectoryLength();
		assertEquals(2, centralDirectoryLength.getValue());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData_omwO0() throws ZipException {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, false);
        byte[] buffer = new byte[10];
        resourceAlignmentExtraField.parseFromCentralDirectoryData(buffer, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData2_sogP1() throws ZipException {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true);
        byte[] buffer = new byte[10];
        resourceAlignmentExtraField.parseFromCentralDirectoryData(buffer, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData3_lqGE2() throws ZipException {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1);
        byte[] buffer = new byte[10];
        resourceAlignmentExtraField.parseFromCentralDirectoryData(buffer, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData4_eCoq3() throws ZipException {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true, 1);
        byte[] buffer = new byte[10];
        resourceAlignmentExtraField.parseFromCentralDirectoryData(buffer, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAlignment_GXCv0() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true);
        short alignment = resourceAlignmentExtraField.getAlignment();
        assertEquals((short) 1, alignment);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAlignment2_PFsS1() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1);
        short alignment = resourceAlignmentExtraField.getAlignment();
        assertEquals((short) 1, alignment);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAlignment3_WlmV2() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField();
        short alignment = resourceAlignmentExtraField.getAlignment();
        assertEquals((short) 0, alignment);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetAlignment4_QGrK3() {
        ResourceAlignmentExtraField resourceAlignmentExtraField = new ResourceAlignmentExtraField(1, true, 1);
        short alignment = resourceAlignmentExtraField.getAlignment();
        assertEquals((short) 1, alignment);
    }
}