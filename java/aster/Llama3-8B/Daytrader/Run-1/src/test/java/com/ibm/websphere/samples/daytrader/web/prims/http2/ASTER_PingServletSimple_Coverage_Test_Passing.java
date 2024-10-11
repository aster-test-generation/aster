/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServletSimple_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInitCallsSuperInit_PHde0_CyTV0() throws ServletException {
    PingServletSimple pingServletSimple = new PingServletSimple();
    ServletConfig config = mock(ServletConfig.class);
    pingServletSimple.init(config);
    assertEquals("init method should call super.init(config)", "GenericServlet", pingServletSimple.getClass().getSuperclass().getSimpleName());
}
}