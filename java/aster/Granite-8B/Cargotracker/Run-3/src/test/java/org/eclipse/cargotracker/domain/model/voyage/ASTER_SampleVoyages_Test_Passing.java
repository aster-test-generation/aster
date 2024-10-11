/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SampleVoyages_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAll_LDrg0() throws Exception {
    List<Voyage> expected = new ArrayList<>(SampleVoyages.ALL.values());
    List<Voyage> actual = SampleVoyages.getAll();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupWithNullVoyageNumber_wdGn0() throws Exception {
    Voyage actualVoyage = SampleVoyages.lookup(null);
    assertNotNull(actualVoyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupWithVoyageNumberThatDoesNotExist_OMCh1_1() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("DOES_NOT_EXIST");
    Voyage actualVoyage = SampleVoyages.lookup(voyageNumber);
    assertNotNull(actualVoyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupWithVoyageNumberThatDoesNotExist_OMCh1_2() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("DOES_NOT_EXIST");
    Voyage actualVoyage = SampleVoyages.lookup(voyageNumber);
    assertTrue(actualVoyage.getVoyageNumber().equals(voyageNumber));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupWithVoyageNumberThatExists_Kvge2_1() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("123456");
    Voyage actualVoyage = SampleVoyages.lookup(voyageNumber);
    assertNotNull(actualVoyage);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testLookupWithVoyageNumberThatExists_Kvge2_2() throws Exception {
    VoyageNumber voyageNumber = new VoyageNumber("123456");
    Voyage actualVoyage = SampleVoyages.lookup(voyageNumber);
    assertTrue(actualVoyage.getVoyageNumber().equals(voyageNumber));
  }
}