/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.application.ApplicationEvents;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.CargoRepository;
import org.eclipse.cargotracker.domain.model.cargo.Delivery;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEventRepository;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_DefaultCargoInspectionService_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInspectCargoWithMisdirectedCargo_wgCT1_TSoT0() {
    TrackingId trackingId = new TrackingId("misdirectedId");
    DefaultCargoInspectionService service = new DefaultCargoInspectionService();
    CargoRepository cargoRepository = mock(CargoRepository.class);
    HandlingEventRepository handlingEventRepository = mock(HandlingEventRepository.class);
    ApplicationEvents applicationEvents = mock(ApplicationEvents.class);
    Cargo cargo = mock(Cargo.class);
    Delivery delivery = mock(Delivery.class);
    HandlingHistory handlingHistory = mock(HandlingHistory.class);
    when(cargoRepository.find(trackingId)).thenReturn(cargo);
    when(handlingEventRepository.lookupHandlingHistoryOfCargo(trackingId)).thenReturn(handlingHistory);
    when(cargo.getDelivery()).thenReturn(delivery);
    when(delivery.isMisdirected()).thenReturn(true);
    service.inspectCargo(trackingId);
    verify(applicationEvents).cargoWasMisdirected(cargo);
  }
}