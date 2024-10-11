/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import jakarta.faces.model.SelectItem;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimePattern_dRdA0() {
    EventLogger eventLogger = new EventLogger();
    String completionTimePattern = eventLogger.getCompletionTimePattern();
    assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", completionTimePattern);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_rovZ0() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertNotNull(voyageNumber);
    assertEquals("1234567890", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithEmptyString_ripQ2() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertEquals("", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumberWithValidString_tPkb4() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertEquals("1234567890", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_Type3_tgoY2() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertEquals(HandlingEvent.Type.LOAD, eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_Type4_QSbt3() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertEquals(HandlingEvent.Type.UNLOAD, eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_Type5_eplv4() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertEquals(HandlingEvent.Type.CLAIM, eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_Type6_NgBX5() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertEquals(HandlingEvent.Type.CUSTOMS, eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_KWwk0() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = eventLogger.getCompletionTime();
    assertNotNull(completionTime);
    assertEquals(LocalDateTime.now(), completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    assertNotNull(voyages);
    assertEquals(0, voyages.size());
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    assertEquals(1, voyages.size());
    assertEquals("Voyage 1", voyages.get(0).getLabel());
    assertEquals("Voyage 1", voyages.get(0).getValue());
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    assertEquals(2, voyages.size());
    assertEquals("Voyage 2", voyages.get(1).getLabel());
    assertEquals("Voyage 2", voyages.get(1).getValue());
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    assertEquals(3, voyages.size());
    assertEquals("Voyage 3", voyages.get(2).getLabel());
    assertEquals("Voyage 3", voyages.get(2).getValue());
    voyages.add(null);
    assertEquals(4, voyages.size());
    assertNull(voyages.get(3));
    voyages.add(new SelectItem("", ""));
    assertEquals(5, voyages.size());
    assertEquals("", voyages.get(4).getLabel());
    assertEquals("", voyages.get(4).getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeValue_Null_mchK0() {
    EventLogger eventLogger = new EventLogger();
    String completionTimeValue = eventLogger.getCompletionTimeValue();
    assertNull(completionTimeValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeValue_NullCompletionTime_hoZZ4() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setCompletionTime(null);
    String completionTimeValue = eventLogger.getCompletionTimeValue();
    assertNull(completionTimeValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_lowW0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
    assertEquals(0, eventLogger.getTrackingIds().size());
    assertEquals(0, eventLogger.getLocations().size());
    assertEquals(0, eventLogger.getVoyages().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_rovZ0_1() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertNotNull(voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_KWwk0_1() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = eventLogger.getCompletionTime();
    assertNotNull(completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_KWwk0_2() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = eventLogger.getCompletionTime();
    assertEquals(LocalDateTime.now(), completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_1() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertNotNull(voyages);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_2() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals(0, voyages.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_3() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals(1, voyages.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_4() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("Voyage 1", voyages.get(0).getLabel());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_5() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("Voyage 1", voyages.get(0).getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_6() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals(2, voyages.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_7() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("Voyage 2", voyages.get(1).getLabel());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_8() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("Voyage 2", voyages.get(1).getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_9() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals(3, voyages.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_10() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("Voyage 3", voyages.get(2).getLabel());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_11() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("Voyage 3", voyages.get(2).getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_12() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals(4, voyages.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_13() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertNull(voyages.get(3));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_14() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals(5, voyages.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_15() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("", voyages.get(4).getLabel());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyages_pVtp0_16() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> voyages = eventLogger.getVoyages();
    SelectItem selectItem = new SelectItem("Voyage 1", "Voyage 1");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 2", "Voyage 2");
    voyages.add(selectItem);
    selectItem = new SelectItem("Voyage 3", "Voyage 3");
    voyages.add(selectItem);
    voyages.add(null);
    voyages.add(new SelectItem("", ""));
    assertEquals("", voyages.get(4).getValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_lowW0_1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
    assertEquals(0, eventLogger.getTrackingIds().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_lowW0_2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
    assertEquals(0, eventLogger.getLocations().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_lowW0_3() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
    assertEquals(0, eventLogger.getVoyages().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_Type11_vtoz10_NdsT0() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertEquals(HandlingEvent.Type.RECEIVE, eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeValue_CorrectFormat_yOQH2_jQeC0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setCompletionTime(LocalDateTime.now());
    String completionTimeValue = eventLogger.getCompletionTimeValue();
    assertTrue(completionTimeValue.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithValidInputType_svTF12_ELKt1_1() {
    EventLogger eventLogger = new EventLogger();
    String trackingId = eventLogger.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithValidInputType_svTF12_ELKt1_2() {
    EventLogger eventLogger = new EventLogger();
    String trackingId = eventLogger.getTrackingId();
    assertEquals("valid input type", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_GDSx1_ssFL0() {
    String location = "";
    assertEquals("Location should be empty", "", location);
  }
}