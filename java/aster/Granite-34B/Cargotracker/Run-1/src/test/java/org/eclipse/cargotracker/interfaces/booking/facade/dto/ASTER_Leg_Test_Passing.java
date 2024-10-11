/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Leg_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getToNameTest_LUzb0() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("name", leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getToNameTest_Empty_oEkl2() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, new Location("", ""), LocalDateTime.now(), LocalDateTime.now());
    assertEquals("", leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest_COri0() {
    Location location1 = new Location("unLocode1", "name1");
    Location location2 = new Location("unLocode2", "name2");
    Leg leg = new Leg("voyageNumber1", location1, location2,
            LocalDateTime.of(2022, 1, 1, 0, 0),
            LocalDateTime.of(2022, 1, 2, 0, 0));
    assertEquals("voyageNumber1", leg.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest_NullVoyageNumber_CAKg1() {
    Location location1 = new Location("unLocode1", "name1");
    Location location2 = new Location("unLocode2", "name2");
    Leg leg = new Leg(null, location1, location2,
            LocalDateTime.of(2022, 1, 1, 0, 0),
            LocalDateTime.of(2022, 1, 2, 0, 0));
    assertEquals(null, leg.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest_EmptyVoyageNumber_eRcb2() {
    Location location1 = new Location("unLocode1", "name1");
    Location location2 = new Location("unLocode2", "name2");
    Leg leg = new Leg("", location1, location2,
            LocalDateTime.of(2022, 1, 1, 0, 0),
            LocalDateTime.of(2022, 1, 2, 0, 0));
    assertEquals("", leg.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromCoverage_bEEn1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    leg.getFrom();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromCoverage2_EFCx2() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    leg.getFrom();
    leg.getFrom();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromUnLocode_returnsFromUnLocode3_tgbF2() {
    String unLocode = "USCHI";
    String name = "Chicago";
    Location from = new Location(unLocode, name);
    Leg leg = new Leg("voyage123", from, new Location("NLRTM", "Rotterdam"),
            LocalDateTime.now(), LocalDateTime.now());
    String result = leg.getFromUnLocode();
    assertEquals(unLocode, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTo_IoMO0_fid1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToWithNullToLocation_NlGE1_fid1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, null, LocalDateTime.now(), LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToWithNullFromLocation_MDnp2_fid1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", null, location, LocalDateTime.now(), LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToWithNullFromAndToLocation_KnSu3_fid1() {
    Leg leg = new Leg("voyageNumber", null, null, LocalDateTime.now(), LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFrom_oRoh0_fid1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("name (unLocode)", leg.getFrom());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromTest_YRcK0_DRWN0() {
    Location loc1 = new Location("loc1", "loc1");
    Location loc2 = new Location("loc2", "loc2");
    Leg leg = new Leg("v1", loc1, loc2, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(leg.getFrom(), loc1.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getLoadTimeTest2_Boqc1_xqex0() {
    Location loc1 = new Location("loc1", "loc1");
    Location loc2 = new Location("loc2", "loc2");
    Leg leg = new Leg("v1", loc1, loc2, LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 1, 2, 0, 0));
    assertNotEquals(leg.getLoadTime(), LocalDateTime.of(2022, 1, 1, 0, 0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getToUnLocodeTest_BFtZ0_xTAE0() {
    Location location = new Location("ABC", "Location A");
    Leg leg = new Leg("Voyage 1", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("ABC", leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getToUnLocodeTest_zunv1_lEsE0() {
    Location location = new Location("XYZ", "Location B");
    Leg leg = new Leg("Voyage 2", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("XYZ", leg.getToUnLocode());
  }
}