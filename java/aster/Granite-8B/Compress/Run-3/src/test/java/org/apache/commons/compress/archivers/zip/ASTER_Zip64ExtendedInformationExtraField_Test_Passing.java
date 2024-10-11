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
public class Aster_Zip64ExtendedInformationExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData_zRsM0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[100];
        int offset = 0;
        int length = 100;
        try {
            zip64ExtendedInformationExtraField.parseFromLocalFileData(buffer, offset, length);
        } catch (ZipException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_Bosg0() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(1000L);
        ZipLong diskStart = new ZipLong(5L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        byte[] expectedData = new byte[24];
        System.arraycopy(size.getBytes(), 0, expectedData, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, expectedData, 8, 8);
        System.arraycopy(relativeHeaderOffset.getBytes(), 0, expectedData, 16, 8);
        System.arraycopy(diskStart.getBytes(), 0, expectedData, 20, 4);
        byte[] actualData = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        assertEquals(expectedData, actualData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_WRex1() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        byte[] expectedData = new byte[16];
        System.arraycopy(size.getBytes(), 0, expectedData, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, expectedData, 8, 8);
        byte[] actualData = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        assertEquals(expectedData, actualData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_Jfhs0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
        assertEquals(0x0001, headerId.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId2_wEyo1() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        ZipEightByteInteger relativeHeaderOffset = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(10L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, relativeHeaderOffset, diskStart);
        ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
        assertEquals(0x0001, headerId.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId3_VSly2() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(50L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
        assertEquals(0x0001, headerId.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalFileDataLength_spJI0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipShort localFileDataLength = zip64ExtendedInformationExtraField.getLocalFileDataLength();
        assertEquals(0, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalFileDataLength2_SCmt1() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, null);
        ZipShort localFileDataLength = zip64ExtendedInformationExtraField.getLocalFileDataLength();
        assertEquals(16, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalFileDataLength3_cZHD2() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(200L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        ZipShort localFileDataLength = zip64ExtendedInformationExtraField.getLocalFileDataLength();
        assertEquals(32, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalFileDataLength4_ntOu3() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(200L);
        ZipLong diskStart = new ZipLong(300L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(size, compressedSize, null, diskStart);
        ZipShort localFileDataLength = zip64ExtendedInformationExtraField.getLocalFileDataLength();
        assertEquals(48, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize_TYcj0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_kREc0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L), new ZipEightByteInteger(2L), new ZipEightByteInteger(3L), new ZipLong(4L));
        assertEquals(1L, zip64ExtendedInformationExtraField.getSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize2_ZgQK1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L), new ZipEightByteInteger(2L));
        assertEquals(1L, zip64ExtendedInformationExtraField.getSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDiskStartNumber_DaCl0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1), new ZipEightByteInteger(2), new ZipEightByteInteger(3), new ZipLong(4));
        ZipLong diskStartNumber = zip64ExtendedInformationExtraField.getDiskStartNumber();
        assertEquals(4, diskStartNumber.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRelativeHeaderOffset_RhZN0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L), new ZipEightByteInteger(2L), new ZipEightByteInteger(3L), new ZipLong(4L));
        assertEquals(3L, zip64ExtendedInformationExtraField.getRelativeHeaderOffset().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRelativeHeaderOffset2_zbuj1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L), new ZipEightByteInteger(2L));
        assertEquals(0L, zip64ExtendedInformationExtraField.getRelativeHeaderOffset().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRelativeHeaderOffset3_dVgJ2() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertEquals(0L, zip64ExtendedInformationExtraField.getRelativeHeaderOffset().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_pcvF0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(100L);
        zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSizeWithNull_JzUd1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setCompressedSize(null);
        assertNull(zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedSizeWithNull_uowI3() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertNull(zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BjjW4() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new Zip64ExtendedInformationExtraField();
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new Zip64ExtendedInformationExtraField();
        assertTrue(zip64ExtendedInformationExtraField1.equals(zip64ExtendedInformationExtraField2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithNull_nsJO5() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertFalse(zip64ExtendedInformationExtraField.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentClass_rQSp6() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertFalse(zip64ExtendedInformationExtraField.equals(new Object()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentValues_wLNb7() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new Zip64ExtendedInformationExtraField();
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField2.setCompressedSize(new ZipEightByteInteger(100L));
        assertFalse(zip64ExtendedInformationExtraField1.equals(zip64ExtendedInformationExtraField2));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ImNq8() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new Zip64ExtendedInformationExtraField();
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new Zip64ExtendedInformationExtraField();
        assertEquals(zip64ExtendedInformationExtraField1.hashCode(), zip64ExtendedInformationExtraField2.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithDifferentValues_zIfQ9() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new Zip64ExtendedInformationExtraField();
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField2.setCompressedSize(new ZipEightByteInteger(100L));
        assertNotEquals(zip64ExtendedInformationExtraField1.hashCode(), zip64ExtendedInformationExtraField2.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullSizes_zfun0() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, null);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(0, data.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOneNullSize_WQSV1_1() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, null);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(8, data.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOneNullSize_WQSV1_2() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, null);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(100L, data[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOneNullSize_WQSV1_3() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, null);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(0L, data[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBothSizes_PXrg2_1() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(200L);
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(16, data.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBothSizes_PXrg2_2() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(200L);
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(100L, data[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBothSizes_PXrg2_3() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(200L);
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(200L, data[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNotEquals_WzYq2() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new Zip64ExtendedInformationExtraField();
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(new ZipEightByteInteger(100L));
        assertFalse(zip64ExtendedInformationExtraField1.equals(zip64ExtendedInformationExtraField2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedSize_JjbR0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L), new ZipEightByteInteger(2L), new ZipEightByteInteger(3L), new ZipLong(4L));
        assertEquals(2L, zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedSize2_fdWz1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L), new ZipEightByteInteger(2L));
        assertEquals(2L, zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedSize3_YNQg2() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertEquals(0L, zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
    }
}