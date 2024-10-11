/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.io.BufferedReader;
import java.sql.DatabaseMetaData;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_TradeDirectDBUtils_Coverage_Test_Failing {
  private BufferedReader br;
  private DatabaseMetaData dbmd;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCheckDBProductName_NullDatabaseProductName_TboZ4() throws Exception {
    TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
    when(dbmd.getDatabaseProductName()).thenReturn(null);
    String dbProductName = tradeDirectDBUtils.checkDBProductName();
    assertEquals(null, dbProductName);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCheckDBProductName_EmptyDatabaseProductName_ezxF5() throws Exception {
    TradeDirectDBUtils tradeDirectDBUtils = new TradeDirectDBUtils();
    when(dbmd.getDatabaseProductName()).thenReturn("");
    String dbProductName = tradeDirectDBUtils.checkDBProductName();
    assertEquals("", dbProductName);
  }
}