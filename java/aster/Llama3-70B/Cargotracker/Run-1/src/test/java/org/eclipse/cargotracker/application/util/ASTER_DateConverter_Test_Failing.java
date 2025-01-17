/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DateConverter_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDate_KgDp0() {
    String date = "2022-01-01";
    String formattedDate = DateConverter.toString(LocalDate.of(2022, 1, 1));
    assertEquals(date, formattedDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_toDateTime_Vsuw0() {
    String datetime = "2022-01-01";
    LocalDate expected = LocalDate.of(2022, 1, 1);
    assertEquals(expected.toString(), DateConverter.toString(LocalDate.parse(datetime)));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDate_KgDp0_fid2() {
    String date = "2022-01-01";
    LocalDate localDate = DateConverter.toDate(date);
    assertEquals(LocalDate.of(2022, 1, 1), localDate);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_MNRX0_fid2() {
    LocalDateTime dateTime = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    String result = DateConverter.toString(dateTime);
    assertEquals("2022-01-01T10:00:00", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_toDateTime_Vsuw0_fid2() {
    String datetime = "2022-01-01T12:00:00";
    LocalDateTime expected = LocalDateTime.of(2022, 1, 1, 12, 0, 0);
    assertEquals(expected, DateConverter.toDateTime(datetime));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_pNCq0_fid2() {
    LocalDate date = LocalDate.of(2022, 1, 1);
    String result = DateConverter.toString(date);
    assertEquals("2022-01-01", result);
  }
}