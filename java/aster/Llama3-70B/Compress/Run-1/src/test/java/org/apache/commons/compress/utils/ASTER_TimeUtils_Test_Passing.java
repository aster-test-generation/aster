/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.file.attribute.FileTimes;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TimeUtils_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToUnixTimeNotNull_UiSa0() {
    FileTime fileTime = FileTime.from(10, TimeUnit.SECONDS);
    long unixTime = TimeUtils.toUnixTime(fileTime);
    assertEquals(10, unixTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToUnixTimeNull_NjAV1() {
    long unixTime = TimeUtils.toUnixTime(null);
    assertEquals(0, unixTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsUnixTime_REgn0() {
    FileTime time = FileTime.fromMillis(1643723400000L);
    assertTrue(TimeUtils.isUnixTime(time));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsUnixTime_MinValue_Huil0() {
    assertTrue(TimeUtils.isUnixTime(Integer.MIN_VALUE));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsUnixTime_MaxValue_qeHZ1() {
    assertTrue(TimeUtils.isUnixTime(Integer.MAX_VALUE));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsUnixTime_OutOfRange_zYBZ2() {
    assertFalse(TimeUtils.isUnixTime(Integer.MAX_VALUE + 1L));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToFileTime_Fnwu0() {
    Date date = new Date();
    FileTime fileTime = TimeUtils.toFileTime(date);
    assertNotNull(fileTime);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToFileTime_BiRF0() {
    long ntfsTime = 131231231231L;
    FileTime expected = FileTimes.ntfsTimeToFileTime(ntfsTime);
    FileTime actual = TimeUtils.ntfsTimeToFileTime(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToDate_XKKl0() {
    FileTime fileTime = FileTime.fromMillis(1643723400000L);
    Date date = TimeUtils.toDate(fileTime);
    assertEquals(1643723400000L, date.getTime());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUnixTimeToFileTime_NFns0_wbIc0() {
    long time = 1643723400L;
    java.nio.file.attribute.FileTime fileTime = TimeUtils.unixTimeToFileTime(time);
    assertEquals(time, fileTime.toMillis() / 1000);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_nkKo0_fid2() {
    Date date = new Date(1643723400000L); // January 25, 2022 14:30:00
    long expected =132881970000000000L;
    long actual = TimeUtils.toNtfsTime(date);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncateToHundredNanos_KVNf0_fid2() {
    FileTime fileTime = FileTime.from(Instant.parse("2022-01-01T12:00:00.123456789Z"));
    FileTime result = TimeUtils.truncateToHundredNanos(fileTime);
    assertEquals(FileTime.from(Instant.parse("2022-01-01T12:00:00.123456700Z")), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_HvMl0_fid2() {
    FileTime fileTime = FileTime.fromMillis(1643723400000L);
    long result = TimeUtils.toNtfsTime(fileTime);
}
}