/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
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
public class Aster_JpaCargoRepository_Test_Failing {
  @PersistenceContext
  private EntityManager entityManager;
  @Inject
  @CargoUpdated
  private Event<Cargo> cargoUpdated;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAllWithEmptyResult_QAHU1_1() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    assertTrue(cargos.isEmpty());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAllWithEmptyResult_QAHU1_2() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    assertEquals(0, cargos.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAllWithInvalidParameters_SRcq4_1() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    assertNotNull(cargos);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAllWithInvalidParameters_SRcq4_2() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    assertNotNull(cargos);
    assertEquals(0, cargos.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithValidTrackingId_dizT0_1() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("valid_tracking_id");
    Cargo cargo = repository.find(trackingId);
    assertNotNull(cargo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithValidTrackingId_dizT0_2() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("valid_tracking_id");
    Cargo cargo = repository.find(trackingId);
    assertNotNull(cargo);
    assertEquals(trackingId, cargo.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithInvalidTrackingId_jPlC1() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("invalid_tracking_id");
    Cargo cargo = repository.find(trackingId);
    assertNull(cargo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullTrackingId_cFZg2() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = null;
    Cargo cargo = repository.find(trackingId);
    assertNull(cargo);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_cfbL0_rBCx1_1() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    assertNotNull(cargos);
    assertFalse(cargos.isEmpty());
    for (Cargo cargo : cargos) {
      assertNotNull(cargo);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_cfbL0_rBCx1_2() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    for (Cargo cargo : cargos) {
      assertNotNull(cargo);
    }
    assertEquals(10, cargos.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_opyd0() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertNotNull(trackingId);
    assertEquals(12, trackingId.getIdString().length());
    assertTrue(trackingId.getIdString().matches("[A-Z0-9]{12}"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithValidTrackingId_dizT0_2_fid3() {
    JpaCargoRepository repository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("valid_tracking_id");
    Cargo cargo = repository.find(trackingId);
    assertEquals(trackingId, cargo.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_opyd0_2_fid3() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertEquals(12, trackingId.getIdString().length());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNextTrackingId_opyd0_3_fid3() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = jpaCargoRepository.nextTrackingId();
    assertTrue(trackingId.getIdString().matches("[A-Z0-9]{12}"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_cfbL0_rBCx1_1_fid3() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    for (Cargo cargo : cargos) {
    }
    assertNotNull(cargos);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_cfbL0_rBCx1_2_fid3() {
    JpaCargoRepository repository = new JpaCargoRepository();
    List<Cargo> cargos = repository.findAll();
    for (Cargo cargo : cargos) {
    }
    assertEquals(10, cargos.size());
  }
}