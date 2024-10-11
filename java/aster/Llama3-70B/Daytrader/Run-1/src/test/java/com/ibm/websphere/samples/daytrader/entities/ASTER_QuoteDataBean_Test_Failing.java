/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.entities;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuoteDataBean_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHashCode_SymbolNotNull_wmCt0_fid1() {
    QuoteDataBean quoteDataBean = new QuoteDataBean("symbol");
    assertEquals(115, quoteDataBean.hashCode());
  }
}