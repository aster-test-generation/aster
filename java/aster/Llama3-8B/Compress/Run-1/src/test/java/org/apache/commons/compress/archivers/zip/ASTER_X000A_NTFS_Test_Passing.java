/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.zip.ZipException;
import org.apache.commons.io.file.attribute.FileTimes;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X000A_NTFS_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyTime_OGVh0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger result = x000A_NTFS.getModifyTime();
    assertNull(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_uADl0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        byte[] expected = x000A_NTFS.getLocalFileDataData();
        byte[] result = x000A_NTFS.getCentralDirectoryData();
        assertArrayEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessFileTime_Wwfd0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        FileTime time = FileTime.fromMillis(1234567890);
        x000A_NTFS.setAccessFileTime(time);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeModifyTimeNull_PZTx1() {
        X000A_NTFS obj = new X000A_NTFS();
        int result = obj.hashCode();
        assert result == -123;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateFileTime_OETH0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        FileTime result = x000A_NTFS.getCreateFileTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyFileTimeNull_UhDn1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger zipEightByteInteger = null;
        FileTime result = x000A_NTFS.getModifyFileTime();
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyFileTimeZero_mNNP2() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
        FileTime result = x000A_NTFS.getModifyFileTime();
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessFileTimeNull_iUWd1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger zipEightByteInteger = null;
        FileTime result = x000A_NTFS.getAccessFileTime();
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreateTimeNull_OdiJ0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        x000A_NTFS.setCreateTime(ZipEightByteInteger.ZERO);
        assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getCreateTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_GMiz0() {
    X000A_NTFS obj1 = new X000A_NTFS();
    X000A_NTFS obj2 = obj1;
    boolean result = obj1.equals(obj2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_dzjh1() {
    X000A_NTFS obj1 = new X000A_NTFS();
    Object obj2 = new Object();
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_OUMY2() {
    X000A_NTFS obj1 = new X000A_NTFS();
    boolean result = obj1.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectWithSameFields_WyEe4() {
    X000A_NTFS obj1 = new X000A_NTFS();
    X000A_NTFS obj2 = new X000A_NTFS();
    boolean result = obj1.equals(obj2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreateJavaTime_JHcF0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date d = new Date();
        obj.setCreateJavaTime(d);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyJavaTime_iWKB0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date date = new Date();
        obj.setModifyJavaTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessTimeNull_qkCo0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        x000A_NTFS.setAccessTime(null);
        assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessTimeNotNull_SgBi1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(ZipEightByteInteger.ZERO.getBytes());
        x000A_NTFS.setAccessTime(zipEightByteInteger);
        assertEquals(zipEightByteInteger, x000A_NTFS.getAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyTimeNull_AKbB0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger t = null;
        x000A_NTFS.setModifyTime(t);
        assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getModifyTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_urdE0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger result = x000A_NTFS.getAccessTime();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyFileTime_fRJb0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        FileTime time = FileTime.fromMillis(1234567890L);
        x000A_NTFS.setModifyFileTime(time);
        assertEquals(time, x000A_NTFS.getModifyFileTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessJavaTime_tdAC0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date date = new Date();
        obj.setAccessJavaTime(date);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeAccessTimeNotNull_FbUt2_KicZ0() {
    X000A_NTFS obj = new X000A_NTFS();
    obj.setAccessJavaTime(new Date(System.currentTimeMillis()));
    int result = obj.hashCode();
    assert result != -123;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyFileTime_YpnV0_UCEh0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(1234567890L);
    x000A_NTFS.setModifyJavaTime(new Date(zipEightByteInteger.getLongValue()));
    FileTime result = x000A_NTFS.getModifyFileTime();
    assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessFileTime_etlr0_ycMe0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date(1);
    x000A_NTFS.setAccessJavaTime(d);
    FileTime result = x000A_NTFS.getAccessFileTime();
    assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateTime_eOir0_mXsG0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger expected = null;
    ZipEightByteInteger actual = x000A_NTFS.getCreateTime();
    assertNull(expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTimeNotNull_yxXd1_PqFW0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(FileTimes.toNtfsTime(new Date(1234567890000L)));
    x000A_NTFS.setModifyTime(t);
    assertEquals(t, x000A_NTFS.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData1_tCCm0_gVvn0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] data = new byte[20];
    data[0] = 0x04;
    data[1] = 0x03;
    data[2] = 0x00;
    data[3] = 0x00;
    data[4] = 0x00;
    data[5] = 0x00;
    data[6] = 0x00;
    data[7] = 0x00;
    data[8] = 0x00;
    data[9] = 0x00;
    data[10] = 0x00;
    data[11] = 0x00;
    data[12] = 0x00;
    data[13] = 0x00;
    data[14] = 0x00;
    data[15] = 0x00;
    data[16] = 0x00;
    data[17] = 0x00;
    data[18] = 0x00;
    data[19] = 0x00;
    try {
        x000A_NTFS.parseFromLocalFileData(data, 0, 20);
    } catch (java.util.zip.ZipException e) {
    }
}
}