/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;
import java.util.List;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ListCargo_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNotRoutedCargos_poMu1() {
        ListCargo listCargo = new ListCargo();
        List<CargoRoute> result = listCargo.getNotRoutedCargos();
        assertNotNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRoutedUnclaimedCargos_eIxn0_1() {
        ListCargo listCargo = new ListCargo();
        List<CargoRoute> result = listCargo.getRoutedUnclaimedCargos();
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRoutedUnclaimedCargos_eIxn0_2() {
        ListCargo listCargo = new ListCargo();
        List<CargoRoute> result = listCargo.getRoutedUnclaimedCargos();
        assertEquals(0, result.size());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_amfZ0() {
        ListCargo listCargo = new ListCargo();
        List<CargoRoute> cargos = new ArrayList<>();
        listCargo.init();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRoutedUnclaimedCargos_eIxn0() {
        ListCargo listCargo = new ListCargo();
        List<CargoRoute> result = listCargo.getRoutedUnclaimedCargos();
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}