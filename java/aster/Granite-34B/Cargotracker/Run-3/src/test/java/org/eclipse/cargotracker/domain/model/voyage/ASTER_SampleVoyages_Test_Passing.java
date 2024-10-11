/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SampleVoyages_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookup_dAzM0_1() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Voyage voyage = SampleVoyages.lookup(voyageNumber);
    assertNotNull(voyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookup_dAzM0_2() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Voyage voyage = SampleVoyages.lookup(voyageNumber);
    assertEquals(voyageNumber, voyage.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookup_dAzM0_3() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Voyage voyage = SampleVoyages.lookup(voyageNumber);
    assertNotNull(voyage.getSchedule());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookup_dAzM0_4() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Voyage voyage = SampleVoyages.lookup(voyageNumber);
    assertTrue(voyage.getVoyageNumber().equals(voyage.getVoyageNumber()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookup_dAzM0_5() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Voyage voyage = SampleVoyages.lookup(voyageNumber);
    assertEquals(voyage.getVoyageNumber().hashCode(), voyage.getVoyageNumber().hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookup_dAzM0_6() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("number");
    Voyage voyage = SampleVoyages.lookup(voyageNumber);
    assertEquals(voyage.getVoyageNumber().toString(), voyage.getVoyageNumber().getIdString());
  }
}