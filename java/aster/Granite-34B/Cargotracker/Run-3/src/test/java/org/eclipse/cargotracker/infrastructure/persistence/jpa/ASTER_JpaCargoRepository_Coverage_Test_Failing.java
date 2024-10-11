/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaCargoRepository_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_BQZY0() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    List<Cargo> result = jpaCargoRepository.findAll();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullCargo_IIlf2() {
    TrackingId trackingId = new TrackingId("id");
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    Cargo result = jpaCargoRepository.find(trackingId);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullTrackingId_qucv3() {
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    Cargo result = jpaCargoRepository.find(null);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithEmptyTrackingId_cjvl4() {
    TrackingId trackingId = new TrackingId("");
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    Cargo result = jpaCargoRepository.find(trackingId);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullParameter_PKwg5() {
    TrackingId trackingId = null;
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    Cargo result = jpaCargoRepository.find(trackingId);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullCargo_IIlf2_fid2() {
    TrackingId trackingId = new TrackingId("id");
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    Cargo result = jpaCargoRepository.find(trackingId);
    Assertions.assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullParameterException_GhdK8_fid2() {
    TrackingId trackingId = null;
    JpaCargoRepository jpaCargoRepository = new JpaCargoRepository();
    Cargo result = jpaCargoRepository.find(trackingId);
    Assertions.assertNull(result);
  }
}