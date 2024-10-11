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
public void testCreateExtraFieldNoDefaultNull_EJBm1() {
    ZipShort headerId = new ZipShort(2);
    ZipExtraField result = ExtraFieldUtils.createExtraFieldNoDefault(headerId);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeLocalFileDataData_EmptyArray_BHpY0() {
    ZipExtraField[] data = new ZipExtraField[0];
    byte[] result = ExtraFieldUtils.mergeLocalFileDataData(data);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_EmptyArray_HZwE0() {
    ZipExtraField[] data = new ZipExtraField[0];
    byte[] result = ExtraFieldUtils.mergeCentralDirectoryData(data);
    assertArrayEquals(new byte[0], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_lkzQ0_1() {
    ZipShort headerId = new ZipShort((short) 1);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_lkzQ0_2() {
    ZipShort headerId = new ZipShort((short) 1);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertEquals(headerId, field.getHeaderId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNull_dWmq1_1() {
    ZipShort headerId = new ZipShort((short) 2);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNull_dWmq1_2() {
    ZipShort headerId = new ZipShort((short) 2);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertTrue(field instanceof UnrecognizedExtraField);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNull_dWmq1_3() {
    ZipShort headerId = new ZipShort((short) 2);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertEquals(headerId, field.getHeaderId());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_Gugt0_IWJa0() {
    byte[] data = new byte[10];
    try {
        ZipExtraField[] result = ExtraFieldUtils.parse(data);
        assertNotNull(result);
    } catch (ZipException e) {
        fail("Should not throw ZipException");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParse_Gugt0_btiI1() throws ZipException {
    byte[] data = new byte[10];
    ZipExtraField[] result = ExtraFieldUtils.parse(data);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraField_lkzQ0() {
    ZipShort headerId = new ZipShort((short) 1);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);
    assertEquals(headerId, field.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateExtraFieldNull_dWmq1() {
    ZipShort headerId = new ZipShort((short) 2);
    ZipExtraField field = ExtraFieldUtils.createExtraField(headerId);
    assertNotNull(field);
    assertTrue(field instanceof UnrecognizedExtraField);
    assertEquals(headerId, field.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMergeCentralDirectoryData_NullArray_ACNE6_fid2() {
    try {
        ExtraFieldUtils.mergeCentralDirectoryData(null);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
        // expected
    }
}
}