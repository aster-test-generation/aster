/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.RouteSpecification;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoRouteDtoAssembler_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRoutingStatus_TuGD13_CCqv0() {
    Cargo cargo = new Cargo();
    CargoRouteDtoAssembler cargoRouteDtoAssembler = new CargoRouteDtoAssembler();
    CargoRoute cargoRoute = cargoRouteDtoAssembler.toDto(cargo);
    Assertions.assertNotNull(cargoRoute);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetItinerary_OgOj2_jsxf1() {
    CargoRouteDtoAssembler cargoRouteDtoAssembler = new CargoRouteDtoAssembler();
    Cargo cargo = new Cargo();
    CargoRoute cargoRoute = cargoRouteDtoAssembler.toDto(cargo);
    Assertions.assertNotNull(cargoRoute);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testTrackingId_luYH9_TMXl0() {
    CargoRouteDtoAssembler cargoRouteDtoAssembler = new CargoRouteDtoAssembler();
    Cargo cargo = new Cargo(new TrackingId("luYH9"), new RouteSpecification());
    CargoRoute result = cargoRouteDtoAssembler.toDto(cargo);
    Assertions.assertNotNull(result.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testTransportStatus_ozRF14_ZazY0() {
    CargoRouteDtoAssembler cargoRouteDtoAssembler = new CargoRouteDtoAssembler();
    Cargo cargo = new Cargo();
    CargoRoute cargoRoute = cargoRouteDtoAssembler.toDto(cargo);
    Assertions.assertNotNull(cargoRoute.getTransportStatus());
  }
}