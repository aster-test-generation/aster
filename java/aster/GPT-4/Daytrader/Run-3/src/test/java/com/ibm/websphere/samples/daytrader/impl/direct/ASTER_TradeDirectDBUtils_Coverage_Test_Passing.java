/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TradeDirectDBUtils_Coverage_Test_Passing {
  private ResultSet resultSet;
  private TradeDirectDBUtils tradeDirectDBUtils;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setup_Xqrx0() {
    tradeDirectDBUtils = new TradeDirectDBUtils();
  }
}