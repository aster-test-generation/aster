/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CarrierMovement_Test_Failing {
  private LocalDateTime departureTime;
  CarrierMovement carriermovement;
  private LocalDateTime arrivalTime;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime5_vYYT4() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), null, LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime6_OCzi5() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), null, LocalDateTime.now(), null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime7_HhUh6() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), null, null, LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime8_tFqb7() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), null, null, null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime9_WoLf8() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("countryAndLocation"), "name"), LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime10_JivA9() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("countryAndLocation"), "name"), LocalDateTime.now(), null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime11_rMUi10() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("countryAndLocation"), "name"), null, LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime12_ZISK11() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("countryAndLocation"), "name"), null, null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime13_PlFJ12() {
    CarrierMovement carrierMovement = new CarrierMovement(null, null, LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime2_AmMO1() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "name"), new Location(new UnLocode("countryAndLocation"), "name"), LocalDateTime.now(), null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getDepartureTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime3_GUuC2() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "name"), new Location(new UnLocode("USLAX"), "name"), null, LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime4_TuLJ3() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "name"), new Location(new UnLocode("USLAX"), "name"), null, null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime5_vYYT4_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "name"), null, LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getDepartureTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime6_OCzi5_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "name"), null, LocalDateTime.now(), null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime7_HhUh6_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "name"), null, null, LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime8_tFqb7_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("USNYC"), "name"), null, null, null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime9_WoLf8_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("USNYC"), "name"), LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getDepartureTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime10_JivA9_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("USNYC"), "name"), LocalDateTime.now(), null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime11_rMUi10_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("USNYC"), "name"), null, LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime12_ZISK11_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(null, new Location(new UnLocode("USNYC"), "name"), null, null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime13_PlFJ12_fid1() {
    CarrierMovement carrierMovement = new CarrierMovement(null, null, LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertNotNull(actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetDepartureTime_kiTz0() throws Exception {
    Location departureLocation = new Location(new UnLocode("USNYC"), "New York");
    Location arrivalLocation = new Location(new UnLocode("USDAL"), "Dallas");
    departureTime = LocalDateTime.of(2023, 1, 1, 10, 0);
    carriermovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, null);
    assertEquals(departureTime, carriermovement.getDepartureTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDepartureTime_returnsDepartureTime_MWVD0_LzNO0() {
    UnLocode unLocode = new UnLocode("NLRTM");
    Location arrivalLocation = new Location(unLocode, "Rotterdam, Netherlands");
    LocalDateTime departureTime = LocalDateTime.of(2022, 1, 1, 10, 0);
    CarrierMovement carrierMovement = new CarrierMovement(null, arrivalLocation, departureTime, null);
    LocalDateTime actualDepartureTime = carrierMovement.getDepartureTime();
    assertEquals(departureTime, actualDepartureTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDepartureTime_returnsNullWhenDepartureTimeNotSet_svBb1_arhr0() {
    Location departureLocation = new Location(new UnLocode("USCHI"), "Chicago, IL, US");
    Location arrivalLocation = new Location(new UnLocode("NLRTM"), "Rotterdam, Netherlands");
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, null, null);
    LocalDateTime actualDepartureTime = carrierMovement.getDepartureTime();
    assertNull(actualDepartureTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalLocationTest_rAQt0_dTZv0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    CarrierMovement carrierMovement = new CarrierMovement(location, location, null, null);
    assertEquals(location, carrierMovement.getArrivalLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalLocationTest_hyZX1_Tota0() {
    UnLocode unLocode = new UnLocode();
    Location location = new Location(unLocode, "");
    CarrierMovement carrierMovement = new CarrierMovement(location, location, null, null);
    assertEquals(location, carrierMovement.getArrivalLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalLocationTest_Ddwm2_XGFL0() {
    UnLocode unLocode = null;
    Location location = null;
    CarrierMovement carrierMovement = new CarrierMovement(location, location, null, null);
    assertEquals(location, carrierMovement.getArrivalLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalLocationTest_vXby3_bMJG0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location location = new Location(unLocode, "name");
    CarrierMovement carrierMovement = new CarrierMovement(location, location, LocalDateTime.now(), LocalDateTime.now());
    assertEquals(location, carrierMovement.getArrivalLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getDepartureLocation_qkjx0_Zboz0() {
    Location departureLocation = new Location(new UnLocode("USCHI"), "Chicago");
    Location arrivalLocation = new Location(new UnLocode("USEHEL"), "Houston");
    LocalDateTime departureTime = LocalDateTime.of(2022, 1, 1, 10, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2022, 1, 1, 12, 30);
    CarrierMovement carrierMovement = new CarrierMovement(departureLocation, arrivalLocation, departureTime, arrivalTime);
    Location actualDepartureLocation = carrierMovement.getDepartureLocation();
    assertEquals(departureLocation, actualDepartureLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getDepartureLocation_nullDepartureLocation_Dkms1_UEHq0() {
    UnLocode unLocode = new UnLocode("USEHEL");
    Location arrivalLocation = new Location(unLocode, "Houston");
    LocalDateTime departureTime = LocalDateTime.of(2022, 1, 1, 10, 0);
    LocalDateTime arrivalTime = LocalDateTime.of(2022, 1, 1, 12, 30);
    CarrierMovement carrierMovement = new CarrierMovement(null, arrivalLocation, departureTime, arrivalTime);
    Location actualDepartureLocation = carrierMovement.getDepartureLocation();
    assertEquals(null, actualDepartureLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime_Sdyq0_ARVC0() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), new Location(new UnLocode("countryAndLocation"), "name"), LocalDateTime.now(), LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime2_AmMO1_EvhK0() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), new Location(new UnLocode("countryAndLocation"), "name"), LocalDateTime.now(), null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime3_GUuC2_eoUW0() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), new Location(new UnLocode("countryAndLocation"), "name"), null, LocalDateTime.now());
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getArrivalTime4_TuLJ3_PLWQ0() {
    CarrierMovement carrierMovement = new CarrierMovement(new Location(new UnLocode("countryAndLocation"), "name"), new Location(new UnLocode("countryAndLocation"), "name"), null, null);
    LocalDateTime actual = carrierMovement.getArrivalTime();
    assertEquals(carrierMovement.getArrivalTime(), actual);
  }
}