/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.location;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnLocode_Test_Passing {
  private UnLocode unlocode;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentObjectSameValue_QbZr1() {
    UnLocode unLocode1 = new UnLocode("USCHI");
    UnLocode unLocode2 = new UnLocode("USCHI");
    assertTrue(unLocode1.equals(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_DifferentObject_Tbkb1() {
    UnLocode unLocode1 = new UnLocode("USCHI");
    UnLocode unLocode2 = new UnLocode("USCHI");
    assertTrue(unLocode1.sameValueAs(unLocode2));
  }
}