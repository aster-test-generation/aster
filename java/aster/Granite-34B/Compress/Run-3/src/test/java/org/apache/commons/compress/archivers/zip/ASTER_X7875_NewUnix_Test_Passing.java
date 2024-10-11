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
public class Aster_X7875_NewUnix_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCentralDirectoryData_GGbn0() throws Exception {
        X7875_NewUnix unix = new X7875_NewUnix();
        byte[] expected = ByteUtils.EMPTY_BYTE_ARRAY;
        byte[] actual = unix.getCentralDirectoryData();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getGID_kuIX0() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        long gid = x7875_NewUnix.getGID();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_TOHy0() throws Exception {
        X7875_NewUnix x7875 = new X7875_NewUnix();
        String expected = "0x7875 Zip Extra Field: UID=0 GID=0";
        assertEquals(expected, x7875.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGID_BHbD0() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        x7875_NewUnix.setGID(1234567890L);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLengthTest_qAdN0() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        assertEquals(0, x7875_NewUnix.getCentralDirectoryLength().getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLengthTest_AIPS1() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        assertEquals(2, x7875_NewUnix.getCentralDirectoryLength().getBytes().length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLengthTest_KyMK2() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        assertEquals(0, ZipShort.getValue(x7875_NewUnix.getCentralDirectoryLength().getBytes()));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLengthTest_AtWz3() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        assertEquals(0, ZipShort.getValue(x7875_NewUnix.getCentralDirectoryLength().getBytes(), 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLengthTest_EEJV4() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        assertEquals(0, x7875_NewUnix.getCentralDirectoryLength().hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCentralDirectoryLengthTest_zlNu5() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        assertEquals(0, ZipShort.getBytes(x7875_NewUnix.getCentralDirectoryLength().getValue()).length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData_zdUK0() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 0;
	int length = 10;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData2_STsB1() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 1;
	int length = 10;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData3_pjEo2() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 0;
	int length = 9;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData4_mNmM3() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 1;
	int length = 9;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData5_IggI4() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 0;
	int length = 8;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData6_NqVl5() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 1;
	int length = 8;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData7_nlIN6() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 0;
	int length = 7;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData8_ddmY7() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 1;
	int length = 7;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testparseFromCentralDirectoryData9_eTLz8() throws ZipException {
	X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
	byte[] buffer = new byte[10];
	int offset = 0;
	int length = 6;
	x7875_NewUnix.parseFromCentralDirectoryData(buffer, offset, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_SfhA0() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        byte[] expected = {0, 0, 0};
        assertArrayEquals(expected, x7875_NewUnix.getLocalFileDataData());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrimLeadingZeroesForceMinLengthWithNullArray_DWSG0() throws Exception {
        byte[] array = null;
        byte[] expected = null;
        byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrimLeadingZeroesForceMinLengthWithEmptyArray_lZHu1() throws Exception {
        byte[] array = new byte[0];
        byte[] expected = new byte[1];
        byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrimLeadingZeroesForceMinLengthWithNonEmptyArray_rPyL2() throws Exception {
        byte[] array = new byte[]{0, 1, 2, 3};
        byte[] expected = new byte[]{1, 2, 3};
        byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTrimLeadingZeroesForceMinLengthWithOnlyZerosArray_YuQS3() throws Exception {
        byte[] array = new byte[]{0, 0, 0};
        byte[] expected = new byte[1];
        byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_alYf0_1() throws CloneNotSupportedException {
        X7875_NewUnix obj = new X7875_NewUnix();
        Object clone = obj.clone();
        assertNotNull(clone);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClone_alYf0_2() throws CloneNotSupportedException {
        X7875_NewUnix obj = new X7875_NewUnix();
        Object clone = obj.clone();
        assertNotSame(obj, clone);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUID_efoj0() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        x7875_NewUnix.setUID(1234567890L);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUID_MinLongValue_NUWt1() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        x7875_NewUnix.setUID(Long.MIN_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUID_MaxLongValue_aUlg2() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        x7875_NewUnix.setUID(Long.MAX_VALUE);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUID_Zero_KVMB3() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        x7875_NewUnix.setUID(0L);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUID_NegativeValue_RKqB4() throws Exception {
        X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
        x7875_NewUnix.setUID(-1234567890L);
    }
}