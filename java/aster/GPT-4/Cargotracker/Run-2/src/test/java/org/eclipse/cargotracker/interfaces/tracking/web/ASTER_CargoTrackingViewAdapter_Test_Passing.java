/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.tracking.web;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.Delivery;
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
  public void testGetStatusCode_NotRouted_FUem0() {
    Cargo cargo = new Cargo();
    List<HandlingEvent> handlingEvents = new ArrayList<>();
    CargoTrackingViewAdapter adapter = new CargoTrackingViewAdapter(cargo, handlingEvents);
    assertEquals("NOT_ROUTED", adapter.getStatusCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivity_NoActivity_VTtE0() throws Exception {
    Delivery delivery = mock(Delivery.class);
    Cargo cargo = mock(Cargo.class);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.getNextExpectedActivity()).thenReturn(null);
    String result = cargoTrackingViewAdapter.getNextExpectedActivity();
    assertEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_WhenMisdirected_QPKQ0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(true);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    boolean result = cargoTrackingViewAdapter.isMisdirected();
    assertTrue(result, "Cargo should be misdirected");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_WhenNotMisdirected_ueCh0() throws Exception {
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    CargoTrackingViewAdapter cargoTrackingViewAdapter = new CargoTrackingViewAdapter(cargo, new ArrayList<>());
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(false);
    boolean result = cargoTrackingViewAdapter.isMisdirected();
    assertFalse(result, "Cargo should not be misdirected");
  }
}