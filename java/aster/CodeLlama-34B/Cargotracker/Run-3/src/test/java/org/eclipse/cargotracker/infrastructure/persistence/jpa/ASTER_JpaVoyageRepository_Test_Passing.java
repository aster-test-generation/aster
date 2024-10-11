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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JpaVoyageRepository_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_OmJD0_1() throws Exception {
    JpaVoyageRepository jpaVoyageRepository = new JpaVoyageRepository();
    List<Voyage> voyages = jpaVoyageRepository.findAll();
    assertNotNull(voyages);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFindAll_OmJD0_2() throws Exception {
    JpaVoyageRepository jpaVoyageRepository = new JpaVoyageRepository();
    List<Voyage> voyages = jpaVoyageRepository.findAll();
    assertEquals(10, voyages.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_cEwZ0_1() throws Exception {
    JpaVoyageRepository jpaVoyageRepository = new JpaVoyageRepository();
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Voyage voyage = jpaVoyageRepository.find(voyageNumber);
    assertNotNull(voyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testFind_cEwZ0_2() throws Exception {
    JpaVoyageRepository jpaVoyageRepository = new JpaVoyageRepository();
    VoyageNumber voyageNumber = new VoyageNumber("12345");
    Voyage voyage = jpaVoyageRepository.find(voyageNumber);
    assertEquals(voyageNumber, voyage.getVoyageNumber());
  }
}