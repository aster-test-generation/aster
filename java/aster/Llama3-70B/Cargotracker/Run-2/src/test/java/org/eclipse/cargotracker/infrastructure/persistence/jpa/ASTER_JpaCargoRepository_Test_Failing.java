/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.enterprise.event.Event;
import jakarta.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JpaCargoRepository_Test_Failing {
  @Mock
  private Event<Cargo> cargoUpdated;
  @Mock
  private EntityManager entityManager;
  private TrackingId trackingId;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_haUE0_1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    List<Cargo> result = jpaCargoRepository.findAll();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_haUE0_2() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    List<Cargo> result = jpaCargoRepository.findAll();
    assertEquals(0, result.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_haUE0() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    List<Cargo> result = jpaCargoRepository.findAll();
    assertNotNull(result);
    assertEquals(0, result.size());
  }
}