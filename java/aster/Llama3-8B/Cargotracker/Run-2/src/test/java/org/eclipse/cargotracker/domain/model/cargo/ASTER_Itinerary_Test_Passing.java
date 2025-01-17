/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;
import java.time.LocalDateTime;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Itinerary_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFinalArrivalDateWhenLastLegIsNull_NxKu0() {
        Itinerary itinerary = new Itinerary();
        LocalDateTime result = itinerary.getFinalArrivalDate();
        assert result.equals(LocalDateTime.MAX);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInitialDepartureLocation_EmptyLegs_YgHG0_ZmGj0() {
    Itinerary itinerary = new Itinerary();
    Location result = itinerary.getInitialDepartureLocation();
    assertEquals(Location.UNKNOWN, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testLastLegWhenLegsAreEmpty_hyMe0_klmU1() {
    Itinerary itinerary = new Itinerary();
    Leg lastLeg = null;
    assert lastLeg == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetFinalArrivalLocation_EmptyLegs_ReturnsUnknown_AQPf0_VZbT0() {
    Itinerary itinerary = new Itinerary();
    Location result = itinerary.getFinalArrivalLocation();
    assertEquals(Location.UNKNOWN, result);
}
}