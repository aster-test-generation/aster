/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import jakarta.inject.Inject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ItineraryCandidateDtoAssembler_Test_Passing {
  @Inject
  private LocationDtoAssembler locationDtoAssembler;
  ItineraryCandidateDtoAssembler itinerarycandidatedtoassembler;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void toDto_noLegs_qsUK1() throws Exception {
    Itinerary itinerary = new Itinerary(List.of());
    RouteCandidate routeCandidate = new ItineraryCandidateDtoAssembler().toDto(itinerary);
    assertEquals(0, routeCandidate.getLegs().size());
  }
}