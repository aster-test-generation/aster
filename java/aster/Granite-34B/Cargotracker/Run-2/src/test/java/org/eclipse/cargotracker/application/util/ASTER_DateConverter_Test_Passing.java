/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DateConverter_Test_Passing {
  private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
  private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_kVye0_fid2() {
    LocalDateTime dateTime = LocalDateTime.of(2022, 1, 1, 12, 0, 0);
    String expected = "1/1/2022 12:0 PM";
    String actual = DateConverter.toString(dateTime);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithDifferentDateTime_pTpu1_fid2() {
    LocalDateTime dateTime = LocalDateTime.of(2022, 1, 2, 13, 1, 1);
    String expected = "1/2/2022 1:1 PM";
    String actual = DateConverter.toString(dateTime);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithMaxDateTime_zSyu2_fid2() {
    LocalDateTime dateTime = LocalDateTime.of(9999, 12, 31, 23, 59, 59);
    String expected = "12/31/9999 11:59 PM";
    String actual = DateConverter.toString(dateTime);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithMinDateTime_Aszi3_fid2() {
    LocalDateTime dateTime = LocalDateTime.of(0, 1, 1, 0, 0, 0);
    String expected = "1/1/0001 12:0 AM";
    String actual = DateConverter.toString(dateTime);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_ljZP0_fid2() {
    LocalDate date = LocalDate.of(2023, 1, 1);
    String expected = "1/1/2023";
    String actual = DateConverter.toString(date);
    assertEquals(expected, actual);
  }
}