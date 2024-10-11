/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MDBStats_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetInstance_notNull_fWcH1() {
    MDBStats mdbStats = MDBStats.getInstance();
    assertNotNull(mdbStats);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_sendTimeGreaterThanRecvTime_MBqB1_SlVg0() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 2000, 1000);
    assertNotNull(stats);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_sendTimeEqualToRecvTime_yjxP2_paOn0_1() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 1000);
    assertNotNull(stats);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_sendTimeLessThanRecvTime_ACwI3_xXNH0_1() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 2000);
    assertNotNull(stats);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_sendTimeLessThanRecvTime_ACwI3_xXNH0_5() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 2000);
    assertEquals(1000, stats.getMax());
  }
}