/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.tracking.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.*;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_CargoTrackingViewAdapter_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusCode_NotRouted_KRur0() {
    Cargo cargo = mock(Cargo.class);
    Itinerary itinerary = mock(Itinerary.class);
    when(cargo.getItinerary()).thenReturn(itinerary);
    when(itinerary.getLegs()).thenReturn(Collections.emptyList());
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    String statusCode = adapter.getStatusCode();
    assertEquals("NOT_ROUTED", statusCode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetNextExpectedActivityWithEmptyActivity_jyAS1() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    HandlingActivity activity = mock(HandlingActivity.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getNextExpectedActivity()).thenReturn(activity);
    when(activity.isEmpty()).thenReturn(true);
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    assertNotNull(adapter.getNextExpectedActivity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusText_Unknown_jqyN0() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.UNKNOWN);
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    assertEquals("Status Unknown", adapter.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusText_UnknownStatus_wefb1() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(null); // Assuming null leads to default case
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    assertEquals("[Unknown status]", adapter.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusText_Delivery_GDyO2() {
    Cargo cargo = mock(Cargo.class);
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    adapter.getStatusText(); // Just calling to ensure no exceptions
    verify(cargo).getDelivery();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusText_OnboardCarrier_UFdj5() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    Voyage voyage = mock(Voyage.class);
    VoyageNumber voyageNumber = mock(VoyageNumber.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.ONBOARD_CARRIER);
    when(delivery.getCurrentVoyage()).thenReturn(voyage);
    when(voyage.getVoyageNumber()).thenReturn(voyageNumber);
    when(voyageNumber.getIdString()).thenReturn("V123");
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    assertEquals("Onboard voyage V123", adapter.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusText_Claimed_FSfB6() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.CLAIMED);
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    assertEquals("Claimed", adapter.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetStatusText_NotReceived_reCe7() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getTransportStatus()).thenReturn(TransportStatus.NOT_RECEIVED);
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, null);
    assertEquals("Not received", adapter.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetNextExpectedActivityWithNullActivity_dIPX0_fid2() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getNextExpectedActivity()).thenReturn(null);
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    assertEquals("", adapter.getNextExpectedActivity());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetNextExpectedActivityWithEmptyActivity_jyAS1_fid2() {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    HandlingActivity activity = mock(HandlingActivity.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getNextExpectedActivity()).thenReturn(activity);
    when(activity.isEmpty()).thenReturn(true);
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    assertEquals("", adapter.getNextExpectedActivity());
  }
}