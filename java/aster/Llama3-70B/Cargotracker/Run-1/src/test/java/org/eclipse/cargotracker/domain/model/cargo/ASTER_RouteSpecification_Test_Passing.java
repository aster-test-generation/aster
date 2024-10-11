/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RouteSpecification_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_ReturnTrue_ZTJO0() {
    RouteSpecification routeSpecification = new RouteSpecification();
    assertTrue(routeSpecification.equals(routeSpecification));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnFalse_ehXy1() {
    RouteSpecification routeSpecification = new RouteSpecification();
    assertFalse(routeSpecification.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnFalse_yMNY2() {
    RouteSpecification routeSpecification = new RouteSpecification();
    assertFalse(routeSpecification.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testisSatisfiedBy_ItineraryIsNull_lCOj0_fid2() throws Exception {
    UnLocode unLocodeOrigin = new UnLocode("USNYC"); // Changed to a valid UN/LOCODE
    Location origin = new Location(unLocodeOrigin, "originName");
    UnLocode unLocodeDestination = new UnLocode("USLAX"); // Changed to a valid UN/LOCODE
    Location destination = new Location(unLocodeDestination, "destinationName");
    LocalDate arrivalDeadline = LocalDate.now();
    RouteSpecification routespecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Itinerary itinerary = null;
    boolean result = routespecification.isSatisfiedBy(itinerary);
    assertFalse(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testhashCode_Vhkn0_fid2() throws Exception {
    LocalDate arrivalDeadline = LocalDate.now();
    UnLocode unLocodeOrigin = new UnLocode("USNYC"); // changed to a valid UN/LOCODE
    UnLocode unLocodeDestination = new UnLocode("USLAX"); // changed to a valid UN/LOCODE
    Location mockOrigin = new Location(unLocodeOrigin, "origin");
    Location mockDestination = new Location(unLocodeDestination, "destination");
    RouteSpecification routespecification;
    routespecification = new RouteSpecification(mockOrigin, mockDestination, arrivalDeadline);
    int hashCode = routespecification.hashCode();
    int expectedHashCode = new HashCodeBuilder().append(mockOrigin.hashCode()).append(mockDestination.hashCode()).append(arrivalDeadline.hashCode()).toHashCode();
    assertEquals(expectedHashCode, hashCode);
  }
}