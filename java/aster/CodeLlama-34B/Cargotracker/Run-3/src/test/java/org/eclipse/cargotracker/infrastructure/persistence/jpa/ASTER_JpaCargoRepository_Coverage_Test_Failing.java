/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.persistence.EntityManager;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.infrastructure.events.cdi.CargoUpdated;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_JpaCargoRepository_Coverage_Test_Failing {
  private CargoUpdated cargoUpdated;
  private EntityManager entityManager;
  private Logger logger;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_WithNullTrackingId_iIOs2_xKFj0() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = null;
    Cargo result = repository.find(trackingId);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_WithNullEntityManager_zazH3_VFRD0() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("1234567890");
    Cargo result = repository.find(trackingId);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_WithNullQuery_jsUq4_mysc0() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("1234567890");
    when(entityManager.createNamedQuery("Cargo.findByTrackingId", Cargo.class)).thenReturn(null);
    Cargo result = repository.find(trackingId);
    assertNull(result);
  }
}