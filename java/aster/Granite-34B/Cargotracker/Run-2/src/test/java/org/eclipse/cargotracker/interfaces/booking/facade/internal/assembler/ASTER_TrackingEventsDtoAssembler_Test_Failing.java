/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.*;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.TrackingEvents;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TrackingEventsDtoAssembler_Test_Failing {
  TrackingEventsDtoAssembler trackingeventsdtoassembler;
  Cargo cargo;
  HandlingEvent handlingEvent;
  Itinerary itinerary;
  Voyage voyage;
  VoyageNumber voyageNumber;
  Schedule schedule;
  HandlingHistory handlingHistory;
  Delivery delivery;
  RouteSpecification routeSpecification;
  TrackingId trackingId;
  UnLocode unLocode;
  String countryAndLocation;
  String name;
  String number;
  String id;
  String description;
  String time;
  String voyageNumberString;
  String locationString;
  String typeString;
  String summary;
  String expected;
  String actual;
  String actualTime;
  String actualDescription;
  String cargoString;
  String cargo2String;
  String cargo3String;
  String cargo4String;
  String cargo5String;
  String cargo6String;
  String cargo7String;
  String cargo8String;
  String cargo9String;
  String cargo10String;
  String cargo11String;
  String cargo12String;
  String cargo13String;
  String cargo14String;
  String cargo15String;
  String cargo16String;
  String cargo17String;
  String cargo18String;
  String cargo19String;
  String cargo20String;
  String cargo21String;
  String cargo22String;
  String cargo23String;
  String cargo24String;
  String cargo25String;
  String cargo26String;
  String cargo27String;
  String cargo28String;
  String cargo29String;
  String cargo30String;
  String cargo31String;
  String cargo32String;
  String cargo33String;
  String cargo34String;
  String cargo35String;
  String cargo36String;
  String cargo37String;
  String cargo38String;
  String cargo39String;
  String cargo40String;
  String cargo41String;
  String cargo42String;
  String cargo43String;
  String cargo44String;
  String cargo45String;
  String cargo46String;
  String cargo47String;
  String cargo48String;
  String cargo49String;
  String cargo50String;
  String cargo51String;
  String cargo52String;
  String cargo53String;
  String cargo54String;
  String cargo55String;
  String cargo56String;
  String cargo57String;
  String cargo58String;
  String cargo59String;
  String cargo60String;
  String cargo61String;
  String cargo62String;
  String cargo63String;
  String cargo64String;
  String cargo65String;
  String cargo66String;
  String cargo67String;
  String cargo68String;
  String cargo69String;
  String cargo70String;
  String cargo71String;
  String cargo72String;
  String cargo73String;
  String cargo74String;
  String cargo75String;
  String cargo76String;
  String cargo77String;
  String cargo78String;
  String cargo79String;
  String cargo80String;
  String cargo81String;
  String cargo82String;
  String cargo83String;
  String cargo84String;
  String cargo85String;
  String cargo86String;
  String cargo87String;
  String cargo88String;
  String cargo89String;
  String cargo90String;
  String cargo91String;
  String cargo92String;
  String cargo93String;
  String cargo94String;
  String cargo95String;
  String cargo96String;
  String cargo97String;
  String cargo98String;
  String cargo99String;
  String cargo100String;
  String cargo101String;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDto_ayPA0() {
    Cargo cargo = new Cargo();
    HandlingEvent handlingEvent = new HandlingEvent();
    TrackingEventsDtoAssembler assembler = new TrackingEventsDtoAssembler();
    TrackingEvents trackingEvents = assembler.toDto(cargo, handlingEvent);
    assertEquals(cargo.getItinerary().isExpected(handlingEvent), trackingEvents.isExpected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDtoWithNullHandlingEvent_nVZl2() {
    TrackingEventsDtoAssembler assembler = new TrackingEventsDtoAssembler();
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    TrackingEvents trackingEvents = assembler.toDto(cargo, null);
    assertNotNull(trackingEvents);
  }
}