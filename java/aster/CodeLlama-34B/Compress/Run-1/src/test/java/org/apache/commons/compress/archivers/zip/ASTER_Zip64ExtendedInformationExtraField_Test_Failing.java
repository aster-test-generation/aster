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
public void testParseFromLocalFileData_EmptyBuffer_BJUQ0() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField();
    byte[] buffer = new byte[0];
    int offset = 0;
    int length = 0;
    try {
        zip64.parseFromLocalFileData(buffer, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("LFH must have both sizes", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DORJ1_1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
    assertEquals(1, diskStart.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DORJ1_2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
    assertEquals(1, diskStart.getIntValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DORJ1_3() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
    assertEquals(1, diskStart.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSize_DifferentValue_ArqC2_fid2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0));
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    zip64ExtendedInformationExtraField.setSize(size);
    assertNotEquals(size, zip64ExtendedInformationExtraField.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DORJ1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
    assertEquals(1, diskStart.getValue());
    assertEquals(1, diskStart.getIntValue());
    assertEquals(1, diskStart.hashCode());
    assertEquals(1, ZipLong.getValue(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    assertEquals(1, ZipLong.getValue(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
    assertEquals(1, ZipLong.getBytes(1));
    assertEquals(1, ZipLong.getValue(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSizeWithDifferentValues_WRXS1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0));
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
    assertNotEquals(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), zip64ExtendedInformationExtraField.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDiskStartNumberWithDifferentValue_NMBb2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong zipLong = new ZipLong(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0);
    zip64ExtendedInformationExtraField.setDiskStartNumber(zipLong);
    assertNotEquals(new ZipLong(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), zip64ExtendedInformationExtraField.getDiskStartNumber());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithDifferentValues_CHAQ1() {
Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0));
assertEquals(2, zip64ExtendedInformationExtraField.getHeaderId().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNullValues_hOCc2() {
Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null);
assertEquals(0, zip64ExtendedInformationExtraField.getHeaderId().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithInvalidValues_TnTY3() {
Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0));
assertEquals(0, zip64ExtendedInformationExtraField.getHeaderId().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNegativeValues_Albh5() {
Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0));
assertEquals(-1, zip64ExtendedInformationExtraField.getHeaderId().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength1_XpKG0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0), new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0));
    ZipShort centralDirectoryLength = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
    assertEquals(4, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength2_ebeV1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0), null);
    ZipShort centralDirectoryLength = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
    assertEquals(2, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength3_BytO2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0));
    ZipShort centralDirectoryLength = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
    assertEquals(2, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength5_fLqB4() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0), new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0), new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0), new ZipLong(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08}, 0));
    ZipShort centralDirectoryLength = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
    assertEquals(8, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRelativeHeaderOffsetWithDifferentValues_OUlk1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0));
    ZipEightByteInteger rho = new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    zip64ExtendedInformationExtraField.setRelativeHeaderOffset(rho);
    assertNotEquals(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset_mjQa0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    assertEquals(new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8}, 0), actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_sizeNull_kmIS1() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(null, new ZipEightByteInteger(new byte[] { 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10 }));
    byte[] data = zip64.getLocalFileDataData();
    assertEquals(0, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_compressedSizeNull_tMys2() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 }), null);
    byte[] data = zip64.getLocalFileDataData();
    assertEquals(0, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_sizeAndCompressedSizeZero_UTgi4() {
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 }), new ZipEightByteInteger(new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 }));
    byte[] data = zip64.getLocalFileDataData();
    assertEquals(0, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DORJ1_4() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
    assertEquals(1, ZipLong.getValue(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DORJ1_5_fid3() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
    assertEquals(1, ZipLong.getValue(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDiskStartNumber_DORJ1_6() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0), new ZipEightByteInteger(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 0));
    ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
    assertEquals(1, ZipLong.getBytes(1));}
}