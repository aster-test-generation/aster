/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_MDBStats_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_NewType_LuIu0_tGhB0_2() {
    MDBStats mdbStats = MDBStats.getInstance();
    TimerStat result = mdbStats.addTiming("newType", 1000, 2000);
    assertEquals(1000, result.getTotalTime(), 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_ExistingType_TgJr1_VjDI0_2() {
    MDBStats mdbStats = MDBStats.getInstance();
    mdbStats.addTiming("existingType", 1000, 2000);
    TimerStat result = mdbStats.addTiming("existingType", 2000, 4000);
    assertEquals(3000, result.getTotalTime(), 0.001);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testAddTiming_UpdateMax_TOdD2_FLwA0_2() {
    MDBStats mdbStats = MDBStats.getInstance();
    mdbStats.addTiming("updateMax", 1000, 2000);
    TimerStat result = mdbStats.addTiming("updateMax", 2000, 5000);
    assertEquals(4000, result.getMax(), 0.001);
  }
}