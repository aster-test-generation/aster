/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.zip.ZipException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Arrays;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X000A_NTFS_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyTime_GaLx0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger result = x000A_NTFS.getModifyTime();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_nHov0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        byte[] result = x000A_NTFS.getCentralDirectoryData();
        byte[] expected = x000A_NTFS.getLocalFileDataData();
        assert Arrays.equals(result, expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessFileTime_asqT0() {
        X000A_NTFS obj = new X000A_NTFS();
        FileTime time = FileTime.fromMillis(1234567890L);
        obj.setAccessFileTime(time);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataLength_WdQV0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort result = x000A_NTFS.getLocalFileDataLength();
        assertEquals(19, result.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLength_VGPy0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipShort zipShort = x000A_NTFS.getLocalFileDataLength();
        assertEquals(zipShort.getValue(), x000A_NTFS.getCentralDirectoryLength().getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLocalFileDataData_SZSo0() {
        X000A_NTFS ntfs = new X000A_NTFS();
        byte[] result = ntfs.getLocalFileDataData();
        assert result.length == ntfs.getLocalFileDataLength().getValue();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateFileTime_SAhh0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        FileTime result = x000A_NTFS.getCreateFileTime();
        assertEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreateTimeNull_rgbw0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        x000A_NTFS.setCreateTime(ZipEightByteInteger.ZERO);
        assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getCreateTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_NvBi0() {
    X000A_NTFS obj1 = new X000A_NTFS();
    X000A_NTFS obj2 = obj1;
    boolean result = obj1.equals(obj2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_nsyP1() {
    X000A_NTFS obj1 = new X000A_NTFS();
    Object obj2 = new Object();
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_sUgy2() {
    X000A_NTFS obj1 = new X000A_NTFS();
    boolean result = obj1.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_ymRV3() {
    X000A_NTFS obj1 = new X000A_NTFS();
    X000A_NTFS obj2 = new X000A_NTFS();
    boolean result = obj1.equals(obj2);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectWithSameFields_Oyhl4() {
    X000A_NTFS obj1 = new X000A_NTFS();
    X000A_NTFS obj2 = new X000A_NTFS();
    boolean result = obj1.equals(obj2);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromLocalFileData1_NYHv0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        byte[] data = new byte[20];
        data[0] = 0x78;
        data[1] = 0x5A;
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
        int offset = 0;
        int length = 20;
        try {
            x000A_NTFS.parseFromLocalFileData(data, offset, length);
        } catch (ZipException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreateJavaTime_xKGR0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date d = new Date();
        obj.setCreateJavaTime(d);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyJavaTime_KeYT0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date d = new Date();
        obj.setModifyJavaTime(d);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_AuzW0() {
        X000A_NTFS ntfs = new X000A_NTFS();
        String result = ntfs.toString();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testParseFromCentralDirectoryData_Adrb0() {
        X000A_NTFS obj = new X000A_NTFS();
        byte[] buffer = new byte[10];
        int offset = 0;
        int length = 10;
        try {
            obj.parseFromCentralDirectoryData(buffer, offset, length);
        } catch (ZipException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessJavaTime_AySq0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date result = x000A_NTFS.getAccessJavaTime();
        assert result != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessJavaTimeNull_SoDZ1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        Date result = x000A_NTFS.getAccessJavaTime();
        assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessTimeNull_CnXw0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        x000A_NTFS.setAccessTime(null);
        assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getAccessTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessTimeNotNull_VwTU1() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(ZipEightByteInteger.ZERO.getBytes());
        x000A_NTFS.setAccessTime(zipEightByteInteger);
        assertEquals(zipEightByteInteger, x000A_NTFS.getAccessTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateTime_avZe0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        ZipEightByteInteger result = x000A_NTFS.getCreateTime();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateJavaTime_UlGI0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date result = obj.getCreateJavaTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyTimeNull_AnIF0() {
        X000A_NTFS x000A_NTFS = new X000A_NTFS();
        x000A_NTFS.setModifyTime(null);
        assertEquals(ZipEightByteInteger.ZERO, x000A_NTFS.getModifyTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyJavaTime_bNat0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date result = obj.getModifyJavaTime();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccessJavaTime_JcXv0() {
        X000A_NTFS obj = new X000A_NTFS();
        Date d = new Date();
        obj.setAccessJavaTime(d);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetModifyFileTime_Zhdu0_BOPO0() {
    X000A_NTFS obj = new X000A_NTFS();
    java.sql.Timestamp expected = new java.sql.Timestamp(new java.util.Date(1640995200000L).getTime());
    java.sql.Timestamp actual = new java.sql.Timestamp(obj.getModifyFileTime().toMillis());
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringModify_wJhb1_hHJd0() {
    X000A_NTFS ntfs = new X000A_NTFS();
    ntfs.setAccessJavaTime(new Date());
    String result = ntfs.toString();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetCreateFileTime_reLI0_iwZX0() {
    X000A_NTFS obj = new X000A_NTFS();
    java.sql.Timestamp timestamp = new java.sql.Timestamp(new java.util.Date(1640995200000L).getTime());
    obj.setAccessJavaTime(timestamp);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetAccessTime_sviS0_JAhP0() {
    X000A_NTFS x000A_NTFS = new X000A_NTFS();
    ZipEightByteInteger expected = new ZipEightByteInteger(0L);
    ZipEightByteInteger actual = x000A_NTFS.getAccessTime();
    assertEquals(expected, actual);
}
}