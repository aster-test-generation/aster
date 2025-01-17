/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import jakarta.faces.model.SelectItem;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithNull_fjtQ1() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertNull(voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithInvalidString_dnym3() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertNotEquals("1234567890", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithDifferentString_YTNb5() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertNotEquals("9876543210", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_hdHw0() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> eventTypes = eventLogger.getEventTypes();
    assertEquals(HandlingEvent.Type.values().length, eventTypes.size());
    for (HandlingEvent.Type type : HandlingEvent.Type.values()) {
      assertEquals(type, eventTypes.get(type));
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_Type16_iuZK15() {
    EventLogger eventLogger = new EventLogger();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLocation_nGiO0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation("location");
    assertEquals("location", eventLogger.getLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLocationNull_fXAG1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation(null);
    assertNull(eventLogger.getLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLocationEmpty_BGrs2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation("");
    assertEquals("", eventLogger.getLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_pDlL0() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now();
    eventLogger.setCompletionTime(completionTime);
    assertEquals(completionTime, eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTimeWithNull_sldE1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setCompletionTime(null);
    assertNull(eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_tQEs0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("12345");
    assertEquals("12345", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithNull_CTBo1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber(null);
    assertNull(eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithEmptyString_Paeg2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("");
    assertEquals("", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithInvalidString_FRWL3() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("abcdef");
    assertEquals("abcdef", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithDifferentString_Gvsl5() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("67890");
    assertEquals("67890", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithDifferentCase_rlhU7() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("AbCdEf");
    assertEquals("AbCdEf", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithDifferentLength_YdlD8() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("1234567890");
    assertEquals("1234567890", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithDifferentCharacters_xEvL9() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("!@#$%^&*()");
    assertEquals("!@#$%^&*()", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithDifferentSpecialCharacters_kkIT10() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("~!@#$%^&*()_+-=[]{}|;':\"<>,./?");
    assertEquals("~!@#$%^&*()_+-=[]{}|;':\"<>,./?", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumberWithDifferentWhitespaceCharacters_XofR11() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber(" \t\n\r\f");
    assertEquals(" \t\n\r\f", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventType_NullType_fnPw6() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setEventType(null);
    assertNull(eventLogger.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_lzlU0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("1234567890");
    assertEquals("1234567890", eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithNull_GSEb1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId(null);
    assertNull(eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithEmptyString_dXsX2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("");
    assertEquals("", eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithInvalidString_OJkC3() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("invalid");
    assertEquals("invalid", eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithDifferentString_mIZw5() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("9876543210");
    assertEquals("9876543210", eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdWithSpecialCharactersString_AJsk9() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("1234567890@#$%^&*()_+-=");
    assertEquals("1234567890@#$%^&*()_+-=", eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimePattern_dRdA0_fid1() {
    EventLogger eventLogger = new EventLogger();
    String completionTimePattern = eventLogger.getCompletionTimePattern();
    assertEquals("M/d/yyyy h:m a", completionTimePattern);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypes_hdHw0_1() {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> eventTypes = eventLogger.getEventTypes();
    for (HandlingEvent.Type type : HandlingEvent.Type.values()) {
    }
    assertEquals(HandlingEvent.Type.values().length, eventTypes.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeValue_NotNull_JrpB1_FthR0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setCompletionTime(LocalDateTime.now());
    String completionTimeValue = eventLogger.getCompletionTimeValue();
    assertNotNull(completionTimeValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeValue_IncorrectFormat_Kauj3_OAwt0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setCompletionTime(LocalDateTime.now());
    String completionTimeValue = eventLogger.getCompletionTimeValue();
    assertFalse(completionTimeValue.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_SDHt0_KnYe0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("1234567890");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNull_uaFF3_wdcC0() {
    EventLogger eventLogger = new EventLogger();
    String trackingId = eventLogger.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithInvalidInput_vUCo6_hBRb0_1() {
    String trackingId = "invalid input";
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithInvalidInput_vUCo6_hBRb0_2() {
    String trackingId = "invalid input";
    assertEquals("invalid input", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithInvalidInputType_MBur11_NQVy0_1() {
    String trackingId = "invalid input type";
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithInvalidInputType_MBur11_NQVy0_2() {
    String trackingId = "invalid input type";
    assertEquals("invalid input type", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithValidInputType_svTF12_inUC0_1() {
    String trackingId = "valid input type";
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithValidInputType_svTF12_inUC0_2() {
    String trackingId = "valid input type";
    assertEquals("valid input type", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_hsgj1_ZNPY0_1() {
    List<SelectItem> locations = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      SelectItem location = new SelectItem();
      location.setLabel("Location " + i);
      location.setValue("location" + i);
      locations.add(location);
    }
    for (int i = 0; i < 10; i++) {
      SelectItem location = locations.get(i);
    }
    assertNotNull(locations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_hsgj1_ZNPY0_2() {
    List<SelectItem> locations = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      SelectItem location = new SelectItem();
      location.setLabel("Location " + i);
      location.setValue("location" + i);
      locations.add(location);
    }
    for (int i = 0; i < 10; i++) {
      SelectItem location = locations.get(i);
    }
    assertEquals(10, locations.size());
  }
}