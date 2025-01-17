/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.enterprise.event.Event;
import jakarta.persistence.EntityManager;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JpaCargoRepository_Test_Passing {
  @Mock
  private Event<Cargo> cargoUpdated;
  @Mock
  private EntityManager entityManager;
  @InjectMocks
  private JpaCargoRepository jpaCargoRepository;
  private Cargo cargo;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingIdFormat_kpfU0_1() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = repository.nextTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingIdFormat_kpfU0_2() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = repository.nextTrackingId();
    assertTrue(trackingId.getIdString().matches("^[0-9A-F]+"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingIdFormat_kpfU0() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = repository.nextTrackingId();
    assertNotNull(trackingId);
    assertTrue(trackingId.getIdString().matches("^[0-9A-F]+"));
  }
}