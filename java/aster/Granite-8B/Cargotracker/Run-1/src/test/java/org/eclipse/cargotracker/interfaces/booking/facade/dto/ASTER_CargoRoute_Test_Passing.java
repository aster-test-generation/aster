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
  public void testGetTrackingId_MPPM0_fsKt0() {
    CargoRoute cargoRoute = new CargoRoute("12345", new Location("USNYC", "New York"), new Location("CHZRH", "Zurich"), LocalDate.now(), false, false, new Location("USNYC", "New York"), "In transit", new ArrayList<>());
    String trackingId = cargoRoute.getTrackingId();
    assertEquals("12345", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_test1_VDGI0_GOGo0() {
    CargoRoute cargoRoute = new CargoRoute("123", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDate.now(), false, false, new Location("USCHI", "Chicago"), "In transit", new ArrayList<>());
    String nextLocation = cargoRoute.getNextLocation();
    assertNull(nextLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsRoutedWithoutLegs_VeUB1_xHFX0() {
    Location location1 = new Location("USNYC", "New York");
    Location location2 = new Location("USLAX", "Los Angeles");
    CargoRoute cargoRoute = new CargoRoute("12345", location1, location2, LocalDate.now(), false, false, location1, "In transit", new ArrayList<>());
    boolean isRouted = cargoRoute.isRouted();
    assertFalse(isRouted);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisrouted_OiUF0_ZHiN0() {
    Location location1 = new Location("USNYC", "New York");
    Location location2 = new Location("USCHI", "Chicago");
    List<Leg> legs = new ArrayList<>();
    CargoRoute cargoRoute = new CargoRoute("12345", location1, location2, LocalDate.now(), false, false, location1, "In transit", legs);
    assertFalse(cargoRoute.isMisrouted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisroutedFalse_iAoz1_Uflv0() {
    Location location1 = new Location("USNYC", "New York");
    Location location2 = new Location("USCHI", "Chicago");
    List<Leg> legs = new ArrayList<>();
    CargoRoute cargoRoute = new CargoRoute("12345", location1, location2, LocalDate.now(), false, false, location2, "In transit", legs);
    assertFalse(cargoRoute.isMisrouted());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getOrigin_dGgy0_UcWa0() {
    Location location = new Location("unLocode", "name");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, location, "transportStatus", new ArrayList<>());
    String expected = location.toString();
    String actual = cargoRoute.getOrigin();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocationName_lrKA0_vEEl0() {
    Location location = new Location("unLocode", "name");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, location, "transportStatus", new ArrayList<>());
    assertEquals("name", cargoRoute.getLastKnownLocationName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastKnownLocation_YMQy0_VADZ0() {
    Location location = new Location("unLocode", "name");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, location, LocalDate.now(), false, false, location, "transportStatus", new ArrayList<>());
    assertEquals(location.getUnLocode(), cargoRoute.getLastKnownLocationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getTransportStatus_GTSk0_LvFr0() {
    CargoRoute cargoRoute = new CargoRoute("12345", new Location("USNYC", "New York"), new Location("USCHI", "Chicago"), LocalDate.now(), false, false, new Location("USNYC", "New York"), "In transit", new ArrayList<>());
    String result = cargoRoute.getTransportStatus();
    assertEquals("In transit", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLegs_RBrU0_kuiC0_1() {
    Location location1 = new Location("loc1", "Location 1");
    Location location2 = new Location("loc2", "Location 2");
    CargoRoute cargoRoute = new CargoRoute("track1", location1, location2, LocalDate.now(), false, false, location1, "status", new ArrayList<>());
    List<Leg> legs = cargoRoute.getLegs();
    assertNotNull(legs);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLegs_RBrU0_kuiC0_2() {
    Location location1 = new Location("loc1", "Location 1");
    Location location2 = new Location("loc2", "Location 2");
    CargoRoute cargoRoute = new CargoRoute("track1", location1, location2, LocalDate.now(), false, false, location1, "status", new ArrayList<>());
    List<Leg> legs = cargoRoute.getLegs();
    assertTrue(legs.isEmpty());
  }
}