/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultCargoInspectionService_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInspectCargoExistingCargo_WGdT0() throws Exception {
    DefaultCargoInspectionService service = new DefaultCargoInspectionService();
    TrackingId trackingId = new TrackingId("existingId");
    Cargo cargo = new Cargo();
    service.inspectCargo(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInspectCargoNonExistingCargo_KNuW1() throws Exception {
    DefaultCargoInspectionService service = new DefaultCargoInspectionService();
    TrackingId trackingId = new TrackingId("nonExistingId");
    service.inspectCargo(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInspectCargoMisdirectedCargo_FMTx2() throws Exception {
    DefaultCargoInspectionService service = new DefaultCargoInspectionService();
    TrackingId trackingId = new TrackingId("misdirectedId");
    Cargo cargo = new Cargo();
    service.inspectCargo(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInspectCargoArrivedCargo_FOga3() throws Exception {
    DefaultCargoInspectionService service = new DefaultCargoInspectionService();
    TrackingId trackingId = new TrackingId("arrivedId");
    Cargo cargo = new Cargo();
    service.inspectCargo(trackingId);
  }
}