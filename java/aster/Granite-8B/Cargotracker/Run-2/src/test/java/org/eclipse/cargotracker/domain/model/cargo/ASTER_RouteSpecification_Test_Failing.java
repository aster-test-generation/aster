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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RouteSpecification_Test_Failing {
  private UnLocode mockUnLocode;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SWcY0_GJum0() {
    RouteSpecification routeSpecification = new RouteSpecification(new Location(new UnLocode("US"), "New York"), new Location(new UnLocode("US"), "Los Angeles"), LocalDate.now().plusDays(7));
    assertEquals(173552774, routeSpecification.hashCode());
  }
}