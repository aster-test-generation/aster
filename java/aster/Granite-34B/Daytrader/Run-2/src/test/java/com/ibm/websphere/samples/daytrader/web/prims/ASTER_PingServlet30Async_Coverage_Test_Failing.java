/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingServlet30Async_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_aVrH0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        assertNotNull(servlet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_sbiZ0() {
        PingServlet30Async servlet = new PingServlet30Async();
        String expected = "Basic dynamic HTML generation through a servlet";
        String actual = servlet.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit_iAYn0() throws javax.servlet.ServletException {
        PingServlet30Async servlet = new PingServlet30Async();
        servlet.init(null);
        Assertions.assertNotNull(servlet);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit4_qbbU3() throws javax.servlet.ServletException {
        PingServlet30Async servlet = new PingServlet30Async();
        servlet.init(null);
        Assertions.assertNotNull(servlet.getServletConfig());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_QAEk0() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        assertEquals(response.getContentType(), "text/html");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_zCnv1() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        AsyncContext context = request.startAsync();
        assertEquals(context, request.startAsync());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_DJYa2() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        StringBuilder sb = new StringBuilder();
        ServletInputStream input = request.getInputStream();
        byte[] b = new byte[1024];
        int len = -1;
        while ((len = input.read(b)) != -1) {
            String data = new String(b, 0, len);
            sb.append(data);
        }
        assertEquals(sb.toString(), "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_LabS4() throws javax.servlet.ServletException, java.io.IOException {
        PingServlet30Async servlet = new PingServlet30Async();
        HttpServletRequest request = new MockHttpServletRequest();
        HttpServletResponse response = new MockHttpServletResponse();
        servlet.doPost(request, response);
        AsyncContext context = request.startAsync();
        context.complete();
        assertEquals(context.toString(), "Completed");
    }
}