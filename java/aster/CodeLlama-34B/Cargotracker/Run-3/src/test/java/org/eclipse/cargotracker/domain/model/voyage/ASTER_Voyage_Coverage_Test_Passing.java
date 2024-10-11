/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.voyage;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Voyage_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NotInstanceOfVoyage_IWbg0() {
    Voyage voyage = new Voyage();
    Object obj = new Object();
    assertFalse(voyage.equals(obj));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_Null_igMV1() {
    Voyage voyage = new Voyage();
    assertFalse(voyage.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAs_UeYh0() {
    Voyage voyage1 = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("123"), new Schedule());
    assertTrue(voyage1.sameIdentityAs(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsWithNull_TiQm1() {
    Voyage voyage1 = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = null;
    assertFalse(voyage1.sameIdentityAs(voyage2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameIdentityAsWithDifferentVoyageNumber_VOQZ2() {
    Voyage voyage1 = new Voyage(new VoyageNumber("123"), new Schedule());
    Voyage voyage2 = new Voyage(new VoyageNumber("456"), new Schedule());
    assertFalse(voyage1.sameIdentityAs(voyage2));
  }
}