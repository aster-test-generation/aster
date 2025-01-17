/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReport_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocode_PpYo0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("ABC");
    assertEquals("ABC", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeWithNull_RiBT1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode(null);
    assertNull(handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeWithEmptyString_SCDM2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("");
    assertEquals("", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeWithInvalidValue_toGK3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("123");
    assertEquals("123", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventType_CSmK0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Test Event Type");
    assertEquals("Test Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeNull_FlPW1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType(null);
    assertNull(handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeEmpty_Vshw2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("");
    assertEquals("", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeInvalid_BRLP3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Invalid Event Type");
    assertEquals("Invalid Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeValid_xbBA4() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Valid Event Type");
    assertEquals("Valid Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeDuplicate_Figb5() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Duplicate Event Type");
    assertEquals("Duplicate Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeMaxLength_yeIx6() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Max Length Event Type");
    assertEquals("Max Length Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeMinLength_AwkB7() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Min Length Event Type");
    assertEquals("Min Length Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeInvalidLength_DYVj8() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Invalid Length Event Type");
    assertEquals("Invalid Length Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeInvalidCharacters_UHVv9() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Invalid Characters Event Type");
    assertEquals("Invalid Characters Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeValidCharacters_eUSo10() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Valid Characters Event Type");
    assertEquals("Valid Characters Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeInvalidFormat_DzPc11() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Invalid Format Event Type");
    assertEquals("Invalid Format Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeValidFormat_JScT12() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Valid Format Event Type");
    assertEquals("Valid Format Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeInvalidValue_oEPH13() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Invalid Value Event Type");
    assertEquals("Invalid Value Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeValidValue_lSOC14() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Valid Value Event Type");
    assertEquals("Valid Value Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeInvalidType_OoAP15() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Invalid Type Event Type");
    assertEquals("Invalid Type Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_jZIg0_2() {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNull_Juwr2() {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertNull(voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNull_dLkm1() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNonEmptyString_dhnD3() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNotEquals("", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithInvalidString_XkBB4() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNotEquals("invalid", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_yHMQ0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("12345");
    assertEquals("12345", handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithNull_aMoB1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber(null);
    assertNull(handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithEmptyString_zehc2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("");
    assertEquals("", handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeWithNull_jGdE1() {
    HandlingReport handlingReport = new HandlingReport();
    String completionTime = handlingReport.getCompletionTime();
    assertNull(completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeWithInvalidFormat_RwtH2() {
    HandlingReport handlingReport = new HandlingReport();
    String completionTime = handlingReport.getCompletionTime();
    assertNotEquals("2023-02-28T12:34:56.789Z", completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_UZTh0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01T12:00:00");
    assertEquals("2022-01-01T12:00:00", handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithNull_FymX1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime(null);
    assertNull(handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithEmptyString_STUH2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("");
    assertEquals("", handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithInvalidFormat_xvlx3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01 12:00:00");
    assertEquals("2022-01-01 12:00:00", handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithInvalidDate_xXTH4() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-02-30T12:00:00");
    assertEquals("2022-02-30T12:00:00", handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithInvalidTime_eeZr5() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01T24:00:00");
    assertEquals("2022-01-01T24:00:00", handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithInvalidTimeZone_xOhq6() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01T12:00:00+05:00");
    assertEquals("2022-01-01T12:00:00+05:00", handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithNull_HRWk1() {
    HandlingReport handlingReport = new HandlingReport();
    String eventType = handlingReport.getEventType();
    assertNull(eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_xrED0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("1234567890");
    assertEquals("1234567890", handlingReport.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithNull_tGdx1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId(null);
    assertNull(handlingReport.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithEmptyString_fNjm2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("");
    assertEquals("", handlingReport.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithInvalidString_BfcL3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("abcdefghij");
    assertEquals("abcdefghij", handlingReport.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithDifferentString_BkFU5() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("9876543210");
    assertEquals("9876543210", handlingReport.getTrackingId());
  }
}