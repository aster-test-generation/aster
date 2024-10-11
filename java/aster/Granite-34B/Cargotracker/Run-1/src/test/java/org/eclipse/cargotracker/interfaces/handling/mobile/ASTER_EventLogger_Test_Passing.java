/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.application.util.DateConverter;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNullVoyageNumber_daDJ1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber(null);
    String actualVoyageNumber = eventLogger.getVoyageNumber();
    String expectedVoyageNumber = null;
    assertEquals(expectedVoyageNumber, actualVoyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_key_gYTv4() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> result = eventLogger.getEventTypes();
    assertEquals(result.get(HandlingEvent.Type.LOAD), HandlingEvent.Type.LOAD);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getCompletionTime_RfKH0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setCompletionTime(LocalDateTime.now());
    assertEquals(eventLogger.getCompletionTime(), eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getCompletionTime_withNoCompletionTimeSet_TAUM1() {
    EventLogger eventLogger = new EventLogger();
    assertEquals(null, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setLocation_WhenLocationIsNotEmpty_ThenLocationChanges_McDz1() {
    EventLogger eventLogger = new EventLogger();
    String location = "New York";
    eventLogger.setLocation(location);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_UoHD0() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now();
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithMaxDateTime_lwSL1() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.MAX;
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithMinDateTime_nfgd2() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.MIN;
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithNull_hUfH3() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = null;
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithRandomDateTime_dskP4() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.of(2023, 1, 1, 12, 0, 0);
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithFutureDateTime_ovBg5() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1);
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithPastDateTime_FSTx6() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now().minusDays(1);
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithTodayDateTime_xUtM7() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).withNano(0);
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithTomorrowDateTime_PQaD8() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_bJzr0() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = "AB123";
    eventLogger.setVoyageNumber(voyageNumber);
    assertEquals(voyageNumber, eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberNull_HwOS1() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = null;
    eventLogger.setVoyageNumber(voyageNumber);
    assertEquals(voyageNumber, eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberEmpty_BMSo2() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = "";
    eventLogger.setVoyageNumber(voyageNumber);
    assertEquals(voyageNumber, eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithSpecialCharacters_IoFy4() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = "AB!@#";
    eventLogger.setVoyageNumber(voyageNumber);
    assertEquals(voyageNumber, eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithNumbers_DMkI5() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = "12345";
    eventLogger.setVoyageNumber(voyageNumber);
    assertEquals(voyageNumber, eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithLengthMoreThan10_FXEp6() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = "AB1234567890";
    eventLogger.setVoyageNumber(voyageNumber);
    assertEquals(voyageNumber, eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_LOAD_Test_WTEt0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setEventType(HandlingEvent.Type.LOAD);
    assertEquals(HandlingEvent.Type.LOAD, eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_UNLOAD_Test_JOKR1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setEventType(HandlingEvent.Type.UNLOAD);
    assertEquals(HandlingEvent.Type.UNLOAD, eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_RECEIVE_Test_OZQa2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setEventType(HandlingEvent.Type.RECEIVE);
    assertEquals(HandlingEvent.Type.RECEIVE, eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_CLAIM_Test_qnQZ3() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setEventType(HandlingEvent.Type.CLAIM);
    assertEquals(HandlingEvent.Type.CLAIM, eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_CUSTOMS_Test_fFKX4() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setEventType(HandlingEvent.Type.CUSTOMS);
    assertEquals(HandlingEvent.Type.CUSTOMS, eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_Null_Test_zJex5() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setEventType(null);
    assertNull(eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_RandomType_Test_kGyX6() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type randomType = HandlingEvent.Type.values()[new Random().nextInt(HandlingEvent.Type.values().length)];
    eventLogger.setEventType(randomType);
    assertEquals(randomType, eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_AllTypes_Test_MyHX7() {
    EventLogger eventLogger = new EventLogger();
    for (HandlingEvent.Type type : HandlingEvent.Type.values()) {
      eventLogger.setEventType(type);
      assertEquals(type, eventLogger.getEventType());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setEventType_AllTypesRandomOrder_Test_cgrf8() {
    EventLogger eventLogger = new EventLogger();
    List<HandlingEvent.Type> types = Arrays.asList(HandlingEvent.Type.values());
    Collections.shuffle(types);
    for (HandlingEvent.Type type : types) {
      eventLogger.setEventType(type);
      assertEquals(type, eventLogger.getEventType());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_JUZP0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("12345");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithNull_kLky1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithEmpty_FVcJ2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_null_DZHQ1_fid1() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> result = eventLogger.getEventTypes();
    Map<HandlingEvent.Type, HandlingEvent.Type> expected = null;
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_size_izmO3_fid1() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> result = eventLogger.getEventTypes();
    assertEquals(result.size(), 5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getCompletionTimePattern_Heml0_tdxZ0() {
    EventLogger eventLogger = new EventLogger();
    String result = eventLogger.getCompletionTimePattern();
    String expected = DateConverter.DATE_TIME_FORMAT;
    assertEquals(expected, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_FGJx0_zlwP0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("New York");
    assertEquals("New York", eventLogger.getTrackingId());
  }
}