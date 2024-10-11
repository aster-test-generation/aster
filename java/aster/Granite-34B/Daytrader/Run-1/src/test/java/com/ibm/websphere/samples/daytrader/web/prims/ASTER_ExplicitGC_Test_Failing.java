/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ExplicitGC_Test_Failing {
    private static int hitCount;
    private static String initTime;
    ExplicitGC explicitgc;
    @Mock
    ServletConfig config;
    HttpServletRequest request;
    HttpServletResponse response;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_1() throws Exception {
        explicitgc = new ExplicitGC();
        when(config.getInitParameter("paramName")).thenReturn("paramValue");
        explicitgc.init(config);
        verify(config, times(1)).getInitParameter("paramName");
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_2() throws Exception {
        explicitgc = new ExplicitGC();
        when(config.getInitParameter("paramName")).thenReturn("paramValue");
        explicitgc.init(config);
        verify(config, times(1)).getInitParameter("paramName");
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithNullConfig_oMam1() {
        ExplicitGC explicitGC = new ExplicitGC();
        try {
            explicitGC.init(null);
            fail("Expected ServletException");
        } catch (ServletException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        explicitgc = new ExplicitGC();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        explicitgc.doPost(request, response);
        // Add meaningful assertions here
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testServletInfo_XhpC0() {
        ExplicitGC explicitGC = new ExplicitGC();
        String expected = "Generate Explicit GC to VM";
        String actual = explicitGC.getServletInfo();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testServletInfo_lineCoverage_NOgm1() {
        ExplicitGC explicitGC = new ExplicitGC();
        String actual = explicitGC.getServletInfo();
        assertEquals("Generate Explicit GC to VM", actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        explicitgc = mock(ExplicitGC.class);
        hitCount = 0;
        initTime = "2022-01-01";
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ServletOutputStream out = mock(ServletOutputStream.class);
        when(res.getOutputStream()).thenReturn(out);
        when(res.getContentType()).thenReturn("text/html");
        explicitgc.doGet(req, res);
        verify(res, times(1)).setContentType("text/html");
        verify(res, times(1)).getOutputStream();
        verify(out, times(1)).println(anyString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        explicitgc = new ExplicitGC();
        when(config.getInitParameter("paramName")).thenReturn("paramValue");
        explicitgc.init(config);
        verify(config, times(1)).getInitParameter("paramName");
        assertEquals(0, hitCount);
        assertNotNull(initTime);
    }
}