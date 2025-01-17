/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_PingServlet2Session2CMROne2One_Coverage_Test_Passing {
    PingServlet2Session2CMROne2One servlet;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_unvB2_cFGF0() throws ServletException {
        ServletConfig config = mock(ServletConfig.class);
        when(config.getServletName()).thenReturn("PingServlet2Session2CMROne2One");
        when(config.getInitParameter("runTimeStats")).thenReturn("N");
        when(config.getInitParameter("maxUsers")).thenReturn("1000");
        when(config.getInitParameter(" primIterations")).thenReturn("1");
        when(config.getInitParameter("orderProcessingMode")).thenReturn("SYNCH");
        when(config.getInitParameter("outputBuffer")).thenReturn("2000");
        servlet.init(config);
    }
}