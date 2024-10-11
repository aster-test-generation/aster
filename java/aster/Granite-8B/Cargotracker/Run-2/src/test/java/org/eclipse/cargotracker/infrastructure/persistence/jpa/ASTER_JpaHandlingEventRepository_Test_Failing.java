/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JpaHandlingEventRepository_Test_Failing {
  @PersistenceContext
  private EntityManager entityManager;
  private HandlingEvent handlingEvent;
  private JpaHandlingEventRepository jpahandlingeventrepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupHandlingHistoryOfCargo_mKWX0_1() {
    JpaHandlingEventRepository repository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("123");
    HandlingHistory handlingHistory = repository.lookupHandlingHistoryOfCargo(trackingId);
    assertNotNull(handlingHistory);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupHandlingHistoryOfCargo_mKWX0_2() {
    JpaHandlingEventRepository repository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("123");
    HandlingHistory handlingHistory = repository.lookupHandlingHistoryOfCargo(trackingId);
    assertTrue(handlingHistory.getAllHandlingEvents().size() > 0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void teststore() throws Exception {
    jpahandlingeventrepository = new JpaHandlingEventRepository();
    handlingEvent = new HandlingEvent();
    jpahandlingeventrepository.store(handlingEvent);
    verify(entityManager, times(1)).persist(handlingEvent);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupHandlingHistoryOfCargo_mKWX0() {
    JpaHandlingEventRepository repository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("123");
    HandlingHistory handlingHistory = repository.lookupHandlingHistoryOfCargo(trackingId);
    assertNotNull(handlingHistory);
    assertTrue(handlingHistory.getAllHandlingEvents().size() > 0);
  }
}