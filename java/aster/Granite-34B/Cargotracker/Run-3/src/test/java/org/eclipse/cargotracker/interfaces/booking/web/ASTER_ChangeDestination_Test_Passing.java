/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeDestination_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargo_WMBh0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    CargoRoute cargoRoute = changeDestination.getCargo();
    Assertions.assertNotNull(cargoRoute);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getTrackingId_ucYU0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String trackingId = changeDestination.getTrackingId();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDestinationUnlocodeTest_uPoz0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = "destinationUnlocode";
    String actual = changeDestination.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocode_fher0() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = "ABC";
    changeDestination.setDestinationUnlocode(expected);
    String actual = changeDestination.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeNull_Rykw1() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = null;
    changeDestination.setDestinationUnlocode(expected);
    String actual = changeDestination.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDestinationUnlocodeEmpty_cQdz2() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    String expected = "";
    changeDestination.setDestinationUnlocode(expected);
    String actual = changeDestination.getDestinationUnlocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getLocations_returnsNonEmptyList_TECY0_1() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    List<Location> locations = changeDestination.getLocations();
    assertNotNull(locations);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getLocations_returnsCorrectLocations_mygq1_1() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    List<Location> locations = changeDestination.getLocations();
    assertEquals(3, locations.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getLocations_returnsCorrectLocations_mygq1_2() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    List<Location> locations = changeDestination.getLocations();
    assertEquals("Location1", locations.get(0).getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getLocations_returnsCorrectLocations_mygq1_3() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    List<Location> locations = changeDestination.getLocations();
    assertEquals("Location2", locations.get(1).getName());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getLocations_returnsCorrectLocations_mygq1_4() throws Exception {
    ChangeDestination changeDestination = new ChangeDestination();
    List<Location> locations = changeDestination.getLocations();
    assertEquals("Location3", locations.get(2).getName());
  }
}