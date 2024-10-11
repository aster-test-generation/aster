/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.nio.file.attribute.FileTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X000A_NTFS_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetModifyTime_SPtH0() {
		X000A_NTFS x000A_NTFS = new X000A_NTFS();
		ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
		assertNotNull(modifyTime);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCentralDirectoryData_gUCW0() {
		X000A_NTFS x000A_NTFS = new X000A_NTFS();
		byte[] actualCentralDirectoryData = x000A_NTFS.getCentralDirectoryData();
		byte[] expectedCentralDirectoryData = x000A_NTFS.getLocalFileDataData();
		assert(Arrays.equals(actualCentralDirectoryData, expectedCentralDirectoryData));
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTime_uEiy0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime time = FileTime.fromMillis(0);
    x000A_NTFS.setAccessFileTime(time);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalFileDataLength_LkvF0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort localFileDataLength = x000A_NTFS.getLocalFileDataLength();
        assertEquals(32, localFileDataLength.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreateTimeWithZipEightByteInteger_tbqE0() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[8], 0);
        X000A_NTFS x000ANTFS = new X000A_NTFS();
        x000ANTFS.setCreateTime(zipEightByteInteger);
        assertEquals(zipEightByteInteger, x000ANTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateJavaTime_PQdz0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date();
    x000A_NTFS.setCreateJavaTime(d);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyJavaTime_Fbud0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date date = new Date();
        x000A_NTFS.setModifyJavaTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_Mrvo0_1() {
        X000A_NTFS x000ANTFSTest = new X000A_NTFS();
        ZipShort zipShort = x000ANTFSTest.getHeaderId();
        assertNotNull(zipShort);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_Mrvo0_2() {
        X000A_NTFS x000ANTFSTest = new X000A_NTFS();
        ZipShort zipShort = x000ANTFSTest.getHeaderId();
        assertEquals(0x000A, zipShort.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetAccessJavaTime_IDbm0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date result = x000A_NTFS.getAccessJavaTime();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_AnAR0_1() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
        ZipEightByteInteger zipEightByteInteger3 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0}, 0);
        assertTrue(zipEightByteInteger1.equals(zipEightByteInteger2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_AnAR0_2() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
        ZipEightByteInteger zipEightByteInteger3 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0}, 0);
        assertFalse(zipEightByteInteger1.equals(zipEightByteInteger3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue_FbWw1_1() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0}, 0);
        assertEquals(0L, zipEightByteInteger1.getLongValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue_FbWw1_2() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0}, 0);
        assertEquals(1L, zipEightByteInteger2.getLongValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetAccessJavaTime_GNrO0() {
		X000A_NTFS x000A_NTFS = new X000A_NTFS();
		Date d = new Date();
		x000A_NTFS.setAccessJavaTime(d);
		assertNotNull(x000A_NTFS);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreateTimeWithLong_QWUo3_Jtdt0() {
        long value = 1234567890123456789L;
        X000A_NTFS x000ANTFS = new X000A_NTFS();
        x000ANTFS.setCreateTime(new ZipEightByteInteger(value));
        assertEquals(value, x000ANTFS.getCreateTime().getLongValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals2_VOoud7_ZduA0() {
	ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
	ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
	boolean result = zipEightByteInteger1.equals(zipEightByteInteger2);
	assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLength_lZKc0_qiSt0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort zipShort = x000A_NTFS.getCentralDirectoryLength();
        assertNotNull(zipShort);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateJavaTime_PQdz0_KNsZ0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    x000A_NTFS.setCreateJavaTime(calendar.getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyJavaTime_Fbud0_rlLx0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        x000A_NTFS.setModifyJavaTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_Mrvo0_JXCA0_1() {
        X000A_NTFS x000ANTFSTest = new X000A_NTFS();
        ZipShort zipShort = x000ANTFSTest.getHeaderId();
        org.junit.jupiter.api.Assertions.assertNotNull(zipShort);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetAccessJavaTime_IDbm0_awKW0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessJavaTime(new Date());
    Date result = x000A_NTFS.getAccessJavaTime();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue2_KIah4_1() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0});
        assertEquals(0L, zipEightByteInteger1.getLongValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLongValue2_KIah4_2() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0});
        assertEquals(1L, zipEightByteInteger2.getLongValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes_CNGQ5_1() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0});
        assertArrayEquals(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, zipEightByteInteger1.getBytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes_CNGQ5_2() {
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(new byte[]{1, 0, 0, 0, 0, 0, 0, 0});
        assertArrayEquals(new byte[]{1, 0, 0, 0, 0, 0, 0, 0}, zipEightByteInteger2.getBytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testGetCreateTime_ATXq0() {
		X000A_NTFS x000A_NTFS = new X000A_NTFS();
		ZipEightByteInteger zipEightByteInteger = x000A_NTFS.getCreateTime();
		assertNotNull(zipEightByteInteger);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue_BWtQ1() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
	long result = zipEightByteInteger.getLongValue();
	assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue2_ksng4() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
	long result = ZipEightByteInteger.getLongValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
	assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_xrNX5() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
	byte[] result = zipEightByteInteger.getBytes();
	assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue3_owcB8() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
	long result = ZipEightByteInteger.getLongValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
	assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes2_omAg9() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testZipEightByteIntegerGetLongValueByteArrayInt_NZEy0() {
        byte[] bytes = new byte[8];
        int offset = 0;
        long expected = 0L;
        long actual = ZipEightByteInteger.getLongValue(bytes, offset);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testZipEightByteIntegerGetLongValueByteArray_PtQk2() {
        byte[] bytes = new byte[8];
        long expected = 0L;
        long actual = ZipEightByteInteger.getLongValue(bytes);
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue2_ksng4_kwDF0() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
	long result = zipEightByteInteger.getLongValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
	assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBytes_xrNX5_qAkD0() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
	byte[] result = zipEightByteInteger.getBytes();
	org.junit.jupiter.api.Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLongValue3_owcB8_yzSs0() {
	ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
	long result = zipEightByteInteger.getLongValue(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, 0);
	assertEquals(0L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetAccessJavaTime_GNrO0_qrJc0() {
		X000A_NTFS x000A_NTFS = new X000A_NTFS();
		Calendar calendar = Calendar.getInstance();
		Date d = calendar.getTime();
		x000A_NTFS.setAccessJavaTime(d);
		assertNotNull(x000A_NTFS);
}
}