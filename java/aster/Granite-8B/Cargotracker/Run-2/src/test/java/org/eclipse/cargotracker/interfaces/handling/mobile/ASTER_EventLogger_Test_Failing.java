/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import jakarta.faces.model.SelectItem;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetCompletionTimePattern_vvam0() {
    EventLogger eventLogger = new EventLogger();
    String expected = "yyyy-MM-dd HH:mm:ss";
    String actual = eventLogger.getCompletionTimePattern();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_tOAg0() {
    EventLogger eventLogger = new EventLogger();
    String trackingId = eventLogger.getTrackingId();
    Assertions.assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_bIrA0() {
    EventLogger eventLogger = new EventLogger();
    String location = eventLogger.getLocation();
    Assertions.assertNotNull(location);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_UXDL0() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> locations = eventLogger.getLocations();
    assertNotNull(locations);
    assertTrue(locations.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetEventType_qcex0() {
    EventLogger eventLogger = new EventLogger();
    HandlingEvent.Type eventType = eventLogger.getEventType();
    assertNotNull(eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_tnTh0() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = eventLogger.getCompletionTime();
    assertNotNull(completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIds_Fjmc0() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> trackingIds = eventLogger.getTrackingIds();
    assertNotNull(trackingIds);
    assertTrue(trackingIds.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyages_SERt0() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> actualVoyages = eventLogger.getVoyages();
    assertNotNull(actualVoyages);
    assertTrue(actualVoyages.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetCompletionTimeValue_ElrD0() {
    EventLogger eventLogger = new EventLogger();
    String completionTimeValue = eventLogger.getCompletionTimeValue();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_vSdH0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_UXDL0_1() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> locations = eventLogger.getLocations();
    assertNotNull(locations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocations_UXDL0_2() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> locations = eventLogger.getLocations();
    assertTrue(locations.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIds_Fjmc0_1() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> trackingIds = eventLogger.getTrackingIds();
    assertNotNull(trackingIds);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIds_Fjmc0_2() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> trackingIds = eventLogger.getTrackingIds();
    assertTrue(trackingIds.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyages_SERt0_1() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> actualVoyages = eventLogger.getVoyages();
    assertNotNull(actualVoyages);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyages_SERt0_2() {
    EventLogger eventLogger = new EventLogger();
    List<SelectItem> actualVoyages = eventLogger.getVoyages();
    assertTrue(actualVoyages.size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_vSdH0_fid1() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
    // Add assertion here
    // For example:
    // assertEquals(expectedValue, eventLogger.someMethod());
}
}