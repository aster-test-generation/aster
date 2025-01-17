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

public class Aster_TimerStat_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAvgSecs_2_IvkZ1() {
    TimerStat timerStat = new TimerStat();
    double totalTime = 1000.0;
    int count = 0;
    double expectedAvg = 0.0;
    when(timerStat.getTotalTime()).thenReturn(totalTime);
    when(timerStat.getCount()).thenReturn(count);
    double actualAvg = timerStat.getAvgSecs();
    assertEquals(expectedAvg, actualAvg, 0.001);
  }
}