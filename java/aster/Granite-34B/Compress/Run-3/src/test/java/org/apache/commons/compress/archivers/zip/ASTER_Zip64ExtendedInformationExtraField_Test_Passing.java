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
    private static final int DWORD = 4;
    private static final int WORD = 2;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_RtMQ0_1() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 20;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(buffer, offset + 2 * DWORD);
        ZipLong diskStart = new ZipLong(buffer, offset + 3 * DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_RtMQ0_2() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 20;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(buffer, offset + 2 * DWORD);
        ZipLong diskStart = new ZipLong(buffer, offset + 3 * DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_RtMQ0_3() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 20;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(buffer, offset + 2 * DWORD);
        ZipLong diskStart = new ZipLong(buffer, offset + 3 * DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(relativeHeaderOffset, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoDiskStart_goiS1_1() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(buffer, offset + 2 * DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, null);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoDiskStart_goiS1_2() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(buffer, offset + 2 * DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, null);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoDiskStart_goiS1_3() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(buffer, offset + 2 * DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, null);
        assertEquals(relativeHeaderOffset, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoRelativeHeaderOffset_ACoO2_1() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoRelativeHeaderOffset_ACoO2_2() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoRelativeHeaderOffset_ACoO2_3() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(buffer, offset + DWORD);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
        assertEquals(null, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoCompressedSize_WnQO3_1() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, null, null, null);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoCompressedSize_WnQO3_2() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, null, null, null);
        assertEquals(null, zip64ExtendedInformationExtraField.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoCompressedSize_WnQO3_3() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        ZipEightByteInteger size = new ZipEightByteInteger(buffer, offset);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, null, null, null);
        assertEquals(null, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoSize_LtUV4_1() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        assertEquals(null, zip64ExtendedInformationExtraField.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoSize_LtUV4_2() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        assertEquals(null, zip64ExtendedInformationExtraField.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithNoSize_LtUV4_3() throws ZipException {
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        assertEquals(null, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryData_WithNoFieldsPopulated_ReturnsEmptyData_WiCt2() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] actualData = extraField.getCentralDirectoryData();
        assertEquals(0, actualData.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_Telc0() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        assertEquals(ZipShort.getValue(new byte[] { 1, 2 }), extraField.getHeaderId().getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithBytes_NSGG1() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1), new ZipEightByteInteger(2));
        assertEquals(ZipShort.getValue(new byte[] { 1, 2 }), extraField.getHeaderId().getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithBytesAndOffset_QQoQ2() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1), new ZipEightByteInteger(2), new ZipEightByteInteger(3), new ZipLong(4));
        assertEquals(ZipShort.getValue(new byte[] { 1, 2 }), extraField.getHeaderId().getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLocalFileDataLength_withSizeNotNull_returnsCorrectLength_nmbG0() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(5), new ZipEightByteInteger(100), new ZipLong(1));
        assertEquals(new ZipShort(16), field.getLocalFileDataLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getLocalFileDataLength_withSizeNull_returnsCorrectLength_Arix1() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0), field.getLocalFileDataLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetSize_klQM0() throws Exception {
		Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
		ZipEightByteInteger size = new ZipEightByteInteger(100);
		zip64ExtendedInformationExtraField.setSize(size);
		assertEquals(size, zip64ExtendedInformationExtraField.getSize());
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLength_withAllFieldsPopulated_NePk0() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1), new ZipEightByteInteger(2), new ZipEightByteInteger(3), new ZipLong(4));
        assertEquals(new ZipShort(20), extraField.getCentralDirectoryLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLength_withOnlySizeAndCompressedSizePopulated_vrsC1() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1), new ZipEightByteInteger(2));
        assertEquals(new ZipShort(16), extraField.getCentralDirectoryLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLength_withNoFieldsPopulated_xrpQ3() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipShort(0), extraField.getCentralDirectoryLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_tGpZ0() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(20);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue_XjxB1() throws Exception {
        byte[] bytes = new byte[8];
        int offset = 0;
        assertEquals(0L, ZipEightByteInteger.getLongValue(bytes, offset));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDiskStartNumber_returnsCorrectValue_ubEX0() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(20);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(diskStart, field.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getDiskStartNumber_returnsNullWhenNotSet_dOsz1() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize);
        assertNull(field.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getRelativeHeaderOffsetTest_CezU0() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(80);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(20);
        ZipLong diskStart = new ZipLong(0);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        assertEquals(relativeHeaderOffset, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_pbwI0() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        extraField.setCompressedSize(size);
        assertEquals(size, extraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue_CtsO1() throws Exception {
        byte[] bytes = new byte[8];
        int offset = 0;
        assertEquals(0, ZipEightByteInteger.getLongValue(bytes, offset));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue2_lyvA2() throws Exception {
        byte[] bytes = new byte[8];
        assertEquals(0, ZipEightByteInteger.getLongValue(bytes));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryData_eSYW0_1() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryData_eSYW0_2() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryData_eSYW0_3() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
        assertEquals(relativeHeaderOffset, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryDataWithFalseParameters_BtND1_1() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, false);
        assertEquals(null, zip64ExtendedInformationExtraField.getSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryDataWithFalseParameters_BtND1_2() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, false);
        assertEquals(null, zip64ExtendedInformationExtraField.getCompressedSize());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryDataWithFalseParameters_BtND1_3() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, false);
        assertEquals(null, zip64ExtendedInformationExtraField.getRelativeHeaderOffset());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReparseCentralDirectoryDataWithException_mWSu2() throws ZipException {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(10);
        ZipLong diskStart = new ZipLong(1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        try {
            zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, false);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertTrue(e.getMessage().contains("Central directory zip64 extended information extra field's length"));
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDiskStartNumber_jDHE0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipLong zipLong = new ZipLong(10);
        zip64ExtendedInformationExtraField.setDiskStartNumber(zipLong);
        assertEquals(zipLong, zip64ExtendedInformationExtraField.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDiskStartNumberNull_zIKo1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setDiskStartNumber(null);
        assertEquals(null, zip64ExtendedInformationExtraField.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDiskStartNumberWithBytes_ufov2() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] bytes = new byte[8];
        ZipLong zipLong = new ZipLong(bytes);
        zip64ExtendedInformationExtraField.setDiskStartNumber(zipLong);
        assertEquals(zipLong, zip64ExtendedInformationExtraField.getDiskStartNumber());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getLocalFileDataData_WhenSizeAndCompressedSizeAreNull_ReturnsEmptyByteArray_Qnbq1() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    byte[] actualData = zip64ExtendedInformationExtraField.getLocalFileDataData();
    assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, actualData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getLocalFileDataData_WhenSizeAndCompressedSizeAreNotNullButSizeIsNegative_ThrowsIllegalArgumentException_VDTe5() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(-1), new ZipEightByteInteger(20), new ZipEightByteInteger(30), new ZipLong(40));
    try {
        zip64ExtendedInformationExtraField.getLocalFileDataData();
        fail("Expected IllegalArgumentException not thrown");
    } catch (IllegalArgumentException e) {
        assertEquals("negative value", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void getLocalFileDataData_WhenSizeAndCompressedSizeAreNotNullButCompressedSizeIsNegative_ThrowsIllegalArgumentException_wYyc6() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(10), new ZipEightByteInteger(-1), new ZipEightByteInteger(30), new ZipLong(40));
    try {
        zip64ExtendedInformationExtraField.getLocalFileDataData();
        fail("Expected IllegalArgumentException not thrown");
    } catch (IllegalArgumentException e) {
        assertEquals("negative value", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRelativeHeaderOffset_iNxT0() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger rho = new ZipEightByteInteger(1234567890L);
        extraField.setRelativeHeaderOffset(rho);
        assertEquals(rho, extraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetRelativeHeaderOffsetWithNull_gABU1() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        extraField.setRelativeHeaderOffset(null);
        assertEquals(null, extraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompressedSize_returnsCorrectValue_Rddy0() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(80);
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(size, compressedSize);
        assertEquals(compressedSize, field.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCompressedSize_returnsNullWhenNotSet_VAUS1() throws Exception {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        assertEquals(null, field.getCompressedSize());
    }
}