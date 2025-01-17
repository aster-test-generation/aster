/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoDetails_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoad_hmIo0() {
    CargoDetails cargoDetails = new CargoDetails();
    cargoDetails.load();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRoute_DZCo0() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals(CargoRoute.class, cargoRoute.getClass());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectTrackingId_CNEI1() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals(" TrackingId", cargoRoute.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectOrigin_WcVb2() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("Origin", cargoRoute.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectFinalDestination_JSJF3() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("FinalDestination", cargoRoute.getFinalDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectTransportStatus_KtCO4() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("TransportStatus", cargoRoute.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectNextLocation_sNZs5() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("NextLocation", cargoRoute.getNextLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectLastKnownLocation_KbBi6() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("LastKnownLocation", cargoRoute.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectOriginName_CLlB7() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("OriginName", cargoRoute.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectFinalDestinationName_lchV8() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("FinalDestinationName", cargoRoute.getFinalDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCargo_returnsCargoRouteWithCorrectFinalDestinationCode_bquH9() {
    CargoDetails cargoDetails = new CargoDetails();
    CargoRoute cargoRoute = cargoDetails.getCargo();
    assertEquals("FinalDestinationCode", cargoRoute.getFinalDestinationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getTrackingId_returnsEmptyTrackingId_DGek1() {
    CargoDetails cargoDetails = new CargoDetails();
    String trackingId = cargoDetails.getTrackingId();
    org.junit.jupiter.api.Assertions.assertEquals("", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoad_hmIo0_fid1() {
    CargoDetails cargoDetails = new CargoDetails();
    cargoDetails.load();
    assertNotNull(cargoDetails);
  }
}