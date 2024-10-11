/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.persistence.EntityManager;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JpaHandlingEventRepository_Test_Failing {
  @Mock
  private EntityManager entityManager;
  private JpaHandlingEventRepository jpahandlingeventrepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupHandlingHistoryOfCargo_yWAE0() {
    JpaHandlingEventRepository repository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("id");
    HandlingHistory history = repository.lookupHandlingHistoryOfCargo(trackingId);
    assertNotNull(history);
    assertNotEquals(0, history.getAllHandlingEvents().size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupHandlingHistoryOfCargo_yWAE0_1() {
    JpaHandlingEventRepository repository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("id");
    HandlingHistory history = repository.lookupHandlingHistoryOfCargo(trackingId);
    assertNotNull(history);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupHandlingHistoryOfCargo_yWAE0_2() {
    JpaHandlingEventRepository repository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("id");
    HandlingHistory history = repository.lookupHandlingHistoryOfCargo(trackingId);
    assertNotEquals(0, history.getAllHandlingEvents().size());
  }
}