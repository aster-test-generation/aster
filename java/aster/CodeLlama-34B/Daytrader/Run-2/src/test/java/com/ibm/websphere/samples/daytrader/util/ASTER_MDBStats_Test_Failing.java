/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MDBStats_Test_Failing {
  @Test
  @Timeout(value = 3, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_validInputs_WKmq3_hfKJ0_2() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 3000, 2000);
    assertEquals(1, stats.getCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_validInputs_WKmq3_hfKJ0_3() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 2000);
    assertEquals(1000, stats.getMin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_validInputs_WKmq3_hfKJ0_4() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 2000);
    assertEquals(2000, stats.getMax());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_validInputs_WKmq3_hfKJ0_5() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 2000);
    assertEquals(1500, stats.getAvgSecs());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_validInputs_WKmq3_hfKJ0_6() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 2000);
    assertEquals(1500, stats.getTotalTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_typeNull_XuiO0_MfYq0_fid3() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming(null, 1000, 2000);
    assertNull(stats);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_validInputs_WKmq3_hfKJ0_2_fid3() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat stats = mdbStats.addTiming("type", 1000, 2000);
    assertEquals(1, stats.getCount());
  }
}