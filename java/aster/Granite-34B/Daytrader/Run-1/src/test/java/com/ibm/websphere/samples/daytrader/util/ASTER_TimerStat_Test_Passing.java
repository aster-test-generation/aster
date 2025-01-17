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
    public void testSetCount_OHcQ0() {
        TimerStat timerStat = new TimerStat();
        timerStat.setCount(10);
        assertEquals(10, timerStat.getCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCountWithZero_JxKB1() {
        TimerStat timerStat = new TimerStat();
        timerStat.setCount(0);
        assertEquals(0, timerStat.getCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCountWithNegativeNumber_mRzt2() {
        TimerStat timerStat = new TimerStat();
        timerStat.setCount(-10);
        assertEquals(-10, timerStat.getCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMax_RKVF0() {
        TimerStat timerStat = new TimerStat();
        double result = timerStat.getMax();
        Assertions.assertEquals(0.0, result, 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLineCoverage_TVrT1() {
        TimerStat timerStat = new TimerStat();
        double result = timerStat.getAvgSecs();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setTotalTimeTest_vBrj0() {
        TimerStat timerStat = new TimerStat();
        timerStat.setTotalTime(10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setTotalTimeZeroTest_gdaY1() {
        TimerStat timerStat = new TimerStat();
        timerStat.setTotalTime(0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setTotalTimeNegativeTest_Zotk2() {
        TimerStat timerStat = new TimerStat();
        timerStat.setTotalTime(-10.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getCountTest_xHKq0() {
        TimerStat timerStat = new TimerStat();
        int actual = timerStat.getCount();
        int expected = 0; // Initialize expected value based on the method's return type
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void getCountTest_whenCountIs5_thenReturns5_TzbR1() {
        TimerStat timerStat = new TimerStat();
        int actual = timerStat.getCount();
        int expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMaxSecs_futI0() {
        TimerStat timerStat = new TimerStat();
        double max = 1000.0;
        double expected = max / 1000.0;
        double actual = timerStat.getMaxSecs();
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual, 1.0);
    }
}