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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_QhZB0() {
        PingServlet servlet = new PingServlet();
        String expected = "Basic dynamic HTML generation through a servlet";
        assertEquals(expected, servlet.getServletInfo());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetContentType_Lkas0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet servlet = new PingServlet();
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(null, response);
        verify(response).setContentType("text/html");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSendError_PCMF4() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet servlet = new PingServlet();
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doGet(null, response);
        verify(response).sendError(eq(500), any(String.class));
    }

    @Test
    public void testDoPostException_PZav1_sSbu0() throws javax.servlet.ServletException, java.io.IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        PingServlet servlet = new PingServlet();
        servlet.doPost(req, res);
        verify(res, times(1)).sendError(500, "javax.servlet.http.HttpServletResponse is abstract; cannot be instantiated");
    }
}