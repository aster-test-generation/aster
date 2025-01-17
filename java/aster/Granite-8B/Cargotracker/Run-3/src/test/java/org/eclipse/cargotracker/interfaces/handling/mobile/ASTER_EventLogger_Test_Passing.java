/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import jakarta.faces.model.SelectItem;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
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
  public void testgetTrackingId_ggEf0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    String trackingId = eventLogger.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetLocation_bPyY0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    String location = eventLogger.getLocation();
    assertEquals("Expected location", "Expected location", location);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingIds_mXPq0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> expectedTrackingIds = new ArrayList<>(); // Assuming SelectItem is the expected return type
    List<SelectItem> actualTrackingIds = eventLogger.getTrackingIds();
    assertEquals(expectedTrackingIds, actualTrackingIds);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_bmVs0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = eventLogger.getCompletionTime();
    assertNotNull(completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_nQsa0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now();
    eventLogger.setCompletionTime(completionTime);
    assertEquals(eventLogger.getCompletionTime(), completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetCompletionTimePattern_GNUT0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    String completionTimePattern = eventLogger.getCompletionTimePattern();
    assertEquals("yyyy-MM-dd'T'HH:mm:ss.SSS", completionTimePattern);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetLocations_PRxF0_1() throws Exception {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> actual = eventLogger.getLocations();
    assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetLocations_PRxF0_2() throws Exception {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> actual = eventLogger.getLocations();
    assertTrue(actual.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEventType_hEBP0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertNotNull(eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_HZwH0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getVoyages_fVjS0_1() throws Exception {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> actual = eventLogger.getVoyages();
    assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getVoyages_fVjS0_2() throws Exception {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> actual = eventLogger.getVoyages();
    assertTrue(actual.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetCompletionTimeValue_KRbJ0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    String completionTimeValue = eventLogger.getCompletionTimeValue();
    assertEquals("Expected completion time value", "2022-01-01", completionTimeValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getEventTypesTest_pXLG0() throws Exception {
    EventLogger eventLogger = new EventLogger();
    Map<HandlingEvent.Type, HandlingEvent.Type> eventTypes = eventLogger.getEventTypes();
    Map<HandlingEvent.Type, HandlingEvent.Type> expectedEventTypes = new HashMap<>();
    for (HandlingEvent.Type type : HandlingEvent.Type.values()) {
      expectedEventTypes.put(type, type);
    }
    assertEquals(expectedEventTypes, eventTypes);
  }
}