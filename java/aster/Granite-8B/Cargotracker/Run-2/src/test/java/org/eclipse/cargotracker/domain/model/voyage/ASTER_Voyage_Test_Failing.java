/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Voyage_Test_Failing {
  @Mock
  VoyageNumber voyageNumber;
  @Mock
  Schedule schedule;
  Voyage voyage;
  Voyage other;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullVoyageNumber_XGaP1() {
    Voyage voyage = new Voyage(null, new Schedule());
    assertEquals("Voyage null", voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullSchedule_FoAy2() {
    Voyage voyage = new Voyage(new VoyageNumber("123"), null);
    assertEquals("Voyage 123", voyage.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_whenObjectIsDifferentInstanceWithSameIdentity_thenReturnsTrue_fid2() throws Exception {
    voyage = new Voyage(voyageNumber, schedule);
    Voyage otherVoyage = new Voyage(voyageNumber, schedule);
    boolean result = voyage.equals(otherVoyage);
    assertTrue(result);
  }
}