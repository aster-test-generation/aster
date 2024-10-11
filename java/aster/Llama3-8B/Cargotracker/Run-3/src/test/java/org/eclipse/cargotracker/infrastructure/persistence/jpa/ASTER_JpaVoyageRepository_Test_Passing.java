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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaVoyageRepository_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_sfsa0() throws Exception {
    JpaVoyageRepository repository = new JpaVoyageRepository();
    VoyageNumber voyageNumber = new VoyageNumber("123");
    Voyage voyage = repository.find(voyageNumber);
    assert voyage != null;
  }
}