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
public void testCreateExtraFieldNoDefault_NullHeaderId_ihHM0() {
    ZipShort headerId = null;
    ZipExtraField actual = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_KnownImplementation_JqwF2_1() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField actual = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNotNull(actual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_KnownImplementation_JqwF2_2() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField actual = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertEquals(headerId, actual.getHeaderId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNoDefault_UnknownImplementation_ybho3() {
    ZipShort headerId = new ZipShort(new byte[] { 0x03, 0x04 });
    ZipExtraField actual = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_EmptyArray_Kexw0() {
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(new ZipExtraField[0]);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_Empty_sjop0() {
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(new ZipExtraField[0]);
    assertEquals(0, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_NullField_EpKE4() {
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(new ZipExtraField[] { null });
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_null_sRVg0() {
    ZipShort headerId = null;
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNull(field);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_recognized_sgCC1_1() {
    ZipShort headerId = new ZipShort(0x0001);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_recognized_sgCC1_2() {
    ZipShort headerId = new ZipShort(0x0001);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertEquals(field.getClass(), ZipExtraField.class);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_unrecognized_NLnU2_1() {
    ZipShort headerId = new ZipShort(0x0002);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_unrecognized_NLnU2_2() {
    ZipShort headerId = new ZipShort(0x0002);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertEquals(field.getClass(), UnrecognizedExtraField.class);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_invalid_Dvws3() {
    ZipShort headerId = new ZipShort(0x0003);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNull(field);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_emptyData_Eipi0() throws ZipException {
    byte[] data = new byte[0];
    ZipExtraField[] fields = ExtraFieldUtils.parse(data);
    assertEquals(0, fields.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_nullData_VeYA1() throws ZipException {
    byte[] data = null;
    ZipExtraField[] fields = ExtraFieldUtils.parse(data);
    assertEquals(0, fields.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_invalidData_juOm2() throws ZipException {
    byte[] data = new byte[] { 1, 2, 3, 4, 5 };
    ZipExtraField[] fields = ExtraFieldUtils.parse(data);
    assertEquals(0, fields.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_SingleElement_GXwz1_caZo0() {
    ZipExtraField[] data = new ZipExtraField[1];
    data[0] = new UnparseableExtraFieldData();
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(data);
    assertEquals(10, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_MultipleElements_Iinc2_FlNI0() {
    ZipExtraField[] data = new ZipExtraField[3];
    data[0] = new UnparseableExtraFieldData();
    data[1] = new UnparseableExtraFieldData();
    data[2] = new UnparseableExtraFieldData();
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(data);
    assertEquals(60, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFillExtraFieldLocal_Jsba0_LteG0() throws ZipException {
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
public void testFillExtraFieldCentral_Esro1_OCej0() throws ZipException {
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
public void testCreateExtraFieldNoDefault_KnownImplementation_JqwF2() {
    ZipShort headerId = new ZipShort(new byte[] { 0x01, 0x02 });
    ZipExtraField actual = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNotNull(actual);
    assertEquals(headerId, actual.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_recognized_sgCC1() {
    ZipShort headerId = new ZipShort(0x0001);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);
    assertEquals(field.getClass(), ZipExtraField.class);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_headerId_unrecognized_NLnU2() {
    ZipShort headerId = new ZipShort(0x0002);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);
    assertEquals(field.getClass(), UnrecognizedExtraField.class);
}
}