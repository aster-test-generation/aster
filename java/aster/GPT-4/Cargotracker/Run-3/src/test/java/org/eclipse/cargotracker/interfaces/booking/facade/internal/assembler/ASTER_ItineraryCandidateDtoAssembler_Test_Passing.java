/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItineraryCandidateDtoAssembler_Test_Passing {
  private ItineraryCandidateDtoAssembler itineraryCandidateDtoAssembler;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDtoWithEmptyItinerary_KHYR0() throws Exception {
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    Itinerary emptyItinerary = new Itinerary(new ArrayList<>());
    RouteCandidate result = assembler.toDto(emptyItinerary);
    assertTrue(result.getLegs().isEmpty());
  }
}