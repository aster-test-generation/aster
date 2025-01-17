/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.infrastructure.events.cdi.CargoUpdated;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JpaCargoRepository_Test_Passing {
  @Inject
  @CargoUpdated
  private Event<Cargo> cargoUpdated;
  @PersistenceContext
  private EntityManager entityManager;
  JpaCargoRepository jpacargorepository;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_jphV0() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    List<Cargo> actual = jpaCargoRepository.findAll();
    List<Cargo> expected = entityManager.createNamedQuery("Cargo.findAll", Cargo.class).getResultList();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_CURW0_jHpZ0() {
    Cargo cargo;
    try {
      cargo = entityManager.createNamedQuery("Cargo.findByTrackingId", Cargo.class).setParameter("trackingId", new TrackingId("id")).getSingleResult();
    } catch (NoResultException e) {
      Logger logger = Logger.getLogger(JpaCargoRepository.class.getName());
      logger.log(Level.FINE, "Find called on non-existant tracking ID.", e);
      cargo = null;
    }
    assertEquals(cargo, new JpaCargoRepository().find(new TrackingId("id")));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind2_YLFH1_vVmH0() {
    Cargo cargo;
    try {
      cargo = entityManager.createNamedQuery("Cargo.findByTrackingId", Cargo.class).setParameter("trackingId", new TrackingId()).getSingleResult();
    } catch (NoResultException e) {
      Logger logger = Logger.getLogger(JpaCargoRepository.class.getName());
      logger.log(Level.FINE, "Find called on non-existant tracking ID.", e);
      cargo = null;
    }
    assertEquals(cargo, new JpaCargoRepository().find(new TrackingId()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind3_LEOS2_JkBH0() {
    Cargo cargo;
    try {
      cargo = entityManager.createNamedQuery("Cargo.findByTrackingId", Cargo.class).setParameter("trackingId", null).getSingleResult();
    } catch (NoResultException e) {
      Logger logger = Logger.getLogger(JpaCargoRepository.class.getName());
      logger.log(Level.FINE, "Find called on non-existant tracking ID.", e);
      cargo = null;
    }
    assertEquals(cargo, new JpaCargoRepository().find(null));
  }

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_IfFQ0_fid2() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertEquals("TrackingId{idString='CARGO'}", trackingId.toString());
  }
}