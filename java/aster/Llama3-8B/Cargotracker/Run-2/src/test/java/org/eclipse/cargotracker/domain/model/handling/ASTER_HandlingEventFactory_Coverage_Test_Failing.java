/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;
import java.time.LocalDateTime;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HandlingEventFactory_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateHandlingEventWithValidInputs_khTz0() throws CannotCreateHandlingEventException {
        HandlingEventFactory factory = new HandlingEventFactory();
        LocalDateTime registrationTime = LocalDateTime.now();
        LocalDateTime completionTime = LocalDateTime.now();
        TrackingId trackingId = new TrackingId("123");
        VoyageNumber voyageNumber = new VoyageNumber("456");
        UnLocode unlocode = new UnLocode("789");
        HandlingEvent.Type type = HandlingEvent.Type.LOAD;
        HandlingEvent event = factory.createHandlingEvent(registrationTime, completionTime, trackingId, voyageNumber, unlocode, type);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateHandlingEventWithNullTrackingId_Jfyl1() throws CannotCreateHandlingEventException {
        HandlingEventFactory factory = new HandlingEventFactory();
        LocalDateTime registrationTime = LocalDateTime.now();
        LocalDateTime completionTime = LocalDateTime.now();
        VoyageNumber voyageNumber = new VoyageNumber("456");
        UnLocode unlocode = new UnLocode("789");
        HandlingEvent.Type type = HandlingEvent.Type.LOAD;
        try {
            factory.createHandlingEvent(registrationTime, completionTime, null, voyageNumber, unlocode, type);
            Assertions.fail("Expected CannotCreateHandlingEventException");
        } catch (CannotCreateHandlingEventException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateHandlingEventWithNullVoyageNumber_iEMg2() throws CannotCreateHandlingEventException {
        HandlingEventFactory factory = new HandlingEventFactory();
        LocalDateTime registrationTime = LocalDateTime.now();
        LocalDateTime completionTime = LocalDateTime.now();
        TrackingId trackingId = new TrackingId("123");
        UnLocode unlocode = new UnLocode("789");
        HandlingEvent.Type type = HandlingEvent.Type.LOAD;
        try {
            factory.createHandlingEvent(registrationTime, completionTime, trackingId, null, unlocode, type);
            Assertions.fail("Expected CannotCreateHandlingEventException");
        } catch (CannotCreateHandlingEventException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateHandlingEventWithNullUnLocode_juIa3() throws CannotCreateHandlingEventException {
        HandlingEventFactory factory = new HandlingEventFactory();
        LocalDateTime registrationTime = LocalDateTime.now();
        LocalDateTime completionTime = LocalDateTime.now();
        TrackingId trackingId = new TrackingId("123");
        VoyageNumber voyageNumber = new VoyageNumber("456");
        HandlingEvent.Type type = HandlingEvent.Type.LOAD;
        try {
            factory.createHandlingEvent(registrationTime, completionTime, trackingId, voyageNumber, null, type);
            Assertions.fail("Expected CannotCreateHandlingEventException");
        } catch (CannotCreateHandlingEventException e) {
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateHandlingEventWithNullType_YAsR4() throws CannotCreateHandlingEventException {
        HandlingEventFactory factory = new HandlingEventFactory();
        LocalDateTime registrationTime = LocalDateTime.now();
        LocalDateTime completionTime = LocalDateTime.now();
        TrackingId trackingId = new TrackingId("123");
        VoyageNumber voyageNumber = new VoyageNumber("456");
        UnLocode unlocode = new UnLocode("789");
        try {
            factory.createHandlingEvent(registrationTime, completionTime, trackingId, voyageNumber, unlocode, null);
            Assertions.fail("Expected CannotCreateHandlingEventException");
        } catch (CannotCreateHandlingEventException e) {
        }
}
}