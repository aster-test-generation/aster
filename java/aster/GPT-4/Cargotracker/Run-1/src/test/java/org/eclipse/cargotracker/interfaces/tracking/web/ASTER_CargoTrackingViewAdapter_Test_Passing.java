/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.tracking.web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.Delivery;
import org.eclipse.cargotracker.domain.model.cargo.RouteSpecification;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CargoTrackingViewAdapter_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_NotRouted_GuON0() {
    Cargo cargo = new Cargo();
    List<HandlingEvent> handlingEvents = new ArrayList<>();
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, handlingEvents);
    assertEquals("NOT_ROUTED", adapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivity_NoActivity_BAnE0() throws Exception {
    Delivery delivery = mock(Delivery.class);
    Cargo cargo = mock(Cargo.class);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getNextExpectedActivity()).thenReturn(null);
    String expected = "";
    String result = cargoTrackingViewAdapter.getNextExpectedActivity();
    assertEquals(expected, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_True_fOhU0() throws Exception {
    Delivery delivery = mock(Delivery.class);
    Cargo cargo = mock(Cargo.class);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(true);
    assertTrue(cargoTrackingViewAdapter.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_False_kUaa0() throws Exception {
    Delivery delivery = mock(Delivery.class);
    Cargo cargo = mock(Cargo.class);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(false);
    assertFalse(cargoTrackingViewAdapter.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEta_WhenEtaIsNull_RRwU0() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    List<HandlingEvent> handlingEvents = new ArrayList<>();
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, handlingEvents);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getEstimatedTimeOfArrival()).thenReturn(null);
    String eta = cargoTrackingViewAdapter.getEta();
    assertEquals("?", eta);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_dLjq0() throws Exception {
    TrackingId trackingId = new TrackingId("ABC123");
    Cargo cargo = new Cargo(trackingId, new RouteSpecification());
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    String expected = "ABC123";
    String actual = trackingId.getIdString();
  }
}