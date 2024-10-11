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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServlet2IncludeRcv_Test_Failing {
    @Mock
    private HttpServletRequest req;
    @Mock
    private HttpServletResponse res;
    private PingServlet2IncludeRcv pingServlet2IncludeRcv;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost() throws ServletException, IOException {
        pingServlet2IncludeRcv = new PingServlet2IncludeRcv();
        // Set up expectations for the mock objects
        when(req.getParameter("param1")).thenReturn("value1");
        when(req.getParameter("param2")).thenReturn("value2");
        // Call the method under test
        pingServlet2IncludeRcv.doPost(req, res);
        // Verify that the expected interactions occurred
        verify(req).getParameter("param1");
        verify(req).getParameter("param2");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_XJqa1() throws ServletException, IOException {
        PingServlet2IncludeRcv servlet = new PingServlet2IncludeRcv();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse res = new MockHttpServletResponse();
        servlet.doPost(req, res);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet() throws Exception {
        pingServlet2IncludeRcv = new PingServlet2IncludeRcv();
        pingServlet2IncludeRcv.doGet(req, res);
        // Add assertions here to verify the behavior of the doGet method
        verify(req, times(1)).getAttribute("name");
        verify(res, times(1)).getWriter();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_fid2() throws Exception {
        PingServlet2IncludeRcv pingServlet2IncludeRcv = new PingServlet2IncludeRcv();
        pingServlet2IncludeRcv.doGet(req, res);
        // Add assertions here to verify the behavior of the doGet method
        verify(req, times(1)).getAttribute("name");
        verify(res, times(1)).getWriter();
    }
}