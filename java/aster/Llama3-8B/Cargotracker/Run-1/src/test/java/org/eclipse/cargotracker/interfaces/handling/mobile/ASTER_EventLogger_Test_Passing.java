/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLocation_rmLA0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation("Test Location");
    assertEquals("Test Location", eventLogger.getLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_glMc0() {
    EventLogger eventLogger = new EventLogger();
    LocalDateTime completionTime = LocalDateTime.now();
    eventLogger.setCompletionTime(completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_tklq0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setVoyageNumber("VOYAGE001");
    assertEquals("VOYAGE001", eventLogger.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_njyy0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("testTrackingId");
    assertEquals("testTrackingId", eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimePattern_EBWL0_fid1() {
    EventLogger eventLogger = new EventLogger();
    String result = eventLogger.getCompletionTimePattern();
    assertEquals("M/d/yyyy h:m a", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_CAJq0_fid1() {
    EventLogger eventLogger = new EventLogger();
    String voyageNumber = eventLogger.getVoyageNumber();
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_VSjM0_fid1() {
    EventLogger eventLogger = new EventLogger();
    String trackingId = eventLogger.getTrackingId();
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLocation_fGpe0_fid1() {
    EventLogger eventLogger = new EventLogger();
    String location = eventLogger.getLocation();
    assertNull(location);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_jLoH0_WGqw1() {
    EventLogger eventLogger = new EventLogger();
    String expected = "2022-01-01 12:00:00";
    eventLogger.setTrackingId(expected);
    String actual = eventLogger.getTrackingId();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_gYft0_dZey0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("trackingId");
    assertEquals("trackingId", eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdNull_TIjN5_oqdJ0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId(null);
    assertEquals(null, eventLogger.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdReceiveSameValue_qmaN8_ZqHx0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("LOAD");
    assertTrue(eventLogger.getTrackingId().equals("LOAD"));
  }
}