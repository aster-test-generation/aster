/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaHandlingEventRepository_Test_Passing {
  @PersistenceContext
  private EntityManager entityManager;
  JpaHandlingEventRepository jpahandlingeventrepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStore_WUNV0() throws Exception {
    JpaHandlingEventRepository repository = new JpaHandlingEventRepository();
    HandlingEvent event = new HandlingEvent();
    repository.store(event);
  }
}