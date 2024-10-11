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
  public void testNullSafe_1_zHvo0() throws Exception {
    String actual = null;
    String safe = "safe";
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_2_lmBX1() throws Exception {
    String actual = "actual";
    String safe = "safe";
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_3_OnGS2() throws Exception {
    Integer actual = null;
    Integer safe = 1;
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_4_MoZC3() throws Exception {
    Integer actual = 2;
    Integer safe = 1;
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_5_bghY4() throws Exception {
    Boolean actual = null;
    Boolean safe = true;
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_6_xlhx5() throws Exception {
    Boolean actual = false;
    Boolean safe = true;
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_7_ktOg6() throws Exception {
    Object actual = null;
    Object safe = new Object();
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_8_EmEW7() throws Exception {
    Object actual = new Object();
    Object safe = new Object();
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_9_qljB8() throws Exception {
    String[] actual = null;
    String[] safe = new String[]{"safe"};
    assertEquals(safe, DomainObjectUtils.nullSafe(actual, safe));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testNullSafe_10_oQTC9() throws Exception {
    String[] actual = new String[]{"actual"};
    String[] safe = new String[]{"safe"};
    assertEquals(actual, DomainObjectUtils.nullSafe(actual, safe));
  }
}