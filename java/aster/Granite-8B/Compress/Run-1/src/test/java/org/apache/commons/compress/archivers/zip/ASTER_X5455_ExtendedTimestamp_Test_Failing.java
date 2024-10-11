/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.file.attribute.FileTime;
import java.util.Arrays;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X5455_ExtendedTimestamp_Test_Failing {
	{
	    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_wmaO0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        String result = x5455_ExtendedTimestamp.toString();
        assertEquals("0x5455 Zip Extra Field: Flags= ", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetAccessJavaTime_AAEC0() {
    X5455_ExtendedTimestamp x5455ExtendedTimestamp = new X5455_ExtendedTimestamp();
    ZipLong unixTime = new ZipLong(123456789);
    Date expected = new Date(123456789 * 1000L);
    Date actual = x5455ExtendedTimestamp.getAccessJavaTime();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateTime_oFWa0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = x5455_ExtendedTimestamp.getCreateTime();
        assertNotNull(zipLong);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateJavaTime_Kija0() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong mockTime = new ZipLong(1234567890L);
        Date expectedDate = new Date(1234567890L * 1000L);
        Date actualDate = extendedTimestamp.getCreateJavaTime();
        assertEquals(expectedDate, actualDate);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getModifyJavaTime_EubT0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date modifyJavaTime = x5455_ExtendedTimestamp.getModifyJavaTime();
        assertNotNull(modifyJavaTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_FbJW0() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong accessTime = extendedTimestamp.getAccessTime();
        assertEquals(0, accessTime.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_gwLO1() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong accessTime = extendedTimestamp.getAccessTime();
        assertEquals(0, accessTime.getIntValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_JZbD2() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong accessTime = extendedTimestamp.getAccessTime();
        assertEquals(0, accessTime.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_XLMI3() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong accessTime = extendedTimestamp.getAccessTime();
        assertEquals(0, accessTime.getBytes().length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_uoYl4() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong accessTime = extendedTimestamp.getAccessTime();
        assertEquals(0, accessTime.getBytes(0).length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_LEIh5() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong accessTime = extendedTimestamp.getAccessTime();
        assertEquals(0, accessTime.getValue(new byte[0], 0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessTime_KHWp6() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong accessTime = extendedTimestamp.getAccessTime();
        assertEquals(0, accessTime.getValue(new byte[0]));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBit0_modifyTimePresent_HxPb0() {
    X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
    boolean result = x5455_ExtendedTimestamp.isBit0_modifyTimePresent();
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong_Dghc0() {
        byte[] buf = new byte[8];
        ZipLong zipLong = new ZipLong(1234567890L);
        zipLong.putLong(buf, 0);
        assert Arrays.equals(buf, new byte[]{(byte) 0x30, (byte) 0x39, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00});
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_zuor2() {
        ZipLong zipLong = new ZipLong(1234567890L);
        assert zipLong.toString().equals("1234567890");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes_xiTq4() {
        ZipLong zipLong = new ZipLong(1234567890L);
        assert Arrays.equals(zipLong.getBytes(), new byte[]{(byte) 0x30, (byte) 0x39, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00});
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBytes2_fNwt7() {
        ZipLong zipLong = new ZipLong(1234567890L);
        assert Arrays.equals(ZipLong.getBytes(1234567890L), new byte[]{(byte) 0x30, (byte) 0x39, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00});
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPutLong2_dNgz8() {
        byte[] buf = new byte[8];
        ZipLong.putLong(1234567890L, buf, 0);
        assert Arrays.equals(buf, new byte[]{(byte) 0x30, (byte) 0x39, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00});
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetModifyTime_Amno0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong modifyTime = x5455_ExtendedTimestamp.getModifyTime();
        assertNotNull(modifyTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getAccessFileTime_fKrI0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        FileTime fileTime = x5455_ExtendedTimestamp.getAccessFileTime();
        assertNotNull(fileTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateJavaTime_Kija0_fid1() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong mockTime = new ZipLong(1234567890L);
        Date expectedDate = new Date(1234567890L * 1000L);
        Date actualDate = extendedTimestamp.getCreateJavaTime();
    assertNull(expectedDate);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLength_PzmF0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipShort zipShort = x5455_ExtendedTimestamp.getCentralDirectoryLength();
        assertEquals(5, zipShort.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLocalFileDataData_dxRk0_2() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        byte[] data = x5455_ExtendedTimestamp.getLocalFileDataData();
        assertEquals(4, data.length);}
}