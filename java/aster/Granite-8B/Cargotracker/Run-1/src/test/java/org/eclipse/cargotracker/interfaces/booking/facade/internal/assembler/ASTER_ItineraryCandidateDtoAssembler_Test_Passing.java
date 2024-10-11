/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import jakarta.inject.Inject;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ItineraryCandidateDtoAssembler_Test_Passing {
  @Inject
  private LocationDtoAssembler locationDtoAssembler;
  private ItineraryCandidateDtoAssembler itinerarycandidatedtoassembler;
  private ItineraryCandidateDtoAssembler assembler;
  private Itinerary itinerary;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void tearDown_QAXR1() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setUp_wYKZ0_MQYK1() {
    MockitoAnnotations.initMocks(this);
  }
}