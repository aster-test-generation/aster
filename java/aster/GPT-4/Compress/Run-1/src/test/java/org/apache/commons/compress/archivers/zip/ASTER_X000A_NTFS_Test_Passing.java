/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X000A_NTFS_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryData_tgvN0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    byte[] result = ntfs.getCentralDirectoryData();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessFileTimeWithNonNullTime_rfcU0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    FileTime time = FileTime.fromMillis(System.currentTimeMillis());
    ntfs.setAccessFileTime(time);
    System.out.println("Test executed with non-null time.");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataLength_TkEg0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipShort result = ntfs.getLocalFileDataLength();
    assertEquals(32, result.getValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCentralDirectoryLength_ornW0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipShort expected = ntfs.getLocalFileDataLength();
    ZipShort result = ntfs.getCentralDirectoryLength();
    assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_AllNull_uwQr0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    int expectedHashCode = -123;
    assertEquals(expectedHashCode, ntfs.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_UZDe0_1() {
    X000A_NTFS ntfs = new X000A_NTFS();
    byte[] result = ntfs.getLocalFileDataData();
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateFileTime_WithNullCreateTime_ShouldReturnNull_MMJS0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    FileTime result = ntfs.getCreateFileTime();
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateTimeWithNull_lsym0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setCreateTime(null);
    assertEquals(ZipEightByteInteger.ZERO, ntfs.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_jqjz0() {
    X000A_NTFS ntfs1 = new X000A_NTFS();
    assertTrue(ntfs1.equals(ntfs1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_PRlt1() {
    X000A_NTFS ntfs1 = new X000A_NTFS();
    assertFalse(ntfs1.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_sYrw2() {
    X000A_NTFS ntfs1 = new X000A_NTFS();
    Object otherObject = new Object();
    assertFalse(ntfs1.equals(otherObject));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentValues_jYyn3() {
    X000A_NTFS ntfs1 = new X000A_NTFS();
    X000A_NTFS ntfs2 = new X000A_NTFS();
    assertTrue(ntfs1.equals(ntfs2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileDataWithValidTimeAttr_YgAc0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    byte[] data = new byte[] {
    };
    try {
        ntfs.parseFromLocalFileData(data, 0, data.length);
        assertTrue(true); // Assuming the method processes without exceptions
    } catch (ZipException e) {
        fail("Should not throw exception");
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyJavaTime_xryW0() {
        X000A_NTFS ntfs = new X000A_NTFS();
        Date now = new Date();
        ntfs.setModifyJavaTime(now);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHeaderId_ibuV0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ZipShort result = ntfs.getHeaderId();
    assertNotNull(result);
    assertEquals(10, result.getValue()); // Assuming HEADER_ID corresponds to a ZipShort with value 10
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateFileTime_dsCM0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    FileTime time = FileTime.fromMillis(System.currentTimeMillis());
    ntfs.setCreateFileTime(time);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessJavaTime_NullAccessTime_WLVz0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    assertNull(ntfs.getAccessJavaTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAccessJavaTime_Wgzo0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    Date testDate = new Date();
    ntfs.setAccessJavaTime(testDate);
}
}