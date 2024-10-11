/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import jakarta.inject.Inject;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ItineraryCandidateDtoAssembler_Test_Failing {
  @Inject
  private LocationDtoAssembler locationDtoAssembler;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDto_NullItinerary_iMmZ2() {
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    RouteCandidate routeCandidate = assembler.toDto(null);
    assertNull(routeCandidate.getLegs());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToDto_NullItinerary_iMmZ2_fid1() {
    ItineraryCandidateDtoAssembler assembler = new ItineraryCandidateDtoAssembler();
    RouteCandidate routeCandidate = assembler.toDto(null);
    assertNull(routeCandidate);
  }
}