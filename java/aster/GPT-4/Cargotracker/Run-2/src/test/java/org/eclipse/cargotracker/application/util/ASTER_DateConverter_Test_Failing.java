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
  public void testToDateTimeValidFormat_RnbY0_Kvkc0() {
    String input = "2023-03-15T14:30:00";
    LocalDateTime expected = LocalDateTime.of(2023, 3, 15, 14, 30, 0);
    LocalDateTime result = DateConverter.toDateTime(input);
    assertEquals(expected.toString(), result.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDateValidFormat_tVYR0_fid1() {
    String inputDate = "2023-03-15";
    LocalDate expected = LocalDate.of(2023, 3, 15);
    LocalDate actual = DateConverter.toDate(inputDate);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithValidDateTime_QImv0_fid1() {
    LocalDateTime dateTime = LocalDateTime.of(2023, 3, 15, 12, 0);
    String expected = "2023-03-15T12:00";
    String result = DateConverter.toString(dateTime);
    assertEquals(expected, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithValidDate_LUPF0_fid1() {
    LocalDate date = LocalDate.of(2023, 3, 15);
    String expected = "2023-03-15";
    String result = DateConverter.toString(date);
    assertEquals(expected, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDateTimeValidFormat_RnbY0_Kvkc0_fid1() {
    String input = "2023-03-15T14:30:00";
    LocalDateTime expected = LocalDateTime.of(2023, 3, 15, 14, 30, 0);
    LocalDateTime result = DateConverter.toDateTime(input);
    assertEquals(expected, result);
  }
}