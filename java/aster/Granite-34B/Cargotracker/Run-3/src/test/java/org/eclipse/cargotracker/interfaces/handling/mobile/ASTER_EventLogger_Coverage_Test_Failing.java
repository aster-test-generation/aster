/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_init_1_JRzM0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test8_YFPw7_zZbC0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("trackingId");
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test10_Mstu9_zyNH0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation("location");
    eventLogger.setVoyageNumber("voyageNumber");
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test6_GKQz5_WVIr0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("trackingId");
    eventLogger.setVoyageNumber("voyageNumber");
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test2_lPRN1_CTyh0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("trackingId");
    eventLogger.setLocation("location");
    eventLogger.setVoyageNumber("voyageNumber");
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test9_iKBT8_YbAJ0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation("location");
    eventLogger.setVoyageNumber("voyageNumber");
    eventLogger.setEventType(HandlingEvent.Type.LOAD);
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test5_MprY4_PMhU0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("trackingId");
    eventLogger.setVoyageNumber("voyageNumber");
    eventLogger.setEventType(HandlingEvent.Type.LOAD);
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test7_ePad6_KJoy0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("trackingId");
    eventLogger.setEventType(HandlingEvent.Type.LOAD);
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test10_Mstu9_zyNH0_fid2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation("location");
    eventLogger.setVoyageNumber("voyageNumber");
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
    Assertions.assertNotNull(eventLogger.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test9_iKBT8_YbAJ0_fid2() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setLocation("location");
    eventLogger.setVoyageNumber("voyageNumber");
    eventLogger.setEventType(HandlingEvent.Type.LOAD);
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
    Assertions.assertNotNull(eventLogger);
    Assertions.assertEquals("location", eventLogger.getLocation());
    Assertions.assertEquals("voyageNumber", eventLogger.getVoyageNumber());
    Assertions.assertEquals(HandlingEvent.Type.LOAD, eventLogger.getEventType());
    Assertions.assertNotNull(eventLogger.getCompletionTime());
  }
}