/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Zip64ExtendedInformationExtraField_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithInvalidLength_tgYb1() {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[100];
        int offset = 0;
        int length = 0;
        try {
            extraField.parseFromLocalFileData(buffer, offset, length);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertEquals("Local file header must have both sizes", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSize4_aFtU3() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        assertEquals(0L, zip64ExtendedInformationExtraField.getSize().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_bufferNull_throwsZipException_JCUh0() {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    try {
        extraField.parseFromCentralDirectoryData(new byte[0], 0, 0);
        fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_bufferLengthInsufficient_throwsZipException_udUX1() {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    try {
        extraField.parseFromCentralDirectoryData(new byte[10], 0, 9);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("Buffer too small", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithInsufficientData_QRsr2_fid2() {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[100];
        int offset = 0;
        int length = 1;
        try {
            extraField.parseFromLocalFileData(buffer, offset, length);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertEquals("Local file header must have both sizes", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithMissingDiskStart_LcqA3_fid2() {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[100];
        int offset = 0;
        int length = 10;
        try {
            extraField.parseFromLocalFileData(buffer, offset, length);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertEquals("Local file header must have both sizes", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithMissingRelativeHeaderOffset_iOIT4_fid2() {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[100];
        int offset = 0;
        int length = 12;
        try {
            extraField.parseFromLocalFileData(buffer, offset, length);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertEquals("Local file header must have both sizes", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithMissingCompressedSize_jCXe5_fid2() {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[100];
        int offset = 0;
        int length = 8;
        try {
            extraField.parseFromLocalFileData(buffer, offset, length);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertEquals("Local file header must have both sizes", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileDataWithMissingSize_cHtU6_fid2() {
        Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[100];
        int offset = 0;
        int length = 4;
        try {
            extraField.parseFromLocalFileData(buffer, offset, length);
            fail("Expected ZipException");
        } catch (ZipException e) {
            assertEquals("Local file header must have both sizes", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_kfKA0_fid2() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(new ZipEightByteInteger(1L), new ZipEightByteInteger(2L), new ZipEightByteInteger(3L), new ZipLong(4L));
        ZipShort centralDirectoryLength = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
        assertEquals(20, centralDirectoryLength.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_mjVj1_fid2() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        ZipShort centralDirectoryLength = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
        assertEquals(16, centralDirectoryLength.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_bufferNull_throwsZipException_JCUh0_fid2() {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    try {
        extraField.parseFromCentralDirectoryData(null, 0, 0);
        fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_bufferLengthInsufficient_throwsZipException_udUX1_fid2() {
    Zip64ExtendedInformationExtraField extraField = new Zip64ExtendedInformationExtraField();
    try {
        extraField.parseFromCentralDirectoryData(new byte[10], 0, 9);
        fail("Expected ZipException");
    } catch (ZipException e) {
    }
}
}