/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargoTrackingIdFound_mVcc0() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("testTrackingId");
    List<Itinerary> possibleRoutes = defaultBookingService.requestPossibleRoutesForCargo(trackingId);
    assertNotNull(possibleRoutes);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargoTrackingIdNotFound_leSq1() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("testTrackingId");
    List<Itinerary> possibleRoutes = defaultBookingService.requestPossibleRoutesForCargo(trackingId);
    assertEquals(0, possibleRoutes.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_mQIF0() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("123");
    UnLocode unLocode = new UnLocode("DE FRA");
    defaultBookingService.changeDestination(trackingId, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithNullTrackingId_lZWj1() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode unLocode = new UnLocode("DE FRA");
    defaultBookingService.changeDestination(null, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithNullUnLocode_Yjiv2() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("123");
    defaultBookingService.changeDestination(trackingId, null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithInvalidTrackingId_lGQM3() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("InvalidId");
    UnLocode unLocode = new UnLocode("DE FRA");
    defaultBookingService.changeDestination(trackingId, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestinationWithInvalidUnLocode_ouVL4() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("123");
    UnLocode unLocode = new UnLocode("InvalidLocode");
    defaultBookingService.changeDestination(trackingId, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_WithValidInput_pukn0() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("US LAX");
    UnLocode destinationUnLocode = new UnLocode("US JFK");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_WithNullOriginUnLocode_dYdq1() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode destinationUnLocode = new UnLocode("US JFK");
    LocalDate arrivalDeadline = LocalDate.now();
    try {
      defaultBookingService.bookNewCargo(null, destinationUnLocode, arrivalDeadline);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_WithNullDestinationUnLocode_cbez2() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("US LAX");
    LocalDate arrivalDeadline = LocalDate.now();
    try {
      defaultBookingService.bookNewCargo(originUnLocode, null, arrivalDeadline);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_WithNullArrivalDeadline_bTll3() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("US LAX");
    UnLocode destinationUnLocode = new UnLocode("US JFK");
    try {
      defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_WithInvalidOriginUnLocode_LwJy4() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("Invalid UnLocode");
    UnLocode destinationUnLocode = new UnLocode("US JFK");
    LocalDate arrivalDeadline = LocalDate.now();
    try {
      defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
      fail("Expected exception");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_WithInvalidDestinationUnLocode_fpAn5() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("US LAX");
    UnLocode destinationUnLocode = new UnLocode("Invalid UnLocode");
    LocalDate arrivalDeadline = LocalDate.now();
    try {
      defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
      fail("Expected exception");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_WithInvalidArrivalDeadline_FsQf6() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("US LAX");
    UnLocode destinationUnLocode = new UnLocode("US JFK");
    LocalDate arrivalDeadline = null;
    try {
      defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
      fail("Expected exception");
    } catch (Exception e) {
    }
  }
}