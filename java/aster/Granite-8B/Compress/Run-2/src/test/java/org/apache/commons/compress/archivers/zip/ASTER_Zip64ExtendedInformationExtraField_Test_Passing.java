/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.utils.ByteUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Zip64ExtendedInformationExtraField_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_With_Empty_Buffer_oIDT0() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    extraField.parseFromLocalFileData(new byte[0], 0, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_With_Insufficient_Buffer_QAna1() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    extraField.parseFromLocalFileData(new byte[1], 0, 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_With_Valid_Buffer_IEFv2() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    extraField.parseFromLocalFileData(new byte[20], 0, 20);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_With_Valid_Buffer_And_Disk_Start_jIpo3() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    extraField.parseFromLocalFileData(new byte[28], 0, 28);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_With_Valid_Buffer_And_Relative_Header_Offset_VKUn4() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    extraField.parseFromLocalFileData(new byte[24], 0, 24);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryData_sizeAndCompressedSizeNotNull_returnsExpectedData_gmsS0() throws Exception {
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(200L);
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize, null, null);
        byte[] expectedData = new byte[24];
        System.arraycopy(size.getBytes(), 0, expectedData, 0, 8);
        System.arraycopy(compressedSize.getBytes(), 0, expectedData, 8, 8);
        byte[] actualData = extraField.getCentralDirectoryData();
        assertArrayEquals(expectedData, actualData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryData_sizeAndCompressedSizeNull_returnsExpectedData_FzDI1() throws Exception {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] expectedData = new byte[16];
        byte[] actualData = extraField.getCentralDirectoryData();
        assertArrayEquals(expectedData, actualData);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_JWUM0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}), new ZipEightByteInteger(new byte[]{8, 7, 6, 5, 4, 3, 2, 1}), new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}), new ZipLong(123456789));
        ZipShort headerId = zip64ExtendedInformationExtraField.getHeaderId();
        assertEquals(1234, headerId.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetLocalFileDataLengthWithNullSizeAndCompressedSize_ugJw0() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, null);
    ZipShort localFileDataLength = extraField.getLocalFileDataLength();
    assertEquals(0, localFileDataLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize_YIyO0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(10L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize2_GmbB1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(20L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize3_mRpo2() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(30L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize4_EwpI3() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(40L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize5_Toyp4() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(50L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize6_FJVm5() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(60L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize7_oGVb6() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(70L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize8_iHLZ7() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(80L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize9_JsnX8() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(90L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSize10_bVES9() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger size = new ZipEightByteInteger(100L);
        zip64ExtendedInformationExtraField.setSize(size);
        assertEquals(size, zip64ExtendedInformationExtraField.getSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCentralDirectoryLengthWithNullSizeAndNullCompressedSize_wzPC0() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, null);
    ZipShort centralDirectoryLength = extraField.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize_Hwkx0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipLong(1));
        assertEquals(1L, zip64ExtendedInformationExtraField.getSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDiskStartNumber_niVb0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipLong(1));
        ZipLong diskStartNumber = zip64ExtendedInformationExtraField.getDiskStartNumber();
        assertEquals(1, diskStartNumber.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRelativeHeaderOffset_EAsQ0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 2}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 3}), new ZipLong(4));
        assertEquals(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 3}), zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRelativeHeaderOffset2_lrQU1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 2}));
        assertEquals(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}), zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetRelativeHeaderOffset3_XNdr2() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertEquals(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}), zip64ExtendedInformationExtraField.getRelativeHeaderOffset());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSize_FAwn0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipEightByteInteger compressedSize = new ZipEightByteInteger(100L);
        zip64ExtendedInformationExtraField.setCompressedSize(compressedSize);
        assertEquals(compressedSize, zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCompressedSizeWithNull_VZrm1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        zip64ExtendedInformationExtraField.setCompressedSize(null);
        assertNull(zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCompressedSizeWithNull_VeKO3() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertNull(zip64ExtendedInformationExtraField.getCompressedSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData_ZyJz0() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData2_PpOv1() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData3_qpkA2() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, false, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData4_eNwa3() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, false, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData5_niXt4() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData6_gdsm5() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, true, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData7_DDhU6() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, false, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData8_qNWG7() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, false, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData9_JRTB8() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData10_gxDd9() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData11_GElj10() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, false, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData12_TGwX11() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, false, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData13_snzI12() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, true, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData14_DGMg13() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, true, false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReparseCentralDirectoryData15_ALhC14() throws Exception {
    Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
    zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNullSizes_vmpr0() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, null);
    byte[] data = extraField.getLocalFileDataData();
    assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_2() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100, data[0] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_3() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100 >> 8, data[1] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_4() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100 >> 16, data[2] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_5() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100 >> 24, data[3] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_6() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200, data[4] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_7() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200 >> 8, data[5] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_8() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200 >> 16, data[6] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBothSizesNotNull_WFvY1_9() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200 >> 24, data[7] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlySizeNotNull_zVZa2_2() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, null);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100, data[0] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlySizeNotNull_zVZa2_3() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, null);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100 >> 8, data[1] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlySizeNotNull_zVZa2_4() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, null);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100 >> 16, data[2] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlySizeNotNull_zVZa2_5() throws Exception {
    ZipEightByteInteger size = new ZipEightByteInteger(100);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(size, null);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(100 >> 24, data[3] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlyCompressedSizeNotNull_AGqU3_2() throws Exception {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200, data[0] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlyCompressedSizeNotNull_AGqU3_3() throws Exception {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200 >> 8, data[1] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlyCompressedSizeNotNull_AGqU3_4() throws Exception {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200 >> 16, data[2] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testOnlyCompressedSizeNotNull_AGqU3_5() throws Exception {
    ZipEightByteInteger compressedSize = new ZipEightByteInteger(200);
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField(null, compressedSize);
    byte[] data = extraField.getLocalFileDataData();
    assertEquals(200 >> 24, data[3] & 0xff);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNeitherSizeNotNull_bIxw4() throws Exception {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    byte[] data = extraField.getLocalFileDataData();
    assertArrayEquals(ByteUtils.EMPTY_BYTE_ARRAY, data);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedSize_Iprg0() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 2}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 3}), new ZipLong(4));
        assertEquals(2L, zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedSize1_ZTla1() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 1}), new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 2}));
        assertEquals(2L, zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetCompressedSize3_vgFP3() throws Exception {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertEquals(0L, zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
    }
}