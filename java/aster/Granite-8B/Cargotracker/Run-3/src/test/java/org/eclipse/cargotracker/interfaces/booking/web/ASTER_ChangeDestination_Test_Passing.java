/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId_cVOe0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    changeDestination.setTrackingId("12345");
    assertEquals("12345", changeDestination.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_1() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected final destination name", "Expected final destination name", cargoRoute.getFinalDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_2() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected final destination", "Expected final destination", cargoRoute.getFinalDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_3() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected tracking id", "Expected tracking id", cargoRoute.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_4() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected final destination code", "Expected final destination code", cargoRoute.getFinalDestinationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_5() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected origin code", "Expected origin code", cargoRoute.getOriginCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_6() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected next location", "Expected next location", cargoRoute.getNextLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_7() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected origin name", "Expected origin name", cargoRoute.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_8() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected origin", "Expected origin", cargoRoute.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_9() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected arrival deadline", "Expected arrival deadline", cargoRoute.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_10() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected last known location name", "Expected last known location name", cargoRoute.getLastKnownLocationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_11() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected last known location", "Expected last known location", cargoRoute.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_12() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected transport status", "Expected transport status", cargoRoute.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_VwvG0_14() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals("Expected last known location code", "Expected last known location code", cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetDestinationUnlocode_cEPT0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = changeDestination.getDestinationUnlocode();
    assertNotNull(destinationUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetDestinationUnlocodeWithNull_FHll1() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = changeDestination.getDestinationUnlocode();
    assertNull(destinationUnlocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetDestinationUnlocodeWithEmpty_IGJM2() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = changeDestination.getDestinationUnlocode();
    assertTrue(destinationUnlocode.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetDestinationUnlocodeWithValidUnlocode_aTOy4() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String destinationUnlocode = changeDestination.getDestinationUnlocode();
    assertEquals("validUnlocode", destinationUnlocode);
  }
}