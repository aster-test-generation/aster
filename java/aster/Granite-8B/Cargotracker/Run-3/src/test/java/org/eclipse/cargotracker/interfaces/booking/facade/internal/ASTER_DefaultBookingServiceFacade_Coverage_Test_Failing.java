/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingServiceFacade_Coverage_Test_Failing {
  private DefaultBookingServiceFacade defaultBookingServiceFacade;
  private Cargo cargo;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadCargoForRouting_jOnm0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    CargoRoute result = bookingServiceFacade.loadCargoForRouting("cargoId");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLoadCargoForRouting2_tHOz1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    CargoRoute result = bookingServiceFacade.loadCargoForRouting("cargoId2");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_CeGa0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = bookingServiceFacade.bookNewCargo("DEHAM", "NLRTM", LocalDate.now().plusDays(10));
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargoWithInvalidOrigin_mqTJ1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = bookingServiceFacade.bookNewCargo("invalidOrigin", "NLRTM", LocalDate.now().plusDays(10));
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargoWithInvalidDestination_wfdW2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    String trackingId = bookingServiceFacade.bookNewCargo("DEHAM", "invalidDestination", LocalDate.now().plusDays(10));
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds1_BNhX0_1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> trackingIds = bookingServiceFacade.listAllTrackingIds();
    assertNotNull(trackingIds);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds1_BNhX0_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> trackingIds = bookingServiceFacade.listAllTrackingIds();
    assertTrue(trackingIds.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_RkOI0_1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_RkOI0_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(0, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo2_VTii1_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(1, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo3_cgEQ2_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(2, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo4_qIiJ3_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(3, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo5_qUKi4_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(4, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo6_aFVq5_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(5, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo7_ycMG6_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(6, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo8_HLdC7_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(7, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo9_YuLR8_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(8, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo10_JZll9_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(9, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo11_GnKl10_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(10, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo12_vvCR11_2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertEquals(11, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testListAllTrackingIds1_BNhX0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<String> trackingIds = bookingServiceFacade.listAllTrackingIds();
    assertNotNull(trackingIds);
    assertTrue(trackingIds.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo_RkOI0() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(0, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo2_VTii1() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(1, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo3_cgEQ2() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(2, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo4_qIiJ3() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(3, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo5_qUKi4() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(4, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo6_aFVq5() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(5, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo7_ycMG6() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(6, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo8_HLdC7() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(7, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo9_YuLR8() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(8, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo10_JZll9() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(9, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo11_GnKl10() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(10, routeCandidates.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRequestPossibleRoutesForCargo12_vvCR11() {
    DefaultBookingServiceFacade bookingServiceFacade = new DefaultBookingServiceFacade();
    List<RouteCandidate> routeCandidates = bookingServiceFacade.requestPossibleRoutesForCargo("1234567890");
    assertNotNull(routeCandidates);
    assertEquals(11, routeCandidates.size());
  }
}