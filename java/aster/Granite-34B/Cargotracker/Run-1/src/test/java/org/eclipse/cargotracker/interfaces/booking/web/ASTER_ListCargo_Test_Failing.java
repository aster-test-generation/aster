/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ListCargo_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRoutedUnclaimedCargos_withoutCargoRoutes_sZZM2() {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> expected = new ArrayList<>();
    assertNull(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRoutedUnclaimedCargos_withoutCargoRoutes_sZZM2_fid2() {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> expected = new ArrayList<>();
    assertEquals(expected, listCargo.getRoutedUnclaimedCargos());
  }
}