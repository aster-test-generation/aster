/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
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
public void testGetCentralDirectoryData_AllFieldsNonNull_iwEM0() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(100),
            new ZipEightByteInteger(50),
            new ZipEightByteInteger(20),
            new ZipLong(10)
    );
    byte[] expected = new byte[16];
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 100}, 0, expected, 0, 8);
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 50}, 0, expected, 8, 8);
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 20}, 0, expected, 16, 8);
    System.arraycopy(new byte[]{0, 0, 0, 10}, 0, expected, 24, 4);
    byte[] actual = field.getCentralDirectoryData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_SizeAndCompressedSizeNull_vyAK1() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            null,
            null,
            new ZipEightByteInteger(20),
            new ZipLong(10)
    );
    byte[] expected = new byte[16];
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0, expected, 0, 8);
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0, expected, 8, 8);
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 20}, 0, expected, 16, 8);
    System.arraycopy(new byte[]{0, 0, 0, 10}, 0, expected, 24, 4);
    byte[] actual = field.getCentralDirectoryData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_RelativeHeaderOffsetNull_fVtt2() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(100),
            new ZipEightByteInteger(50),
            null,
            new ZipLong(10)
    );
    byte[] expected = new byte[16];
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 100}, 0, expected, 0, 8);
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 50}, 0, expected, 8, 8);
    System.arraycopy(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0, expected, 16, 8);
    System.arraycopy(new byte[]{0, 0, 0, 10}, 0, expected, 24, 4);
    byte[] actual = field.getCentralDirectoryData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_Gfod0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
    assertEquals(headerId.getValue(), 10);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithDifferentValues_VLGe1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
    assertEquals(headerId.getValue(), 20);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNullValues_yEPz2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null);
    ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
    assertNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_sizeNull_tQEF1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null);
    ZipShort zipShort = zip64ExtendedInformationExtraField.getLocalFileDataLength();
    assertEquals(0, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSize_XMXa0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50));
    ZipEightByteInteger size = new ZipEightByteInteger(200);
    zip64ExtendedInformationExtraField.setSize(size);
    assertEquals(size, zip64ExtendedInformationExtraField.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizeWithNull_kQpb1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50));
    zip64ExtendedInformationExtraField.setSize(null);
    assertNull(zip64ExtendedInformationExtraField.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizeWithSameValue_rIVB2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50));
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    zip64ExtendedInformationExtraField.setSize(size);
    assertEquals(size, zip64ExtendedInformationExtraField.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSizeWithDifferentValue_gyiJ3() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50));
    ZipEightByteInteger size = new ZipEightByteInteger(200);
    zip64ExtendedInformationExtraField.setSize(size);
    assertNotEquals(size, zip64ExtendedInformationExtraField.getSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_sizeAndCompressedSizeNotNull_dkJJ0() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(100), new ZipEightByteInteger(50), null, null);
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(8, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_sizeAndCompressedSizeNull_AQPa1() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            null, null, null, null);
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_sizeAndRelativeHeaderOffsetNotNull_MZVF2() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(100), null, new ZipEightByteInteger(50), null);
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(8, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_sizeAndDiskStartNotNull_rIdN3() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(100), null, null, new ZipLong(1));
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(8, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_compressedSizeAndRelativeHeaderOffsetNotNull_IIIv4() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            null, new ZipEightByteInteger(50), new ZipEightByteInteger(100), null);
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(8, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_compressedSizeAndDiskStartNotNull_odXf5() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            null, new ZipEightByteInteger(50), null, new ZipLong(1));
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(8, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_relativeHeaderOffsetAndDiskStartNotNull_Jifj6() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            null, null, new ZipEightByteInteger(100), new ZipLong(1));
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(8, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_allFieldsNotNull_uBHL7() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(
            new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(100), new ZipLong(1));
    ZipShort centralDirectoryLength = field.getCentralDirectoryLength();
    assertEquals(16, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSize_hAhW0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger size = zip64ExtendedInformationExtraField.getSize();
    assertEquals(100, size.getValue().longValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSizeWithDifferentConstructor_WcdW1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50));
    ZipEightByteInteger size = zip64ExtendedInformationExtraField.getSize();
    assertEquals(100, size.getValue().longValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSizeWithNullSize_ampn2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger size = zip64ExtendedInformationExtraField.getSize();
    assertNull(size);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSizeWithNullCompressedSize_OyqG3() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), null, new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger size = zip64ExtendedInformationExtraField.getSize();
    assertEquals(100, size.getValue().longValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSizeWithNullRelativeHeaderOffset_FvAY4() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), null, new ZipLong(10));
    ZipEightByteInteger size = zip64ExtendedInformationExtraField.getSize();
    assertEquals(100, size.getValue().longValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSizeWithNullDiskStart_NwWj5() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), null);
    ZipEightByteInteger size = zip64ExtendedInformationExtraField.getSize();
    assertEquals(100, size.getValue().longValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDiskStartNumber_VFCE0() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(
                new ZipEightByteInteger(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 }, 0),
                new ZipEightByteInteger(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 }, 0),
                new ZipEightByteInteger(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 }, 0),
                new ZipLong(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 }, 0));
        ZipLong diskStart = zip64ExtendedInformationExtraField.getDiskStartNumber();
        assertEquals(new ZipLong(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 }, 0), diskStart);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset_hQLz0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    ZipEightByteInteger expected = new ZipEightByteInteger(20);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset2_fgLT1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    ZipEightByteInteger expected = new ZipEightByteInteger(30);
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset3_dVNo2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    ZipEightByteInteger expected = new ZipEightByteInteger(40);
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset4_sIAC3() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    ZipEightByteInteger expected = new ZipEightByteInteger(50);
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset5_ThmH4() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    ZipEightByteInteger expected = new ZipEightByteInteger(60);
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset6_mrZe5() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    ZipEightByteInteger expected = new ZipEightByteInteger(70);
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRelativeHeaderOffset7_yKtd6() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(100), new ZipEightByteInteger(50), new ZipEightByteInteger(20), new ZipLong(10));
    ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
    ZipEightByteInteger expected = new ZipEightByteInteger(80);
    assertNotEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSize_NTyq0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(30);
    zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
    assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSizeWithNull_XUOR1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    zip64ExtendedInformationExtraField.setCompressedSize(null);
    assertNull(zip64ExtendedInformationExtraField.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSizeWithSameValue_gvFX2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(20);
    zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
    assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCompressedSizeWithDifferentValue_yUJN3() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(30);
    zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
    assertNotEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDiskStartNumber_vrNx0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0));
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    zip64ExtendedInformationExtraField.setDiskStartNumber(zipLong);
    assertEquals(zipLong, zip64ExtendedInformationExtraField.getDiskStartNumber());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDiskStartNumberWithNull_PpyR1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0));
    ZipLong zipLong = null;
    zip64ExtendedInformationExtraField.setDiskStartNumber(zipLong);
    assertNull(zip64ExtendedInformationExtraField.getDiskStartNumber());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDiskStartNumberWithDifferentValue_KuCm2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0), new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0));
    ZipLong zipLong = new ZipLong(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 0);
    zip64ExtendedInformationExtraField.setDiskStartNumber(zipLong);
    assertNotEquals(zipLong, zip64ExtendedInformationExtraField.getDiskStartNumber());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_NullSizes_fwqV0() {
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(null, null);
    assertEquals(ByteUtils.EMPTY_BYTE_ARRAY, field.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_NullSize_zvXv2() {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(null, compressedSize);
    assertEquals(ByteUtils.EMPTY_BYTE_ARRAY, field.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_NullCompressedSize_eaAC3() {
    ZipEightByteInteger size = new ZipEightByteInteger(100L);
    Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, null);
    assertEquals(ByteUtils.EMPTY_BYTE_ARRAY, field.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRelativeHeaderOffset_yUte0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    ZipEightByteInteger rho = new ZipEightByteInteger(30);
    zip64ExtendedInformationExtraField.setRelativeHeaderOffset(rho);
    assertEquals(rho, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRelativeHeaderOffset8_xDjY7() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
    ZipEightByteInteger rho = new ZipEightByteInteger(30);
    zip64ExtendedInformationExtraField.setRelativeHeaderOffset(rho);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSize_pjhd0() {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
    ZipLong diskStart = new ZipLong(1);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertEquals(compressedSize, zip64.getCompressedSize());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSizeWithDifferentValues_PIRF1_1() {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
    ZipLong diskStart = new ZipLong(1);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    size = new ZipEightByteInteger(200);
    compressedSize = new ZipEightByteInteger(100);
    relativeHeaderOffset = new ZipEightByteInteger(20);
    diskStart = new ZipLong(2);
    zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertEquals(compressedSize, zip64.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_sizeNotNull_eVaf0_iIhs0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(10));
    ZipShort zipShort = zip64ExtendedInformationExtraField.getLocalFileDataLength();
    assertEquals(2 * 4, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressedSizeWithDifferentValues_PIRF1() {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
    ZipLong diskStart = new ZipLong(1);
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertEquals(compressedSize, zip64.getCompressedSize());
    size = new ZipEightByteInteger(200);
    compressedSize = new ZipEightByteInteger(100);
    relativeHeaderOffset = new ZipEightByteInteger(20);
    diskStart = new ZipLong(2);
    zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    assertEquals(compressedSize, zip64.getCompressedSize());
}
}