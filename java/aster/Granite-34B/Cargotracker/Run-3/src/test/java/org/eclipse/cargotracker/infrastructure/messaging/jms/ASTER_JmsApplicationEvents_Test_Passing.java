/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.messaging.jms;

import jakarta.inject.Inject;
import jakarta.jms.Destination;
import java.util.logging.Logger;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt;

public class Aster_JmsApplicationEvents_Test_Passing {
  @Inject
  private Logger logger;
  private Destination deliveredCargoQueue;
  private static int LOW_PRIORITY = 0;
  JmsApplicationEvents jmsapplicationevents;
  private Destination handlingEventQueue;
  private HandlingEventRegistrationAttempt attempt;
  private TrackingId trackingId;
  private VoyageNumber voyageNumber;
  private HandlingEvent.Type type;
  private UnLocode unLocode;
  private Destination misdirectedCargoQueue;
}