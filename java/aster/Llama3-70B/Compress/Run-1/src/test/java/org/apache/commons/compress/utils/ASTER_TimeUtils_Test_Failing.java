/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TimeUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_nkKo0() {
    Date date = new Date(1643723400000L); // January 25, 2022 14:30:00
    long expected = 132096945400000000L;
    long actual = TimeUtils.toNtfsTime(date);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncateToHundredNanos_KVNf0() {
    FileTime fileTime = FileTime.from(Instant.parse("2022-01-01T12:00:00.123456789Z"));
    FileTime result = TimeUtils.truncateToHundredNanos(fileTime);
    assertEquals(FileTime.from(Instant.parse("2022-01-01T12:00:00.123000000Z")), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_HvMl0() {
    FileTime fileTime = FileTime.fromMillis(1643723400000L);
    long result = TimeUtils.toNtfsTime(fileTime);
    assertEquals(132092332000000000L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToDate_KoLZ0() {
    long ntfsTime = 1323232323;
    Date expected = new Date(11644473600000L + ntfsTime * 10000);
    Date actual = TimeUtils.ntfsTimeToDate(ntfsTime);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToDate_KoLZ0_fid2() {
    long ntfsTime = 1323232323;
    Date expected = new Date(11644473600000L + ntfsTime * 10000);
    Date actual = TimeUtils.ntfsTimeToDate(ntfsTime);
    assertTrue(expected.getTime() == actual.getTime());
}
}