/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockServletConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_PingManagedThread_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_FmBa0() {
        PingManagedThread obj = new PingManagedThread();
        String actual = obj.getServletInfo();
        String expected = "Tests a ManagedThread asynchronous servlet";
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_sHZD0() throws javax.servlet.ServletException, java.io.IOException {
        PingManagedThread pingManagedThread = new PingManagedThread();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet1_yWKs0() throws javax.servlet.ServletException, java.io.IOException {
        PingManagedThread pingManagedThread = new PingManagedThread();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        try {
            when(res.getOutputStream()).thenReturn(out);
            when(req.startAsync()).thenReturn(asyncContext);
            pingManagedThread.doGet(req, res);
            verify(res, times(1)).getOutputStream();
            verify(req, times(1)).startAsync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet2_vBMu1() throws javax.servlet.ServletException, java.io.IOException {
        PingManagedThread pingManagedThread = new PingManagedThread();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        try {
            when(res.getOutputStream()).thenReturn(out);
            when(req.startAsync()).thenReturn(asyncContext);
            pingManagedThread.doGet(req, res);
            verify(res, times(1)).setContentType("text/html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet5_YkGv4() throws javax.servlet.ServletException, java.io.IOException {
        PingManagedThread pingManagedThread = new PingManagedThread();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        try {
            when(res.getOutputStream()).thenReturn(out);
            when(req.startAsync()).thenReturn(asyncContext);
            pingManagedThread.doGet(req, res);
            verify(asyncContext, times(1)).complete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit1_cOXY0_eyoB0_1() throws javax.servlet.ServletException, java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        PingManagedThread pmt = new PingManagedThread();
        ServletConfig config = new MockServletConfig();
        pmt.init(config);
        java.lang.reflect.Field initTimeField = PingManagedThread.class.getDeclaredField("initTime");
        initTimeField.setAccessible(true);
        java.lang.reflect.Field hitCountField = PingManagedThread.class.getDeclaredField("hitCount");
        hitCountField.setAccessible(true);
        assertEquals(initTimeField.get(pmt), new java.util.Date().toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInit1_cOXY0_eyoB0_2() throws javax.servlet.ServletException, java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        PingManagedThread pmt = new PingManagedThread();
        ServletConfig config = new MockServletConfig();
        pmt.init(config);
        java.lang.reflect.Field initTimeField = PingManagedThread.class.getDeclaredField("initTime");
        initTimeField.setAccessible(true);
        java.lang.reflect.Field hitCountField = PingManagedThread.class.getDeclaredField("hitCount");
        hitCountField.setAccessible(true);
        assertEquals(hitCountField.get(pmt), 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet4_gtwr3_ZuZO1() throws javax.servlet.ServletException, java.io.IOException {
        PingManagedThread pingManagedThread = new PingManagedThread();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        AsyncContext asyncContext = mock(AsyncContext.class);
        int hitCount = 0; // Define and initialize hitCount variable
        try {
            when(res.getOutputStream()).thenReturn(out);
            when(req.startAsync()).thenReturn(asyncContext);
            pingManagedThread.doGet(req, res);
            verify(out, times(1)).println("<b>HitCount: " + ++hitCount + "</b><br/>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}