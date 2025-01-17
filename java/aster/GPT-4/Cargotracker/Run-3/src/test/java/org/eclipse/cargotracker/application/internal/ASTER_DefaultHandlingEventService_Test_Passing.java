/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.CannotCreateHandlingEventException;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultHandlingEventService_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithValidData_Ojkl0() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertDoesNotThrow(() -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithNullTrackingId_jQIr1() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = null;
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertThrows(CannotCreateHandlingEventException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithNullVoyageNumberForLoad_LNWq2() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = null;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertThrows(CannotCreateHandlingEventException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithNullUnLocode_YteG3() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unLocode = null;
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertThrows(CannotCreateHandlingEventException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithNullType_FtYs4() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = null;
    assertThrows(CannotCreateHandlingEventException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithFutureCompletionTime_aDaY5() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertThrows(CannotCreateHandlingEventException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithPastCompletionTime_DPvQ6() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now().minusDays(1);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    assertDoesNotThrow(() -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithReceiveTypeAndVoyageNumber_ockH7() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.RECEIVE;
    assertThrows(CannotCreateHandlingEventException.class, () -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithClaimTypeAndNoVoyageNumber_zkWy8() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = null;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.CLAIM;
    assertDoesNotThrow(() -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventWithCustomsTypeAndNoVoyageNumber_neBg9() throws Exception {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = null;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEvent.Type type = HandlingEvent.Type.CUSTOMS;
    assertDoesNotThrow(() -> service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, type));
  }
}