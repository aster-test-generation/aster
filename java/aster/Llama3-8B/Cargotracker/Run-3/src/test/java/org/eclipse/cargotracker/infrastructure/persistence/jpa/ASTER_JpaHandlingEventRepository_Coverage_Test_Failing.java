/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaHandlingEventRepository_Coverage_Test_Failing {
  public void verifyNamedQueryCalled(String queryName, Class<?> clazz) {
  }

  public void verifySetParameterCalled(String parameterName, Object parameterValue) {
  }

  public void verifyGetResultSetListCalled_HPFD6() {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNamedQuery_aGHP1() {
    JpaHandlingEventRepository jpaHandlingEventRepository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("testTrackingId");
    jpaHandlingEventRepository.lookupHandlingHistoryOfCargo(trackingId);
    verifyNamedQueryCalled("HandlingEvent.findByTrackingId", HandlingEvent.class);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetParameter_WwDD2() {
    JpaHandlingEventRepository jpaHandlingEventRepository = new JpaHandlingEventRepository();
    TrackingId trackingId = new TrackingId("testTrackingId");
    jpaHandlingEventRepository.lookupHandlingHistoryOfCargo(trackingId);
    verifySetParameterCalled("trackingId", trackingId);
  }
}