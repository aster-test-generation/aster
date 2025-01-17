/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.jms.JMSContext;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_JmsApplicationEvents_Coverage_Test_Passing {
  private Queue misdirectedCargoQueue;
  private Queue handlingEventQueue;
  private Queue deliveredCargoQueue;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoWasHandled_EventNotNull_CargoNull_ouGd1() {
    JmsApplicationEvents jmsApplicationEvents = new JmsApplicationEvents();
    HandlingEvent event = mock(HandlingEvent.class);
    when(event.getCargo()).thenReturn(null);
    jmsApplicationEvents.cargoWasHandled(event);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoWasHandled_EventNull_AoWz2() {
    JmsApplicationEvents jmsApplicationEvents = new JmsApplicationEvents();
    try {
      jmsApplicationEvents.cargoWasHandled(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoWasHandled_JmsContextNotNull_twSu5() {
    JmsApplicationEvents jmsApplicationEvents = new JmsApplicationEvents();
    HandlingEvent event = mock(HandlingEvent.class);
    Cargo cargo = mock(Cargo.class);
    when(event.getCargo()).thenReturn(cargo);
    JMSContext jmsContext = mock(JMSContext.class);
    jmsApplicationEvents.jmsContext = jmsContext;
    jmsApplicationEvents.cargoWasHandled(event);
    verify(jmsContext, times(1)).createProducer();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoWasHandled_JmsContextNull_CtfN6() {
    JmsApplicationEvents jmsApplicationEvents = new JmsApplicationEvents();
    HandlingEvent event = mock(HandlingEvent.class);
    Cargo cargo = mock(Cargo.class);
    when(event.getCargo()).thenReturn(cargo);
    jmsApplicationEvents.jmsContext = null;
    try {
      jmsApplicationEvents.cargoWasHandled(event);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
  }
}