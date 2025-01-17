/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaCargoRepository_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_uvAa0() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    List<Cargo> cargoList = jpaCargoRepository.findAll();
    assertNotNull(cargoList);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testStoreWithNullCargo_HUjO0() {
    JpaCargoRepository cargoRepository = new JpaCargoRepository();
    cargoRepository.store(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind1_NeeN0() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo, null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind2_rJBH1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getTrackingId(), trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind3_IdvC2() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getRouteSpecification(), null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind4_mTBV3() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getItinerary(), null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind5_xEkm4() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getDelivery(), null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind6_LvKP5() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getOrigin(), new UnLocode("SESTO"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind7_ORso6() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getRouteSpecification().getOrigin(), null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind8_meSa7() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getRouteSpecification().getDestination(), new UnLocode("SESTO"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind6_LvKP5_fid1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getOrigin(), null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind8_meSa7_fid1() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    TrackingId trackingId = new TrackingId("id");
    Cargo cargo = jpaCargoRepository.find(trackingId);
    assertEquals(cargo.getRouteSpecification().getDestination(), null);
  }
}