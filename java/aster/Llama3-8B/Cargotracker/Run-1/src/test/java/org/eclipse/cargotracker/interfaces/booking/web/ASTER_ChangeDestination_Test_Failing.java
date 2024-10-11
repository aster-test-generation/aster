/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getFinalDestinationName(), "");
    assertEquals(cargoRoute.getFinalDestination(), "");
    assertEquals(cargoRoute.getTrackingId(), "");
    assertEquals(cargoRoute.getFinalDestinationCode(), "");
    assertEquals(cargoRoute.getOriginCode(), "");
    assertEquals(cargoRoute.getNextLocation(), "");
    assertEquals(cargoRoute.getOriginName(), "");
    assertEquals(cargoRoute.getOrigin(), "");
    assertEquals(cargoRoute.getArrivalDeadline(), "");
    assertEquals(cargoRoute.getLastKnownLocationName(), "");
    assertEquals(cargoRoute.getLastKnownLocation(), "");
    assertEquals(cargoRoute.getTransportStatus(), "");
    assertEquals(cargoRoute.getLegs().size(), 0);
    assertEquals(cargoRoute.getLastKnownLocationCode(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_VCbm0() {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = "expectedDestinationUnlocode";
    assertEquals(expected, changeDestination.getDestinationUnlocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_ZDhK0() {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
    assertEquals("Expected trackingId", trackingId, "<EXPECTED_VALUE>");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_1() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getFinalDestinationName(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_2() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getFinalDestination(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_3() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getTrackingId(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_4() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getFinalDestinationCode(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_5() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getOriginCode(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_6() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getNextLocation(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_7() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getOriginName(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_8() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getOrigin(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_9() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getArrivalDeadline(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_10() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getLastKnownLocationName(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_11() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getLastKnownLocation(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_12() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getTransportStatus(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_13() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getLegs().size(), 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCargo_PEOs0_14() {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    assertEquals(cargoRoute.getLastKnownLocationCode(), "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationUnlocode_VCbm0_fid2() {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = "expectedDestinationUnlocode";
    assertNull(expected);
  }
}