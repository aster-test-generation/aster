/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnrecognizedExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHeaderId_BGPB0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    ZipShort zipShort = new ZipShort(new byte[] { 0x01, 0x02 });
    unrecognizedExtraField.setHeaderId(zipShort);
    assertEquals(zipShort, unrecognizedExtraField.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHeaderIdWithDifferentValue_qntH1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    ZipShort zipShort = new ZipShort(new byte[] { 0x03, 0x04 });
    unrecognizedExtraField.setHeaderId(zipShort);
    assertNotEquals(zipShort, unrecognizedExtraField.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHeaderIdWithNull_tOuo2() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    unrecognizedExtraField.setHeaderId(null);
    assertNull(unrecognizedExtraField.getHeaderId());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCentralDirectoryData_ckGp0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    unrecognizedExtraField.setCentralDirectoryData(data);
    assertEquals(data, unrecognizedExtraField.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCentralDirectoryDataWithNull_maNP1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    unrecognizedExtraField.setCentralDirectoryData(null);
    assertNull(unrecognizedExtraField.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCentralDirectoryDataWithEmptyArray_dDvG2() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[0];
    unrecognizedExtraField.setCentralDirectoryData(data);
    assertEquals(data, unrecognizedExtraField.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCentralDirectoryDataWithNonEmptyArray_uTeb3() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    data[0] = 1;
    unrecognizedExtraField.setCentralDirectoryData(data);
    assertEquals(data, unrecognizedExtraField.getCentralDirectoryData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ValidData_YvEz0() {
    UnrecognizedExtraField field = new UnrecognizedExtraField();
    byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    int offset = 0;
    int length = data.length;
    field.parseFromCentralDirectoryData(data, offset, length);
    assertArrayEquals(data, field.getCentralDirectoryData());
    assertArrayEquals(data, field.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_InvalidData_eKDx1() {
    UnrecognizedExtraField field = new UnrecognizedExtraField();
    byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    int offset = 0;
    int length = data.length;
    field.parseFromCentralDirectoryData(data, offset, length);
    assertArrayEquals(data, field.getCentralDirectoryData());
    assertArrayEquals(null, field.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_dRkq0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 10;
    unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
    assertEquals(data, unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithOffset_jbpz1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    int offset = 5;
    int length = 5;
    unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
    assertEquals(Arrays.copyOfRange(data, offset, offset + length), unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithLength_VHdb2() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 5;
    unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
    assertEquals(Arrays.copyOfRange(data, offset, offset + length), unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithNullData_DPPg4() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = null;
    int offset = 0;
    int length = 10;
    unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
    assertNull(unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithEmptyData_wxZb5() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[0];
    int offset = 0;
    int length = 0;
    unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
    assertNull(unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithNegativeOffset_Oudi6() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    int offset = -1;
    int length = 10;
    unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
    assertNull(unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithNegativeLength_PAyK7() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    int offset = 0;
    int length = -1;
    unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
    assertNull(unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_centralDataNull_wexI1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] actual = unrecognizedExtraField.getCentralDirectoryData();
    assertNull(actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_kfDu0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);
        assertEquals(0, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithNonZeroValue_uERH1() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);
        assertEquals(1, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithNegativeValue_Evfr2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);
        assertEquals(-1, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithMaxValue_qZbs3() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);
        assertEquals(Integer.MAX_VALUE, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithMinValue_nQjY4() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);
        assertEquals(Integer.MIN_VALUE, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithNullHeaderId_VIsH5() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithInvalidHeaderIdAndNonZeroValue_Tquz8() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);
        assertEquals(2, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithInvalidHeaderIdAndNegativeValue_VjSE9() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);
        assertEquals(-2, headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLocalFileDataData_FeJD0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    unrecognizedExtraField.setLocalFileDataData(data);
    assertEquals(data, unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetLocalFileDataData_mtDP1() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    unrecognizedExtraField.setLocalFileDataData(data);
    assertEquals(data, unrecognizedExtraField.getLocalFileDataData());
    try {
        unrecognizedExtraField.setLocalFileDataData(null);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
    try {
        unrecognizedExtraField.setLocalFileDataData(new byte[0]);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
    data = new byte[10];
    unrecognizedExtraField.setLocalFileDataData(data);
    assertEquals(data, unrecognizedExtraField.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_SCVF0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    ZipShort zipShort = unrecognizedExtraField.getLocalFileDataLength();
    assertEquals(0, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ValidData_YvEz0_1() {
    UnrecognizedExtraField field = new UnrecognizedExtraField();
    byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    int offset = 0;
    int length = data.length;
    field.parseFromCentralDirectoryData(data, offset, length);
    assertArrayEquals(data, field.getCentralDirectoryData());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_ValidData_YvEz0_2() {
    UnrecognizedExtraField field = new UnrecognizedExtraField();
    byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    int offset = 0;
    int length = data.length;
    field.parseFromCentralDirectoryData(data, offset, length);
    assertArrayEquals(data, field.getLocalFileDataData());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_InvalidData_eKDx1_2() {
    UnrecognizedExtraField field = new UnrecognizedExtraField();
    byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A };
    int offset = 0;
    int length = data.length;
    field.parseFromCentralDirectoryData(data, offset, length);
    assertArrayEquals(null, field.getLocalFileDataData());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_kfDu0_1() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertNotNull(headerId);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_kfDu0_2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertEquals(0, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithNonZeroValue_uERH1_2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertEquals(1, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithNegativeValue_Evfr2_2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertEquals(-1, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithMaxValue_qZbs3_2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertEquals(Integer.MAX_VALUE, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithMinValue_nQjY4_2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertEquals(Integer.MIN_VALUE, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithInvalidHeaderIdAndNonZeroValue_Tquz8_2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertEquals(2, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithInvalidHeaderIdAndNegativeValue_VjSE9_2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort headerId = unrecognizedExtraField.getHeaderId();
        assertEquals(-2, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_localFileDataNotNull_fCXa2_Prti0() {
    UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
    byte[] localFileData = new byte[10];
    unrecognizedExtraField.setCentralDirectoryData(localFileData);
    byte[] actual = unrecognizedExtraField.getCentralDirectoryData();
    assertArrayEquals(localFileData, actual);
}
}