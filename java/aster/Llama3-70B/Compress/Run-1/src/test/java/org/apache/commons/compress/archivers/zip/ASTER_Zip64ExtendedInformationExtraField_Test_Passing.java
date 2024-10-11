/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import org.apache.commons.compress.utils.ByteUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Zip64ExtendedInformationExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_uZjm0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8]);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8]);
    ZipLong diskStart = new ZipLong(new byte[8]);
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
    assertNotNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData1_txio0() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
    byte[] data = zip64.getCentralDirectoryData();
    assertEquals(16, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData2_GlNa1() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(30);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, null);
    byte[] data = zip64.getCentralDirectoryData();
    assertEquals(24, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData3_FmBl2() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(30);
    ZipLong diskStart = new ZipLong(40);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    byte[] data = zip64.getCentralDirectoryData();
    assertEquals(28, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_withSize_LiIy0() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(10);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
    ZipLong diskStart = new ZipLong(10);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    ZipShort result = zip64.getLocalFileDataLength();
    assertEquals(16, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_withoutSize_oWOS1() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    ZipShort result = zip64.getLocalFileDataLength();
    assertEquals(0, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize_SLGy0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipLong diskStart = new ZipLong(1234567890);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertSame(size, extraField.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DVqm0() {
    ZipEightByteInteger size = new ZipEightByteInteger(1L);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(2L);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(3L);
    ZipLong diskStart = new ZipLong(4L);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertEquals(diskStart.getValue(), zip64.getDiskStartNumber().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength1_zRQG0() {
    ZipEightByteInteger size = new ZipEightByteInteger(10L);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20L);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(30L);
    ZipLong diskStart = new ZipLong(40L);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    ZipShort result = extraField.getCentralDirectoryLength();
    assertEquals(28, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength2_WMvV1() {
    ZipEightByteInteger size = new ZipEightByteInteger(10L);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20L);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    ZipShort result = extraField.getCentralDirectoryLength();
    assertEquals(16, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength3_NupW2() {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    ZipShort result = extraField.getCentralDirectoryLength();
    assertEquals(0, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength5_VwAY4() {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20L);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, compressedSize, null, null);
    ZipShort result = extraField.getCentralDirectoryLength();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_InvalidBuffer_ZCCU1() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    byte[] buffer = new byte[1];
    try {
        zip64.parseFromLocalFileData(buffer, 0, 1);
        fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset_NZTB0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipLong diskStart = new ZipLong(1);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertSame(relativeHeaderOffset, extraField.getRelativeHeaderOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_maEa0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[] {9, 10, 11, 12, 13, 14, 15, 16});
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[] {17, 18, 19, 20, 21, 22, 23, 24});
    ZipLong diskStart = new ZipLong(1234567890);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertSame(compressedSize, extraField.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData1_TreE0() {
    ZipEightByteInteger size = new ZipEightByteInteger(10L);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20L);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
    byte[] data = zip64.getLocalFileDataData();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData4_hhkw3() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    byte[] data = zip64.getLocalFileDataData();
    assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSize_qbVL0_FRfM0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[] {0, 0, 0, 0, 0, 0, 0, 10});
    zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
    assertSame(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData3_hgyW2_kbjP0() {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20L);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(null, compressedSize, null, null);
    try {
        zip64.reparseCentralDirectoryData(false, true, false, false);
    } catch (ZipException e) {
        assertEquals("Central directory zip64 extended information extra field's length doesn't match central directory data.", e.getMessage());
    }
}
}