/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import org.apache.commons.compress.utils.ByteUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Zip64ExtendedInformationExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_SizeAndCompressedSizeNotNull_vuDZ0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
    byte[] result = zip64.getCentralDirectoryData();
    Assertions.assertEquals(16, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_SizeIsNull_nydE1() {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(null, compressedSize, null, null);
    byte[] result = zip64.getCentralDirectoryData();
    Assertions.assertEquals(8, result.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLengthNullSize_HZzr0() {
        ZipEightByteInteger size = null;
        Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, new ZipEightByteInteger(0), new ZipEightByteInteger(0), new ZipLong(0));
        ZipShort result = zip64.getLocalFileDataLength();
        assertEquals(0, result.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLengthNotNullSize_XMnx1() {
        ZipEightByteInteger size = new ZipEightByteInteger(1);
        Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, new ZipEightByteInteger(0), new ZipEightByteInteger(0), new ZipLong(0));
        ZipShort result = zip64.getLocalFileDataLength();
        assertEquals(16, result.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize_zsFK0() {
        Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        zip64.setSize(size);
        assertEquals(size, zip64.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_VaeH0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
        ZipLong diskStart = new ZipLong(new byte[4], 0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipEightByteInteger result = zip64ExtendedInformationExtraField.getSize();
        assertEquals(size, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDiskStartNumber_wbgK0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
        ZipLong diskStart = new ZipLong(new byte[8]);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipLong result = zip64ExtendedInformationExtraField.getDiskStartNumber();
        assert result.getValue() == diskStart.getValue();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRelativeHeaderOffset_szql0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
        ZipLong diskStart = new ZipLong(0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipEightByteInteger result = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
        assertEquals(relativeHeaderOffset, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_SspE0() {
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(new byte[8]));
        zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
        assertSame(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRelativeHeaderOffset_zLkx0() {
        ZipEightByteInteger rho = new ZipEightByteInteger(new byte[8], 0);
        Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(new byte[8]));
        zip64.setRelativeHeaderOffset(rho);
        assertSame(rho, zip64.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataNullSizeAndCompressedSize_GrFj0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    byte[] result = zip64ExtendedInformationExtraField.getLocalFileDataData();
    assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedSize_TsEY0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
        ZipLong diskStart = new ZipLong(new byte[4], 0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipEightByteInteger result = zip64ExtendedInformationExtraField.getCompressedSize();
        assertEquals(compressedSize, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_SizeNull_SZsu1_PHns0() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    ZipEightByteInteger result = zip64.getCompressedSize();
    assertEquals(null, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataDataSizeAndCompressedSize_FoBz4_anGg0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8]);
    ZipLong diskStart = new ZipLong(1);
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, new ZipEightByteInteger(new byte[8]), diskStart);
    byte[] result = zip64ExtendedInformationExtraField.getLocalFileDataData();
    assertArrayEquals(new byte[16], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataValidData_nIZy0_xSTi0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    byte[] buffer = new byte[20];
    buffer[0] = 1;
    buffer[1] = 2;
    buffer[2] = 3;
    buffer[3] = 4;
    buffer[4] = 5;
    buffer[5] = 6;
    buffer[6] = 7;
    buffer[7] = 8;
    buffer[8] = 9;
    buffer[9] = 10;
    buffer[10] = 11;
    buffer[11] = 12;
    buffer[12] = 13;
    buffer[13] = 14;
    buffer[14] = 15;
    buffer[15] = 16;
    buffer[16] = 17;
    buffer[17] = 18;
    buffer[18] = 19;
    buffer[19] = 20;
    try {
        zip64ExtendedInformationExtraField.parseFromLocalFileData(buffer, 0, 20);
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData4_tPpn3_qauK0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    try {
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32}, 0, 32);
    } catch (ZipException e) {
        fail("Expected no exception but got: " + e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_AllFieldsPresent_VsIk0_fIrH0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(new byte[4], 0));
    try {
        zip64ExtendedInformationExtraField.getCompressedSize();
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_NoUncompressedSize_uvNH1_SqnV0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(new byte[4], 0));
    try {
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, true);
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_NoRelativeHeaderOffset_bqPO3_gyMT0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(new byte[4], 0));
    try {
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, false, true);
    } catch (ZipException e) {
    }
}
}