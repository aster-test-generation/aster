/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
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
  public void testGetOrigin_ValidInput_BAig0_vxWK0() {
    Location origin = new Location(new UnLocode("USNYC"), "New York");
    Location destination = new Location(new UnLocode("USLAX"), "Los Angeles");
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    assertEquals(origin, routeSpecification.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOrigin_NullOrigin_TKfQ1_UCzv0() {
    Location destination = new Location(new UnLocode("USLAX"), "Los Angeles");
    LocalDate arrivalDeadline = LocalDate.of(2023, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(new Location(new UnLocode("USNYC"), "New York"), destination, arrivalDeadline);
    assertNotNull(routeSpecification.getOrigin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_lbkt0_TDUn0() {
    RouteSpecification routeSpecification = new RouteSpecification(new Location(new UnLocode("USNYC"), "New York"), new Location(new UnLocode("USLAX"), "Los Angeles"), LocalDate.of(2022, 12, 25));
    assertTrue(routeSpecification.equals(routeSpecification));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetDestinationWithValidOriginAndInvalidDestination_zzso7_dQRA0() {
    Location origin = new Location(new UnLocode("USNYC"), "New York City");
    Location destination = new Location(new UnLocode("USLAX"), "Los Angeles");
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, LocalDate.now());
    Location actualDestination = routeSpecification.getDestination();
  }
}