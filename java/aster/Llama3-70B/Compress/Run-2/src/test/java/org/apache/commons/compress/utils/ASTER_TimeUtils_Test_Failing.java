/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TimeUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_cLxq0_fid1() {
    Date date = new Date(1643723400000L);
    long expected = 132093120000000000L;
    long actual = TimeUtils.toNtfsTime(date);
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testTruncateToHundredNanos_jzqi0_fid1() {
    FileTime fileTime = FileTime.from(Instant.ofEpochSecond(10, 123456789));
    FileTime result = TimeUtils.truncateToHundredNanos(fileTime);
    assertEquals(FileTime.from(Instant.ofEpochSecond(10, 123400000)), result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToNtfsTime_TqNr0_fid1() {
    FileTime fileTime = FileTime.fromMillis(1643723400000L);
    long result = TimeUtils.toNtfsTime(fileTime);
    assertEquals(132092332000000000L, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNtfsTimeToDate_WnZu0_fid1() {
    long ntfsTime = 131355072000000000L;
    Date expected = new GregorianCalendar(2021, Calendar.JANUARY, 1, 12, 0, 0).getTime();
    Date result = TimeUtils.ntfsTimeToDate(ntfsTime);
    assertEquals(expected, result);
}
}