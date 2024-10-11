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

public class Aster_TimerStat_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAvgSecs_oNFw0_fid2() {
        TimerStat timerStat = new TimerStat();
        timerStat.setTotalTime(1000.0);
        timerStat.setCount(2);
        double expected = 500.0;
        double actual = timerStat.getAvgSecs();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAvgSecs_zeroCount_EZRv1() {
        TimerStat timerStat = new TimerStat();
        timerStat.setTotalTime(1000.0);
        timerStat.setCount(0);
        double expected = 0.0;
        double actual = timerStat.getAvgSecs();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAvgSecs_bothZero_juvt3() {
        TimerStat timerStat = new TimerStat();
        timerStat.setTotalTime(0.0);
        timerStat.setCount(0);
        double expected = 0.0;
        double actual = timerStat.getAvgSecs();
        assertEquals(expected, actual, 0.001);
    }
}