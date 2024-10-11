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
public void testGetModifyTime_JWue0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger modifyTime = x000A_NTFS.getModifyTime();
    assertNotNull(modifyTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_KxNK0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] result = x000A_NTFS.getCentralDirectoryData();
    byte[] expectedResult = x000A_NTFS.getLocalFileDataData();
    assertArrayEquals(expectedResult, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTime_BCtT0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime fileTime = FileTime.fromMillis(1000);
    x000A_NTFS.setAccessFileTime(fileTime);
    assertEquals(1000, x000A_NTFS.getAccessTime().getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_YScQ0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort zipShort = x000A_NTFS.getLocalFileDataLength();
    byte[] bytes = zipShort.getBytes();
    int value = ZipShort.getValue(bytes);
    assertEquals(26, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_QPdv0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipShort expected = x000A_NTFS.getLocalFileDataLength();
    ZipShort actual = x000A_NTFS.getCentralDirectoryLength();
    assertArrayEquals(expected.getBytes(), actual.getBytes());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_TXSC0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    assertEquals(-123, x000A_NTFS.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_gbEt0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] expected = new byte[x000A_NTFS.getLocalFileDataLength().getValue()];
    byte[] actual = x000A_NTFS.getLocalFileDataData();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_withNullValue_oNwi1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setCreateTime(null);
    assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_iHuZ0() {
    X000A_NTFS xf = new X000A_NTFS();
    assertTrue(xf.equals(xf));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_yDde1() {
    Object obj = new Object();
    X000A_NTFS xf = new X000A_NTFS();
    assertFalse(xf.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameValues_sPrQ2() {
    X000A_NTFS xf1 = new X000A_NTFS();
    X000A_NTFS xf2 = new X000A_NTFS();
    assertTrue(xf1.equals(xf2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateJavaTime_LyRw0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date date = new Date();
    x000A_NTFS.setCreateJavaTime(date);
    assertNotNull(x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyJavaTime_UcUG0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date();
    x000A_NTFS.setModifyJavaTime(d);
    assertEquals(d, x000A_NTFS.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_eCGY0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    String result = x000A_NTFS.toString();
    assertEquals("0x000A Zip Extra Field: Modify:[" + x000A_NTFS.getModifyFileTime() + "] Access:[" + x000A_NTFS.getAccessFileTime() + "] Create:[" + x000A_NTFS.getCreateFileTime() + "] ", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateFileTime_NTjp0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    FileTime time = FileTime.fromMillis(1000);
    x000A_NTFS.setCreateFileTime(time);
    assertEquals("1970-01-01T00:00:01Z", x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_withNonNullValue_olun0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(123L);
    x000A_NTFS.setAccessTime(zipEightByteInteger);
    assertEquals(zipEightByteInteger, x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessTime_withNullValue_zLUX1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessTime(null);
    assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_withNullArgument_IPhV1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setModifyTime(null);
    assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTime_hAer0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger accessTime = x000A_NTFS.getAccessTime();
    assertNotNull(accessTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_3_Crje2_vzdL0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date();
    x000A_NTFS.setAccessJavaTime(d);
    assertEquals(-123 ^ Integer.rotateLeft(x000A_NTFS.getAccessTime().hashCode(), 11), x000A_NTFS.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_4_Iwhg3_sKEo0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setModifyJavaTime(new Date());
    x000A_NTFS.setAccessJavaTime(new Date());
    x000A_NTFS.setCreateJavaTime(new Date());
    assertEquals(-123 ^ x000A_NTFS.getModifyTime().hashCode() ^ Integer.rotateLeft(x000A_NTFS.getAccessTime().hashCode(), 11) ^ Integer.rotateLeft(x000A_NTFS.getCreateTime().hashCode(), 22), x000A_NTFS.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateFileTime_xNRF0_QDYl0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger createTime = new ZipEightByteInteger(123456789L);
    x000A_NTFS.setCreateTime(createTime);
    FileTime expected = FileTimes.ntfsTimeToFileTime(123456789L);
    assertEquals(expected, x000A_NTFS.getCreateFileTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessFileTime_BmPs0_gAvA0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date();
    x000A_NTFS.setAccessJavaTime(d);
    FileTime actual = x000A_NTFS.getAccessFileTime();
    assertEquals(FileTime.fromMillis(d.getTime()), actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTime_withNonNullValue_krMu0_STdN0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date(123);
    x000A_NTFS.setAccessJavaTime(d);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentModifyTime_xhnf3_Jvrg0() {
    X000A_NTFS xf1 = new X000A_NTFS();
    X000A_NTFS xf2 = new X000A_NTFS();
    xf2.setAccessJavaTime(new Date(1640995200000L)); // 2022-01-01 00:00:00
    assertFalse(xf1.equals(xf2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentAccessTime_kXzz4_PnVO0() {
    X000A_NTFS xf1 = new X000A_NTFS();
    X000A_NTFS xf2 = new X000A_NTFS();
    Date d = new Date(122, 0, 1, 0, 0, 0); // 2022-01-01 00:00:00
    xf2.setAccessJavaTime(d);
    assertFalse(xf1.equals(xf2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessJavaTime_fZNG0_AQvZ0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date(123456789L);
    x000A_NTFS.setAccessJavaTime(d);
    Date expected = FileTimes.ntfsTimeToDate(123456789L);
    Date actual = x000A_NTFS.getAccessJavaTime();
    assert actual.equals(expected);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateTime_RaUx0_Cbdw0_1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger createTime = x000A_NTFS.getCreateTime();
    byte[] bytes = createTime.getBytes();
    long value = createTime.getLongValue();
    assertNotNull(createTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateTime_RaUx0_Cbdw0_2() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger createTime = x000A_NTFS.getCreateTime();
    byte[] bytes = createTime.getBytes();
    long value = createTime.getLongValue();
    assertNotNull(bytes);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateTime_RaUx0_Cbdw0_3() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger createTime = x000A_NTFS.getCreateTime();
    byte[] bytes = createTime.getBytes();
    long value = createTime.getLongValue();
    assertNotNull(value);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetModifyTime_withNonNullArgument_WPez0_ZShc0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    Date d = new Date(123);
    x000A_NTFS.setAccessJavaTime(d);
    assertEquals(d, x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_TimeAttrTagFound_EvBF0_AZLK0_1() throws ZipException {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] data = new byte[] {0, 1, 2, 3, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19};
    int offset = 0;
    int length = data.length;
    x000A_NTFS.parseFromLocalFileData(data, offset, length);
    assertEquals(0x0102030405060708L, x000A_NTFS.getModifyTime().getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_TimeAttrTagFound_EvBF0_AZLK0_2() throws ZipException {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] data = new byte[] {0, 1, 2, 3, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19};
    int offset = 0;
    int length = data.length;
    x000A_NTFS.parseFromLocalFileData(data, offset, length);
    assertEquals(0x0910111213141516L, x000A_NTFS.getAccessTime().getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_TimeAttrTagFound_EvBF0_AZLK0_3() throws ZipException {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] data = new byte[] {0, 1, 2, 3, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19};
    int offset = 0;
    int length = data.length;
    x000A_NTFS.parseFromLocalFileData(data, offset, length);
    assertEquals(0x1718191011121314L, x000A_NTFS.getCreateTime().getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData_TimeAttrTagNotFound_Syjs1_VNAW0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] data = new byte[] {0, 1, 2, 3, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
    int offset = 0;
    int length = data.length;
    try {
        x000A_NTFS.parseFromLocalFileData(data, offset, length);
    } catch (ZipException e) {
    }
    assertNull(x000A_NTFS.getModifyTime());
    assertNull(x000A_NTFS.getAccessTime());
    assertNull(x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_Twcr0_oAkR0_1() throws ZipException {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] buffer = new byte[10];
    x000A_NTFS.parseFromCentralDirectoryData(buffer, 0, 10);
    assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getModifyTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_Twcr0_oAkR0_2() throws ZipException {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] buffer = new byte[10];
    x000A_NTFS.parseFromCentralDirectoryData(buffer, 0, 10);
    assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getAccessTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromCentralDirectoryData_Twcr0_oAkR0_3() throws ZipException {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    byte[] buffer = new byte[10];
    x000A_NTFS.parseFromCentralDirectoryData(buffer, 0, 10);
    assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getCreateTime());}
}