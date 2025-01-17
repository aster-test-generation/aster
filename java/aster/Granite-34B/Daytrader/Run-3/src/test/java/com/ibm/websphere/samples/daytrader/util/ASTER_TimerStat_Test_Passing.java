/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_TimerStat_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMax_DiJV0() {
    TimerStat timerStat = new TimerStat();
    double max = 100.0;
    timerStat.setMax(max);
    assertEquals(max, timerStat.getMax());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxZero_dEGg1() {
    TimerStat timerStat = new TimerStat();
    double max = 0.0;
    timerStat.setMax(max);
    assertEquals(max, timerStat.getMax());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMaxNegative_nlDS2() {
    TimerStat timerStat = new TimerStat();
    double max = -100.0;
    timerStat.setMax(max);
    assertEquals(max, timerStat.getMax());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalTime_xqxG0() {
    TimerStat timerStat = new TimerStat();
    timerStat.setTotalTime(10.5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalTimeWithZeroValue_ZNkk1() {
    TimerStat timerStat = new TimerStat();
    timerStat.setTotalTime(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalTimeWithNegativeValue_PGpt2() {
    TimerStat timerStat = new TimerStat();
    timerStat.setTotalTime(-5.5);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCount_RwWx0() {
    TimerStat timerStat = new TimerStat();
    timerStat.setCount(10);
    assertEquals(10, timerStat.getCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCount_zero_UwBP1() {
    TimerStat timerStat = new TimerStat();
    timerStat.setCount(0);
    assertEquals(0, timerStat.getCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCount_negative_nkpO2() {
    TimerStat timerStat = new TimerStat();
    timerStat.setCount(-1);
    assertEquals(-1, timerStat.getCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMin_rqQI0() {
    TimerStat timerStat = new TimerStat();
    double min = timerStat.getMin();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMinWithZeroValue_DEgm2() {
    TimerStat timerStat = new TimerStat();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCount_HKAd0() {
    TimerStat timerStat = new TimerStat();
    int expected = 0;
    int actual = timerStat.getCount();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMinTest_IGim0() {
    TimerStat timerStat = new TimerStat();
    timerStat.setMin(0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMinTest_taHB1() {
    TimerStat timerStat = new TimerStat();
    timerStat.setMin(1.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMinTest_HSIL2() {
    TimerStat timerStat = new TimerStat();
    timerStat.setMin(-1.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMinTest_sbiW3() {
    TimerStat timerStat = new TimerStat();
    timerStat.setMin(Double.MAX_VALUE);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMinTest_qnTo4() {
    TimerStat timerStat = new TimerStat();
    timerStat.setMin(Double.MIN_VALUE);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void setMinTest_MiwF5() {
    TimerStat timerStat = new TimerStat();
    timerStat.setMin(Double.NaN);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalTime_upKG0() {
    TimerStat timerStat = new TimerStat();
    double totalTime = timerStat.getTotalTime();
    assertEquals(0.0, totalTime, 0.0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMax_lBjS0_ZHkq0() {
    TimerStat timerStat = new TimerStat();
    double actual = timerStat.getMax();
    double expected = timerStat.getMax();
    Assertions.assertEquals(expected, actual, 0.0);
  }
}