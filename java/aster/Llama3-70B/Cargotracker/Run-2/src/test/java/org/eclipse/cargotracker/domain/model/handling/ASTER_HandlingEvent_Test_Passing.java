/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.RouteSpecification;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HandlingEvent_Test_Passing {
  HandlingEvent handlingEvent;
  Cargo cargo;
  LocalDateTime completionTime;
  LocalDateTime registrationTime;
  Voyage voyage;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnFalse_Kslb1() {
    HandlingEvent event = new HandlingEvent();
    assertFalse(event.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_ReturnFalse_AkgQ2() {
    HandlingEvent event = new HandlingEvent();
    assertFalse(event.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_ckwh0() throws Exception {
    TrackingId trackingId = mock(TrackingId.class);
    when(trackingId.toString()).thenReturn("TrackingId123");
    RouteSpecification routeSpecification = mock(RouteSpecification.class);
    UnLocode unLocode = mock(UnLocode.class);
    when(unLocode.toString()).thenReturn("UnLocode123");
    Location location = new Location(unLocode, "LocationName");
    VoyageNumber voyageNumber = mock(VoyageNumber.class);
    when(voyageNumber.toString()).thenReturn("VoyageNumber123");
    Voyage voyage = new Voyage(voyageNumber, mock(Schedule.class));
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    LocalDateTime completionTime = LocalDateTime.now();
    LocalDateTime registrationTime = LocalDateTime.now();
    Cargo cargo = new Cargo(trackingId, routeSpecification);
    HandlingEvent handlingEvent = new HandlingEvent(cargo, completionTime, registrationTime, type, location, voyage);
    String expected = "\n" + location.getName() + "\n" + completionTime + "\n" + "Type: " + type + "\n" + "Reg.: " + registrationTime + "\n" + "Voyage: " + voyage.getVoyageNumber().toString() + "\n";
  }
}