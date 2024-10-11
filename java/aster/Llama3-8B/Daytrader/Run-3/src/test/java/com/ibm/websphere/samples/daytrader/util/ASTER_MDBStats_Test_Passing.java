/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MDBStats_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWhenNull_ZJNR0() {
        MDBStats mdbStats = MDBStats.getInstance();
        assertNotNull(mdbStats);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetInstanceWhenNotNull_ECcJ1() {
        MDBStats mdbStats = MDBStats.getInstance();
        MDBStats mdbStats2 = MDBStats.getInstance();
        assertSame(mdbStats, mdbStats2);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddTimingMultipleTimes_IyyV1_Wwdt0_2() {
    com.ibm.websphere.samples.daytrader.util.MDBStats mdbStats = com.ibm.websphere.samples.daytrader.util.MDBStats.getInstance();
    TimerStat timerStat = mdbStats.addTiming("type", 1000, 2000);
    timerStat = mdbStats.addTiming("type", 2000, 3000);
    Assertions.assertEquals(1000, timerStat.getMin());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddTimingWithNegativeTime_QqHC3_pJKa0() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddTimingMultipleTimes_IyyV1_Wwdt0_3_fid1() {
    com.ibm.websphere.samples.daytrader.util.MDBStats mdbStats = com.ibm.websphere.samples.daytrader.util.MDBStats.getInstance();
    TimerStat timerStat = mdbStats.addTiming("type", 1000, 2000);
    timerStat = mdbStats.addTiming("type", 2000, 3000);
    Assertions.assertEquals(2, timerStat.getCount());}
}