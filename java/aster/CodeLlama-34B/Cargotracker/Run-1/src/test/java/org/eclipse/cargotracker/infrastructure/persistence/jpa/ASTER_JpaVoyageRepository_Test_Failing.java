/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.infrastructure.persistence.jpa;

import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.voyage.Voyage;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaVoyageRepository_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithNullVoyageNumber_sJeG1() {
    VoyageNumber voyageNumber = null;
    JpaVoyageRepository repository = new JpaVoyageRepository();
    Voyage result = repository.find(voyageNumber);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindWithInvalidVoyageNumber_ZLmL2() {
    VoyageNumber voyageNumber = new VoyageNumber("invalid");
    JpaVoyageRepository repository = new JpaVoyageRepository();
    Voyage result = repository.find(voyageNumber);
    assertNull(result);
  }
}