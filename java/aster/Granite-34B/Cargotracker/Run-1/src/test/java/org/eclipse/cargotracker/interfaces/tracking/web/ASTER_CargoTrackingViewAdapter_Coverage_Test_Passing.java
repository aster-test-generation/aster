/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.tracking.web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoTrackingViewAdapter_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNotRouted_fVrJ0() {
    Cargo cargo = new Cargo();
    List<HandlingEvent> handlingEvents = new ArrayList<>();
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, handlingEvents);
    assertEquals("NOT_ROUTED", cargoTrackingViewAdapter.getStatusCode());
  }
}