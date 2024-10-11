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
public void testEquals_SameObject_gxHA0() throws Exception {
    X7875_NewUnix x = new X7875_NewUnix();
    assertTrue(x.equals(x));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_JbrG1() throws Exception {
    X7875_NewUnix x = new X7875_NewUnix();
    X7875_NewUnix y = new X7875_NewUnix();
    assertFalse(x.equals(y));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_InvalidData_rYbU1() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int offset = 0;
    int length = data.length;
    try {
        x7875.parseFromLocalFileData(data, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("X7875_NewUnix length is too short, only 10 bytes", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_InvalidUidSize_bosM2() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int offset = 0;
    int length = data.length;
    try {
        x7875.parseFromLocalFileData(data, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("X7875_NewUnix invalid: uidSize 2 doesn't fit into 10 bytes", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_InvalidGidSize_iHot3() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int offset = 0;
    int length = data.length;
    try {
        x7875.parseFromLocalFileData(data, offset, length);
        fail("Expected ZipException");
    } catch (ZipException e) {
        assertEquals("X7875_NewUnix invalid: gidSize 3 doesn't fit into 10 bytes", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_Esvz0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    byte[] centralDirectoryData = x7875_NewUnix.getCentralDirectoryData();
    assertEquals(ByteUtils.EMPTY_BYTE_ARRAY, centralDirectoryData);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_LEvU0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort headerId = x7875_NewUnix.getHeaderId();
    assertEquals(headerId.getValue(), 0x7875);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGID_jxAr0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long gid = x7875_NewUnix.getGID();
    assertEquals(0, gid);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGIDWithNonZeroGid_ATPm1() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long gid = x7875_NewUnix.getGID();
    assertNotEquals(0, gid);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetGIDWithNullGid_ypGq2() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long gid = x7875_NewUnix.getGID();
    assertNull(gid);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_ojbf0() throws Exception {
    X7875_NewUnix x = new X7875_NewUnix();
    String expected = "0x7875 Zip Extra Field: UID=0 GID=0";
    String actual = x.toString();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGID_ValidInput_wxTS0() throws Exception {
    X7875_NewUnix x7875_newUnix = new X7875_NewUnix();
    long l = 1234567890L;
    x7875_newUnix.setGID(l);
    assertEquals(ZipUtil.longToBig(l), x7875_newUnix.getGID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_TePe0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_lineCoverage_WPlU1() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getValue());
    assertEquals(0, centralDirectoryLength.getBytes().length);
    assertEquals(0, centralDirectoryLength.hashCode());
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes()));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getValue());
    assertEquals(0, centralDirectoryLength.getBytes().length);
    assertEquals(0, centralDirectoryLength.hashCode());
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes()));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 0));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 1));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 2));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 3));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 4));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 5));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 6));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 7));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 8));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 9));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 10));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 11));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 12));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 13));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 14));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 15));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 16));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 17));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 18));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 19));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 20));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 21));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 22));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 23));
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 24));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_version_hwwK0() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = x7875.getLocalFileDataData();
    assertEquals(1, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_uidBytes_boMD1() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = x7875.getLocalFileDataData();
    assertEquals(2, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_gidBytes_MxnC2() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = x7875.getLocalFileDataData();
    assertEquals(3, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_uidBytesLen_VIfM3() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = x7875.getLocalFileDataData();
    assertEquals(4, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_gidBytesLen_noTS4() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = x7875.getLocalFileDataData();
    assertEquals(5, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_data_mTCC5() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = x7875.getLocalFileDataData();
    assertEquals(6, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_pos_WxJf6() throws Exception {
    X7875_NewUnix x7875 = new X7875_NewUnix();
    byte[] data = x7875.getLocalFileDataData();
    assertEquals(7, data.length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTrimLeadingZeroesForceMinLength_nullArray_rXZP0() throws Exception {
    byte[] array = null;
    byte[] expected = null;
    byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTrimLeadingZeroesForceMinLength_emptyArray_FKSq1() throws Exception {
    byte[] array = new byte[0];
    byte[] expected = new byte[0];
    byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTrimLeadingZeroesForceMinLength_arrayWithLeadingZeroes_aJBA2() throws Exception {
    byte[] array = new byte[] {0, 0, 1, 2, 3, 4, 5};
    byte[] expected = new byte[] {1, 2, 3, 4, 5};
    byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTrimLeadingZeroesForceMinLength_arrayWithoutLeadingZeroes_JHpJ3() throws Exception {
    byte[] array = new byte[] {1, 2, 3, 4, 5};
    byte[] expected = new byte[] {1, 2, 3, 4, 5};
    byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTrimLeadingZeroesForceMinLength_arrayWithOnlyZeroes_BpOl4() throws Exception {
    byte[] array = new byte[] {0, 0, 0, 0, 0};
    byte[] expected = new byte[] {0, 0, 0, 0, 0};
    byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTrimLeadingZeroesForceMinLength_arrayWithLeadingZeroesAndNegativeValues_MtfX5() throws Exception {
    byte[] array = new byte[] {-1, 0, 0, 1, 2, 3, 4, 5};
    byte[] expected = new byte[] {-1, 0, 1, 2, 3, 4, 5};
    byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTrimLeadingZeroesForceMinLength_arrayWithLeadingZeroesAndPositiveValues_cwrW6() throws Exception {
    byte[] array = new byte[] {1, 0, 0, 1, 2, 3, 4, 5};
    byte[] expected = new byte[] {1, 0, 1, 2, 3, 4, 5};
    byte[] actual = X7875_NewUnix.trimLeadingZeroesForceMinLength(array);
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_fBOA0() throws CloneNotSupportedException {
    X7875_NewUnix obj = new X7875_NewUnix();
    Object clone = obj.clone();
    assertNotNull(clone);
    assertTrue(clone instanceof X7875_NewUnix);
    assertEquals(obj, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithDifferentObject_nnEt3() throws CloneNotSupportedException {
    X7875_NewUnix obj = new X7875_NewUnix();
    Object clone = obj.clone();
    assertNotNull(clone);
    assertTrue(clone instanceof X7875_NewUnix);
    assertNotEquals(obj, clone);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithNonNullClass_TxCe10() throws CloneNotSupportedException {
    X7875_NewUnix obj = new X7875_NewUnix();
    Object clone = obj.clone();
    assertNotNull(clone);
    assertTrue(clone instanceof X7875_NewUnix);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_ValidInput_ReFd0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = 1234567890;
    x7875_NewUnix.setUID(l);
    assertEquals(l, x7875_NewUnix.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_InvalidInput_hfsa1() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = -1;
    x7875_NewUnix.setUID(l);
    assertEquals(l, x7875_NewUnix.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_MaxValue_EKmH3() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = Long.MAX_VALUE;
    x7875_NewUnix.setUID(l);
    assertEquals(l, x7875_NewUnix.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_MinValue_VEbm4() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = Long.MIN_VALUE;
    x7875_NewUnix.setUID(l);
    assertEquals(l, x7875_NewUnix.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_ZeroValue_UrfR5() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = 0;
    x7875_NewUnix.setUID(l);
    assertEquals(l, x7875_NewUnix.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_NegativeValue_Mfia6() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = -1234567890;
    x7875_NewUnix.setUID(l);
    assertEquals(l, x7875_NewUnix.getUID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_RandomValue_Dxwx8() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = (long) (Math.random() * Long.MAX_VALUE);
    x7875_NewUnix.setUID(l);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_lineCoverage_WPlU1_2() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.getBytes().length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_lineCoverage_WPlU1_3() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, centralDirectoryLength.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_lineCoverage_WPlU1_4() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_lineCoverage_WPlU1_5() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_6() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_7() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_8() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_9() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 4));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_10() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 5));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_11() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 6));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_12() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 7));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_13() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 8));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_14() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 9));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_15() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 10));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_16() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 11));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_17() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 12));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_18() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 13));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_19() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 14));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_20() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 15));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_21() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 16));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_22() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 17));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_23() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 18));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_24() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 19));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_25() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 20));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_26() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 21));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_27() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 22));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_28() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 23));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_branchCoverage_dhbO2_29() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort centralDirectoryLength = x7875_NewUnix.getCentralDirectoryLength();
    assertEquals(0, ZipShort.getValue(centralDirectoryLength.getBytes(), 24));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_fBOA0_1() throws CloneNotSupportedException {
    X7875_NewUnix obj = new X7875_NewUnix();
    Object clone = obj.clone();
    assertNotNull(clone);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_fBOA0_2() throws CloneNotSupportedException {
    X7875_NewUnix obj = new X7875_NewUnix();
    Object clone = obj.clone();
    assertTrue(clone instanceof X7875_NewUnix);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_fBOA0_3() throws CloneNotSupportedException {
    X7875_NewUnix obj = new X7875_NewUnix();
    Object clone = obj.clone();
    assertEquals(obj, clone);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneWithDifferentObject_nnEt3_3() throws CloneNotSupportedException {
    X7875_NewUnix obj = new X7875_NewUnix();
    Object clone = obj.clone();
    assertNotEquals(obj, clone);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderIdWithNullValue_lakp2_VOJM0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    ZipShort headerId = x7875_NewUnix.getHeaderId();
    assertNull(headerId);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGID_InvalidInput_VaaZ1_nMmM0() throws Exception {
    X7875_NewUnix x7875_newUnix = new X7875_NewUnix();
    long l = -1L;
    x7875_newUnix.setGID(l);
    assertNull(x7875_newUnix.getGID());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUID_MGAN0_RVOo0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long uid = x7875_NewUnix.getUID();
    assertEquals(uid, ZipUtil.bigToLong(ZipUtil.longToBig(uid)));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUID_NullUID_iohv1_wjFt0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long uid = x7875_NewUnix.getUID();
    assertEquals(uid, 0);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetUID_NullInput_pbrT2_DMaF0() throws Exception {
    X7875_NewUnix x7875_NewUnix = new X7875_NewUnix();
    long l = 0L;
    x7875_NewUnix.setUID(l);
    assertEquals(l, x7875_NewUnix.getUID());
}
}