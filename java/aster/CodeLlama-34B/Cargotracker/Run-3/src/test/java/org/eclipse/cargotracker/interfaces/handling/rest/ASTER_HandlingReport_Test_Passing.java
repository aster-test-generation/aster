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
  public void testSetCompletionTime_ValidValue_lyVJ0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertEquals(value, handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_NullValue_cdEE1() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = null;
    handlingReport.setCompletionTime(value);
    assertNull(handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_EmptyValue_TAnW2() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "";
    handlingReport.setCompletionTime(value);
    assertEquals(value, handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_InvalidValue_fjuS3() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertNotEquals(value, handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_DifferentValue_MZQC4() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertNotEquals("2023-02-27T10:15:31", handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_SameValue_osox5() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertEquals(value, handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_DifferentFormat_CiCX6() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertNotEquals("2023-02-27 10:15:30", handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_SameFormat_Ilab7() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertEquals(value, handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_DifferentTimeZone_meqd8() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertNotEquals("2023-02-27T10:15:30+01:00", handlingReport.getCompletionTime());
  }

  public void testSetCompletionTime_SameTimeZone_QvJC9() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String value = "2023-02-27T10:15:30";
    handlingReport.setCompletionTime(value);
    assertEquals(value, handlingReport.getCompletionTime());
  }
  private HandlingReport handlingReport;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnLocode_QuqE0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String unLocode = handlingReport.getUnLocode();
    assertNotNull(unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_rHYM0() throws Exception {
    handlingReport = new HandlingReport();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocode_XZIe1() throws Exception {
    handlingReport.setUnLocode("ABC");
    assertEquals("ABC", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeNull_UCrt2() throws Exception {
    handlingReport.setUnLocode(null);
    assertNull(handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeEmpty_HoaX3() throws Exception {
    handlingReport.setUnLocode("");
    assertEquals("", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeInvalid_mlfW4() throws Exception {
    handlingReport.setUnLocode("123");
    assertEquals("123", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeValid_edZl5() throws Exception {
    handlingReport.setUnLocode("ABC123");
    assertEquals("ABC123", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeLowercase_EAYn7() throws Exception {
    handlingReport.setUnLocode("abc");
    assertEquals("abc", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeMixedcase_Kqjw8() throws Exception {
    handlingReport.setUnLocode("AbC");
    assertEquals("AbC", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeSpecialCharacters_dpNF9() throws Exception {
    handlingReport.setUnLocode("ABC-123");
    assertEquals("ABC-123", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeMultipleSpecialCharacters_qtLO10() throws Exception {
    handlingReport.setUnLocode("ABC-123-XYZ");
    assertEquals("ABC-123-XYZ", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeLong_bSPg11() throws Exception {
    handlingReport.setUnLocode("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeVeryLong_mohW12() throws Exception {
    handlingReport.setUnLocode("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventType_uclf1() throws Exception {
    handlingReport.setEventType("test");
    assertEquals("test", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeNull_LCQq2() throws Exception {
    handlingReport.setEventType(null);
    assertNull(handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeEmpty_vnwS3() throws Exception {
    handlingReport.setEventType("");
    assertEquals("", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeInvalid_kGjn5() throws Exception {
    handlingReport.setEventType("invalid");
    assertEquals("invalid", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeValid_DAXR6() throws Exception {
    handlingReport.setEventType("valid");
    assertEquals("valid", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeUppercase_FlBy7() throws Exception {
    handlingReport.setEventType("TEST");
    assertEquals("TEST", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeMixedcase_DgAA9() throws Exception {
    handlingReport.setEventType("TeSt");
    assertEquals("TeSt", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeLong_auMf10() throws Exception {
    handlingReport.setEventType("This is a very long event type");
    assertEquals("This is a very long event type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeShort_UEqM11() throws Exception {
    handlingReport.setEventType("short");
    assertEquals("short", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeWithSpecialCharacters_PvVh12() throws Exception {
    handlingReport.setEventType("!@#$%^&*()_+");
    assertEquals("!@#$%^&*()_+", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeWithNumbers_VepT13() throws Exception {
    handlingReport.setEventType("1234567890");
    assertEquals("1234567890", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeWithNumbersAndSpecialCharacters_UCSZ18() throws Exception {
    handlingReport.setEventType("1234567890!@#$%^&*()_+");
    assertEquals("1234567890!@#$%^&*()_+", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_ApHH0_1() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertNotNull(voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_ApHH0_2() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertEquals("Voyage number should be a non-empty string", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_mcZY0_1() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_mcZY0_2() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertEquals("", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNonEmptyString_CdIl1_2() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertEquals("1234567890", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNull_fYkW2() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_CyHQ0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("12345");
    assertEquals("12345", handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberNull_byXM1() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber(null);
    assertNull(handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberEmpty_cNHB2() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("");
    assertEquals("", handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_farn1() throws Exception {
    String eventType = handlingReport.getEventType();
    assertEquals("EventType", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithNull_CGWt2() throws Exception {
    String eventType = handlingReport.getEventType();
    assertNull(eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithEmptyString_FPsP3() throws Exception {
    String eventType = handlingReport.getEventType();
    assertEquals("", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithInvalidString_jdyV5() throws Exception {
    String eventType = handlingReport.getEventType();
    assertNotEquals("InvalidEventType", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithDifferentCase_JhJo7() throws Exception {
    String eventType = handlingReport.getEventType();
    assertEquals("eventtype", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithSpecialCharacters_irWa9() throws Exception {
    String eventType = handlingReport.getEventType();
    assertEquals("EventType!@#$%^&*()_+", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_XuMJ0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("1234567890");
    assertEquals("1234567890", handlingReport.getTrackingId());
  }
}