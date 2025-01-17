/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ListCargo_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNotRoutedCargos_bHSv0() throws Exception {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> result = listCargo.getNotRoutedCargos();
    assert result != null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClaimedCargos_hbTY0() throws Exception {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> claimedCargos = listCargo.getClaimedCargos();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRoutedUnclaimedCargos_UREU0() throws Exception {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> result = listCargo.getRoutedUnclaimedCargos();
  }
}