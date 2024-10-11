/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Leg_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getToNameTest_tTSe0() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("name", leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberTest_fVsV0() {
    Location location1 = new Location("unLocode1", "name1");
    Location location2 = new Location("unLocode2", "name2");
    Leg leg = new Leg("voyageNumber1", location1, location2, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("voyageNumber1", leg.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberNullTest_PzER1() {
    Location location1 = new Location("unLocode1", "name1");
    Location location2 = new Location("unLocode2", "name2");
    Leg leg = new Leg(null, location1, location2, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(null, leg.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getVoyageNumberEmptyTest_CWxK2() {
    Location location1 = new Location("unLocode1", "name1");
    Location location2 = new Location("unLocode2", "name2");
    Leg leg = new Leg("", location1, location2, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("", leg.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromNameTest3_wgqA2() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("name", leg.getFromName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getToUnLocode_returnsToUnLocode_RWxe0() {
    String unLocode = "USCHI";
    String name = "Chicago";
    Location to = new Location(unLocode, name);
    Leg leg = new Leg("voyage123", new Location("USNYC", "New York"), to,
            LocalDateTime.now(), LocalDateTime.now());
    String result = leg.getToUnLocode();
    assertEquals(unLocode, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_OOOG0() {
    Location from = new Location("CNHKG", "Hong Kong");
    Location to = new Location("USNYC", "New York");
    Leg leg = new Leg("V123", from, to, LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 2, 1, 0, 0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithEmptyVoyageNumber_kMxt2_fid1() {
    Location from = new Location("CNHKG", "Hong Kong");
    Location to = new Location("USNYC", "New York");
    Leg leg = new Leg("", from, to, LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 2, 1, 0, 0));
    assertEquals("Leg{voyageNumber=, from=CNHKG, to=USNYC, loadTime=1/1/2022 12:0 AM, unloadTime=2/1/2022 12:0 AM}", leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullVoyageNumber_YWHt3_fid1() {
    Location from = new Location("CNHKG", "Hong Kong");
    Location to = new Location("USNYC", "New York");
    Leg leg = new Leg(null, from, to, LocalDateTime.of(2022, 1, 1, 0, 0), LocalDateTime.of(2022, 2, 1, 0, 0));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTo_Zubl0_fid1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("name (unLocode)", leg.getTo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToWithNullFromLocation_ZjQK2_fid1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", null, location, LocalDateTime.now(), LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromTest_Vkhr0_fid1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("name (unLocode)", leg.getFrom());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromTest2_VdnO1() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getFromTest_Urgv0_UJhg0() {
    Location loc1 = new Location("loc1", "name1");
    Location loc2 = new Location("loc2", "name2");
    Leg leg = new Leg("v1", loc1, loc2, LocalDateTime.now(), LocalDateTime.now());
    String result = leg.getFrom();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnloadTimeTest_min_PzGq6_oCcH0() {
    Location location1 = new Location("location1", "location1");
    Location location2 = new Location("location2", "location2");
    Leg leg = new Leg("voyageNumber", location1, location2, LocalDateTime.now(), LocalDateTime.now());
    String actualUnloadTime = leg.getFrom();
    String expectedUnloadTime = "location1 (location1)";
    assertEquals(expectedUnloadTime, actualUnloadTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getUnloadTimeTest_invalid_MYhw7_YpDb0() {
    Location location1 = new Location("location1", "location1");
    Location location2 = new Location("location2", "location2");
    Leg leg = new Leg("voyageNumber", location1, location2, LocalDateTime.now(), LocalDateTime.now());
    String actualUnloadTime = leg.getFrom();
    String expectedUnloadTime = "2022-02-30T24:60:60";
    assertNotEquals(expectedUnloadTime, actualUnloadTime);
  }
}