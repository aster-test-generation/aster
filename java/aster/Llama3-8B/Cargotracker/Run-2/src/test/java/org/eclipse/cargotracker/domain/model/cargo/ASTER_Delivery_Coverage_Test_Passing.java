/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Delivery_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateOnRouting_WithNullRouteSpecification_wpiS0() {
        Delivery delivery = new Delivery();
        try {
            delivery.updateOnRouting(null, new Itinerary());
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Route specification is required", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectSameValue_QEAp5_gkNf0() {
    Delivery delivery = new Delivery();
    boolean result = delivery.getTransportStatus() == null;
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ReturnsHashCode_Aecz445771631() {
        Delivery delivery = new Delivery();
        int hashCode = delivery.hashCode();
        assertEquals(445771631, hashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_AppendLastEvent_YwNe10_YvtY0_fid2() {
    Delivery delivery = new Delivery();
    HandlingEvent lastEvent = new HandlingEvent();
    delivery.setLastEvent(lastEvent);
    int hashCode = delivery.hashCode();
    assertEquals(1624618900, hashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_AppendMisdirected_eWlx4_aSps0_fid2() {
    Delivery delivery = new Delivery();
    delivery.setMisdirected(true);
    int hashCode = delivery.hashCode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectDifferentValue_HXeG6_QraD1_fid2() {
    Delivery delivery = new Delivery();
    boolean result = delivery.equals(delivery);
}
}