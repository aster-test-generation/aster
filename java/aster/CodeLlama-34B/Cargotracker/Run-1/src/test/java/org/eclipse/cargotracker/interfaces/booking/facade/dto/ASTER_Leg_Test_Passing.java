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
  public void testGetTo_ValidInputs_rIJa0() {
    String voyageNumber = "V123";
    Location from = new Location("USCHI", "Chicago");
    Location to = new Location("USNYC", "New York");
    LocalDateTime loadTime = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime unloadTime = LocalDateTime.of(2022, 1, 1, 12, 0, 0);
    Leg leg = new Leg(voyageNumber, from, to, loadTime, unloadTime);
    String actual = leg.getTo();
    assertEquals(to.toString(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToName_udec0() {
    Leg leg = new Leg("voyage1", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.now(), LocalDateTime.now());
    assertEquals("New York", leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToNameWithNullFrom_JGAJ2() {
    Leg leg = new Leg("voyage1", null, new Location("USNYC", "New York"), LocalDateTime.now(), LocalDateTime.now());
    assertEquals("New York", leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_sYto0() {
    Leg leg = new Leg("V123", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 12, 0));
    String voyageNumber = leg.getVoyageNumber();
    assertEquals("V123", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFrom_InvalidInput_RDLR3() {
    Leg leg = new Leg("12345", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 1, 13, 0));
    String expected = "USCHI";
    String actual = leg.getFrom();
    assertNotEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullVoyageNumber_Huzy3() {
    Location from = new Location("from", "From Location");
    Location to = new Location("to", "To Location");
    Leg leg = new Leg(null, from, to, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("to", leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_qxAK0_fid1() {
    Leg leg = new Leg("V123", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=V123, from=USCHI, to=USNYC, loadTime=1/1/2022 10:0 AM, unloadTime=1/2/2022 10:0 AM}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullVoyageNumber_rxiS1_fid1() {
    Leg leg = new Leg(null, new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=null, from=USCHI, to=USNYC, loadTime=1/1/2022 10:0 AM, unloadTime=1/2/2022 10:0 AM}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocode_OdYw0_IxMf1() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), new Location("unLocode", "name"), LocalDateTime.now(), LocalDateTime.now());
    assertEquals("unLocode", leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullUnLocode_INnX7_PLQy0() {
    Leg leg = new Leg("voyageNumber", new Location(null, "name"), new Location(null, "name"), LocalDateTime.now(), LocalDateTime.now());
    assertNull(leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullUnLocode_INnX7_YSnF1() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), new Location("unLocode", "name"), LocalDateTime.now(), LocalDateTime.now());
    assertEquals("unLocode", leg.getFromUnLocode().toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithEmptyString_Flrn8_FpAp0() {
    Leg leg = new Leg("voyageNumber", new Location("", "name"), new Location("unLocode", "name"), LocalDateTime.now(), LocalDateTime.now());
    assertEquals("", leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromName_zUlw0_IJWn0() {
    Location from = new Location("USCHI", "Chicago");
    Location to = new Location("USNYC", "New York");
    Leg leg = new Leg("V123", from, to, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 12, 0));
    assertEquals("Chicago", leg.getFromName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromNameWithNullFrom_wyOJ1_yIWN0() {
    Location to = new Location("USNYC", "New York");
    Location from = new Location("USCHI", "Chicago");
    Leg leg = new Leg("V123", from, to, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 12, 0));
    assertEquals("Chicago", leg.getFromName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromNameWithNullTo_QjuB2_vDjW0() {
    Location from = new Location("USCHI", "Chicago");
    Leg leg = new Leg("V123", from, null, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 12, 0));
    assertEquals("Chicago", leg.getFromName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromNameWithNullFromAndTo_BjGX3_ymRK0() {
    Leg leg = new Leg("V123", new Location("UNKNOWN", "UNKNOWN"), new Location("UNKNOWN", "UNKNOWN"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 12, 0));
    assertEquals("UNKNOWN", leg.getFromName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocode_aUkH0_NAiN0() {
    Location from = new Location("from", "From Location");
    Location to = new Location("to", "To Location");
    Leg leg = new Leg("voyageNumber", from, to, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("to", leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullFromLocation_kXCT2_Sfba0() {
    Location to = new Location("to", "To Location");
    Leg leg = new Leg("voyageNumber", null, to, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(to.getUnLocode(), leg.getToUnLocode());
  }
}