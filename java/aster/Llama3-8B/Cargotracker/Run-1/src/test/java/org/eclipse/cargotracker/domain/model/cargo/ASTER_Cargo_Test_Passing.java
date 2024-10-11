/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Cargo_Test_Passing {
  @Mock
  private TrackingId trackingId;
  @Mock
  private RouteSpecification routeSpecification;
  Cargo cargo;
  @Mock
  private Delivery delivery;
  @Mock
  private Itinerary itinerary;
  @Mock
  private HandlingHistory handlingHistory;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_2() throws Exception {
    cargo = new Cargo(trackingId, routeSpecification);
    // Create another Cargo object with the same attributes
    Cargo anotherCargo = new Cargo(trackingId, routeSpecification);
    // Assert that the two objects are equal
    // Create another Cargo object with different attributes
    TrackingId differentTrackingId = Mockito.mock(TrackingId.class);
    RouteSpecification differentRouteSpecification = Mockito.mock(RouteSpecification.class);
    Cargo differentCargo = new Cargo(differentTrackingId, differentRouteSpecification);
    // Assert that the two objects are not equal
    assertNotEquals(cargo, differentCargo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId() {
    cargo = new Cargo(trackingId, new RouteSpecification());
    // Arrange
    // No need to arrange as we are mocking the trackingId
    // Act
    TrackingId result = cargo.getTrackingId();
    // Assert
    Assertions.assertEquals(trackingId, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRouteSpecification() {
    cargo = new Cargo(new TrackingId("id"), routeSpecification);
    // Act
    RouteSpecification result = cargo.getRouteSpecification();
    // Assert
    Assertions.assertEquals(routeSpecification, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_fid1() {
    cargo = new Cargo(trackingId, new RouteSpecification());
    // Arrange
    String expected = "trackingId";
    // Act
    String actual = cargo.toString();
    // Assert
    assertEquals(expected, actual);
  }
}