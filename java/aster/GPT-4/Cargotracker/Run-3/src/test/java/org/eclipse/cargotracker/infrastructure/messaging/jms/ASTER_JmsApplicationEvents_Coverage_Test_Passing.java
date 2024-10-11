/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_JmsApplicationEvents_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoWasHandled_getCargo_USVq0() {
    JmsApplicationEvents appEvents = new JmsApplicationEvents();
    HandlingEvent event = mock(HandlingEvent.class);
    Cargo cargo = new Cargo();
    when(event.getCargo()).thenReturn(cargo);
    appEvents.cargoWasHandled(event);
    verify(event).getCargo();
  }
}