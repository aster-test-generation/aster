/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.tracking.web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.*;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.handling.HandlingEventRepository;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CargoTrackingViewAdapter_Test_Passing {
  private Cargo cargo;
  private RouteSpecification routeSpecification;
  private CargoTrackingViewAdapter cargotrackingviewadapter;
  private TrackingId trackingId;
  private HandlingActivity activity;
  private HandlingEvent handlingEvent;
  private Voyage voyage;
  private List<HandlingEvent> handlingEvents;
  private HandlingEventRepository handlingEventRepository;
  private HandlingEventRepository mockHandlingEventRepository;
  private HandlingActivity handlingActivity;
  private HandlingActivity mockHandlingActivity;
  private HandlingEvent mockHandlingEvent;
  private HandlingEvent mockHandlingEvent1;
  private HandlingEvent mockHandlingEvent2;
  private HandlingEvent mockHandlingEvent3;
  private HandlingEvent mockHandlingEvent4;
  private HandlingEvent mockHandlingEvent5;
  private HandlingEvent mockHandlingEvent6;
  private HandlingEvent mockHandlingEvent7;
  private HandlingEvent mockHandlingEvent8;
  private HandlingEvent mockHandlingEvent9;
  private HandlingEvent mockHandlingEvent10;
  private HandlingEvent mockHandlingEvent11;
  private HandlingEvent mockHandlingEvent12;
  private HandlingEvent mockHandlingEvent13;
  private HandlingEvent mockHandlingEvent14;
  private HandlingEvent mockHandlingEvent15;
  private HandlingEvent mockHandlingEvent16;
  private HandlingEvent mockHandlingEvent17;
  private HandlingEvent mockHandlingEvent18;
  private HandlingEvent mockHandlingEvent19;
  private HandlingEvent mockHandlingEvent20;
  private HandlingEvent mockHandlingEvent21;
  private HandlingEvent mockHandlingEvent22;
  private HandlingEvent mockHandlingEvent23;
  private HandlingEvent mockHandlingEvent24;
  private HandlingEvent mockHandlingEvent25;
  private HandlingEvent mockHandlingEvent26;
  private HandlingEvent mockHandlingEvent27;
  private HandlingEvent mockHandlingEvent28;
  private HandlingEvent mockHandlingEvent29;
  private HandlingEvent mockHandlingEvent30;
  private HandlingEvent mockHandlingEvent31;
  private HandlingEvent mockHandlingEvent32;
  private HandlingEvent mockHandlingEvent33;
  private HandlingEvent mockHandlingEvent34;
  private HandlingEvent mockHandlingEvent35;
  private HandlingEvent mockHandlingEvent36;
  private HandlingEvent mockHandlingEvent37;
  private HandlingEvent mockHandlingEvent38;
  private HandlingEvent mockHandlingEvent39;
  private HandlingEvent mockHandlingEvent40;
  private HandlingEvent mockHandlingEvent41;
  private HandlingEvent mockHandlingEvent42;
  private HandlingEvent mockHandlingEvent43;
  private HandlingEvent mockHandlingEvent44;
  private HandlingEvent mockHandlingEvent45;
  private HandlingEvent mockHandlingEvent46;
  private HandlingEvent mockHandlingEvent47;
  private HandlingEvent mockHandlingEvent48;
  private HandlingEvent mockHandlingEvent49;
  private HandlingEvent mockHandlingEvent50;
  private HandlingEvent mockHandlingEvent51;
  private HandlingEvent mockHandlingEvent52;
  private HandlingEvent mockHandlingEvent53;
  private HandlingEvent mockHandlingEvent54;
  private HandlingEvent mockHandlingEvent55;
  private HandlingEvent mockHandlingEvent56;
  private HandlingEvent mockHandlingEvent57;
  private HandlingEvent mockHandlingEvent58;
  private HandlingEvent mockHandlingEvent59;
  private HandlingEvent mockHandlingEvent60;
  private HandlingEvent mockHandlingEvent61;
  private HandlingEvent mockHandlingEvent62;
  private HandlingEvent mockHandlingEvent63;
  private HandlingEvent mockHandlingEvent64;
  private HandlingEvent mockHandlingEvent65;
  private HandlingEvent mockHandlingEvent66;
  private HandlingEvent mockHandlingEvent67;
  private HandlingEvent mockHandlingEvent68;
  private HandlingEvent mockHandlingEvent69;
  private HandlingEvent mockHandlingEvent70;
  private HandlingEvent mockHandlingEvent71;
  private HandlingEvent mockHandlingEvent72;
  private HandlingEvent mockHandlingEvent73;
  private HandlingEvent mockHandlingEvent74;
  private HandlingEvent mockHandlingEvent75;
  private HandlingEvent mockHandlingEvent76;
  private HandlingEvent mockHandlingEvent77;
  private HandlingEvent mockHandlingEvent78;
  private HandlingEvent mockHandlingEvent79;
  private HandlingEvent mockHandlingEvent80;
  private HandlingEvent mockHandlingEvent81;
  private HandlingEvent mockHandlingEvent82;
  private HandlingEvent mockHandlingEvent83;
  private HandlingEvent mockHandlingEvent84;
  private HandlingEvent mockHandlingEvent85;
  private HandlingEvent mockHandlingEvent86;
  private HandlingEvent mockHandlingEvent87;
  private HandlingEvent mockHandlingEvent88;
  private HandlingEvent mockHandlingEvent89;
  private Delivery delivery;
  private HandlingEvent handlingEvent2;
  private HandlingEvent handlingEvent3;
  private HandlingEvent handlingEvent4;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNextExpectedActivity_NoNextExpectedActivity_McTU0() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    assertEquals("", cargoTrackingViewAdapter.getNextExpectedActivity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetStatusCodeNotRouted_BjrI0() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    assertEquals("NOT_ROUTED", cargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetStatusCodeAtDestination_nkxl1() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    cargo.getDelivery().setUnloadedAtDestination(true);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    assertEquals("NOT_ROUTED", cargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetStatusCodeMisdirected_Nbqt2() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    cargo.getDelivery().setMisdirected(true);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    assertEquals("NOT_ROUTED", cargoTrackingViewAdapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getEta_withNullEstimatedTimeOfArrival_shouldReturnQuestionMark_lLjJ0() {
    Cargo cargo = new Cargo(new TrackingId(), new RouteSpecification());
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    String eta = cargoTrackingViewAdapter.getEta();
    assertEquals("?", eta);
  }
}