/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.cargo;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Itinerary_Test_Passing {
  private Cargo cargo;
  private RouteSpecification routeSpecification;
  private TrackingId trackingId;
  private UnLocode unLocode;
  private VoyageNumber voyageNumber;
  private Schedule schedule;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameObject_ReturnsTrue_eMTz0() {
    Itinerary itinerary = new Itinerary();
    assertTrue(itinerary.equals(itinerary));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_ReturnsFalse_OePd1() {
    Itinerary itinerary = new Itinerary();
    assertFalse(itinerary.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_ReturnsFalse_sclN2() {
    Itinerary itinerary = new Itinerary();
    assertFalse(itinerary.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFinalArrivalDate_withoutLastLeg_cdfA1() {
    Itinerary itinerary = new Itinerary();
    assertEquals(LocalDateTime.MAX, itinerary.getFinalArrivalDate());
  }
}