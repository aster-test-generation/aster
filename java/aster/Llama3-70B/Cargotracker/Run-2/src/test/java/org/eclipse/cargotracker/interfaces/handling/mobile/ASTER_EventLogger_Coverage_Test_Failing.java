/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_EventLogger_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmit_FacesContextAddMessage_Ezgq6() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_LocationsInitialization_LWxR8_EMCV0() {
    EventLogger eventLogger = new EventLogger();
    eventLogger.init();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmit_TrackingIdCreation_KIRm0_oZSP0() {
    EventLogger eventLogger = new EventLogger();
    String expectedTrackingId = "trackingId";
    eventLogger.setTrackingId(expectedTrackingId);
    assertEquals(expectedTrackingId, eventLogger.getTrackingId());
    eventLogger.submit();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_LocationsForEach_zgax9_DWBo0() {
    EventLogger eventLogger = new EventLogger();
    List<java.awt.Point> locations = new ArrayList<>();
    java.awt.Point location = new java.awt.Point();
    location.setLocation(1, 1);
    locations.add(location);
    eventLogger.init();
    assertEquals(0, eventLogger.getLocations().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_LocationsInitialization_LWxR8_EMCV0_fid2() {
    EventLogger eventLogger = new EventLogger();
    assertNotNull(eventLogger);
    eventLogger.init();
  }
}