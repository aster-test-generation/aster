/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.shared;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DomainObjectUtils_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_BothNull_UuDw0() {
    Integer actual = null;
    Integer safe = null;
    Integer result = DomainObjectUtils.nullSafe(actual, safe);
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_ActualNull_NdbU1() {
    Integer actual = null;
    Integer safe = 10;
    Integer result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(Integer.valueOf(10), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_SafeNull_wRYR2() {
    Integer actual = 20;
    Integer safe = null;
    Integer result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(Integer.valueOf(20), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_NoneNull_uhuG3() {
    Integer actual = 30;
    Integer safe = 40;
    Integer result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(Integer.valueOf(30), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_StringActualNull_XUEG4() {
    String actual = null;
    String safe = "default";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals("default", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_StringNoneNull_Hqfj5() {
    String actual = "actual";
    String safe = "default";
    String result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals("actual", result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_ObjectActualNull_TpTL6_1() {
    Object actual = null;
    Object safe = new Object();
    Object result = DomainObjectUtils.nullSafe(actual, safe);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_ObjectActualNull_TpTL6_2() {
    Object actual = null;
    Object safe = new Object();
    Object result = DomainObjectUtils.nullSafe(actual, safe);
    assertSame(safe, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_ObjectNoneNull_LwTd7_1() {
    Object actual = new Object();
    Object safe = new Object();
    Object result = DomainObjectUtils.nullSafe(actual, safe);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_ObjectNoneNull_LwTd7_2() {
    Object actual = new Object();
    Object safe = new Object();
    Object result = DomainObjectUtils.nullSafe(actual, safe);
    assertSame(actual, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_BooleanActualNull_OtCO8() {
    Boolean actual = null;
    Boolean safe = true;
    Boolean result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(Boolean.TRUE, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_BooleanNoneNull_UoGq9() {
    Boolean actual = false;
    Boolean safe = true;
    Boolean result = DomainObjectUtils.nullSafe(actual, safe);
    assertEquals(Boolean.FALSE, result);
  }
}