/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Cargo_Test_Failing {
@Mock
    private TrackingId trackingId;
@Mock
    private RouteSpecification routeSpecification;
@Mock
    private Delivery delivery;
private Itinerary itinerary;
private Cargo cargo;
@Mock
    private HandlingHistory handlingHistory;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_1() {
        trackingId = Mockito.mock(TrackingId.class);
        routeSpecification = Mockito.mock(RouteSpecification.class);
        cargo = new Cargo(trackingId, routeSpecification);
        Cargo sameCargo = new Cargo(trackingId, routeSpecification);
        Cargo differentTrackingId = new Cargo(Mockito.mock(TrackingId.class), routeSpecification);
        Cargo differentRouteSpecification = new Cargo(trackingId, Mockito.mock(RouteSpecification.class));
        Cargo nullObject = null;
        assertEquals(cargo, sameCargo);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString() {
        cargo = new Cargo(trackingId, new RouteSpecification());
        // Arrange
        String expected = "TrackingId [id=" + "someId" + "]";
        // Act
        String actual = cargo.toString();
        // Assert
        Mockito.verify(trackingId).toString();
        assertEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTrackingId() {
        cargo = new Cargo(trackingId, routeSpecification);
        // Arrange
        String expectedTrackingId = "expectedTrackingId";
        // Act
        TrackingId actualTrackingId = cargo.getTrackingId();
        // Assert
        assertEquals(expectedTrackingId, actualTrackingId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode() {
        cargo = new Cargo(trackingId, routeSpecification);
        // Arrange
        int expectedHashCode = 1; // Replace with actual expected hash code
        // Act
        int actualHashCode = cargo.hashCode();
        // Assert
        assertEquals(expectedHashCode, actualHashCode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRouteSpecification_GsgW0_lKDZ0() {
    TrackingId trackingId = new TrackingId("123");
    UnLocode unLocode = new UnLocode("DE FRK");
    Location origin = new Location(unLocode, "Frankfurt");
    Location destination = new Location(unLocode, "Berlin");
    java.time.LocalDate arrivalDeadline = java.time.LocalDate.of(2022, 1, 1);
    RouteSpecification routeSpecification = new RouteSpecification(origin, destination, arrivalDeadline);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    assertEquals(routeSpecification, cargo.getRouteSpecification());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrigin_CQWB1() {
    Location origin = Mockito.mock(Location.class);
    Cargo cargo = new Cargo(null, null);
    cargo.setOrigin(origin);
    Location actualOrigin = cargo.getOrigin();
    Mockito.verify(cargo).getOrigin();
    assertEquals(origin, actualOrigin);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrigin_aqqo0_WXkq0_1() {
    TrackingId trackingId = new TrackingId("id");
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location originLocation = new Location(unLocode, "name");
    Location destinationLocation = new Location(unLocode, "name");
    RouteSpecification routeSpecification = new RouteSpecification(originLocation, destinationLocation, null);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Location origin = cargo.getOrigin();
    assertEquals(originLocation, origin);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrigin_aqqo0_WXkq0_2() {
    TrackingId trackingId = new TrackingId("id");
    UnLocode unLocode = new UnLocode("countryAndLocation");
    Location originLocation = new Location(unLocode, "name");
    Location destinationLocation = new Location(unLocode, "name");
    RouteSpecification routeSpecification = new RouteSpecification(originLocation, destinationLocation, null);
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    Location origin = cargo.getOrigin();
    assertEquals(originLocation.getName(), origin.getName());}
@Test
@Timeout(value =129224406, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_fid1() {
        cargo = new Cargo(trackingId, routeSpecification);
        // Arrange
        int expectedHashCode =129224406; // Replace with actual expected hash code
        // Act
        int actualHashCode = cargo.hashCode();
        // Assert
        assertEquals(expectedHashCode, actualHashCode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() {
        trackingId = Mockito.mock(TrackingId.class);
        routeSpecification = Mockito.mock(RouteSpecification.class);
        cargo = new Cargo(trackingId, routeSpecification);
        Cargo sameCargo = new Cargo(trackingId, routeSpecification);
        assertEquals(cargo, sameCargo);
        Cargo differentTrackingId = new Cargo(Mockito.mock(TrackingId.class), routeSpecification);
        assertNotEquals(cargo, differentTrackingId);
        Cargo differentRouteSpecification = new Cargo(trackingId, Mockito.mock(RouteSpecification.class));
        assertNotEquals(cargo, differentRouteSpecification);
        Cargo nullObject = null;
        assertNotEquals(cargo, nullObject);
    }
}