/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.shared;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DomainObjectUtils_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_nullActual_returnsSafe_LNvt0() throws Exception {
    String actual = null;
    String safe = "safe";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(safe, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_nonNullActual_returnsActual_EPBw1() throws Exception {
    String actual = "actual";
    String safe = "safe";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(actual, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_nullActualAndSafe_returnsNull_ufED2() throws Exception {
    String actual = null;
    String safe = null;
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_nonNullActualAndNullSafe_returnsActual_QyoR5() throws Exception {
    String actual = "actual";
    String safe = null;
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(actual, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_nullActualAndEmptySafe_returnsEmpty_yYWj6() throws Exception {
    String actual = null;
    String safe = "";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals("", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_nonNullActualAndEmptySafe_returnsActual_chtO7() throws Exception {
    String actual = "actual";
    String safe = "";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(actual, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_nonNullActualAndNonNullSafe_returnsActual_rnlD13() throws Exception {
    String actual = "actual";
  }
}