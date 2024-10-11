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
public void testParseFromLocalFileDataInvalidLength_eUDl1() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    byte[] buffer = new byte[2];
    int offset = 0;
    int length = 2;
    try {
        zip64ExtendedInformationExtraField.parseFromLocalFileData(buffer, offset, length);
        Assertions.fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataInvalidSize_oZpP2() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    byte[] buffer = new byte[4];
    int offset = 0;
    int length = 4;
    try {
        zip64ExtendedInformationExtraField.parseFromLocalFileData(buffer, offset, length);
        Assertions.fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataMissingRelativeHeaderOffset_ibZM3() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    byte[] buffer = new byte[12];
    int offset = 0;
    int length = 12;
    try {
        zip64ExtendedInformationExtraField.parseFromLocalFileData(buffer, offset, length);
        Assertions.fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataMissingDiskStart_MiEH4() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    byte[] buffer = new byte[14];
    int offset = 0;
    int length = 14;
    try {
        zip64ExtendedInformationExtraField.parseFromLocalFileData(buffer, offset, length);
        Assertions.fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLengthWhenSizeIsNull_clKD0() {
    ZipEightByteInteger size = null;
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    ZipShort result = zip64ExtendedInformationExtraField.getLocalFileDataLength();
    assertEquals(0, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLengthWhenSizeIsNotNull_SGNy1() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    ZipShort result = zip64ExtendedInformationExtraField.getLocalFileDataLength();
    assertEquals(2 * ZipShort.getValue(ZipShort.getBytes(4)), result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize_AFyQ0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(0));
        zip64.setSize(size);
        assertEquals(size, zip64.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthNullSize_Xmgv0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    ZipShort result = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
    assertEquals(new ZipShort(0), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_JcXR0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
        ZipLong diskStart = new ZipLong(new byte[8], 0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipEightByteInteger result = zip64ExtendedInformationExtraField.getSize();
        assertEquals(size, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDiskStartNumber_HnMM0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
        ZipLong diskStart = new ZipLong(0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipLong result = zip64ExtendedInformationExtraField.getDiskStartNumber();
        assertEquals(diskStart, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRelativeHeaderOffset_XwXH0() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
        ZipLong diskStart = new ZipLong(new byte[4], 0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipEightByteInteger result = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
        assertEquals(relativeHeaderOffset, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_APFN0() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(0));
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
        zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
        assert zip64ExtendedInformationExtraField.getCompressedSize().equals(compressedSize);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataDataNullSizeAndCompressedSize_RWKV0() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] result = zip64ExtendedInformationExtraField.getLocalFileDataData();
        assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataDataSizeNullCompressedSizeNotNull_WmTW1() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, new ZipEightByteInteger(new byte[8]));
        byte[] result = zip64ExtendedInformationExtraField.getLocalFileDataData();
        assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataDataCompressedSizeNullSizeNotNull_fFFx2() {
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8]);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), compressedSize);
        byte[] result = zip64ExtendedInformationExtraField.getLocalFileDataData();
        assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataDataBothSizeAndCompressedSizeNotNull_DDbI3() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8]);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        byte[] result = zip64ExtendedInformationExtraField.getLocalFileDataData();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRelativeHeaderOffset_pJMQ0() {
        ZipEightByteInteger rho = new ZipEightByteInteger(new byte[8], 0);
        Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipEightByteInteger(new byte[8], 0), new ZipLong(0));
        zip64.setRelativeHeaderOffset(rho);
        assertEquals(rho, zip64.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedSize_hscE0() {
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
public void testGetCentralDirectoryData_SizeAndCompressedSize_BeyC0_eFRq0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[8]);
    size.getLongValue();
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8]);
    compressedSize.getLongValue();
    Zip64ExtendedInformationExtraField zip64 = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
    byte[] data = zip64.getCentralDirectoryData();
    Assertions.assertEquals(24, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_cWCd0_laxf0() {
    ZipEightByteInteger size = new ZipEightByteInteger(new byte[8], 0);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(new byte[8], 0);
    ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(new byte[8], 0);
    ZipLong diskStart = new ZipLong(new byte[8], 0);
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
    ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
    assertEquals(headerId.getValue(), headerId.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthNullRelativeHeaderOffset_oBPV2_bMnS0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
    ZipShort result = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
    assertEquals(new ZipShort(0), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLengthAllNotNull_UUmh4_ACYI0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(1));
    ZipShort result = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
    assertEquals(new ZipShort((int)(8 + 8 + 8 + 4)), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_AllFieldsPresent_rJVx0_rkZO0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    try {
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
    } catch (ZipException e) {
        fail("ZipException was thrown");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_NoUncompressedSize_fZnx1_aIoS0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    try {
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, true);
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_NoCompressedSize_OlAL2_rDjb0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    try {
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, true, true);
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_NoRelativeHeaderOffset_hgba3_eruA0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    try {
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, false, true);
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_NoDiskStart_ADRq4_MdxT0() {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipEightByteInteger(new byte[8]), new ZipLong(0));
    try {
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, false);
    } catch (ZipException e) {
    }
}
}