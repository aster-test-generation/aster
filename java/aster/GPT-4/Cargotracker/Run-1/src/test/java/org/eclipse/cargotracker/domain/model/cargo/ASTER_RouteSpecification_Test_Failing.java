/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RouteSpecification_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_LrzH0() throws Exception {
    LocalDate arrivalDeadline = LocalDate.of(2023, 10, 1);
    UnLocode unLocode = new UnLocode(); // Create UnLocode instance for Location constructor
    Location origin = Mockito.spy(new Location(unLocode, "Origin")); // Use Location constructor with parameters
    Location destination = Mockito.spy(new Location(unLocode, "Destination")); // Use Location constructor with parameters
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Mockito.when(origin.hashCode()).thenReturn(123);
    Mockito.when(destination.hashCode()).thenReturn(456);
    int expectedHashCode = new org.apache.commons.lang3.builder.HashCodeBuilder()
            .append(123)  // mocked origin hash code
            .append(456)  // mocked destination hash code
            .append(arrivalDeadline.hashCode())
            .toHashCode();
    Assertions.assertEquals(expectedHashCode, routeSpecification.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_LrzH0_fid2() throws Exception {
    LocalDate arrivalDeadline = LocalDate.of(2023, 10, 1);
    UnLocode unLocode = new UnLocode("UNL123"); // Create UnLocode instance with a code for Location constructor
    Location origin = Mockito.spy(new Location(unLocode, "Origin")); // Use Location constructor with parameters
    Location destination = Mockito.spy(new Location(unLocode, "Destination")); // Use Location constructor with parameters
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Mockito.when(origin.hashCode()).thenReturn(123);
    Mockito.when(destination.hashCode()).thenReturn(456);
    int expectedHashCode = new org.apache.commons.lang3.builder.HashCodeBuilder()
            .append(123)  // mocked origin hash code
            .append(456)  // mocked destination hash code
            .append(arrivalDeadline.hashCode())
            .toHashCode();
    Assertions.assertEquals(expectedHashCode, routeSpecification.hashCode());
  }
}