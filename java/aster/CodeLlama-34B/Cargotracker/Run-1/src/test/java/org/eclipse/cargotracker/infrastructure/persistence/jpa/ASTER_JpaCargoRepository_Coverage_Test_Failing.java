/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.persistence.EntityManager;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.infrastructure.events.cdi.CargoUpdated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaCargoRepository_Coverage_Test_Failing {
  private EntityManager entityManager;
  private CargoUpdated cargoUpdated;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_WwSh0_2_fid1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertEquals(36, trackingId.getIdString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_WwSh0() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertNotNull(trackingId);
    assertEquals(36, trackingId.getIdString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingIdUpperCase_mJFN1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertNotNull(trackingId);
    assertEquals(36, trackingId.getIdString().length());
    assertTrue(trackingId.getIdString().matches("[A-Z0-9]+"));
  }
}