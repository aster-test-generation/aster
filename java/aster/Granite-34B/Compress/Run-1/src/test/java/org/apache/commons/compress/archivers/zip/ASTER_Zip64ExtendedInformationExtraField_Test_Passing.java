/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Zip64ExtendedInformationExtraField_Test_Passing {
private void assertLocalFileDataData(Zip64ExtendedInformationExtraField field, byte[] expectedData) {
        byte[] actualData = field.getLocalFileDataData();
        assert actualData != null;
        assert actualData.length == expectedData.length;
        assert Arrays.equals(actualData, expectedData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLocalFileDataLengthWhenSizeIsNullOrEmpty_ReturnsCorrectLength_VheW0_1() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field = new Zip64ExtendedInformationExtraField(null, null);
        assertEquals(new ZipShort(0), field.getLocalFileDataLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLocalFileDataLengthWhenSizeIsPresent_ReturnsCorrectLength_sgdP1_1() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), null);
        field = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(20));
        assertEquals(new ZipShort(16), field.getLocalFileDataLength());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize_Vtki0() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_HiPV1() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRelativeHeaderOffset_rbaL2() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(20);
        zip64ExtendedInformationExtraField.setRelativeHeaderOffset(relativeHeaderOffset);
        assertEquals(relativeHeaderOffset, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLength_withAllFieldsNull_returnsCorrectLength_UILF2() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0), field.getCentralDirectoryLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRelativeHeaderOffset_AMns0() {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(20);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(relativeHeaderOffset, field.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDiskStartNumberTest_QYZj0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8]);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8]);
        ZipLong diskStart = new ZipLong(new byte[4]);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(diskStart, zip64ExtendedInformationExtraField.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDiskStartNumberTest2_mUfG1() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8]);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        assertEquals(null, zip64ExtendedInformationExtraField.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_BGju0() {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(20);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue_XBiu1() {
        byte[] bytes = new byte[8];
        int offset = 0;
        assertEquals(0L, ZipEightByteInteger.getLongValue(bytes, offset));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testZipLong_geML4() {
        byte[] bytes = new byte[4];
        int offset = 0;
        assertEquals(0, new ZipLong(bytes, offset).getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testZipLong2_eSXO5() {
        int value = 1;
        assertEquals(1, new ZipLong(value).getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testZipLong3_OLNS6() {
        long value = 1L;
        assertEquals(1L, new ZipLong(value).getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testZipLong4_vqLg7() {
        byte[] bytes = new byte[4];
        assertEquals(0, new ZipLong(bytes).getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_sqBm0() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(100);
        zip64ExtendedInformationExtraField.setCompressedSize(zipEightByteInteger);
        assertEquals(zipEightByteInteger, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSizeWithNull_QnwW1() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setCompressedSize(null);
        assertEquals(null, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSizeWithNegativeValue_NoXV2() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(-100);
        zip64ExtendedInformationExtraField.setCompressedSize(zipEightByteInteger);
        assertEquals(zipEightByteInteger, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDiskStartNumber_Wuvz0() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipLong zipLong = new ZipLong(100);
        zip64ExtendedInformationExtraField.setDiskStartNumber(zipLong);
        assertEquals(zipLong, zip64ExtendedInformationExtraField.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDiskStartNumberWithNull_NfEp1() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setDiskStartNumber(null);
        assertEquals(null, zip64ExtendedInformationExtraField.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getCentralDirectoryDataTest1_ehpH0() {
		ZipEightByteInteger size = new ZipEightByteInteger(100);
		ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
		Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
		byte[] expected = new byte[16];
		System.arraycopy(size.getBytes(), 0, expected, 0, 8);
		System.arraycopy(compressedSize.getBytes(), 0, expected, 8, 8);
		byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
		assertArrayEquals(expected, actual);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompressedSize_returnsCorrectValue_PMMO0() {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(80);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize);
        assertEquals(compressedSize, field.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompressedSize_returnsNullWhenNotSet_UOli1() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(null, field.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRelativeHeaderOffset_rAZR0() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger rho = new ZipEightByteInteger(100);
        zip64ExtendedInformationExtraField.setRelativeHeaderOffset(rho);
        assertEquals(rho, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRelativeHeaderOffsetNull_EQzk1() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setRelativeHeaderOffset(null);
        assertNull(zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_WKSy4() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(100);
        zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSizeNull_uowv5() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setCompressedSize(null);
        assertNull(zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSizeNull_Nvdy7() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setSize(null);
        assertNull(zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData3_WYIA2_cdtZ0() throws ZipException {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        assertEquals(false, zip64ExtendedInformationExtraField.getCompressedSize() != null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData4_ZOAr3_cxHU0() throws ZipException {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(buffer, offset, length);
        assertFalse(zip64ExtendedInformationExtraField.getRelativeHeaderOffset() != null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryData_hasCompressedSize_hasRelativeHeaderOffset_hasDiskStart_fTAk8_mweh0() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(0);
        ZipLong diskStart = new ZipLong(0);
        byte[] rawCentralDirectoryData = new byte[8];
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryData_hasCompressedSize_hasRelativeHeaderOffset_IZiY9_ygFJ0() throws Exception {
        byte[] rawCentralDirectoryData = new byte[8];
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(rawCentralDirectoryData);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, zipEightByteInteger, new ZipLong(0));
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLocalFileDataLengthWhenSizeIsNullOrEmpty_ReturnsCorrectLength_VheW0() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0), field.getLocalFileDataLength());
        field = new Zip64ExtendedInformationExtraField(null, null);
        assertEquals(new ZipShort(0), field.getLocalFileDataLength());
    }
}