/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.inject.Inject;
import jakarta.jms.Destination;
import jakarta.jms.JMSContext;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JmsApplicationEvents_Test_Failing {
  @Inject
  private Logger logger;
  private Destination deliveredCargoQueue;
  private static int LOW_PRIORITY = 0;
  @Mock
  private Cargo cargo;
  @Mock
  private HandlingHistory handlingHistory;
  @Mock
  private Itinerary itinerary;
  @Mock
  private JMSContext jmsContext;
  private JmsApplicationEvents jmsApplicationEvents;
  private Destination cargoHandledQueue;
  @Mock
  private HandlingEvent event;
  private Destination handlingEventQueue;
  @Mock
  private HandlingEventRegistrationAttempt attempt;
  @Mock
  private TrackingId trackingId;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoHasArrived_WtWH0() {
    JmsApplicationEvents jmsApplicationEvents = new JmsApplicationEvents();
    Cargo cargo = new Cargo();
    jmsApplicationEvents.cargoHasArrived(cargo);
    Assertions.assertEquals(cargo.getTrackingId().getIdString(), cargo.getTrackingId().getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoWasHandledWithNullHandlingEvent_CDRu1() {
    JmsApplicationEvents jmsApplicationEvents = new JmsApplicationEvents();
    jmsApplicationEvents.cargoWasHandled(null);
  }
}