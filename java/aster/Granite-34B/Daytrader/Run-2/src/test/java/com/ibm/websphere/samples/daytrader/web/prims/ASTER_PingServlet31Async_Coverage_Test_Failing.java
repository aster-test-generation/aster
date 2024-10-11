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
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingServlet31Async_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_sRud0() {
        PingServlet31Async servlet = new PingServlet31Async();
        String result = servlet.getServletInfo();
        assertEquals("Basic dynamic HTML generation through a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_FPUO0_1() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/");
        MockHttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        request = new MockHttpServletRequest("POST", "/");
        response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertEquals(200, response.getStatus());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_cpbL0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(response, times(1)).setContentType("text/html");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_EPTA1() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(request, times(1)).startAsync();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_sVdr2() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        servlet.doPost(request, response);
        verify(request, times(1)).getInputStream();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_FPUO0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet31Async servlet = new PingServlet31Async();
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/");
        MockHttpServletResponse response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertEquals(200, response.getStatus());
        request = new MockHttpServletRequest("POST", "/");
        response = new MockHttpServletResponse();
        servlet.doGet(request, response);
        assertEquals(200, response.getStatus());
    }
}