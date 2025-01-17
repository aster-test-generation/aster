/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.apache.commons.io.file.attribute.FileTimes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TimeUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToUnixTimeWithNonNullFileTime_wExD0() {
    FileTime fileTime = FileTime.from(Instant.now());
    long expected = fileTime.to(TimeUnit.SECONDS);
    long actual = TimeUtils.toUnixTime(fileTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToUnixTimeWithNullFileTime_EmXj1() {
    long actual = TimeUtils.toUnixTime(null);
    assertEquals(0, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsUnixTimeWithValidUnixTime_sRmq0() {
    FileTime time = FileTime.from(Instant.ofEpochSecond(1609459200)); // January 1, 2021
    assertTrue(TimeUtils.isUnixTime(time));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUnixTimeWithinRange_YAYg0() {
        assertTrue(TimeUtils.isUnixTime(0));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUnixTimeBelowMinimum_HNfX1() {
        assertFalse(TimeUtils.isUnixTime(Long.MIN_VALUE));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsUnixTimeAboveMaximum_sHRj2() {
        assertFalse(TimeUtils.isUnixTime(Long.MAX_VALUE));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTimeWithCurrentDate_rzqh0() {
    Date currentDate = new Date();
    long expected = FileTimes.toNtfsTime(currentDate);
    long actual = TimeUtils.toNtfsTime(currentDate);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToFileTimeWithCurrentDate_aArN0_1() {
    Date currentDate = new Date();
    FileTime result = TimeUtils.toFileTime(currentDate);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToFileTimeWithCurrentDate_aArN0_2() {
    Date currentDate = new Date();
    FileTime result = TimeUtils.toFileTime(currentDate);
    assertEquals(result.toMillis(), currentDate.getTime());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToFileTime_ijua0() {
    long testNtfsTime = 130102345600000000L; // Example NTFS time
    FileTime expected = FileTime.fromMillis((testNtfsTime - 116444736000000000L) / 10000);
    FileTime result = TimeUtils.ntfsTimeToFileTime(testNtfsTime);
    assertEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncateToHundredNanos_iaWS0() {
    FileTime originalFileTime = FileTime.from(Instant.ofEpochSecond(1000, 123456789));
    FileTime truncatedFileTime = TimeUtils.truncateToHundredNanos(originalFileTime);
    assertEquals(FileTime.from(Instant.ofEpochSecond(1000, 123456700)), truncatedFileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnixTimeToFileTime_cbRS0() {
    long unixTime = 1609459200; // Example Unix time (January 1, 2021)
    FileTime expected = FileTime.from(1609459200, TimeUnit.SECONDS);
    FileTime actual = TimeUtils.unixTimeToFileTime(unixTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToDateWithCurrentTime_jeEw0() {
    FileTime now = FileTime.fromMillis(System.currentTimeMillis());
    Date expected = new Date(now.toMillis());
    Date actual = TimeUtils.toDate(now);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_ChLx0() {
    long javaTime = 1580515200000L; // Represents a specific date and time
    long expectedNtfsTime =132249888000000000L; // Expected NTFS time for the given Java time
    long actualNtfsTime = TimeUtils.toNtfsTime(javaTime);
    assertEquals(expectedNtfsTime, actualNtfsTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_ZJDB0() {
    FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
    long expected = fileTime.toMillis() * 10000 + 116444736000000000L; // Convert to NTFS time
    long actual = TimeUtils.toNtfsTime(fileTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToDate_cQhP0() {
    long sampleNtfsTime = 132165846991234567L; // Example NTFS time
    Date expectedDate = new Date(sampleNtfsTime / 10000L - 11644473600000L); // Convert NTFS time to Java Date
    Date resultDate = TimeUtils.ntfsTimeToDate(sampleNtfsTime);
    assertEquals(expectedDate, resultDate);
}
}