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

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class Aster_PingServlet2Jsp_Coverage_Test_Failing {
    private PingServlet2Jsp pingServlet2Jsp;
    private PingBean ab;
    private HttpServletRequest req;
    private HttpServletResponse res;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost1_CKBN0() throws ServletException, IOException {
        PingServlet2Jsp servlet = new PingServlet2Jsp();
        HttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
        HttpServletResponse mockHttpServletResponse = new MockHttpServletResponse();
        servlet.doPost(mockHttpServletRequest, mockHttpServletResponse);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_qEdJ2() throws ServletException, IOException {
        pingServlet2Jsp.doGet(req, res);
        verify(req, times(1)).setAttribute("ab", ab);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet2_Behn3() throws ServletException, IOException {
        pingServlet2Jsp.doGet(req, res);
        verify(ab, times(1)).setMsg("Hit Count: 1");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet3_QGWk4() throws ServletException, IOException {
        pingServlet2Jsp.doGet(req, res);
        verify(res, times(1)).sendError(500, "PingServlet2Jsp.doGet(...): request error" + null);
    }
}