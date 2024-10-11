/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoDetails_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_jLJj0() {
    CargoDetails cargoDetails = new CargoDetails();
    cargoDetails.setTrackingId("1234567890");
    assertEquals("1234567890", cargoDetails.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_SdBS0_fid1() {
    CargoDetails cargoDetails = new CargoDetails();
    String trackingId = cargoDetails.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadWithInvalidTrackingId_ofxA1_MSor0() {
    CargoDetails cargoDetails = new CargoDetails();
    cargoDetails.setTrackingId("invalid_tracking_id");
    assertNull(cargoDetails.getCargo());
  }
}