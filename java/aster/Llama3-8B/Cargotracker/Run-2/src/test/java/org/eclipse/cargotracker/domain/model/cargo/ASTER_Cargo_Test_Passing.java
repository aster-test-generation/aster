/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
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
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Cargo_Test_Passing {
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
    public void testEquals_2() {
        trackingId = Mockito.mock(TrackingId.class);
        routeSpecification = Mockito.mock(RouteSpecification.class);
        cargo = new Cargo(trackingId, routeSpecification);
        Cargo sameCargo = new Cargo(trackingId, routeSpecification);
        Cargo differentTrackingId = new Cargo(Mockito.mock(TrackingId.class), routeSpecification);
        Cargo differentRouteSpecification = new Cargo(trackingId, Mockito.mock(RouteSpecification.class));
        Cargo nullObject = null;
        assertNotEquals(cargo, differentTrackingId);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_3() {
        trackingId = Mockito.mock(TrackingId.class);
        routeSpecification = Mockito.mock(RouteSpecification.class);
        cargo = new Cargo(trackingId, routeSpecification);
        Cargo sameCargo = new Cargo(trackingId, routeSpecification);
        Cargo differentTrackingId = new Cargo(Mockito.mock(TrackingId.class), routeSpecification);
        Cargo differentRouteSpecification = new Cargo(trackingId, Mockito.mock(RouteSpecification.class));
        Cargo nullObject = null;
        assertNotEquals(cargo, differentRouteSpecification);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_4() {
        trackingId = Mockito.mock(TrackingId.class);
        routeSpecification = Mockito.mock(RouteSpecification.class);
        cargo = new Cargo(trackingId, routeSpecification);
        Cargo sameCargo = new Cargo(trackingId, routeSpecification);
        Cargo differentTrackingId = new Cargo(Mockito.mock(TrackingId.class), routeSpecification);
        Cargo differentRouteSpecification = new Cargo(trackingId, Mockito.mock(RouteSpecification.class));
        Cargo nullObject = null;
        assertNotEquals(cargo, nullObject);}
}