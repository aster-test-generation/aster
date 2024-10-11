/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet2Servlet_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_QGRN0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2Servlet servlet = new PingServlet2Servlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        try {
            servlet.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        verify(request, times(1)).setAttribute(eq("ab"), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_FQPV1() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2Servlet servlet = new PingServlet2Servlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        try {
            servlet.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        verify(request, times(1)).setAttribute(eq("ab"), any());
        verify(request, times(1)).getRequestDispatcher(eq("/servlet/PingServlet2ServletRcv"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_cNIk4_KbPJ0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2Servlet servlet = new PingServlet2Servlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        try {
            servlet.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        verify(request, times(1)).setAttribute(eq("ab"), any());
        verify(request, times(1)).getRequestDispatcher(eq("/servlet/PingServlet2ServletRcv"));
        verify(request, times(1)).setAttribute(eq("ex"), any());
        verify(response, times(1)).sendError(eq(500), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_cUgJ5_UeNs0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet2Servlet servlet = new PingServlet2Servlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        try {
            servlet.doGet(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
        verify(request, times(1)).setAttribute(eq("ab"), any());
        verify(request, times(1)).getRequestDispatcher(eq("/servlet/PingServlet2ServletRcv"));
        verify(request, times(1)).setAttribute(eq("ex"), any());
        verify(request, times(1)).getRequestDispatcher(eq("/servlet/PingServlet2ServletRcv"));
    }
}