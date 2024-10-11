/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.location;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnLocode_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_equal_iUXA0() {
    UnLocode unLocode1 = new UnLocode("ABC");
    UnLocode unLocode2 = new UnLocode("ABC");
    assertTrue(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_notEqual_ZIYf1() {
    UnLocode unLocode1 = new UnLocode("ABC");
    UnLocode unLocode2 = new UnLocode("DEF");
    assertFalse(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_null_lUyh2() {
    UnLocode unLocode1 = new UnLocode("ABC");
    assertFalse(unLocode1.sameValueAs(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullObject_kPTx0() {
    UnLocode unLocode = new UnLocode("US");
    assertFalse(unLocode.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentClass_rClu1() {
    UnLocode unLocode = new UnLocode("US");
    assertFalse(unLocode.equals(new Object()));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SameValue_LAZE2() {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("US");
    assertTrue(unLocode1.equals(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentValue_krYX3() {
    UnLocode unLocode1 = new UnLocode("US");
    UnLocode unLocode2 = new UnLocode("CA");
    assertFalse(unLocode1.equals(unLocode2));
  }
}