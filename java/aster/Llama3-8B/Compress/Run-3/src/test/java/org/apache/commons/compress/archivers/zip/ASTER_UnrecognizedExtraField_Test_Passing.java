/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnrecognizedExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHeaderId_NKfD0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort zipShort = new ZipShort(new byte[2], 0);
        unrecognizedExtraField.setHeaderId(zipShort);
        assertEquals(zipShort, unrecognizedExtraField.getHeaderId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData1_ANne0() {
    UnrecognizedExtraField obj = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    int offset = 0;
    int length = 10;
    obj.parseFromCentralDirectoryData(data, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData2_FOpW1() {
    UnrecognizedExtraField obj = new UnrecognizedExtraField();
    byte[] data = new byte[10];
    int offset = 5;
    int length = 5;
    obj.parseFromCentralDirectoryData(data, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_mLCN0() {
        UnrecognizedExtraField uf = new UnrecognizedExtraField();
        byte[] data = {1, 2, 3, 4, 5};
        int offset = 0;
        int length = 5;
        uf.parseFromLocalFileData(data, offset, length);
        byte[] expected = Arrays.copyOfRange(data, offset, offset + length);
        assertArrayEquals(expected, uf.getLocalFileDataData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryDataWhenCentralDataNull_kLDR1() {
    UnrecognizedExtraField unrecogExtraField = new UnrecognizedExtraField();
    byte[] result = unrecogExtraField.getCentralDirectoryData();
    assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocalFileDataData_eChq0() {
        UnrecognizedExtraField uf = new UnrecognizedExtraField();
        byte[] data = {1, 2, 3, 4, 5};
        uf.setLocalFileDataData(data);
        byte[] expected = ZipUtil.copy(data);
        assertArrayEquals(expected, uf.getLocalFileDataData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength_LocalDataNotNull_IHGs0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        byte[] localData = new byte[10];
        ZipShort result = unrecognizedExtraField.getLocalFileDataLength();
        assertEquals(10, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength_LocalDataNull_GGDE1() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort result = unrecognizedExtraField.getLocalFileDataLength();
        assertEquals(0, result.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLengthWhenCentralDataIsNull_PGDs1() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort result = unrecognizedExtraField.getCentralDirectoryLength();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCentralDirectoryData_Emrj0_NKnY0() {
    UnrecognizedExtraField unrecognisedExtraField = new UnrecognizedExtraField();
    byte[] data = new byte[] {1, 2, 3, 4, 5};
    unrecognisedExtraField.setCentralDirectoryData(data);
    assert Arrays.equals(unrecognisedExtraField.getCentralDirectoryLength().getBytes(), data);
}
}