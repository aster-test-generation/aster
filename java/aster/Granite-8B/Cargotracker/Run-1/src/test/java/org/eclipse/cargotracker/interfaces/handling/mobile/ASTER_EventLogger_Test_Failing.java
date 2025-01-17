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
  public void testgetCompletionTimePattern_rtNr0() {
    EventLogger eventLogger = new EventLogger();
    String expected = "yyyy-MM-dd HH:mm:ss";
    String actual = eventLogger.getCompletionTimePattern();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_ufDy0() {
    EventLogger eventLogger = new EventLogger();
    String trackingId = eventLogger.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_PQdJ0() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> locations = eventLogger.getLocations();
    assertNotNull(locations);
    assertTrue(locations.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetEventType_Cfui0() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertNotNull(eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_MqXN0() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = eventLogger.getCompletionTime();
    assertNotNull(completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIds_IVRu0() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> trackingIds = eventLogger.getTrackingIds();
    assertNotNull(trackingIds);
    assertTrue(trackingIds.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetCompletionTimeValue_jLSE0() {
    EventLogger eventLogger = new EventLogger();
    String completionTimeValue = eventLogger.getCompletionTimeValue();
    assertNotNull(completionTimeValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_PQdJ0_1() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> locations = eventLogger.getLocations();
    assertNotNull(locations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_PQdJ0_2() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> locations = eventLogger.getLocations();
    assertTrue(locations.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIds_IVRu0_1() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> trackingIds = eventLogger.getTrackingIds();
    assertNotNull(trackingIds);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIds_IVRu0_2() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> trackingIds = eventLogger.getTrackingIds();
    assertTrue(trackingIds.size() > 0);
  }
}