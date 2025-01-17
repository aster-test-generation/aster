/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.location;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnLocode_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_diffObject_gQDf1() {
    UnLocode unLocode = new UnLocode();
    UnLocode other = new UnLocode();
    boolean actual = unLocode.sameValueAs(other);
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_sameObject_deZc2() {
    UnLocode unLocode = new UnLocode();
    boolean actual = unLocode.sameValueAs(unLocode);
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_sameValueAs_sameValue_GwSK3() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    UnLocode other = new UnLocode("countryAndLocation");
    boolean actual = unLocode.sameValueAs(other);
    boolean expected = true;
    assertEquals(expected, actual);
  }
}