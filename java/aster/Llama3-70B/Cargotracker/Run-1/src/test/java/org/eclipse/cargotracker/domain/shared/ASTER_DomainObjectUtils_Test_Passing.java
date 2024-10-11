/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.shared;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DomainObjectUtils_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_1_ijsJ0() {
    String actual = null;
    String safe = "safe";
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_2_iwpN1() {
    String actual = "actual";
    String safe = "safe";
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_3_aQlk2() {
    Integer actual = null;
    Integer safe = 10;
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_4_YDYb3() {
    Integer actual = 20;
    Integer safe = 10;
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_5_NAPN4() {
    Boolean actual = null;
    Boolean safe = true;
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_6_Fcqd5() {
    Boolean actual = false;
    Boolean safe = true;
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_7_CMxt6() {
    Object actual = null;
    Object safe = new Object();
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_8_fqSo7() {
    Object actual = new Object();
    Object safe = new Object();
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_9_VVRy8() {
    String[] actual = null;
    String[] safe = new String[]{"safe"};
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_10_bPuC9() {
    String[] actual = new String[]{"actual"};
    String[] safe = new String[]{"safe"};
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }
}