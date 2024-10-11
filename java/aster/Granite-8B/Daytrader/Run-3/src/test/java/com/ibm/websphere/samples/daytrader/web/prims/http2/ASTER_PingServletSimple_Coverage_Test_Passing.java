/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.http2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServletSimple_Coverage_Test_Passing {
    PingServletSimple pingServletSimple;
    private PingServletSimple servlet = new PingServletSimple();
    private String initTime = "2021-04-20";

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit4_jHXU3() throws javax.servlet.ServletException {
        pingServletSimple = new PingServletSimple();
        pingServletSimple.init(null);
        assertNotNull(pingServletSimple);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWriter_gqiV0_UYyZ0() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        try (PrintWriter respWriter = response.getWriter()) {
            servlet.doGet(request, response);
            verify(response, times(1)).getWriter();
            assertTrue(respWriter.toString().contains("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: 1</B><br>" + "<img src='images/graph.gif'>" + "</body></html>"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWriter2_nipW1_lxHO0() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        try (PrintWriter respWriter = response.getWriter()) {
            servlet.doGet(request, response);
            verify(response).getWriter();
            assertTrue(respWriter.toString().contains("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: 2</B><br>" + "<img src='images/graph.gif'>" + "</body></html>"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWriter3_qKIH2_CzYp0() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        try (PrintWriter respWriter = response.getWriter()) {
            servlet.doGet(request, response);
            verify(response, times(1)).getWriter();
            assertTrue(respWriter.toString().contains("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: 3</B><br>" + "<img src='images/graph.gif'>" + "</body></html>"));
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGetWriter4_RSvj3_URgm0() throws ServletException, IOException {
        PingServletSimple servlet = new PingServletSimple();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        try (PrintWriter respWriter = response.getWriter()) {
            servlet.doGet(request, response);
            verify(response, times(1)).getWriter();
            assertTrue(respWriter.toString().contains("<html><head><title>Ping Servlet HTTP/2</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet HTTP/2<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: 4</B><br>" + "<img src='images/graph.gif'>" + "</body></html>"));
        }
    }
}