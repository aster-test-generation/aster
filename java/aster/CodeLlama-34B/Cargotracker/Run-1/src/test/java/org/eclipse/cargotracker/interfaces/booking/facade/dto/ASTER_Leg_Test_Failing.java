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

public class Aster_Leg_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullLoadTime_XBJw4() {
    Location from = new Location("from", "From Location");
    Location to = new Location("to", "To Location");
    Leg leg = new Leg("voyageNumber", from, to, null, LocalDateTime.now());
    assertNull(leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullUnloadTime_ifWq5() {
    Location from = new Location("from", "From Location");
    Location to = new Location("to", "To Location");
    Leg leg = new Leg("voyageNumber", from, to, LocalDateTime.now(), null);
    assertNull(leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_qxAK0() {
    Leg leg = new Leg("V123", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=V123, from=USCHI, to=USNYC, loadTime=2022-01-01T10:00, unloadTime=2022-01-02T10:00}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullVoyageNumber_rxiS1() {
    Leg leg = new Leg(null, new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=null, from=USCHI, to=USNYC, loadTime=2022-01-01T10:00, unloadTime=2022-01-02T10:00}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullFrom_cnWH2() {
    Leg leg = new Leg("V123", null, new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=V123, from=null, to=USNYC, loadTime=2022-01-01T10:00, unloadTime=2022-01-02T10:00}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullTo_xmxr3() {
    Leg leg = new Leg("V123", new Location("USCHI", "Chicago"), null, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=V123, from=USCHI, to=null, loadTime=2022-01-01T10:00, unloadTime=2022-01-02T10:00}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullLoadTime_vLif4() {
    Leg leg = new Leg("V123", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), null, LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=V123, from=USCHI, to=USNYC, loadTime=null, unloadTime=2022-01-02T10:00}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullUnloadTime_zAVP5() {
    Leg leg = new Leg("V123", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), null);
    String expected = "Leg{voyageNumber=V123, from=USCHI, to=USNYC, loadTime=2022-01-01T10:00, unloadTime=null}";
    assertEquals(expected, leg.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTo_NullInputs_egwP1() {
    String voyageNumber = null;
    Location from = null;
    Location to = null;
    LocalDateTime loadTime = null;
    LocalDateTime unloadTime = null;
    Leg leg = new Leg(voyageNumber, from, to, loadTime, unloadTime);
    String actual = leg.getTo();
    assertNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTo_InvalidInputs_FEdl2() {
    String voyageNumber = "V123";
    Location from = new Location("USCHI", "Chicago");
    Location to = new Location("USNYC", "New York");
    LocalDateTime loadTime = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime unloadTime = LocalDateTime.of(2022, 1, 1, 12, 0, 0);
    Leg leg = new Leg(voyageNumber, from, to, loadTime, unloadTime);
    String actual = leg.getTo();
    assertNotEquals(to.toString(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToNameWithNullTo_cFcm1() {
    Leg leg = new Leg("voyage1", new Location("USCHI", "Chicago"), null, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(null, leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFrom_ValidInput_cOXX0() {
    Leg leg = new Leg("12345", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 1, 13, 0));
    String expected = "USCHI";
    String actual = leg.getFrom();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFrom_NullInput_ROpl1() {
    Leg leg = new Leg("12345", null, new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 1, 13, 0));
    String expected = null;
    String actual = leg.getFrom();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFrom_EmptyInput_HKnJ2() {
    Leg leg = new Leg("12345", new Location("", ""), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 1, 13, 0));
    String expected = "";
    String actual = leg.getFrom();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullFromLocation_kXCT2() {
    Location to = new Location("to", "To Location");
    Leg leg = new Leg("voyageNumber", null, to, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(null, leg.getFrom());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullLoadTime_XBJw4_fid1() {
    Location from = new Location("from", "From Location");
    Location to = new Location("to", "To Location");
    Leg leg = new Leg("voyageNumber", from, to, LocalDateTime.now(), null);
    assertEquals("to", leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullTo_xmxr3_fid1() {
    Leg leg = new Leg("V123", new Location("USCHI", "Chicago"), null, LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 2, 10, 0));
    String expected = "Leg{voyageNumber=V123, from=USCHI, to=null, loadTime=2022-01-01T10:00, unloadTime=2022-01-02T10:00}";
    assertEquals(expected, leg.getFrom());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToNameWithNullTo_cFcm1_fid1() {
    Leg leg = new Leg("voyage1", new Location("USCHI", "Chicago"), null, LocalDateTime.now(), LocalDateTime.now());
    assertNull(leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFrom_ValidInput_cOXX0_fid1() {
    Leg leg = new Leg("12345", new Location("Chicago (USCHI)", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 1, 13, 0));
    String expected = "Chicago (USCHI)";
    String actual = leg.getFrom();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFrom_NullInput_ROpl1_fid1() {
    Leg leg = new Leg("12345", null, new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 1, 13, 0));
    String expected = "USNYC";
    String actual = leg.getFrom();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoadTime_ZNnZ0_NOAe0() {
    Leg leg = new Leg("voyage1", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), LocalDateTime.of(2022, 1, 1, 12, 0));
    assertEquals(LocalDateTime.of(2022, 1, 1, 10, 0), leg.getLoadTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoadTimeWithNullUnloadTime_Fvzd2_Oftg0() {
    Leg leg = new Leg("voyage1", new Location("USCHI", "Chicago"), new Location("USNYC", "New York"), LocalDateTime.of(2022, 1, 1, 10, 0), null);
    assertEquals(LocalDateTime.of(2022, 1, 1, 10, 0), leg.getLoadTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnloadTime_EJBL0_Gppk0() {
    Location from = new Location("USCHI", "Chicago");
    Location to = new Location("USNYC", "New York");
    Leg leg = new Leg("V123", from, to, LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 2, 12, 0));
    assertEquals(LocalDateTime.of(2022, 1, 2, 12, 0), leg.getUnloadTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullFrom_kSYr1_AlNV0() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), new Location("unLocode", "name"), LocalDateTime.now(), LocalDateTime.now());
    assertEquals(null, leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullTo_ApZS2_CLPZ0() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), null, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(null, leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullLoadTime_tbql3_Sujk0() {
    Location from = new Location("unLocode", "name");
    Location to = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", from, to, null, LocalDateTime.now());
    assertNotNull(leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullUnloadTime_sQOG4_FQHp0() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), new Location("unLocode", "name"), LocalDateTime.now(), null);
    assertNotNull(leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullVoyageNumber_Huzy3_AVWm0() {
    Location from = new Location("from", "From Location");
    Location to = new Location("to", "To Location");
    Leg leg = new Leg(null, from, to, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(null, leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullFromLocation_kXCT2_fid2() {
    Location to = new Location("to", "To Location");
    Leg leg = new Leg("voyageNumber", null, to, LocalDateTime.now(), LocalDateTime.now());
    assertNull(leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetToUnLocodeWithNullVoyageNumber_Huzy3_fid2() {
    Location from = new Location("from", "From Location");
    Location to = new Location("to", "To Location");
    Leg leg = new Leg(null, from, to, LocalDateTime.now(), LocalDateTime.now());
    assertNull(leg.getToUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullFrom_kSYr1_AlNV0_fid2() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), new Location("unLocode", "name"), LocalDateTime.now(), LocalDateTime.now());
    assertNull(leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullTo_ApZS2_CLPZ0_fid2() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), null, LocalDateTime.now(), LocalDateTime.now());
    assertNull(leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullLoadTime_tbql3_Sujk0_fid2() {
    Location from = new Location("unLocode", "name");
    Location to = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", from, to, null, LocalDateTime.now());
    assertNull(leg.getFromUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFromUnLocodeWithNullUnloadTime_sQOG4_FQHp0_fid2() {
    Leg leg = new Leg("voyageNumber", new Location("unLocode", "name"), new Location("unLocode", "name"), LocalDateTime.now(), null);
    assertNull(leg.getFromUnLocode());
  }
}