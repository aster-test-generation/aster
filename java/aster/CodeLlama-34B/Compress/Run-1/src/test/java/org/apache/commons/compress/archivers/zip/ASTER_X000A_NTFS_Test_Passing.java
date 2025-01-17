/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.file.attribute.FileTime;
import java.util.Date;
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
public void testGetLocalFileDataLength_euwm0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort zipShort = x000A_NTFS.getLocalFileDataLength();
    assertEquals(4 + 2 + 2 + 3 * 8, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_NuKH0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), x000A_NTFS.getLocalFileDataLength().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_Null_yPob0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setCreateTime(null);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_NonNull_jJdD1() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08 });
    ntfs.setCreateTime(t);
    assertEquals(t, ntfs.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTime_LcCU0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime fileTime = FileTime.fromMillis(1000000000000L);
    x000A_NTFS.setAccessFileTime(fileTime);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(fileTime)), x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_ejYv0() {
    X000A_NTFS x = new X000A_NTFS();
    assertTrue(x.equals(x));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyFileTime_IYgS0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime fileTime = FileTime.fromMillis(1000000000000L);
    x000A_NTFS.setModifyFileTime(fileTime);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(fileTime)), x000A_NTFS.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateFileTime_lTpu0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime time = FileTime.fromMillis(1000000000000L);
    x000A_NTFS.setCreateFileTime(time);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(time)), x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateFileTimeWithZero_KkVc2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime time = FileTime.fromMillis(0L);
    x000A_NTFS.setCreateFileTime(time);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(time)), x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyJavaTime_gyYw0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date();
    x000A_NTFS.setModifyJavaTime(d);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(d)), x000A_NTFS.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_Null_HgKC0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setAccessTime(null);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_NonNull_nIxw1() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[]{1, 2, 3, 4, 5, 6, 7, 8});
    ntfs.setAccessTime(t);
    assertEquals(t, ntfs.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_Zero_EKfD2() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(0);
    ntfs.setAccessTime(t);
    assertEquals(t, ntfs.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_Negative_zKmt3() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(-1);
    ntfs.setAccessTime(t);
    assertEquals(t, ntfs.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_MaxValue_NHLT4() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(Long.MAX_VALUE);
    ntfs.setAccessTime(t);
    assertEquals(t, ntfs.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_MinValue_MWRQ5() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(Long.MIN_VALUE);
    ntfs.setAccessTime(t);
    assertEquals(t, ntfs.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_HbRF0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort headerId = x000A_NTFS.getHeaderId();
        assertNotNull(headerId);
        assertEquals(0x000A, headerId.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_Null_mzbl0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setModifyTime(null);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_NonNull_russ1() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ntfs.setModifyTime(t);
    assertEquals(t, ntfs.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_DifferentValue_fIrm2() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    ntfs.setModifyTime(t);
    ZipEightByteInteger t2 = new ZipEightByteInteger(new byte[] {9, 10, 11, 12, 13, 14, 15, 16});
    ntfs.setModifyTime(t2);
    assertEquals(t2, ntfs.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessJavaTimeWithNull_xFHc1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date expected = null;
        Date actual = x000A_NTFS.getAccessJavaTime();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_oUFb0_1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_oUFb0_2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
    assertEquals(32, centralDirectoryData.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_oUFb0_3() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
    assertEquals(0, centralDirectoryData[0]);}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_oUFb0_4() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
    assertEquals(1, centralDirectoryData[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_oUFb0_5() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLengthCoverage_XmBe1_3() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort zipShort = x000A_NTFS.getLocalFileDataLength();
    assertEquals(4 + 2 + 2 + 3 * 8, ZipShort.getValue(zipShort.getBytes()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLengthCoverage_XmBe1_4() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort zipShort = x000A_NTFS.getLocalFileDataLength();
    assertEquals(4 + 2 + 2 + 3 * 8, ZipShort.getValue(zipShort.getBytes(), 0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_GiNr1_3() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.hashCode(), x000A_NTFS.getLocalFileDataLength().hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTime_MGnt1_2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessFileTime(null);
    FileTime fileTime = FileTime.fromMillis(1000000000000L);
    x000A_NTFS.setAccessFileTime(fileTime);
    fileTime = FileTime.fromMillis(-1000000000000L);
    x000A_NTFS.setAccessFileTime(fileTime);
    fileTime = FileTime.fromMillis(2000000000000L);
    x000A_NTFS.setAccessFileTime(fileTime);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(fileTime)), x000A_NTFS.getAccessTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_HbRF0_1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort headerId = x000A_NTFS.getHeaderId();
        assertNotNull(headerId);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetHeaderId_HbRF0_2() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort headerId = x000A_NTFS.getHeaderId();
        assertEquals(0x000A, headerId.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateFileTimeWithNullCreateTime_lTzp1_ZwKj0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setCreateTime(null);
    FileTime fileTime = x000A_NTFS.getCreateFileTime();
    assertNull(fileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessFileTimeWithNullAccessTime_QIGc1_jOoE0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessTime(null);
    FileTime fileTime = x000A_NTFS.getAccessFileTime();
    assertNull(fileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyFileTimeWithNullModifyTime_KKWc1_Ovhg0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setModifyTime(null);
    FileTime fileTime = x000A_NTFS.getModifyFileTime();
    assertNull(fileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_modifyTime_kFGK0_bfUg0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setModifyTime(new ZipEightByteInteger(1234567890));
    int expected = -123 ^ x000A_NTFS.getModifyTime().hashCode();
    int actual = x000A_NTFS.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_createTime_nVXw2_BwoJ0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setCreateTime(new ZipEightByteInteger(1234567890));
    int expected = -123 ^ Integer.rotateLeft(x000A_NTFS.getCreateTime().hashCode(), 22);
    int actual = x000A_NTFS.hashCode();
    assertEquals(expected, actual);
}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_accessTime_PgsQ1_oCyD0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        x000A_NTFS.setAccessTime(new ZipEightByteInteger(1234567890L));
        int expected = -123 ^ Integer.rotateLeft(x000A_NTFS.getAccessTime().hashCode(), 11);
        int actual = x000A_NTFS.hashCode();
        assertEquals(expected, actual);
    }
}