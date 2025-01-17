/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Booking_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOriginUnlocode_qpXn0() {
        Booking booking = new Booking();
        booking.setOriginUnlocode("LHR");
        assertEquals("London Heathrow", booking.getOriginName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetDestinationUnlocode_Swog0() {
        Booking booking = new Booking();
        String destinationUnlocode = "LON";
        booking.setDestinationUnlocode(destinationUnlocode);
        assertEquals(destinationUnlocode, booking.getDestinationUnlocode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArrivalDeadline_iFUI0() {
        Booking booking = new Booking();
        LocalDate expected = LocalDate.now();
    assertNull(expected);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOriginUnlocode_zdTz0() {
        Booking booking = new Booking();
        String originUnlocode = booking.getOriginUnlocode();
        assert originUnlocode != null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetToday_pwhF0() {
        Booking booking = new Booking();
        LocalDate today = booking.getToday();
    assertNull(LocalDate.now());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBookableFalse_dWPB1_DUFc1() {
    Booking booking = new Booking();
    booking.init(); 
    boolean result = booking.isBookable();
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDeadlineUpdatedWhenDurationIsGreaterThanOrEqualToMinJourneyDuration_eHhH0_PvWM1() {
    Booking booking = new Booking();
    booking.init();
    booking.setArrivalDeadline(LocalDate.now().plusDays(1));
    booking.deadlineUpdated();
    assertEquals(true, booking.isBookable());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDeadlineUpdatedWhenDurationIsLessThanMinJourneyDuration_cKOB1_flJe0() {
    Booking booking = new Booking();
    booking.init();
    booking.setArrivalDeadline(LocalDate.now());
    booking.deadlineUpdated();
    assertEquals(false, booking.isBookable());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDuration_zJsz0_fid1() {
        Booking booking = new Booking();
        long expectedDuration = 0;
        long actualDuration = booking.getDuration();
        assertEquals(expectedDuration, actualDuration);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOriginName_dAbk0() {
        Booking booking = new Booking();
        String originName = booking.getOriginName();
        assertEquals("Expected origin name", "expected origin name", originName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetArrivalDeadline_iFUI0_fid1() {
        Booking booking = new Booking();
        LocalDate expected = LocalDate.now();
        assertEquals(expected, booking.getArrivalDeadline());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetToday_pwhF0_fid1() {
        Booking booking = new Booking();
        LocalDate today = booking.getToday();
        assertEquals(LocalDate.now(), today);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetDestinationName_LUPu0_fid1() {
        Booking booking = new Booking();
        String destinationName = booking.getDestinationName();
        assertEquals("Expected destination name", destinationName, "");
    }
}