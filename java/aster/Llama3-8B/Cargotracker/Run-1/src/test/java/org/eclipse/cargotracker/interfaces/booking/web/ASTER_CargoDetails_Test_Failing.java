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

public class Aster_CargoDetails_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_NDeV0() {
    CargoDetails cargoDetails = new CargoDetails();
    String expectedTrackingId = "123456";
    String actualTrackingId = cargoDetails.getTrackingId();
    assertEquals(expectedTrackingId, actualTrackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_NDeV0_fid1() {
    CargoDetails cargoDetails = new CargoDetails();
    String expectedTrackingId = "123456";
    String actualTrackingId = cargoDetails.getTrackingId();
    assertNull(expectedTrackingId);
  }
}