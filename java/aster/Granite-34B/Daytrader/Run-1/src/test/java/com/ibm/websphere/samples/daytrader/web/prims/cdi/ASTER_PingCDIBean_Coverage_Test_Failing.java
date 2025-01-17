/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingCDIBean_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_xPMj0() throws java.lang.Exception {
        PingCDIBean bean = new PingCDIBean();
        int result = bean.getBeanMangerViaJNDI();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBeanMangerViaCDICurrent_01_swBF0() throws Exception {
        PingCDIBean obj0 = new PingCDIBean();
        int int0 = obj0.getBeanMangerViaCDICurrent();
        assertEquals(1, int0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getBeanMangerViaCDICurrent_02_EvWu1() throws Exception {
        PingCDIBean obj0 = new PingCDIBean();
        int int0 = obj0.getBeanMangerViaCDICurrent();
        assertEquals(0, int0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_feKZ1_fid2() throws java.lang.Exception {
        PingCDIBean bean = new PingCDIBean();
        int result = bean.getBeanMangerViaJNDI();
        assertEquals(0, result);
    }
}