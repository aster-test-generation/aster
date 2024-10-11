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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoRoute_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFinalDestinationCode_tMpK0_tHcC0() {
    Location origin = new Location("USCHI", "Chicago");
    Location finalDestination = new Location("USNYC", "New York");
    CargoRoute cargoRoute = new CargoRoute("12345", origin, finalDestination, LocalDate.now(), false, false, null, "IN_TRANSIT", null);
    assertEquals("USNYC", cargoRoute.getFinalDestinationCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getOriginName_withLastKnownLocation_awHv5_ujIV0() {
    Location location = new Location("unLocode", "name");
    Location lastKnownLocation = new Location("lastUnLocode", "lastName");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, null, null, false, false, lastKnownLocation, null, null);
    String result = cargoRoute.getOriginName();
    assertEquals("lastName", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getOriginName_withTransportStatus_JDJX6_uuzI0() {
    Location location = new Location("unLocode", "name");
    CargoRoute cargoRoute = new CargoRoute("trackingId", location, null, null, false, false, null, "transportStatus", null);
    String result = cargoRoute.getOriginName();
    assertEquals("name", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_bmjt0_VRFm0() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USCHI", "Chicago");
    LocalDate arrivalDeadline = LocalDate.now().plusDays(7);
    CargoRoute cargoRoute = new CargoRoute("12345", origin, finalDestination, arrivalDeadline, false, false, null, "IN_TRANSIT", null);
    String expected = arrivalDeadline.toString();
    String actual = cargoRoute.getArrivalDeadline();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsClaimed_kTAQ0_TIns0() {
    Location origin = new Location("USNYC", "New York");
    Location finalDestination = new Location("USCHI", "Chicago");
    CargoRoute cargoRoute = new CargoRoute("ABC123", origin, finalDestination, LocalDate.now().plusDays(7), false, false, null, "IN_TRANSIT", null);
    assertTrue(cargoRoute.isClaimed());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextLocation_test1_VDGI0_GOGo0_fid3() {
    CargoRoute cargoRoute = new CargoRoute("123", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDate.now(), false, false, new Location("USCHI", "Chicago"), "In transit", new ArrayList<>());
    String nextLocation = cargoRoute.getNextLocation();
    assertEquals("USNYC", nextLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisrouted_OiUF0_ZHiN0_fid3() {
    Location location1 = new Location("USNYC", "New York");
    Location location2 = new Location("USCHI", "Chicago");
    List<Leg> legs = new ArrayList<>();
    CargoRoute cargoRoute = new CargoRoute("12345", location1, location2, LocalDate.now(), false, false, location1, "In transit", legs);
    assertTrue(cargoRoute.isMisrouted());
  }
}