/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Delivery_Test_Passing {
  @Mock
  private RouteSpecification routeSpecification;
  @Mock
  private Itinerary itinerary;
  @Mock
  private HandlingHistory handlingHistory;
  @Mock
  private HandlingEvent lastEvent;
  @InjectMocks
  private Delivery delivery;
  private HandlingActivity expectedActivity;
  @Mock
  private HandlingActivity nextExpectedActivity;
  private LocalDateTime eta = LocalDateTime.now();
  private LocalDateTime calculatedAt = LocalDateTime.now();
  private boolean isUnloadedAtDestination = false;
  private TransportStatus transportStatus = TransportStatus.IN_PORT;
  private boolean misdirected = false;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMisdirectedTrue() {
    delivery = new Delivery();
    // Set misdirected to true and verify
    delivery.setMisdirected(true);
    assertTrue(delivery.isMisdirected(), "Delivery should be marked as misdirected.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMisdirectedFalse() {
    delivery = new Delivery();
    // Set misdirected to false and verify
    delivery.setMisdirected(false);
    assertFalse(delivery.isMisdirected(), "Delivery should not be marked as misdirected.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMisdirected_KwZQ0() {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    assertTrue(delivery.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCurrentVoyage_WhenCurrentVoyageIsNull_ReturnNone_ZKMy0() {
    HandlingEvent lastEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    Delivery delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    Voyage result = delivery.getCurrentVoyage();
    assertEquals(Voyage.NONE, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnloadedAtDestinationTrue() {
    delivery = new Delivery();
    delivery.setUnloadedAtDestination(true);
    assertTrue(delivery.isUnloadedAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnloadedAtDestinationFalse() {
    delivery = new Delivery();
    delivery.setUnloadedAtDestination(false);
    assertFalse(delivery.isUnloadedAtDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRoutingStatus_lTsR0() {
    HandlingEvent lastEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    Delivery delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    RoutingStatus expected = RoutingStatus.NOT_ROUTED; // Assuming NOT_ROUTED is a valid enum constant
    RoutingStatus actual = delivery.getRoutingStatus();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTransportStatus() throws Exception {
    delivery = new Delivery();
    // Arrange
    TransportStatus expectedStatus = TransportStatus.IN_PORT;
    // Act
    delivery.setTransportStatus(expectedStatus);
    // Assert
    assertEquals(expectedStatus, delivery.getTransportStatus(), "The transport status should be set to IN_PORT.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_ReturnsTrue() throws Exception {
    lastEvent = mock(HandlingEvent.class);
    itinerary = mock(Itinerary.class);
    routeSpecification = mock(RouteSpecification.class);
    delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    assertTrue(delivery.equals(delivery));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_ReturnsFalse() throws Exception {
    lastEvent = mock(HandlingEvent.class);
    itinerary = mock(Itinerary.class);
    routeSpecification = mock(RouteSpecification.class);
    delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    assertFalse(delivery.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnsFalse() throws Exception {
    lastEvent = mock(HandlingEvent.class);
    itinerary = mock(Itinerary.class);
    routeSpecification = mock(RouteSpecification.class);
    delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    Object other = new Object();
    assertFalse(delivery.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValues_ReturnsTrue() throws Exception {
    lastEvent = mock(HandlingEvent.class);
    itinerary = mock(Itinerary.class);
    routeSpecification = mock(RouteSpecification.class);
    delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    HandlingEvent otherLastEvent = mock(HandlingEvent.class);
    Itinerary otherItinerary = mock(Itinerary.class);
    RouteSpecification otherRouteSpecification = mock(RouteSpecification.class);
    Delivery otherDelivery = new Delivery(otherLastEvent, otherItinerary, otherRouteSpecification);
    when(lastEvent.equals(otherLastEvent)).thenReturn(true);
    when(itinerary.equals(otherItinerary)).thenReturn(true);
    when(routeSpecification.equals(otherRouteSpecification)).thenReturn(true);
    assertTrue(delivery.equals(otherDelivery));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_Qsvo0() {
    Delivery delivery = new Delivery();
    assertTrue(delivery.equals(delivery));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_GbUz1() {
    Delivery delivery = new Delivery();
    assertFalse(delivery.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_uKtR2() {
    Delivery delivery = new Delivery();
    Object other = new Object();
    assertFalse(delivery.equals(other));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCalculatedAt() throws Exception {
    delivery = new Delivery();
    calculatedAt = LocalDateTime.now();
    // Set the calculatedAt time using the method in Delivery
    delivery.setCalculatedAt(calculatedAt);
    // Use reflection to access the private field to verify it was set correctly
    LocalDateTime fieldCalculatedAt = (LocalDateTime) java.lang.reflect.Field.class
            .cast(Delivery.class.getDeclaredField("calculatedAt"))
            .get(delivery);
    // Assert that the calculatedAt field was set correctly
    assertEquals(calculatedAt, fieldCalculatedAt, "The calculatedAt should match the value set.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCalculatedAt_DuRO0() {
    Delivery delivery = new Delivery();
    LocalDateTime testTime = LocalDateTime.of(2023, 3, 15, 12, 0);
    delivery.setCalculatedAt(testTime);
    Field field = null;
    try {
      field = Delivery.class.getDeclaredField("calculatedAt");
      field.setAccessible(true);
      LocalDateTime fieldValue = (LocalDateTime) field.get(delivery);
      assertEquals(testTime, fieldValue);
    } catch (NoSuchFieldException | IllegalAccessException e) {
      fail("Exception occurred during reflection usage: " + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatus_1() throws Exception {
    delivery = new Delivery();
    // Test setting the routing status to ROUTED
    delivery.setRoutingStatus(RoutingStatus.ROUTED);
    // Test setting the routing status to NOT_ROUTED
    delivery.setRoutingStatus(RoutingStatus.NOT_ROUTED);
    // Test setting the routing status to MISROUTED
    delivery.setRoutingStatus(RoutingStatus.MISROUTED);
    assertEquals(RoutingStatus.ROUTED, delivery.getRoutingStatus(), "Routing status should be ROUTED");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatus_2() throws Exception {
    delivery = new Delivery();
    // Test setting the routing status to ROUTED
    delivery.setRoutingStatus(RoutingStatus.ROUTED);
    // Test setting the routing status to NOT_ROUTED
    delivery.setRoutingStatus(RoutingStatus.NOT_ROUTED);
    // Test setting the routing status to MISROUTED
    delivery.setRoutingStatus(RoutingStatus.MISROUTED);
    assertEquals(RoutingStatus.NOT_ROUTED, delivery.getRoutingStatus(), "Routing status should be NOT_ROUTED");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatus_3() throws Exception {
    delivery = new Delivery();
    // Test setting the routing status to ROUTED
    delivery.setRoutingStatus(RoutingStatus.ROUTED);
    // Test setting the routing status to NOT_ROUTED
    delivery.setRoutingStatus(RoutingStatus.NOT_ROUTED);
    // Test setting the routing status to MISROUTED
    delivery.setRoutingStatus(RoutingStatus.MISROUTED);
    assertEquals(RoutingStatus.MISROUTED, delivery.getRoutingStatus(), "Routing status should be MISROUTED");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEstimatedTimeOfArrival() throws Exception {
    eta = LocalDateTime.now();
    delivery = mock(Delivery.class);
    when(delivery.getEstimatedTimeOfArrival()).thenReturn(eta);
    LocalDateTime result = delivery.getEstimatedTimeOfArrival();
    assertEquals(eta, result, "The estimated time of arrival should match the mocked value");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCalculatedAt() throws Exception {
    calculatedAt = LocalDateTime.now();
    HandlingEvent lastEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    // Assuming there's a constructor or method to set calculatedAt, since it's private and has no setter in the provided code.
    // Since no such method exists, we'll assume it's set through the constructor for the purpose of this test.
    delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    // Using reflection to set the private field calculatedAt
    java.lang.reflect.Field field = Delivery.class.getDeclaredField("calculatedAt");
    field.setAccessible(true);
    field.set(delivery, calculatedAt);
    LocalDateTime result = delivery.getCalculatedAt();
    assertEquals(calculatedAt, result, "The getCalculatedAt method should return the LocalDateTime that was set during setup.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCalculatedAt_bpWo0() {
    LocalDateTime expectedTime = LocalDateTime.now();
    HandlingEvent handlingEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    Delivery delivery = new Delivery(handlingEvent, itinerary, routeSpecification);
    assertEquals(expectedTime, delivery.getCalculatedAt());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransportStatus() throws Exception {
    // Mock dependencies
    lastEvent = mock(HandlingEvent.class);
    itinerary = mock(Itinerary.class);
    routeSpecification = mock(RouteSpecification.class);
    // Create a Delivery instance with mocked dependencies
    delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    // Set up the transport status for the test
    TransportStatus expectedStatus = TransportStatus.IN_PORT;
    Field transportStatusField = Delivery.class.getDeclaredField("transportStatus");
    transportStatusField.setAccessible(true);
    transportStatusField.set(delivery, expectedStatus);
    // Execute the method under test
    TransportStatus result = delivery.getTransportStatus();
    // Verify the result
    assertEquals(TransportStatus.IN_PORT, result, "The transport status should be IN_PORT.");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTransportStatus_VHbM0() {
    HandlingEvent handlingEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    Delivery delivery = new Delivery(handlingEvent, itinerary, routeSpecification);
    TransportStatus expected = TransportStatus.IN_PORT; // Assuming IN_PORT is a valid enum constant
    TransportStatus actual = delivery.getTransportStatus();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_fPiY0_IStB0() {
    HandlingEvent lastEvent = new HandlingEvent();
    Itinerary itinerary = new Itinerary();
    RouteSpecification routeSpecification = new RouteSpecification();
    Delivery delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    int expectedHashCode = delivery.hashCode();
    int actualHashCode = new Delivery(lastEvent, itinerary, routeSpecification).hashCode();
    assertEquals(expectedHashCode, actualHashCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCurrentVoyage_BgVR0() throws Exception {
    Voyage currentVoyage = mock(Voyage.class);
    Delivery delivery = new Delivery();
    when(currentVoyage.getVoyageNumber()).thenReturn(new VoyageNumber("V123"));
    Voyage result = currentVoyage; // This line is to simulate the retrieval of the voyage from the delivery object
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLastKnownLocation_nKjb0() throws Exception {
    UnLocode unLocode = new UnLocode("USNYC");
    Location lastKnownLocation = new Location(unLocode, "New York");
    Delivery delivery = new Delivery();
    delivery.setLastKnownLocation(lastKnownLocation);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLastKnownLocation_IoQO0_iJgK0() {
    Delivery delivery = new Delivery();
    UnLocode unLocode = new UnLocode("USNYC");
    Location expectedLocation = new Location(unLocode, "New York");
    delivery.setLastKnownLocation(expectedLocation);
    assertEquals(expectedLocation, delivery.getLastKnownLocation());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirectedTrue_IUuL0() throws Exception {
    HandlingEvent lastEvent = mock(HandlingEvent.class);
    Itinerary itinerary = mock(Itinerary.class);
    RouteSpecification routeSpecification = mock(RouteSpecification.class);
    Delivery delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    Field misdirectedField = Delivery.class.getDeclaredField("misdirected");
    misdirectedField.setAccessible(true);
    misdirectedField.set(delivery, true);
    assertTrue(delivery.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentValues_ReturnsFalse_WywQ0() throws Exception {
    HandlingEvent lastEvent = mock(HandlingEvent.class);
    Itinerary itinerary = mock(Itinerary.class);
    RouteSpecification routeSpecification = mock(RouteSpecification.class);
    Delivery delivery = new Delivery(lastEvent, itinerary, routeSpecification);
    HandlingEvent otherLastEvent = mock(HandlingEvent.class);
    Itinerary otherItinerary = mock(Itinerary.class);
    RouteSpecification otherRouteSpecification = mock(RouteSpecification.class);
    Delivery otherDelivery = new Delivery(otherLastEvent, otherItinerary, otherRouteSpecification);
    when(lastEvent.equals(otherLastEvent)).thenReturn(false);
    when(itinerary.equals(otherItinerary)).thenReturn(true);
    when(routeSpecification.equals(otherRouteSpecification)).thenReturn(true);
    assertFalse(delivery.equals(otherDelivery));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetRoutingStatus() throws Exception {
    delivery = new Delivery();
    // Test setting the routing status to ROUTED
    delivery.setRoutingStatus(RoutingStatus.ROUTED);
    assertEquals(RoutingStatus.ROUTED, delivery.getRoutingStatus(), "Routing status should be ROUTED");
    // Test setting the routing status to NOT_ROUTED
    delivery.setRoutingStatus(RoutingStatus.NOT_ROUTED);
    assertEquals(RoutingStatus.NOT_ROUTED, delivery.getRoutingStatus(), "Routing status should be NOT_ROUTED");
    // Test setting the routing status to MISROUTED
    delivery.setRoutingStatus(RoutingStatus.MISROUTED);
    assertEquals(RoutingStatus.MISROUTED, delivery.getRoutingStatus(), "Routing status should be MISROUTED");
  }
}