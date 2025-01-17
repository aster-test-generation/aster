/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.util.Date;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X000A_NTFS_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength_OIeU0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort result = x000A_NTFS.getLocalFileDataLength();
        int expected = 19;
        assert result.getValue() == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_NijW3() {
    X000A_NTFS obj1 = new X000A_NTFS();
    X000A_NTFS obj2 = new X000A_NTFS();
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_UQaJ0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        String result = x000A_NTFS.toString();
        assert result.equals("0x000A Zip Extra Field: Modify:[] Access:[] Create:[]");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreateFileTimeNull_AGJT1() {
        X000A_NTFS obj = new X000A_NTFS();
        obj.setCreateFileTime(null);
        assertNull(obj.getCreateTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessJavaTime_NWQK0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date result = obj.getAccessJavaTime();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateJavaTime_Cxwf0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date result = x000A_NTFS.getCreateJavaTime();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyJavaTime_GOUG0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date result = x000A_NTFS.getModifyJavaTime();
        assert result != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringModify_dzdo1_BWtD0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessJavaTime(new Date());
    String result = x000A_NTFS.toString();
    assert result.equals("0x000A Zip Extra Field: Modify:[] Access:[] Create:[]");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringAccess_hldj2_RKGb0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessJavaTime(new Date()); // Set the date to the current date
    String result = x000A_NTFS.toString();
    assert result.equals("0x000A Zip Extra Field: Modify:[] Access:[AccessTime] Create:[]");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringCreate_UOIC3_jYkb0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessJavaTime(new Date());
    String result = x000A_NTFS.toString();
    assert result.equals("0x000A Zip Extra Field: Modify:[] Access:[] Create:[yyyy-MM-dd HH:mm:ss]");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringAll_tCsR4_HqZd0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    x000A_NTFS.setAccessJavaTime(new Date());
    String result = x000A_NTFS.toString();
    assert result.equals("0x000A Zip Extra Field: Modify:[ModifyTime] Access:[AccessTime] Create:[CreateTime]");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData2_xYPm1_gHLj0() {
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
    data[20] = 0x00;
    try {
        x000A_NTFS.parseFromLocalFileData(data, 0, 20);
    } catch (java.util.zip.ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testParseFromLocalFileData3_btXn2_Lfhl0() {
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
    data[20] = 0x00;
    data[21] = 0x00;
    try {
        x000A_NTFS.parseFromLocalFileData(data, 0, 20);
    } catch (java.util.zip.ZipException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyTime_OGVh0_fid1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger result = x000A_NTFS.getModifyTime();
        assertEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCreateTime_eOir0_mXsG0_fid1() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger expected = null;
    ZipEightByteInteger actual = x000A_NTFS.getCreateTime();
    assertEquals(expected, actual);
}
}