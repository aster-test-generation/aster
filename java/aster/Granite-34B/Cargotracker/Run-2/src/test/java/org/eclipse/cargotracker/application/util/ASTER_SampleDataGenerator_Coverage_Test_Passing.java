/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.util;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.RouteSpecification;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.SampleLocations;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SampleDataGenerator_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargo_zGSy4() {
    TrackingId trackingId = new TrackingId("ABC123");
    RouteSpecification routeSpecification = new RouteSpecification(SampleLocations.HONGKONG, SampleLocations.HELSINKI, LocalDate.now().plusDays(15));
    Cargo cargo = new Cargo(trackingId, routeSpecification);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargo1_XJLk9() {
    TrackingId trackingId = new TrackingId("JKL567");
    RouteSpecification routeSpecification = new RouteSpecification(SampleLocations.HANGZOU, SampleLocations.STOCKHOLM, LocalDate.now().plusDays(18));
    Cargo cargo = new Cargo(trackingId, routeSpecification);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadSampleData_7_vzeb6_KyGK0() {
    SampleDataGenerator sampleDataGenerator = new SampleDataGenerator();
  }
}