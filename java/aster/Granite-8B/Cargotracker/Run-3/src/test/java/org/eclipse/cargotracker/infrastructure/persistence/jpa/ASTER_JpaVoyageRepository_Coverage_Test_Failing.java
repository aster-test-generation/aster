/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaVoyageRepository_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullVoyageNumber_ECXd1() {
    JpaVoyageRepository repository = new JpaVoyageRepository();
    VoyageNumber voyageNumber = null;
    try {
      repository.find(voyageNumber);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithEmptyVoyageNumber_pvfm2() {
    JpaVoyageRepository repository = new JpaVoyageRepository();
    VoyageNumber voyageNumber = new VoyageNumber("");
    try {
      repository.find(voyageNumber);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_oxWb0() {
    JpaVoyageRepository repository = new JpaVoyageRepository();
    List<Voyage> result = repository.findAll();
  }
}