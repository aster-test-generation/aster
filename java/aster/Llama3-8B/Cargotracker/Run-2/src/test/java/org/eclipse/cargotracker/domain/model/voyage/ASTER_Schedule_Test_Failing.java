/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Schedule_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_jUEn2() {
    Schedule schedule1 = new Schedule();
    Schedule schedule2 = new Schedule();
    boolean result = schedule1.equals(schedule2);
    assert !result;
}
}