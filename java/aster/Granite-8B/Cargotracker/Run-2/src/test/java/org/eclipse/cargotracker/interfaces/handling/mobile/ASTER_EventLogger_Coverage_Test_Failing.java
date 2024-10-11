/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit1_HcMa0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitWithTrackingIdAndVoyageNumber_AqzJ6_ejDZ0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("123456789");
    eventLogger.setVoyageNumber("123");
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitWithCompletionTime_wJhz4_ZpWv0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setCompletionTime(LocalDateTime.now());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitWithTrackingId_WszA0_ZzPV0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("123456789");
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitWithLocationAndVoyageNumber_gaaT9_isJx0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.setTrackingId("ABC");
    eventLogger.setVoyageNumber("123");
    eventLogger.submit();
  }
}