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
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Leg_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFrom_FVyW0() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, location, LocalDateTime.now(), LocalDateTime.now());
    String result = leg.getFrom();
    assertEquals("Location{unLocode='unLocode', name='name'}", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode_Kxts0_SLtu0() {
    Location from = new Location("USNY", "New York");
    Leg leg = new Leg("001", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USNY";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode2_qEqE1_LBfh0() {
    Location from = new Location("USLA", "Los Angeles");
    Leg leg = new Leg("002", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USLA";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode3_IWJD2_BkjO0() {
    Location from = new Location("USCH", "Chicago");
    Leg leg = new Leg("003", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USCH";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode4_JOxp3_IbNQ0() {
    Location from = new Location("USMI", "Miami");
    Leg leg = new Leg("004", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USMI";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode5_GvRw4_dzyv0() {
    Location from = new Location("USDF", "New York");
    Leg leg = new Leg("005", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USDF";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode6_GfVI5_WFuW0() {
    Location from = new Location("USLC", "Los Angeles");
    Leg leg = new Leg("006", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USLC";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode7_mSWU6_FeFP0() {
    Location from = new Location("USCH", "Chicago");
    Leg leg = new Leg("007", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USCH";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode8_dhQh7_TsHl0() {
    Location from = new Location("USMI", "Miami");
    Leg leg = new Leg("008", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USMI";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode9_MLnA8_sagw0() {
    Location from = new Location("USDF", "New York");
    Leg leg = new Leg("009", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USDF";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode10_uSev9_erJO0() {
    Location from = new Location("USLC", "Los Angeles");
    Leg leg = new Leg("010", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USLC";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode11_MFwE10_bcde0() {
    Location from = new Location("USCH", "Chicago");
    Leg leg = new Leg("011", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USCH";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode12_ZQNc11_XUOF0() {
    Location from = new Location("USMI", "Miami");
    Leg leg = new Leg("012", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USMI";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetFromUnLocode13_EmJm12_ROUk0() {
    Location from = new Location("USDF", "New York");
    Leg leg = new Leg("013", from, null, null, null);
    String actual = leg.getFromUnLocode();
    String expected = "USDF";
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetToNameWithNullToLocation_FgYe1_Jgrg0() {
    Location location = new Location("unLocode", "name");
    Leg leg = new Leg("voyageNumber", location, null, LocalDateTime.now(), LocalDateTime.now());
    assertEquals("name", leg.getToName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoadTime_toMf0_VZyz0_fid2() {
    Location from = new Location("USNYC", "New York");
    Location to = new Location("USLAX", "Los Angeles");
    Leg leg = new Leg("001", from, to, LocalDateTime.of(2022, 1, 1, 12, 0), LocalDateTime.of(2022, 1, 1, 13, 0));
    String expected = "2022-01-01T12:00";
    String actual = leg.getLoadTime();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTo_YnyU0_XHAx0_fid2() {
    Location from = new Location("USNYC", "New York");
    Location to = new Location("USLAX", "Los Angeles");
    Leg leg = new Leg("001", from, to, LocalDateTime.now(), LocalDateTime.now().plusDays(1));
    assertEquals("Location{unLocode='USLAX', name='Los Angeles'}", leg.getTo());
  }
}