/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import org.apache.commons.compress.utils.TimeUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_X5455_ExtendedTimestamp_Test_Failing {
    private static ZipLong fileTimeToZipLong(final FileTime time)
    {
        return time == null ? null : unixTimeToZipLong(TimeUtils.toUnixTime(time));
    }
    private static ZipLong unixTimeToZipLong(final long unixTime)
    {
        if (!TimeUtils.isUnixTime(unixTime)) {
            throw new IllegalArgumentException("X5455 timestamps must fit in a signed 32 bit integer: " + unixTime);
        }
        return new ZipLong(unixTime);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyTime_ECmT0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = x5455_ExtendedTimestamp.getModifyTime();
        assertEquals(ZipLong.class, zipLong.getClass());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyTime_Bfac1() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = x5455_ExtendedTimestamp.getModifyTime();
        assertEquals(zipLong.getValue(), zipLong.getValue());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryData_mEdy0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        byte[] expected = new byte[10];
        byte[] actual = x5455_ExtendedTimestamp.getCentralDirectoryData();
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCentralDirectoryLength_bit0_modifyTimePresent_true_Uvuy0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        boolean bit0_modifyTimePresent = true;
        ZipShort result = x5455_ExtendedTimestamp.getCentralDirectoryLength();
        assertEquals(new ZipShort(5), result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateFileTime_KAMV0() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        FileTime expected = TimeUtils.unixTimeToFileTime(1234567890L);
        FileTime actual = extendedTimestamp.getCreateFileTime();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_ModifyTimePresent_VJja0() {
    X5455_ExtendedTimestamp obj = new X5455_ExtendedTimestamp();
    byte[] result = obj.getLocalFileDataData();
    Assertions.assertEquals(result[0], (byte) 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyFileTime_WADN0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        FileTime expected = TimeUtils.unixTimeToFileTime(1234567890L);
        FileTime actual = x5455_ExtendedTimestamp.getModifyFileTime();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessFileTime_uabU0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(1234567890L);
        FileTime expected = TimeUtils.unixTimeToFileTime(zipLong.getIntValue());
        FileTime actual = x5455_ExtendedTimestamp.getAccessFileTime();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyJavaTime_gnYA0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date modifyJavaTime = x5455_ExtendedTimestamp.getModifyJavaTime();
        assert modifyJavaTime != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyFileTime_NxHt0() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        FileTime time = FileTime.fromMillis(1643723400);
        x5455_ExtendedTimestamp.setModifyFileTime(time);
        assertEquals(time, x5455_ExtendedTimestamp.getModifyFileTime());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyFileTimeInvalidUnixTime_driY2() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        long unixTime = 2147483648L;
        try {
            x5455_ExtendedTimestamp.setModifyFileTime(FileTime.fromMillis(unixTime));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetModifyTimeValue_uDBn2() {
        X5455_ExtendedTimestamp x = new X5455_ExtendedTimestamp();
        ZipLong l = new ZipLong(new byte[8]);
        x.setModifyTime(l);
        assert x.getModifyTime().getValue() != 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsBit2_createTimePresent_sVaU0() {
        X5455_ExtendedTimestamp obj = new X5455_ExtendedTimestamp();
        boolean result = obj.isBit2_createTimePresent();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreateFileTime_KAMV0_fid1() {
        X5455_ExtendedTimestamp extendedTimestamp = new X5455_ExtendedTimestamp();
        FileTime expected = TimeUtils.unixTimeToFileTime(1234567890L);
        FileTime actual = extendedTimestamp.getCreateFileTime();
    assertNull(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_ModifyTimePresent_VJja1() {
    X5455_ExtendedTimestamp obj = new X5455_ExtendedTimestamp();
    byte[] result = obj.getLocalFileDataData();
    Assertions.assertEquals(result[1], (byte) 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetModifyFileTime_WADN0_fid1() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        FileTime expected = TimeUtils.unixTimeToFileTime(1234567890L);
        FileTime actual = x5455_ExtendedTimestamp.getModifyFileTime();
    assertNull(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessFileTime_uabU0_fid1() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(1234567890L);
        FileTime expected = TimeUtils.unixTimeToFileTime(zipLong.getIntValue());
        FileTime actual = x5455_ExtendedTimestamp.getAccessFileTime();
    assertNull(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode2_nihh1_IeQT0() {
    X5455_ExtendedTimestamp obj = new X5455_ExtendedTimestamp();
    obj.setAccessJavaTime(new java.sql.Timestamp(1234567890123L));
    int result = obj.hashCode();
    assertEquals(result, -123 * (0 & 0x07) ^ new java.sql.Timestamp(1234567890123L).hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode3_lJbu2_OgoY0() {
    X5455_ExtendedTimestamp obj = new X5455_ExtendedTimestamp();
    obj.setAccessJavaTime(new java.sql.Timestamp(2345678901234L));
    int result = obj.hashCode();
    assertEquals(result, -123 * (0 & 0x07) ^ new java.sql.Timestamp(1234567890123L).hashCode() ^ Integer.rotateLeft(new java.sql.Timestamp(2345678901234L).hashCode(), 11));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringAccessTimePresent_GBcM2_hJGf0() {
    X5455_ExtendedTimestamp x = new X5455_ExtendedTimestamp();
    x.setAccessJavaTime(new Date());
    String result = x.toString();
    assert result.equals("0x5455 Zip Extra Field: Flags=0 Access:[Thu Jan 01 00:00:00 UTC 1970] ");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringCreateTimePresent_meJF3_DuoP0() {
    X5455_ExtendedTimestamp x = new X5455_ExtendedTimestamp();
    x.setAccessJavaTime(new Date());
    String result = x.toString();
    assert result.equals("0x5455 Zip Extra Field: Flags=0 Create:[Thu Jan 01 00:00:00 UTC 1970] ");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLocalFileDataData_CreateTimePresent_PFmp4_cUkh0_fid2() {
    X5455_ExtendedTimestamp obj = new X5455_ExtendedTimestamp();
    obj.setAccessJavaTime(new Date()); 
    byte[] result = obj.getLocalFileDataData();
    Assertions.assertEquals(result[0], (byte) 3);
}
}