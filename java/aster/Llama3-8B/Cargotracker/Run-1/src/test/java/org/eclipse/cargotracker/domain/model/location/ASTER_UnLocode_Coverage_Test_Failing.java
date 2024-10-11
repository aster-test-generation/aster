/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.location;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_UnLocode_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSameValueAs_osKX0() {
    UnLocode unLocode1 = new UnLocode("US LAX");
    UnLocode unLocode2 = new UnLocode("US LAX");
    assertTrue(unLocode1.sameValueAs(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_Ehwo0() {
    UnLocode unLocode = new UnLocode("US LAX");
    int expectedHashCode = 123456;
    unLocode.hashCode();
    assertEquals(expectedHashCode, unLocode.hashCode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameObject_BocC0() {
    UnLocode unLocode = new UnLocode("US LAX");
    assertTrue(unLocode.equals(unLocode));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsNull_ZFIr1() {
    UnLocode unLocode = new UnLocode("US LAX");
    assertFalse(unLocode.equals(null));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentClass_sIRE2() {
    UnLocode unLocode = new UnLocode("US LAX");
    assertFalse(unLocode.equals("Not an UnLocode"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsDifferentValue_GQnL3() {
    UnLocode unLocode1 = new UnLocode("US LAX");
    UnLocode unLocode2 = new UnLocode("US JFK");
    assertFalse(unLocode1.equals(unLocode2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEqualsSameValue_CtiS4() {
    UnLocode unLocode1 = new UnLocode("US LAX");
    UnLocode unLocode2 = new UnLocode("US LAX");
    assertTrue(unLocode1.equals(unLocode2));
  }
}