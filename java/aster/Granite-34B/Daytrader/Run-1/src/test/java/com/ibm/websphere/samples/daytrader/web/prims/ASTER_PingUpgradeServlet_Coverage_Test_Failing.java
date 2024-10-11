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

public class Aster_PingUpgradeServlet_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithUpgradeHeader_LzVZ0() throws javax.servlet.ServletException, java.io.IOException {
        PingUpgradeServlet servlet = new PingUpgradeServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getHeader("Upgrade")).thenReturn("echo");
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(response).setStatus(101);
        verify(response).setHeader("Upgrade", "echo");
        verify(response).setHeader("Connection", "Upgrade");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithoutUpgradeHeader_xFah1() throws javax.servlet.ServletException, java.io.IOException {
        PingUpgradeServlet servlet = new PingUpgradeServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getHeader("Upgrade")).thenReturn("other");
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(response).getWriter();
        verify(response.getWriter()).println("No upgrade: other");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithNullUpgradeHeader_yUnn2() throws javax.servlet.ServletException, java.io.IOException {
        PingUpgradeServlet servlet = new PingUpgradeServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getHeader("Upgrade")).thenReturn(null);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(response).getWriter();
        verify(response.getWriter()).println("No upgrade: null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPostWithEmptyUpgradeHeader_hQWe3() throws javax.servlet.ServletException, java.io.IOException {
        PingUpgradeServlet servlet = new PingUpgradeServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getHeader("Upgrade")).thenReturn("");
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(response).getWriter();
        verify(response.getWriter()).println("No upgrade: ");
    }
}