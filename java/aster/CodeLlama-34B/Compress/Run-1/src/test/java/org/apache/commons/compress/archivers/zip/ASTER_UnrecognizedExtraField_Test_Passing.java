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
public class Aster_UnrecognizedExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHeaderId_uejh0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    ZipShort zipShort = new ZipShort(new byte[]{1, 2, 3, 4}, 0);
    unrecognizedExtraField.setHeaderId(zipShort);
    assertEquals(zipShort, unrecognizedExtraField.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHeaderIdWithDifferentValue_fNaC1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    ZipShort zipShort = new ZipShort(new byte[]{5, 6, 7, 8}, 0);
    unrecognizedExtraField.setHeaderId(zipShort);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHeaderIdWithNull_QDBb2() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    ZipShort zipShort = null;
    unrecognizedExtraField.setHeaderId(zipShort);
    assertNull(unrecognizedExtraField.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNull_sSBZ5() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    ZipShort headerId = unrecognizedExtraField.getHeaderId();
    assertNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDataNull_JtLq1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] actual = unrecognizedExtraField.getCentralDirectoryData();
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_validData_acsK0() {
    UnrecognizedExtraField field = new UnrecognizedExtraField();
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int offset = 0;
    int length = 10;
    field.parseFromLocalFileData(data, offset, length);
    assertArrayEquals(data, field.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_invalidData_KXEK1() {
    UnrecognizedExtraField field = new UnrecognizedExtraField();
    byte[] data = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int offset = 0;
    int length = 10;
    field.parseFromLocalFileData(data, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithNullLocalData_JUgY1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] actual = unrecognizedExtraField.getLocalFileDataData();
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLocalFileDataData_Dehz0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    unrecognizedExtraField.setLocalFileDataData(data);
    assertArrayEquals(data, unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocalFileDataDataNull_lDqk2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        byte[] data = null;
        unrecognizedExtraField.setLocalFileDataData(data);
        assertNull(unrecognizedExtraField.getLocalFileDataData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_LocalDataNotNull_fEqr0_kWcC0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    unrecognizedExtraField.setLocalFileDataData(new byte[10]);
    ZipShort zipShort = unrecognizedExtraField.getLocalFileDataLength();
    assertEquals(10, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_LocalDataNull_oibA1_SQJW0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    unrecognizedExtraField.setLocalFileDataData(null);
    ZipShort zipShort = unrecognizedExtraField.getLocalFileDataLength();
    assertEquals(0, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDataNotNull_MABg0_MnvH0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] centralData = new byte[10];
    unrecognizedExtraField.setLocalFileDataData(centralData);
    byte[] actual = unrecognizedExtraField.getCentralDirectoryData();
    assertArrayEquals(centralData, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_duFw0_WVFf0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] localData = new byte[10];
    unrecognizedExtraField.setLocalFileDataData(localData);
    byte[] actual = unrecognizedExtraField.getLocalFileDataData();
    assertArrayEquals(localData, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithEmptyLocalData_WITL2_zcJr0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] localData = new byte[0];
    unrecognizedExtraField.setLocalFileDataData(localData);
    byte[] actual = unrecognizedExtraField.getLocalFileDataData();
    assertArrayEquals(localData, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithNonEmptyLocalData_QStN3_KpKQ0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] localData = new byte[10];
    localData[0] = 1;
    localData[1] = 2;
    localData[2] = 3;
    unrecognizedExtraField.setLocalFileDataData(localData);
    byte[] actual = unrecognizedExtraField.getLocalFileDataData();
    assertArrayEquals(localData, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithNullZipUtil_pWqO5_hjJE0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] localData = new byte[10];
    unrecognizedExtraField.setLocalFileDataData(localData);
    byte[] actual = unrecognizedExtraField.getLocalFileDataData();
    assertNotNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataWithInvalidLocalData_BTJd4_VAvK0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] localData = new byte[10];
    localData[0] = 1;
    localData[1] = 2;
    localData[2] = 3;
    unrecognizedExtraField.setLocalFileDataData(localData);
    byte[] actual = unrecognizedExtraField.getLocalFileDataData();
    assertNotEquals(localData, actual);
}
}