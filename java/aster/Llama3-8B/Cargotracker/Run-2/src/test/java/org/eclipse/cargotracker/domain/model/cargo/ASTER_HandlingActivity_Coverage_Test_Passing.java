/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HandlingActivity_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsEmpty_TypeIsNull_LocationIsNull_VoyageIsNull_Xkir0() {
        HandlingActivity handlingActivity = new HandlingActivity();
        assertTrue(handlingActivity.isEmpty());
}
}