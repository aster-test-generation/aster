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
import static org.mockito.Mockito.when;

public class Aster_TimerStat_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAvgSecs_1_jlbe0() {
    TimerStat timerStat = new TimerStat();
    double totalTime = 1000.0;
    int count = 2;
    double expectedAvg = 500.0;
    when(timerStat.getTotalTime()).thenReturn(totalTime);
    when(timerStat.getCount()).thenReturn(count);
    double actualAvg = timerStat.getAvgSecs();
    assertEquals(expectedAvg, actualAvg, 0.001);
  }
}