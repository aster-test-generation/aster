/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.infrastructure.events.cdi.CargoUpdated;
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
public class Aster_JpaCargoRepository_Test_Passing {
  @PersistenceContext
  private EntityManager entityManager;
  @Inject
  @CargoUpdated
  private Event<Cargo> cargoUpdated;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_opyd0_1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_opyd0_2() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertEquals(8, trackingId.getIdString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_opyd0_3() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertFalse(trackingId.getIdString().matches("[A-Z0-9]{12}"));
  }
}