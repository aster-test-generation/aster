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
public void testCreateExtraFieldNoDefault_ValidHeaderId_xHcy0_1() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNotNull(extraField);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_ValidHeaderId_xHcy0_2() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertEquals(headerId.getValue(), extraField.getHeaderId().getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_InvalidHeaderId_fwjd1() {
    ZipShort headerId = new ZipShort(new byte[] { 0x03, 0x04 });
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(extraField);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_NullHeaderId_HDqb2() {
    ZipShort headerId = null;
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(extraField);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_EmptyHeaderId_wBIm3() {
    ZipShort headerId = new ZipShort(new byte[0]);
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(extraField);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_InvalidHeaderIdLength_oiKP4() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01 });
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(extraField);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_emptyData_LJBn0() {
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(new ZipExtraField[0]);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_nullField_IeXG4() {
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(new ZipExtraField[] { null });
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_nullFields_PqoZ5() {
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(new ZipExtraField[] { null, null });
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_emptyFields_csDM6() {
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(new ZipExtraField[] { });
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterWithInvalidClass_ZXxf1() {
    try {
        ExtraFieldUtils.register(Object.class);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterWithNullClass_OlcM4() {
    try {
        ExtraFieldUtils.register(null);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        assertEquals("Class cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterWithEnum_eyXi12() {
    try {
        ExtraFieldUtils.register(Enum.class);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Class must be concrete", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_Empty_OqZB0() {
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(new ZipExtraField[0]);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_NullField_SPhZ4() {
    ZipExtraField field = null;
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(new ZipExtraField[] { field });
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_NullFields_fcqi5() {
    ZipExtraField[] fields = null;
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(fields);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_EmptyFields_lGsT6() {
    ZipExtraField[] fields = new ZipExtraField[0];
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(fields);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_notNull_FwQM0_1() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_notNull_FwQM0_2() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertEquals(headerId, field.getHeaderId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_lWRT0() throws ZipException {
    byte[] data = new byte[10];
    ZipExtraField[] extraFields = ExtraFieldUtils.parse(data);
    assertEquals(0, extraFields.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRegisterWithNullHeaderId_AGyq6_anQV0() {
    try {
        ExtraFieldUtils.register(null);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Header ID cannot be null", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFillExtraField_Local_BWUf0_bvce0() throws ZipException {
    UnparseableExtraFieldData ze = new UnparseableExtraFieldData();
    byte[] data = new byte[10];
    int off = 0;
    int len = 10;
    boolean local = true;
    ZipExtraField result = ExtraFieldUtils.fillExtraField(ze, data, off, len, local);
    assertEquals(ze, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFillExtraField_CentralDirectory_dXqr1_MqDv0() throws ZipException {
    UnparseableExtraFieldData ze = new UnparseableExtraFieldData();
    byte[] data = new byte[10];
    int off = 0;
    int len = 10;
    boolean local = false;
    ZipExtraField result = ExtraFieldUtils.fillExtraField(ze, data, off, len, local);
    assertEquals(ze, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_ValidHeaderId_xHcy0() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField extraField = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNotNull(extraField);
    assertEquals(headerId.getValue(), extraField.getHeaderId().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_notNull_FwQM0() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);
    assertEquals(headerId, field.getHeaderId());
}
}