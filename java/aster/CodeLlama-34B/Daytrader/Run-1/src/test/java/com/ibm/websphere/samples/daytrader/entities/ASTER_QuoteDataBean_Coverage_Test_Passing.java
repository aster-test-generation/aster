/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteDataBean_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_DifferentSymbol_yoiR0() {
    QuoteDataBean qdb1 = new QuoteDataBean("AAPL");
    QuoteDataBean qdb2 = new QuoteDataBean("GOOG");
    assertFalse(qdb1.equals(qdb2));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEquals_NullSymbol_qOvi1() {
    QuoteDataBean qdb1 = new QuoteDataBean(null);
    QuoteDataBean qdb2 = new QuoteDataBean("AAPL");
    assertFalse(qdb1.equals(qdb2));
  }
}