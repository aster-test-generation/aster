/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DTBroker3MDB_Coverage_Test_Failing {
  private DTBroker3MDB dtBroker3MDB;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBoostrapTradeServices_AjmX0() {
    DTBroker3MDB broker = new DTBroker3MDB();
    broker.boostrapTradeServices();
  }
}