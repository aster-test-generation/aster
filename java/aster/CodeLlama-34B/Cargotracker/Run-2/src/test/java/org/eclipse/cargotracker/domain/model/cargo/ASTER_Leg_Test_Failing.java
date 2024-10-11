/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Leg_Test_Failing {
  private LocalDateTime loadTime;
  private LocalDateTime unloadTime;
  @Id
  @GeneratedValue
  private Long id;
  private Voyage voyage;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullValues_yZrc1_VzKj0() {
    Leg leg = new Leg(null, null, null, null, null);
    String expected = "Leg{id=null, voyage=null, loadLocation=null, unloadLocation=null, loadTime=null, unloadTime=null}";
    assertEquals(expected, leg.toString());
  }
}