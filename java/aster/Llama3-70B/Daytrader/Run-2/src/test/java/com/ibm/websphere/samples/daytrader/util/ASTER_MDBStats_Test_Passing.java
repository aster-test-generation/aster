/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MDBStats_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstance_VXfn0() {
    MDBStats mdbStats = MDBStats.getInstance();
    assertNotNull(mdbStats);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInstance_multipleCalls_vZeE1() {
    MDBStats mdbStats1 = MDBStats.getInstance();
    MDBStats mdbStats2 = MDBStats.getInstance();
    assertSame(mdbStats1, mdbStats2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddTiming_UpdateMax_TjwS1_BqlC0_1_fid3() {
    MDBStats mdbStats = MDBStats.getInstance();
    mdbStats.addTiming("type", 100, 200);
    TimerStat timerStat = mdbStats.addTiming("type", 50, 250);
    assertEquals(2, timerStat.getCount());}
}