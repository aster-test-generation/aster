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
public class Aster_Zip64ExtendedInformationExtraField_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData1_RwmU10() {
    ZipEightByteInteger size = new ZipEightByteInteger(110);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(210);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
    byte[] data = zip64.getCentralDirectoryData();
    assertArrayEquals(new byte[16], data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData2_RRVB1() {
    ZipEightByteInteger size = new ZipEightByteInteger(110);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(210);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(310);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, null);
    byte[] data = zip64.getCentralDirectoryData();
    assertArrayEquals(new byte[24], data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData3_SKKG2() {
    ZipEightByteInteger size = new ZipEightByteInteger(110);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(210);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(310);
    ZipLong diskStart = new ZipLong(410);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    byte[] data = zip64.getCentralDirectoryData();
    assertArrayEquals(new byte[28], data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData3_fBUb2_RVlz0_1() throws ZipException {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    byte[] buffer = new byte[20];
    zip64.parseFromCentralDirectoryData(buffer, 0, 20);
    assertEquals(new ZipEightByteInteger(buffer, 0).getValue(), zip64.getSize().getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData3_fBUb2_RVlz0_2() throws ZipException {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    byte[] buffer = new byte[20];
    zip64.parseFromCentralDirectoryData(buffer, 0, 20);
    assertEquals(new ZipEightByteInteger(buffer, 4).getValue(), zip64.getCompressedSize().getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData1_RwmU0() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
    byte[] data = zip64.getCentralDirectoryData();
    assertArrayEquals(new byte[16], data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData2_RRVB1_fid2() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(30);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, null);
    byte[] data = zip64.getCentralDirectoryData();
    assertArrayEquals(new byte[24], data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData3_SKKG2_fid2() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(30);
    ZipLong diskStart = new ZipLong(40);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    byte[] data = zip64.getCentralDirectoryData();
    assertArrayEquals(new byte[28], data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_lrPZ0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[] {});
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[] {});
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[] {});
    ZipLong diskStart = new ZipLong(new byte[] {});
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    ZipShort headerId = zip64.getHeaderId();
    assertNotNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_withSize_ocFY0_fid2() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(10);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
    ZipLong diskStart = new ZipLong(10);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    ZipShort result = zip64.getLocalFileDataLength();
    assertEquals(2 * 4, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength1_qumb0_fid2() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(30);
    ZipLong diskStart = new ZipLong(40);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    ZipShort result = zip64.getCentralDirectoryLength();
    assertEquals(44, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength2_sQEY1_fid2() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize);
    ZipShort result = zip64.getCentralDirectoryLength();
    assertEquals(12, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength4_wGLd3() {
    ZipEightByteInteger size = new ZipEightByteInteger(10);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, null, null, null);
    ZipShort result = zip64.getCentralDirectoryLength();
    assertEquals(4, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength5_ymAw4() {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(null, compressedSize, null, null);
    ZipShort result = zip64.getCentralDirectoryLength();
    assertEquals(4, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_InsufficientBuffer_RXWH1_PBJf0_fid2() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    byte[] buffer = new byte[4];
    try {
        zip64.parseFromLocalFileData(buffer, 0, 4);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("Central Directory Entry must have both size and compressed size", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData3_oLgd2_pgnx0_fid2() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, null);
    try {
        zip64.getLocalFileDataData();
        fail();
    } catch (IllegalArgumentException e) {
        assertEquals("LFH must have both sizes", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData4_NTpn3_MjKd0_fid2() {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(null, compressedSize, null, null);
    try {
        zip64.getLocalFileDataData();
        fail();
    } catch (IllegalArgumentException e) {
        assertEquals("LFH must have both sizes", e.getMessage());
    }
}
}