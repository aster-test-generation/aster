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
  public void testNullSafeWhenActualIsNull_QmTr0() throws Exception {
    String actual = null;
    String safe = "safe";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(safe, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafeWhenActualIsNonNull_mQEb1() throws Exception {
    String actual = "actual";
    String safe = "safe";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(actual, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafeWhenActualAndSafeAreNull_gjbM2() throws Exception {
    String actual = null;
    String safe = null;
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafeWhenActualIsNonNullAndSafeIsNull_pnyV4() throws Exception {
    String actual = "actual";
    String safe = null;
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(actual, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafeWhenActualAndSafeAreDifferentTypes_WTFV6() throws Exception {
    Integer actual = 10;
    String safe = "safe";
    Object result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(actual, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafeWhenActualAndSafeAreTheSameInstance_Gvei8() throws Exception {
    String actual = "actual";
    String result = DomainObjectUtils.nullSafe(actual, actual);
    assertEquals(actual, result);
  }
}