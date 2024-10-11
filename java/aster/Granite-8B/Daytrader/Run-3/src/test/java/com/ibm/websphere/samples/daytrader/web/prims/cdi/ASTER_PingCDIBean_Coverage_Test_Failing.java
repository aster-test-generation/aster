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
    private PingCDIBean pingCDIBean = new PingCDIBean();

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_gQvk0() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.getBeanMangerViaCDICurrent();
        assertEquals(1, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_CVrA2_cMQW0() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.getBeanMangerViaJNDI();
        assertEquals(3, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_OKfT4_rfJn0() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.getBeanMangerViaJNDI();
        assertEquals(5, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_gvcO3_uKHK0() throws java.lang.Exception {
        PingCDIBean pingCDIBean = new PingCDIBean();
        int result = pingCDIBean.getBeanMangerViaJNDI();
        assertEquals(4, result);
    }
}