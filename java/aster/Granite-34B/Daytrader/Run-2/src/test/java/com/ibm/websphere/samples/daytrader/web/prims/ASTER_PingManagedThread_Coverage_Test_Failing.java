/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingManagedThread_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_PlVj0() {
        PingManagedThread managedThread = new PingManagedThread();
        String result = managedThread.getServletInfo();
        assertEquals("Tests a ManagedThread asynchronous servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_bPej0() throws javax.servlet.ServletException, java.io.IOException {
        PingManagedThread pingManagedThread = new PingManagedThread();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithServletConfig_wFtu0() throws javax.servlet.ServletException {
        PingManagedThread pingManagedThread = new PingManagedThread();
        ServletConfig servletConfig = mock(ServletConfig.class);
        try {
            pingManagedThread.init(servletConfig);
        } catch (ServletException e) {
            e.printStackTrace();
        }
        verify(servletConfig, times(1)).getInitParameterNames();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithServletException_ekph1() throws javax.servlet.ServletException {
        PingManagedThread pingManagedThread = new PingManagedThread();
        ServletConfig servletConfig = mock(ServletConfig.class);
        doThrow(new ServletException()).when(servletConfig).getInitParameterNames();
        try {
            pingManagedThread.init(servletConfig);
        } catch (ServletException e) {
            e.printStackTrace();
        }
        verify(servletConfig, times(1)).getInitParameterNames();
    }
}