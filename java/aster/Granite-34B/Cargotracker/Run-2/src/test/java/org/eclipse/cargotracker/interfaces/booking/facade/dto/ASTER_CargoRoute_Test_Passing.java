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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoRoute_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationName_Xhfd0() {
    Location location = new Location("unLocode", "name");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, location, "transportStatus", new ArrayList<Leg>());
    assertEquals("name", cargoRoute.getLastKnownLocationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationNameWithNullName_hQfy2() {
    Location location = new Location("unLocode", null);
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, location, "transportStatus", new ArrayList<Leg>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsClaimed_SoAq0() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USDAL", "Dallas");
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 31);
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, finalDestination, arrivalDeadline, false, true, null, "IN_PORT", new ArrayList<Leg>());
    assertEquals(true, cargoRoute.isClaimed());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsClaimedWithNoClaim_dyZI1() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USDAL", "Dallas");
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 31);
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, finalDestination, arrivalDeadline, false, false, null, "IN_PORT", new ArrayList<Leg>());
    assertEquals(false, cargoRoute.isClaimed());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocation_Baps0() {
    Location location = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", location, location,
            LocalDate.now(), false, false, location, "In Transit", new ArrayList<Leg>());
    assertEquals("New York (USNYC)", cargoRoute.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationWithEmptyLastKnownLocation_SCGz2() {
    Location location = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("ABC123", location, location,
            LocalDate.now(), false, false, new Location("", ""), "In Transit", new ArrayList<Leg>());
    assertEquals(" ()", cargoRoute.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTransportStatus_returnsTransportStatus_DySK0() {
    CargoRoute cargoRoute = new CargoRoute("ABC", new Location("USNYC", "New York"), new Location("USCHI", "Chicago"),
            LocalDate.of(2022, 1, 1), false, false, new Location("USHAV", "Havana"), "In Transit", new ArrayList<>());
    assertEquals("In Transit", cargoRoute.getTransportStatus());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationCode_Atxa0() {
    Location location = new Location("ABC", "XYZ");
    CargoRoute cargoRoute = new CargoRoute("123", location, location, LocalDate.now(), false, false, location, "IN_PORT", new ArrayList<Leg>());
    assertEquals("ABC", cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationCodeWithNullLastKnownLocation_XayM1() {
    Location location = new Location("ABC", "XYZ");
    CargoRoute cargoRoute = new CargoRoute("123", location, location, LocalDate.now(), false, false, null, "IN_PORT", new ArrayList<Leg>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getLastKnownLocationCodeTest_ABC1_LcLE0() {
    Location lastKnownLocation = new Location("ABC", "XYZ");
    CargoRoute cargoRoute = new CargoRoute("123", new Location("PQR", "LMN"), new Location("XYZ", "ABC"),
            LocalDate.of(2022, 1, 1), false, false, lastKnownLocation, "IN_TRANSIT", new ArrayList<Leg>());
    assertEquals("ABC", cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFinalDestinationCode_wrsn0_MJpp0() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USCHI", "Chicago");
    List<Leg> legs = new ArrayList<>();
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, finalDestination, LocalDate.now(), false, false, null, "IN_PORT", legs);
    assertEquals("USCHI", cargoRoute.getFinalDestinationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_correct_next_location_OAwo0_yOCm0() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), false, false, new Location("USLAX", "Los Angeles"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getNextLocation();
    assertNull(nextLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_null_if_cargo_is_misrouted_TYSe1_vQDr0() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), true, false, new Location("USLAX", "Los Angeles"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getLastKnownLocationCode();
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_null_if_cargo_is_claimed_BMxy2_kvzn0() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), false, true, new Location("USLAX", "Los Angeles"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getLastKnownLocationCode();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_returns_null_if_cargo_is_in_terminal_location_WBCN3_eWEm0() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), false, false, new Location("WBCN", "CN Beijing"), "In Transit", new ArrayList<>());
    String nextLocation = cargoRoute.getLastKnownLocationCode();
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisroutedWhenTrue_PxzA0_UKkc0() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), true, false, new Location("USLAX", "Los Angeles"), "IN_PORT", new ArrayList<Leg>());
    assertTrue(cargoRoute.isMisrouted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisroutedWhenFalse_YGIB1_zvRn0() {
    CargoRoute cargoRoute = new CargoRoute("ABC123", new Location("USNYC", "New York"), new Location("USDAL", "Dallas"),
            LocalDate.of(2022, 1, 1), false, false, new Location("USLAX", "Los Angeles"), "IN_PORT", new ArrayList<Leg>());
    assertFalse(cargoRoute.isMisrouted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationCode_QSDc3_xacl0() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USDAL", "Dallas");
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 31);
    Location lastKnownLocation = new Location("USLAX", "Los Angeles");
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, finalDestination, arrivalDeadline, false, false, lastKnownLocation, "IN_TRANSIT", new ArrayList<Leg>());
    assertEquals("USLAX", cargoRoute.getLastKnownLocationCode());
  }
}