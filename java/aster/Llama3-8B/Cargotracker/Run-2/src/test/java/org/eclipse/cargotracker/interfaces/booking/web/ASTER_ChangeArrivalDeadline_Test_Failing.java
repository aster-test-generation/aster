/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ChangeArrivalDeadline_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCargo_cMtx0() {
        ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
        CargoRoute cargoRoute = changeArrivalDeadline.getCargo();
        assertNotNull(cargoRoute);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetTrackingId_aVda0_fid2() {
        ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
        String trackingId = changeArrivalDeadline.getTrackingId();
        assertEquals("", trackingId);
    }
}