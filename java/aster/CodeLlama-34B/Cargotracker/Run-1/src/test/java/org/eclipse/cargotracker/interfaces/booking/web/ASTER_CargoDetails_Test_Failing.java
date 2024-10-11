/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoDetails_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoad_LfNZ0() {
    CargoDetails cargoDetails = new CargoDetails();
    cargoDetails.load();
    assertNotNull(cargoDetails.getCargo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_SdBS0() {
    CargoDetails cargoDetails = new CargoDetails();
    String trackingId = cargoDetails.getTrackingId();
    assertEquals("1234567890", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoad_LfNZ0_fid1() {
    CargoDetails cargoDetails = new CargoDetails();
    cargoDetails.load();
    assertNotNull(cargoDetails.getTrackingId());
  }
}