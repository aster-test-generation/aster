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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ListCargo_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNotRoutedCargos_uSZb0() {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> result = listCargo.getNotRoutedCargos();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRoutedUnclaimedCargos_YgZZ0_fid1() {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> expected = new ArrayList<>();
    List<CargoRoute> actual = listCargo.getRoutedUnclaimedCargos();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClaimedCargos_PPlD0() {
    ListCargo listCargo = new ListCargo();
    List<CargoRoute> claimedCargos = listCargo.getClaimedCargos();
    assertNotNull(claimedCargos);
  }
}