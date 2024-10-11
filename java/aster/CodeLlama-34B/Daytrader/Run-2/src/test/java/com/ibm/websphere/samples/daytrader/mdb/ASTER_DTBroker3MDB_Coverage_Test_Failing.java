/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DTBroker3MDB_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBoostrapTradeServices_bZGA0() {
    DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
    dtBroker3MDB.boostrapTradeServices();
    assertNotNull(dtBroker3MDB);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testBoostrapTradeServices_bZGA0_fid1() {
    DTBroker3MDB dtBroker3MDB = new DTBroker3MDB();
    dtBroker3MDB.boostrapTradeServices();
  }
}