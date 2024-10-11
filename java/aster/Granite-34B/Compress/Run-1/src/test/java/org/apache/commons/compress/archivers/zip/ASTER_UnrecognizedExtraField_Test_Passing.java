/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_UnrecognizedExtraField_Test_Passing {
	UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCentralDirectoryData_HrDF0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        byte[] data = new byte[10]; // Replace 10 with the actual size of the data array
        unrecognizedExtraField.setCentralDirectoryData(data);
        assertArrayEquals(data, unrecognizedExtraField.getCentralDirectoryData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCentralDirectoryDataNull_dmYa1() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        unrecognizedExtraField.setCentralDirectoryData(null);
        assertArrayEquals(null, unrecognizedExtraField.getCentralDirectoryData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetHeaderId_tIOs0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02}, 0);
        unrecognizedExtraField.setHeaderId(zipShort);
        assertEquals(zipShort, unrecognizedExtraField.getHeaderId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetHeaderId2_EcvN1() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort zipShort = new ZipShort(0x0102);
        unrecognizedExtraField.setHeaderId(zipShort);
        assertEquals(zipShort, unrecognizedExtraField.getHeaderId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetHeaderId3_BaHg2() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort zipShort = new ZipShort(new byte[] {0x01, 0x02});
        unrecognizedExtraField.setHeaderId(zipShort);
        assertEquals(zipShort, unrecognizedExtraField.getHeaderId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testParseFromLocalFileData_Symv0() {
		byte[] data = new byte[10];
		int offset = 2;
		int length = 8;
		unrecognizedExtraField.parseFromLocalFileData(data, offset, length);
		byte[] expected = Arrays.copyOfRange(data, offset, offset + length);
		byte[] actual = unrecognizedExtraField.getLocalFileDataData();
		assertEquals(Arrays.toString(expected), Arrays.toString(actual));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_WqZM0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        ZipShort zipShort = new ZipShort(1);
        unrecognizedExtraField.setHeaderId(zipShort);
        assertEquals(zipShort, unrecognizedExtraField.getHeaderId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderIdWithNull_VQVa1() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        unrecognizedExtraField.setHeaderId(null);
        assertEquals(null, unrecognizedExtraField.getHeaderId());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocalFileDataData_Mrxy0_tOef0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        byte[] data = new byte[] {0x01, 0x02, 0x03};
        unrecognizedExtraField.setLocalFileDataData(data);
        byte[] expected = ZipUtil.copy(data);
        assertArrayEquals(expected, unrecognizedExtraField.getLocalFileDataData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocalFileDataData_Null_LSAN1_hfaA0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        byte[] data = null;
        unrecognizedExtraField.setLocalFileDataData(data);
        byte[] expected = ZipUtil.copy(data);
        assertArrayEquals(expected, unrecognizedExtraField.getLocalFileDataData());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLocalFileDataData_Empty_jFCF2_KrDs0() {
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        byte[] data = new byte[0];
        unrecognizedExtraField.setLocalFileDataData(data);
        byte[] expected = ZipUtil.copy(data);
        assertArrayEquals(expected, unrecognizedExtraField.getLocalFileDataData());
    }
}