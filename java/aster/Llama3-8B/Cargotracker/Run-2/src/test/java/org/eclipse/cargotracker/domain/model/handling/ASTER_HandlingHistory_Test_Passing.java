/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HandlingHistory_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMostRecentlyCompletedEvent_EmptyList_ReturnsNull_vYOD0() {
    HandlingHistory handlingHistory = new HandlingHistory(new ArrayList<>());
    HandlingEvent result = handlingHistory.getMostRecentlyCompletedEvent();
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMostRecentlyCompletedEvent_NonEmptyList_ReturnsLastEvent_WCzc1() {
    HandlingHistory handlingHistory = new HandlingHistory(Arrays.asList(
            new HandlingEvent(),
            new HandlingEvent(),
            new HandlingEvent()
    ));
    HandlingEvent result = handlingHistory.getMostRecentlyCompletedEvent();
    Assertions.assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_qLIb0() {
    HandlingHistory obj = new HandlingHistory(new ArrayList<>());
    boolean result = obj.equals(obj);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_tMkK1() {
    HandlingHistory obj = new HandlingHistory(new ArrayList<>());
    boolean result = obj.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_gfNR0() {
        Collection<HandlingEvent> handlingEvents = new ArrayList<>();
        HandlingHistory handlingHistory = new HandlingHistory(handlingEvents);
        int hashCode = handlingHistory.hashCode();
        assert hashCode > 0;
    }
}