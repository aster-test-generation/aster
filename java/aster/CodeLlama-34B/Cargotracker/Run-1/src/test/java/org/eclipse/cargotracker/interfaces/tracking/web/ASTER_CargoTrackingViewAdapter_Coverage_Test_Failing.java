/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.tracking.web;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoTrackingViewAdapter_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusText_NullDelivery_DFMM6() {
    Cargo cargo = new Cargo();
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    String statusText = adapter.getStatusText();
    assertEquals("Unknown", statusText);
  }
}