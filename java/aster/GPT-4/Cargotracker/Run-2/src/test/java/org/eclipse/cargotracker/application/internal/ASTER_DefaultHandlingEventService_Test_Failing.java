/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultHandlingEventService_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithValidData_Xoyy0() {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOYAGE456");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertDoesNotThrow(() -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithPastCompletionTime_HAXS3() {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().minusDays(1);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOYAGE456");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.RECEIVE;
    assertThrows(IllegalArgumentException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithFutureRegistrationTime_uwHw4() {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(2);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOYAGE456");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.CLAIM;
    assertDoesNotThrow(() -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithInvalidUnLocode_AOxZ7() {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOYAGE456");
    UnLocode unLocode = new UnLocode("INVALID");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertThrows(IllegalArgumentException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithInvalidVoyageNumber_EqJU8() {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.UNLOAD;
    assertThrows(IllegalArgumentException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithInvalidTrackingId_euLu9() {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("");
    VoyageNumber voyageNumber = new VoyageNumber("VOYAGE456");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.RECEIVE;
    assertThrows(IllegalArgumentException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithInvalidUnLocode_AOxZ7_fid1() {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOYAGE456");
    UnLocode unLocode = new UnLocode("AOZZZ"); // Changed to a valid UN/LOCODE format
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertDoesNotThrow(() -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }
}