/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.mdb;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DTStreamer3MDB_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testOnMessageWithNullMessage_AVIB0() {
    DTStreamer3MDB dtStreamer3MDB = new DTStreamer3MDB();
    dtStreamer3MDB.onMessage(null);
  }
}