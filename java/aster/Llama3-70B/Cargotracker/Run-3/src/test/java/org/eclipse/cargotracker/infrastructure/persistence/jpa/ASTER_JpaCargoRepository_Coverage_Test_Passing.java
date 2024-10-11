/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaCargoRepository_Coverage_Test_Passing {
  private JpaCargoRepository jpaCargoRepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_gHVB0_1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId actualTrackingId = jpaCargoRepository.nextTrackingId();
    assertNotNull(actualTrackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_gHVB0_2() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId actualTrackingId = jpaCargoRepository.nextTrackingId();
    assertNotNull(actualTrackingId.getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_gHVB0_3() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId actualTrackingId = jpaCargoRepository.nextTrackingId();
    assertTrue(actualTrackingId.hashCode() != 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void store(Object cargo) {
  }
}