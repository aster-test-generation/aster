/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_vvfS0() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    defaultBookingServiceFacade.changeDestination(" trackingId", "USNYC");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination2_FsYW1() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    defaultBookingServiceFacade.changeDestination(" trackingId", "destinationUnLocode");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadlineWithNullTrackingId_gwKK1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    bookingServiceFacade.changeDeadline(null, LocalDate.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo1_wXVT0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "AUMEL";
    String destination = "CNSHA";
    LocalDate arrivalDeadline = LocalDate.of(2022, 5, 15);
    String result = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertEquals("ABC123", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo2_NQIN1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "AUMEL";
    String destination = "CNSHA";
    LocalDate arrivalDeadline = LocalDate.of(2022, 5, 15);
    String result = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotEquals("XYZ456", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo3_QnLN2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String origin = "AUMEL";
    String destination = "CNSHA";
    LocalDate arrivalDeadline = LocalDate.of(2022, 5, 15);
    String result = bookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAssignCargoToRouteWithNullRouteCandidate_Stzb1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdStr = "ABC123";
    RouteCandidate routeCandidateDTO = null;
    bookingServiceFacade.assignCargoToRoute(trackingIdStr, routeCandidateDTO);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds_1_XwvP0() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> trackingIds = defaultBookingServiceFacade.listAllTrackingIds();
    assertEquals(0, trackingIds.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_DNmG0_1() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdValue = "test";
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(trackingIdValue);
    assertEquals(cargoStatus.getTrackingId(), trackingIdValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_DNmG0_2() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdValue = "test";
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(trackingIdValue);
    assertEquals(cargoStatus.getDestination(), "test");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_DNmG0_3() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdValue = "test";
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(trackingIdValue);
    assertEquals(cargoStatus.getStatusText(), "test");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_DNmG0_4() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdValue = "test";
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(trackingIdValue);
    assertEquals(cargoStatus.getEta(), "test");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_DNmG0_5() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdValue = "test";
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(trackingIdValue);
    assertEquals(cargoStatus.getNextExpectedActivity(), "test");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_DNmG0_6() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdValue = "test";
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(trackingIdValue);
    assertEquals(cargoStatus.getEvents(), "test");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDeadline_PkQI0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    bookingServiceFacade.changeDeadline("123", LocalDate.now());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_DNmG0() {
    DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingIdValue = "test";
    CargoStatus cargoStatus = defaultBookingServiceFacade.loadCargoForTracking(trackingIdValue);
    assertEquals(cargoStatus.getTrackingId(), trackingIdValue);
    assertEquals(cargoStatus.getDestination(), "test");
    assertEquals(cargoStatus.getStatusText(), "test");
    assertEquals(cargoStatus.getEta(), "test");
    assertEquals(cargoStatus.getNextExpectedActivity(), "test");
    assertEquals(cargoStatus.getEvents(), "test");
  }
}