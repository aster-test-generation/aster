/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.cdi;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletCDIBeanManagerViaCDICurrent_Coverage_Test_Passing {
PingServletCDIBeanManagerViaCDICurrent pingServletCDIBeanManagerViaCDICurrent;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void tearDown_ySEe1() throws javax.servlet.ServletException {
    pingServletCDIBeanManagerViaCDICurrent = null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInitDate_zTTU3() throws javax.servlet.ServletException {
    pingServletCDIBeanManagerViaCDICurrent.init(null);
}
}