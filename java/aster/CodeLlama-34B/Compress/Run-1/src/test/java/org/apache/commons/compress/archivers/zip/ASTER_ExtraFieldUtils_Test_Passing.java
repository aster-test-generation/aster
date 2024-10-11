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
public class Aster_ExtraFieldUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_InvalidHeaderId_WacE1() {
    ZipShort headerId = new ZipShort(new byte[] { 0x03, 0x04 });
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(extraField);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldWithRecognizedHeaderId_JElU0_1() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldWithRecognizedHeaderId_JElU0_2() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertTrue(field instanceof UnrecognizedExtraField);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldWithRecognizedHeaderId_JElU0_3() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertEquals(headerId, ((UnrecognizedExtraField) field).getHeaderId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_EmptyArray_whqV0() {
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(new ZipExtraField[0]);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_ExtraFieldDataWithNullLocalFileData_AmeW6() {
    ZipExtraField[] data = new ZipExtraField[2];
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_invalidData_lmNk2() {
    byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    boolean local = true;
    try {
        ExtraFieldUtils.parse(data, local);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("Bad extra field starting at 0.  Block length of 1027 bytes exceeds remaining data of 6 bytes.", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegister_nullClass_VcNx2() {
    try {
        ExtraFieldUtils.register(null);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS)
public void testParseWithEmptyData_ADBn1_sSxX0() throws ZipException {
    byte[] data = new byte[0];
    ZipExtraField[] expected = new ZipExtraField[0];
    ZipExtraField[] actual = ExtraFieldUtils.parse(data);
    assertArrayEquals(expected, actual);
}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testParse_OrHW0() throws ZipException {
        byte[] data = new byte[0];
        ZipExtraField[] result = ExtraFieldUtils.parse(data);
        assertNotNull(result);
    }
}