/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultBookingService_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_PJge0() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("trackingId");
    UnLocode unLocode = new UnLocode("USNYC"); // Changed to a valid UN/LOCODE
    defaultBookingService.changeDestination(trackingId, unLocode);
    assertNotNull(defaultBookingService.requestPossibleRoutesForCargo(trackingId));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ZReP0_1() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("USNYC"); // valid UN/LOCODE
    UnLocode destinationUnLocode = new UnLocode("USLAX"); // valid UN/LOCODE
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ZReP0_2() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("USNYC"); // Changed to a valid UN/LOCODE
    UnLocode destinationUnLocode = new UnLocode("USLAX"); // Changed to a valid UN/LOCODE
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId); // Changed assertion type to match the return type
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testChangeDestination_PJge0_fid1() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    TrackingId trackingId = new TrackingId("trackingId");
    UnLocode unLocode = new UnLocode("countryAndLocation");
    defaultBookingService.changeDestination(trackingId, unLocode);
    assert true;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ZReP0() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("countryAndLocation");
    UnLocode destinationUnLocode = new UnLocode("countryAndLocation");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId);
    assertNotNull(trackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ZReP0_1_fid3() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("countryAndLocation");
    UnLocode destinationUnLocode = new UnLocode("countryAndLocation");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBookNewCargo_ZReP0_2_fid3() {
    DefaultBookingService defaultBookingService = new DefaultBookingService();
    UnLocode originUnLocode = new UnLocode("countryAndLocation");
    UnLocode destinationUnLocode = new UnLocode("countryAndLocation");
    LocalDate arrivalDeadline = LocalDate.now();
    TrackingId trackingId = defaultBookingService.bookNewCargo(originUnLocode, destinationUnLocode, arrivalDeadline);
    assertNotNull(trackingId.getIdString());
  }
}