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
public void testGetCentralDirectoryData_kExW0_1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_kExW0_2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
    assertEquals(100, centralDirectoryData.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTime_yNSk0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime fileTime = FileTime.fromMillis(1000000000000L);
    x000A_NTFS.setAccessFileTime(fileTime);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(fileTime)), x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTimeNull_HFbJ1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessFileTime(null);
    assertNull(x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTimeInvalid_oiCW2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime fileTime = FileTime.fromMillis(0L);
    x000A_NTFS.setAccessFileTime(fileTime);
    assertNull(x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_Srmx0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort zipShort = x000A_NTFS.getLocalFileDataLength();
    assertEquals(4 + 2 + 2 + 3 * 8, zipShort.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_pRdZ0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), x000A_NTFS.getLocalFileDataLength().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_LineCoverage_qqGR1_2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getBytes().length, x000A_NTFS.getLocalFileDataLength().getBytes().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_LineCoverage_qqGR1_3() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.hashCode(), x000A_NTFS.getLocalFileDataLength().hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_BranchCoverage_sCXI2_4() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), ZipShort.getValue(centralDirectoryLength.getBytes()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_BranchCoverage_sCXI2_5() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), ZipShort.getValue(centralDirectoryLength.getBytes(), 0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_Null_ndek0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setCreateTime(null);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_NonNull_GPpA1() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 });
    ntfs.setCreateTime(t);
    assertEquals(t, ntfs.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_InvalidInput_rjyL2() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 });
    ntfs.setCreateTime(t);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_NullInput_aOPj3() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 });
    ntfs.setCreateTime(t);
    ntfs.setCreateTime(null);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_taln0() {
    X000A_NTFS x = new X000A_NTFS();
    assertTrue(x.equals(x));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_oINZ1() {
    X000A_NTFS x = new X000A_NTFS();
    X000A_NTFS y = new X000A_NTFS();
    assertFalse(x.equals(y));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_LRAB2() {
    X000A_NTFS x = new X000A_NTFS();
    assertFalse(x.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_ZdfU3() {
    X000A_NTFS x = new X000A_NTFS();
    Object y = new Object();
    assertFalse(x.equals(y));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_cpQL4() {
    X000A_NTFS x = new X000A_NTFS();
    X000A_NTFS y = new X000A_NTFS();
    y.setModifyTime(x.getModifyTime());
    y.setAccessTime(x.getAccessTime());
    y.setCreateTime(x.getCreateTime());
    assertTrue(x.equals(y));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_AllNull_utko6() {
    X000A_NTFS x = new X000A_NTFS();
    X000A_NTFS y = new X000A_NTFS();
    assertTrue(x.equals(y));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateJavaTime_ZTeL0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date();
    x000A_NTFS.setCreateJavaTime(d);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(d)), x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateJavaTimeWithNullDate_VPuy1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setCreateJavaTime(null);
    assertEquals(null, x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateJavaTimeWithSpecificDate_vVum2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date(1234567890);
    x000A_NTFS.setCreateJavaTime(d);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(d)), x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateJavaTimeMultipleTimes_cfwf3() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d1 = new Date();
    Date d2 = new Date(1234567890);
    x000A_NTFS.setCreateJavaTime(d1);
    x000A_NTFS.setCreateJavaTime(d2);
    assertEquals(new ZipEightByteInteger(FileTimes.toNtfsTime(d2)), x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyJavaTime_ToLi0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date date = new Date();
        x000A_NTFS.setModifyJavaTime(date);
        assertEquals(date, x000A_NTFS.getModifyJavaTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_dxNQ0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort headerId = x000A_NTFS.getHeaderId();
    assertEquals(headerId.getValue(), 0x000A);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_DTLx0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    String expected = "0x000A Zip Extra Field: Modify:[1970-01-01 00:00:00] Access:[1970-01-01 00:00:00] Create:[1970-01-01 00:00:00] ";
    String actual = x000A_NTFS.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessJavaTime_BPFn0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date expected = new Date(1234567890);
    Date actual = x000A_NTFS.getAccessJavaTime();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_Null_rQXL0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessTime(null);
    assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_NonNull_PmTS1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[] {1, 2, 3, 4, 5, 6, 7, 8});
    x000A_NTFS.setAccessTime(t);
    assertEquals(t, x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateJavaTime_kIgI0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    Date expected = new Date(1234567890);
    Date actual = ntfs.getCreateJavaTime();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_Null_MWok0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setModifyTime(null);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_NonNull_sBFg1() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08});
    ntfs.setModifyTime(t);
    assertEquals(t, ntfs.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_DifferentValue_yLoa2() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipEightByteInteger t = new ZipEightByteInteger(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08});
    ntfs.setModifyTime(t);
    ZipEightByteInteger t2 = new ZipEightByteInteger(new byte[]{0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10});
    ntfs.setModifyTime(t2);
    assertEquals(t2, ntfs.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTime_Dasy0_1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger accessTime = x000A_NTFS.getAccessTime();
    assertNotNull(accessTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTime_Dasy0_2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger accessTime = x000A_NTFS.getAccessTime();
    assertEquals(0, accessTime.getLongValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyJavaTimeWithNull_Ytui1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date expected = null;
        Date actual = x000A_NTFS.getModifyJavaTime();
        assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertNotNull(modifyTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertEquals(0, modifyTime.getLongValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_3() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertEquals(0, modifyTime.getValue().longValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_4() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertArrayEquals(new byte[0], modifyTime.getBytes());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_5() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertEquals(0, modifyTime.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_7() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertArrayEquals(new byte[0], ZipEightByteInteger.getBytes(modifyTime.getValue()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_8() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertArrayEquals(new byte[0], ZipEightByteInteger.getBytes(modifyTime.getLongValue()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyTime_LYrj0_estQ0_9() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertEquals(modifyTime, ZipEightByteInteger.getValue(modifyTime.getBytes()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_accessTime_CgTM1_VADQ0() {
    X000A_NTFS x = new X000A_NTFS();
    x.setAccessJavaTime(new Date());
    int expected = -123 ^ Integer.rotateLeft(x.getAccessTime().hashCode(), 11);
    int actual = x.hashCode();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void setUp_zxdN0_Hzhp0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setAccessJavaTime(new Date());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessFileTimeWithNullAccessTime_JfnO1_pgMs0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessJavaTime(null);
    FileTime fileTime = x000A_NTFS.getAccessFileTime();
    assertNull(fileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessFileTimeWithInvalidAccessTime_dMQK2_Zrao0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessJavaTime(new Date(-1));
    FileTime fileTime = x000A_NTFS.getAccessFileTime();
    assertNull(fileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyFileTime_aZYR1_wIJr0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date expected = new Date(0);
    FileTime actual = x000A_NTFS.getModifyFileTime();
    assertEquals(expected, actual.toMillis());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessFileTime_PMzi2_edEm0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date expected = new Date(0);
    FileTime actual = x000A_NTFS.getAccessFileTime();
    assertEquals(expected, actual.toMillis());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateFileTime_qlDM3_Kkoi0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date expected = new Date(0);
    FileTime actual = x000A_NTFS.getCreateFileTime();
    assertEquals(expected, actual.toMillis());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_Long_Sdvo4_axJF0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    long longValue = 1234567890L;
    ntfs.setModifyTime(new ZipEightByteInteger(longValue));
    assertEquals(longValue, ntfs.getModifyTime().getValue());
}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessJavaTime_NullDate_giPQ4_yRIv0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        x000A_NTFS.setAccessJavaTime(null);
        assertNull(x000A_NTFS.getAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_kExW0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] centralDirectoryData = x000A_NTFS.getCentralDirectoryData();
    assertNotNull(centralDirectoryData);
    assertEquals(100, centralDirectoryData.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_LineCoverage_qqGR1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), x000A_NTFS.getLocalFileDataLength().getValue());
    assertEquals(centralDirectoryLength.getBytes().length, x000A_NTFS.getLocalFileDataLength().getBytes().length);
    assertEquals(centralDirectoryLength.hashCode(), x000A_NTFS.getLocalFileDataLength().hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_BranchCoverage_sCXI2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort centralDirectoryLength = x000A_NTFS.getCentralDirectoryLength();
    assertEquals(centralDirectoryLength.getValue(), x000A_NTFS.getLocalFileDataLength().getValue());
    assertEquals(centralDirectoryLength.getBytes().length, x000A_NTFS.getLocalFileDataLength().getBytes().length);
    assertEquals(centralDirectoryLength.hashCode(), x000A_NTFS.getLocalFileDataLength().hashCode());
    assertEquals(centralDirectoryLength.getValue(), ZipShort.getValue(centralDirectoryLength.getBytes()));
    assertEquals(centralDirectoryLength.getValue(), ZipShort.getValue(centralDirectoryLength.getBytes(), 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTime_Dasy0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger accessTime = x000A_NTFS.getAccessTime();
    assertNotNull(accessTime);
    assertEquals(0, accessTime.getLongValue());
}
}