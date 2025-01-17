/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteDataBean_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SymbolNull_vGJi0() {
    QuoteDataBean qdb1 = new QuoteDataBean("ABC");
    QuoteDataBean qdb2 = new QuoteDataBean(null);
    assertFalse(qdb1.equals(qdb2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SymbolNotEqual_SagY1() {
    QuoteDataBean qdb1 = new QuoteDataBean("ABC");
    QuoteDataBean qdb2 = new QuoteDataBean("XYZ");
    assertFalse(qdb1.equals(qdb2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_SymbolEqual_VUPI2() {
    QuoteDataBean qdb1 = new QuoteDataBean("ABC");
    QuoteDataBean qdb2 = new QuoteDataBean("ABC");
    assertTrue(qdb1.equals(qdb2));
  }
}