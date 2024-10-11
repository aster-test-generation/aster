/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoRoute_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationNameWithNullLastKnownLocation_uKqP1() {
    Location location = new Location("unLocode", "name");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, null, "transportStatus", new ArrayList<Leg>());
    assertEquals(null, cargoRoute.getLastKnownLocationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithNullLastKnownLocation_SBIH1() {
    Location location = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", location, location,
            LocalDate.now(), false, false, null, "In Transit", new ArrayList<Leg>());
    assertEquals("", cargoRoute.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalDestinationName_WIJX0_lMLr0() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USDAL", "Dallas");
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, finalDestination,
            LocalDate.of(2022, 12, 31), false, false, null, "IN_PORT", null);
    assertEquals("Dallas", cargoRoute.getFinalDestinationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalDestinationNameWithNullFinalDestination_Ndtb1_zseF0() {
    Location origin = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, null,
            LocalDate.of(2022, 12, 31), false, false, null, "IN_PORT", null);
    assertEquals("", cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalDestinationTest2_FAcH1_zEjc0() {
    Location finalDestination = new Location("XYZ", "ABC (XYZ)");
    CargoRoute cargoRoute = new CargoRoute("456", new Location("LMN", "PQR"), finalDestination,
            LocalDate.of(2022, 1, 1), false, false, new Location("ABC (XYZ)", "XYZ"), "DELIVERED", new ArrayList<Leg>());
    assertEquals("ABC (XYZ)", cargoRoute.getFinalDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalDestinationTest3_Mgcv2_iqMU0() {
    Location finalDestination = new Location("XYZ (ABC)", "XYZ");
    CargoRoute cargoRoute = new CargoRoute("789", new Location("PQR", "LMN"), finalDestination,
            LocalDate.of(2022, 1, 1), false, false, new Location("XYZ", "XYZ (ABC)"), "IN_TRANSIT", new ArrayList<Leg>());
    assertEquals("XYZ (ABC)", cargoRoute.getFinalDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFinalDestinationCodeWithNullFinalDestination_wjIg1_AXWC0() {
    Location origin = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, null, LocalDate.now(), false, false, null, "IN_PORT", new ArrayList<Leg>());
    assertEquals(null, cargoRoute.getFinalDestinationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOriginCode_returnsCorrectOriginCode_cuID0_iuIR0() {
    Location origin = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, null, null, false, false, null, null, null);
    String actualOriginCode = cargoRoute.getOriginCode();
    assertEquals("USNYC", actualOriginCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOriginCode_returnsCorrectOriginCode_forAnotherLocation_btKy1_ihNd0() {
    Location origin = new Location("DEHAM", "Hamburg");
    CargoRoute cargoRoute = new CargoRoute("XYZ789", origin, null, null, false, false, null, null, null);
    String actualOriginCode = cargoRoute.getOriginCode();
    assertEquals("DEHAM", actualOriginCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOriginName_returnsCorrectOriginName_GRqP0_IFiS0() {
    Location origin = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, null, null, false, false, null, null, null);
    assertEquals("New York", cargoRoute.getOriginName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getLastKnownLocationCodeTest_pQXy0_MaLS0() {
    Location lastKnownLocation = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", lastKnownLocation, null, null, false, false, null, null, null);
    assertEquals("USNYC", cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOriginTest2_pUwU1_zUoT0() {
    Location origin = new Location("USCHI", "Chicago");
    CargoRoute cargoRoute = new CargoRoute("XYZ789", origin, null, null, false, false, null, null, null);
    assertEquals("Location{unLocode='USCHI', name='Chicago'}", cargoRoute.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOriginTest3_XiSE2_eUKl0() {
    Location origin = new Location("USEWR", "EWR");
    CargoRoute cargoRoute = new CargoRoute("QWE456", origin, null, null, false, false, null, null, null);
    assertEquals("Location{unLocode='USEWR', name='EWR'}", cargoRoute.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationCodeWithMisroutedCargo_rfiP1_tlNJ0() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USDAL", "Dallas");
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 31);
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, finalDestination, arrivalDeadline, true, false, null, "MISROUTED", List.of());
    assertEquals("USDAL", cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationNameWithNullLastKnownLocation_uKqP1_fid1() {
    Location location = new Location("unLocode", "name");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, null, "transportStatus", new ArrayList<Leg>());
    assertEquals("", cargoRoute.getLastKnownLocationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationNameWithNullName_hQfy2_fid1() {
    Location location = new Location("unLocode", null);
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, location, "transportStatus", new ArrayList<Leg>());
    assertEquals("", cargoRoute.getLastKnownLocationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocation_Baps0_fid1() {
    Location location = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", location, location,
            LocalDate.now(), false, false, location, "In Transit", new ArrayList<Leg>());
    assertEquals("Location{unLocode='USNYC', name='New York'}", cargoRoute.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithEmptyLastKnownLocation_SCGz2_fid1() {
    Location location = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", location, location,
            LocalDate.now(), false, false, new Location("", ""), "In Transit", new ArrayList<Leg>());
    assertEquals("Location{unLocode='', name=''}", cargoRoute.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationCodeWithNullLastKnownLocation_XayM1_fid1() {
    Location location = new Location("ABC", "XYZ");
    CargoRoute cargoRoute = new CargoRoute("123", location, location, LocalDate.now(), false, false, null, "IN_PORT", new ArrayList<Leg>());
    assertEquals(null, cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalDestinationTest2_FAcH1_zEjc0_fid3() {
    Location finalDestination = new Location("XYZ", "ABC");
    CargoRoute cargoRoute = new CargoRoute("456", new Location("LMN", "PQR"), finalDestination,
            LocalDate.of(2022, 1, 1), false, false, new Location("ABC", "XYZ"), "DELIVERED", new ArrayList<Leg>());
    assertEquals("ABC", cargoRoute.getFinalDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFinalDestinationTest3_Mgcv2_iqMU0_fid3() {
    Location finalDestination = new Location("ABC", "XYZ");
    CargoRoute cargoRoute = new CargoRoute("789", new Location("PQR", "LMN"), finalDestination,
            LocalDate.of(2022, 1, 1), false, false, new Location("XYZ", "ABC"), "IN_TRANSIT", new ArrayList<Leg>());
    assertEquals("ABC", cargoRoute.getFinalDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_correct_next_location_OAwo0_yOCm0_fid3() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), false, false, new Location("USLAX", "Los Angeles"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getNextLocation();
    assertEquals("Los Angeles", nextLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_null_if_cargo_is_misrouted_TYSe1_vQDr0_fid3() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), true, false, new Location("USLAX", "Los Angeles"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getLastKnownLocationCode();
    assertEquals(null, nextLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_null_if_cargo_is_claimed_BMxy2_kvzn0_fid3() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), false, true, new Location("USLAX", "Los Angeles"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getLastKnownLocationCode();
    assertEquals(null, nextLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_null_if_cargo_is_in_terminal_location_WBCN3_eWEm0_fid3() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), false, false, new Location("WBCN", "CN Beijing"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getLastKnownLocationCode();
    assertEquals(null, nextLocation);
  }
}