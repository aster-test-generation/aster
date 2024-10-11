/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DefaultBookingServiceFacade_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLoadCargoForTrackingFailure_rzuR1() {
    DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
    String trackingIdValue = "12345";
    CargoStatus expected = null;
    assertEquals(expected, facade.loadCargoForTracking(trackingIdValue));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDestination_QcIJ0() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        facade.changeDestination("12345", "DEMXD");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDestinationNullTrackingId_LiLd1() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        facade.changeDestination(null, "DEMXD");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDestinationNullDestinationUnLocode_WsiU2() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        facade.changeDestination("12345", null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDestinationEmptyTrackingId_AjPw3() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        facade.changeDestination("", "DEMXD");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDestinationEmptyDestinationUnLocode_AdiK4() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        facade.changeDestination("12345", "");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRequestPossibleRoutesForCargo_sToK0() {
        DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
        List<RouteCandidate> routeCandidates = defaultBookingServiceFacade.requestPossibleRoutesForCargo("trackingId");
        assertEquals(1, routeCandidates.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testBookNewCargo_Ovyo0() {
        DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
        String origin = "origin";
        String destination = "destination";
        LocalDate arrivalDeadline = LocalDate.now();
        String expectedTrackingId = "expectedTrackingId";
        String actualTrackingId = defaultBookingServiceFacade.bookNewCargo(origin, destination, arrivalDeadline);
        assertEquals(expectedTrackingId, actualTrackingId);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testListAllTrackingIds_FZFj0() {
        DefaultBookingServiceFacade defaultBookingServiceFacade = new DefaultBookingServiceFacade();
        List<String> expectedTrackingIds = new ArrayList<>();
        List<String> actualTrackingIds = defaultBookingServiceFacade.listAllTrackingIds();
        assert actualTrackingIds.size() == expectedTrackingIds.size();
        for (int i = 0; i < actualTrackingIds.size(); i++) {
            assert actualTrackingIds.get(i).equals(expectedTrackingIds.get(i));
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testListAllCargos_hUia0() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        List<CargoRoute> routes = facade.listAllCargos();
        assertEquals(0, routes.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDeadline_uMPu0() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        String trackingId = UUID.randomUUID().toString();
        LocalDate arrivalDeadline = LocalDate.now();
        facade.changeDeadline(trackingId, arrivalDeadline);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDeadlineNullTrackingId_unEy1() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        String trackingId = null;
        LocalDate arrivalDeadline = LocalDate.now();
        facade.changeDeadline(trackingId, arrivalDeadline);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testChangeDeadlineNullArrivalDeadline_EHnb2() {
        DefaultBookingServiceFacade facade = new DefaultBookingServiceFacade();
        String trackingId = UUID.randomUUID().toString();
        LocalDate arrivalDeadline = null;
        facade.changeDeadline(trackingId, arrivalDeadline);
    }
}